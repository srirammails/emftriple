/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataAllValuesFromImpl#getOnProperties <em>On Properties</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataAllValuesFromImpl#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAllValuesFromImpl extends DataPropertyRestrictionImpl implements DataAllValuesFrom {
	/**
	 * The cached value of the '{@link #getOnProperties() <em>On Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyExpression> onProperties;

	/**
	 * The cached value of the '{@link #getAllValuesFrom() <em>All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected DataRange allValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyExpression> getOnProperties() {
		if (onProperties == null) {
			onProperties = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES);
		}
		return onProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getAllValuesFrom() {
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllValuesFrom(DataRange newAllValuesFrom, NotificationChain msgs) {
		DataRange oldAllValuesFrom = allValuesFrom;
		allValuesFrom = newAllValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, newAllValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllValuesFrom(DataRange newAllValuesFrom) {
		if (newAllValuesFrom != allValuesFrom) {
			NotificationChain msgs = null;
			if (allValuesFrom != null)
				msgs = ((InternalEObject)allValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, null, msgs);
			if (newAllValuesFrom != null)
				msgs = ((InternalEObject)newAllValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, null, msgs);
			msgs = basicSetAllValuesFrom(newAllValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM, newAllValuesFrom, newAllValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES:
				return ((InternalEList<?>)getOnProperties()).basicRemove(otherEnd, msgs);
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return basicSetAllValuesFrom(null, msgs);
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES:
				return getOnProperties();
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return getAllValuesFrom();
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES:
				getOnProperties().clear();
				getOnProperties().addAll((Collection<? extends DataPropertyExpression>)newValue);
				return;
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((DataRange)newValue);
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES:
				getOnProperties().clear();
				return;
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((DataRange)null);
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
			case OWLPackage.DATA_ALL_VALUES_FROM__ON_PROPERTIES:
				return onProperties != null && !onProperties.isEmpty();
			case OWLPackage.DATA_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return allValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAllValuesFromImpl
