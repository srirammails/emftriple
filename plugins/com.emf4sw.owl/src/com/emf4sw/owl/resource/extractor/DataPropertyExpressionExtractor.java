package com.emf4sw.owl.resource.extractor;

import java.util.ArrayList;
import java.util.List;

import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyDomain;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataPropertyRange;
import com.emf4sw.owl.DisjointDataProperties;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentDataProperties;
import com.emf4sw.owl.FunctionalDataProperty;
import com.emf4sw.owl.SubDataPropertyOf;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class DataPropertyExpressionExtractor {

	protected DataPropertyExpressionExtractor() {
	}

	static OntProperty createProperty(DataPropertyExpression p, OntModel model) {
		OntProperty aProperty = null;
		if (p instanceof EntityExpression) {
			DataProperty property = ((EntityExpression) p).getEntity() instanceof DataProperty ?
					(DataProperty)((EntityExpression) p).getEntity() : null;
			aProperty = property != null ? model.createDatatypeProperty(property.getURI()) : null;
		} else if (p instanceof DataProperty) {
			aProperty = model.createDatatypeProperty(((DataProperty) p).getURI()); 
		}
		return aProperty;
	}

	public DataPropertyAxiomVisitorExtractor getDataPropertyAxiomVisitorExtractor(OntModel model) {
		return new DataPropertyAxiomVisitorExtractor(model);
	}
	
	/**
	 * 
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected static class DataPropertyAxiomVisitorExtractor extends OWLSwitch<OntProperty> {

		private final OntModel model;
		
		protected DataPropertyAxiomVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public OntProperty caseSubDataPropertyOf(SubDataPropertyOf axiom) {
			final OntProperty subProperty = createProperty(axiom.getSubDataProperty(), model);
			final OntProperty superProperty = createProperty(axiom.getSubDataProperty(), model);
			
			if (subProperty != null & superProperty != null) {
				subProperty.addSuperProperty(superProperty);
			}		
			return subProperty;
		}

		@Override
		public OntProperty caseDisjointDataProperties(DisjointDataProperties axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final List<OntProperty> properties = new ArrayList<OntProperty>();
			for (DataPropertyExpression disjoint: axiom.getDisjointProperties()) {
				properties.add(createProperty(disjoint, model));
			}
			if (properties.size() > 1) {
				for (OntProperty disjoint: properties) {
					model.createStatement(property,
							model.createProperty( OWL2.AllDisjointProperties ), disjoint);
				}
			} else {
				model.createStatement(property, 
						model.createProperty(OWL2.propertyDisjointWith), properties.get(0));
			}
			return property;
		}

		@Override
		public OntProperty caseEquivalentDataProperties(EquivalentDataProperties axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final List<OntProperty> properties = new ArrayList<OntProperty>();
			for (DataPropertyExpression equivalent: axiom.getEquivalentProperties()) {
				properties.add(createProperty(equivalent, model));
			}
			for (OntProperty equivalent: properties) {
					property.addEquivalentProperty(equivalent);
			}
			return property;
		}

		@Override
		public OntProperty caseDataPropertyDomain(DataPropertyDomain axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final OntResource domain = ClassExpressionExtractor.createClass(axiom.getDomain(), model);
			
			if (property != null && domain != null) {
				property.addDomain(domain);
			}
			return property;
		}

		@Override
		public OntProperty caseDataPropertyRange(DataPropertyRange axiom) {
			final Resource range = DataRangeExtractor.createDataRange(axiom.getRange(), model);
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null && range != null) {
				property.addRange(range);
			}
			return property;
		}

		@Override
		public OntProperty caseFunctionalDataProperty(FunctionalDataProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			if (property != null) {
				property.addRDFType(model.createResource(OWL.FunctionalProperty));
			}
			return property;
		}
	
	}

}
