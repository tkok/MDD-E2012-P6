package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for location implementations.
 * 
 * The location can execute a task which will be launched
 * in a separate thread. While running the task, the invariant
 * will constantly be checked. If it is violated (i.e. the task
 * took to long to complete) it will notify the controller
 * singleton about the violation.
 */
public abstract class ILocation {
	
	/**
	 * Base class for thread implementations handling tasks
	 * on locations.
	 */
	public abstract class TaskThread extends Thread {
		ILocation parent;
		public TaskThread(ILocation parent) { this.parent = parent; }
	}
	
	/**
	 * A thread executing the task of a location.
	 */
	public class TaskExecutor extends TaskThread{
		public TaskExecutor(ILocation parent) { super(parent); }
		public void run() { parent.task(); }
	}
	
	/**
	 * A thread monitoring the task of a location.
	 */
	public class TaskMonitor extends TaskThread {
		public TaskMonitor(ILocation parent) { super(parent); }
		public void run() { parent.runTask(); }
	}
	
	// reference the parent automaton to check invariant against it's clock
	ITIOA parent;
	
	IEdgeUncontrollable[] outputEdges;
	IEdgeControllable[] inputEdges;
	String name;

	public ILocation(String name, ITIOA parent) {
		this.name = name;
		this.parent = parent;
	}
	
	/**
	 * @return True if the invariant holds, false otherwise
	 */
	public boolean checkInvariant() {
		return true;
	}
	
	/**
	 * Executes whatever procedure this location should execute
	 */
	public void execute() {
		TaskMonitor monitor = new TaskMonitor(this);
		monitor.run();
	}
	
	private void runTask() {
		TaskExecutor task = new TaskExecutor(this);
		
		parent.executing = true;
		task.run();
		
		while(task.isAlive()) {
			
			if (!checkInvariant()) {
				// kill the task and message error!
				try {
					task.join();
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
				
				System.err.println("ERROR: Invariant violation in location \""
						+ name
						+ "\"!");

				// TODO: handle a bit more gracefully.
				System.exit(-1);
			}
		}
		
		// if we got to this place, everything went well
		// and the location executed successfully
		parent.executing = false;
		parent.executed = true;
	}
	
	/**
	 * The task this location will execute.
	 * Here, the code assigned to this location should be placed.
	 */
	public abstract void task();
}
