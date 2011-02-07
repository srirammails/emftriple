package com.emf4sw.ui.rdfizer;

import static com.atl.common.models.Models.register;
import static com.atl.common.models.Models.resourceSet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdfizer.RDFIzer;
import com.emf4sw.ui.AbstractTransformationAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public abstract class AbstractModel2RDFAction extends AbstractTransformationAction implements IObjectActionDelegate {

	protected final RDFFormats format;
	
	public AbstractModel2RDFAction(RDFFormats format) {
		this.format = format;
	}

	@Override
	protected void transform(IFile file) throws CoreException {
		checkRegisteredModel();
		
		final ResourceSet resourceSet = resourceSet();
		final Resource aResource = resourceSet.createResource(URI.createURI(file.getFullPath().toString()));
		if (!aResource.isLoaded()) {
			try {
				aResource.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!aResource.getContents().isEmpty()) {
			EPackage aPackage = aResource.getContents().get(0).eClass().getEPackage();
			if (aPackage != null) {
				register(aPackage.eResource());
				final RDFIzer rdfizer = new RDFIzer(aPackage);
				final Resource rdfout = rdfizer.toRdf(aResource, format);
				
				String name = file.getName();
				name = name.substring(0, name.length() - file.getFileExtension().length()) + format.extension();
				
				rdfout.setURI(URI.createURI( file.getFullPath().removeLastSegments(1).append(name).toString()));
				
				final OutputStream out = new ByteArrayOutputStream();
				try {
					rdfout.save(out, null);
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
	}

}
