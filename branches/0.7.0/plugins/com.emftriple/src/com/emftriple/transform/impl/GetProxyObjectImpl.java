/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleObject.URIBuilder;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.GetObject;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetProxyObjectImpl extends AbstractGetObject implements GetObject {

	public GetProxyObjectImpl(ResourceManager manager, Mapping mapping, EntityDataSourceManager dataSourceManager) {
		super(manager, mapping, dataSourceManager);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> entityClass, URI key) {
		T proxy = null;
		
		if (dataSourceManager.containsKey(key)) {
			proxy = (T) dataSourceManager.getByKey(key);
		}

		if (proxy == null)
		{
			proxy = (T) get(mapping.getEClass(entityClass), key);
		}
		
		return proxy;
	}

	@Override
	public EObject get(EClass eClass, URI key) {
		EObject proxy = null;
		if (dataSourceManager.containsKey(key)) {
			proxy = (EObject) dataSourceManager.getByKey(key);
		}
		
		final EFactory aFactory = eClass.getEPackage().getEFactoryInstance();
		proxy = aFactory.create(eClass);
		((InternalEObject)proxy).eSetProxyURI(URIBuilder.build(manager.getResource(eClass), key));
		
		if (proxy != null)
		{
			dataSourceManager.put(key, proxy);
		}
		
		return proxy;
	}

}
