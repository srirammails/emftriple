package com.emftriple.datasources;


/**
 * The {@link SparqlUpdateDataSource} interface represents a {@link DataSource} that supports SPARQL Update queries.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */	
public interface SparqlUpdateDataSource extends MutableDataSource {

	/**
	 * Executes an {@link UpdateQuery} against the {@link DataSource}
	 * 
	 * @param query to execute
	 * @throws DataSourceException
	 */
	void update(String query);
	
}
