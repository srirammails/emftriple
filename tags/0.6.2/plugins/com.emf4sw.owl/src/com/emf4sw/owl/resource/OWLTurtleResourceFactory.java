package com.emf4sw.owl.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * {@link OWLTurtleResourceFactory}
 * 
 * <p>
 * A factory for creating owl documents in turtle format.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWLTurtleResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new OWLTurtleResource(uri);
	}

}