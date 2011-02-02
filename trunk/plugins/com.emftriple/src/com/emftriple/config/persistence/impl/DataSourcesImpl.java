/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emftriple.config.persistence.DataSourceConfig;
import com.emftriple.config.persistence.DataSources;
import com.emftriple.config.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Sources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourcesImpl#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourcesImpl extends MinimalEObjectImpl.Container implements DataSources {
	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceConfig> dataSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DATA_SOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceConfig> getDataSources() {
		if (dataSources == null) {
			dataSources = new EObjectContainmentEList<DataSourceConfig>(DataSourceConfig.class, this, PersistencePackage.DATA_SOURCES__DATA_SOURCES);
		}
		return dataSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.DATA_SOURCES__DATA_SOURCES:
				return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.DATA_SOURCES__DATA_SOURCES:
				return getDataSources();
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
			case PersistencePackage.DATA_SOURCES__DATA_SOURCES:
				getDataSources().clear();
				getDataSources().addAll((Collection<? extends DataSourceConfig>)newValue);
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
			case PersistencePackage.DATA_SOURCES__DATA_SOURCES:
				getDataSources().clear();
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
			case PersistencePackage.DATA_SOURCES__DATA_SOURCES:
				return dataSources != null && !dataSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourcesImpl
