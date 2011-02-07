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

import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.SubDataPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.SubDataPropertyOfImpl#getSubDataProperty <em>Sub Data Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.SubDataPropertyOfImpl#getSuperDataProperty <em>Super Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubDataPropertyOfImpl extends DataPropertyAxiomImpl implements SubDataPropertyOf {
	/**
	 * The cached value of the '{@link #getSubDataProperty() <em>Sub Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression subDataProperty;

	/**
	 * The cached value of the '{@link #getSuperDataProperty() <em>Super Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression superDataProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubDataPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.SUB_DATA_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getSubDataProperty() {
		return subDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubDataProperty(DataPropertyExpression newSubDataProperty, NotificationChain msgs) {
		DataPropertyExpression oldSubDataProperty = subDataProperty;
		subDataProperty = newSubDataProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY, oldSubDataProperty, newSubDataProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubDataProperty(DataPropertyExpression newSubDataProperty) {
		if (newSubDataProperty != subDataProperty) {
			NotificationChain msgs = null;
			if (subDataProperty != null)
				msgs = ((InternalEObject)subDataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY, null, msgs);
			if (newSubDataProperty != null)
				msgs = ((InternalEObject)newSubDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY, null, msgs);
			msgs = basicSetSubDataProperty(newSubDataProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY, newSubDataProperty, newSubDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getSuperDataProperty() {
		return superDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperDataProperty(DataPropertyExpression newSuperDataProperty, NotificationChain msgs) {
		DataPropertyExpression oldSuperDataProperty = superDataProperty;
		superDataProperty = newSuperDataProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY, oldSuperDataProperty, newSuperDataProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperDataProperty(DataPropertyExpression newSuperDataProperty) {
		if (newSuperDataProperty != superDataProperty) {
			NotificationChain msgs = null;
			if (superDataProperty != null)
				msgs = ((InternalEObject)superDataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY, null, msgs);
			if (newSuperDataProperty != null)
				msgs = ((InternalEObject)newSuperDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY, null, msgs);
			msgs = basicSetSuperDataProperty(newSuperDataProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY, newSuperDataProperty, newSuperDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY:
				return basicSetSubDataProperty(null, msgs);
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY:
				return basicSetSuperDataProperty(null, msgs);
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
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY:
				return getSubDataProperty();
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY:
				return getSuperDataProperty();
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
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY:
				setSubDataProperty((DataPropertyExpression)newValue);
				return;
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY:
				setSuperDataProperty((DataPropertyExpression)newValue);
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
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY:
				setSubDataProperty((DataPropertyExpression)null);
				return;
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY:
				setSuperDataProperty((DataPropertyExpression)null);
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
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY:
				return subDataProperty != null;
			case OWLPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY:
				return superDataProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SubDataPropertyOfImpl
