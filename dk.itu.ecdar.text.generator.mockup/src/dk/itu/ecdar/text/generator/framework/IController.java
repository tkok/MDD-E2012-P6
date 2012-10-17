package dk.itu.ecdar.text.generator.framework;

public abstract class IController {
	
	public interface IAction {
		/**
		 * This is empty on purpose. The Action enum on any
		 * implementation of IController will implement this.
		 * 
		 * public Class MyController {
		 * 		enum Action implements IAction{
		 *			Foo,
		 *			Bar
		 *		}
		 * }
		 */
	}
	
	ITIOA[] automata;
	
	/**
	 * Notifies the controller about some input
	 * @param input Some input
	 */
	public abstract void notify(IAction input);
	
	/**
	 * Runs the controller
	 */
	public abstract void run();
}
