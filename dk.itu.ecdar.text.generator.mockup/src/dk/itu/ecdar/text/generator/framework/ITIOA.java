package dk.itu.ecdar.text.generator.framework;

public interface ITIOA {
	
	/**
	 * Notifies the TIOA about input
	 * @param input Some action
	 */
	public void doNotify(int input);
	
	/**
	 * Sets the internal clock of 
	 * @param x The value the clock will be set to
	 */
	public void setTime(int x);
	
	/**
	 * @return The current time
	 */
	public int getTime();
	
	/**
	 * Spends a time unit.
	 */
	public void spendTime();
	
	/**
	 * @return The current location the automaton is at
	 */
	public ILocation currentLocation();
	
	/**
	 * Runs the automaton
	 */
	public void run();
}
