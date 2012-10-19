package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for uncontrollable edge implementations.
 * 
 * Uncontrollable edges are defined as producing input
 * for the environment.
 */
public abstract class IEdgeUncontrollable extends IEdge {

	@Override
	public boolean acceptInput(IInput.IInputEnum input) {
		return false;
	}

}
