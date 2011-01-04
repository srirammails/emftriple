package com.emftriple.util;

import static com.emftriple.util.EntityUtil.getRdfTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.ResultSet.Solution;
import com.google.common.collect.Lists;

/**
 * 
 * @author ehilgui
 * @since 0.7.0
 */
public class SparqlQueries {

	public static String ask(URI from, EClass eClass) {
		final StringBuffer buffer = new StringBuffer("ASK { " + from.toString());
		for (URI aURI: getRdfTypes(eClass)) {
			buffer.append( " <" + RDF.type + "> <" + aURI.toString() + "> ");
		}
		buffer.append(" }");

		return buffer.toString();
	}

	public static String describe(URI from, URI graph) {
		return "DESCRIBE <" + from.toString()+ ">";
	}

	public static List<String> selectAllTypes(DataSourceManager manager, URIElement from) {
		final List<String> types = Lists.newArrayList();
		if (from != null && from.getURI() != null) 
		{
			final String query = typeOf(from.getURI());
			final ResultSet resultSet = manager.executeSelectQuery(query);

			if (resultSet == null) {
				return null;
			}
			while (resultSet.hasNext()) {
				Solution solution = resultSet.next();
				Node node = solution.get("type");
				if (node instanceof URIElement)
				{
					types.add( ((URIElement) node).getURI() );
				}
			}
		}
		return types;
	}

	public static Integer countObjectsByType(DataSource source, EClass from) {
		String query = "SELECT ?n WHERE { ";
		List<URI> uris = getRdfTypes(from);

		query += "{ ?n <" + RDF.type + "> <" + uris.get(0) + "> } ";
		for (int i=1;i<uris.size();i++) {
			query += (i % 2 == 0) ? "" : "UNION " + "{ ?n <" + RDF.type + "> <" + uris.get(i) + "> } ";
		}
		query += "}";

		ResultSet rs = source.selectQuery(query);
		int i=0;
		for (;rs.hasNext();)
			i += rs.next() != null ? 1 : 0;

		return i;
	}

	public static String graphQuery(URI graph) {
		return "CONSTRUCT { ?s ?p ?o } WHERE { GRAPH <" + graph.toString()+ "> { ?s ?p ?o} }";
	}

	public static String typeOf(URI resource, URI uri) {
		return "ASK WHERE { <" + 
		resource.toString() + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <" + uri.toString() + "> }";
	}

	public static String typeOf(URI resource) {
		return "SELECT ?type WHERE { <" + 
		resource.toString() + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type }";
	}

	public static String typeOf(String resourceURI) {
		return "SELECT ?type WHERE { <" + 
		resourceURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type }";
	}

	public static String constructSubject(URI key, Object object) {
		return "CONSTRUCT { <" + key + "> ?p ?o } WHERE { <" + key + "> ?p ?o }";
	}

	public static String constructSubject(URI key, EClass eClass) {
		return constructSubject(key, eClass, eClass.getEAllStructuralFeatures()).get(0);
	}

	public static List<String> constructSubjectService(URI key, EClass eClass) {
		final List<String> queries = new ArrayList<String>();
		final List<EAttribute> attrs = eClass.getEAllAttributes();
		final List<EReference> refs = eClass.getEAllReferences();

		if (!attrs.isEmpty()) {
			// cuts the set of attributes to form small queries
			// that can be executed on services
			int MAX = 3;
			int POS = 0;

			while(POS < attrs.size()) {
				List<EStructuralFeature> feats = new ArrayList<EStructuralFeature>();  
				for (int i=POS; i < MAX; i++)
					feats.add(attrs.get(i));
				queries.addAll(constructSubject(key, eClass, feats));
				POS+=MAX;
				MAX+=MAX; if (MAX >= attrs.size()) MAX = attrs.size();
			}
		}
		if (!refs.isEmpty())
			queries.addAll(constructSubject(key, eClass, refs));

		return queries;
	}

	private static List<String> constructSubject(URI key, EClass eClass, List<? extends EStructuralFeature> feats) {
		final List<String> queries = new ArrayList<String>();
		final StringBuffer constructPattern = new StringBuffer("CONSTRUCT { ");
		final StringBuffer wherePattern = new StringBuffer("WHERE { <" + key + "> a ?o . ");
		constructPattern.append(" <" + key + "> a ?o . ");

		for (EStructuralFeature aFeature: feats) {
			if (EntityUtil.getId(eClass) != null && !EntityUtil.getId(eClass).equals(aFeature)) {
				URI rdfType = EntityUtil.getRdfType(aFeature);
				constructPattern.append(" <" + key + "> <" + rdfType + "> ?" + aFeature.getName() + " . ");
				wherePattern.append(" OPTIONAL { <" + key + "> <" + rdfType + "> ?" + aFeature.getName() + " } ");
			}
		}
		constructPattern.append(" } ");
		wherePattern.append(" } ");
		constructPattern.append(wherePattern);

		queries.add(constructPattern.toString());

		return queries;
	}

	public static String constructSubject(URI key, Object object, Integer limit) {
		return "CONSTRUCT { <" + key + "> ?p ?o } WHERE { <" + key + "> ?p ?o }" + ((limit != null) ? " LIMIT " + limit : "");
	}
}
