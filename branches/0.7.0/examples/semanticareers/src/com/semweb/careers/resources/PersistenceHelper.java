package com.semweb.careers.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EPackage;

import com.semweb.jobs.JOBPackage;

public class PersistenceHelper {

	private final static EntityManagerFactory emf;

	static {
		System.setProperty("http.proxyHost", "www-proxy.ericsson.se");
		System.setProperty("http.proxyPort", "8080");

		EPackage.Registry.INSTANCE.put(JOBPackage.eNS_URI, JOBPackage.eINSTANCE);
		
		emf = Persistence.createEntityManagerFactory("jobs");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

	private static EntityManager em = null;

	public static EntityManager getEntityManager() {
		if (em == null) {
			try {
				em = PersistenceHelper.getEntityManagerFactory().createEntityManager();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return em;
	}
}
