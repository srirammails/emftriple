package com.emftriple.example;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emftriple.example.employee.Address;
import com.emftriple.example.employee.EmailAddress;
import com.emftriple.example.employee.Employee;
import com.emftriple.example.employee.EmployeeFactory;
import com.emftriple.example.employee.EmployeePackage;
import com.emftriple.example.employee.EmploymentPeriod;
import com.emftriple.example.employee.Gender;
import com.emftriple.example.employee.JobTitle;
import com.emftriple.example.employee.LargeProject;
import com.emftriple.example.employee.Organization;
import com.emftriple.example.employee.PhoneNumber;
import com.emftriple.example.employee.Project;
import com.emftriple.example.employee.SmallProject;

public class Populate {

	static {
		EPackage.Registry.INSTANCE.put(EmployeePackage.eNS_URI, EmployeePackage.eINSTANCE);
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		populate(emf);		
				
		emf.close();
	}

	public static void populate(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Populate.population.persistAll(em);
		
		em.getTransaction().commit();
		em.close();
	}

	public static final Populate population = new Populate();

	public Employee[] employees = { 
			basicEmployeeExample1(), 
			basicEmployeeExample2(), 
			basicEmployeeExample3(), 
			basicEmployeeExample4(), 
			basicEmployeeExample5(), 
			basicEmployeeExample6(),
			basicEmployeeExample7(), 
			basicEmployeeExample8(), 
			basicEmployeeExample9(), 
			basicEmployeeExample10(),
			basicEmployeeExample11(), 
			basicEmployeeExample12(),
			basicEmployeeExample13(),
			basicEmployeeExample14(),
			basicEmployeeExample15()
	};

	private SmallProject[] smallProjects = { 
			basicSmallProjectExample1(), 
			basicSmallProjectExample2(), 
			basicSmallProjectExample3(), 
			basicSmallProjectExample4(), 
			basicSmallProjectExample5(),
			basicSmallProjectExample6(),
			basicSmallProjectExample7(), 
			basicSmallProjectExample8(), 
			basicSmallProjectExample9(), 
			basicSmallProjectExample10() };

	private LargeProject[] largeProjects = { 
			basicLargeProjectExample1(), 
			basicLargeProjectExample2(),
			basicLargeProjectExample3(), 
			basicLargeProjectExample4(),
			basicLargeProjectExample5() };

	private JobTitle[] jobTitles = { 
			createJobTitle("CEO"), 
			createJobTitle("VP"), 
			createJobTitle("Manager"), 
			createJobTitle("Developer"), 
			createJobTitle("Admin") };

	private JobTitle createJobTitle(String title) {
		JobTitle job = EmployeeFactory.eINSTANCE.createJobTitle();
		job.setTitle(title);
		return job;
	}

	private Populate() {

		// Setup management hierarchy
		addManagedEmployees(0, new int[] { 2, 3, 4 });
		setJobTitle(0, 2);
		addManagedEmployees(1, new int[] { 5, 0 });
		setJobTitle(1, 2);
		addManagedEmployees(2, new int[] {});
		setJobTitle(0, 3);
		addManagedEmployees(3, new int[] {});
		setJobTitle(0, 3);
		addManagedEmployees(4, new int[] {});
		setJobTitle(0, 3);
		addManagedEmployees(5, new int[] {});
		setJobTitle(5, 4);
		addManagedEmployees(6, new int[] {});
		setJobTitle(6, 4);
		addManagedEmployees(7, new int[] {});
		setJobTitle(7, 1);
		addManagedEmployees(8, new int[] {});
		setJobTitle(8, 4);
		addManagedEmployees(9, new int[] { 7, 8, 10, 11 });
		setJobTitle(9, 0);
		addManagedEmployees(10, new int[] { 6 });
		setJobTitle(10, 1);
		addManagedEmployees(11, new int[] { 1 });
		setJobTitle(11, 1);

		// Setup Employee-Project associations
		addProjects(0, new int[] { 0, 1, 2 }, new int[] {});
		addProjects(1, new int[] { 3, 4, 0 }, new int[] {});
		addProjects(2, new int[] { 3 }, new int[] { 3, 4 });
		addProjects(4, new int[] { 3, 1 }, new int[] { 2, 4 });
		addProjects(5, new int[] {}, new int[] { 1 });
		addProjects(6, new int[] {}, new int[] { 1 });

		// Setup LargeProject leads
		this.largeProjects[0].setTeamLeader(this.employees[1]);
		this.largeProjects[3].setTeamLeader(this.employees[2]);
		this.largeProjects[4].setTeamLeader(this.employees[2]);
	}

	private Date createEDate(String dateFormat) {
		return (Date) EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), dateFormat);
	}

	private PhoneNumber createPhone(String type, String code, String number) {
		PhoneNumber phone = EmployeeFactory.eINSTANCE.createPhoneNumber();
		phone.setNumber(number);
		phone.setAreaCode(code); 
		phone.setType(type);

		return phone;
	}

	private EmailAddress createMail(String string, String string2, int id) {
		EmailAddress mail = EmployeeFactory.eINSTANCE.createEmailAddress();
		mail.setName(string);
		mail.setAddress(string2);
		mail.setId(id);

		return mail;
	}

	public Employee basicEmployeeExample1() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Bob");
		employee.setLastName("Smith");
		employee.setGender(Gender.MALE);
		employee.setSalary(35000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(1);
		employmentPeriod.setEndDate(createEDate("1996-01-01"));
		employmentPeriod.setStartDate(createEDate("1993-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(1);
		address.setCity("Toronto");
		address.setPostalCode("L5J2B5");
		address.setProvince("ONT");
		address.setStreet("1450 Acme Cr., Suite 4");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Water the office plants.");
		employee.getResponsibilities().add("Maintain the kitchen facilities.");

		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));

		return employee;
	}

	public Employee basicEmployeeExample2() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

//		employee.setId(2);
		employee.setFirstName("John");
		employee.setLastName("Way");
		employee.setGender(Gender.MALE);
		employee.setSalary(53000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(2);
		employmentPeriod.setStartDate(createEDate("1991-10-11"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(2);
		address.setCity("Ottawa");
		address.setPostalCode("K5J2B5");
		address.setProvince("ONT");
		address.setStreet("12 Merivale Rd., Suite 5");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Hire people when more people are required.");
		employee.getResponsibilities().add("Lay off employees when less people are required.");
		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getEmailAddresses().add(createMail("Work", "john.way@acme.com", 2));

		return employee;
	}

	public Employee basicEmployeeExample3() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

//		employee.setId(3);
		employee.setFirstName("Charles");
		employee.setLastName("Chanley");
		employee.setGender(Gender.MALE);
		employee.setSalary(43000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(3);
		employmentPeriod.setEndDate(createEDate("2001-11-31"));
		employmentPeriod.setStartDate(createEDate("1995-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(3);
		address.setCity("Montreal");
		address.setPostalCode("Q2S5Z5");
		address.setProvince("QUE");
		address.setStreet("1 Canadien Place");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Perform code reviews as required.");
		employee.getPhoneNumbers().add(createPhone("Pager", "976", "5556666"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getEmailAddresses().add(createMail("Work", "charles.chanley@acme.com", 3));

		return employee;
	}

	public Employee basicEmployeeExample4() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Emanual");
		employee.setLastName("Smith");
		employee.setGender(Gender.MALE);
		employee.setSalary(49631);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(4);
		employmentPeriod.setEndDate(createEDate("2001-11-31"));
		employmentPeriod.setStartDate(createEDate("1995-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(4);
		address.setCity("Vancouver");
		address.setPostalCode("N5J2N5");
		address.setProvince("BC");
		address.setStreet("20 Mountain Blvd., Floor 53, Suite 6");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Have to fix the Database problem.");
		employee.getPhoneNumbers().add(createPhone("Work Fax", "613", "5555943"));
		employee.getPhoneNumbers().add(createPhone("Cellular", "416", "5551111"));
		employee.getPhoneNumbers().add(createPhone("Pager", "976", "5556666"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getEmailAddresses().add(createMail("Work", "emanual.smith@acme.com", 4));

		return employee;
	}

	public Employee basicEmployeeExample5() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Sarah");
		employee.setLastName("Way");
		employee.setGender(Gender.FEMALE);
		employee.setSalary(87000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(5);
		employmentPeriod.setEndDate(createEDate("2001-06-31"));
		employmentPeriod.setStartDate(createEDate("1995-04-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(5);
		address.setCity("Prince Rupert");
		address.setPostalCode("K3K5D5");
		address.setProvince("BC");
		address.setStreet("3254 Parkway Place");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Write code documentation.");
		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getPhoneNumbers().add(createPhone("Home", "613", "5551234"));
		employee.getEmailAddresses().add(createMail("Work", "sarah.way@acme.com", 5));

		return employee;
	}

	public Employee basicEmployeeExample6() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Marcus");
		employee.setLastName("Saunders");
		employee.setGender(Gender.MALE);
		employee.setSalary(54300);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(6);
		employmentPeriod.setEndDate(createEDate("2001-11-31"));
		employmentPeriod.setStartDate(createEDate("1995-01-12"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(6);
		address.setCity("Perth");
		address.setPostalCode("Y3Q2N9");
		address.setProvince("ONT");
		address.setStreet("234 Caledonia Lane");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getResponsibilities().add("Write user specifications.");
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));
		employee.getEmailAddresses().add(createMail("Work", "marcus.saunders@acme.com", 6));

		return employee;
	}

	public Employee basicEmployeeExample7() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Nancy");
		employee.setLastName("White");
		employee.setGender(Gender.FEMALE);
		employee.setSalary(31000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(7);
		employmentPeriod.setEndDate(createEDate("1996-01-01"));
		employmentPeriod.setStartDate(createEDate("1993-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(7);
		address.setCity("Metcalfe");
		address.setPostalCode("Y4F7V6");
		address.setProvince("ONT");
		address.setStreet("2 Anderson Rd.");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getPhoneNumbers().add(createPhone("Home", "613", "5551234"));
		employee.getEmailAddresses().add(createMail("Work", "nancy.white@acme.com", 7));

		return employee;
	}

	public Employee basicEmployeeExample8() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Fred");
		employee.setLastName("Jones");
		employee.setGender(Gender.MALE);
		employee.setSalary(500000);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(8);
		employmentPeriod.setEndDate(createEDate("2001-11-31"));
		employmentPeriod.setStartDate(createEDate("1995-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(8);
		address.setCity("Victoria");
		address.setPostalCode("Z5J2N5");
		address.setProvince("BC");
		address.setStreet("382 Hyde Park Blvd.");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getPhoneNumbers().add(createPhone("Cellular", "416", "5551111"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getEmailAddresses().add(createMail("Work", "fred.jones@acme.com", 8));

		return employee;
	}

	public Employee basicEmployeeExample9() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Betty");
		employee.setLastName("Jones");
		employee.setGender(Gender.FEMALE);
		employee.setSalary(500001);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(9);
		employmentPeriod.setStartDate(createEDate("2001-11-31"));
		employmentPeriod.setEndDate(createEDate("1995-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(9);
		address.setCity("Smith Falls");
		address.setPostalCode("C6C6C6");
		address.setProvince("ONT");
		address.setStreet("89 Chocolate Drive");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));
		employee.getPhoneNumbers().add(createPhone("ISDN", "905", "5553691"));
		employee.getEmailAddresses().add(createMail("Work", "betty.jones@acme.com", 9));
		employee.getEmailAddresses().add(createMail("Home", "betty.cleo.jones@rogers.com", 10));

		return employee;
	}

	public Employee basicEmployeeExample10() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Jill");
		employee.setLastName("May");
		employee.setGender(Gender.FEMALE);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(10);
		employmentPeriod.setStartDate(createEDate("1991-10-11"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(10);
		address.setCity("Calgary");
		address.setPostalCode("J5J2B5");
		address.setProvince("AB");
		address.setStreet("1111 Mooseland Rd.");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.setSalary(56232);
		employee.getPhoneNumbers().add(createPhone("Work", "613", "5558812"));
		employee.getPhoneNumbers().add(createPhone("Work Fax", "613", "5555943"));
		employee.getEmailAddresses().add(createMail("Work", "jill.may@acme.com", 11));
		employee.getEmailAddresses().add(createMail("Mobile", "jill.lewis.may@sprint.com", 12));

		return employee;
	}

	public Employee basicEmployeeExample11() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Sarah-Lou");
		employee.setLastName("Smitty");
		employee.setGender(Gender.FEMALE);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(11);
		employmentPeriod.setEndDate(createEDate("1996-01-01"));
		employmentPeriod.setStartDate(createEDate("1993-01-01"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(11);
		address.setCity("Arnprior");
		address.setPostalCode("W1A2B5");
		address.setProvince("ONT");
		address.setStreet("1 Hawthorne Drive");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.setSalary(75000);
		employee.getPhoneNumbers().add(createPhone("Work Fax", "613", "5555943"));
		employee.getPhoneNumbers().add(createPhone("Home", "613", "5551234"));
		employee.getPhoneNumbers().add(createPhone("Cellular", "416", "5551111"));
		employee.getEmailAddresses().add(createMail("Home", "sarah-lou.smitty@rogers.com", 13));

		return employee;
	}

	public Employee basicEmployeeExample12() {
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();

		employee.setFirstName("Jim-Bob");
		employee.setLastName("Jefferson");
		employee.setGender(Gender.MALE);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(12);
		employmentPeriod.setEndDate(createEDate("2001-11-31"));
		employmentPeriod.setStartDate(createEDate("1995-01-12"));
		employee.setPeriod(employmentPeriod);

		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(12);
		address.setCity("Yellowknife");
		address.setPostalCode("Y5J2N5");
		address.setProvince("YK");
		address.setStreet("1112 Gold Rush Rd.");
		address.setCountry("Canada");
		employee.setAddress(address);

		employee.setSalary(50000);
		employee.getPhoneNumbers().add(createPhone("Home", "613", "5551234"));
		employee.getPhoneNumbers().add(createPhone("Cellular", "416", "5551111"));
		employee.getEmailAddresses().add(createMail("Home", "jim-bob@jim-bob.com", 14));

		return employee;
	}
	
	private Employee basicEmployeeExample13() {	
		return basicEmployeeExample(13, "John", "Smith", Gender.MALE, "2004-11-31", null, 45000, 
				createAddress(134, "CityLand", "4833", "Westmeath", "34, street of Bel Air", "Ireland"), 
				new EmailAddress[]{createMail("work", "john.smith@foo.bar", 15)}, 
				new PhoneNumber[]{createPhone("mobile", "435", "43235563")});
	}
	
	private Employee basicEmployeeExample14() {	
		return basicEmployeeExample(14, "Gill", "Williams", Gender.FEMALE, "2002-09-21", null, 65000, 
				createAddress(144, "Waste", "4343", "Stock", "12, av wonderland", "Colombia"), 
				new EmailAddress[]{createMail("work", "gill.williams@gggg.com", 16)}, 
				new PhoneNumber[]{createPhone("mobile", "232", "56364212")});
	}
	
	private Employee basicEmployeeExample15() {	
		return basicEmployeeExample(15, "Paul", "Smith", Gender.MALE, "2001-04-31", null, 45000, 
				createAddress(134, "CityLand", "3833", "Westmeath", "33, street of Bel Air", "Ireland"), 
				new EmailAddress[]{createMail("work", "paul.smith@foo.bar", 17)}, 
				new PhoneNumber[]{createPhone("mobile", "432", "4689563")});
	}

	public Address createAddress(int id, String city, String code, String province, String street, String country) {
		Address address = EmployeeFactory.eINSTANCE.createAddress();
		address.setId(id);
		address.setCity(city);
		address.setPostalCode(code);
		address.setProvince(province);
		address.setStreet(street);
		address.setCountry(country);

		return address;
	}

	public Employee basicEmployeeExample(
			int id, String fname, String lname, Gender gender, String start, String end, double salary, 
			Address address, EmailAddress[] mails, PhoneNumber[] phones) 
	{
		Employee employee = EmployeeFactory.eINSTANCE.createEmployee();
		employee.setFirstName(fname);
		employee.setLastName(lname);
		employee.setGender(gender);

		EmploymentPeriod employmentPeriod = EmployeeFactory.eINSTANCE.createEmploymentPeriod();
		employmentPeriod.setId(id + 111);
		employmentPeriod.setEndDate(createEDate(start));
		employmentPeriod.setStartDate(createEDate(end));
		employee.setPeriod(employmentPeriod);
		employee.setAddress(address);
		
		employee.setSalary(salary);
		employee.getPhoneNumbers().addAll(Arrays.asList(phones));
		employee.getEmailAddresses().addAll(Arrays.asList(mails));

		return employee;
	}

	public LargeProject basicLargeProjectExample1() {
		LargeProject largeProject = EmployeeFactory.eINSTANCE.createLargeProject();

		largeProject.setName("Sales Reporting");
		largeProject.setDescription("A reporting application to report on the corporations database through TopLink.");
		largeProject.setBudget((double) 5000);
		largeProject.setMilestone(createEDate("1991-10-11:12-00-00"));
		largeProject.setTeamLeader(employees[14]);
		
		return largeProject;
	}

	public LargeProject basicLargeProjectExample2() {
		LargeProject largeProject = EmployeeFactory.eINSTANCE.createLargeProject();

		largeProject.setName("Light Reporter");
		largeProject.setDescription("A lightweight application to report on the corporations database through TopLink.");
		largeProject.setBudget(100.98);
		largeProject.setMilestone(createEDate("1999-11-25:11-40-44"));
		largeProject.setTeamLeader(employees[13]);
		
		return largeProject;
	}

	public LargeProject basicLargeProjectExample3() {
		LargeProject largeProject = EmployeeFactory.eINSTANCE.createLargeProject();

		largeProject.setName("TOPEmployee Management");
		largeProject.setDescription("A management application to report on the corporations database through TopLink.");
		largeProject.setBudget(4000.98);
		largeProject.setMilestone(createEDate("1997-10-12:01-00-00"));
		largeProject.setTeamLeader(employees[14]);
		
		return largeProject;
	}

	public LargeProject basicLargeProjectExample4() {
		LargeProject largeProject = EmployeeFactory.eINSTANCE.createLargeProject();

		largeProject.setName("Enterprise System");
		largeProject.setDescription("A enterprise wide application to report on the corporations database through TopLink.");
		largeProject.setBudget(40.98);
		largeProject.setMilestone(createEDate("1996-08-06:06-40-44"));
		largeProject.setTeamLeader(employees[12]);
		
		return largeProject;
	}

	public LargeProject basicLargeProjectExample5() {
		LargeProject largeProject = EmployeeFactory.eINSTANCE.createLargeProject();

		largeProject.setName("Problem Reporting System");
		largeProject.setDescription("A PRS application to report on the corporations database through TopLink.");
		largeProject.setBudget(101.98);
		largeProject.setMilestone(createEDate("1997-09-06:01-40-44"));
		largeProject.setTeamLeader(employees[11]);
		
		return largeProject;
	}

	public SmallProject basicSmallProjectExample1() {
		return createSmall("Enterprise", "A enterprise wide application to report on the corporations database through TopLink.", 21, employees[2]);
	}

	public SmallProject basicSmallProjectExample10() {
		return createSmall("Staff Query Tool", "A tool to help staff query various things.", 22, employees[1]);
	}

	public SmallProject basicSmallProjectExample2() {
		return createSmall("Sales Reporter", "A reporting application using JDK to report on the corporations database through TopLink.", 23, employees[4]);
	}

	public SmallProject basicSmallProjectExample3() {
		return createSmall("TOP-Employee Manager", "A management application to report on the corporations database through TopLink.", 24, employees[2]);
	}

	public SmallProject basicSmallProjectExample4() {
		return createSmall("Problem Reporter", "A PRS application to report on the corporations database through TopLink.", 25, employees[6]);
	}

	public SmallProject basicSmallProjectExample5() {
		return createSmall("Feather Reporter", "An extremely lightweight application to report on the corporations database through TopLink.", 26, employees[8]);
	}

	public SmallProject basicSmallProjectExample6() {
		return createSmall("Makework", "A makework project.", 27, employees[9]);
	}

	public SmallProject basicSmallProjectExample7() {
		return createSmall("Marketing Query Tool", "A tool to help marketing query various things.", 28, employees[4]);
	}

	public SmallProject basicSmallProjectExample8() {
		return createSmall("Shipping Query Tool", "A tool to help shipping query various things.", 29, employees[10]);
	}

	public SmallProject basicSmallProjectExample9() {
		return createSmall("Accounting Query Tool", "A tool to help accounting query various things.", 291, employees[11]);
	}

	private SmallProject createSmall(String string, String string2, int id) {
		SmallProject proj = EmployeeFactory.eINSTANCE.createSmallProject();
		proj.setName(string);
		proj.setDescription(string2);
		
		return proj;
	}

	private SmallProject createSmall(String string, String string2, int id,Employee employee) {
		SmallProject proj = createSmall(string, string2, id);
		proj.setTeamLeader(employee);

		return proj;
	}

	private void addManagedEmployees(int managerIndex, int[] employeeIndeces) {
		Employee manager = this.employees[managerIndex];

		if (manager.getManagedEmployees().isEmpty()) {
			for (int index = 0; index < employeeIndeces.length; index++) {
				manager.getManagedEmployees().add(this.employees[employeeIndeces[index]]);
			}
		}
	}

	private void setJobTitle(int employeeIndex, int jobIndex) {
		Employee employee = this.employees[employeeIndex];

		employee.setJobTitle(this.jobTitles[jobIndex]);
	}

	private void addProjects(int empIndex, int[] smallProjIndeces, int[] largeProjIndeces) {
		Employee employee = this.employees[empIndex];

		for (int index = 0; index < smallProjIndeces.length; index++) {
			employee.getProjects().add(this.smallProjects[smallProjIndeces[index]]);
		}

		for (int index = 0; index < largeProjIndeces.length; index++) {
			employee.getProjects().add(this.largeProjects[largeProjIndeces[index]]);
		}
	}

	/**
	 * Register all of the population in the provided EntityManager to be
	 * persisted This method should only be called from within a test case. It
	 * asserts that the provided EntityManager is in a transaction and that the
	 * database tables are empty.
	 */
	public void persistAll(EntityManager em) {
		System.out.println("Persisting samples objects.");

		assert(em.getTransaction().isActive());

		Organization acme = EmployeeFactory.eINSTANCE.createOrganization();
		acme.setName("Acme");
		
		for (int index = 0; index < this.jobTitles.length; index++) {
			acme.getJobs().add(this.jobTitles[index]);
		}
		for (int index = 0; index < this.employees.length; index++) {
			acme.getEmployees().add(this.employees[index]);
		}
		for (int index = 0; index < this.smallProjects.length; index++) {
			acme.getProjects().add(this.smallProjects[index]);
		}
		for (int index = 0; index < this.largeProjects.length; index++) {
			acme.getProjects().add(this.largeProjects[index]);
		}

		em.persist(acme);
		
		System.out.println("Flushing to database.");
		em.flush();

//		System.out.println("Verifying populate.");
//		verifyCounts(em);
	}

	public void verifyCounts(EntityManager em) {
		assertCount(em, Employee.class, this.employees.length);
		assertCount(em, Address.class, this.employees.length);
		assertCount(em, Project.class, this.smallProjects.length + this.largeProjects.length);
		assertCount(em, JobTitle.class, this.jobTitles.length);
	}

	/**
	 * 
	 * @param entityClass
	 * @param count
	 */
	public void assertCount(EntityManager em, Class<?> entityClass, int count) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<?> criteria = cb.createQuery();
		Root<?> entity = criteria.from(entityClass);
		criteria.multiselect( cb.count(entity) );
		Query query = em.createQuery(criteria);

		Long dbCount = (Long)query.getSingleResult();
		assert(count == dbCount.intValue());
	}
}
