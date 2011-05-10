package com.emftriple.neo4j;

import java.util.Properties;

import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IDataSourceFactory;
import com.emftriple.datasources.IDataSourceFactoryModule;
import com.google.inject.AbstractModule;

public class Neo4JModule extends AbstractModule implements IDataSourceFactoryModule {
	
	private Properties properties;
	private Class<? extends IDataSource> kind;

	public Neo4JModule() {}
	
	public Neo4JModule(Class<? extends IDataSource> kind, Properties properties) {
		this.kind = kind;
		this.properties = properties;
	}
	
	@Override
	protected void configure() {
		bind(IDataSourceFactory.class)
			.to(Neo4JDataSourceFactory.class);
	}

	@Override
	public Properties getProperties() {
		return properties;
	}

	@Override
	public Class<? extends IDataSource> getDataSourceClass() {
		return kind;
	}
}
