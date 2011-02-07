/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emftriple.config.annotations.NamedNativeQueryType;
import com.emftriple.config.annotations.OTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Native Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.NamedNativeQueryTypeImpl#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedNativeQueryTypeImpl extends QueryTypeImpl implements NamedNativeQueryType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
	protected String resultClass = RESULT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSetMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_SET_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSetMapping()
	 * @generated
	 * @ordered
	 */
	protected String resultSetMapping = RESULT_SET_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedNativeQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OTMPackage.Literals.NAMED_NATIVE_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.NAMED_NATIVE_QUERY_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.NAMED_NATIVE_QUERY_TYPE__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultClass() {
		return resultClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultClass(String newResultClass) {
		String oldResultClass = resultClass;
		resultClass = newResultClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS, oldResultClass, resultClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultSetMapping() {
		return resultSetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultSetMapping(String newResultSetMapping) {
		String oldResultSetMapping = resultSetMapping;
		resultSetMapping = newResultSetMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING, oldResultSetMapping, resultSetMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__DESCRIPTION:
				return getDescription();
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__QUERY:
				return getQuery();
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS:
				return getResultClass();
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING:
				return getResultSetMapping();
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
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__QUERY:
				setQuery((String)newValue);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS:
				setResultClass((String)newValue);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING:
				setResultSetMapping((String)newValue);
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
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS:
				setResultClass(RESULT_CLASS_EDEFAULT);
				return;
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING:
				setResultSetMapping(RESULT_SET_MAPPING_EDEFAULT);
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
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_CLASS:
				return RESULT_CLASS_EDEFAULT == null ? resultClass != null : !RESULT_CLASS_EDEFAULT.equals(resultClass);
			case OTMPackage.NAMED_NATIVE_QUERY_TYPE__RESULT_SET_MAPPING:
				return RESULT_SET_MAPPING_EDEFAULT == null ? resultSetMapping != null : !RESULT_SET_MAPPING_EDEFAULT.equals(resultSetMapping);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", query: ");
		result.append(query);
		result.append(", resultClass: ");
		result.append(resultClass);
		result.append(", resultSetMapping: ");
		result.append(resultSetMapping);
		result.append(')');
		return result.toString();
	}

} //NamedNativeQueryTypeImpl
