package com.semweb.careers.resources;

import java.util.Map;
import java.util.TreeMap;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

public class HomeResource extends BaseResource {

	@Get
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());
		
		return getTemplateRepresentation("index.html", dataModel, MediaType.TEXT_HTML);
	}

}
