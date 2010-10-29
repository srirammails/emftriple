/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.rdf.resource.injector;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFXMLResource;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link RDFInjector}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFInjector {

	private final Model model;
	
	public RDFInjector(Model model) {
		this.model = model;
	}
	
	public RDFResource inject() {
		final RDFResource resource = new RDFXMLResource();
		final RDFGraph aGraph = new DocumentGraphInjector(model).inject();
		resource.getContents().add(aGraph);
		
		return resource;
	}
	
	public RDFResource inject(final RDFResource resource) {
		resource.getContents().add( new DocumentGraphInjector(model).inject() );
		return resource; 
	}

}
