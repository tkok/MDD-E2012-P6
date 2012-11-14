package dk.itu.ecdar.converter;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;

public abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	private String slot = "model";

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getSlot() {
		return slot;
	}

	public void postInvoke() {}
	public void preInvoke() {}
}