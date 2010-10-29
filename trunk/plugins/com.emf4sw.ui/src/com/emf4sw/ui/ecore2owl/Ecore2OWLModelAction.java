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

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.ui.IObjectActionDelegate;

import com.atl.common.models.Models;
import com.atl.common.trans.Transformations;
import com.emf4sw.owl.atl.Ecore2OWL;
import com.emf4sw.owl.resource.OWLResourceSet;
import com.emf4sw.ui.AbstractTransformationAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class Ecore2OWLModelAction extends AbstractTransformationAction implements IObjectActionDelegate {

	/**
	 * Constructor for Action1.
	 */
	public Ecore2OWLModelAction() {
		super();
	}
	
	protected  void transform(IFile file) throws CoreException  {
		final OWLResourceSet set = new OWLResourceSet();
		final EMFModel model = Models.inject(file.getFullPath().toString(), Models.ecore());
		final EMFModel owlModel = Transformations.transform(model, new Ecore2OWL());

		String name = file.getName();
		name = name.substring(0, name.length() - (file.getFileExtension().length()+1)) + "-owl.xmi";

		Resource outResource = set.createResource(URI.createURI(file.getFullPath().removeLastSegments(1).append(name).toString()));
		outResource.getContents().addAll(owlModel.getResource().getContents());
		try {
			outResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
	}
	
	

}
