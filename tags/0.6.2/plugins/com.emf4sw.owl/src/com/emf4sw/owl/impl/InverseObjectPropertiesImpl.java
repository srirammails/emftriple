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

import com.emf4sw.owl.InverseObjectProperties;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.InverseObjectPropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.InverseObjectPropertiesImpl#getInverseProperty <em>Inverse Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverseObjectPropertiesImpl extends ObjectPropertyAxiomImpl implements InverseObjectProperties {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression property;

	/**
	 * The cached value of the '{@link #getInverseProperty() <em>Inverse Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression inverseProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseObjectPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.INVERSE_OBJECT_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(ObjectPropertyExpression newProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(ObjectPropertyExpression newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getInverseProperty() {
		return inverseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverseProperty(ObjectPropertyExpression newInverseProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldInverseProperty = inverseProperty;
		inverseProperty = newInverseProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY, oldInverseProperty, newInverseProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseProperty(ObjectPropertyExpression newInverseProperty) {
		if (newInverseProperty != inverseProperty) {
			NotificationChain msgs = null;
			if (inverseProperty != null)
				msgs = ((InternalEObject)inverseProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY, null, msgs);
			if (newInverseProperty != null)
				msgs = ((InternalEObject)newInverseProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY, null, msgs);
			msgs = basicSetInverseProperty(newInverseProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY, newInverseProperty, newInverseProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY:
				return basicSetProperty(null, msgs);
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY:
				return basicSetInverseProperty(null, msgs);
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
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY:
				return getProperty();
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY:
				return getInverseProperty();
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
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY:
				setInverseProperty((ObjectPropertyExpression)newValue);
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
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY:
				setInverseProperty((ObjectPropertyExpression)null);
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
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__PROPERTY:
				return property != null;
			case OWLPackage.INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY:
				return inverseProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //InverseObjectPropertiesImpl
