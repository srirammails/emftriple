package com.emftriple.example;

import static com.emftriple.query.SparqlBuilder.getConstructQuery;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EPackage;

import com.emf4sw.rdf.RDFGraph;
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
		
		RDFGraph aGraph = 
			ds.constructQuery(getConstructQuery("CONSTRUCT { ?s ?p ?o } WHERE { ?s ?p ?o }"));
		
		aGraph.eResource().save(System.out, null);
	}
}
