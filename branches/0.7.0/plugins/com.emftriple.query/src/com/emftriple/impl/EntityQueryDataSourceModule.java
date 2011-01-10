package com.emftriple.impl;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.impl.DataSourceModule.EntityDataSourceModule;

public class EntityQueryDataSourceModule extends EntityDataSourceModule {

	public EntityQueryDataSourceModule(Mapping mapping, Federation sources) {
		super(mapping, sources);
	}
	
}
