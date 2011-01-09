package com.emf4sw.uml;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.uml2.uml.UMLPackage;

public class Ecore2UML {

	private final URL asmURL = Ecore2UML.class.getResource("resources/Ecore2UML.asm");

	public Ecore2UML() {
	}
	
	public Resource execute(Resource model) {
		return doExecute(model);
	}
	
	private Resource doExecute(Resource model) {
		final EMFModelFactory modelFactory = new EMFModelFactory();
		final EMFInjector injector = new EMFInjector();
		final EMFVMLauncher launcher = new EMFVMLauncher();

		final EMFReferenceModel uml = (EMFReferenceModel) modelFactory.newReferenceModel();
		injector.inject(uml, UMLPackage.eINSTANCE.eResource());
		
		final EMFModel inModel = (EMFModel) modelFactory.newModel(modelFactory.getMetametamodel());
		injector.inject(inModel, model);

		final EMFModel umlModel = (EMFModel) modelFactory.newModel(uml);

		final Map<String, Object> atlOptions = new HashMap<String, Object>();
		atlOptions.put("supportUML2Stereotypes", Boolean.TRUE);

		try {
			launcher.initialize(Collections.<String, Object> emptyMap());

			Object asm = launcher.loadModule(asmURL.openStream());

			launcher.addInModel(inModel, "IN", "Ecore");
			launcher.addOutModel(umlModel, "OUT", "UML");

			launcher.launch(
					ILauncher.RUN_MODE, 
					new NullProgressMonitor(), 
					atlOptions,
					new Object[]{asm} );
		} catch (IOException e) {
			e.printStackTrace();
		}

		return umlModel.getResource();
	}

}
