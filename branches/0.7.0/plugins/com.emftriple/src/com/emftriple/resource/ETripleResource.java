/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.resource;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.emftriple.ETriple;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.impl.ETripleEntityTransaction;
import com.emftriple.impl.ETripleEntityManagerFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETripleResource extends XMIResourceImpl implements Resource {

	public static final String ETRIPLE_DATASOURCE_NAME = "ETRIPLE_DATASOURCE_NAME";

	@SuppressWarnings("unused")
	private DataSource dataSource;

	private javax.persistence.spi.PersistenceProvider persistenceProvider;

	public ETripleResource(URI uri) {
		super(uri);

		this.persistenceProvider = ETriple.getInstance().getPersistenceProvider();
		if (getResourceSet() == null)
			resourceSet = new ETripleResourceSet();
		
		getResourceSet().getResources().add(this);
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		super.delete(options);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		super.save(options);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void load(Map<?, ?> options) throws IOException {
		Map<String, String> decode = decodeQueryString(getURI().authority());
		String emName = decode.containsKey("unit") ? decode.get("unit") : null;

		EntityManagerFactory emf = persistenceProvider.createEntityManagerFactory(emName, options);
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		decode = decodeQueryString(getURI().query());
		Query q = em.createQuery(decode.get("query"));
		
		List<?> list = q.getResultList();
		em.getTransaction().commit();
		em.close();

		this.getContents().addAll((Collection<? extends EObject>) list);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		System.out.println("get object");
		if (uriFragment.startsWith(ETripleEntityTransaction.RESOURCE_URI)) {
			final EntityManager em = 
				ETripleEntityManagerFactory.Registry.INSTANCE.getActiveEntityManager();
			
			URI uri = URI.createURI(uriFragment);
			String query = uri.query();
			if (query != null && query.startsWith("query=")) {
//				String key = query.split("=")[1];
//				if (em.getTransaction().isActive()) {
//					System.out.println("try it");
//					return em.find(arg0, key);
//				}
			}
			return null;
		} else {
			return super.getEObject(uriFragment);
		}
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
}
