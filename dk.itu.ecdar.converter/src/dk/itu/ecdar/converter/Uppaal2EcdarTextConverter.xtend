package dk.itu.ecdar.converter

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.uppaal.xml.flat11.DocumentRoot

class Uppaal2EcdarTextConverter extends WorkflowComponentWithSlot {

	override invoke(IWorkflowContext ctx) {
		val root = ctx.get("model") as DocumentRoot
		val converter = new Uppaal2EcdarText()
		val file = converter.convert(root)
		ctx.put(getSlot, file)
	}

}