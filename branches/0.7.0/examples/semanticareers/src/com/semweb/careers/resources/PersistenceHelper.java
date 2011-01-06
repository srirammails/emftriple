package com.semweb.careers.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.ecore.EPackage;

import com.emftriple.ETriple;
import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.config.persistence.Federation;
import com.emftriple.config.persistence.PersistenceFactory;
import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.jena.JenaDataSourceFactory;
import com.emftriple.jena.JenaFile;
import com.emftriple.jena.JenaModule;
import com.emftriple.jena.JenaService;
import com.semweb.jobs.JOBPackage;

public class PersistenceHelper {

	private final static EntityManagerFactory emf;

	static {
		System.setProperty("http.proxyHost", "www-proxy.ericsson.se");
		System.setProperty("http.proxyPort", "8080");

		EPackage.Registry.INSTANCE.put(JOBPackage.eNS_URI, JOBPackage.eINSTANCE);

		PersistenceMetaData meta = PersistenceFactory.eINSTANCE.createPersistenceMetaData();
		PersistenceUnit unit = PersistenceFactory.eINSTANCE.createPersistenceUnit();
		unit.setName("jobs");
		unit.getPackage().add(JOBPackage.eNS_URI);

		Federation federation = PersistenceFactory.eINSTANCE.createFederation();

		DataSourceBuilder local = PersistenceFactory.eINSTANCE.createDataSourceBuilder();
		local.setClass(JenaFile.class.getName());
		local.setFactory(JenaDataSourceFactory.class.getName());
		local.setUrl("WebContent/data/data.ttl");
		local.setName("http://default");
		federation.getMember().add(local);

		DataSourceBuilder lod = PersistenceFactory.eINSTANCE.createDataSourceBuilder();
		lod.setClass(JenaService.class.getName());
		lod.setFactory(JenaDataSourceFactory.class.getName());
		lod.setUrl("http://lod.openlinksw.com/sparql"); //http://localhost:2020/dbpedia
		lod.setName("http://lod.openlinksw.com/sparql");
		federation.getMember().add(lod);

		unit.setDataSources(federation);
		meta.getPersistenceUnit().add(unit);

		ETriple.init(meta, new JenaModule());

		emf = ETriple.getInstance().getPersistenceProvider().createEntityManagerFactory("jobs", null);
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
