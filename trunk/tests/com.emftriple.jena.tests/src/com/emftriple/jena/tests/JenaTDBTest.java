package com.emftriple.jena.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.impl.TTLResource;
import com.emftriple.datasources.DataSources;
import com.emftriple.datasources.IMutableDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.ISparqlUpdateDataSource;
import com.emftriple.jena.JenaModule;
import com.emftriple.jena.JenaTDB;
import com.google.common.collect.Lists;

public class JenaTDBTest {
	
	@Test
	public void testAddTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "tdb/data1");
		
		IMutableDataSource dSource = DataSources.createMutableDataSource(new JenaModule(JenaTDB.class, properties));
		
		assertNotNull(dSource);
		
		RDFGraph aGraph = new TTLResource().createGraph();
		aGraph.addTriple(
				aGraph.getResource("http://ex.org/a"), 
				aGraph.getProperty("http://ex.org/b"),
				aGraph.getResource("http://ex.org/c"));
		
		dSource.add(aGraph);
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);
	}
	
	@Test
	public void testRemoveTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "tdb/data2");
		
		IMutableDataSource dSource = DataSources.createMutableDataSource(new JenaModule(JenaTDB.class, properties));
		
		assertNotNull(dSource);
		
		RDFGraph aGraph = new TTLResource().createGraph();
		aGraph.addTriple(
				aGraph.getResource("http://ex.org/a"), 
				aGraph.getProperty("http://ex.org/b"),
				aGraph.getResource("http://ex.org/c"));
		
		dSource.add(aGraph);
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);
		
		dSource.remove(aGraph);
		
		rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 0);
	}
	
	@Test
	public void testUpdateQueryAddTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "tdb/data3");
		
		ISparqlUpdateDataSource dSource = DataSources.createSparqlUpdateDataSource(new JenaModule(JenaTDB.class, properties));
		
		dSource.update(
				"PREFIX dc: <http://purl.org/dc/elements/1.1/> " +
				"INSERT DATA { <http://example/egbook3> dc:title  \"This is an example title\" }");
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);		
	}
	
	@Test
	public void testUpdateQueryRemoveTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "tdb/data4");
		
		ISparqlUpdateDataSource dSource = DataSources.createSparqlUpdateDataSource(new JenaModule(JenaTDB.class, properties));
		RDFGraph aGraph = new TTLResource().createGraph();
		aGraph.addTriple(
				aGraph.getResource("http://ex.org/a"), 
				aGraph.getProperty("http://ex.org/b"), 
				aGraph.getResource("http://ex.org/c"));
		
		dSource.add(aGraph);
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);		
		
		dSource.update("delete data { <http://ex.org/a> <http://ex.org/b>  <http://ex.org/c> }");
		
		rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 0);
	}
}
