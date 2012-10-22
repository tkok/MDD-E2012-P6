package dk.itu.ecdar.text.generator.framework;

import java.util.Vector;

/**
 * Base class for controller implementations.
 * 
 * The controller handles input and notifies the automata
 * about it.
 */
public abstract class IController {
	
	ITIOA[] automata;
	Vector<String> inputs;
	
	public IController(ITIOA[] automata) {
		this.automata = automata;
		inputs = new Vector<String>();
	}
	
	/**
	 * Notifies the controller about some input
	 * @param input Some input
	 */
	public void notify(String input) {
		inputs.add(input);
	}
	
	/**
	 * Performs a transition on the automata
	 */
	public void transition() {
		for (ITIOA a: automata) {
			a.transition();
		}
		
		for (ITIOA a: automata) {
			for (String input : inputs) {
				a.notify(input);
			}
		}
	}
	
	/**
	 * Executes the controller
	 */
	public void run() {
		while (true) {
			for (ITIOA a: automata) {
				a.execute();
			}
			
			transition();
		}
	}
}
