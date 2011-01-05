package com.semweb.careers.resources;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;

import com.emftriple.restlet.ETripleRestletUtil;
import com.semweb.jobs.Job;

public class JobsResource extends BaseResource {

	protected List<Job> list;

	@SuppressWarnings("unchecked")
	@Override
	protected void doInit() throws ResourceException {
		checkTransaction();
		
		String searchTerm = null;
		String location = null;
		if (getReference().hasQuery()) {
			searchTerm = getReference().getQueryAsForm().getFirst("searchTerm").getValue();
			location = getReference().getQueryAsForm().getFirst("location").getValue();
		}

		em.getTransaction().begin();
		try {
			if (searchTerm == null && location == null)
				this.list = 
					em.createNativeQuery("select ?j where { ?j a <http://www.semweb.com/jobs#Vacancy> }", 
							Job.class).getResultList();
			else if (searchTerm != null)
				this.list = 
					em.createNativeQuery("select ?j " +
							"where { " +
							" ?j a <http://www.semweb.com/jobs#Vacancy> ;" +
							" 	 <http://purl.org/dc/elements/1.1/title> ?name ." +
							" filter( ?name = ?:val ) " +
							"}", Job.class)
							.setParameter("val", searchTerm)
							.getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();	
		} finally {
			
		}
	}

	@Post
	public Representation search(Representation entity) throws ResourceException {
		final Form form = new Form(entity);

		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		System.out.println("searching " + form);
		return getTemplateRepresentation("jobs.html", dataModel, MediaType.TEXT_HTML);
	}

	@Get("html")
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("jobs", this.list);
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());

		return getTemplateRepresentation("jobs.html", dataModel, MediaType.TEXT_HTML);
	}
	
	@Get("rdf")
	public Representation toRdf() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(list, em, MediaType.APPLICATION_RDF_XML);
	}
	
	@Get("ttl")
	public Representation toTTL() throws ResourceException {
		return ETripleRestletUtil.getRepresentation(list, em, MediaType.APPLICATION_RDF_TURTLE);
	}
	
}
