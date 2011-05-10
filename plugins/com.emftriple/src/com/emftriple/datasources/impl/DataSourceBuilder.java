package com.emftriple.datasources.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emftriple.ETriple;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IDataSourceFactory;
import com.emftriple.datasources.IDataSourceFactoryModule;
import com.google.common.collect.Lists;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
class DataSourceBuilder {

	private static final Map<String, IDataSourceFactory> mapOfFactories = new HashMap<String, IDataSourceFactory>();
	
	private DataSourceBuilder() {}
	
	public static List<IDataSource> build(Federation dataSources) {
		final List<IDataSource> sources = Lists.newLinkedList();
		
		for (com.emftriple.config.persistence.DataSourceBuilder descriptor: dataSources.getMember()) {
			IDataSourceFactory aFactory;
			try {
				aFactory = getFactory(descriptor);
				if (aFactory.canCreate(descriptor)) {
					sources.add(aFactory.create(descriptor));
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return Collections.synchronizedList(sources);
	}

	private static IDataSourceFactory getFactory(com.emftriple.config.persistence.DataSourceBuilder descriptor) throws ClassNotFoundException {
		checkNotNull(descriptor.getFactory());
		
		if (!mapOfFactories.containsKey( descriptor.getFactory() )) {
			IDataSourceFactoryModule module = (IDataSourceFactoryModule) ETriple.get(IDataSourceFactoryModule.class);
			if (module == null) {
				throw new ClassNotFoundException("Cannot find IDataSourceFactoryModule");
			}
			                     
			final IDataSourceFactory aFactory = ETriple.inject(module).getInstance(IDataSourceFactory.class);
			if (aFactory != null) {
				mapOfFactories.put(descriptor.getFactory(), aFactory);	
			}
		}
		
		return mapOfFactories.get(descriptor.getFactory());
	}
}
