package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for edge implementations. 
 */
public abstract class IEdge {
	
	// reference parent automaton to check guard against
	// and to assign to its clock as well as to 
	ITIOA parent;
	
	// pointing to the l
	ILocation to;
	
	// the input this edge is bound to
	IInput.IInputEnum signal;

	/**
	 * @return True if the guard holds, false otherwise
	 */
	public boolean checkGuard() {
		return true;
	}
	
	/**
	 * @param input Some input
	 * @return True if this edge accepts the input, false otherwise
	 */
	public abstract boolean acceptInput(IInput.IInputEnum input);
	
	/**
	 * Traverses over this edge
	 * @return The ILocation this edge points to
	 */
	public abstract ILocation traverse();
	
}
