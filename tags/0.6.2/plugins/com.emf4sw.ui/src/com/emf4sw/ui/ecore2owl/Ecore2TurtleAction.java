/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.ui.ecore2owl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLTurtleResourceFactory;
import com.emf4sw.rdf.vocabulary.RDFS;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class Ecore2TurtleAction extends AbstractEcore2OWLFileAction implements IObjectActionDelegate {

	/**
	 * Constructor for Ecore2TurtleAction.
	 */
	public Ecore2TurtleAction() {
		super();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new OWLTurtleResourceFactory());
	}

	@Override
	protected String getName(Ontology ontology) {
		Annotation aLabel = ontology.getAnnotation(RDFS.label);
		String name = null;
		if (aLabel != null) {
			name = aLabel.getValue().getValue();
		}
		return name + ".ttl";
	}

	@Override
	protected OWLFormats getFormat() {
		return OWLFormats.TURTLE;
	}

}
