package com.emftriple.sesame;

import org.eclipse.emf.common.util.URI;
import org.openrdf.repository.Repository;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SesameHTTP extends SailDataSource {

	protected SesameHTTP(URI defaultGraph, Repository repository) {
		super(defaultGraph, repository, null);
	}
}
