package dk.itu.ecdar.converter;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import dk.itu.ecdar.text.EcdarTextStandaloneSetup;
import dk.itu.ecdar.text.ecdarText.ETFile;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

public class EcdarTextWriter extends WorkflowComponentWithSlot {
	private String uri;

	public void invoke(IWorkflowContext ctx) {
		ETFile file = (ETFile)ctx.get(getSlot());

		Injector injector = new EcdarTextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		EPackage.Registry.INSTANCE.put(EcdarTextPackage.eNS_URI, EcdarTextPackage.eINSTANCE);

		URI uri = URI.createFileURI(getUri());
		uri = resourceSet.getURIConverter().normalize(uri);

		Resource resource = resourceSet.createResource(uri);
		resource.setURI(uri);
		resource.getContents().add(file);
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

}


