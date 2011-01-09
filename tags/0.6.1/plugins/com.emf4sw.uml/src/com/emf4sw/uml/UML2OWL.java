/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.uml;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import com.atl.common.models.Properties;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLFormats;

/**
 *
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class UML2OWL {

	public final static String UML2OWL_CLOSE_WORLD_OPTION = "UML2OWL_CLOSE_WORLD_OPTION";
	
	public final static String UML2OWL_NO_DOMAIN_NO_RANGE = "UML2OWL_NO_DOMAIN_NO_RANGE";
	
	public final static String UML2OWL_NO_CARDINALITIES = "UML2OWL_NO_CARDINALITIES";
	
	public final static String UML2OWL_PROPERTY_NAME_ONLY = "UML2OWL_PROPERTY_NAME_ONLY";
	
	public final static String UML2OWL_PROPERTY_NAME_DELIMITER = "UML2OWL_PROPERTY_NAME_DELIMITER";
	
	public final static String UML2OWL_DISJOINT_CLASSES = "UML2OWL_DISJOINT_CLASSES";
	
	public final static String UML2OWL_MODEL_NAMESPACE = "UML2OWL_MODEL_NAMESPACE";
	
	protected final URL asmURL = UML2OWL.class.getResource("resources/UML2OWL.asm");

	protected final URL libURL = UML2OWL.class.getResource("resources/UML2OWLHelpers.asm");

	private static Boolean registered = Boolean.FALSE;
	
	protected final EMFModelFactory modelFactory = new EMFModelFactory();
	
	protected final EMFInjector injector = new EMFInjector();
	
	protected final EMFVMLauncher launcher = new EMFVMLauncher();
	
	public UML2OWL() {
		if (!Platform.isRunning()) {
			standaloneSetUp();
		}
	}
	
	public static void standaloneSetUp() {
		if (!registered) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/3.0.0/UML", UMLPackage.eINSTANCE);
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.0.0/UML", UMLPackage.eINSTANCE);
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.1.0/UML", UMLPackage.eINSTANCE);
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.2.0/UML", UMLPackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
			registered = Boolean.TRUE;
		}
	}

	public Resource execute(Resource umlModel) {
		return doExecute(umlModel, Properties.createProperties());
	}
	
	public Resource execute(Resource umlModel, OWLFormats format) {
		final Resource resource = doExecute(umlModel, Properties.createProperties());
		if (resource != null && format != null) {
			return owlFormat(resource, format);
		}
		return resource;
	}
	
	public Resource execute(Resource umlModel, OWLFormats format, Map<String, Object> options) {
		final Resource resource = doExecute(umlModel, Properties.createProperties(options));
		if (resource != null && format != null) {
			return owlFormat(resource, format);
		}
		return resource;
	}
	
	protected Resource owlFormat(Resource resource, OWLFormats format) {
		final Resource owl = format.factory().createResource(
				URI.createURI(resource.getURI().trimFileExtension() + format.extension()));
		owl.getContents().addAll(resource.getContents());
		
		return owl;
	}

	protected Resource doExecute(Resource umlModel, Properties<?, ?> options) {
		if (!Platform.isRunning()) {
			setUpLibraries(umlModel);
		}

		final EMFReferenceModel properties = (EMFReferenceModel) modelFactory.newReferenceModel();
		injector.inject(properties, Properties.getReferenceModel().getResource());
		final EMFReferenceModel uml = (EMFReferenceModel) modelFactory.newReferenceModel();
		injector.inject(uml, UMLPackage.eINSTANCE.eResource());
		final EMFReferenceModel owl = (EMFReferenceModel) modelFactory.newReferenceModel();
		injector.inject(owl, OWLPackage.eINSTANCE.eResource());

		final EMFModel pModel = (EMFModel) modelFactory.newModel(properties); 
		injector.inject(pModel, options.serialize());

		final EMFModel inModel = (EMFModel) modelFactory.newModel(uml);
		injector.inject(inModel, umlModel);

		final EMFModel owlModel = (EMFModel) modelFactory.newModel(owl);

		final Map<String, Object> atlOptions = new HashMap<String, Object>();
		atlOptions.put("supportUML2Stereotypes", Boolean.TRUE);

		try {
			launcher.initialize(Collections.<String, Object> emptyMap());

			Object lib = launcher.loadModule(libURL.openStream());

			launcher.addInModel(inModel, "IN", "UML");
			launcher.addInModel(pModel, "IN2", "Properties");
			launcher.addOutModel(owlModel, "OUT", "OWL");

			launcher.addLibrary("UML2OWLHelpers", lib);

			launcher.launch(
					ILauncher.RUN_MODE, 
					new NullProgressMonitor(), 
					atlOptions,
					asms() );
		} catch (IOException e) {
			e.printStackTrace();
		}

		return owlModel.getResource();
	}

	protected Object[] asms() throws IOException {
		return new Object[] {launcher.loadModule(asmURL.openStream())};
	}
	
	protected void setUpLibraries(Resource resource) {
		final URL url = UML2OWL.class.getResource("resources/libraries/UMLPrimitiveTypes.library.uml");
		final String libURL = url.getFile().replaceAll("UMLPrimitiveTypes.library.uml", "");
		final URI uri = URI.createURI(libURL);
		resource.getResourceSet().getURIConverter().getURIMap().put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri);
	}

}
