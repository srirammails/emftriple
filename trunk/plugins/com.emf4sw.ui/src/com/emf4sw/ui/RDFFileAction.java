/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.ui;

import static com.atl.common.models.Models.register;
import static com.atl.common.models.Models.resourceSet;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.emf4sw.rdf.RDFPackage;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class RDFFileAction extends AbstractFileAction {
	
	private String extension;

	public RDFFileAction(String extension) {
		this.extension = extension;
	}
	
	private static void checkRegisteredModel() {
		if (!resourceSet().getResources().contains(RDFPackage.eINSTANCE.eResource())) {
			register(RDFPackage.eINSTANCE);
		}
	}
	
	@Override
	protected void transform(IFile file) throws CoreException {
		checkRegisteredModel();
		
		try {
			final InputStream in = file.getContents();
			ResourceSet set = resourceSet();
			final Resource resource = set.createResource(URI.createURI(file.getFullPath().toString()));
			final Map<Object, Object> options = new HashMap<Object, Object>();
			resource.load(in, options);

			String name = file.getName() + "." + extension;

			Resource outResource = 
				set.createResource(
						URI.createURI( file.getFullPath().removeLastSegments(1).append(name).toString()));
			outResource.getContents().addAll(resource.getContents());
			outResource.save(options);
			in.close();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);		
	}

}
