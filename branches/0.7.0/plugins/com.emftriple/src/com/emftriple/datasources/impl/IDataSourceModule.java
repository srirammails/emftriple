package com.emftriple.datasources.impl;

import com.emftriple.Mapping;
import com.emftriple.config.persistence.Federation;

public interface IDataSourceModule {

	void setMapping(Mapping mapping);
	
	void setFederation(Federation federation);
	
}
