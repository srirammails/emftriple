package com.emf4sw.owl.consistency;

import org.mindswap.pellet.PelletOptions;
import org.mindswap.pellet.jena.PelletInfGraph;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link AbstractConsistencyChecker}
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public abstract class AbstractConsistencyChecker implements ConsistencyChecker {

	private PelletInfGraph pelletGraph;
	
	protected AbstractConsistencyChecker() {
		PelletOptions.USE_TRACING = true;
	}
	
	protected abstract PelletInfGraph getPelletGraph();
	
	public boolean isConsistent() {
		if (pelletGraph == null) {
			pelletGraph = getPelletGraph();
		}
		return pelletGraph.isConsistent();
	}
	
	public Model getExplanation() {
		return pelletGraph.explainInconsistency();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		PelletOptions.USE_TRACING = false;
	}
}
