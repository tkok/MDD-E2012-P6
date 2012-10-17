package dk.itu.ecdar.text.generator.framework;

public abstract class IEdge {
	
	ILocation to;

	/**
	 * @return True if the guard holds, false otherwise
	 */
	public abstract boolean checkGuard();
	
	/**
	 * Traverses over this edge
	 */
	public abstract void traverse();
	
}
