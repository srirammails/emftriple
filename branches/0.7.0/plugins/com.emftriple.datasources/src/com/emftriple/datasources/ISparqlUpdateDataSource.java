package com.emftriple.datasources;


/**
 * The {@link ISparqlUpdateDataSource} interface represents a {@link IDataSource} that supports SPARQL Update queries.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */	
public interface ISparqlUpdateDataSource extends IMutableDataSource {

	/**
	 * Executes an {@link UpdateQuery} against the {@link IDataSource}
	 * 
	 * @param query to execute
	 * @throws DataSourceException
	 */
	void update(String query);
	
}
