package com.emf4sw.owl.resource.injector;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.ObjectPropertyDomain;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.ObjectPropertyRange;
import com.emf4sw.owl.SubObjectPropertyOf;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
class ObjectPropertyAxiomInjector {
	
	private static final OWLFactory factory = OWLFactory.eINSTANCE;
	
	private final ExpressionInjectorSwitch switchContext;
	
	ObjectPropertyAxiomInjector(ExpressionInjectorSwitch switchContext) {
		this.switchContext = switchContext;
	}
	
	public void doInject(ObjectProperty source, Ontology ontology) {
		if (source != null && ontology != null) {
			processSuperProperties(source, ontology);
			processDomains(source, ontology);	
			processRanges(source, ontology);
		}
	}

	private void processSuperProperties(ObjectProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntProperty> it = source.listSuperProperties(); it.hasNext();) {
			Object sup = switchContext.doSwitch(it.next());
			if (sup instanceof ObjectPropertyExpression) {
				final ObjectPropertyExpression target = (ObjectPropertyExpression) switchContext.doSwitch(source);
				final SubObjectPropertyOf axiom = factory.createSubObjectPropertyOf();
				axiom.setSuperObjectProperty((ObjectPropertyExpression) sup);
				axiom.setSubObjectProperty(target);
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}
	
	private void processDomains(ObjectProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntResource> it = source.listDomain(); it.hasNext();) {
			Object domain = switchContext.doSwitch(it.next());
			
			if (domain instanceof ClassExpression) {
				final ObjectPropertyExpression target = (ObjectPropertyExpression) switchContext.doSwitch(source);
				final ObjectPropertyDomain axiom = factory.createObjectPropertyDomain();
				axiom.setDomain( (ClassExpression) domain );
				axiom.setProperty( target );
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}
	
	private void processRanges(ObjectProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntResource> it = source.listRange(); it.hasNext();) {
			Object range = switchContext.doSwitch(it.next());
			if (range instanceof ClassExpression) {
				final ObjectPropertyExpression target = (ObjectPropertyExpression) switchContext.doSwitch(source);
				final ObjectPropertyRange axiom = factory.createObjectPropertyRange();
				axiom.setRange( (ClassExpression) range );
				axiom.setProperty( target );
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}

}
