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

import com.emf4sw.owl.EquivalentObjectProperties;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectPropertyExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Object Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentObjectPropertiesImpl extends ObjectPropertyAxiomImpl implements EquivalentObjectProperties {
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
	 * The cached value of the '{@link #getEquivalentProperties() <em>Equivalent Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyExpression> equivalentProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentObjectPropertiesImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.EQUIVALENT_OBJECT_PROPERTIES;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY, oldProperty, newProperty);
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
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyExpression> getEquivalentProperties() {
		if (equivalentProperties == null) {
			equivalentProperties = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES);
		}
		return equivalentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY:
				return basicSetProperty(null, msgs);
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES:
				return ((InternalEList<?>)getEquivalentProperties()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY:
				return getProperty();
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
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
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				getEquivalentProperties().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY:
				setProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
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
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__PROPERTY:
				return property != null;
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES:
				return equivalentProperties != null && !equivalentProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquivalentObjectPropertiesImpl
