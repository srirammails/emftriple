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

import com.emf4sw.owl.DisjointObjectProperties;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Object Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DisjointObjectPropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DisjointObjectPropertiesImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisjointObjectPropertiesImpl extends ObjectPropertyAxiomImpl implements DisjointObjectProperties {
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
	 * The cached value of the '{@link #getDisjointProperties() <em>Disjoint Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyExpression> disjointProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointObjectPropertiesImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DISJOINT_OBJECT_PROPERTIES;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY, oldProperty, newProperty);
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
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyExpression> getDisjointProperties() {
		if (disjointProperties == null) {
			disjointProperties = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES);
		}
		return disjointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY:
				return basicSetProperty(null, msgs);
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES:
				return ((InternalEList<?>)getDisjointProperties()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY:
				return getProperty();
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES:
				return getDisjointProperties();
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
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				getDisjointProperties().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
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
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__PROPERTY:
				return property != null;
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES:
				return disjointProperties != null && !disjointProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisjointObjectPropertiesImpl
