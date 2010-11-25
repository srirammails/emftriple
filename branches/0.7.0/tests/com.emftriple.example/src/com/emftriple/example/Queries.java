package com.emftriple.example;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.example.employee.Employee;
import com.emftriple.example.employee.EmployeePackage;
import com.emftriple.example.employee.Project;
import com.emftriple.example.employee.SmallProject;
import com.emftriple.resource.ETripleResource;

public class Queries {

	static {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, PersistencePackage.eINSTANCE);
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Queries queries = new Queries();
		queries.readAllEmployees(em);
		queries.readAllSmallProjects(em);
		queries.namedQuery(em);
		
		em.getTransaction().commit();
		em.close();
		
		emf.close();
	}

	public void loadResource() {
		Resource res = 
			new ETripleResource(
					URI.createURI("emftriple://unit=employee&?query=SELECT p FROM SmallProject p WHERE p.name = 'Enterprise'"));

		try {
			res.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			res.save(System.out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public List<?> namedQuery(EntityManager em) {
		System.out.println("execute named query");
		
		TypedQuery<Employee> q = em.createNamedQuery("findEmployeeByName", Employee.class);
		q.setParameter("first", "Betty");
		q.setParameter("last", "Jones");
		List<?> list = q.getResultList();
		
		assert list.size() == 1;
		
		System.out.println(list);
		
		return list;
	}
	
	public List<?> readAllEmployees(EntityManager em) {
		System.out.println("Reading all employees.");

		List<Employee> allEmployees = em.createQuery("SELECT e FROM Employee e", Employee.class)
			.setMaxResults(10)
			.getResultList();

		assert allEmployees != null;
		
		System.out.println("found " + allEmployees.size() + " employees");

		for (Employee e: allEmployees) 
		{
			System.out.println( e.getFirstName() );
			for (Project p: e.getProjects() ) 
			{
				System.out.println( "    > " + p.getName() );
			}
		}

		return allEmployees;
	}

	public List<?> readAllSmallProjects(EntityManager em) {
		System.out.println("Reading all projects.");

		TypedQuery<SmallProject> allProjects = em.createQuery("FROM SmallProject p", SmallProject.class);

		List<SmallProject> result = allProjects.getResultList();

		for (SmallProject p: result)
		{
			System.out.println(p.getName());
			String leader = p.getTeamLeader() == null ? "no one" : p.getTeamLeader().getFirstName();
			System.out.println("    lead by " + leader);
		}

		return result;
	}
}
