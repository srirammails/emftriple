package com.semweb.careers.resources;

import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityNotFoundException;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

import com.emftriple.restlet.ETripleRestletUtil;
import com.semweb.jobs.Job;

public class JobResource extends BaseResource {

	private Job job;

	@Override
	public void doInit() {
		checkTransaction();

		final String jobId = (String) getRequestAttributes().get("jobId");
		if (jobId != null) {
			try {
				em.getTransaction().begin();
				job = em.find(Job.class, "http://www.semweb.com/jobs/" + jobId);
				em.getTransaction().commit();
			} catch (EntityNotFoundException e) {
				e.printStackTrace();
				em.getTransaction().commit();	
			} finally {
				
			}
		}
	}

	@Get("html")
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("job", this.job);
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());

		return getTemplateRepresentation("job.html", dataModel, MediaType.TEXT_HTML);
	}

	@Get("rdf")
	public Representation toRdf(Variant variant) throws ResourceException {
		return ETripleRestletUtil.getRepresentation(job, em, MediaType.APPLICATION_RDF_XML);
	}
	
	@Get("ttl")
	public Representation toTTL(Variant variant) throws ResourceException {
		return ETripleRestletUtil.getRepresentation(job, em, MediaType.APPLICATION_RDF_TURTLE);
	}
}
