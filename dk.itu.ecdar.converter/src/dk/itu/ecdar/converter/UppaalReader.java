package dk.itu.ecdar.converter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.uppaal.xml.flat11.Flat11Package;

public class UppaalReader extends WorkflowComponentWithSlot {
	private String uri;

	public void invoke(IWorkflowContext ctx) {
		// TODO: move to constructor?
		Resource.Factory.Registry.INSTANCE
			.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(null, Flat11Package.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		Resource resource = resourceSet.createResource(URI.createURI(uri));
		try {
			resource.load(options);
		} catch (IOException e) {
			throw new WrappedException(e);
		}

		ctx.put(getSlot(), resource.getContents().get(0));
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

	@Override
	public void postInvoke() {}

	@Override
	public void preInvoke() {}
}