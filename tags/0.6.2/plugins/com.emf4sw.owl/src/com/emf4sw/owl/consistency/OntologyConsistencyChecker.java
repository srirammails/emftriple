package com.emf4sw.owl.consistency;

import org.mindswap.pellet.jena.PelletInfGraph;
import org.mindswap.pellet.jena.PelletReasonerFactory;

import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.extractor.OntologyExtractor;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * {@link OntologyConsistencyChecker}
 * 
 * <p>
 * Checks the consistency of a {@link Ontology} thanks to the Pellet reasoner.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class OntologyConsistencyChecker extends AbstractConsistencyChecker implements ConsistencyChecker {

	private final Ontology aOntology;
	
	public OntologyConsistencyChecker(Ontology aOntology) {
		super();
		this.aOntology = aOntology;
	}
			
	protected PelletInfGraph getPelletGraph() {
		final Model rawModel = ModelFactory.createDefaultModel();
		final OntModel model = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC, rawModel);
		new OntologyExtractor(aOntology).extract(model);
		
		return (PelletInfGraph) model.getGraph();
	}
	

}
