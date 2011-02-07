package com.emftriple.transform.impl;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Resource;

public class GetUtil {

	static String getValue(Node node) {
		if (node instanceof Literal) {
			return ((Literal) node).getLexicalForm();
		}
		return null;
	}
	
	static URI getURI(String key) {
		return URI.createURI(key);
	}
	
	static URI getURI(Resource from) {
		checkNotNull(from);
		checkNotNull(from.getURI());

		return URI.createURI(from.getURI());
	}
	
	static URI getURI(Node node) {
		checkArgument(node instanceof Resource);
			
		return getURI(((Resource)node));
	}
	
}
