package com.emf4sw.ui.owl2ecore;

import static com.atl.common.models.Models.resourceSet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IObjectActionDelegate;

import com.atl.common.trans.Transformations;
import com.emf4sw.owl.atl.OWL2EcoreOptions;
import com.emf4sw.owl.atl.OWLResource2Ecore;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.ui.AbstractTransformationAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public abstract class AbstractOWL2EcoreAction extends AbstractTransformationAction implements IObjectActionDelegate {

	public AbstractOWL2EcoreAction() {
	}
	
	@Override
	protected void transform(IFile file) throws CoreException {
		checkRegisteredModel();
		
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put(OWL2EcoreOptions.OWL2ECORE_REFINE_METAMODEL, Boolean.TRUE);
		options.put(OWLResource.OPTION_REASONER, Boolean.TRUE);
		
		final ResourceSet resourceSet = resourceSet();
		final Resource aResource = resourceSet.createResource(URI.createURI(file.getFullPath().toString()));
		try {
			aResource.load(options);
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		final Resource model = Transformations.transform(aResource, new OWLResource2Ecore(options));

		String name = file.getName();
		name = name.substring(0, name.length() - (file.getFileExtension().length()+1)) + ".ecore";

		model.setURI(URI.createURI(file.getFullPath().removeLastSegments(1).append(name).toString()));
		
		final OutputStream out = new ByteArrayOutputStream();
		try {
			model.save(out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final IWorkspace wks = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot wksroot = wks.getRoot();
		final IFile fileCreated = wksroot.getFile( 
				file.getFullPath().removeLastSegments(1).append(name.toString()));
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

}
