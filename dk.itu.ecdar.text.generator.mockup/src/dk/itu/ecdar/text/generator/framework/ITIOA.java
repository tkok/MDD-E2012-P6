package dk.itu.ecdar.text.generator.framework;

import java.util.Vector;

/**
 * Base class for timed I/O automata implementations.
 * 
 * The automaton holds a clock and manages transitions between locations.
 */
public abstract class ITIOA {
	
	AutomatonTimer timer;
	private ILocation current;
	private ILocation[] locations;
	
	private Vector<String> inputs;
	
	boolean executing, executed;

	public ITIOA() {
		timer = new AutomatonTimer();
	}
	
	/**
	 * Notifies the TIOA about input
	 * @param input Some action
	 */
	public abstract boolean notify(String input);
	
	/**
	 * Executes the task at the current location
	 * if it hasn't been executed before. 
	 */
	public void execute() {
		if (!executing && !executed) {
			executing = true;
			current.execute();
		}
	}

	/**
	 * Performs a transition on the automaton
	 * 
	 * The transition should ideally be highly optimized
	 * and take very few time. 
	 */
	public void transition() {
		timer.pause();
		internalTransition();
		timer.resume();
	}
	
	protected void internalTransition() {
		
		// a transition is only possible if the task
		// at the current location has been performed
		if (!executing && executed)
			return;
		
		Vector<String> currentInputs = (Vector<String>) inputs.clone();
		inputs.clear();
		
		for(String input : currentInputs) {
			for(IEdgeControllable edge : current.inputEdges) {
				if (edge.acceptInput(input) && edge.checkGuard()) {
					current = edge.traverse();
					
					// in each run the automaton can traverse at most one edge
					// TODO: talk to andrzej about this!
					return;
				}
			}
		}
		
		// no edge has been traversed
		// an output edge now is allowed to traverse
		for(IEdge edge: current.outputEdges){
			if(edge.checkGuard()) {
				current = edge.traverse();
				
				// in each run the automaton can traverse at most one edge
				// TODO: talk to andrzej about this!
				return;
			}
		}
	}
}
