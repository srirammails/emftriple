/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Max Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl#getOnDataRange <em>On Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMaxCardinalityImpl extends DataPropertyRestrictionImpl implements DataMaxCardinality {
	/**
	 * The cached value of the '{@link #getOnProperty() <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProperty()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression onProperty;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnDataRange() <em>On Data Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDataRange()
	 * @generated
	 * @ordered
	 */
	protected DataRange onDataRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMaxCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_MAX_CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getOnProperty() {
		return onProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnProperty(DataPropertyExpression newOnProperty, NotificationChain msgs) {
		DataPropertyExpression oldOnProperty = onProperty;
		onProperty = newOnProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY, oldOnProperty, newOnProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProperty(DataPropertyExpression newOnProperty) {
		if (newOnProperty != onProperty) {
			NotificationChain msgs = null;
			if (onProperty != null)
				msgs = ((InternalEObject)onProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY, null, msgs);
			if (newOnProperty != null)
				msgs = ((InternalEObject)newOnProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY, null, msgs);
			msgs = basicSetOnProperty(newOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY, newOnProperty, newOnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_MAX_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getOnDataRange() {
		return onDataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDataRange(DataRange newOnDataRange, NotificationChain msgs) {
		DataRange oldOnDataRange = onDataRange;
		onDataRange = newOnDataRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE, oldOnDataRange, newOnDataRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDataRange(DataRange newOnDataRange) {
		if (newOnDataRange != onDataRange) {
			NotificationChain msgs = null;
			if (onDataRange != null)
				msgs = ((InternalEObject)onDataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE, null, msgs);
			if (newOnDataRange != null)
				msgs = ((InternalEObject)newOnDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE, null, msgs);
			msgs = basicSetOnDataRange(newOnDataRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE, newOnDataRange, newOnDataRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY:
				return basicSetOnProperty(null, msgs);
			case OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE:
				return basicSetOnDataRange(null, msgs);
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
			case OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY:
				return getOnProperty();
			case OWLPackage.DATA_MAX_CARDINALITY__CARDINALITY:
				return getCardinality();
			case OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE:
				return getOnDataRange();
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
			case OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY:
				setOnProperty((DataPropertyExpression)newValue);
				return;
			case OWLPackage.DATA_MAX_CARDINALITY__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE:
				setOnDataRange((DataRange)newValue);
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
			case OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY:
				setOnProperty((DataPropertyExpression)null);
				return;
			case OWLPackage.DATA_MAX_CARDINALITY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE:
				setOnDataRange((DataRange)null);
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
			case OWLPackage.DATA_MAX_CARDINALITY__ON_PROPERTY:
				return onProperty != null;
			case OWLPackage.DATA_MAX_CARDINALITY__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case OWLPackage.DATA_MAX_CARDINALITY__ON_DATA_RANGE:
				return onDataRange != null;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //DataMaxCardinalityImpl
