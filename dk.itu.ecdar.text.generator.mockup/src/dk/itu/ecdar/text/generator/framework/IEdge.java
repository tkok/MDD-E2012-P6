package dk.itu.ecdar.text.generator.framework;

import dk.itu.ecdar.text.generator.environment.QuickLog;

/**
 * Base class for edge implementations. 
 */
public abstract class IEdge {
	
	// pointing to the location coming from (for guard checking)
	// and to the new location
	protected ILocation from, to;
	
	// the input this edge is bound to
	protected String signal;

	public IEdge(ILocation from, ILocation to, String signal) {
		this.from = from;
		this.to = to;
		this.signal = signal;
	}
	
	/**
	 * @return True if the guard holds, false otherwise
	 */
	public abstract boolean checkGuard(long time);
	
	/**
	 * @param input Some input
	 * @return True if this edge accepts the input, false otherwise
	 */
	public abstract boolean acceptInput(String input);
	
	/**
	 * Gets called from traverse() and needs to be implemented
	 * by subclasses.
	 */
	public abstract void onTraverse();
	
	/**
	 * Traverses over this edge
	 * @return The ILocation this edge points to
	 */
	public ILocation traverse() {
		QuickLog.log("Traversing from " + from.name + " to " + to.name, 10);
		onTraverse();
		return to;
	}
	
}
