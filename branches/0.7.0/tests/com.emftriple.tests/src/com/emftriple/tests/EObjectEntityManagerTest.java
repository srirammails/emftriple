package com.emftriple.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

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

	EntityManagerFactory emf;
	
	@Before
	public void tearUp() {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		
		emf = Persistence.createEntityManagerFactory("employee");
	}
	
	@Test
	public void testGetReference() {
		EntityManager em = emf.createEntityManager();
		
		String key = "http://www.example.com/employees/bob_smith";
		
		Employee emp = em.getReference(Employee.class, key);
		
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertTrue(((InternalEObject)emp).eIsProxy());
		assertTrue(((InternalEObject)emp).eProxyURI() != null);
		assertTrue(((InternalEObject)emp).eProxyURI().query().split("=")[1].equals(key));
		
		em.clear();
	}
	
	@Test
	public void testFindEmployee() {
		EntityManager em = emf.createEntityManager();
		
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
		em.clear();
	}
	
	@Test
	public void testBrowse() throws IOException {
		EntityManager em = emf.createEntityManager();
		
		String key = "http://www.example.com/employees/emanual_smith";
		
		em.getTransaction().begin();
		
		Employee emp = em.find(Employee.class, key);
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertFalse(((InternalEObject)emp).eIsProxy());
		
		System.out.println( emp.getFirstName() );
		
		for (Project p: emp.getProjects()) {
			System.out.println(p.getName());
		}
		
		System.out.println( emp.getManager() );
		System.out.println( emp.getManager().getFirstName() );
		
		for (Project p: emp.getManager().getProjects()) {
			System.out.println(p.getName());
		}

		emp.eResource().save(System.out, null);
		
		em.getTransaction().commit();
		em.clear();
	}
	
	@Test
	public void testRefreshProxyObject() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String key = "http://www.example.com/employees/emanual_smith";
		
		Employee emp = em.getReference(Employee.class, key);
		
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertTrue(((InternalEObject)emp).eIsProxy());
		assertTrue(emp.getFirstName() == null);
		
		em.refresh(emp);
		
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertFalse(((InternalEObject)emp).eIsProxy());
		assertFalse(emp.getFirstName() == null);
		
		em.getTransaction().commit();
		
		try {
			emp.eResource().save(System.out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		em.clear();
		em.close();
	}
}

