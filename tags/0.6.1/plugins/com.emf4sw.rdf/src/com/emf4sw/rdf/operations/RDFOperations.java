/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.rdf.operations;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFXMLResource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class RDFOperations {

	private RDFOperations() {}
	
	public static RDFGraph unionOf(RDFGraph... graphs) {
		final RDFGraph aUnion = RDFFactory.eINSTANCE.createDocumentGraph();
		
		for (RDFGraph aGraph: graphs) {
			aUnion.add(aGraph);
		}
		
		return aUnion;
	}

	public static RDFGraph unionOf(Collection<RDFGraph> graphs) {
		final RDFGraph aUnion = RDFFactory.eINSTANCE.createDocumentGraph();
		
		for (RDFGraph aGraph: graphs) {
			aUnion.add(aGraph);
		}
		
		return aUnion;
	}

	public static Resource unionOf(RDFXMLResource... resources) {
		final Collection<RDFGraph> graphs = new ArrayList<RDFGraph>();
		for (RDFXMLResource aResource: resources) {
			Collection<RDFGraph> aCol =
				EcoreUtil.getObjectsByType(aResource.getContents(), RDFPackage.eINSTANCE.getRDFGraph());
			graphs.addAll( aCol );
		}
		RDFXMLResource aResource = new RDFXMLResource();
		aResource.getContents().add(unionOf(graphs));
		
		return aResource;
	}

	public static RDFGraph differenceOf(RDFGraph... graphs) {
		throw new UnsupportedOperationException();
	}

	public static boolean equivalentTo(RDFGraph graph0, RDFGraph graph1) {
		throw new UnsupportedOperationException();
	}

	public static void flatten(RDFXMLResource aResource) {
		if (aResource != null && aResource.getContents() != null) {
			
		}
		
	}

}
