package dk.itu.ecdar.text.generator.framework;


/**
 * Base class for timed I/O automata implementations.
 */
public abstract class ITIOA {

	/**
	 * This thread monitors transitions between uncontrollable
	 * edges. It will go sleeping each time no edge is available
	 * until there is at least one edge available.
	 */
	class TransitionThread extends Thread {
		ITIOA parent;
		
		public TransitionThread (ITIOA parent) {
			super();
			this.parent = parent;
		}
		
		public void run () {
			while (true) {
				parent.transition();
			}
		}
	}
	
	public AutomatonTimer timer;
	protected ILocation current;
	boolean executing, executed;
	private boolean running;
	private TransitionThread transitionThread;

	public ITIOA() {

		// TODO: Replace this with RTS Java clock instance
		timer = new AutomatonTimer();
		
		running = false;
		transitionThread = new TransitionThread(this);
	}

	/**
	 * Starts the automaton. Will only have effect once.
	 */
	public void run() {
		if (!running) {
			timer.reset();
			transitionThread.run();
			running = true;
		}
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
			if (edge.acceptInput(input) && edge.checkGuard(timer.getTime())) {
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
				System.err.println("ERROR: Received input during execution of non-preemptive task!");
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
	private void execute() {
		if (!executing && !executed) {
			current.execute();
		}
	}

	/**
	 * This is used to employ lazy waiting during transitions.
	 * 
	 * @return The minimum waiting time as long until the first edge becomes available.
	 */
	private long getMinWaitingTime() {
		boolean check = false;
		long time = 0;
		
		while (!check) {
			time++;
			for (IEdge e : current.inputEdges) {
				check = e.checkGuard(time);
				if (check)
					break;
			}			
		}
		
		return time;
	}
	
	/**
	 * Performs a transition on the automaton
	 * 
	 * The transition should ideally be highly optimized and take very few time.
	 * However, this implementation grounds on the <b>synchrony hypothesis</b>.
	 * 
	 * Synchronized so the state stays the same during execution.
	 */
	private synchronized void transition() {
		
		// An uncontrollable transition is only possible if the task
		// at the current location has been performed.
		if (!executing && executed) {
			for (IEdge edge : current.outputEdges) {
				if (edge.checkGuard(timer.getTime())) {
					current = edge.traverse();
	
					// Reset only if sure that traversal has happened
					reset();
					execute();
					return;
				}
			}
		}
		
		// Put this thread to sleep while waiting for the first
		// edge to become available (lazy waiting)
		try {
			Thread.sleep(getMinWaitingTime());
		} catch (InterruptedException e) {
			
			// TODO: What to do here?
			e.printStackTrace();
		}
	}
}
