package dk.itu.ecdar.text.generator.framework;

public interface IEdge {

	/**
	 * @return True if the guard holds, false otherwise
	 */
	public boolean guard();
	
	/**
	 * Traverses over this edge
	 */
	public void traverse();
	
}
