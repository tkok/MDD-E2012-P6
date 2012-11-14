package dk.itu.ecdar.converter;

import dk.itu.ecdar.converter.Uppaal2EcdarText;
import dk.itu.ecdar.converter.WorkflowComponentWithSlot;
import dk.itu.ecdar.text.ecdarText.ETFile;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.uppaal.xml.flat11.DocumentRoot;

@SuppressWarnings("all")
public class Uppaal2EcdarTextConverter extends WorkflowComponentWithSlot {
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get("model");
    final DocumentRoot root = ((DocumentRoot) _get);
    Uppaal2EcdarText _uppaal2EcdarText = new Uppaal2EcdarText();
    final Uppaal2EcdarText converter = _uppaal2EcdarText;
    final ETFile file = converter.convert(root);
    String _slot = this.getSlot();
    ctx.put(_slot, file);
  }
}
