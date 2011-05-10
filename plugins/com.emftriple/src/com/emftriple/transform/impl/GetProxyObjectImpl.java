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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emftriple.IMapping;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.resource.IETripleObject.URIBuilder;
import com.emftriple.transform.IGetObject;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class GetProxyObjectImpl extends AbstractGetObject implements IGetObject {

	public GetProxyObjectImpl(ResourceManager manager, IMapping mapping, IEntityDataSourceManager dataSourceManager) {
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
		
		proxy = EcoreUtil.create(eClass);
		URI uri = URIBuilder.build(manager.getResource(eClass), key);
		if (!uri.fragment().startsWith("uri=")) {
			throw new IllegalArgumentException();
		}
		((InternalEObject)proxy).eSetProxyURI(uri);
		manager.getResource(eClass).getContents().add(proxy);
		
		return proxy;
	}

}
