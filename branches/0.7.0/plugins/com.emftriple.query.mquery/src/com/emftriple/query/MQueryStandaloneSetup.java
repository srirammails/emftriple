
package com.emftriple.query;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MQueryStandaloneSetup extends MQueryStandaloneSetupGenerated{

	public static void doSetup() {
		new MQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

