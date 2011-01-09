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
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.ObjectSomeValuesFrom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Some Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl#getSomeValuesFrom <em>Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectSomeValuesFromImpl extends ObjectPropertyRestrictionImpl implements ObjectSomeValuesFrom {
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
	 * The cached value of the '{@link #getSomeValuesFrom() <em>Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression someValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSomeValuesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_SOME_VALUES_FROM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY, oldOnProperty, newOnProperty);
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
				msgs = ((InternalEObject)onProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY, null, msgs);
			if (newOnProperty != null)
				msgs = ((InternalEObject)newOnProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY, null, msgs);
			msgs = basicSetOnProperty(newOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY, newOnProperty, newOnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getSomeValuesFrom() {
		return someValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSomeValuesFrom(ClassExpression newSomeValuesFrom, NotificationChain msgs) {
		ClassExpression oldSomeValuesFrom = someValuesFrom;
		someValuesFrom = newSomeValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, oldSomeValuesFrom, newSomeValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeValuesFrom(ClassExpression newSomeValuesFrom) {
		if (newSomeValuesFrom != someValuesFrom) {
			NotificationChain msgs = null;
			if (someValuesFrom != null)
				msgs = ((InternalEObject)someValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, null, msgs);
			if (newSomeValuesFrom != null)
				msgs = ((InternalEObject)newSomeValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, null, msgs);
			msgs = basicSetSomeValuesFrom(newSomeValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM, newSomeValuesFrom, newSomeValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY:
				return basicSetOnProperty(null, msgs);
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				return basicSetSomeValuesFrom(null, msgs);
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY:
				return getOnProperty();
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				return getSomeValuesFrom();
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				setSomeValuesFrom((ClassExpression)null);
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
			case OWLPackage.OBJECT_SOME_VALUES_FROM__ON_PROPERTY:
				return onProperty != null;
			case OWLPackage.OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM:
				return someValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectSomeValuesFromImpl
