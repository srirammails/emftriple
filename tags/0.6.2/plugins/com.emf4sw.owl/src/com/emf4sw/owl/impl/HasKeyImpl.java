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
import com.emf4sw.owl.HasKey;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.HasKeyImpl#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasKeyImpl extends AxiomImpl implements HasKey {
	/**
	 * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExpression()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression classExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasKeyImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.HAS_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getClassExpression() {
		return classExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs) {
		ClassExpression oldClassExpression = classExpression;
		classExpression = newClassExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.HAS_KEY__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassExpression(ClassExpression newClassExpression) {
		if (newClassExpression != classExpression) {
			NotificationChain msgs = null;
			if (classExpression != null)
				msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
			if (newClassExpression != null)
				msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
			msgs = basicSetClassExpression(newClassExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.HAS_KEY__CLASS_EXPRESSION, newClassExpression, newClassExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.HAS_KEY__CLASS_EXPRESSION:
				return basicSetClassExpression(null, msgs);
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
			case OWLPackage.HAS_KEY__CLASS_EXPRESSION:
				return getClassExpression();
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
			case OWLPackage.HAS_KEY__CLASS_EXPRESSION:
				setClassExpression((ClassExpression)newValue);
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
			case OWLPackage.HAS_KEY__CLASS_EXPRESSION:
				setClassExpression((ClassExpression)null);
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
			case OWLPackage.HAS_KEY__CLASS_EXPRESSION:
				return classExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //HasKeyImpl
