package com.emf4sw.owl.resource.injector;

import com.emf4sw.owl.Literal;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.Ontology;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class LiteralInjector {

	public static Literal create(RDFNode node) {
		Literal literal = null;
		if (node.isLiteral()) {
			literal = OWLFactory.eINSTANCE.createLiteral();
			literal.setValue(node.as(com.hp.hpl.jena.rdf.model.Literal.class).getLexicalForm());
		} else if (node.isURIResource()) {
			literal = OWLFactory.eINSTANCE.createLiteral();
			literal.setValue(node.as(Resource.class).getURI());
		}
		return literal;
	}

	public static Literal create(RDFNode node, Ontology ontology) {
		Literal literal = null;
		if (node.isLiteral()) {
			literal = OWLFactory.eINSTANCE.createLiteral();
			literal.setValue(node.as(com.hp.hpl.jena.rdf.model.Literal.class).getLexicalForm());
//			RDFDatatype datatype = node.as(com.hp.hpl.jena.rdf.model.Literal.class).getDatatype();
			// todo
		} else if (node.isURIResource()) {
			literal = OWLFactory.eINSTANCE.createLiteral();
			literal.setValue(node.as(Resource.class).getURI());
		}
		return literal;
	}
	
}
