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

		persistenceProvider = ETriple.getInstance().getPersistenceProvider();
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
		System.out.println(decode);
		Query q = em.createQuery(decode.get("query"));
		List<?> list = q.getResultList();
		em.getTransaction().commit();
		em.close();

		this.getContents().addAll((Collection<? extends EObject>) list);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		System.out.println("getting " + uriFragment);
		
		return super.getEObject(uriFragment);
	}
	
//	@Override
//	public String getURIFragment(EObject eObject) {
//		if (eObject.eResource() == null) {
//			if (eObject.eContainer() != null && eObject.eContainer().eResource() != null) {
//				eObject.eContainer().eResource().getContents().add(eObject);
//			} 
//		}	else {
//			getContents().add(eObject);
//		}
//		return super.getURIFragment(eObject);
//	}

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
