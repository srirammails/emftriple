package com.emf4sw.rdfizer.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.vocabulary.RDF;
import com.emf4sw.rdf.vocabulary.RDFS;

public class OWLUtil {

	private static final RDFFactory factory = RDFFactory.eINSTANCE;
	
	public static void createAllValuesFrom(final Resource subject, final Property feature, final Resource all, final RDFGraph aGraph) {
		final BlankNode n = factory.createBlankNode();
		n.setNodeID(EcoreUtil.generateUUID());
		aGraph.getBlankNodes().add(n);
		
		Property subClassOf;
		if (RDFIzerExec.NodeResolver.contains(RDFS.subClassOf)) {
			subClassOf = (Property) RDFIzerExec.NodeResolver.get(RDFS.subClassOf);
		} else {
			subClassOf = aGraph.getProperty(RDFS.subClassOf);
			RDFIzerExec.NodeResolver.put(RDFS.subClassOf, subClassOf);
		}
		
		Property type;
		if (RDFIzerExec.NodeResolver.contains(RDF.type)) {
			type = (Property) RDFIzerExec.NodeResolver.get(RDF.type);
		} else {
			type = aGraph.getProperty(RDF.type);
			RDFIzerExec.NodeResolver.put(RDF.type, type);
		}
		
		Property onProperty;
		if (RDFIzerExec.NodeResolver.contains(OWL.onProperty)) {
			onProperty = (Property) RDFIzerExec.NodeResolver.get(OWL.onProperty);
		} else {
			onProperty = aGraph.getProperty(OWL.onProperty);
			RDFIzerExec.NodeResolver.put(OWL.onProperty, onProperty);
		}
		
		Property allValuesFrom;
		if (RDFIzerExec.NodeResolver.contains(OWL.allValuesFrom)) {
			allValuesFrom = (Property) RDFIzerExec.NodeResolver.get(OWL.allValuesFrom);
		} else {
			allValuesFrom = aGraph.getProperty(OWL.allValuesFrom);
			RDFIzerExec.NodeResolver.put(OWL.allValuesFrom, allValuesFrom);
		}
		
		Resource restriction;
		if (RDFIzerExec.NodeResolver.contains(OWL.Restriction)) {
			restriction = (Resource) RDFIzerExec.NodeResolver.get(OWL.Restriction);
		} else {
			restriction = aGraph.getResource(OWL.Restriction);
			RDFIzerExec.NodeResolver.put(OWL.Restriction, restriction);
		}
		
		aGraph.addTriple(subject, subClassOf, n);
		aGraph.addTriple(n, type, restriction);
		aGraph.addTriple(n, onProperty, feature);
		aGraph.addTriple(n, allValuesFrom, all);
	}
	
	// :foo rdfs:subClassOf [
	// 		a owl:Restriction ;
	//		owl:onProperty <feature> ;
	//		owl:someValuesFrom <feature.type> 
	//	] .
	// 
	public static void createSomeValuesFrom(final Resource subject, final Property feature, final Resource some, final RDFGraph aGraph) {
		final BlankNode n = factory.createBlankNode();
		aGraph.getBlankNodes().add(n);
		
		Property subClassOf;
		if (RDFIzerExec.NodeResolver.contains(RDFS.subClassOf)) {
			subClassOf = (Property) RDFIzerExec.NodeResolver.get(RDFS.subClassOf);
		} else {
			subClassOf = aGraph.getProperty(RDFS.subClassOf);
			RDFIzerExec.NodeResolver.put(RDFS.subClassOf, subClassOf);
		}
		
		Property type;
		if (RDFIzerExec.NodeResolver.contains(RDF.type)) {
			type = (Property) RDFIzerExec.NodeResolver.get(RDF.type);
		} else {
			type = aGraph.getProperty(RDF.type);
			RDFIzerExec.NodeResolver.put(RDF.type, type);
		}
		
		Property onProperty;
		if (RDFIzerExec.NodeResolver.contains(OWL.onProperty)) {
			onProperty = (Property) RDFIzerExec.NodeResolver.get(OWL.onProperty);
		} else {
			onProperty = aGraph.getProperty(OWL.onProperty);
			RDFIzerExec.NodeResolver.put(OWL.onProperty, onProperty);
		}
		
		Property someValuesFrom;
		if (RDFIzerExec.NodeResolver.contains(OWL.someValuesFrom)) {
			someValuesFrom = (Property) RDFIzerExec.NodeResolver.get(OWL.someValuesFrom);
		} else {
			someValuesFrom = aGraph.getProperty(OWL.someValuesFrom);
			RDFIzerExec.NodeResolver.put(OWL.someValuesFrom, someValuesFrom);
		}
		
		Resource restriction;
		if (RDFIzerExec.NodeResolver.contains(OWL.Restriction)) {
			restriction = (Resource) RDFIzerExec.NodeResolver.get(OWL.Restriction);
		} else {
			restriction = aGraph.getResource(OWL.Restriction);
			RDFIzerExec.NodeResolver.put(OWL.Restriction, restriction);
		}
		
		aGraph.addTriple(subject, subClassOf, n);
		aGraph.addTriple(n, type, restriction);
		aGraph.addTriple(n, onProperty, feature);
		aGraph.addTriple(n, someValuesFrom, some);
	}
}
