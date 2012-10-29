package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for timed I/O automata implementations.
 */
public abstract class ITIOA {

	public AutomatonTimer timer;
	protected ILocation current;
	boolean executing, executed;

	public ITIOA() {

		// TODO: Replace this with RTS Java clock instance
		timer = new AutomatonTimer();
	}

	/**
	 * Resets the ITIOA flags to false.
	 */
	private void reset() {
		executing = false;
		executed = false;
	}

	/**
	 * Notifies the TIOA about input.
	 * 
	 * Currently, the system will exit if input must be handled during
	 * non-preemptive task execution.
	 * 
	 * @param input Some action
	 */
	public void notify(String input) {
		IEdgeControllable that = null;

		// Check for an edge that accepts this input and for which
		// the guard holds.
		for (IEdgeControllable edge : current.inputEdges) {
			if (edge.acceptInput(input) && edge.checkGuard()) {
				that = edge;
			}
		}

		// If there is no edge that handles this input, ignore it.
		if (that == null)
			return;

		// If the current location is executing a task and
		// not preemptive, we can safely kill it. Otherwise,
		// we exit the program.
		if (executing) {
			if (current.isPreemptive()) {
				current.kill();
			} else {

				// TODO: Maybe instead just ignore the input?
				System.err
						.println("ERROR: Received input during execution of non-preemptive task!");
				System.exit(1);
			}
		}

		// Traverse and reset.
		current = that.traverse();
		reset();
	}

	/**
	 * Executes the task at the current location if it hasn't been executed
	 * before.
	 */
	public void execute() {
		if (!executing && !executed) {
			current.execute();
		}
	}

	/**
	 * Performs a transition on the automaton
	 * 
	 * The transition should ideally be highly optimized and take very few time.
	 * However, this implementation grounds on the synchrony hypothesis.
	 */
	public void transition() {

		// An uncontrollable transition is only possible if the task
		// at the current location has been performed.
		if (!executing && executed)
			return;

		for (IEdge edge : current.outputEdges) {
			if (edge.checkGuard()) {
				current = edge.traverse();

				// Reset only if sure that traversal has happened
				reset();
				return;
			}
		}
	}
}
