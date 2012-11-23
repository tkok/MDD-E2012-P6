package dk.itu.ecdar.text.generator.framework;

/**
 * A custom timer class using currentTimeMillis as a basis. 
 */
public class AutomatonTimer {

	// resolution the timer has to the user
	static private int resolution;
	
	// time stamp for starting and pausing the timer
	private long t_start, t_pause;
	
	// indicates if the timer is running
	private boolean running;
	
	/**
	 * 
	 * @param resolution Sets the resolution
	 */
	public AutomatonTimer() {
		reset();
		running = true;
	}
	
	/**
	 * Reset the clock to 0
	 */
	public void reset() {
		t_start = System.currentTimeMillis();
		t_pause = t_start;
	}
	
	/**
	 * @return The current time with resolution
	 */
	public long getTime() {
		long time;
		if (running)
			time = System.currentTimeMillis() - t_start;
		else
			time = t_pause - t_start;
		return time / resolution;
	}
	
	public static void setResolution(int resolution) {
		AutomatonTimer.resolution = resolution;
	}
}
