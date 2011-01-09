/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.resource.injector;

import static com.atl.common.utils.Preconditions.checkIsLoaded;
import static com.atl.common.utils.Preconditions.checkNotNull;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.resource.OWLTurtleResourceFactory;
import com.emf4sw.owl.resource.OWLXMLResourceFactory;
import com.emf4sw.owl.resource.OWLResourceSet;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

/**
 *  
 * Injector that creates a {@link Ontology} from a {@link OntModel}.
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class OntologyInjector {

	private static final Registry registry = Resource.Factory.Registry.INSTANCE;
	
	private final OntModel model;

	public OntologyInjector(OntModel model) {
		this.model = model;
	}
	
	/**
	 * 
	 * @return {@link OWLResource} containing a {@link Ontology}.
	 */
	public OWLResource inject() {
		checkFactoryRegistry();
		
		return doInject((OWLResource) new OWLResourceSet().createResource(URI.createURI("dummy.owl")));
	}

	/**
	 * Inject the {@link OntModel} into the {@link OWLResource}.
	 * @param empty {@link OWLResource}
	 * @return {@link OWLResource} with a {@link Ontology}
	 */
	public OWLResource inject(final OWLResource resource) {
		checkIsLoaded(resource);
		
		return doInject( resource );
	}

	protected OWLResource doInject(final OWLResource resource) {
		checkNotNull(resource);
		
		for (ExtendedIterator<Ontology> it = model.listOntologies(); it.hasNext();) {
			com.emf4sw.owl.Ontology ontology = doCreateAxioms(model, it.next());
			if (ontology != null) {
				resource.getContents().add(ontology);
			}
		}

		return resource;
	}

	private com.emf4sw.owl.Ontology doCreateAxioms(OntModel ontModel, Ontology ontology) {
		final ExpressionInjectorSwitch expressionSwitch = new ExpressionInjectorSwitch(ontModel, ontology);
		final AxiomInjectorFactory factory = new AxiomInjectorFactory(ontology, expressionSwitch);
		
		for (ResIterator it = ontModel.listSubjects(); it.hasNext();) {
			com.hp.hpl.jena.rdf.model.Resource res = it.next();
			factory.doInject( res );
		}
		
		return (com.emf4sw.owl.Ontology) expressionSwitch.doSwitch(ontology);
	}

	private static void checkFactoryRegistry() {
		if (!registry.getContentTypeToFactoryMap().containsKey("owl")) {
			registry.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		}
		if (!registry.getContentTypeToFactoryMap().containsKey("ttl")) {
			registry.getExtensionToFactoryMap().put("ttl", new OWLTurtleResourceFactory());
		}
	}
}
