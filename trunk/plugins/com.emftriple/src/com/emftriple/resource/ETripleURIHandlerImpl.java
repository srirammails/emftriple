package com.emftriple.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;

public class ETripleURIHandlerImpl implements URIHandler {

	@Override
	public boolean canHandle(URI uri) {
		return "emftriple".equalsIgnoreCase(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub

	}

}
