package com.emf4sw.owl.consistency;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.mindswap.pellet.jena.PelletInfGraph;
import org.mindswap.pellet.jena.PelletReasonerFactory;

import com.atl.common.models.Models;
import com.atl.common.trans.Transformations;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.atl.Ecore2OWL;
import com.emf4sw.owl.resource.extractor.OntologyExtractor;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * {@link MetaModelConsistencyChecker}
 * 
 * <p>
 * Check the consistency of a metamodel.
 * MetaModelConsistencyChecker launches the {@link Ecore2OWL} transformation and checks the 
 * consistency of the resulting {@link Ontology} thanks to the Pellet reasoner.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class MetaModelConsistencyChecker extends AbstractConsistencyChecker implements ConsistencyChecker {

	private final Resource aResource;
	
	public MetaModelConsistencyChecker(Resource aResource) {
		super();
		this.aResource = aResource;
	}
	
	protected PelletInfGraph getPelletGraph() {
		if (!aResource.isLoaded()) {
			try {
				aResource.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		final EMFModel aModel = Models.inject( aResource, Models.ecore() );
		final EMFModel theOntology = Transformations.transform( aModel, new Ecore2OWL() );
		final Resource theOntologyResource = theOntology.getResource();
		
		final Model rawModel = ModelFactory.createDefaultModel();
		final OntModel model = ModelFactory.createOntologyModel( PelletReasonerFactory.THE_SPEC, rawModel );
		new OntologyExtractor( theOntologyResource ).extract( model );
		
		return (PelletInfGraph) model.getGraph();
	}

}
