package com.emftriple;

import com.emftriple.config.persistence.Federation;
import com.google.inject.Module;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface IDataSourceModule extends Module {

	void setMapping(IMapping mapping);
	
	void setFederation(Federation federation);
	
}
