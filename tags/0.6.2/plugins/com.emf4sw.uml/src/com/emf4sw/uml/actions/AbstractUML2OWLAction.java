package com.emf4sw.uml.actions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.uml.UML2OWL;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class AbstractUML2OWLAction implements IObjectActionDelegate {
	
	private ISelection currentSelection;
	
	private final OWLFormats format;
	
	public AbstractUML2OWLAction(OWLFormats format) {
		this.format = format;
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
			} catch (IOException e) {
				throw new RuntimeException(e);
			} catch (ATLCoreException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private void transform(IFile file) throws CoreException, IOException, ATLCoreException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), format.factory());
		
		final UML2OWL uml2owl = new UML2OWL();
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource umlModel = resourceSet.createResource(URI.createURI(file.getFullPath().toString()));
		umlModel.load(null);
		final Resource owlModel = uml2owl.execute( umlModel );

		String name = file.getName();
		name = name.substring(0, name.length() - (file.getFileExtension().length()+1)) + ".owl";

		final Resource owlResource = resourceSet.createResource(
				URI.createURI(file.getFullPath().removeLastSegments(1).append(name).toString()));
		owlResource.getContents().addAll(owlModel.getContents());
		
		final OutputStream out = new ByteArrayOutputStream();
		try {
			owlResource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final IWorkspace wks = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot wksroot = wks.getRoot();
		final IFile fileCreated = wksroot.getFile(file.getFullPath().removeLastSegments(1).append(name));
		final InputStream stream = openContentStream(out.toString());

		if (fileCreated.exists()) {
			fileCreated.setContents(stream, true, true, null);
		} else {
			fileCreated.create(stream, true, null);
		}
		try {
			stream.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	private InputStream openContentStream(String contents) {
		return new ByteArrayInputStream(contents.getBytes());
	}
}
