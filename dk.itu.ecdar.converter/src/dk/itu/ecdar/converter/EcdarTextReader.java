package dk.itu.ecdar.converter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import dk.itu.ecdar.text.EcdarTextStandaloneSetup;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

public class EcdarTextReader extends WorkflowComponentWithSlot {
	private String uri;

	public void invoke(IWorkflowContext ctx) {
		Injector injector = new EcdarTextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		EPackage.Registry.INSTANCE.put(EcdarTextPackage.eNS_URI, EcdarTextPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(URI.createURI(getUri()), true);

		ctx.put(getSlot(), resource.getContents().get(0));
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

}


