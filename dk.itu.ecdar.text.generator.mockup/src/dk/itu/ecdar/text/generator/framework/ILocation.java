package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for location implementations.
 * 
 * The location can execute a task which will be launched in a separate thread.
 * While running the task, the invariant will constantly be checked. If it is
 * violated (i.e. the task took to long to complete) it will notify the
 * controller singleton about the violation.
 */
public abstract class ILocation {

	/**
	 * Base class for thread implementations handling tasks on locations.
	 */
	public abstract class TaskThread extends Thread {
		ILocation parent;

		public TaskThread(ILocation parent) {
			this.parent = parent;
		}
	}

	/**
	 * A thread executing the task of a location.
	 */
	public class TaskExecutor extends TaskThread {
		public TaskExecutor(ILocation parent) {
			super(parent);
		}

		public void run() {
			parent.task();
		}
	}

	/**
	 * A thread monitoring the task of a location.
	 */
	public class TaskMonitor extends TaskThread {
		public TaskMonitor(ILocation parent) {
			super(parent);
		}

		public void run() {
			parent.internalExecute();
		}
	}

	// reference the parent automaton to check invariant against it's clock
	protected ITIOA parent;

	protected IEdgeUncontrollable[] outputEdges;
	protected IEdgeControllable[] inputEdges;
	String name;

	TaskExecutor executor;
	TaskMonitor monitor;

	public ILocation(String name, ITIOA parent) {
		this.name = name;
		this.parent = parent;
	}

	/**
	 * Executes the location's task
	 */
	public void execute() {
		executor = new TaskExecutor(this);
		monitor = new TaskMonitor(this);
		monitor.run();
	}

	private void internalExecute() {

		parent.executing = true;
		executor.run();

		while (executor.isAlive()) {
			if (!checkInvariant()) {
				try {
					executor.join();
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}

				// TODO: handle a bit more gracefully.
				System.err.println("ERROR: Invariant violation in location \""
						+ name + "\"!");
				System.exit(-1);
			}
		}

		// if we got to this place, everything went well
		// and the location executed successfully
		parent.executing = false;
		parent.executed = true;
	}

	/**
	 * Kill the currently executing task
	 */
	public void kill() {
		
		// sanity check fails if the task is not
		// currently executing or if it is preemptive.
		if (!parent.executing || !isPreemptive())
			return;
		
		try {
			executor.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}

		// remove the thread instances
		executor = null;
		monitor = null;
	}

	/**
	 * @return True if the invariant holds, false otherwise
	 */
	public abstract boolean checkInvariant();

	/**
	 * @return True if the location's task is preemptive, false otherwise
	 */
	public abstract boolean isPreemptive();
	
	/**
	 * The task this location will execute. Here, the code assigned to this
	 * location should be placed.
	 */
	public abstract void task();
}
