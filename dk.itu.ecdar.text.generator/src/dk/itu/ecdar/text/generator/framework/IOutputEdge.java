package dk.itu.ecdar.text.generator.framework;

import dk.itu.ecdar.text.generator.environment.QuickLog;

/**
 * Base class for uncontrollable edge implementations.
 * 
 * Uncontrollable edges are defined as producing input
 * for the environment.
 */
public abstract class IOutputEdge extends IEdge {

	public IOutputEdge(ILocation to, String signal) {
		super(to, signal);
	}

	@Override
	public boolean acceptInput(String input) {
		return false;
	}

	@Override
	public ILocation traverse() {
		QuickLog.log(to.parent.toString(), to.parent.getTime(), "Signaling " + signal);
		IController.getInstance().notify(signal);
		return super.traverse();
	}
}
