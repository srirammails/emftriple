package com.emftriple.datasources.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.NamedGraphDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.SparqlUpdateDataSource;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.UpdateQuery;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * The {@link SparqlDataSourceManager} class is the default implementation of the {@link DataSourceManager} interface.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SparqlDataSourceManager implements DataSourceManager {

	protected final Map<URI, DataSource> dataSourcesByGraph = new HashMap<URI, DataSource>();
	
	protected final List<DataSource> dataSources;
	
	@Inject
	SparqlDataSourceManager(@Named("DataSources") Federation dataSources) {
		this.dataSources = DataSourceBuilder.build(dataSources);
	}
	
	@Override
	public void connect() {
		for (DataSource ds: dataSources) 
			ds.connect();
	}

	@Override
	public void disconnect() {
		for (DataSource ds: dataSources) 
			ds.disconnect();		
	}
	
	private DataSource resolveDataSourceByGraph(URI graphURI) {
		for (DataSource dataSource: dataSources) {
			if (dataSource instanceof NamedGraphDataSource) {
				if (((NamedGraphDataSource) dataSource).containsGraph(graphURI)) {
					return dataSource;
				}
			}
		}
		return null;
	}

	@Override
	public DataSource getDataSourceByGraph(URI graphURI) {
		if (dataSourcesByGraph.containsKey(graphURI)) {
			return dataSourcesByGraph.get(graphURI);
		} else {
			DataSource dataSource = resolveDataSourceByGraph(graphURI);
			if (dataSource == null) {
				throw new IllegalArgumentException("Graph with uri " + graphURI + " is not present in registered data sources.");
			}
			return dataSource;
		}
	}

	@Override
	public void remove(RDFGraph graph) 
	{
		if (getDefaultDataSource() instanceof MutableDataSource) 
		{
			((MutableDataSource)getDefaultDataSource()).remove(graph);
		}
	}
	
	@Override
	public void add(RDFGraph graph) 
	{
		if (getDefaultDataSource() instanceof MutableDataSource) 
		{
			((MutableDataSource)getDefaultDataSource()).add(graph);
		}
	}
	
	@Override
	public boolean executeAskQuery(AskQuery aQuery) {
		return getDefaultDataSource().askQuery(aQuery);
	}

	@Override
	public RDFGraph executeConctructQuery(ConstructQuery aQuery) {
		return getDefaultDataSource().constructQuery(aQuery);
	}

	@Override
	public RDFGraph executeDescribeQuery(DescribeQuery query) {
		return getDefaultDataSource().describeQuery(query);
	}

	@Override
	public ResultSet executeSelectQuery(SelectQuery aQuery) {
		return getDefaultDataSource().selectQuery(aQuery);
	}

	@Override
	public int executeUpdateQuery(UpdateQuery aQuery) {
		if (getDefaultDataSource() instanceof SparqlUpdateDataSource)
		{
			((SparqlUpdateDataSource)getDefaultDataSource()).update(aQuery);
			return 1;
		}
		return 0;
	}

	@Override
	public DataSource getDefaultDataSource() {
		return dataSources.iterator().next();
	}

	@Override
	public List<DataSource> getDataSources() {
		return dataSources;
	}

}
