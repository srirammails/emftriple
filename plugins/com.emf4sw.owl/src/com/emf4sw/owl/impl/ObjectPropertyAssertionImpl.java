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

import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectPropertyAssertion;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyAssertionImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.ObjectPropertyAssertionImpl#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyAssertionImpl extends AssertionImpl implements ObjectPropertyAssertion {
	/**
	 * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression objectProperty;

	/**
	 * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual sourceIndividual;

	/**
	 * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual targetIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyAssertionImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getObjectProperty() {
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectProperty(ObjectPropertyExpression newObjectProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldObjectProperty = objectProperty;
		objectProperty = newObjectProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectProperty(ObjectPropertyExpression newObjectProperty) {
		if (newObjectProperty != objectProperty) {
			NotificationChain msgs = null;
			if (objectProperty != null)
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getSourceIndividual() {
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIndividual(Individual newSourceIndividual, NotificationChain msgs) {
		Individual oldSourceIndividual = sourceIndividual;
		sourceIndividual = newSourceIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIndividual(Individual newSourceIndividual) {
		if (newSourceIndividual != sourceIndividual) {
			NotificationChain msgs = null;
			if (sourceIndividual != null)
				msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
			if (newSourceIndividual != null)
				msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
			msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getTargetIndividual() {
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetIndividual(Individual newTargetIndividual, NotificationChain msgs) {
		Individual oldTargetIndividual = targetIndividual;
		targetIndividual = newTargetIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, newTargetIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIndividual(Individual newTargetIndividual) {
		if (newTargetIndividual != targetIndividual) {
			NotificationChain msgs = null;
			if (targetIndividual != null)
				msgs = ((InternalEObject)targetIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, null, msgs);
			if (newTargetIndividual != null)
				msgs = ((InternalEObject)newTargetIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, null, msgs);
			msgs = basicSetTargetIndividual(newTargetIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, newTargetIndividual, newTargetIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return basicSetSourceIndividual(null, msgs);
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return basicSetTargetIndividual(null, msgs);
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
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return getSourceIndividual();
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return getTargetIndividual();
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
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				setObjectProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)newValue);
				return;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)newValue);
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
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				setObjectProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)null);
				return;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)null);
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
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return objectProperty != null;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return sourceIndividual != null;
			case OWLPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return targetIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyAssertionImpl
