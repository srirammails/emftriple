/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence.impl;

import com.emftriple.config.persistence.Federation;
import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.config.persistence.PersistenceUnit;
import com.emftriple.config.persistence.Properties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.PersistenceUnitImpl#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceUnitImpl extends MinimalEObjectImpl.Container implements PersistenceUnit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> package_;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected Federation dataSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PERSISTENCE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackage() {
		if (package_ == null) {
			package_ = new EDataTypeEList<String>(String.class, this, PersistencePackage.PERSISTENCE_UNIT__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_UNIT__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_UNIT__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federation getDataSources() {
		return dataSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSources(Federation newDataSources, NotificationChain msgs) {
		Federation oldDataSources = dataSources;
		dataSources = newDataSources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES, oldDataSources, newDataSources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSources(Federation newDataSources) {
		if (newDataSources != dataSources) {
			NotificationChain msgs = null;
			if (dataSources != null)
				msgs = ((InternalEObject)dataSources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES, null, msgs);
			if (newDataSources != null)
				msgs = ((InternalEObject)newDataSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES, null, msgs);
			msgs = basicSetDataSources(newDataSources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES, newDataSources, newDataSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE_UNIT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES:
				return basicSetDataSources(null, msgs);
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
			case PersistencePackage.PERSISTENCE_UNIT__NAME:
				return getName();
			case PersistencePackage.PERSISTENCE_UNIT__DESCRIPTION:
				return getDescription();
			case PersistencePackage.PERSISTENCE_UNIT__PROVIDER:
				return getProvider();
			case PersistencePackage.PERSISTENCE_UNIT__PACKAGE:
				return getPackage();
			case PersistencePackage.PERSISTENCE_UNIT__PROPERTIES:
				return getProperties();
			case PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES:
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
			case PersistencePackage.PERSISTENCE_UNIT__NAME:
				setName((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PROVIDER:
				setProvider((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES:
				setDataSources((Federation)newValue);
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
			case PersistencePackage.PERSISTENCE_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PACKAGE:
				getPackage().clear();
				return;
			case PersistencePackage.PERSISTENCE_UNIT__PROPERTIES:
				setProperties((Properties)null);
				return;
			case PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES:
				setDataSources((Federation)null);
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
			case PersistencePackage.PERSISTENCE_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersistencePackage.PERSISTENCE_UNIT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PersistencePackage.PERSISTENCE_UNIT__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case PersistencePackage.PERSISTENCE_UNIT__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case PersistencePackage.PERSISTENCE_UNIT__PROPERTIES:
				return properties != null;
			case PersistencePackage.PERSISTENCE_UNIT__DATA_SOURCES:
				return dataSources != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", provider: ");
		result.append(provider);
		result.append(", package: ");
		result.append(package_);
		result.append(')');
		return result.toString();
	}

} //PersistenceUnitImpl
