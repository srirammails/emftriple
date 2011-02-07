package com.emf4sw.rdfizer.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.RDFXMLResourceFactory;
import com.emf4sw.rdfizer.RDFIzer;

/**
 * Example 2
 * 
 * This example shows how to generate a model from a RDF file. 
 *
 */
public class Example2 {
	public static void main(String[] args) {
		// Necessary if run in standalone
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new RDFXMLResourceFactory());
		
		ResourceSet resourceSet = Models.resourceSet();
		// Load the metamodel
		Resource metamodel = resourceSet.createResource(URI.createURI("src/resources/employee.ecore"));
		try {
			metamodel.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Create a new RDFIzer for this metamodel
		RDFIzer rdfizer = new RDFIzer(metamodel);
		
		System.out.println("Loading RDF resource.");
		// Load a RDF document
		Resource rdf = resourceSet.createResource(URI.createURI("src/resources/model-rdf.rdf"));
		try {
			rdf.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Translate RDF to model.");
		Resource model = rdfizer.toModel(rdf);
		model.setURI(URI.createURI("src/resources/model-from-rdf.xmi"));
		try {
			model.save(null);
			System.out.println("Model saved in workspace.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
