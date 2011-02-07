/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.vocabulary;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.emf4sw.rdf.vocabulary.XSD;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public final class BuiltIn {

	public static boolean is(String namespace) {
		return namespace.equals( OWL.NS ) ||
			namespace.equals( RDF.NS ) ||
			namespace.equals( RDFS.NS ) ||
			namespace.equals( XSD.NS );
	}
	
}
