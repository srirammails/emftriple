package com.emf4sw.owl.resource.injector;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataPropertyDomain;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataPropertyRange;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.SubDataPropertyOf;
import com.hp.hpl.jena.ontology.DatatypeProperty;
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
public class DataPropertyAxiomInjector {

	private static final OWLFactory factory = OWLFactory.eINSTANCE;
	
	private final ExpressionInjectorSwitch switchContext;
	
	public DataPropertyAxiomInjector(ExpressionInjectorSwitch switchContext) {
		this.switchContext = switchContext;
	}
	
	public void doInject(DatatypeProperty source, Ontology ontology) {
		processSuperProperties(source, ontology);
		processDomains(source, ontology);
		processRanges(source, ontology);
	}

	private void processSuperProperties(DatatypeProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntProperty> it = source.listSuperProperties(); it.hasNext();) {
			Object sup = switchContext.doSwitch(it.next());
			if (sup instanceof DataPropertyExpression) {
				final DataPropertyExpression target = (DataPropertyExpression) switchContext.doSwitch(source);
				final SubDataPropertyOf axiom = factory.createSubDataPropertyOf();
				axiom.setSuperDataProperty((DataPropertyExpression) sup);
				axiom.setSubDataProperty(target);
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}
	
	private void processDomains(DatatypeProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntResource> it = source.listDomain(); it.hasNext();) {
			Object domain = switchContext.doSwitch(it.next());
			
			if (domain instanceof ClassExpression) {
				final DataPropertyExpression target = (DataPropertyExpression) switchContext.doSwitch(source);
				final DataPropertyDomain axiom = factory.createDataPropertyDomain();
				axiom.setDomain( (ClassExpression) domain );
				axiom.setProperty( target );
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}
	
	private void processRanges(DatatypeProperty source, Ontology ontology) {
		for (ExtendedIterator<? extends OntResource> it = source.listRange(); it.hasNext();) {
			Object range = switchContext.doSwitch(it.next());
			
			if (range instanceof DataRange) {
				final DataPropertyExpression target = (DataPropertyExpression) switchContext.doSwitch(source);
				final DataPropertyRange axiom = factory.createDataPropertyRange();
				axiom.setRange( (DataRange) range );
				axiom.setProperty( target );
				axiom.setOntology( (com.emf4sw.owl.Ontology) switchContext.doSwitch(ontology) );
			}
		}
	}

}
