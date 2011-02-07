package com.emftriple.resource;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class ETripleResourceSet extends ResourceSetImpl implements ResourceSet {

	public ETripleResourceSet() {
		setURIResourceMap(new HashMap<URI,Resource>());
	}

	@Override
	public Resource createResource(URI uri) {
		return new ETripleResource(uri);
	}

	@Override
	public URIConverter getURIConverter() {
		if (uriConverter == null) {
			uriConverter = new ExtensibleURIConverterImpl() {
				@Override
				public URI normalize(URI uri) {
					if (uri.scheme().equals("emftriple")) {
						if (uri.query() != null && !uri.query().isEmpty()) {
							return uri.trimQuery();
						}
						return uri;
					}
					return super.normalize(uri);
				}
			};
		}
		return uriConverter;
	}
}
