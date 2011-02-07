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
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IDataSourceManager;
import com.emftriple.datasources.IMutableDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.ISparqlUpdateDataSource;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * The {@link SparqlDataSourceManager} class is the default implementation of the {@link IDataSourceManager} interface.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.1
 */
public class SparqlDataSourceManager implements IDataSourceManager {

	protected final Map<String, IDataSource> dataSourcesByName = new HashMap<String, IDataSource>();

	protected final List<IDataSource> dataSources;
	
	@Inject
	SparqlDataSourceManager(@Named("DataSources") Federation dataSources) {
		this.dataSources = DataSourceBuilder.build(dataSources);
		for (IDataSource ds: this.dataSources) {
			dataSourcesByName.put(ds.getName(), ds);
		}
	}
	
	@Override
	public void connect() {
		for (IDataSource ds: dataSources) 
			ds.connect();
	}

	@Override
	public void disconnect() {
		for (IDataSource ds: dataSources) 
			ds.disconnect();		
	}

	@Override
	public IDataSource getDataSourceByGraph(URI graphURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDataSource getDataSource(String name) {
		return dataSourcesByName.get(name);
	}
	
	@Override
	public void remove(RDFGraph graph) 
	{
		if (getDefaultDataSource() instanceof IMutableDataSource) 
		{
			((IMutableDataSource)getDefaultDataSource()).remove(graph);
		}
	}
	
	@Override
	public void add(RDFGraph graph) 
	{
		if (getDefaultDataSource() instanceof IMutableDataSource) 
		{
			((IMutableDataSource)getDefaultDataSource()).add(graph);
		}
	}
	
	@Override
	public boolean executeAskQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().askQuery(aQuery);
		
		boolean result = false;
		for (IDataSource dataSource: dataSources) {
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
		
		for (IDataSource dataSource: dataSources) {
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
		
		for (IDataSource dataSource: dataSources)
			dataSource.describeQuery(aQuery, aGraph);
		
		return aGraph;
	}

	@Override
	public IResultSet executeSelectQuery(String aQuery) {
		if (dataSources.size() == 1)
			return getDefaultDataSource().selectQuery(aQuery);
		
		IResultSet resultSet = null;
		for (IDataSource dataSource: dataSources) {
			resultSet = dataSource.selectQuery(aQuery);
			if (resultSet.hasNext())
				return resultSet;
		}
		return resultSet;
	}

	@Override
	public int executeUpdateQuery(String aQuery) {
		if (getDefaultDataSource() instanceof ISparqlUpdateDataSource)
		{
			((ISparqlUpdateDataSource)getDefaultDataSource()).update(aQuery);
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
	public IDataSource getDefaultDataSource() {
		return dataSources.get(0);
	}

	@Override
	public List<IDataSource> getDataSources() {
		return dataSources;
	}

}
