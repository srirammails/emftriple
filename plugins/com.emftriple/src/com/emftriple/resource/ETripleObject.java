package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;


public interface ETripleObject extends InternalEObject {

	URI eGetURI();
	
	void eSetURI(URI uri);
	
}
