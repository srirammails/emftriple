
package com.emftriple.query;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JpqlStandaloneSetup extends JpqlStandaloneSetupGenerated{

	public static void doSetup() {
		new JpqlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

