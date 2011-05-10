package com.emftriple.query;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.emftriple.query.jpql.JPQLQuery;
import com.emftriple.query.jpql.QueryModule;
import com.emftriple.query.jpql.SelectStatement;
import com.google.inject.Injector;

public class JpqlBuilder {

	private static final Injector injector;
	
	static {
		injector = new JpqlStandaloneSetup().createInjectorAndDoEMFRegistration();
		getResourceSet();
	}
	
	public static ResourceSet getResourceSet() {
		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final IResourceFactory factory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mql", factory);
		
		return resourceSet;
	}
	
	public static Resource getResource(URI uri) {
		Resource resource = getResourceSet().createResource(uri);
		try {
			resource.load(getResourceSet().getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;
	}
	
	public static SelectStatement getSelect(String string) {
		final QueryModule query = getQuery(string);
		
		return query.getDefaultQuery() instanceof SelectStatement ? (SelectStatement) query.getDefaultQuery() : null;
	}
	
	private static QueryModule getQuery(String aQuery) {
		final Resource aResource = getResourceSet().createResource(URI.createURI("query.mql"));
		final InputStream aStream = new ByteArrayInputStream(aQuery.getBytes());
		
		try {
			aResource.load(aStream, getResourceSet().getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final EObject object = aResource.getContents().get(0);
		
		return object instanceof QueryModule ? (QueryModule) object : null;
	}
	
	public static void clear() {
		getResourceSet().getResources().clear();
	}

	private static Resource current = getResourceSet().createResource(URI.createURI("tmp.mql"));
	
	public static String extract(JPQLQuery aQuery) {
		final OutputStream outStream = new ByteArrayOutputStream();
		if (!current.getContents().isEmpty()) {
			current.getContents().clear();
		}
		current.getContents().add(aQuery);
		
		try {
			current.save(outStream, new HashMap<String, Object>());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return outStream.toString();
	}
}
