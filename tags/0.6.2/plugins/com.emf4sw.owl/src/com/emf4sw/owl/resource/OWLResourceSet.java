package com.emf4sw.owl.resource;

import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.emf4sw.owl.OWLPackage;

/**
 * {@link OWLResourceSet}
 * 
 * <p>
 * A collection of related persistent ontology documents.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OWLResourceSet extends ResourceSetImpl implements ResourceSet {

	private boolean setUp = false;
	
	public OWLResourceSet() {
		super();
		setURIResourceMap(new HashMap<URI,Resource>());
	}

	@Override
	public Resource createResource(URI uri) {
		setUpFactories();
		return super.createResource(uri);
	}

	private void setUpFactories() {
		if (setUp) {
			return;
		}
		if (!Platform.isRunning()) {
			getResources().add(OWLPackage.eINSTANCE.eResource());
		}
		setUp = true;
	}
}
