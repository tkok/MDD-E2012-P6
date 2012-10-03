
package dk.itu.ecdar.text;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EcdarTextStandaloneSetup extends EcdarTextStandaloneSetupGenerated{

	public static void doSetup() {
		new EcdarTextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

