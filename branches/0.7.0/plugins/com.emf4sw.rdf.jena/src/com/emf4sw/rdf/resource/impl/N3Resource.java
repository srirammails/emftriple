package com.emf4sw.rdf.resource.impl;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.jena.JenaRDFReader;
import com.emf4sw.rdf.jena.JenaRDFWriter;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.5
 */
public class N3Resource extends RDFResourceImpl implements RDFResource {
	
	public N3Resource() {
		super();
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}
	
	public N3Resource(URI uri) {
		super(uri);
		reader = new JenaRDFReader();
		writer = new JenaRDFWriter();
	}
}
