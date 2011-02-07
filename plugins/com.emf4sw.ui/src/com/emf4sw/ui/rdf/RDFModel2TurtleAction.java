/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.ui.rdf;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.rdf.resource.RDFTurtleResourceFactory;
import com.emf4sw.ui.RDFFileAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class RDFModel2TurtleAction extends RDFFileAction implements IObjectActionDelegate {
		
	public RDFModel2TurtleAction() {
		super("ttl");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new RDFTurtleResourceFactory());
	}

}