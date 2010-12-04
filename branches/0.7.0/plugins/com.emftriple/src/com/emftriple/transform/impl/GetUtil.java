package com.emftriple.transform.impl;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Resource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public final class GetUtil {

	public static String getValue(Node node) {
		if (node instanceof Literal) {
			return ((Literal) node).getLexicalForm();
		}
		return null;
	}
	
	public static URI getURI(String key) {
		return URI.createURI(key);
	}
	
	public static URI getURI(Resource from) {
		checkNotNull(from);
		checkNotNull(from.getURI());

		return URI.createURI(from.getURI());
	}
	
	public static URI getURI(Node node) {
		checkArgument(node instanceof Resource);
			
		return getURI(((Resource)node));
	}
	
}
