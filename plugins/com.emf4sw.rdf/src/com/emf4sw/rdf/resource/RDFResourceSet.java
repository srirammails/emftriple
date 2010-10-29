/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFResourceSet extends ResourceSetImpl implements ResourceSet {
	
	public static final String CONTENT_TYPE_RDF_XML = "rdf+xml";
	
	public static final String CONTENT_TYPE_TURTLE = "turtle";
	
	public static final String CONTENT_TYPE_N3 = "n3";
	
	public static final String CONTENT_TYPE_NTRIPLES = "nt";
	
	public RDFResourceSet() {
		super();
	}
	
	@Override
	public Resource createResource(URI uri) {
		return super.createResource(uri);
	}
}
