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
import com.emf4sw.owl.ObjectIntersectionOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectIntersectionOfImpl#getIntersectionOf <em>Intersection Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIntersectionOfImpl extends ClassExpressionImpl implements ObjectIntersectionOf {
	/**
	 * The cached value of the '{@link #getIntersectionOf() <em>Intersection Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> intersectionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectIntersectionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_INTERSECTION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getIntersectionOf() {
		if (intersectionOf == null) {
			intersectionOf = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF);
		}
		return intersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF:
				return ((InternalEList<?>)getIntersectionOf()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF:
				return getIntersectionOf();
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
			case OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF:
				getIntersectionOf().clear();
				getIntersectionOf().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF:
				getIntersectionOf().clear();
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
			case OWLPackage.OBJECT_INTERSECTION_OF__INTERSECTION_OF:
				return intersectionOf != null && !intersectionOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectIntersectionOfImpl
