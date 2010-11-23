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

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public interface RDFResource extends Resource {
	
	DocumentGraph createGraph();
	
	DocumentGraph getGraph();
	
	NamedGraph getNamedGraph(URI uri);
	
	public interface RDFResourceFactory extends Resource.Factory {
		
	}
	
	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.6.5
	 */
	public interface RDFReader<T> {
		
		void read(T source, RDFResource resource);
		
	}
	
	/**
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.6.5
	 */
	public interface RDFWriter<T> {
		
		void write(RDFResource resource, T target);
		
	}
	
}
