/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.IDataSource;
import com.emftriple.impl.EObjectEntityManager;
import com.emftriple.impl.ETripleEntityManagerFactory;
import com.emftriple.util.EntityUtil;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETripleResource extends ResourceImpl implements Resource {

	public static final String ETRIPLE_DATASOURCE_NAME = "ETRIPLE_DATASOURCE_NAME";

	@SuppressWarnings("unused")
	private IDataSource dataSource;

	public ETripleResource(URI uri) {
		super(uri);
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		super.delete(options);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		super.save(options);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
//		Map<String, String> decode = decodeQueryString(getURI().authority());
//		String emName = decode.containsKey("unit") ? decode.get("unit") : null;

//		EntityManager em = null;
//		try {
//			EntityManagerFactory emf = persistenceProvider.createEntityManagerFactory(emName, options);
//			em = emf.createEntityManager();
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//
//		if (em != null) {
//			em.getTransaction().begin();
//
//			decode = decodeQueryString(getURI().query());
//			Query q = em.createQuery(decode.get("query"));
//
//			List<?> list = q.getResultList();
//			em.getTransaction().commit();
//			em.close();
//
//			this.getContents().addAll((Collection<? extends EObject>) list);
//		}
	}

	@Override
	public EObject getEObject(String uriFragment) {
		EObject proxy = null;
		System.out.println("GET " + uriFragment);
		if (uriFragment != null && uriFragment.startsWith("uri=")) 
		{
			final URI key = URI.createURI(uriFragment.split("=")[1].replaceAll("%23", "#"));

			final EObjectEntityManager em = 
				(EObjectEntityManager) ETripleEntityManagerFactory.Registry.INSTANCE.getActiveEntityManager();
			
			if (em.getDelegate().containsKey(key)) {
				proxy = (EObject) em.getDelegate().getByKey(key);
				System.out.println("proxy from get " + proxy);
			} else {
				proxy = (EObject) em.getDelegate().findNode(key);
				System.out.println("proxy from find " + proxy);
			}
			return proxy;
		}
		return null;
	}

	//	String uriStr = "emftriple://unit=" + dataStoreName &?query=FROM EClass;
	protected Map<String, String> decodeQueryString(String qryStr) {
		final TreeMap<String, String> result = new TreeMap<String, String>();

		if (qryStr == null) {
			return result;
		}

		final String[] qryParts = qryStr.split("&");
		for (final String qryPart : qryParts) {
			final String fieldName = qryPart.substring(0, qryPart.indexOf('='));
			final String fieldValue = URI.decode(qryPart.substring(qryPart.indexOf('=') + 1));
			result.put(fieldName, fieldValue);
		}

		return result;
	}

	public interface ResourceManager {
		Resource getResource(URI graph) throws IllegalArgumentException;
		Resource getResource(EClass eClass);
		void clear();
	}

	public static class ResourceManagerImpl implements ResourceManager {

		private final Map<URI, Resource> resources;

		private static final ResourceSet resourceSet = new ETripleResourceSet();

		private static final URI defaultGraph = URI.createURI("emftriple://default");

		@Inject
		ResourceManagerImpl(@Named("DataSources") Federation dataSources) {
			resources = new HashMap<URI, Resource>();
			resources.put(defaultGraph, 
					resourceSet.createResource(URI.createURI("emftriple://default")));
			resourceSet.getResources().add(resources.get(defaultGraph));

			for (DataSourceBuilder dataSource: dataSources.getMember()) {
				for (String graph: dataSource.getGraphs()) {
					Resource res = resourceSet.createResource(URI.createURI(graph));
					resources.put(URI.createURI(graph), res);
					resourceSet.getResources().add(res);
				}
			}
		}

		public Resource getResource(URI graph) throws IllegalArgumentException {
			if (graph == null) {
				return resources.get(defaultGraph);
			}
			if (!resources.containsKey(graph)) {
				throw new IllegalArgumentException("Graph with uri " + graph + " is not defined in persistence configuration.");
			}

			return resources.get(graph);
		}

		public Resource getResource(EClass eClass) {
			Resource resource = null;
			try {
				resource = getResource(EntityUtil.getNamedGraph(eClass));	
			} catch (IllegalArgumentException e) {
				resource = getResource(defaultGraph) ;
			}
			if (resource.getResourceSet() == null) {
				resourceSet.getResources().add(resource);
				assert resource.getResourceSet() == resourceSet;
			}
			return resource;
		}

		@Override
		public void clear() {
			for (Resource res: resourceSet.getResources()) {
				res.unload();
			}
			resourceSet.getResources().clear();
		}
	}
	
	public static class ETripleURIHandler extends URIHandlerImpl implements URIHandler {
		@Override
		public boolean canHandle(URI uri) {
			if (uri.scheme().equals("emftriple")) {
				return true;
			}
			return super.canHandle(uri);
		}
	}
}
