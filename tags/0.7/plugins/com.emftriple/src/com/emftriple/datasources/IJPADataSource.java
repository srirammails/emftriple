package com.emftriple.datasources;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public interface IJPADataSource extends IDataSource {

	/**
	 * Sets a {@link IQueryFactory} to the {@link IDataSource}
	 * 
	 * @param queryFactory
	 */
	void setQueryFactory(IQueryFactory queryFactory);
	
	/**
	 * Returns the {@link IQueryFactory} attached to the {@link IDataSource}
	 * 
	 * @return query factory
	 */
	IQueryFactory getQueryFactory();	
	
}
