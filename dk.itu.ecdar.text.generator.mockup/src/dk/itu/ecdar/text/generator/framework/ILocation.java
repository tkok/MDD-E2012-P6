package dk.itu.ecdar.text.generator.framework;

import dk.itu.ecdar.text.generator.environment.QuickLog;

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
		
		public void run() {
			
			parent.executing = true;
			task();
			
			// these need to be set "at the same time", therefore synchronized
			synchronized (parent) {
				parent.executing = false;
				parent.executed = true;
			}
		}
	}
	
	// reference the parent automaton to forward execution states
	protected ITIOA parent;

	protected IEdgeUncontrollable[] outputEdges;
	protected IEdgeControllable[] inputEdges;
	public String name;

	TaskThread executor;

	public ILocation(String name, ITIOA parent) {
		this.name = name;
		this.parent = parent;
	}
	
	/**
	 * Executes the location's task
	 */
	public void execute() {
		QuickLog.log(parent.toString(), parent.getTime(), "Executing task.", 10);
		executor = new TaskThread();
		executor.start();		
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
	 * Set up edges after creation.
	 */
	public abstract void setupEdges();
	
	/**
	 * @return True if the invariant holds, false otherwise
	 */
	public abstract boolean checkInvariant(long time);

	/**
	 * @return True if the location's task is preemptive, false otherwise
	 */
	public abstract boolean isPreemptive();
	
	/**
	 * The task this location will execute. Here, the code assigned to this
	 * location should be placed.
	 */
	public abstract void task();
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
