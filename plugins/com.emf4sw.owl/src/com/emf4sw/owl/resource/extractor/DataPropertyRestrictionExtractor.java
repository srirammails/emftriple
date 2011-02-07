package com.emf4sw.owl.resource.extractor;

import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class DataPropertyRestrictionExtractor {

	private DataPropertyRestrictionExtractor() {
	}

	/**
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	public static class DataPropertyRestrictionVisitorExtractor extends OWLSwitch<OntClass> {

		private final OntModel model;
		
		DataPropertyRestrictionVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public OntClass caseDataSomeValuesFrom(DataSomeValuesFrom expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			Resource dataRange = DataRangeExtractor.createDataRange(expression.getSomeValuesFrom(), model);
			if (dataRange != null) {
				for (DataPropertyExpression aExpression: expression.getOnProperties()) {
					Property property = DataPropertyExpressionExtractor.createProperty(aExpression, model);
					if (property != null) {
						ret = model.createSomeValuesFromRestriction(null, property, dataRange);
					}
				}
			}
			return ret;
		}

		@Override
		public OntClass caseDataAllValuesFrom(DataAllValuesFrom expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			Resource dataRange = DataRangeExtractor.createDataRange(expression.getAllValuesFrom(), model);
			
			if (dataRange != null) {
				for (DataPropertyExpression aExpression: expression.getOnProperties()) {
					Property property = DataPropertyExpressionExtractor.createProperty(aExpression, model);		
					if (property != null) {
						ret = model.createAllValuesFromRestriction(null, property, dataRange);
					}
				}
			}
			return ret;
		}

		@Override
		public OntClass caseDataHasValue(DataHasValue expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			Literal literal = LiteralExtractor.create(expression.getHasValue(), model);
			Property property = DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model);
			if (property != null && literal != null) {
				ret = model.createHasValueRestriction(null, property, literal);
			}
			return ret;
		}

		@Override
		public OntClass caseDataExactCardinality(DataExactCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnDataRange() == null) {
				ret = model.createCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onDataRange, 
						DataRangeExtractor.createDataRange(expression.getOnDataRange(), model), model));
			}
			return ret;
		}

		@Override
		public OntClass caseDataMaxCardinality(DataMaxCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnDataRange() == null) {
				ret = model.createCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onDataRange, 
						DataRangeExtractor.createDataRange(expression.getOnDataRange(), model), model));
			}
			return ret;
		}

		@Override
		public OntClass caseDataMinCardinality(DataMinCardinality expression) {
			com.hp.hpl.jena.ontology.OntClass ret = null;
			if (expression.getOnDataRange() == null) {
				ret = model.createMinCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
			} else {
				ret = model.createMinCardinalityRestriction(null, 
						DataPropertyExpressionExtractor.createProperty(expression.getOnProperty(), model), 
						expression.getCardinality() );
				model.add(OntologyExtractor.createStatement(ret, OWL2.onDataRange, 
						DataRangeExtractor.createDataRange(expression.getOnDataRange(), model), model));
			}
			return ret;
		}
		
	}
	
}
