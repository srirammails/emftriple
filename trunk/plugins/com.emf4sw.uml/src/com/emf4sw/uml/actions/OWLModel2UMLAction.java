/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.uml.actions;

import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.owl.resource.OWLFormats;

/**
 *
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class OWLModel2UMLAction extends AbstractOWL2UMLAction implements IObjectActionDelegate {

	/**
	 * Constructor for Ecore2OWLFileAction.
	 */
	public OWLModel2UMLAction() {
		super(OWLFormats.XMI);
	}

}
