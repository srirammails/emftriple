package com.emf4sw.owl.resource.injector;

import java.util.ArrayList;
import java.util.List;

import com.emf4sw.owl.ClassAssertion;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.SameIndividual;
import com.hp.hpl.jena.ontology.ConversionException;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class IndividualInjector {

	private static final OWLFactory factory = OWLFactory.eINSTANCE;

	private final ExpressionInjectorSwitch switchContext;

	public IndividualInjector(ExpressionInjectorSwitch switchContext) {
		this.switchContext = switchContext;
	}

	public void doInject(Individual individual, Ontology ontology) {
		if (individual.isOntLanguageTerm()) {
			return;
		}
		if (individual.isClass()) {
			return;
		}
		if (individual.isProperty()) {
			return;
		}
		if (individual.isOntology()) {
			return;
		}
		processClassAssertions(individual, ontology);
		processSameIndividuals(individual, ontology);
	}

	private void processSameIndividuals(Individual individual, Ontology ontology) {
		final com.emf4sw.owl.Ontology aOntology = (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology);
		final Object aIndividual = switchContext.doSwitch(individual);
		if (aIndividual instanceof com.emf4sw.owl.Individual) {
			final List<com.emf4sw.owl.Individual> list = new ArrayList<com.emf4sw.owl.Individual>();
			for (ExtendedIterator<? extends Resource> it = individual.listSameAs(); it.hasNext();) {
				Resource resource = it.next();
				try {
					com.emf4sw.owl.Individual sameAs = (com.emf4sw.owl.Individual) switchContext.doSwitch(resource);
					if (sameAs != null) {
						list.add(sameAs);
					}
				} catch (ClassCastException e) {
					e.printStackTrace();
				}
				if (!list.isEmpty() && aIndividual != null) {
					list.add((com.emf4sw.owl.Individual) aIndividual);
					SameIndividual axiom = factory.createSameIndividual();
					axiom.getIndividuals().addAll(list);
					axiom.setOntology(aOntology);
				}
			}
		}
	}

	private void processClassAssertions(Individual individual, Ontology ontology) {
		final com.emf4sw.owl.Ontology aOntology = (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology);
		try {
			for (ExtendedIterator<OntClass> it = individual.listOntClasses(true); it.hasNext() ;) {
				final Object obj = it.next();
				final OntClass aClass = (obj instanceof OntClass) ? (OntClass) obj : null;

				if (aClass != null) {
					ClassExpression expression = (ClassExpression) switchContext.doSwitch(aClass);
					com.emf4sw.owl.Individual aIndividual = (com.emf4sw.owl.Individual) switchContext.doSwitch(individual);
					if (expression != null && aIndividual != null) {
						ClassAssertion assertion = factory.createClassAssertion();
						assertion.setClassExpression(expression);
						assertion.setIndividual(aIndividual);
						assertion.setOntology(aOntology);
					}
				}
			}
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (ConversionException e) {
			e.printStackTrace();
		}
	}

}
