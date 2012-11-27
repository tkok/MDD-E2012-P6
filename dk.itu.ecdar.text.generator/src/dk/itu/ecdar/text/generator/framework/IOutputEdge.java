package dk.itu.ecdar.text.generator.framework;

import dk.itu.ecdar.text.generator.environment.QuickLog;

/**
 * Base class for uncontrollable edge implementations.
 * 
 * Uncontrollable edges are defined as producing input
 * for the environment.
 */
public abstract class IOutputEdge extends IEdge {

	public IOutputEdge(ILocation from, ILocation to, String signal) {
		super(from, to, signal);
	}

	@Override
	public boolean acceptInput(String input) {
		return false;
	}

	@Override
	public ILocation traverse() {
		QuickLog.log(from.parent.toString(), from.parent.getTime(), "Signaling " + signal);
		IController.getInstance().notify(signal);
		return super.traverse();
	}
}
