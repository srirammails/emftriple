package com.emf4sw.rdf.transform.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.transform.RDF2Model;

public class RDF2ModelTest {
	@Before
	public void tearUp() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new TTLResourceFactory());
	}
	
	@Test
	public void testA() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("rdf/a.model.rdf"));
		resource.load(null);
		
		RDF2Model r2m = new RDF2Model(Models.getMetamodelByUri("http://tests/a"));
		Resource rdf = r2m.transform(resource);
		
		rdf.setURI(URI.createURI("out/a.rdf.model"));
		rdf.save(null);
	}
	
	@Test
	public void testB() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Models.register(Models.resource("models/b.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("rdf/b.model.rdf"));
		resource.load(null);
		
		RDF2Model r2m = new RDF2Model(Models.getMetamodelByUri("http://tests/b"));
		Resource rdf = r2m.transform(resource);
		
		rdf.setURI(URI.createURI("out/b.rdf.model"));
		rdf.save(null);
	}
	
	@Test
	public void testC() throws IOException {
		Models.register(Models.resource("models/c.ecore", true));
		
		Resource resource = Models.resource(URI.createURI("rdf/c.model.rdf"));
		resource.load(null);
		
		RDF2Model r2m = new RDF2Model(Models.getMetamodelByUri("http://tests/c"));
		Resource rdf = r2m.transform(resource);
		
		rdf.setURI(URI.createURI("out/c.rdf.model"));
		rdf.save(null);
	}
}
