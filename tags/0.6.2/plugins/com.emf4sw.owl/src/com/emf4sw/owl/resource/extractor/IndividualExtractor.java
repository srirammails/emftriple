package com.emf4sw.owl.resource.extractor;

import com.emf4sw.owl.AnonymousIndividual;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.NamedIndividual;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class IndividualExtractor {

	private IndividualExtractor() {
	}

	public static Individual create(com.emf4sw.owl.Individual individual, OntModel model) {
		Individual ind = null;
		if (individual instanceof NamedIndividual) {
			ind = model.createIndividual(
					((NamedIndividual) individual).getURI(), null );

			for (ClassExpression oc: individual.listTypes()) {
				ind.addRDFType( ClassExpressionExtractor.createClass(oc, model) );
			}
		}
		else if (individual instanceof AnonymousIndividual) {
			ind = model.createIndividual(null, null);
			for (ClassExpression oc: individual.listTypes()) {
				ind.addRDFType( ClassExpressionExtractor.createClass(oc, model) );
			}
		} 
		else if (individual instanceof EntityExpression) {
			Entity entity = ((EntityExpression) individual).getEntity();
			if (entity instanceof NamedIndividual) {
				ind = model.createIndividual(
						model.createResource( entity.getURI() ) );

				for (ClassExpression oc: ((com.emf4sw.owl.Individual) entity).listTypes()) {
					ind.addRDFType( ClassExpressionExtractor.createClass(oc, model) );
				}
			}				
		}
		else {
			throw new IllegalArgumentException();	
		}

		return ind;
	}

}
