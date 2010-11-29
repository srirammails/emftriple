package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ETripleResourceSet extends ResourceSetImpl implements ResourceSet {

	@Override
	public Resource createResource(URI uri) {
		return new ETripleResource(uri);
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		if (uri.hasQuery()) {
			Resource resource = null;
			try {
				resource = getResources().get(0);
				if (!resource.isLoaded()) {
					resource.load(getLoadOptions());
				}			
				return resource.getEObject(uri.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return super.getEObject(uri, loadOnDemand);
	}

}
