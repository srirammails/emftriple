package com.emftriple.datasources;

import java.util.ArrayList;
import java.util.Collection;

import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.config.persistence.Federation;
import com.google.inject.Guice;
import com.google.inject.Module;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class DataSources {

	private DataSources() {
	}

	public static DataSource create(Module module, DataSourceBuilder config) {
		final DataSourceFactory factory = Guice.createInjector(module).getInstance(DataSourceFactory.class);
		if (factory != null) {
			if (factory.canCreate(config)) {
				return factory.create(config);
			}
		}
		return null;
	}

	public static Collection<DataSource> create(Module module, Federation config) {
		final DataSourceFactory factory = Guice.createInjector(module).getInstance(DataSourceFactory.class);
		final Collection<DataSource> all = new ArrayList<DataSource>();
		if (factory != null) {
			for (DataSourceBuilder b: config.getMember()) {
				if (factory.canCreate(b)) {
					all.add( factory.create(b) );
				}
			}
		}
		return all;
	}
}
