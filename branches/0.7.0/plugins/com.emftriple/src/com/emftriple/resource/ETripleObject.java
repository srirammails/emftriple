package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface ETripleObject extends InternalEObject {

	URI eGetURI();
	
	void eSetURI(URI uri);
	
	/**
	 * Factory class for proxy objects. 
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
//		public static EObject createProxy(EClass eClass, URI key) {
//			
//
//			return proxyObject;
//		}
	}
	
	/**
	 * 
	 * @author ghilla01
	 *
	 */
	public static class URIBuilder {
		
		public static URI build(Resource resource, URI key) {
			final URI uriFragment = resource.getURI().appendQuery("query=" + key.toString());
			
			return uriFragment;
		}
	}
}
