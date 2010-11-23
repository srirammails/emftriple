package com.emf4sw.owl.jena.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * {@link XMLJenaOWLResourceFactory}
 * 
 * <p>
 * A factory for creating owl documents in rdf/xml format.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class XMLJenaOWLResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new XMLJenaOWLResource(uri);
	}

}