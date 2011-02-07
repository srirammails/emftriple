package com.emf4sw.owl.resource.extractor;

import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectHasSelf;
import com.emf4sw.owl.ObjectHasValue;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Restriction;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class ObjectPropertyRestrictionExtractor {

	private ObjectPropertyRestrictionExtractor() {
	}

	protected static class ObjectPropertyRestrictionVisitorExtractor extends OWLSwitch<OntClass> {

		private final OntModel model;
		
		ObjectPropertyRestrictionVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public OntClass caseObjectSomeValuesFrom(ObjectSomeValuesFrom expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			OntResource values = ClassExpressionExtractor.createClass(expression.getSomeValuesFrom(), model);
			Property property = ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model);
			if (property != null && values != null) {
				ret = model.createSomeValuesFromRestriction(null, 
						property, values);
			}
			return ret;
		}

		@Override
		public OntClass caseObjectAllValuesFrom(ObjectAllValuesFrom expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			OntResource values = ClassExpressionExtractor.createClass(expression.getAllValuesFrom(), model);
			Property property = ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model);
			if (property != null && values != null) {
				ret = model.createAllValuesFromRestriction(null, 
						property, values);
			}
			return ret;
		}

		@Override
		public OntClass caseObjectHasValue(ObjectHasValue expression) {
			OntClass ret = null;
			Individual individual = IndividualExtractor.create(expression.getHasValue(), model);
			Property property = ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model);
			if (property != null && individual != null) {
				ret = model.createHasValueRestriction(null, property, individual);
			}
			return ret;
		}

		@Override
		public OntClass caseObjectHasSelf(ObjectHasSelf expression) {
			OntClass ret = model.createOntResource(null).as(Restriction.class);
			Property property = ObjectPropertyExpressionExtractor.createProperty(
					expression.getOnProperty(), model);
			if (property != null) {
				OntologyExtractor.createStatement(ret, OWL2.onProperty, property.getURI(), model);
				Literal lit = model.createTypedLiteral("true", XSDDatatype.XSDboolean);
				OntologyExtractor.createStatement(ret, OWL2.hasSelf, lit, model);
			}
			return ret;
		}

		@Override
		public OntClass caseObjectExactCardinality(ObjectExactCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnClass() == null) {
				ret = model.createCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onClass, 
						ClassExpressionExtractor.createClass(expression.getOnClass(), model), model));
			}
			return ret;
		}

		@Override
		public OntClass caseObjectMaxCardinality(ObjectMaxCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnClass() == null) {
				ret = model.createMaxCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createMaxCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onClass, 
						ClassExpressionExtractor.createClass(expression.getOnClass(), model), model));
			}
			return ret;
		}

		@Override
		public OntClass caseObjectMinCardinality(ObjectMinCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnClass() == null) {
				ret = model.createMinCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createMinCardinalityRestriction(null, 
						ObjectPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onClass, 
						ClassExpressionExtractor.createClass(expression.getOnClass(), model), model));
			}
			return ret;
		}

	}	
}
