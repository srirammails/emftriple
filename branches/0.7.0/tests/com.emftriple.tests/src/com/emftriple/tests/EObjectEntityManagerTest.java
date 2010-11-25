package com.emftriple.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.junit.Before;
import org.junit.Test;

import com.emftriple.example.employee.Employee;
import com.emftriple.example.employee.EmployeePackage;
import com.emftriple.example.employee.Project;
import com.emftriple.resource.ETripleResource;

public class EObjectEntityManagerTest {

	EntityManager em;
	
	@Before
	public void tearUp() {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		em = emf.createEntityManager();
	}
	
//	@Test
	public void testGetReference() {
		String key = "http://www.example.com/employees/bob_smith";
		
		Employee emp = em.getReference(Employee.class, key);
		
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertTrue(((InternalEObject)emp).eIsProxy());
		assertTrue(((InternalEObject)emp).eProxyURI() != null);
		assertTrue(((InternalEObject)emp).eProxyURI().query().split("=")[1].equals(key));
	}
	
	@Test
	public void testFindEmployee() {
		String key = "http://www.example.com/employees/emanual_smith";
		
		em.getTransaction().begin();
		
		Employee emp = em.find(Employee.class, key);
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertFalse(((InternalEObject)emp).eIsProxy());
		
		System.out.println( emp.getProjects() );
		
		for (Project p: emp.getProjects()) {
			System.out.println(p.getName());
		}
		
		System.out.println( emp.getManager() );
		System.out.println( emp.getManager().getFirstName() );
		
		em.getTransaction().commit();
	}
}

