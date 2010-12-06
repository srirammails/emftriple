/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.emftriple.example.employee.EmployeeFactory
 * @model kind="package"
 * @generated
 */
public interface EmployeePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "employee";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/Employee";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "employee";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeePackage eINSTANCE = com.emftriple.example.employee.impl.EmployeePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.OrganizationImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PROJECTS = 2;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__JOBS = 3;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.ProjectImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Team Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TEAM_LEADER = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.SmallProjectImpl <em>Small Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.SmallProjectImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getSmallProject()
	 * @generated
	 */
	int SMALL_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_PROJECT__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_PROJECT__DESCRIPTION = PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Team Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_PROJECT__TEAM_LEADER = PROJECT__TEAM_LEADER;

	/**
	 * The number of structural features of the '<em>Small Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.LargeProjectImpl <em>Large Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.LargeProjectImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getLargeProject()
	 * @generated
	 */
	int LARGE_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT__DESCRIPTION = PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Team Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT__TEAM_LEADER = PROJECT__TEAM_LEADER;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT__BUDGET = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT__MILESTONE = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Large Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.PhoneNumberImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getPhoneNumber()
	 * @generated
	 */
	int PHONE_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__AREA_CODE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__OWNER = 3;

	/**
	 * The number of structural features of the '<em>Phone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.JobTitleImpl <em>Job Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.JobTitleImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getJobTitle()
	 * @generated
	 */
	int JOB_TITLE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TITLE__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Job Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TITLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.EmploymentPeriodImpl <em>Employment Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.EmploymentPeriodImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmploymentPeriod()
	 * @generated
	 */
	int EMPLOYMENT_PERIOD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_PERIOD__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_PERIOD__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_PERIOD__END_DATE = 2;

	/**
	 * The number of structural features of the '<em>Employment Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_PERIOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.EmployeeImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 7;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__GENDER = 2;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY = 3;

	/**
	 * The feature id for the '<em><b>Responsibilities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__RESPONSIBILITIES = 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Job Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__JOB_TITLE = 7;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Managed Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGED_EMPLOYEES = 9;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PHONE_NUMBERS = 10;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PROJECTS = 11;

	/**
	 * The feature id for the '<em><b>Email Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL_ADDRESSES = 12;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.EmailAddressImpl <em>Email Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.EmailAddressImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmailAddress()
	 * @generated
	 */
	int EMAIL_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Email Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.impl.AddressImpl
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PROVINCE = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.emftriple.example.employee.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emftriple.example.employee.Gender
	 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 10;


	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see com.emftriple.example.employee.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.example.employee.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.example.employee.Organization#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see com.emftriple.example.employee.Organization#getEmployees()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.example.employee.Organization#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see com.emftriple.example.employee.Organization#getProjects()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.example.employee.Organization#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see com.emftriple.example.employee.Organization#getJobs()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Jobs();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.emftriple.example.employee.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.example.employee.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.emftriple.example.employee.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the reference '{@link com.emftriple.example.employee.Project#getTeamLeader <em>Team Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team Leader</em>'.
	 * @see com.emftriple.example.employee.Project#getTeamLeader()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_TeamLeader();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.SmallProject <em>Small Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Project</em>'.
	 * @see com.emftriple.example.employee.SmallProject
	 * @generated
	 */
	EClass getSmallProject();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.LargeProject <em>Large Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Project</em>'.
	 * @see com.emftriple.example.employee.LargeProject
	 * @generated
	 */
	EClass getLargeProject();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.LargeProject#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see com.emftriple.example.employee.LargeProject#getBudget()
	 * @see #getLargeProject()
	 * @generated
	 */
	EAttribute getLargeProject_Budget();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.LargeProject#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milestone</em>'.
	 * @see com.emftriple.example.employee.LargeProject#getMilestone()
	 * @see #getLargeProject()
	 * @generated
	 */
	EAttribute getLargeProject_Milestone();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.PhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Number</em>'.
	 * @see com.emftriple.example.employee.PhoneNumber
	 * @generated
	 */
	EClass getPhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.PhoneNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.emftriple.example.employee.PhoneNumber#getNumber()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.PhoneNumber#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.emftriple.example.employee.PhoneNumber#getType()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.PhoneNumber#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see com.emftriple.example.employee.PhoneNumber#getAreaCode()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_AreaCode();

	/**
	 * Returns the meta object for the container reference '{@link com.emftriple.example.employee.PhoneNumber#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see com.emftriple.example.employee.PhoneNumber#getOwner()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EReference getPhoneNumber_Owner();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.JobTitle <em>Job Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Title</em>'.
	 * @see com.emftriple.example.employee.JobTitle
	 * @generated
	 */
	EClass getJobTitle();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.JobTitle#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.emftriple.example.employee.JobTitle#getTitle()
	 * @see #getJobTitle()
	 * @generated
	 */
	EAttribute getJobTitle_Title();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.EmploymentPeriod <em>Employment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment Period</em>'.
	 * @see com.emftriple.example.employee.EmploymentPeriod
	 * @generated
	 */
	EClass getEmploymentPeriod();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmploymentPeriod#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.emftriple.example.employee.EmploymentPeriod#getId()
	 * @see #getEmploymentPeriod()
	 * @generated
	 */
	EAttribute getEmploymentPeriod_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmploymentPeriod#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.emftriple.example.employee.EmploymentPeriod#getStartDate()
	 * @see #getEmploymentPeriod()
	 * @generated
	 */
	EAttribute getEmploymentPeriod_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmploymentPeriod#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.emftriple.example.employee.EmploymentPeriod#getEndDate()
	 * @see #getEmploymentPeriod()
	 * @generated
	 */
	EAttribute getEmploymentPeriod_EndDate();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see com.emftriple.example.employee.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Employee#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.emftriple.example.employee.Employee#getFirstName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Employee#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.emftriple.example.employee.Employee#getLastName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Employee#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see com.emftriple.example.employee.Employee#getGender()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Gender();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Employee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see com.emftriple.example.employee.Employee#getSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Salary();

	/**
	 * Returns the meta object for the attribute list '{@link com.emftriple.example.employee.Employee#getResponsibilities <em>Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Responsibilities</em>'.
	 * @see com.emftriple.example.employee.Employee#getResponsibilities()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Responsibilities();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.example.employee.Employee#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see com.emftriple.example.employee.Employee#getPeriod()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Period();

	/**
	 * Returns the meta object for the containment reference '{@link com.emftriple.example.employee.Employee#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see com.emftriple.example.employee.Employee#getAddress()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Address();

	/**
	 * Returns the meta object for the reference '{@link com.emftriple.example.employee.Employee#getJobTitle <em>Job Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Title</em>'.
	 * @see com.emftriple.example.employee.Employee#getJobTitle()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_JobTitle();

	/**
	 * Returns the meta object for the reference '{@link com.emftriple.example.employee.Employee#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see com.emftriple.example.employee.Employee#getManager()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Manager();

	/**
	 * Returns the meta object for the reference list '{@link com.emftriple.example.employee.Employee#getManagedEmployees <em>Managed Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managed Employees</em>'.
	 * @see com.emftriple.example.employee.Employee#getManagedEmployees()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_ManagedEmployees();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.example.employee.Employee#getPhoneNumbers <em>Phone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phone Numbers</em>'.
	 * @see com.emftriple.example.employee.Employee#getPhoneNumbers()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_PhoneNumbers();

	/**
	 * Returns the meta object for the reference list '{@link com.emftriple.example.employee.Employee#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see com.emftriple.example.employee.Employee#getProjects()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emftriple.example.employee.Employee#getEmailAddresses <em>Email Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Addresses</em>'.
	 * @see com.emftriple.example.employee.Employee#getEmailAddresses()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_EmailAddresses();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.EmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address</em>'.
	 * @see com.emftriple.example.employee.EmailAddress
	 * @generated
	 */
	EClass getEmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmailAddress#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.emftriple.example.employee.EmailAddress#getId()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmailAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emftriple.example.employee.EmailAddress#getName()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.EmailAddress#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.emftriple.example.employee.EmailAddress#getAddress()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_Address();

	/**
	 * Returns the meta object for class '{@link com.emftriple.example.employee.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see com.emftriple.example.employee.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.emftriple.example.employee.Address#getId()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.emftriple.example.employee.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.emftriple.example.employee.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Province</em>'.
	 * @see com.emftriple.example.employee.Address#getProvince()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Province();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see com.emftriple.example.employee.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link com.emftriple.example.employee.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see com.emftriple.example.employee.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for enum '{@link com.emftriple.example.employee.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see com.emftriple.example.employee.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmployeeFactory getEmployeeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.OrganizationImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__EMPLOYEES = eINSTANCE.getOrganization_Employees();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__PROJECTS = eINSTANCE.getOrganization_Projects();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__JOBS = eINSTANCE.getOrganization_Jobs();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.ProjectImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Team Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TEAM_LEADER = eINSTANCE.getProject_TeamLeader();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.SmallProjectImpl <em>Small Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.SmallProjectImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getSmallProject()
		 * @generated
		 */
		EClass SMALL_PROJECT = eINSTANCE.getSmallProject();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.LargeProjectImpl <em>Large Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.LargeProjectImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getLargeProject()
		 * @generated
		 */
		EClass LARGE_PROJECT = eINSTANCE.getLargeProject();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_PROJECT__BUDGET = eINSTANCE.getLargeProject_Budget();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_PROJECT__MILESTONE = eINSTANCE.getLargeProject_Milestone();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.PhoneNumberImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getPhoneNumber()
		 * @generated
		 */
		EClass PHONE_NUMBER = eINSTANCE.getPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__NUMBER = eINSTANCE.getPhoneNumber_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__TYPE = eINSTANCE.getPhoneNumber_Type();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__AREA_CODE = eINSTANCE.getPhoneNumber_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHONE_NUMBER__OWNER = eINSTANCE.getPhoneNumber_Owner();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.JobTitleImpl <em>Job Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.JobTitleImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getJobTitle()
		 * @generated
		 */
		EClass JOB_TITLE = eINSTANCE.getJobTitle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_TITLE__TITLE = eINSTANCE.getJobTitle_Title();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.EmploymentPeriodImpl <em>Employment Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.EmploymentPeriodImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmploymentPeriod()
		 * @generated
		 */
		EClass EMPLOYMENT_PERIOD = eINSTANCE.getEmploymentPeriod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_PERIOD__ID = eINSTANCE.getEmploymentPeriod_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_PERIOD__START_DATE = eINSTANCE.getEmploymentPeriod_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT_PERIOD__END_DATE = eINSTANCE.getEmploymentPeriod_EndDate();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.EmployeeImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__LAST_NAME = eINSTANCE.getEmployee_LastName();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__GENDER = eINSTANCE.getEmployee_Gender();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Responsibilities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__RESPONSIBILITIES = eINSTANCE.getEmployee_Responsibilities();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PERIOD = eINSTANCE.getEmployee_Period();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__ADDRESS = eINSTANCE.getEmployee_Address();

		/**
		 * The meta object literal for the '<em><b>Job Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__JOB_TITLE = eINSTANCE.getEmployee_JobTitle();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGER = eINSTANCE.getEmployee_Manager();

		/**
		 * The meta object literal for the '<em><b>Managed Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGED_EMPLOYEES = eINSTANCE.getEmployee_ManagedEmployees();

		/**
		 * The meta object literal for the '<em><b>Phone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PHONE_NUMBERS = eINSTANCE.getEmployee_PhoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PROJECTS = eINSTANCE.getEmployee_Projects();

		/**
		 * The meta object literal for the '<em><b>Email Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__EMAIL_ADDRESSES = eINSTANCE.getEmployee_EmailAddresses();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.EmailAddressImpl <em>Email Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.EmailAddressImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getEmailAddress()
		 * @generated
		 */
		EClass EMAIL_ADDRESS = eINSTANCE.getEmailAddress();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__ID = eINSTANCE.getEmailAddress_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__NAME = eINSTANCE.getEmailAddress_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__ADDRESS = eINSTANCE.getEmailAddress_Address();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.impl.AddressImpl
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ID = eINSTANCE.getAddress_Id();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__PROVINCE = eINSTANCE.getAddress_Province();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '{@link com.emftriple.example.employee.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emftriple.example.employee.Gender
		 * @see com.emftriple.example.employee.impl.EmployeePackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //EmployeePackage
