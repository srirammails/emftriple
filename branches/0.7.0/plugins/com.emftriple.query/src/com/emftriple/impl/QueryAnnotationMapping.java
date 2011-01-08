package com.emftriple.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;

import com.emftriple.query.MQueryBuilder;
import com.emftriple.query.QueryMapping;
import com.emftriple.query.mql.MQuery;
import com.emftriple.query.mql.SelectStatement;
import com.emftriple.util.EntityUtil;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class QueryAnnotationMapping extends EAnnotationMapping implements QueryMapping {

	private Map<String, SelectStatement> namedQueries;

	@SuppressWarnings("rawtypes")
	@Inject
	QueryAnnotationMapping(@Named("Packages") List packages, @Named("Properties") List properties) {
		super(packages, properties);
		System.out.println("yo");
		namedQueries = new HashMap<String, SelectStatement>();
		
		for (EClass eClass: getEClasses()) 
		{
			EAnnotation namedQueryAnn = EntityUtil.getETripleAnnotation(eClass, "NamedQuery");
			if (namedQueryAnn != null)
			{
				String name = namedQueryAnn.getDetails().get("name");
				String queryString = namedQueryAnn.getDetails().get("queryString");
				if (name != null && queryString != null)
				{
					SelectStatement q = MQueryBuilder.getSelect(queryString);
					if (q != null)
					{
						namedQueries.put(name, q);
					}	
				}
			}
		}
	}

	@Override
	public MQuery getNamedQuery(String queryString) {
		return namedQueries.get(queryString);
	}

	@Override
	public <T> TypedQuery<T> getNamedTypedQuery(String queryString, Class<T> arg1) {
//		return namedQueries.get(queryString);
		return null;
	}
	
	
}