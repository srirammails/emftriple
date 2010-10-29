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

import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DisjointClasses;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DisjointClassesImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DisjointClassesImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisjointClassesImpl extends ClassExpressionAxiomImpl implements DisjointClasses {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression expression;

	/**
	 * The cached value of the '{@link #getDisjointClasses() <em>Disjoint Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> disjointClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointClassesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DISJOINT_CLASSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ClassExpression newExpression, NotificationChain msgs) {
		ClassExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DISJOINT_CLASSES__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ClassExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DISJOINT_CLASSES__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DISJOINT_CLASSES__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DISJOINT_CLASSES__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getDisjointClasses() {
		if (disjointClasses == null) {
			disjointClasses = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES);
		}
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DISJOINT_CLASSES__EXPRESSION:
				return basicSetExpression(null, msgs);
			case OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES:
				return ((InternalEList<?>)getDisjointClasses()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.DISJOINT_CLASSES__EXPRESSION:
				return getExpression();
			case OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES:
				return getDisjointClasses();
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
			case OWLPackage.DISJOINT_CLASSES__EXPRESSION:
				setExpression((ClassExpression)newValue);
				return;
			case OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				getDisjointClasses().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.DISJOINT_CLASSES__EXPRESSION:
				setExpression((ClassExpression)null);
				return;
			case OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES:
				getDisjointClasses().clear();
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
			case OWLPackage.DISJOINT_CLASSES__EXPRESSION:
				return expression != null;
			case OWLPackage.DISJOINT_CLASSES__DISJOINT_CLASSES:
				return disjointClasses != null && !disjointClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisjointClassesImpl
