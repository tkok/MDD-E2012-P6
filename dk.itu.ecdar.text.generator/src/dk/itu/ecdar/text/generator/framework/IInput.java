package dk.itu.ecdar.text.generator.framework;

/**
 * Base class for input implementations.
 * 
 * Implementations of this class will hold an enum defining all
 * possible input values.
 * 
 * Implementations of this must always be static!
 */
public abstract class IInput {
	
	public interface IInputEnum {
		/**
		 * This is empty on purpose. The enum on any
		 * implementation of IInput will implement this.
		 * 
		 * public static class MyInput extends IInput{
		 * 		public static enum Input implements IInputEnum{
		 *			Foo,
		 *			Bar
		 *		}
		 * }
		 */
	}
}
