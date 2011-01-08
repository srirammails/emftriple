package com.emftriple.datasources.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.RDFResource;
import com.emf4sw.rdf.resource.RDFResourceImpl.DummyRDFResource;
import com.emftriple.config.persistence.Federation;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.datasources.MutableDataSource;
import com.emftriple.datasources.ResultSet;
import com.emftriple.datasources.SparqlUpdateDataSource;
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

	protected final Map<String, DataSource> dataSourcesByName = new HashMap<String, DataSource>();

	protected final List<DataSource> dataSources;
	
	@Inject
	SparqlDataSourceManager(@Named("DataSources") Federation dataSources) {
		this.dataSources = DataSourceBuilder.build(dataSources);
		for (DataSource ds: this.dataSources) {
			dataSourcesByName.put(ds.getName(), ds);
		}
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

	@Override
	public DataSource getDataSourceByGraph(URI graphURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataSource getDataSource(String name) {
		return dataSourcesByName.get(name);
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
	public boolean executeAskQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().askQuery(aQuery);
		
		boolean result = false;
		for (DataSource dataSource: dataSources) {
			result = result || dataSource.askQuery(aQuery);
		}
		return result;
	}

	@Override
	public RDFGraph executeConctructQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().constructQuery(aQuery);
		
		final RDFResource resource = new DummyRDFResource();
		final RDFGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		resource.getContents().add(aGraph);
		
		for (DataSource dataSource: dataSources) {
			dataSource.constructQuery(aQuery, aGraph);
		}
		
		return aGraph;
	}

	@Override
	public RDFGraph executeDescribeQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().describeQuery(aQuery);
		
		final RDFResource resource = new DummyRDFResource();
		final RDFGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		resource.getContents().add(aGraph);
		
		for (DataSource dataSource: dataSources)
			dataSource.describeQuery(aQuery, aGraph);
		
		return aGraph;
	}

	@Override
	public ResultSet executeSelectQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().selectQuery(aQuery);
		
		ResultSet resultSet = null;
		for (DataSource dataSource: dataSources) {
			resultSet = dataSource.selectQuery(aQuery);
			if (resultSet.hasNext())
				return resultSet;
		}
		return resultSet;
	}

	@Override
	public int executeUpdateQuery(String aQuery) {
		if (getDefaultDataSource() instanceof SparqlUpdateDataSource)
		{
			((SparqlUpdateDataSource)getDefaultDataSource()).update(aQuery);
			return 1;
		}
		return 0;
	}

//	private DataSource identifyDataSet(String query) {
//		if (query.contains("from") || query.contains("FROM")) {
//			
//		}
//	}
	
	@Override
	public DataSource getDefaultDataSource() {
		return dataSources.get(0);
	}

	@Override
	public List<DataSource> getDataSources() {
		return dataSources;
	}

}
