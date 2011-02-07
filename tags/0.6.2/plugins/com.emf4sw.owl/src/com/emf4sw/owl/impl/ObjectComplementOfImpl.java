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
import com.emf4sw.owl.ObjectComplementOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectComplementOfImpl#getComplementOf <em>Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectComplementOfImpl extends ClassExpressionImpl implements ObjectComplementOf {
	/**
	 * The cached value of the '{@link #getComplementOf() <em>Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementOf()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression complementOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectComplementOfImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_COMPLEMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getComplementOf() {
		return complementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplementOf(ClassExpression newComplementOf, NotificationChain msgs) {
		ClassExpression oldComplementOf = complementOf;
		complementOf = newComplementOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF, oldComplementOf, newComplementOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementOf(ClassExpression newComplementOf) {
		if (newComplementOf != complementOf) {
			NotificationChain msgs = null;
			if (complementOf != null)
				msgs = ((InternalEObject)complementOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF, null, msgs);
			if (newComplementOf != null)
				msgs = ((InternalEObject)newComplementOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF, null, msgs);
			msgs = basicSetComplementOf(newComplementOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF, newComplementOf, newComplementOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF:
				return basicSetComplementOf(null, msgs);
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
			case OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF:
				return getComplementOf();
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
			case OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF:
				setComplementOf((ClassExpression)newValue);
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
			case OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF:
				setComplementOf((ClassExpression)null);
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
			case OWLPackage.OBJECT_COMPLEMENT_OF__COMPLEMENT_OF:
				return complementOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectComplementOfImpl
