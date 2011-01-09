/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectUnionOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Union Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectUnionOfImpl#getUnionOf <em>Union Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectUnionOfImpl extends ClassExpressionImpl implements ObjectUnionOf {
	/**
	 * The cached value of the '{@link #getUnionOf() <em>Union Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> unionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectUnionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_UNION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getUnionOf() {
		if (unionOf == null) {
			unionOf = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, OWLPackage.OBJECT_UNION_OF__UNION_OF);
		}
		return unionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_UNION_OF__UNION_OF:
				return ((InternalEList<?>)getUnionOf()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.OBJECT_UNION_OF__UNION_OF:
				return getUnionOf();
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
			case OWLPackage.OBJECT_UNION_OF__UNION_OF:
				getUnionOf().clear();
				getUnionOf().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.OBJECT_UNION_OF__UNION_OF:
				getUnionOf().clear();
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
			case OWLPackage.OBJECT_UNION_OF__UNION_OF:
				return unionOf != null && !unionOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectUnionOfImpl
