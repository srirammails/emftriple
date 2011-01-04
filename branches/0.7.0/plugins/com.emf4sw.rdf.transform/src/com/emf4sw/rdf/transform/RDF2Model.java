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
import static com.atl.common.models.Models.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;

import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.transform.lib.ETripleLibExtension;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class RDF2Model {

	private final RDF2ModelGen generator;

	private EPackage ePackage;

	public RDF2Model(EPackage ePackage) {
		this.ePackage = ePackage;
		this.generator = new RDF2ModelGen(ePackage);
	}

	static {
		register(RDFPackage.eINSTANCE);
	}

	private List<LibExtension> getListExtension() {
		final List<LibExtension> list = new ArrayList<LibExtension>();
		list.add(new ETripleLibExtension());
		
		return list;
	}
	
	public Resource transform(Resource resource) {
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("extensionObjects", getListExtension());
		
		final EMFModel model = Transformations.transform(
				inject(resource, get(RDFPackage.eNS_URI)), 
					new Transformations.Builder()
					.asm(generator.getASM())
					.options(options)
					.in(get(RDFPackage.eNS_URI), "IN", "RDF")
					.out(get(ePackage.getNsURI()), "OUT", "MODEL")
					.buildOneInOneOut());
		
		return model != null ? model.getResource() : null;
	}

}
