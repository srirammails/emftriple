/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdfizer.atl;

import static com.atl.common.models.Models.atl;
import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.emptyModel;
import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.getModelFactory;
import static com.atl.common.models.Models.inject;
import static com.atl.common.trans.Transformations.transform;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;

import com.atl.common.models.resource.ATLResourceFactory;
import com.atl.common.trans.ATLModel2ASM;
import com.atl.common.trans.Transformation;
import com.atl.common.trans.Transformations;
import com.emf4sw.owl.atl.OWLTransformations;
import com.emf4sw.rdf.RDFPackage;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class RDF2ModelGen {

	private static final String RDF_GEN_HELPERS = "RDFGenHelpers";
	
	private static final String ECORE2OWL_HELPERS_ASM = "resources/Ecore2OWLHelpers.asm";

	private static final String ECORE2OWL_HELPERS = "Ecore2OWLHelpers";
	
	private static final String RDF_GEN_HELPERS_ASM = "resources/RDFGenHelpers.asm";
	
	private static final String IN = "IN";

	private static final String OUT = "OUT";

	private static final String ATL = "ATL";

	private static final String ecore = "ecore";

	private Resource resource;

	private final EPackage ePackage;
	
	private final EMFReferenceModel metamodel;
	
	private final EMFInjector injector = new EMFInjector();

	private ASM asm;
	
	
	public RDF2ModelGen(EPackage ePackage) {
		this.ePackage = ePackage;
		this.metamodel = (EMFReferenceModel) getModelFactory().newReferenceModel();
		injector.inject(metamodel, ePackage.eResource());
	}
		
	public Resource getResource() {
		if (resource == null) {
			final EMFModel model = transform(inject(ePackage.eResource(), ecore()), hot_rdf2model());
			
			if (model == null || model.getResource() == null) {
				throw new NullPointerException("Cannot create model transformation rdf2model.");
			}
			
			resource = model.getResource();
		}
		
		return resource;
	}
	
	public ASM getASM() {
		if (asm == null) {
			final EMFModel model = emptyModel(atl());
			injector.inject(model, getResource());
			
			asm = transform(model, new ATLModel2ASM());
		}
		return asm;
	}

	public EMFReferenceModel metamodel() {
		return metamodel;
	}
	
	public EMFReferenceModel rdf() {
		return get(RDFPackage.eNS_URI);
	}

	protected Transformation<EMFModel, EMFModel> hot_rdf2model() {
		return hot("resources/RDF2EcoreGen.asm"); 
	}
	
	protected Transformation<EMFModel, EMFModel> hot(String... asm) {
		return 
			new Transformations.Builder()
			.asm(getASMS(asm))
			.lib(ECORE2OWL_HELPERS, OWLTransformations.class.getResource(ECORE2OWL_HELPERS_ASM))
			.lib(RDF_GEN_HELPERS, this.getClass().getResource(RDF_GEN_HELPERS_ASM))
			.in(ecore(), IN, ecore)
			.out(atl(), OUT, ATL, new ATLResourceFactory())
			.buildOneInOneOut();
	}
		
	protected ASM loadASM(String location) {
		return new ASMXMLReader().read(getClass().getResourceAsStream(location));
	}
	
	private ASM[] getASMS(String... asm) {
		ASM[] asms = new ASM[asm.length];
		for (int i=0;i<asm.length;i++) {
			asms[i] = loadASM(asm[i]);
		}
		return asms;
	}
}
