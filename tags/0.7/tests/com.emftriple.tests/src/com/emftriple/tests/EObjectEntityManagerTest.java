package com.emftriple.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Before;
import org.junit.Test;

import com.emftriple.ETriple;
import com.emftriple.employee.Employee;
import com.emftriple.employee.EmployeePackage;
import com.emftriple.employee.Project;
import com.emftriple.jena.JenaModule;
import com.emftriple.resource.ETripleResource;

public class EObjectEntityManagerTest {

	EntityManagerFactory emf;
	
	@Before
	public void tearUp() {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		ETriple.init(new JenaModule());
		
		emf = Persistence.createEntityManagerFactory("employee");
	}
	
	@Test
	public void testGetReference() {
		System.out.println("----------------------------");
		System.out.println("start test 1");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		String key = "http://www.example.com/employees/1";
		
		Employee emp = em.getReference(Employee.class, key);
		
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertTrue(((InternalEObject)emp).eIsProxy());
		assertTrue(((InternalEObject)emp).eProxyURI() != null);
		
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.out.println("end test 1");
		System.out.println("----------------------------");
	}
	
	@Test
	public void testFindEmployee() {
		System.out.println("----------------------------");
		System.out.println("start test 2");
		EntityManager em = emf.createEntityManager();
		
		String key = "http://www.example.com/employees/2";
		
		em.getTransaction().begin();
		
		Employee emp = em.find(Employee.class, key);
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertFalse(((InternalEObject)emp).eIsProxy());
		
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.out.println("end test 2");
		System.out.println("----------------------------");
	}
	
	@Test
	public void testBrowse() throws IOException {
		System.out.println("----------------------------");
		System.out.println("start test 3");
		EntityManager em = emf.createEntityManager();
		
		String key = "http://www.example.com/employees/2";
		
		em.getTransaction().begin();
		
		Employee emp = em.find(Employee.class, key);
		assertTrue(emp instanceof EObject);
		assertTrue(emp.eResource() instanceof ETripleResource);
		assertFalse(((InternalEObject)emp).eIsProxy());
		
		System.out.println( emp.getFirstName() );
		
		for (Project p: emp.getProjects()) {
			System.out.println(p.getName());
		}
		
		System.out.println( emp.getManagedEmployees() );
		for (Employee e: emp.getManagedEmployees()) {
			System.out.println("    " + e.getFirstName());
		}

		System.out.println( emp.eResource().getURI() );
		
		Resource res = new XMIResourceImpl();
		res.getContents().add(emp);
//		res.getContents().addAll(emp.getProjects());
		res.getContents().addAll(emp.getManagedEmployees());
		res.save(System.out, null);
		
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.out.println("end test 3");
		System.out.println("----------------------------");
	}
	
	@Test
	public void testRefreshProxyObject() {
		System.out.println("----------------------------");
		System.out.println("start test 4");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String key = "http://www.example.com/employees/2";
		
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
		
//		try {
//			emp.eResource().save(System.out, null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.out.println("end test 4");
		System.out.println("----------------------------");
	}
	
//	@Test
	public void testCreateNativeQuery() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		@SuppressWarnings("unchecked")
		List<Employee> all = em.createNativeQuery("select ?e where { ?e a <http://www.example.com/Employee#Employee> }", Employee.class)
//		.setParameter("type", "<" + EntityUtil.getEntityURI(EmployeePackage.eINSTANCE.getEmployee()) + ">")
		.getResultList();
		
		System.out.println(all.size());
		
		em.getTransaction().commit();
	}
}

