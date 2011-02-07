package com.emftriple.query;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.DescribeQuery;
import com.emftriple.query.sparql.SPARQLQuery;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.SparqlPackage;
import com.emftriple.query.sparql.UpdateQuery;
import com.google.inject.Injector;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class SparqlBuilder {
	
//	private static final XtextResourceSet resourceSet;
//	
//	private static final IResourceFactory factory;

	private static Injector injector;

	static {
		injector = new SparqlStandaloneSetup().createInjectorAndDoEMFRegistration();
//		synchronized (SparqlBuilder.class) {
//			new Runnable() {
//				@Override
//				public void run() {
					getResourceSet();
//				}
//			}.run();	
//		}
	}

	public static ResourceSet getResourceSet() {
		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final IResourceFactory factory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rql", factory);
		
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

	public static ConstructQuery getConstructQuery(URI uri) {
		return getConstructQuery(getResource(uri));
	}
	
	public static ConstructQuery getConstructQuery(Resource resource) {
		checkNotNull(resource);
		checkIsLoaded(resource);
		
		return (ConstructQuery) EcoreUtil.getObjectByType(resource.getContents(), 
				SparqlPackage.eINSTANCE.getConstructQuery());
	}

	public static String extract(SPARQLQuery aQuery, Map<String, Object> parameters, int maxResults) {
		String queryString = extract(aQuery);
		for (String key: parameters.keySet()) {
			queryString = queryString.replaceAll( "?:"+ key, parameters.get(key).toString() );
		}
		return queryString;
	}
	
	private static Resource current = getResourceSet().createResource(URI.createURI("tmp.rql"));
	
	public static String extract(SPARQLQuery aQuery) {
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

	public static SelectQuery getSelectQuery(String aQuery) {
		final SPARQLQuery query = getQuery(aQuery);
		
		return query instanceof SelectQuery ? (SelectQuery) query : null;
	}
	
	public static ConstructQuery getConstructQuery(String aQuery) {
		final SPARQLQuery query = getQuery(aQuery);
		
		return query instanceof ConstructQuery ? (ConstructQuery) query : null;
	}
	
	public static AskQuery getAskQuery(String aQuery) {
		final SPARQLQuery query = getQuery(aQuery);
		
		return query instanceof AskQuery ? (AskQuery) query : null;
	}
	
	public static DescribeQuery getDescribeQuery(String aQuery) {
		final SPARQLQuery query = getQuery(aQuery);
		
		return query instanceof DescribeQuery ? (DescribeQuery) query : null;
	}

	public static UpdateQuery getUpdateQuery(String aQuery) {
		final SPARQLQuery query = getQuery(aQuery);
		
		return query instanceof UpdateQuery ? (UpdateQuery) query : null;
	}
	
	private static void checkIsLoaded(Resource resource) {
		if (!resource.isLoaded()) {
			try {
				resource.load(getResourceSet().getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static SPARQLQuery getQuery(String aQuery) {
		final Resource aResource = getResourceSet().createResource(URI.createURI("query.rql"));
		final InputStream aStream = new ByteArrayInputStream(aQuery.getBytes());
		
		try {
			aResource.load(aStream, getResourceSet().getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final EObject object = aResource.getContents().get(0);
		
		return object instanceof SPARQLQuery ? (SPARQLQuery) object : null;
	}
	
	public static void clear() {
		getResourceSet().getResources().clear();
	}

	private static String assignParameters(SPARQLQuery query, Map<String, Object> parameters) {
		String queryString = SparqlBuilder.extract(query);
		for (String param: parameters.keySet())
		{
			queryString = queryString.replaceAll("\\?:" + param, "\"" + parameters.get(param).toString() + "\"");
		}
		
		return queryString;
	}

	public static SPARQLQuery finalize(SPARQLQuery query, Map<String, Object> parameters, int maxResults) {
		String queryString = null;
		if (!parameters.keySet().isEmpty())
		{
			queryString = assignParameters(query, parameters);	
		}
		if (maxResults != 0)
		{
			queryString = queryString == null ? SparqlBuilder.extract(query) : queryString;
			queryString = queryString + " LIMIT " + maxResults;
		}
		return queryString == null ? query : SparqlBuilder.getQuery(queryString);
	}
}
