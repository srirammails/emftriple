package com.semweb.careers.resources;

import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityNotFoundException;

import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ResourceException;

import com.semweb.jobs.JOBFactory;
import com.semweb.jobs.Job;
import com.semweb.jobs.Organisation;
import com.semweb.jobs.Place;

public class EmployerResource extends BaseResource {

	private Job job;

	@Put
	public void storeJob(Representation entity) throws ResourceException {
		checkTransaction();

		final Form form = new Form(entity);
		job = JOBFactory.eINSTANCE.createJob();

		String title = form.getFirstValue("title");
		String description = form.getFirstValue("summary");
		String org = form.getFirstValue("organisation");
		String location = form.getFirstValue("location");
		java.util.Date posted = Calendar.getInstance().getTime();
		
		if (title != null && description != null && location != null && org != null) {

			job.setTitle( title );
			job.setSummary(description);
			job.setPosted(posted);
			
			try {
				em.getTransaction().begin();
				Place loc = em.find(Place.class, "http://dbpedia.org/resource/" + location.trim().replaceAll(" ", "_"));
				if (loc != null)
					job.setLocation(loc);
				em.getTransaction().commit();
			} catch (EntityNotFoundException e) {
				e.printStackTrace();
				em.getTransaction().commit();
			}
			
			try {
				em.getTransaction().begin();
				Organisation comp = em.find(Organisation.class, "http://dbpedia.org/resource/" + org.trim().replaceAll(" ", "_"));
				if (comp != null)
					job.setOrganisation(comp);
				em.getTransaction().commit();
			} catch (EntityNotFoundException e) {
				e.printStackTrace();
				em.getTransaction().commit();
			}

			synchronized (job) {
				try {
					em.getTransaction().begin();
					em.persist(job);
					em.flush();
					em.getTransaction().commit();
				} catch (Exception e) {
					em.getTransaction().rollback();
				}	
			}
		}

		getResponse().redirectSeeOther(getRequest().getRootRef().addSegment("home"));
	}

	@Get("html")
	public Representation toHtml(Variant variant) throws ResourceException {
		final Map<String, Object> dataModel = new TreeMap<String, Object>();
		dataModel.put("resourceRef", getRequest().getResourceRef());
		dataModel.put("rootRef", getRequest().getRootRef());

		return getTemplateRepresentation("add.html", dataModel, MediaType.TEXT_HTML);
	}

}
