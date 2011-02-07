package com.emf4sw.rdfizer.examples;

import static com.atl.common.models.Models.register;
import static com.atl.common.models.Models.resource;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdfizer.atl.RDF2ModelGen;

/**
 * 
 * Example 3
 * 
 * This example shows how to generate the ATL transformation that load a model from a RDF document.
 * The transformation may be use for testing. This is the transformation generated and used by the RDFIzer 
 * when the method RDFIzer.toModel() is called.
 *
 */
public class Example3 {
	public static void main(String[] args) {
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		register(resource("src/resources/employee.ecore", true));
		
		RDF2ModelGen gen = new RDF2ModelGen(Models.ePackage("http://www.example.com/Employee"));
		Resource atl = gen.getResource();
		atl.setURI(URI.createURI("src/resources/rdf2model.atl"));
		try {
			atl.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
