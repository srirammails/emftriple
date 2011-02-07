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

import com.emf4sw.owl.DataPropertyAssertion;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyAssertionImpl#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.DataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyAssertionImpl extends AssertionImpl implements DataPropertyAssertion {
	/**
	 * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression dataProperty;

	/**
	 * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual sourceIndividual;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Literal targetValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.DATA_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getDataProperty() {
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProperty(DataPropertyExpression newDataProperty, NotificationChain msgs) {
		DataPropertyExpression oldDataProperty = dataProperty;
		dataProperty = newDataProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, oldDataProperty, newDataProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProperty(DataPropertyExpression newDataProperty) {
		if (newDataProperty != dataProperty) {
			NotificationChain msgs = null;
			if (dataProperty != null)
				msgs = ((InternalEObject)dataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, null, msgs);
			if (newDataProperty != null)
				msgs = ((InternalEObject)newDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, null, msgs);
			msgs = basicSetDataProperty(newDataProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY, newDataProperty, newDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getSourceIndividual() {
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIndividual(Individual newSourceIndividual, NotificationChain msgs) {
		Individual oldSourceIndividual = sourceIndividual;
		sourceIndividual = newSourceIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIndividual(Individual newSourceIndividual) {
		if (newSourceIndividual != sourceIndividual) {
			NotificationChain msgs = null;
			if (sourceIndividual != null)
				msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
			if (newSourceIndividual != null)
				msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
			msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetValue(Literal newTargetValue, NotificationChain msgs) {
		Literal oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, newTargetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(Literal newTargetValue) {
		if (newTargetValue != targetValue) {
			NotificationChain msgs = null;
			if (targetValue != null)
				msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
			if (newTargetValue != null)
				msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
			msgs = basicSetTargetValue(newTargetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, newTargetValue, newTargetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return basicSetDataProperty(null, msgs);
			case OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return basicSetSourceIndividual(null, msgs);
			case OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				return basicSetTargetValue(null, msgs);
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
			case OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return getDataProperty();
			case OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return getSourceIndividual();
			case OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				return getTargetValue();
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
			case OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				setDataProperty((DataPropertyExpression)newValue);
				return;
			case OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)newValue);
				return;
			case OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Literal)newValue);
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
			case OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				setDataProperty((DataPropertyExpression)null);
				return;
			case OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)null);
				return;
			case OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Literal)null);
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
			case OWLPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY:
				return dataProperty != null;
			case OWLPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return sourceIndividual != null;
			case OWLPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				return targetValue != null;
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyAssertionImpl
