package com.emf4sw.owl.resource.injector;

import com.emf4sw.owl.OWLFactory;
import com.hp.hpl.jena.ontology.DataRange;
import com.hp.hpl.jena.ontology.Ontology;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class DataRangeInjector {

	@SuppressWarnings("unused")
	private static final OWLFactory factory = OWLFactory.eINSTANCE;

	@SuppressWarnings("unused")
	private final ExpressionInjectorSwitch switchContext;
	
	public DataRangeInjector(ExpressionInjectorSwitch switchContext) {
		this.switchContext = switchContext;
	}

	public void doInject(DataRange dataRange, Ontology ontology) {
		
	}
}
