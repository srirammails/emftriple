/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee.util;

import com.emftriple.example.employee.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.example.employee.EmployeePackage
 * @generated
 */
public class EmployeeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmployeePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmployeePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeSwitch<Adapter> modelSwitch =
		new EmployeeSwitch<Adapter>() {
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseSmallProject(SmallProject object) {
				return createSmallProjectAdapter();
			}
			@Override
			public Adapter caseLargeProject(LargeProject object) {
				return createLargeProjectAdapter();
			}
			@Override
			public Adapter casePhoneNumber(PhoneNumber object) {
				return createPhoneNumberAdapter();
			}
			@Override
			public Adapter caseJobTitle(JobTitle object) {
				return createJobTitleAdapter();
			}
			@Override
			public Adapter caseEmploymentPeriod(EmploymentPeriod object) {
				return createEmploymentPeriodAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseEmailAddress(EmailAddress object) {
				return createEmailAddressAdapter();
			}
			@Override
			public Adapter caseDegree(Degree object) {
				return createDegreeAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.SmallProject <em>Small Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.SmallProject
	 * @generated
	 */
	public Adapter createSmallProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.LargeProject <em>Large Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.LargeProject
	 * @generated
	 */
	public Adapter createLargeProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.PhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.PhoneNumber
	 * @generated
	 */
	public Adapter createPhoneNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.JobTitle <em>Job Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.JobTitle
	 * @generated
	 */
	public Adapter createJobTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.EmploymentPeriod <em>Employment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.EmploymentPeriod
	 * @generated
	 */
	public Adapter createEmploymentPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.EmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.EmailAddress
	 * @generated
	 */
	public Adapter createEmailAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.example.employee.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.example.employee.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmployeeAdapterFactory
