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
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.EquivalentClassesImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.EquivalentClassesImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentClassesImpl extends ClassExpressionAxiomImpl implements EquivalentClasses {
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
	 * The cached value of the '{@link #getEquivalentClasses() <em>Equivalent Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> equivalentClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentClassesImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.EQUIVALENT_CLASSES;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.EQUIVALENT_CLASSES__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.EQUIVALENT_CLASSES__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.EQUIVALENT_CLASSES__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.EQUIVALENT_CLASSES__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getEquivalentClasses() {
		if (equivalentClasses == null) {
			equivalentClasses = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES);
		}
		return equivalentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.EQUIVALENT_CLASSES__EXPRESSION:
				return basicSetExpression(null, msgs);
			case OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES:
				return ((InternalEList<?>)getEquivalentClasses()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.EQUIVALENT_CLASSES__EXPRESSION:
				return getExpression();
			case OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES:
				return getEquivalentClasses();
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
			case OWLPackage.EQUIVALENT_CLASSES__EXPRESSION:
				setExpression((ClassExpression)newValue);
				return;
			case OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				getEquivalentClasses().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OWLPackage.EQUIVALENT_CLASSES__EXPRESSION:
				setExpression((ClassExpression)null);
				return;
			case OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
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
			case OWLPackage.EQUIVALENT_CLASSES__EXPRESSION:
				return expression != null;
			case OWLPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASSES:
				return equivalentClasses != null && !equivalentClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquivalentClassesImpl
