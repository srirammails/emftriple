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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.rdf.RDFPackage;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public abstract class AbstractTransformationAction implements IObjectActionDelegate {

	private ISelection currentSelection;

	public AbstractTransformationAction() {
		super();
	}

	protected static void checkRegisteredModel() {
		if (!resourceSet().getResources().contains(OWLPackage.eINSTANCE.eResource())) {
			register(OWLPackage.eINSTANCE);
		}
		if (!resourceSet().getResources().contains(RDFPackage.eINSTANCE.eResource())) {
			register(RDFPackage.eINSTANCE);
		}
		if (!resourceSet().getResources().contains(EcorePackage.eINSTANCE.eResource())) {
			register( EcorePackage.eINSTANCE );
		}
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				transform((IFile)iterator.next());				
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
	}

	protected abstract void transform(IFile next) throws CoreException;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	protected InputStream openContentStream(String contents) {
		return new ByteArrayInputStream(contents.getBytes());
	}

}