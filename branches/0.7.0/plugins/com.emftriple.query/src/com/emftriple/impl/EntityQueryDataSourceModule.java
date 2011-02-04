package com.emftriple.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.config.persistence.Property;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.datasources.EntityManagerDelegate;
import com.emftriple.datasources.QueryFactory;
import com.emftriple.datasources.impl.DataSourceModule;
import com.emftriple.datasources.impl.EntityDataSourceManagerImpl;
import com.emftriple.query.QueryFactoryImpl;
import com.emftriple.query.QueryMapping;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.resource.ETripleResource.ResourceManagerImpl;
import com.google.inject.Module;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class EntityQueryDataSourceModule extends DataSourceModule {

	public EntityQueryDataSourceModule() {}
	
	@Override
	protected void configure() {
		super.configure();
		
		bind(QueryMapping.class)
			.toInstance((QueryMapping) mapping);
		bind(QueryFactory.class)
			.to(QueryFactoryImpl.class);
		bind(ResourceManager.class)
			.to(ResourceManagerImpl.class);
		bind(EntityManagerDelegate.class)
			.to(EntityDataSourceManagerImpl.class);
		bind(EntityDataSourceManager.class)
			.to(EntityDataSourceManagerImpl.class);
	}
	
	public static Module load(Class<? extends Module> cm, List<EPackage> packages) {
		Module m = null;
		Constructor<? extends Module> c = null;
		try {
			c = cm.getConstructor(List.class, List.class);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		if (c != null) {
			try {
				m = c.newInstance(packages, new ArrayList<Property>());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return m;
	}
}
