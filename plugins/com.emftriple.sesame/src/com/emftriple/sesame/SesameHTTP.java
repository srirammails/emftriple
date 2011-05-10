package com.emftriple.sesame;

import org.openrdf.repository.Repository;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SesameHTTP extends SailDataSource {

	protected SesameHTTP(String name, Repository repository) {
		super(name, repository);
	}

}
