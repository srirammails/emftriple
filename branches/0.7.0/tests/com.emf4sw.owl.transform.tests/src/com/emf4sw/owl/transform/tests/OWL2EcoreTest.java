package com.emf4sw.owl.transform.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import com.atl.common.models.Models;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;
import com.emf4sw.owl.resource.impl.TTLResourceFactory;
import com.emf4sw.owl.transform.owl2ecore.OWL2Ecore;

public class OWL2EcoreTest {
	@Before
	public void tearUp() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());
	}
	
	private void load(String name, String format) throws IOException {
		Resource resource = Models.resource(URI.createURI("owl/" + name + format));
		resource.load(null);
		
		OWL2Ecore o2e = new OWL2Ecore();
		Resource owl = o2e.apply(resource);
		
		owl.setURI(URI.createURI("owl/" + name + ".ecore"));
		owl.save(null);
	}
	
	@Test
	public void testA() throws IOException { load("a", ".owl"); }
	
	@Test
	public void testB() throws IOException { load("b", ".owl"); }
	
	@Test
	public void testC() throws IOException { load("c", ".owl"); }
	
	@Test
	public void testD() throws IOException { load("d", ".ttl"); }
	
	@Test
	public void testGood() throws IOException { load("goodrelations", ".owl"); }
	
//	@Test
	public void testObi() throws IOException { load("merged-obi-comments", ".owl"); }
}
