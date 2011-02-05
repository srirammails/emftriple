package com.emftriple.datasources;

import java.util.Properties;

import com.google.inject.Module;

public interface IDataSourceFactoryModule extends Module {
	
	Properties getProperties();
	
	Class<? extends IDataSource> getDataSourceClass();
	
}
