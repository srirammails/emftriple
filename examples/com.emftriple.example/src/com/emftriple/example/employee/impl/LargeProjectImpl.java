/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.example.employee.impl;

import com.emftriple.example.employee.EmployeePackage;
import com.emftriple.example.employee.LargeProject;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Large Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.example.employee.impl.LargeProjectImpl#getBudget <em>Budget</em>}</li>
 *   <li>{@link com.emftriple.example.employee.impl.LargeProjectImpl#getMilestone <em>Milestone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LargeProjectImpl extends ProjectImpl implements LargeProject {
	/**
	 * The default value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected static final double BUDGET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected double budget = BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected static final Date MILESTONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected Date milestone = MILESTONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargeProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmployeePackage.Literals.LARGE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBudget() {
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudget(double newBudget) {
		double oldBudget = budget;
		budget = newBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.LARGE_PROJECT__BUDGET, oldBudget, budget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMilestone() {
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilestone(Date newMilestone) {
		Date oldMilestone = milestone;
		milestone = newMilestone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.LARGE_PROJECT__MILESTONE, oldMilestone, milestone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmployeePackage.LARGE_PROJECT__BUDGET:
				return getBudget();
			case EmployeePackage.LARGE_PROJECT__MILESTONE:
				return getMilestone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmployeePackage.LARGE_PROJECT__BUDGET:
				setBudget((Double)newValue);
				return;
			case EmployeePackage.LARGE_PROJECT__MILESTONE:
				setMilestone((Date)newValue);
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
			case EmployeePackage.LARGE_PROJECT__BUDGET:
				setBudget(BUDGET_EDEFAULT);
				return;
			case EmployeePackage.LARGE_PROJECT__MILESTONE:
				setMilestone(MILESTONE_EDEFAULT);
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
			case EmployeePackage.LARGE_PROJECT__BUDGET:
				return budget != BUDGET_EDEFAULT;
			case EmployeePackage.LARGE_PROJECT__MILESTONE:
				return MILESTONE_EDEFAULT == null ? milestone != null : !MILESTONE_EDEFAULT.equals(milestone);
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
		result.append(" (budget: ");
		result.append(budget);
		result.append(", milestone: ");
		result.append(milestone);
		result.append(')');
		return result.toString();
	}

} //LargeProjectImpl
