/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query.transform;

import org.eclipse.emf.common.util.URI;

import com.emftriple.query.sparql.DatasetClause;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.IRI;
import com.emftriple.query.sparql.SparqlFactory;
import com.google.common.base.Function;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class Describe implements Function<URI, DescribeQuery> {

	private URI graphURI;

	public Describe(URI graphURI) {
		this.graphURI = graphURI;
	}

	public Describe() {
	}

	@Override
	public DescribeQuery apply(URI from) {
		final DescribeQuery describe = SparqlFactory.eINSTANCE.createDescribeQuery();
		if (graphURI != null) {
			DatasetClause dataSet = SparqlFactory.eINSTANCE.createNamedDataSet();
			IRI iri = SparqlFactory.eINSTANCE.createIRI();
			iri.setValue(graphURI.toString());
			dataSet.setDataSet(iri);
			describe.getDatasetClause().add(dataSet);
		}
		final IRI var = SparqlFactory.eINSTANCE.createIRI();
		var.setValue(from.toString());
		describe.getVariables().add(var);
		
		return describe;
	}

}
