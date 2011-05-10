package com.emftriple.jena.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.datasources.DataSources;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IResultSet;
import com.emftriple.jena.JenaModule;
import com.emftriple.jena.JenaService;
import com.google.common.collect.Lists;

public class JenaServiceTest {

	@Test
	public void testSelectOneTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "http://dbpedia.org/sparql");
		
		IDataSource dSource = DataSources.create(new JenaModule(JenaService.class, properties));
		
		IResultSet rs = dSource.selectQuery("select * where { <http://dbpedia.org/resource/Paris> a ?p } limit 1");
		
		assertEquals(Lists.newArrayList(rs).size(), 1);
	}
	
	@Test
	public void testConstructOneTriple() {
		Properties properties = new Properties();
		properties.setProperty(DataSources.OPTION_DATASOURCE_URL, "http://dbpedia.org/sparql");
		
		IDataSource dSource = DataSources.create(new JenaModule(JenaService.class, properties));
		
		RDFGraph aGraph = dSource.constructQuery(
				"construct { <http://dbpedia.org/resource/Paris> ?p ?o } " +
				"where { <http://dbpedia.org/resource/Paris> ?p ?o } limit 10");
		
		assertNotNull(aGraph);
		assertEquals(aGraph.getTriples().size(), 10);
	}
}
