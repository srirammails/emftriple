/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.transform;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class RDF2Model extends AbstractTransformation {

	private final RDF2ModelGen generator;

	private EPackage ePackage;

	public RDF2Model(EPackage ePackage) {
		super();
		this.ePackage = ePackage;
		this.generator = new RDF2ModelGen(ePackage);
	}

	public RDF2Model(Resource resource) {
		super();
		this.ePackage = (EPackage) resource.getContents().get(0);
		this.generator = new RDF2ModelGen(ePackage);
	}

	public Resource transform(Resource resource) {
		final EMFModel model = Transformations.transform(
				inject(resource, get(RDFPackage.eNS_URI)), 
					new Transformations.Builder()
					.asm(generator.getASM())
					.options(atloptions())
					.in(get(RDFPackage.eNS_URI), "IN", "RDF")
					.out(get(ePackage.getNsURI()), "OUT", "Model")
					.buildOneInOneOut());
		
		return model != null ? model.getResource() : null;
	}

}
