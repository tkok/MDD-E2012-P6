
package org.uppaal.xml.description;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DescriptionStandaloneSetup extends DescriptionStandaloneSetupGenerated{

	public static void doSetup() {
		new DescriptionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

