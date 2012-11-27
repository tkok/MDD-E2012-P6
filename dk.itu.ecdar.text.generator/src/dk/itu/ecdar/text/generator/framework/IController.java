package dk.itu.ecdar.text.generator.framework;

import dk.itu.ecdar.text.generator.environment.QuickLog;

/**
 * Base class for controller implementations.
 * 
 * The controller handles input and notifies the automata
 * about it.
 */
public abstract class IController {
	
	AutomatonTimer timer;
	ITIOA[] automata;
	
	// TODO: find a nicer solution for singleton behavior. Maybe just remove abstract from IController?
	protected static IController controllerInstance;
	
	public static IController getInstance() {
		return controllerInstance;
	}
	
	public IController(ITIOA[] automata) {
		this.automata = automata;
		timer = new AutomatonTimer();
	}
	
	/**
	 * Notifies the controller about some input
	 * Synchronized because input needs to be handled immediately.
	 *
	 * @param input Some input
	 */
	public synchronized void notify(String input) {
		QuickLog.log(toString(), timer.getTime(), "Received input " + input);
		for (ITIOA a: automata)
			a.notify(input);
	}
	
	/**
	 * Executes the controller.
	 * 
	 * Synchrony hypothesis: every automaton is started at the same time.
	 */
	public void run() {
		timer.reset();
		for (ITIOA a: automata)
			a.run();
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
