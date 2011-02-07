/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import com.emftriple.example.employee.SmallProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeeFactoryImpl extends EFactoryImpl implements EmployeeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmployeeFactory init() {
		try {
			EmployeeFactory theEmployeeFactory = (EmployeeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.com/Employee"); 
			if (theEmployeeFactory != null) {
				return theEmployeeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmployeeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmployeePackage.ORGANIZATION: return createOrganization();
			case EmployeePackage.SMALL_PROJECT: return createSmallProject();
			case EmployeePackage.LARGE_PROJECT: return createLargeProject();
			case EmployeePackage.PHONE_NUMBER: return createPhoneNumber();
			case EmployeePackage.JOB_TITLE: return createJobTitle();
			case EmployeePackage.EMPLOYMENT_PERIOD: return createEmploymentPeriod();
			case EmployeePackage.EMPLOYEE: return createEmployee();
			case EmployeePackage.EMAIL_ADDRESS: return createEmailAddress();
			case EmployeePackage.ADDRESS: return createAddress();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmployeePackage.GENDER:
				return createGenderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmployeePackage.GENDER:
				return convertGenderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallProject createSmallProject() {
		SmallProjectImpl smallProject = new SmallProjectImpl();
		return smallProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeProject createLargeProject() {
		LargeProjectImpl largeProject = new LargeProjectImpl();
		return largeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneNumber createPhoneNumber() {
		PhoneNumberImpl phoneNumber = new PhoneNumberImpl();
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTitle createJobTitle() {
		JobTitleImpl jobTitle = new JobTitleImpl();
		return jobTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmploymentPeriod createEmploymentPeriod() {
		EmploymentPeriodImpl employmentPeriod = new EmploymentPeriodImpl();
		return employmentPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress createEmailAddress() {
		EmailAddressImpl emailAddress = new EmailAddressImpl();
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeePackage getEmployeePackage() {
		return (EmployeePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmployeePackage getPackage() {
		return EmployeePackage.eINSTANCE;
	}

} //EmployeeFactoryImpl
