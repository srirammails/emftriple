package com.emftriple.query;

import static com.emftriple.query.SparqlBuilder.getConstructQuery;

import org.eclipse.emf.common.util.URI;

import com.emftriple.query.sparql.ConstructQuery;

public class Queries {

	public static ConstructQuery graphQuery(URI graph) {
		return getConstructQuery("CONSTRUCT { ?s ?p ?o } WHERE { GRAPH <" + graph.toString()+ "> { ?s ?p ?o} }");
	}
}
