package com.emftriple.sesame;

import org.eclipse.emf.common.util.URI;
import org.openrdf.repository.Repository;

import com.emftriple.datasources.MutableNamedGraphDataSource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SesameMem extends SailDataSource implements MutableNamedGraphDataSource {

	protected SesameMem(URI defaultGraph, Repository repository) {
		super(defaultGraph, repository, null);
	}

}
