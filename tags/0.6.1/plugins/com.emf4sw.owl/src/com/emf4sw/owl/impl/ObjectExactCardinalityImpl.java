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
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getOnProperty <em>On Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl#getOnClass <em>On Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExactCardinalityImpl extends ObjectPropertyRestrictionImpl implements ObjectExactCardinality {
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
	 * The cached value of the '{@link #getOnClass() <em>On Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClass()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression onClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExactCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_EXACT_CARDINALITY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY, oldOnProperty, newOnProperty);
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
				msgs = ((InternalEObject)onProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY, null, msgs);
			if (newOnProperty != null)
				msgs = ((InternalEObject)newOnProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY, null, msgs);
			msgs = basicSetOnProperty(newOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY, newOnProperty, newOnProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getOnClass() {
		return onClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnClass(ClassExpression newOnClass, NotificationChain msgs) {
		ClassExpression oldOnClass = onClass;
		onClass = newOnClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, oldOnClass, newOnClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClass(ClassExpression newOnClass) {
		if (newOnClass != onClass) {
			NotificationChain msgs = null;
			if (onClass != null)
				msgs = ((InternalEObject)onClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, null, msgs);
			if (newOnClass != null)
				msgs = ((InternalEObject)newOnClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, null, msgs);
			msgs = basicSetOnClass(newOnClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS, newOnClass, newOnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY:
				return basicSetOnProperty(null, msgs);
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				return basicSetOnClass(null, msgs);
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY:
				return getOnProperty();
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				return getCardinality();
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				return getOnClass();
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				setOnClass((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY:
				setOnProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				setOnClass((ClassExpression)null);
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
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_PROPERTY:
				return onProperty != null;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case OWLPackage.OBJECT_EXACT_CARDINALITY__ON_CLASS:
				return onClass != null;
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

} //ObjectExactCardinalityImpl
