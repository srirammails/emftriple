package com.emftriple.sesame;

import org.openrdf.repository.Repository;

import com.emftriple.datasources.IMutableNamedGraphDataSource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SesameMem extends SailDataSource implements IMutableNamedGraphDataSource {

	protected SesameMem(String name, Repository repository) {
		super(name, repository, null);
	}

}
