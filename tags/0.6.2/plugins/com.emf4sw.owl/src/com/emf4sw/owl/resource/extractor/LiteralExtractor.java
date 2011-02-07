package com.emf4sw.owl.resource.extractor;

import com.emf4sw.owl.Literal;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class LiteralExtractor {

	private LiteralExtractor() {}
	
	static com.hp.hpl.jena.rdf.model.Literal create(Literal literal, OntModel model) {
		com.hp.hpl.jena.rdf.model.Literal newLiteral; 
		if (literal.getDatatypeExpression() != null && literal.getDatatypeExpression().getEntity() != null) {
			newLiteral = model.createTypedLiteral( literal.getValue(), 
					literal.getDatatypeExpression().getEntity().getURI() );
		} else {
			newLiteral = model.createTypedLiteral( literal.getValue() );
		}
		return newLiteral;
	}
	
}
