package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for location implementations.
 * 
 * The location can execute a task which will be launched in a separate thread.
 */
public abstract class ILocation {

	/**
	 * A thread executing the task of a location.
	 */
	public class TaskThread extends Thread {
		ILocation parent;

		public TaskThread(ILocation parent) {
			this.parent = parent;
		}

		public void run() {
			
			parent.parent.executing = true;
			parent.task();
			
			// these need to be set "at the same time", therefore synchronized
			synchronized (parent.parent) {
				parent.parent.executing = false;
				parent.parent.executed = true;
			}
		}
	}
	
	// reference the parent automaton to forward execution states
	protected ITIOA parent;

	protected IEdgeUncontrollable[] outputEdges;
	protected IEdgeControllable[] inputEdges;
	String name;

	TaskThread executor;

	public ILocation(String name, ITIOA parent) {
		this.name = name;
		this.parent = parent;
	}

	/**
	 * Executes the location's task
	 */
	public void execute() {
		executor = new TaskThread(this);
		executor.run();		
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
		
		parent.executing = false;
		parent.executed = true;
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
