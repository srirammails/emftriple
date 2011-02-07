package com.emftriple.datasources;

import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.config.persistence.PersistenceFactory;
import com.emftriple.config.persistence.Properties;
import com.emftriple.config.persistence.Property;
import com.google.inject.Guice;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class DataSources {

	public static final String OTION_DATASOURCE_NAME = "com.emftriple.datasource.name";
	public static final String OTION_DATASOURCE_URL = "com.emftriple.datasource.url";
	
	private DataSources() {}

	public static IDataSource create(IDataSourceFactoryModule module) {
		DataSourceBuilder config = getConfig(module);
		final IDataSourceFactory factory = Guice.createInjector(module).getInstance(IDataSourceFactory.class);
		if (factory != null) {
			if (factory.canCreate(config)) {
				return factory.create(config);
			}
		}
		return null;
		
	}
	
	public static IMutableDataSource createMutableDataSource(IDataSourceFactoryModule module) {
		return create(module).as(IMutableDataSource.class);
	}
	
	public static INamedGraphDataSource createNamedGraphDataSource(IDataSourceFactoryModule module) {
		return create(module).as(INamedGraphDataSource.class);
	}
	
	public static IMutableNamedGraphDataSource createMutableNamedGraphDataSource(IDataSourceFactoryModule module) {
		return create(module).as(IMutableNamedGraphDataSource.class);
	}
	
	public static ISparqlUpdateDataSource createSparqlUpdateDataSource(IDataSourceFactoryModule module) {
		return create(module).as(ISparqlUpdateDataSource.class);
	}
	
	private static DataSourceBuilder getConfig(IDataSourceFactoryModule module) {
		final DataSourceBuilder builder = PersistenceFactory.eINSTANCE.createDataSourceBuilder();
		builder.setClass(module.getDataSourceClass().getName());
		builder.setName(module.getProperties().getProperty(OTION_DATASOURCE_NAME));
		builder.setUrl(module.getProperties().getProperty(OTION_DATASOURCE_URL));
		
		final Properties properties = PersistenceFactory.eINSTANCE.createProperties();
		for (Object prop: module.getProperties().keySet()) {
			Property property = PersistenceFactory.eINSTANCE.createProperty();
			property.setName((String) prop);
			property.setValue(module.getProperties().getProperty((String) prop));
		}
		
		builder.setProperty(properties);
		
		return builder;
	}

}
