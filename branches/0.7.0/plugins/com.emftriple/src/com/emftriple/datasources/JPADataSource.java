package com.emftriple.datasources;

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
