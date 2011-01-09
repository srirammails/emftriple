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
import com.emf4sw.owl.SubClassOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.SubClassOfImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.SubClassOfImpl#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubClassOfImpl extends ClassExpressionAxiomImpl implements SubClassOf {
	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression subClass;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression superClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubClassOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.SUB_CLASS_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClass(ClassExpression newSubClass, NotificationChain msgs) {
		ClassExpression oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_CLASS_OF__SUB_CLASS, oldSubClass, newSubClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(ClassExpression newSubClass) {
		if (newSubClass != subClass) {
			NotificationChain msgs = null;
			if (subClass != null)
				msgs = ((InternalEObject)subClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_CLASS_OF__SUB_CLASS, null, msgs);
			if (newSubClass != null)
				msgs = ((InternalEObject)newSubClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_CLASS_OF__SUB_CLASS, null, msgs);
			msgs = basicSetSubClass(newSubClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_CLASS_OF__SUB_CLASS, newSubClass, newSubClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClass(ClassExpression newSuperClass, NotificationChain msgs) {
		ClassExpression oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_CLASS_OF__SUPER_CLASS, oldSuperClass, newSuperClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(ClassExpression newSuperClass) {
		if (newSuperClass != superClass) {
			NotificationChain msgs = null;
			if (superClass != null)
				msgs = ((InternalEObject)superClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_CLASS_OF__SUPER_CLASS, null, msgs);
			if (newSuperClass != null)
				msgs = ((InternalEObject)newSuperClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_CLASS_OF__SUPER_CLASS, null, msgs);
			msgs = basicSetSuperClass(newSuperClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_CLASS_OF__SUPER_CLASS, newSuperClass, newSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.SUB_CLASS_OF__SUB_CLASS:
				return basicSetSubClass(null, msgs);
			case OWLPackage.SUB_CLASS_OF__SUPER_CLASS:
				return basicSetSuperClass(null, msgs);
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
			case OWLPackage.SUB_CLASS_OF__SUB_CLASS:
				return getSubClass();
			case OWLPackage.SUB_CLASS_OF__SUPER_CLASS:
				return getSuperClass();
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
			case OWLPackage.SUB_CLASS_OF__SUB_CLASS:
				setSubClass((ClassExpression)newValue);
				return;
			case OWLPackage.SUB_CLASS_OF__SUPER_CLASS:
				setSuperClass((ClassExpression)newValue);
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
			case OWLPackage.SUB_CLASS_OF__SUB_CLASS:
				setSubClass((ClassExpression)null);
				return;
			case OWLPackage.SUB_CLASS_OF__SUPER_CLASS:
				setSuperClass((ClassExpression)null);
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
			case OWLPackage.SUB_CLASS_OF__SUB_CLASS:
				return subClass != null;
			case OWLPackage.SUB_CLASS_OF__SUPER_CLASS:
				return superClass != null;
		}
		return super.eIsSet(featureID);
	}

} //SubClassOfImpl
