package dk.itu.ecdar.text.generator.framework;

public abstract class ITIOA {
	
	int time;
	private ILocation current;
	private ILocation[] locations;
	
	/**
	 * Notifies the TIOA about input
	 * @param input Some action
	 */
	public abstract void doNotify(IAction input);
	
	/**
	 * Sets the internal clock of 
	 * @param x The value the clock will be set to
	 */
	public void setTime(int x) {
		this.time = x;
	}
	
	/**
	 * @return The current time
	 */
	public int getTime(){
		return this.time;
	}
	
	/**
	 * Spends a time unit.
	 */
	public void spendTime(){
		this.time++;
	}
	
	/**
	 * @return The current location the automaton is at
	 */
	public ILocation currentLocation(){
		return this.current;
	}
	
	/**
	 * Runs the automaton
	 */
	public abstract void run();
}
