package com.emf4sw.owl.resource.injector;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DisjointClasses;
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.SubClassOf;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ClassAxiomInjector {

	private static final OWLFactory factory = OWLFactory.eINSTANCE;
	
	private final ExpressionInjectorSwitch switchContext;

	public ClassAxiomInjector(ExpressionInjectorSwitch switchContext) {
		this.switchContext = switchContext;
	}

	public void doInject(OntClass source, com.hp.hpl.jena.ontology.Ontology ontology) {
		final Ontology targetOntology = (Ontology) switchContext.doSwitch(ontology);
		
		processSubClassOf(source, targetOntology);
		processDisjointClasses(source, targetOntology);	
		processEquivalentClasses(source, targetOntology);
	}

	private void processSubClassOf(OntClass source, Ontology ontology) {
		for (ExtendedIterator<? extends OntClass> it = source.listSuperClasses(); it.hasNext();) {
			Object sup = switchContext.doSwitch(it.next());
			if (sup instanceof ClassExpression) {
				final ClassExpression target = (ClassExpression) switchContext.doSwitch(source);
				final SubClassOf axiom = factory.createSubClassOf();
				axiom.setSubClass(target);
				axiom.setSuperClass((ClassExpression) sup);
				axiom.setOntology(ontology);
			}
		}
	}

	private void processDisjointClasses(OntClass source, Ontology ontology) {
		final DisjointClasses axiom = factory.createDisjointClasses();
		for (ExtendedIterator<? extends OntClass> it = source.listSuperClasses(); it.hasNext();) {
			Object sup = switchContext.doSwitch(it.next());
			if (sup instanceof ClassExpression) {
				axiom.getDisjointClasses().add((ClassExpression) sup);
			}
		}
		if (!axiom.getDisjointClasses().isEmpty()) {
			final ClassExpression target = (ClassExpression) switchContext.doSwitch(source);
			axiom.setExpression(target);
			axiom.setOntology(ontology);
		}
	}

	private void processEquivalentClasses(OntClass source, Ontology ontology) {
		final EquivalentClasses axiom = factory.createEquivalentClasses();
		for (ExtendedIterator<? extends OntClass> it = source.listSuperClasses(); it.hasNext();) {
			Object sup = switchContext.doSwitch(it.next());
			if (sup instanceof ClassExpression) {
				axiom.getEquivalentClasses().add((ClassExpression) sup);
			}
		}
		if (!axiom.getEquivalentClasses().isEmpty()) {
			final ClassExpression target = (ClassExpression) switchContext.doSwitch(source);
			axiom.setExpression(target);
			axiom.setOntology(ontology);
		}
	}
}
