package com.emftriple.jena.tests;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.impl.TTLResource;
import com.emftriple.datasources.DataSources;
import com.emftriple.datasources.IMutableDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.ISparqlUpdateDataSource;
import com.emftriple.jena.JenaFile;
import com.emftriple.jena.JenaModule;
import com.google.common.collect.Lists;

public class JenaFileTest {

	@Test
	public void testAddTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "files/test1.ttl");
		
		IMutableDataSource dSource = DataSources.createMutableDataSource(new JenaModule(JenaFile.class, properties));
		
		assertNotNull(dSource);
		
		RDFGraph aGraph = new TTLResource().createGraph();
		aGraph.addTriple(aGraph.getResource("http://ex.org/a"), 
				aGraph.getProperty("http://ex.org/b"), aGraph.getResource("http://ex.org/c"));
		
		dSource.add(aGraph);
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);
	}
	
	@Test
	public void testRemoveTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "files/test2.ttl");
		
		IMutableDataSource dSource = DataSources.createMutableDataSource(new JenaModule(JenaFile.class, properties));
		
		assertNotNull(dSource);
		
		RDFGraph aGraph = new TTLResource().createGraph();
		aGraph.addTriple(aGraph.getResource("http://ex.org/a"), 
				aGraph.getProperty("http://ex.org/b"), aGraph.getResource("http://ex.org/c"));
		
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
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "files/test3.ttl");
		
		ISparqlUpdateDataSource dSource = DataSources.createSparqlUpdateDataSource(new JenaModule(JenaFile.class, properties));
		
		dSource.update(
				"PREFIX dc: <http://purl.org/dc/elements/1.1/> " +
				"INSERT DATA { <http://example/egbook3> dc:title  \"This is an example title\" }");
		
		IResultSet rs = dSource.selectQuery("select ?s where { ?s ?p ?o } ");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);
	}
}
