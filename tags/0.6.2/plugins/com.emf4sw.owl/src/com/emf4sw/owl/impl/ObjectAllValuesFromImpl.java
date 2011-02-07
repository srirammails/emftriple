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

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl#getAllValuesFrom <em>All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectAllValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectAllValuesFrom {
	/**
	 * The cached value of the '{@link #getOnProperty() <em>On Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression onProperty;

	/**
	 * The cached value of the '{@link #getAllValuesFrom() <em>All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression allValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAllValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_ALL_VALUES_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getOnProperty() {
		return onProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnProperty(ObjectPropertyExpression newOnProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldOnProperty = onProperty;
		onProperty = newOnProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY, oldOnProperty, newOnProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnProperty(ObjectPropertyExpression newOnProperty) {
		if (newOnProperty != onProperty) {
			NotificationChain msgs = null;
			if (onProperty != null)
				msgs = ((InternalEObject)onProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY, null, msgs);
			if (newOnProperty != null)
				msgs = ((InternalEObject)newOnProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY, null, msgs);
			msgs = basicSetOnProperty(newOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY, newOnProperty, newOnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getAllValuesFrom() {
		return allValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllValuesFrom(ClassExpression newAllValuesFrom, NotificationChain msgs) {
		ClassExpression oldAllValuesFrom = allValuesFrom;
		allValuesFrom = newAllValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, oldAllValuesFrom, newAllValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllValuesFrom(ClassExpression newAllValuesFrom) {
		if (newAllValuesFrom != allValuesFrom) {
			NotificationChain msgs = null;
			if (allValuesFrom != null)
				msgs = ((InternalEObject)allValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, null, msgs);
			if (newAllValuesFrom != null)
				msgs = ((InternalEObject)newAllValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, null, msgs);
			msgs = basicSetAllValuesFrom(newAllValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM, newAllValuesFrom, newAllValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY:
				return basicSetOnProperty(null, msgs);
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY:
				return getOnProperty();
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return getAllValuesFrom();
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				setAllValuesFrom((ClassExpression)null);
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
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ON_PROPERTY:
				return onProperty != null;
			case OWLPackage.OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM:
				return allValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectAllValuesFromImpl
