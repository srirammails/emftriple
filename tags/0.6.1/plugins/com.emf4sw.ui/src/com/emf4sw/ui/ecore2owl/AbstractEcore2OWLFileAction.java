package com.emf4sw.ui.ecore2owl;

import static com.atl.common.models.Models.resourceSet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

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
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.atl.Ecore2OWLResources;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.ui.AbstractTransformationAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public abstract class AbstractEcore2OWLFileAction extends AbstractTransformationAction implements IObjectActionDelegate {

	@Override
	protected void transform(IFile file) throws CoreException {
		checkRegisteredModel();
		
		final ResourceSet resourceSet = resourceSet();
		final Resource aResource = resourceSet.createResource(URI.createURI(file.getFullPath().toString()));
		try {
			aResource.load(Collections.EMPTY_MAP);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		final List<Resource> ontologies = Transformations.transform(aResource, new Ecore2OWLResources(this.getFormat()));

		for (Resource owlResource: ontologies) {
			if (((OWLResource) owlResource).getOntology() != null) {
				final OutputStream out = new ByteArrayOutputStream();
				try {
					owlResource.save(out, null);
				} catch (IOException e) {
					e.printStackTrace();
				}

				final IWorkspace wks = ResourcesPlugin.getWorkspace();
				final IWorkspaceRoot wksroot = wks.getRoot();
				final IFile fileCreated = wksroot.getFile( 
						file.getFullPath().removeLastSegments(1).append(getName(((OWLResource) owlResource).getOntology()) ) );
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
			}
		}
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
	}

	protected abstract OWLFormats getFormat();

	protected abstract String getName(Ontology ontology); 
}
