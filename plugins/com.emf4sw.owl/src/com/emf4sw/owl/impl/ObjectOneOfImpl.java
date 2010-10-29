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

import com.emf4sw.owl.Individual;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectOneOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object One Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.ObjectOneOfImpl#getOneOf <em>One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectOneOfImpl extends ClassExpressionImpl implements ObjectOneOf {
	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> oneOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOneOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.OBJECT_ONE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectContainmentEList<Individual>(Individual.class, this, OWLPackage.OBJECT_ONE_OF__ONE_OF);
		}
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.OBJECT_ONE_OF__ONE_OF:
				return ((InternalEList<?>)getOneOf()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.OBJECT_ONE_OF__ONE_OF:
				return getOneOf();
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
			case OWLPackage.OBJECT_ONE_OF__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends Individual>)newValue);
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
			case OWLPackage.OBJECT_ONE_OF__ONE_OF:
				getOneOf().clear();
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
			case OWLPackage.OBJECT_ONE_OF__ONE_OF:
				return oneOf != null && !oneOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectOneOfImpl
