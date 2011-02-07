package com.emf4sw.owl.resource.injector;

import com.hp.hpl.jena.ontology.DataRange;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
class AxiomInjectorFactory {

	private final ClassAxiomInjector classExpressionInjector;
	
	private final ObjectPropertyAxiomInjector objectPropertyInjector;

	private final Ontology ontology;

	private final DataPropertyAxiomInjector dataPropertyInjector;

	private final IndividualInjector individualInjector;
	
	private final DataRangeInjector dataRangeInjector;
	
	public AxiomInjectorFactory(com.hp.hpl.jena.ontology.Ontology ontology, ExpressionInjectorSwitch switchContext) {
		this.ontology = ontology;
		classExpressionInjector = new ClassAxiomInjector(switchContext);
		objectPropertyInjector = new ObjectPropertyAxiomInjector(switchContext);
		dataPropertyInjector = new DataPropertyAxiomInjector(switchContext);
		individualInjector = new IndividualInjector(switchContext);
		dataRangeInjector = new DataRangeInjector(switchContext);
	}
	
	public void doInject(Resource resource) {
		if (resource.canAs(ObjectProperty.class)) {
			objectPropertyInjector.doInject(resource.as(ObjectProperty.class), ontology);
		} 
		else if (resource.canAs(DatatypeProperty.class)) {
			dataPropertyInjector.doInject(resource.as(DatatypeProperty.class), ontology);
		} 
		else if (resource.canAs(DataRange.class)) {
			dataRangeInjector.doInject(resource.as(DataRange.class), ontology);
		} 
		else if (resource.canAs(OntClass.class)) {
			classExpressionInjector.doInject(resource.as(OntClass.class), ontology);
		} 
		else if (resource.canAs(Individual.class)) {
			individualInjector.doInject(resource.as(Individual.class), ontology);
		}
	}
	
}
