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

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.SubObjectPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.SubObjectPropertyOfImpl#getSubObjectProperty <em>Sub Object Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.SubObjectPropertyOfImpl#getSuperObjectProperty <em>Super Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubObjectPropertyOfImpl extends ObjectPropertyAxiomImpl implements SubObjectPropertyOf {
	/**
	 * The cached value of the '{@link #getSubObjectProperty() <em>Sub Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression subObjectProperty;

	/**
	 * The cached value of the '{@link #getSuperObjectProperty() <em>Super Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression superObjectProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubObjectPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.SUB_OBJECT_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getSubObjectProperty() {
		return subObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubObjectProperty(ObjectPropertyExpression newSubObjectProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldSubObjectProperty = subObjectProperty;
		subObjectProperty = newSubObjectProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY, oldSubObjectProperty, newSubObjectProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubObjectProperty(ObjectPropertyExpression newSubObjectProperty) {
		if (newSubObjectProperty != subObjectProperty) {
			NotificationChain msgs = null;
			if (subObjectProperty != null)
				msgs = ((InternalEObject)subObjectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY, null, msgs);
			if (newSubObjectProperty != null)
				msgs = ((InternalEObject)newSubObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY, null, msgs);
			msgs = basicSetSubObjectProperty(newSubObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY, newSubObjectProperty, newSubObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getSuperObjectProperty() {
		return superObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperObjectProperty(ObjectPropertyExpression newSuperObjectProperty, NotificationChain msgs) {
		ObjectPropertyExpression oldSuperObjectProperty = superObjectProperty;
		superObjectProperty = newSuperObjectProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY, oldSuperObjectProperty, newSuperObjectProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperObjectProperty(ObjectPropertyExpression newSuperObjectProperty) {
		if (newSuperObjectProperty != superObjectProperty) {
			NotificationChain msgs = null;
			if (superObjectProperty != null)
				msgs = ((InternalEObject)superObjectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY, null, msgs);
			if (newSuperObjectProperty != null)
				msgs = ((InternalEObject)newSuperObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY, null, msgs);
			msgs = basicSetSuperObjectProperty(newSuperObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY, newSuperObjectProperty, newSuperObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY:
				return basicSetSubObjectProperty(null, msgs);
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY:
				return basicSetSuperObjectProperty(null, msgs);
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
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY:
				return getSubObjectProperty();
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY:
				return getSuperObjectProperty();
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
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY:
				setSubObjectProperty((ObjectPropertyExpression)newValue);
				return;
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY:
				setSuperObjectProperty((ObjectPropertyExpression)newValue);
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
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY:
				setSubObjectProperty((ObjectPropertyExpression)null);
				return;
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY:
				setSuperObjectProperty((ObjectPropertyExpression)null);
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
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY:
				return subObjectProperty != null;
			case OWLPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY:
				return superObjectProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SubObjectPropertyOfImpl
