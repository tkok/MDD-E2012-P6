package dk.itu.ecdar.converter;


import java.io.IOException;
/*
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import dk.itu.ecdar.newEcdar.EcdarDSLRuntimeModule;
import dk.itu.ecdar.newEcdar.EcdarDSLStandaloneSetup;
import dk.itu.ecdar.newEcdar.ecdarDSL.EcdarDSLPackage;
import dk.itu.ecdar.newEcdar.ecdarDSL.impl.EcdarDSLFactoryImpl;
*/
public class Import {

	public static void main(String[] args) throws IOException {
/*
		Resource.Factory.Registry.INSTANCE
			.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		EPackage.Registry.INSTANCE.put(null,
				dk.itu.ecdar.bigEcdar.Flat11.Flat11Package.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		Resource resource = resourceSet.createResource(URI.createURI("samples/university.xml"));
		resource.load(options);
		System.out.println(resource.getContents().get(0).eContents().get(0).eContents());
*/

/*
		Injector injector = new EcdarDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet2 = injector.getInstance(XtextResourceSet.class);
		resourceSet2.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		EPackage.Registry.INSTANCE.put(EcdarDSLPackage.eNS_URI, EcdarDSLPackage.eINSTANCE);

		Resource resource2 = resourceSet2.getResource(URI.createURI("samples/university.ecdar"), true);
		System.out.println(resource2.getContents());

		resource2.setURI(URI.createURI("samples/university2.ecdar"));
		resource2.save(null);
*/
	}
}
