
package com.semweb.careers.resources;

import java.util.Map;
import java.util.TreeMap;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

import com.emftriple.restlet.ETripleRestletUtil;
import com.semweb.jobs.Organisation;

public class OrganisationResource extends BaseResource {

	private Organisation company;
	
	@Override
    public void doInit() {
		checkTransaction();
		
        final String orgId = (String) getRequestAttributes().get("orgId");
        if (orgId != null) {
        	em.getTransaction().begin();
        	try {
        		company = em.find(Organisation.class, "http://dbpedia.org/resource/" + orgId);
        		em.getTransaction().commit();
        	} catch (Exception e) {
    			e.printStackTrace();
    			em.getTransaction().rollback();	
    		} finally {
    			
    		}
        }
	}
	
	@Get("html")
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("company", this.company);
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());
		
		return getTemplateRepresentation("organization.html", dataModel, MediaType.TEXT_HTML);
	}

	@Get("rdf")
	public Representation toRdf() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(company, em, MediaType.APPLICATION_RDF_XML);
	}
	
	@Get("ttl")
	public Representation toTTL() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(company, em, MediaType.APPLICATION_RDF_TURTLE);
	}
}
