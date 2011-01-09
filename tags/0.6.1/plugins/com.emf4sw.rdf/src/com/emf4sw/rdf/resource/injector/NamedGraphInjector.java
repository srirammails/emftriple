/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.resource.injector;

import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.resource.RDFTurtleResource;
import com.emf4sw.rdf.resource.RDFXMLResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 * {@link NamedGraphInjector}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class NamedGraphInjector {

	private final Model aModel;
	
	private final TripleInjector aTripleInjector;

	private final String format;
	
	public NamedGraphInjector(Model aModel, String format) {
		this.format = format;
		this.aModel = aModel;
		this.aTripleInjector = new TripleInjector();
	}
	
	public NamedGraph inject() {
		final Resource aResource = getResource();
		final NamedGraph aGraph = RDFFactory.eINSTANCE.createNamedGraph();
		aResource.getContents().add(aGraph);
		
		for (ExtendedIterator<Statement> it = aModel.listStatements(); it.hasNext(); ) {
			aTripleInjector.inject(it.next(), aGraph);
		}
		
		return aGraph;
	}
	
	private Resource getResource() {
		if (format != null && (format.equals("TURTLE") || format.equals("N-TRIPLES") || format.equals("N3"))) {
			return new RDFTurtleResource();
		}
		else {
			return new RDFXMLResource();
		}
	}
}
