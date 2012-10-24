package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for controller implementations.
 * 
 * The controller handles input and notifies the automata
 * about it.
 */
public abstract class IController {
	
	ITIOA[] automata;
	
	public IController(ITIOA[] automata) {
		this.automata = automata;
	}
	
	/**
	 * Notifies the controller about some input
	 * @param input Some input
	 */
	public void notify(String input) {
		for (ITIOA a: automata)
			a.notify(input);
	}
	
	/**
	 * Performs a transition on the automata
	 */
	private void transition() {
		for (ITIOA a: automata)
			a.transition();
	}
	
	/**
	 * Performs execution of tasks on the automata
	 */
	private void execute() {
		for (ITIOA a: automata)
			a.execute();
	}
	
	/**
	 * Executes the controller
	 */
	public void run() {
		while (true) {
			execute();
			transition();
		}
	}
}
