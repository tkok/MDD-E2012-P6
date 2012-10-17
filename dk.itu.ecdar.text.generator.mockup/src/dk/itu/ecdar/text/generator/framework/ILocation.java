package dk.itu.ecdar.text.generator.framework;

public interface ILocation {

	/**
	 * @return True if the invariant holds, false otherwise
	 */
	public boolean checkInvariant();
	
	/**
	 * Notifies the location about input
	 * @param input Some action
	 */
	public void doNotify(int input);
}
