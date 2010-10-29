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

import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataHasValueImpl#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataHasValueImpl#getHasValue <em>Has Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataHasValueImpl extends DataPropertyRestrictionImpl implements DataHasValue {
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
	 * The cached value of the '{@link #getHasValue() <em>Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValue()
	 * @generated
	 * @ordered
	 */
	protected Literal hasValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_HAS_VALUE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_HAS_VALUE__ON_PROPERTY, oldOnProperty, newOnProperty);
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
				msgs = ((InternalEObject)onProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_HAS_VALUE__ON_PROPERTY, null, msgs);
			if (newOnProperty != null)
				msgs = ((InternalEObject)newOnProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_HAS_VALUE__ON_PROPERTY, null, msgs);
			msgs = basicSetOnProperty(newOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_HAS_VALUE__ON_PROPERTY, newOnProperty, newOnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasValue() {
		return hasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValue(Literal newHasValue, NotificationChain msgs) {
		Literal oldHasValue = hasValue;
		hasValue = newHasValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_HAS_VALUE__HAS_VALUE, oldHasValue, newHasValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValue(Literal newHasValue) {
		if (newHasValue != hasValue) {
			NotificationChain msgs = null;
			if (hasValue != null)
				msgs = ((InternalEObject)hasValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_HAS_VALUE__HAS_VALUE, null, msgs);
			if (newHasValue != null)
				msgs = ((InternalEObject)newHasValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_HAS_VALUE__HAS_VALUE, null, msgs);
			msgs = basicSetHasValue(newHasValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_HAS_VALUE__HAS_VALUE, newHasValue, newHasValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DATA_HAS_VALUE__ON_PROPERTY:
				return basicSetOnProperty(null, msgs);
			case OWLPackage.DATA_HAS_VALUE__HAS_VALUE:
				return basicSetHasValue(null, msgs);
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
			case OWLPackage.DATA_HAS_VALUE__ON_PROPERTY:
				return getOnProperty();
			case OWLPackage.DATA_HAS_VALUE__HAS_VALUE:
				return getHasValue();
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
			case OWLPackage.DATA_HAS_VALUE__ON_PROPERTY:
				setOnProperty((DataPropertyExpression)newValue);
				return;
			case OWLPackage.DATA_HAS_VALUE__HAS_VALUE:
				setHasValue((Literal)newValue);
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
			case OWLPackage.DATA_HAS_VALUE__ON_PROPERTY:
				setOnProperty((DataPropertyExpression)null);
				return;
			case OWLPackage.DATA_HAS_VALUE__HAS_VALUE:
				setHasValue((Literal)null);
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
			case OWLPackage.DATA_HAS_VALUE__ON_PROPERTY:
				return onProperty != null;
			case OWLPackage.DATA_HAS_VALUE__HAS_VALUE:
				return hasValue != null;
		}
		return super.eIsSet(featureID);
	}

} //DataHasValueImpl
