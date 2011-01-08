package com.emf4sw.rdf.transform.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.transform.Model2RDF;

public class Model2RDFTest {
	@Before
	public void tearUp() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new TTLResourceFactory());
	}
	
	@Test
	public void testA() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("models/a.model"));
		resource.load(null);
		
		Model2RDF m2r = new Model2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/a.model.rdf"));
		rdf.save(null);
	}
	
	@Test
	public void testB() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Models.register(Models.resource("models/b.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("models/b.model"));
		resource.load(null);
		
		Model2RDF m2r = new Model2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/b.model.rdf"));
		rdf.save(null);
	}
	
	@Test
	public void testC() throws IOException {
		Models.register(Models.resource("models/c.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("models/c.model"));
		resource.load(null);
		
		Model2RDF m2r = new Model2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/c.model.rdf"));
		rdf.save(null);
	}
}
