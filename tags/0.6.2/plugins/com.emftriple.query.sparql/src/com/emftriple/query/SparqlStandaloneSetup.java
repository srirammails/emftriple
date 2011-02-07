
package com.emftriple.query;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SparqlStandaloneSetup extends SparqlStandaloneSetupGenerated{

	public static void doSetup() {
		new SparqlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

