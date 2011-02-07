package com.emftriple.query.transform;

import static com.emftriple.query.SparqlBuilder.getSelectQuery;
import static com.emftriple.util.EntityUtil.getEntityURI;

import org.eclipse.emf.ecore.EClass;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.ResultSet;
import com.google.common.base.Function;

public class CountObjectsByType implements Function<EClass, Integer>{
	
	private final DataSource dataSource;

	public CountObjectsByType(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public Integer apply(EClass from) {
		ResultSet rs =
			dataSource.selectQuery(	
					getSelectQuery(
							"SELECT ?n WHERE { ?n <" + RDF.type + "> <" + getEntityURI(from) + "> }"
					)
			);
		
		int i=0;
		for (;rs.hasNext();)
			i += rs.next() != null ? 1 : 0;
		
		return i;
	}

}
