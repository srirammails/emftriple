package com.emf4sw.owl.resource.extractor;

import java.util.ArrayList;
import java.util.List;

import com.emf4sw.owl.Assertion;
import com.emf4sw.owl.ClassAssertion;
import com.emf4sw.owl.DataPropertyAssertion;
import com.emf4sw.owl.DifferentIndividuals;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.NegativeDataPropertyAssertion;
import com.emf4sw.owl.NegativeObjectPropertyAssertion;
import com.emf4sw.owl.ObjectPropertyAssertion;
import com.emf4sw.owl.SameIndividual;
import com.emf4sw.owl.util.OWLSwitch;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Literal;

/**
 * {@link AssertionExtractor}
 * 
 * <p>
 * Extractor for {@link Assertion} classes.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class AssertionExtractor {

	AssertionExtractor() {
	}

	public Object extractClassAssertion(Assertion axiom, OntModel model) {
		return new AssertionVisitorExtractor(model).doSwitch(axiom);
	}

	public OWLSwitch<Object> getAssertionVisitorExtractor(OntModel model) {
		return new AssertionVisitorExtractor(model);
	}
	
	public static class AssertionVisitorExtractor extends OWLSwitch<Object> {

		private final OntModel model;

		public AssertionVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public Object caseClassAssertion(ClassAssertion axiom) {
			final Individual individual = IndividualExtractor.create(axiom.getIndividual(), model);
			final OntResource type = ClassExpressionExtractor.createClass(axiom.getClassExpression(), model);
			
			if (individual != null && type != null) {
				individual.addRDFType(type);
			}
			return individual;
		}

		@Override
		public Object caseObjectPropertyAssertion(ObjectPropertyAssertion axiom) {
			final Individual subject = IndividualExtractor.create(axiom.getSourceIndividual(), model);
			final Individual object = IndividualExtractor.create(axiom.getTargetIndividual(), model);
			
			if (axiom.getObjectProperty() instanceof EntityExpression) {
				String aProperty = ((EntityExpression) axiom.getObjectProperty()).getEntity().getURI();
				subject.setPropertyValue(model.createProperty(aProperty), object);
			}
			return subject;
		}

		@Override
		public Object caseDataPropertyAssertion(DataPropertyAssertion axiom) {
			final Individual subject = IndividualExtractor.create(axiom.getSourceIndividual(), model);
			final Literal object = LiteralExtractor.create(axiom.getTargetValue(), model);
			
			if (axiom.getDataProperty() instanceof EntityExpression) {
				String aProperty = ((EntityExpression) axiom.getDataProperty()).getEntity().getURI();
				subject.setPropertyValue(model.createProperty(aProperty), object);
			}
			return subject;
		}

		@Override
		public Object caseSameIndividual(SameIndividual axiom) {
			List<Individual> individuals = new ArrayList<Individual>();
			for (com.emf4sw.owl.Individual aIndividual: axiom.getIndividuals()) {
				individuals.add( IndividualExtractor.create(aIndividual, model) );
			}
			for (Individual aIndividual: individuals) {
				for (Individual sameAs: individuals) {
					if (aIndividual != sameAs) 
						aIndividual.addSameAs(sameAs);
				}
			}
			return individuals;
		}

		@Override
		public Object caseDifferentIndividuals(DifferentIndividuals axiom) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion axiom) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion axiom) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
