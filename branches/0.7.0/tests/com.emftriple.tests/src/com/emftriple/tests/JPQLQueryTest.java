package com.emftriple.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Before;
import org.junit.Test;

import com.emftriple.employee.Employee;
import com.emftriple.employee.EmployeePackage;

public class JPQLQueryTest {
	EntityManagerFactory emf;
	
	@Before
	public void tearUp() {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
		
		emf = Persistence.createEntityManagerFactory("employee");
	}
	
	@Test
	public void testSimpleFromQuery() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		List<Employee> all = 
			em.createQuery("select e from Employee e", Employee.class)
			.getResultList();
		
		em.getTransaction().commit();
		
		assertEquals(all.size(), 15);
	}
	
	@Test
	public void testSelectEmployeeByName() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee bob = 
			em.createQuery("select e from Employee e where e.firstName = :name", Employee.class)
			.setParameter("name", "Bob")
			.getSingleResult();
		
		em.getTransaction().commit();
		
		assertNotNull(bob);
		assertEquals("Bob", bob.getFirstName());
	}
}
