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
		System.out.println("here");
		if (uri.hasQuery()) {
			System.out.println("ici");
			Resource resource = null;
			try {
				resource = getResources().get(0);
				if (!resource.isLoaded()) {
					resource.load(getLoadOptions());
				}
//				getResource(URI.createURI(uri.scheme() + "://" + uri.authority()), loadOnDemand);
			
				System.out.println("resource " + resource);
			
				return resource.getEObject(uri.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return super.getEObject(uri, loadOnDemand);
	}

	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

}
