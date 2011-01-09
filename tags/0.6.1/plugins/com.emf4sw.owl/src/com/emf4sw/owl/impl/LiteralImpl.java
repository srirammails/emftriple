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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.OWLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.LiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.LiteralImpl#getDatatypeExpression <em>Datatype Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends MinimalEObjectImpl.Container implements Literal {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatatypeExpression() <em>Datatype Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeExpression()
	 * @generated
	 * @ordered
	 */
	protected EntityExpression datatypeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityExpression getDatatypeExpression() {
		return datatypeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatypeExpression(EntityExpression newDatatypeExpression, NotificationChain msgs) {
		EntityExpression oldDatatypeExpression = datatypeExpression;
		datatypeExpression = newDatatypeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLPackage.LITERAL__DATATYPE_EXPRESSION, oldDatatypeExpression, newDatatypeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeExpression(EntityExpression newDatatypeExpression) {
		if (newDatatypeExpression != datatypeExpression) {
			NotificationChain msgs = null;
			if (datatypeExpression != null)
				msgs = ((InternalEObject)datatypeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLPackage.LITERAL__DATATYPE_EXPRESSION, null, msgs);
			if (newDatatypeExpression != null)
				msgs = ((InternalEObject)newDatatypeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLPackage.LITERAL__DATATYPE_EXPRESSION, null, msgs);
			msgs = basicSetDatatypeExpression(newDatatypeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.LITERAL__DATATYPE_EXPRESSION, newDatatypeExpression, newDatatypeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.LITERAL__DATATYPE_EXPRESSION:
				return basicSetDatatypeExpression(null, msgs);
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
			case OWLPackage.LITERAL__VALUE:
				return getValue();
			case OWLPackage.LITERAL__DATATYPE_EXPRESSION:
				return getDatatypeExpression();
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
			case OWLPackage.LITERAL__VALUE:
				setValue((String)newValue);
				return;
			case OWLPackage.LITERAL__DATATYPE_EXPRESSION:
				setDatatypeExpression((EntityExpression)newValue);
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
			case OWLPackage.LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OWLPackage.LITERAL__DATATYPE_EXPRESSION:
				setDatatypeExpression((EntityExpression)null);
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
			case OWLPackage.LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OWLPackage.LITERAL__DATATYPE_EXPRESSION:
				return datatypeExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //LiteralImpl
