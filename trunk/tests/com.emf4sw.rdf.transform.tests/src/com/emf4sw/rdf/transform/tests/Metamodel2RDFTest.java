package com.emf4sw.rdf.transform.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.impl.RDFXMLResourceFactory;
import com.emf4sw.rdf.transform.Metamodel2RDF;

public class Metamodel2RDFTest {

	@Before
	public void tearUp() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new RDFXMLResourceFactory());
	}
	
	@Test
	public void testA() throws IOException {
		Resource resource = Models.resource(URI.createURI("models/a.ecore"));
		resource.load(null);
		
		Metamodel2RDF m2r = new Metamodel2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/a.rdf"));
		rdf.save(null);
	}
	
	@Test
	public void testB() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Resource resource = Models.resource(URI.createURI("models/b.ecore"));
		resource.load(null);
		
		Metamodel2RDF m2r = new Metamodel2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/b.rdf"));
		rdf.save(null);
	}
	
	@Test
	public void testC() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Models.register(Models.resource("models/b.ecore", true));
		Resource resource = Models.resource(URI.createURI("models/c.ecore"));
		resource.load(null);
		
		Metamodel2RDF m2r = new Metamodel2RDF();
		Resource rdf = m2r.transform(resource, null);
		
		rdf.setURI(URI.createURI("rdf/c.rdf"));
		rdf.save(null);
	}
}
