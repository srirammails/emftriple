/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emftriple.config.annotations.AccessType;
import com.emftriple.config.annotations.EntityMapping;
import com.emftriple.config.annotations.EntityType;
import com.emftriple.config.annotations.NamedNativeQueryType;
import com.emftriple.config.annotations.NamedQueryType;
import com.emftriple.config.annotations.OTMPackage;
import com.emftriple.config.annotations.PersistenceUnitMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.emftriple.config.annotations.impl.EntityMappingImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityMappingImpl extends MinimalEObjectImpl.Container implements EntityMapping {
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
	 * The cached value of the '{@link #getPersistenceUnitMetadata() <em>Persistence Unit Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 * @ordered
	 */
	protected PersistenceUnitMetadata persistenceUnitMetadata;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
	 * This is true if the Access attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessESet;

	/**
	 * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedQueryType> namedQuery;

	/**
	 * The cached value of the '{@link #getNamedNativeQuery() <em>Named Native Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedNativeQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedNativeQueryType> namedNativeQuery;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> entity;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OTMPackage.Literals.ENTITY_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitMetadata getPersistenceUnitMetadata() {
		return persistenceUnitMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata, NotificationChain msgs) {
		PersistenceUnitMetadata oldPersistenceUnitMetadata = persistenceUnitMetadata;
		persistenceUnitMetadata = newPersistenceUnitMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA, oldPersistenceUnitMetadata, newPersistenceUnitMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata) {
		if (newPersistenceUnitMetadata != persistenceUnitMetadata) {
			NotificationChain msgs = null;
			if (persistenceUnitMetadata != null)
				msgs = ((InternalEObject)persistenceUnitMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA, null, msgs);
			if (newPersistenceUnitMetadata != null)
				msgs = ((InternalEObject)newPersistenceUnitMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA, null, msgs);
			msgs = basicSetPersistenceUnitMetadata(newPersistenceUnitMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA, newPersistenceUnitMetadata, newPersistenceUnitMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		boolean oldAccessESet = accessESet;
		accessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__ACCESS, oldAccess, access, !oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccess() {
		AccessType oldAccess = access;
		boolean oldAccessESet = accessESet;
		access = ACCESS_EDEFAULT;
		accessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OTMPackage.ENTITY_MAPPING__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccess() {
		return accessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedQueryType> getNamedQuery() {
		if (namedQuery == null) {
			namedQuery = new EObjectContainmentEList<NamedQueryType>(NamedQueryType.class, this, OTMPackage.ENTITY_MAPPING__NAMED_QUERY);
		}
		return namedQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedNativeQueryType> getNamedNativeQuery() {
		if (namedNativeQuery == null) {
			namedNativeQuery = new EObjectContainmentEList<NamedNativeQueryType>(NamedNativeQueryType.class, this, OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY);
		}
		return namedNativeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<EntityType>(EntityType.class, this, OTMPackage.ENTITY_MAPPING__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OTMPackage.ENTITY_MAPPING__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OTMPackage.ENTITY_MAPPING__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA:
				return basicSetPersistenceUnitMetadata(null, msgs);
			case OTMPackage.ENTITY_MAPPING__NAMED_QUERY:
				return ((InternalEList<?>)getNamedQuery()).basicRemove(otherEnd, msgs);
			case OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY:
				return ((InternalEList<?>)getNamedNativeQuery()).basicRemove(otherEnd, msgs);
			case OTMPackage.ENTITY_MAPPING__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
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
			case OTMPackage.ENTITY_MAPPING__DESCRIPTION:
				return getDescription();
			case OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA:
				return getPersistenceUnitMetadata();
			case OTMPackage.ENTITY_MAPPING__PACKAGE:
				return getPackage();
			case OTMPackage.ENTITY_MAPPING__SCHEMA:
				return getSchema();
			case OTMPackage.ENTITY_MAPPING__CATALOG:
				return getCatalog();
			case OTMPackage.ENTITY_MAPPING__ACCESS:
				return getAccess();
			case OTMPackage.ENTITY_MAPPING__NAMED_QUERY:
				return getNamedQuery();
			case OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY:
				return getNamedNativeQuery();
			case OTMPackage.ENTITY_MAPPING__ENTITY:
				return getEntity();
			case OTMPackage.ENTITY_MAPPING__VERSION:
				return getVersion();
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
			case OTMPackage.ENTITY_MAPPING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA:
				setPersistenceUnitMetadata((PersistenceUnitMetadata)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__PACKAGE:
				setPackage((String)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__SCHEMA:
				setSchema((String)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__CATALOG:
				setCatalog((String)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__NAMED_QUERY:
				getNamedQuery().clear();
				getNamedQuery().addAll((Collection<? extends NamedQueryType>)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				getNamedNativeQuery().addAll((Collection<? extends NamedNativeQueryType>)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case OTMPackage.ENTITY_MAPPING__VERSION:
				setVersion((String)newValue);
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
			case OTMPackage.ENTITY_MAPPING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA:
				setPersistenceUnitMetadata((PersistenceUnitMetadata)null);
				return;
			case OTMPackage.ENTITY_MAPPING__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case OTMPackage.ENTITY_MAPPING__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case OTMPackage.ENTITY_MAPPING__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case OTMPackage.ENTITY_MAPPING__ACCESS:
				unsetAccess();
				return;
			case OTMPackage.ENTITY_MAPPING__NAMED_QUERY:
				getNamedQuery().clear();
				return;
			case OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				return;
			case OTMPackage.ENTITY_MAPPING__ENTITY:
				getEntity().clear();
				return;
			case OTMPackage.ENTITY_MAPPING__VERSION:
				unsetVersion();
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
			case OTMPackage.ENTITY_MAPPING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OTMPackage.ENTITY_MAPPING__PERSISTENCE_UNIT_METADATA:
				return persistenceUnitMetadata != null;
			case OTMPackage.ENTITY_MAPPING__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case OTMPackage.ENTITY_MAPPING__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case OTMPackage.ENTITY_MAPPING__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case OTMPackage.ENTITY_MAPPING__ACCESS:
				return isSetAccess();
			case OTMPackage.ENTITY_MAPPING__NAMED_QUERY:
				return namedQuery != null && !namedQuery.isEmpty();
			case OTMPackage.ENTITY_MAPPING__NAMED_NATIVE_QUERY:
				return namedNativeQuery != null && !namedNativeQuery.isEmpty();
			case OTMPackage.ENTITY_MAPPING__ENTITY:
				return entity != null && !entity.isEmpty();
			case OTMPackage.ENTITY_MAPPING__VERSION:
				return isSetVersion();
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
		result.append(", package: ");
		result.append(package_);
		result.append(", schema: ");
		result.append(schema);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EntityMappingImpl
