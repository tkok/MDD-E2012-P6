package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for controllable edge implementations.
 * 
 *  A controllable edge is defined as an edge being controlled
 *  by input.
 */
public abstract class IEdgeControllable extends IEdge {

	public IEdgeControllable(ILocation to, String signal, ITIOA parent) {
		super(to, signal, parent);
	}

	@Override
	public boolean acceptInput(String input) {
		return input.equals(signal);
	}

}
