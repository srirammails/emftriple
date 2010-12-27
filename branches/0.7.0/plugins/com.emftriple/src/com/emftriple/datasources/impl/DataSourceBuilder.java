package com.emftriple.datasources.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emftriple.ETriple;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceFactory;
import com.google.common.collect.Lists;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
class DataSourceBuilder {

	private static final Map<String, DataSourceFactory> mapOfFactories = new HashMap<String, DataSourceFactory>();
	
	private DataSourceBuilder() {}
	
	public static List<DataSource> build(Federation dataSources) {
		final List<DataSource> sources = Lists.newLinkedList();
		
		for (com.emftriple.config.persistence.DataSourceBuilder descriptor: dataSources.getMember()) {
			DataSourceFactory aFactory = getFactory(descriptor);
			
			if (aFactory.canCreate(descriptor)) {
				sources.add(aFactory.create(descriptor));
			}
		}
		
		return Collections.synchronizedList(sources);
	}

	private static DataSourceFactory getFactory(com.emftriple.config.persistence.DataSourceBuilder descriptor) {
		checkNotNull(descriptor.getFactory());
		
		if (!mapOfFactories.containsKey( descriptor.getFactory() )) {
			final DataSourceFactory aFactory = ETriple.getInstance().instance(getFactoryClass(descriptor.getFactory()));
			if (aFactory != null) {
				mapOfFactories.put(descriptor.getFactory(), aFactory);	
			}
		}
		
		return mapOfFactories.get(descriptor.getFactory());
	}

	@SuppressWarnings("unchecked")
	private static Class<? extends DataSourceFactory> getFactoryClass(String factoryName) {
		final ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> factoryClass = null;
		try {
			factoryClass = loader.loadClass(factoryName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (factoryClass == null) {
			throw new IllegalArgumentException("Cannot load class " + factoryName);
		}
		if (!DataSourceFactory.class.isAssignableFrom(factoryClass)) {
			throw new IllegalArgumentException("Factory is not a valid DataSourceFactory");
		}
		return (Class<? extends DataSourceFactory>) factoryClass;
	}
}