package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for edge implementations. 
 */
public abstract class IEdge {
	
	// reference parent automaton to check guard against
	// and to assign to its clock as well as to 
	protected ITIOA parent;
	
	// pointing to the l
	protected ILocation to;
	
	// the input this edge is bound to
	protected String signal;

	public IEdge(ILocation to, String signal, ITIOA parent) {
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
