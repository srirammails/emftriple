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

import com.emf4sw.owl.AnnotationPropertyExpression;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.SubAnnotationPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl#getSubAnnotationProperty <em>Sub Annotation Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl#getSuperAnnotationProperty <em>Super Annotation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubAnnotationPropertyOfImpl extends AnnotationAxiomImpl implements SubAnnotationPropertyOf {
	/**
	 * The cached value of the '{@link #getSubAnnotationProperty() <em>Sub Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationPropertyExpression subAnnotationProperty;

	/**
	 * The cached value of the '{@link #getSuperAnnotationProperty() <em>Super Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationPropertyExpression superAnnotationProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubAnnotationPropertyOfImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.SUB_ANNOTATION_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyExpression getSubAnnotationProperty() {
		return subAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubAnnotationProperty(AnnotationPropertyExpression newSubAnnotationProperty, NotificationChain msgs) {
		AnnotationPropertyExpression oldSubAnnotationProperty = subAnnotationProperty;
		subAnnotationProperty = newSubAnnotationProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, oldSubAnnotationProperty, newSubAnnotationProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubAnnotationProperty(AnnotationPropertyExpression newSubAnnotationProperty) {
		if (newSubAnnotationProperty != subAnnotationProperty) {
			NotificationChain msgs = null;
			if (subAnnotationProperty != null)
				msgs = ((InternalEObject)subAnnotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, null, msgs);
			if (newSubAnnotationProperty != null)
				msgs = ((InternalEObject)newSubAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, null, msgs);
			msgs = basicSetSubAnnotationProperty(newSubAnnotationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, newSubAnnotationProperty, newSubAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyExpression getSuperAnnotationProperty() {
		return superAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperAnnotationProperty(AnnotationPropertyExpression newSuperAnnotationProperty, NotificationChain msgs) {
		AnnotationPropertyExpression oldSuperAnnotationProperty = superAnnotationProperty;
		superAnnotationProperty = newSuperAnnotationProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, oldSuperAnnotationProperty, newSuperAnnotationProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperAnnotationProperty(AnnotationPropertyExpression newSuperAnnotationProperty) {
		if (newSuperAnnotationProperty != superAnnotationProperty) {
			NotificationChain msgs = null;
			if (superAnnotationProperty != null)
				msgs = ((InternalEObject)superAnnotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, null, msgs);
			if (newSuperAnnotationProperty != null)
				msgs = ((InternalEObject)newSuperAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, null, msgs);
			msgs = basicSetSuperAnnotationProperty(newSuperAnnotationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, newSuperAnnotationProperty, newSuperAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				return basicSetSubAnnotationProperty(null, msgs);
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				return basicSetSuperAnnotationProperty(null, msgs);
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
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				return getSubAnnotationProperty();
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				return getSuperAnnotationProperty();
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
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				setSubAnnotationProperty((AnnotationPropertyExpression)newValue);
				return;
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				setSuperAnnotationProperty((AnnotationPropertyExpression)newValue);
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
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				setSubAnnotationProperty((AnnotationPropertyExpression)null);
				return;
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				setSuperAnnotationProperty((AnnotationPropertyExpression)null);
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
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				return subAnnotationProperty != null;
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				return superAnnotationProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SubAnnotationPropertyOfImpl
