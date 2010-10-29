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

import com.emf4sw.owl.AnnotationPropertyRange;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.AnnotationPropertyRangeImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationPropertyRangeImpl extends AnnotationAxiomImpl implements AnnotationPropertyRange {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EntityExpression range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationPropertyRangeImpl() {
		super();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.ANNOTATION_PROPERTY_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityExpression getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(EntityExpression newRange, NotificationChain msgs) {
		EntityExpression oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(EntityExpression newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE:
				return basicSetRange(null, msgs);
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
			case OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE:
				return getRange();
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
			case OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE:
				setRange((EntityExpression)newValue);
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
			case OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE:
				setRange((EntityExpression)null);
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
			case OWLPackage.ANNOTATION_PROPERTY_RANGE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationPropertyRangeImpl
