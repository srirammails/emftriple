package com.emf4sw.uml.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.atl.common.trans.Transformations;
import com.emf4sw.owl.atl.OWL2EcoreOptions;
import com.emf4sw.owl.atl.OWLResource2Ecore;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.resource.OWLResourceSet;
import com.emf4sw.uml.Ecore2UML;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public abstract class AbstractOWL2UMLAction implements IObjectActionDelegate {

	private ISelection currentSelection;
	
	private final OWLFormats format;
	
	public AbstractOWL2UMLAction(OWLFormats format) {
		this.format = format;
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
		
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(OWL2EcoreOptions.OWL2ECORE_REFINE_METAMODEL, Boolean.TRUE);
		options.put(OWLResource.OPTION_REASONER, Boolean.TRUE);
		
		final ResourceSet resourceSet = new OWLResourceSet();
		final Resource owlResource = resourceSet.createResource(URI.createURI(file.getName()));
		owlResource.load( file.getContents(), options );

		final Resource model = Transformations.transform(owlResource, new OWLResource2Ecore(options));
		final Resource umlModel = new Ecore2UML().execute(model);
		
		if (umlModel != null) {
			String name = file.getName();
			name = name.substring(0, name.length() - (file.getFileExtension().length()+1)) + ".uml";
			umlModel.setURI(URI.createURI(file.getFullPath().removeLastSegments(1).append(name).toString()));
			umlModel.save( Collections.EMPTY_MAP );
		}
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
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
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}
	
}
