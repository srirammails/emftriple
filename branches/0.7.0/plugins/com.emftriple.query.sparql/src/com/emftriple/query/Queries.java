package com.emftriple.query;

import static com.emftriple.query.SparqlBuilder.getConstructQuery;
import static com.emftriple.query.SparqlBuilder.getSelectQuery;

import org.eclipse.emf.common.util.URI;

import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.SelectQuery;

/**
 * Collection of predefined SPARQL queries
 * 
 * @author ghilla01
 *
 */
public class Queries {

	public static ConstructQuery graphQuery(URI graph) {
		return getConstructQuery("CONSTRUCT { ?s ?p ?o } WHERE { " +
				"GRAPH <" + graph.toString()+ "> { ?s ?p ?o} }");
	}
	
	public static SelectQuery typeOf(URI resource) {
		return getSelectQuery("SELECT ?type WHERE { <" + 
				resource.toString() + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type }");
	}
	
	public static SelectQuery typeOf(String resourceURI) {
		return getSelectQuery("SELECT ?type WHERE { <" + 
				resourceURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type }");
	}
}
