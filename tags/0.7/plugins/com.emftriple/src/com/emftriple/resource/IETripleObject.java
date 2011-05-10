package com.emftriple.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface IETripleObject extends InternalEObject {

	URI eGetURI();
	
	void eSetURI(URI uri);
	
	/**
	 * 
	 * @author ghilla01
	 *
	 */
	public static class URIBuilder {
		
		public static URI build(Resource resource, URI key) {
			final String fragment = "uri=" + key.toString().replaceAll("#", "%23");
			if (!fragment.startsWith("uri=http://")) {
				throw new IllegalArgumentException();
			}
			final URI uriFragment = resource.getURI().appendFragment(fragment);
			
			return uriFragment;
		}
	}
}
