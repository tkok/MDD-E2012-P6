// An example of a very simple MWE2 component implemented in Java
// Hint: you can use this component to debug your workflows (I find using assertions easier, though) 
package dk.itu.ecdar.text.generator.generators;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class SayHello implements IWorkflowComponent {

	private String message = "Hello World!";

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void invoke(IWorkflowContext ctx) {
		System.out.println(getMessage());
	}

	public void postInvoke() {
	}

	public void preInvoke() {
	}
}
