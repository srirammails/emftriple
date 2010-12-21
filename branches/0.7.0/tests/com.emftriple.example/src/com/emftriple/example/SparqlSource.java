package com.emftriple.example;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.resource.impl.TTLResource;
import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceManager;
import com.emftriple.example.employee.EmployeePackage;

public class SparqlSource {
	static {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, PersistencePackage.eINSTANCE);
	}
	
	public static void main(String[] args) throws IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		DataSource ds = ((DataSourceManager)em.getDelegate()).getDefaultDataSource();
		
		TTLResource resource = new TTLResource(URI.createURI("src/out.ttl"));
		
		RDFGraph aGraph = 
			ds.constructQuery("CONSTRUCT { ?s ?p ?o } WHERE { ?s ?p ?o }");
		
		resource.getContents().add(aGraph);
		aGraph.eResource().save(System.out, null);
	}
}
