/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee.impl;

import com.emftriple.example.employee.Address;
import com.emftriple.example.employee.Degree;
import com.emftriple.example.employee.EmailAddress;
import com.emftriple.example.employee.Employee;
import com.emftriple.example.employee.EmployeePackage;
import com.emftriple.example.employee.EmploymentPeriod;
import com.emftriple.example.employee.Gender;
import com.emftriple.example.employee.JobTitle;
import com.emftriple.example.employee.PhoneNumber;
import com.emftriple.example.employee.Project;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getJobTitle <em>Job Title</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getManagedEmployees <em>Managed Employees</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.EmployeeImpl#getEmailAddresses <em>Email Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected double salary = SALARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected long version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> responsibilities;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected EmploymentPeriod period;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getJobTitle() <em>Job Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTitle()
	 * @generated
	 * @ordered
	 */
	protected JobTitle jobTitle;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Employee manager;

	/**
	 * The cached value of the '{@link #getManagedEmployees() <em>Managed Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> managedEmployees;

	/**
	 * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PhoneNumber> phoneNumbers;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Degree> degrees;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getEmailAddresses() <em>Email Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailAddress> emailAddresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmployeePackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(long newVersion) {
		long oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getResponsibilities() {
		if (responsibilities == null) {
			responsibilities = new EDataTypeUniqueEList<String>(String.class, this, EmployeePackage.EMPLOYEE__RESPONSIBILITIES);
		}
		return responsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmploymentPeriod getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(EmploymentPeriod newPeriod, NotificationChain msgs) {
		EmploymentPeriod oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(EmploymentPeriod newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmployeePackage.EMPLOYEE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmployeePackage.EMPLOYEE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmployeePackage.EMPLOYEE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmployeePackage.EMPLOYEE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTitle getJobTitle() {
		if (jobTitle != null && jobTitle.eIsProxy()) {
			InternalEObject oldJobTitle = (InternalEObject)jobTitle;
			jobTitle = (JobTitle)eResolveProxy(oldJobTitle);
			if (jobTitle != oldJobTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmployeePackage.EMPLOYEE__JOB_TITLE, oldJobTitle, jobTitle));
			}
		}
		return jobTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTitle basicGetJobTitle() {
		return jobTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobTitle(JobTitle newJobTitle) {
		JobTitle oldJobTitle = jobTitle;
		jobTitle = newJobTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__JOB_TITLE, oldJobTitle, jobTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Employee)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmployeePackage.EMPLOYEE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Employee newManager, NotificationChain msgs) {
		Employee oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Employee newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES, Employee.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES, Employee.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getManagedEmployees() {
		if (managedEmployees == null) {
			managedEmployees = new EObjectWithInverseResolvingEList<Employee>(Employee.class, this, EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES, EmployeePackage.EMPLOYEE__MANAGER);
		}
		return managedEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhoneNumber> getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new EObjectContainmentWithInverseEList<PhoneNumber>(PhoneNumber.class, this, EmployeePackage.EMPLOYEE__PHONE_NUMBERS, EmployeePackage.PHONE_NUMBER__OWNER);
		}
		return phoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Degree> getDegrees() {
		if (degrees == null) {
			degrees = new EObjectResolvingEList<Degree>(Degree.class, this, EmployeePackage.EMPLOYEE__DEGREES);
		}
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<Project>(Project.class, this, EmployeePackage.EMPLOYEE__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmailAddress> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new EObjectContainmentEList<EmailAddress>(EmailAddress.class, this, EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES);
		}
		return emailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES, Employee.class, msgs);
				return basicSetManager((Employee)otherEnd, msgs);
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManagedEmployees()).basicAdd(otherEnd, msgs);
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhoneNumbers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__PERIOD:
				return basicSetPeriod(null, msgs);
			case EmployeePackage.EMPLOYEE__ADDRESS:
				return basicSetAddress(null, msgs);
			case EmployeePackage.EMPLOYEE__MANAGER:
				return basicSetManager(null, msgs);
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				return ((InternalEList<?>)getManagedEmployees()).basicRemove(otherEnd, msgs);
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				return ((InternalEList<?>)getPhoneNumbers()).basicRemove(otherEnd, msgs);
			case EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES:
				return ((InternalEList<?>)getEmailAddresses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__FIRST_NAME:
				return getFirstName();
			case EmployeePackage.EMPLOYEE__LAST_NAME:
				return getLastName();
			case EmployeePackage.EMPLOYEE__GENDER:
				return getGender();
			case EmployeePackage.EMPLOYEE__SALARY:
				return getSalary();
			case EmployeePackage.EMPLOYEE__VERSION:
				return getVersion();
			case EmployeePackage.EMPLOYEE__RESPONSIBILITIES:
				return getResponsibilities();
			case EmployeePackage.EMPLOYEE__PERIOD:
				return getPeriod();
			case EmployeePackage.EMPLOYEE__ADDRESS:
				return getAddress();
			case EmployeePackage.EMPLOYEE__JOB_TITLE:
				if (resolve) return getJobTitle();
				return basicGetJobTitle();
			case EmployeePackage.EMPLOYEE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				return getManagedEmployees();
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				return getPhoneNumbers();
			case EmployeePackage.EMPLOYEE__DEGREES:
				return getDegrees();
			case EmployeePackage.EMPLOYEE__PROJECTS:
				return getProjects();
			case EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES:
				return getEmailAddresses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case EmployeePackage.EMPLOYEE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case EmployeePackage.EMPLOYEE__GENDER:
				setGender((Gender)newValue);
				return;
			case EmployeePackage.EMPLOYEE__SALARY:
				setSalary((Double)newValue);
				return;
			case EmployeePackage.EMPLOYEE__VERSION:
				setVersion((Long)newValue);
				return;
			case EmployeePackage.EMPLOYEE__RESPONSIBILITIES:
				getResponsibilities().clear();
				getResponsibilities().addAll((Collection<? extends String>)newValue);
				return;
			case EmployeePackage.EMPLOYEE__PERIOD:
				setPeriod((EmploymentPeriod)newValue);
				return;
			case EmployeePackage.EMPLOYEE__ADDRESS:
				setAddress((Address)newValue);
				return;
			case EmployeePackage.EMPLOYEE__JOB_TITLE:
				setJobTitle((JobTitle)newValue);
				return;
			case EmployeePackage.EMPLOYEE__MANAGER:
				setManager((Employee)newValue);
				return;
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				getManagedEmployees().clear();
				getManagedEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				getPhoneNumbers().addAll((Collection<? extends PhoneNumber>)newValue);
				return;
			case EmployeePackage.EMPLOYEE__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends Degree>)newValue);
				return;
			case EmployeePackage.EMPLOYEE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES:
				getEmailAddresses().clear();
				getEmailAddresses().addAll((Collection<? extends EmailAddress>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__SALARY:
				setSalary(SALARY_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__RESPONSIBILITIES:
				getResponsibilities().clear();
				return;
			case EmployeePackage.EMPLOYEE__PERIOD:
				setPeriod((EmploymentPeriod)null);
				return;
			case EmployeePackage.EMPLOYEE__ADDRESS:
				setAddress((Address)null);
				return;
			case EmployeePackage.EMPLOYEE__JOB_TITLE:
				setJobTitle((JobTitle)null);
				return;
			case EmployeePackage.EMPLOYEE__MANAGER:
				setManager((Employee)null);
				return;
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				getManagedEmployees().clear();
				return;
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				return;
			case EmployeePackage.EMPLOYEE__DEGREES:
				getDegrees().clear();
				return;
			case EmployeePackage.EMPLOYEE__PROJECTS:
				getProjects().clear();
				return;
			case EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES:
				getEmailAddresses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case EmployeePackage.EMPLOYEE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case EmployeePackage.EMPLOYEE__GENDER:
				return gender != GENDER_EDEFAULT;
			case EmployeePackage.EMPLOYEE__SALARY:
				return salary != SALARY_EDEFAULT;
			case EmployeePackage.EMPLOYEE__VERSION:
				return version != VERSION_EDEFAULT;
			case EmployeePackage.EMPLOYEE__RESPONSIBILITIES:
				return responsibilities != null && !responsibilities.isEmpty();
			case EmployeePackage.EMPLOYEE__PERIOD:
				return period != null;
			case EmployeePackage.EMPLOYEE__ADDRESS:
				return address != null;
			case EmployeePackage.EMPLOYEE__JOB_TITLE:
				return jobTitle != null;
			case EmployeePackage.EMPLOYEE__MANAGER:
				return manager != null;
			case EmployeePackage.EMPLOYEE__MANAGED_EMPLOYEES:
				return managedEmployees != null && !managedEmployees.isEmpty();
			case EmployeePackage.EMPLOYEE__PHONE_NUMBERS:
				return phoneNumbers != null && !phoneNumbers.isEmpty();
			case EmployeePackage.EMPLOYEE__DEGREES:
				return degrees != null && !degrees.isEmpty();
			case EmployeePackage.EMPLOYEE__PROJECTS:
				return projects != null && !projects.isEmpty();
			case EmployeePackage.EMPLOYEE__EMAIL_ADDRESSES:
				return emailAddresses != null && !emailAddresses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", gender: ");
		result.append(gender);
		result.append(", salary: ");
		result.append(salary);
		result.append(", version: ");
		result.append(version);
		result.append(", responsibilities: ");
		result.append(responsibilities);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
