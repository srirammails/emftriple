package com.semweb.careers.resources;

import java.util.Map;

import javax.persistence.EntityManager;

import org.restlet.data.MediaType;
import org.restlet.ext.freemarker.TemplateRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ServerResource;

import com.semweb.careers.Application;

public abstract class BaseResource extends ServerResource {
	
	protected EntityManager em = PersistenceHelper.getEntityManager();
	
	protected Representation getTemplateRepresentation(String templateName, Map<String, Object> dataModel, MediaType mediaType) {
		return new TemplateRepresentation(templateName, ((Application) getApplication()).getConfiguration(), dataModel, mediaType);
	}
	
	protected void checkTransaction() {
		if (em.getTransaction().isActive())
			em.getTransaction().rollback();
	}
}
