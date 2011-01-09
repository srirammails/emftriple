package com.emf4sw.rdf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.resource.RDFResource.RDFResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class RDFTriplesResourceFactory implements RDFResourceFactory {

	@Override
	public Resource createResource(URI uri) {
		return new RDFTriplesResource(uri);
	}
}