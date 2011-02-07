/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.proxy;

import java.util.ArrayList;
import java.util.List;

import javassist.util.proxy.ProxyFactory;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import com.emftriple.datasources.EntityDataSourceManager;

/**
 * {@link ObjectProxyFactory} singleton class used to create {@link ObjectProxy}. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ObjectProxyFactory {
	
	private ObjectProxyFactory() {}
	
	/**
	 * Returns a Javassist Proxy.
	 *  
	 * @param <T> Object Type
	 * @param aClass the object class or interface
	 * @param obj the object that will be a proxy
	 * @param id the object id
	 * @param entityManager the current EntityManager
	 * @return the proxy object
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T createProxy(Class<T> aClass, EClass eClass, Object obj, URI id, EntityDataSourceManager dataSourceManager)
	throws InstantiationException, IllegalAccessException 
	{
		final Class<?>[] interfaces = getInterfaces(aClass);
		final ProxyFactory factory = new ProxyFactory();
		if (!aClass.isInterface()) {
			factory.setSuperclass(aClass);
		}
		factory.setInterfaces(interfaces);
		factory.setHandler(new ObjectProxy<T>(aClass, eClass, (T)obj, getId(id), dataSourceManager));
		
		return (T) factory.createClass().newInstance();
	}
		
	private static URI getId(Object id) {
		if (id instanceof String) {
			return URI.createURI((String) id);
		}
		if (id instanceof URI) {
			return (URI) id;
		}
		throw new IllegalArgumentException();
	}
	
	private static Class<?>[] getInterfaces(Class<?> c) {
		List<Class<?>> listOfInterfaces = new ArrayList<Class<?>>();
		for (int i=0; i<c.getInterfaces().length;i++) {
			listOfInterfaces.add(c.getInterfaces()[i]);
		}
		if (!listOfInterfaces.contains(InternalEObject.class)) {
			listOfInterfaces.add(InternalEObject.class);
			listOfInterfaces.add(Notifier.class);
		}
		if (c.isInterface() && !listOfInterfaces.contains(c)) {
			listOfInterfaces.add(c);
		}
		
		return listOfInterfaces.toArray(new Class<?>[listOfInterfaces.size()]);
	}

	
	public static <T> Object createProxy(EClass nodeClass, Object obj, URI key, EntityDataSourceManager dataSourceManager) {
		@SuppressWarnings("unchecked") Class<T> cl = (Class<T>) nodeClass.getInstanceClass();
		
		try {
			return createProxy(cl, nodeClass, obj, key, dataSourceManager);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
