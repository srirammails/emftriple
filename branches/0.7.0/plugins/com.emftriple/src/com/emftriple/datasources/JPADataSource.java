package com.emftriple.datasources;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface JPADataSource extends DataSource {

	/**
	 * Sets a {@link QueryFactory} to the {@link DataSource}
	 * 
	 * @param queryFactory
	 */
	void setQueryFactory(QueryFactory queryFactory);
	
	/**
	 * Returns the {@link QueryFactory} attached to the {@link DataSource}
	 * 
	 * @return query factory
	 */
	QueryFactory getQueryFactory();	
	
}
