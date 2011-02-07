package com.emf4sw.owl.transform.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import com.atl.common.models.Models;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;
import com.emf4sw.owl.transform.ecore2owl.Ecore2OWL;

public class Ecore2OWLTest {
	@Before
	public void tearUp() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
	}
	
	@Test
	public void testA() throws IOException {
		Resource resource = Models.resource(URI.createURI("models/a.ecore"));
		resource.load(null);
		
		Ecore2OWL e2o = new Ecore2OWL();
		Resource owl = e2o.apply(resource);
		
		owl.setURI(URI.createURI("owl/a.owl"));
		owl.save(null);
	}
	
	@Test
	public void testB() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Resource resource = Models.resource(URI.createURI("models/b.ecore"));
		resource.load(null);
		
		Ecore2OWL e2o = new Ecore2OWL();
		Resource owl = e2o.apply(resource);
		
		owl.setURI(URI.createURI("owl/b.owl"));
		owl.save(null);
	}
	
	@Test
	public void testC() throws IOException {
		Models.register(Models.resource("models/a.ecore", true));
		Models.register(Models.resource("models/b.ecore", true));
		Resource resource = Models.resource(URI.createURI("models/c.ecore"));
		resource.load(null);
		
		Ecore2OWL e2o = new Ecore2OWL();
		Resource owl = e2o.apply(resource);
		
		owl.setURI(URI.createURI("owl/c.owl"));
		owl.save(null);
	}
}
