package com.emf4sw.owl.resource.extractor;

import java.util.ArrayList;
import java.util.List;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataPropertyRestriction;
import com.emf4sw.owl.DisjointClasses;
import com.emf4sw.owl.DisjointUnion;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.HasKey;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectPropertyRestriction;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.SubClassOf;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.ontology.EnumeratedClass;
import com.hp.hpl.jena.ontology.IntersectionClass;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.rdf.model.RDFList;

/**
 * {@link ClassExpressionExtractor}
 * 
 * <p>
 * Extractor for {@link ClassExpression} classes.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
class ClassExpressionExtractor {
	
	private ClassExpressionExtractor() {
	}
	
	static OntClass createClass(ClassExpression ce, OntModel model) {
		return ce == null ? null : new ClassExpressionVisitorExtractor(model).doSwitch(ce);
	}
	
	public void extractHasKey(HasKey axiom, OntModel model) {
//		final OntClass aClass = createClass(axiom.getClassExpression(), model);
	}
	
	/**
	 * 
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected static class ClassExpressionVisitorExtractor extends OWLSwitch<OntClass> {

		private final OntModel model;
		
		protected ClassExpressionVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public OntClass caseEntityExpression(EntityExpression expression) {
			final Entity entity = expression.getEntity();
			if (entity instanceof OWLClass) {
				return model.createClass( ((OWLClass) entity).getURI());
			}
			return null;
		}

		@Override
		public OntClass caseOWLClass(OWLClass expression) {
			final OntClass aClass = model.createClass( expression.getURI() );
			aClass.addLabel( expression.getName(), null );
			
			return aClass;
		}
		
		@Override
		public UnionClass caseObjectUnionOf(ObjectUnionOf expression) {
			RDFList list = model.createList();
			for (ClassExpression value: expression.getUnionOf()) {
				OntResource c = createClass(value, model);
				if (c != null) {
					list = list.cons( c );
				}
			}
			
			return model.createUnionClass(null, list);
		}

		@Override
		public IntersectionClass caseObjectIntersectionOf(ObjectIntersectionOf expression) {
			RDFList list = model.createList();
			for (ClassExpression value: expression.getIntersectionOf()) {
				OntResource c = createClass(value, model);
				if (c != null) {
					list = list.cons( c );
				}
			}
			
			return model.createIntersectionClass(null, list);
		}

		@Override
		public OntClass caseObjectComplementOf(ObjectComplementOf expression) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public EnumeratedClass caseObjectOneOf(ObjectOneOf expression) {
			RDFList list = model.createList();
			for (Individual individual: expression.getOneOf()) {
				com.hp.hpl.jena.ontology.Individual ind = IndividualExtractor.create(individual, model);
				if (ind != null) {
					list = list.cons( ind );
				}
			}
			return model.createEnumeratedClass(null, list);
		}
		
		@Override
		public OntClass caseObjectPropertyRestriction(ObjectPropertyRestriction expression) {
			return new ObjectPropertyRestrictionExtractor.ObjectPropertyRestrictionVisitorExtractor(model).doSwitch(expression);
		}
		
		@Override
		public OntClass caseDataPropertyRestriction(DataPropertyRestriction expression) {
			return new DataPropertyRestrictionExtractor.DataPropertyRestrictionVisitorExtractor(model).doSwitch(expression);
		}
		
	}
	
	/**
	 * 
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected static class ClassAxiomVisitorExtractor extends OWLSwitch<Object> {
		
		private final OntModel model;
		
		protected ClassAxiomVisitorExtractor(OntModel model) {
			this.model = model;
		}
		
		@Override
		public Object caseSubClassOf(SubClassOf axiom) {
			final OntResource subClass = createClass(axiom.getSubClass(), model);
			final OntResource superClass = createClass(axiom.getSuperClass(), model);
			
			if (superClass != null && subClass != null) {
				subClass.asClass().addSuperClass(superClass);
			}
			return subClass;
		}

		@Override
		public Object caseDisjointClasses(DisjointClasses axiom) {
			final OntResource aClass = createClass(axiom.getExpression(), model);
			final List<OntResource> classes = new ArrayList<OntResource>();
			for (ClassExpression disjoint: axiom.getDisjointClasses()) {
				classes.add(createClass(disjoint, model));
			}
			for (OntResource disjoint: classes) {
				aClass.asClass().addDisjointWith(disjoint);
			}
			return aClass;
		}

		@Override
		public Object caseEquivalentClasses(EquivalentClasses axiom) {
			final OntResource aClass = createClass(axiom.getExpression(), model);
			final List<OntResource> classes = new ArrayList<OntResource>();
			for (ClassExpression equivalent: axiom.getEquivalentClasses()) {
				classes.add(createClass(equivalent, model));
			}
			for (OntResource disjoint: classes) {
				aClass.asClass().addEquivalentClass(disjoint);
			}
			return aClass;
		}

		@Override
		public Object caseDisjointUnion(DisjointUnion axiom) {
			final OntClass aClass = createClass(axiom.getExpression(), model);
			RDFList list = model.createList();
			for (ClassExpression disjointUnion: axiom.getDisjointClasses()) {
				OntClass aDisjoint = createClass(disjointUnion, model);
				if (aDisjoint != null) {
					list = list.cons( aDisjoint );
				}
			}
			model.createStatement(aClass, model.createProperty(OWL2.disjointUnionOf), list);
			return aClass;
		}

	}

}
