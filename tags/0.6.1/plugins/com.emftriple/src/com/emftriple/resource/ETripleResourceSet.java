package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ETripleResourceSet extends ResourceSetImpl implements ResourceSet {

	@Override
	public Resource createResource(URI uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URIConverter getURIConverter() {
		// TODO Auto-generated method stub
		return super.getURIConverter();
	}
	
	@Override
	public void setResourceFactoryRegistry(org.eclipse.emf.ecore.resource.Resource.Factory.Registry resourceFactoryRegistry) {

	}

}
