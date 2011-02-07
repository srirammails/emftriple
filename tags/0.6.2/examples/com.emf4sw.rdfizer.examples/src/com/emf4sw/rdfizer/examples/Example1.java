package com.emf4sw.rdfizer.examples;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.resource.RDFXMLResourceFactory;
import com.emf4sw.rdfizer.RDFIzer;

/**
 * 
 * Example1
 * 
 * This example shows how to generate a RDF file from a model. 
 *
 */
public class Example1 {
	public static void main(String[] args) {
		// Necessary if run in standalone
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new RDFXMLResourceFactory());
		
		Models.register(RDFPackage.eINSTANCE);
		
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
		
		System.out.println("Loading resource.");
		// Load and save a model in RDF
		Resource model = resourceSet.createResource(URI.createURI("src/resources/model.xmi"));
		try {
			model.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("Translate resource in RDF.");
		Resource rdf = rdfizer.toRdf(model, RDFFormats.RDF_XML_ABBREV_FORMAT);
		rdf.setURI(URI.createURI("src/resources/model-rdf.rdf"));
		try {
			rdf.save(null);
			System.out.println("RDF resource saved in worksapce.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
