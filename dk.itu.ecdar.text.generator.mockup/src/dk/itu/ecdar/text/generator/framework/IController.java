package dk.itu.ecdar.text.generator.framework;

public abstract class IController {
	
	ITIOA[] automata;
	
	/**
	 * Notifies the controller about some input
	 * @param input Some input
	 */
	public abstract void notify(IAction input);
	
	/**
	 * Runs the controller
	 */
	public abstract void run();
}
