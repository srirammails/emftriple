package com.emf4sw.rdf.resource;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.resource.RDFResource.RDFResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFXMLResourceFactory implements RDFResourceFactory { 

	@Override
	public RDFResource createResource(URI uri) {
		return new RDFXMLResource(uri);
	}

}