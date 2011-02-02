/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.emftriple.config.persistence.DataSourceConfig;
import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.config.persistence.Properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link com.emftriple.config.persistence.impl.DataSourceConfigImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceConfigImpl extends MinimalEObjectImpl.Container implements DataSourceConfig {
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
	 * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected String factory = FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> graphs;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Properties property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DATA_SOURCE_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(String newFactory) {
		String oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__FACTORY, oldFactory, factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGraphs() {
		if (graphs == null) {
			graphs = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.DATA_SOURCE_CONFIG__GRAPHS);
		}
		return graphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Properties newProperty, NotificationChain msgs) {
		Properties oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Properties newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case PersistencePackage.DATA_SOURCE_CONFIG__NAME:
				return getName();
			case PersistencePackage.DATA_SOURCE_CONFIG__FACTORY:
				return getFactory();
			case PersistencePackage.DATA_SOURCE_CONFIG__CLASS:
				return getClass_();
			case PersistencePackage.DATA_SOURCE_CONFIG__URL:
				return getUrl();
			case PersistencePackage.DATA_SOURCE_CONFIG__GRAPHS:
				return getGraphs();
			case PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY:
				return getProperty();
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
			case PersistencePackage.DATA_SOURCE_CONFIG__NAME:
				setName((String)newValue);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__FACTORY:
				setFactory((String)newValue);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__CLASS:
				setClass((String)newValue);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__GRAPHS:
				getGraphs().clear();
				getGraphs().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY:
				setProperty((Properties)newValue);
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
			case PersistencePackage.DATA_SOURCE_CONFIG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__FACTORY:
				setFactory(FACTORY_EDEFAULT);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__GRAPHS:
				getGraphs().clear();
				return;
			case PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY:
				setProperty((Properties)null);
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
			case PersistencePackage.DATA_SOURCE_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersistencePackage.DATA_SOURCE_CONFIG__FACTORY:
				return FACTORY_EDEFAULT == null ? factory != null : !FACTORY_EDEFAULT.equals(factory);
			case PersistencePackage.DATA_SOURCE_CONFIG__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case PersistencePackage.DATA_SOURCE_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case PersistencePackage.DATA_SOURCE_CONFIG__GRAPHS:
				return graphs != null && !graphs.isEmpty();
			case PersistencePackage.DATA_SOURCE_CONFIG__PROPERTY:
				return property != null;
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
		result.append(", factory: ");
		result.append(factory);
		result.append(", class: ");
		result.append(class_);
		result.append(", url: ");
		result.append(url);
		result.append(", graphs: ");
		result.append(graphs);
		result.append(')');
		return result.toString();
	}

} //DataSourceConfigImpl
