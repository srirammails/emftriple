package com.emf4sw.owl.consistency;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * {@link ConsistencyChecker}
 * 
 * <p>
 * Check the consistency.
 * </p>
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public interface ConsistencyChecker {

	/**
	 * @return TRUE if consistent.
	 */
	boolean isConsistent();
	
	/**
	 * @return explanation of inconsistency as a {@link Model}.
	 */
	Model getExplanation();
	
}
