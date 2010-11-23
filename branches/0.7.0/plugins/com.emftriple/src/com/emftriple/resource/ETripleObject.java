package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * ETripleObject interface means to be used with the {@link ETripleStore} implementation.
 * 
 * @author ghilla01
 *
 */
public interface ETripleObject extends InternalEObject {

	URI eGetURI();
	
	void eSetURI(URI uri);
	
	/**
	 * Factory class used to create proxy objects. 
	 * 
	 * @author ghilla01
	 *
	 */
	public static class EObjectFactory {
		
		/**
		 * Creates and Add a proxy EObject to the given resource. The proxy 
		 * URI is made of the resource URI, and a query having for parameter 
		 * the object key.
		 *  
		 * @param resource
		 * @param eClass
		 * @param key
		 * @return proxy EObject
		 */
		public static EObject createProxy(Resource resource, EClass eClass, URI key) {
			final EFactory aFactory = eClass.getEPackage().getEFactoryInstance();
			final EObject proxyObject = aFactory.create(eClass);
			final URI uriFragment = resource.getURI().appendQuery("query=" + key.toString());
			((InternalEObject)proxyObject).eSetProxyURI(uriFragment);
			
			resource.getContents().add(proxyObject);
			
			return proxyObject;
		}
	}
}
