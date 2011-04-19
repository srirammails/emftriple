package com.emftriple.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

import com.emftriple.impl.EObjectEntityManager;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.1
 */
public class ETripleURIHandlerImpl extends URIHandlerImpl implements URIHandler {

	private EObjectEntityManager manager;

	public ETripleURIHandlerImpl() {
		super();
	}
	
	public ETripleURIHandlerImpl(EntityManager manager) {
		this.manager = (EObjectEntityManager) manager;
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return "emftriple".equalsIgnoreCase(uri.scheme());
	}
	
	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return manager.getDelegate().executeAskQuery("ask where { <"+uri+"> ?p ?o }");
	}
	
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
//		EObject object = (EObject) manager.getDelegate().findNode(uri);
		
		return super.createInputStream(uri, options);
	}
	
	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		return super.createOutputStream(uri, options);
	}
	
	
}
