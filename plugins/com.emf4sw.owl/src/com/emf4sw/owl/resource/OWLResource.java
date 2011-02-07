package com.emf4sw.owl.resource;

import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.Ontology;

/**
 * {@link OWLResource}
 * 
 * <p>
 * A persistent ontology document.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public interface OWLResource extends Resource {

	String OPTION_REASONER = "OPTION_REASONER";
	
	Ontology getOntology();

}
