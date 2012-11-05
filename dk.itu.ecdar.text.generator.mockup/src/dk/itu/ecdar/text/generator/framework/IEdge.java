package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for edge implementations. 
 */
public abstract class IEdge {
	
	// reference parent automaton to check guard against
	// and to assign to its clock
	protected ITIOA parent;
	
	// pointing to the location coming from (for guard checking)
	// and to the new location
	protected ILocation from, to;
	
	// the input this edge is bound to
	protected String signal;

	public IEdge(ILocation from, ILocation to, String signal, ITIOA parent) {
		this.from = from;
		this.to = to;
		this.signal = signal;
		this.parent = parent;
	}
	
	/**
	 * @return True if the guard holds, false otherwise
	 */
	public abstract boolean checkGuard();
	
	/**
	 * @param input Some input
	 * @return True if this edge accepts the input, false otherwise
	 */
	public abstract boolean acceptInput(String input);
	
	/**
	 * Traverses over this edge
	 * @return The ILocation this edge points to
	 */
	public abstract ILocation traverse();
	
}
