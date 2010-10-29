/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.rdf.List;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.ListImpl#getFirst <em>First</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ListImpl#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends BlankNodeImpl implements List {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Node first;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected List rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Node)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.LIST__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(Node newFirst) {
		Node oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.LIST__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRest() {
		if (rest != null && rest.eIsProxy()) {
			InternalEObject oldRest = (InternalEObject)rest;
			rest = (List)eResolveProxy(oldRest);
			if (rest != oldRest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.LIST__REST, oldRest, rest));
			}
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List basicGetRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(List newRest) {
		List oldRest = rest;
		rest = newRest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.LIST__REST, oldRest, rest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.LIST__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case RDFPackage.LIST__REST:
				if (resolve) return getRest();
				return basicGetRest();
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
			case RDFPackage.LIST__FIRST:
				setFirst((Node)newValue);
				return;
			case RDFPackage.LIST__REST:
				setRest((List)newValue);
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
			case RDFPackage.LIST__FIRST:
				setFirst((Node)null);
				return;
			case RDFPackage.LIST__REST:
				setRest((List)null);
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
			case RDFPackage.LIST__FIRST:
				return first != null;
			case RDFPackage.LIST__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
