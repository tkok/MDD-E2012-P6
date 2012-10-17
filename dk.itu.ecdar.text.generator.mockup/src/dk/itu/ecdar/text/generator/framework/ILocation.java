package dk.itu.ecdar.text.generator.framework;

public abstract class ILocation {
	
	IEdge[] edges;

	/**
	 * @return True if the invariant holds, false otherwise
	 */
	public abstract boolean checkInvariant();
	
	/**
	 * Notifies the location about input
	 * @param input Some action
	 */
	public abstract void doNotify(IController.IAction input);
	
	/**
	 * Executes whatever procedure this location should execute
	 */
	public abstract void execute();
}
