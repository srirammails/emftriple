package com.emf4sw.owl.atl;

import org.eclipse.emf.ecore.resource.Resource;

import com.atl.common.models.Models;
import com.atl.common.query.Queries;
import com.atl.common.query.Query;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLResource;

/**
 * {@link OWLQueryBuilder}
 * 
 * Utility class that creates a {@link Query} for querying a {@link OWLResource}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class OWLQueryBuilder {

	public static <T> Query<T> get(String aQuery, Resource aResource) {
		Models.register(OWLPackage.eINSTANCE.eResource());
		
		final Query<T> query = new Queries.Builder()
		.in(Models.inject(aResource, Models.get(OWLPackage.eNS_URI)), "owl")
		.query(aQuery)
		.create();
		
		return query;
	}
	
}
