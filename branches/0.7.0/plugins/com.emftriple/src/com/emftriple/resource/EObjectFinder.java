package com.emftriple.resource;

import javax.persistence.EntityManager;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.Resource;
import com.emftriple.datasources.EntityDataSourceManager;

public class EObjectFinder {

	public static Object find(String uri, EntityManager em) {
		if (em.getTransaction().isActive())
		{
			final EntityDataSourceManager delegate = (EntityDataSourceManager) em.getDelegate();
			Resource res = RDFFactory.eINSTANCE.createResource();
			res.setURI(uri);
			
			return delegate.findNode(res);
		}
		return null;
	}
	
}
