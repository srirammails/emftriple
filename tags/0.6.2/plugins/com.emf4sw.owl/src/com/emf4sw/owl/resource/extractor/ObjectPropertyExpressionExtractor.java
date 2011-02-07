package com.emf4sw.owl.resource.extractor;

import java.util.ArrayList;
import java.util.List;

import com.emf4sw.owl.AssymmetricObjectProperty;
import com.emf4sw.owl.DisjointObjectProperties;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentObjectProperties;
import com.emf4sw.owl.FunctionalObjectProperty;
import com.emf4sw.owl.InverseFunctionalObjectProperty;
import com.emf4sw.owl.InverseObjectProperties;
import com.emf4sw.owl.IrreflexiveObjectProperty;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyChain;
import com.emf4sw.owl.ObjectPropertyDomain;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.ObjectPropertyRange;
import com.emf4sw.owl.ReflexiveObjectProperty;
import com.emf4sw.owl.SubObjectPropertyOf;
import com.emf4sw.owl.SymmetricObjectProperty;
import com.emf4sw.owl.TransitiveObjectProperty;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class ObjectPropertyExpressionExtractor {

	protected ObjectPropertyExpressionExtractor() {
	}

	static OntProperty createProperty(ObjectPropertyExpression p, OntModel model) {
		return (OntProperty) new ObjectPropertyVisitorExtractor(model).doSwitch(p);
	}

	ObjectPropertyAxiomVisitorExtractor getObjectPropertyAxiomVisitorExtractor(OntModel model) {
		return new ObjectPropertyAxiomVisitorExtractor(model);
	}
	
	/**
	 * 
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 *
	 */
	protected static class ObjectPropertyVisitorExtractor extends OWLSwitch<Object> {
		
		private OntModel model;
		
		public ObjectPropertyVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public Object caseEntityExpression(EntityExpression expression) {
			final ObjectProperty property = expression.getEntity() instanceof ObjectProperty ?
					(ObjectProperty) expression.getEntity() : null;
			return 
				property == null ? null : model.createObjectProperty( property.getURI() );
		}
		
		@Override
		public Object caseObjectProperty(ObjectProperty expression) {
			return expression == null ? null : model.createObjectProperty( expression.getURI() );
		}
		
		@Override
		public Object caseObjectPropertyChain(ObjectPropertyChain expression) {
//			expression.getProperties();
//			TODO
			return null;
		}

	}
	
	/**
	 * 
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected static class ObjectPropertyAxiomVisitorExtractor extends OWLSwitch<Object> {

		private final OntModel model;
		
		protected ObjectPropertyAxiomVisitorExtractor(OntModel model) {
			this.model = model;
		}
				
		@Override
		public Object caseSubObjectPropertyOf(SubObjectPropertyOf axiom) {
			final OntProperty subProperty = createProperty(axiom.getSubObjectProperty(), model);
			final OntProperty superProperty = createProperty(axiom.getSuperObjectProperty(), model);

			if (subProperty != null && superProperty != null) {
				subProperty.addSuperProperty(superProperty);
			}
			return subProperty;
		}

		@Override
		public Object caseObjectPropertyDomain(ObjectPropertyDomain axiom) {
			final OntResource domain = ClassExpressionExtractor.createClass(axiom.getDomain(), model);
			final OntProperty property = createProperty(axiom.getProperty(), model);

			if (domain != null && property != null) {
				property.addDomain(domain);
			}
			return domain;
		}

		@Override
		public Object caseObjectPropertyRange(ObjectPropertyRange axiom) {
			final OntResource range = ClassExpressionExtractor.createClass(axiom.getRange(), model);
			final OntProperty property = createProperty(axiom.getProperty(), model);

			if (range != null && property != null) {
				property.addRange(range);
			}
			return range;
		}

		@Override
		public Object caseEquivalentObjectProperties(EquivalentObjectProperties axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final List<OntProperty> properties = new ArrayList<OntProperty>();
			for (ObjectPropertyExpression equivalent: axiom.getEquivalentProperties()) {
				properties.add(createProperty(equivalent, model));
			}

			for (OntProperty equivalent: properties) {
				property.addEquivalentProperty(equivalent);
			}
			return property;
		}

		@Override
		public Object caseDisjointObjectProperties(DisjointObjectProperties axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final List<OntProperty> properties = new ArrayList<OntProperty>();
			for (ObjectPropertyExpression disjoint: axiom.getDisjointProperties()) {
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
		public Object caseInverseObjectProperties(InverseObjectProperties axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			final OntProperty inverse = createProperty(axiom.getInverseProperty(), model);
			
			if (property != null && inverse != null) {
				property.addInverseOf(inverse);
			}
			return property;
		}

		@Override
		public Object caseFunctionalObjectProperty(FunctionalObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL.FunctionalProperty));
			}
			return property;
		}

		@Override
		public Object caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL.InverseFunctionalProperty));
			}
			return property;
		}

		@Override
		public Object caseSymmetricObjectProperty(SymmetricObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL.SymmetricProperty));
			}
			return property;
		}

		@Override
		public Object caseReflexiveObjectProperty(ReflexiveObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL2.ReflexiveProperty));
			}
			return property;
		}

		@Override
		public Object caseIrreflexiveObjectProperty(IrreflexiveObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL2.IrreflexiveProperty));
			}
			return property;
		}

		@Override
		public Object caseTransitiveObjectProperty(TransitiveObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL.TransitiveProperty));
			}
			return property;
		}

		@Override
		public Object caseAssymmetricObjectProperty(AssymmetricObjectProperty axiom) {
			final OntProperty property = createProperty(axiom.getProperty(), model);
			
			if (property != null) {
				property.addRDFType(model.createResource(OWL2.AsymmetricProperty));
			}
			return property;
		}
		
	}
	
}
