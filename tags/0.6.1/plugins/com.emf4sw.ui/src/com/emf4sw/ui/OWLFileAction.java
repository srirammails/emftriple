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

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class OWLFileAction extends AbstractFileAction {
		
	private String extension;
	
	public OWLFileAction(OWLFormats format) {
		this.extension = format.extension();
	}
	
	private static void checkRegisteredModel() {
		if (!resourceSet().getResources().contains(OWLPackage.eINSTANCE.eResource())) {
			register(OWLPackage.eINSTANCE);
		}
	}
	
	protected static void checkRegisteredFactory(OWLFormats format) {
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey(format.extension())) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), format.factory());
		}
	}
	
	@Override
	protected void transform(IFile file) throws CoreException {
		checkRegisteredModel();
		
		try {
			final InputStream in = file.getContents();
			ResourceSet resourceSet = resourceSet();
			
			final Resource inResource = resourceSet.createResource(URI.createURI(file.getFullPath().toString()));
			final Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(OWLResource.OPTION_REASONER, Boolean.TRUE);
			inResource.load(in, options);

//			String name = file.getName();
//			name = name.substring(0, name.length() - file.getFileExtension().length()) + extension;
			
			final Resource outResource = 
				resourceSet.createResource(	URI.createURI( inResource.getURI().trimFileExtension() + "." + extension ) );
			outResource.getContents().addAll(inResource.getContents());
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
