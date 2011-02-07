/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.proxy;

import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container;

import com.emftriple.datasources.DataSourceException;
import com.emftriple.datasources.EntityDataSourceManager;

/**
 * Javassist Proxy
 * 
 * @param <T>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ObjectProxy<T> extends Container implements MethodHandler, InternalEObject {

	private T persistedObject;

	private final URI id;

	private final Class<T> entityClass;
	
	private EntityDataSourceManager dataSourceManager;

	private final EClass eClass;
	
	public ObjectProxy(Class<T> c, EClass eClass, T obj, URI id, EntityDataSourceManager dataSourceManager) {
		this.id = id;
		this.eClass = eClass;
		this.persistedObject = obj;
		this.entityClass = c;
		this.dataSourceManager = dataSourceManager;
	}

	@Override
	public EClass eClass() {
		return eClass;
	}
	
	@Override
	public Object invoke(Object arg0, Method method, Method proxyMethod, Object[] args) throws Throwable {
		return method.invoke(load(), args);
	}

	public T getEntity() {
		return load();
	}
	
	@Override
	public boolean equals(Object arg0) {
		return load().equals(arg0);
	}
	
	private T load() {
		if (persistedObject == null) {
			try {
				persistedObject = dataSourceManager.get(entityClass, this.id);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (DataSourceException e) {
				e.printStackTrace();
			}
		}
		return persistedObject;
	}

	@Override
	public boolean eIsProxy() {
		return Boolean.TRUE;
	}
	
	@Override
	public EObject eResolveProxy(InternalEObject proxy) {
		return (EObject) load();
	}
}
