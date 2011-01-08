package com.semweb.careers.resources;

import java.util.Map;
import java.util.TreeMap;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

import com.emftriple.restlet.ETripleRestletUtil;
import com.semweb.jobs.Place;

public class PlaceResource extends BaseResource {
	
	private Place location;
	
	@Override
    public void doInit() {
		checkTransaction();
		
        final String locId = (String) getRequestAttributes().get("locId");
        if (locId != null) {
        	try {
        		em.getTransaction().begin();
        		location = em.find(Place.class, "http://dbpedia.org/resource/" + locId);
        		em.getTransaction().commit();
        	} catch (Exception e) {
    			e.printStackTrace();
    			em.getTransaction().commit();	
    		} finally {
    			
    		}
        }
	}

	@Get("html")
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("location", this.location);
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());
		
		return getTemplateRepresentation("location.html", dataModel, MediaType.TEXT_HTML);
	}

	@Get("rdf")
	public Representation toRdf() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(location, em, MediaType.APPLICATION_RDF_XML);
	}
	
	@Get("ttl")
	public Representation toTTL() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(location, em, MediaType.APPLICATION_RDF_TURTLE);
	}
}
