package com.emftriple.query.transform;

import java.util.List;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.ResultSet.Solution;
import com.emftriple.query.SparqlBuilder;
import com.emftriple.query.sparql.SelectQuery;
import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class SelectTypes implements Function<URIElement, List<String>> {

	private final DataSourceManager manager;

	public SelectTypes(DataSourceManager manager) {
		this.manager = manager;
	}

	@Override
	public List<String> apply(URIElement from) {
		final List<String> types = Lists.newArrayList();
		if (from != null && from.getURI() != null) 
		{
			final SelectQuery query = SparqlBuilder.getSelectQuery("SELECT ?t WHERE { <" + from.getURI() + "> <" + RDF.type + "> ?t }");
			final ResultSet resultSet = manager.executeSelectQuery(query);
			SparqlBuilder.clear();

			if (resultSet == null) {
				return null;
			}
			while (resultSet.hasNext()) {
				Solution solution = resultSet.next();
				Node node = solution.get("t");
				if (node instanceof URIElement)
				{
					types.add( ((URIElement) node).getURI() );
				}
			}
		}
		return types;
	}

}
