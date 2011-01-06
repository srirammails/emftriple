/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs.impl;

import com.semweb.jobs.JOBPackage;
import com.semweb.jobs.Place;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getWikiPage <em>Wiki Page</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getDepiction <em>Depiction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends EObjectImpl implements Place {
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
	 * The default value of the '{@link #getWikiPage() <em>Wiki Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiPage()
	 * @generated
	 * @ordered
	 */
	protected static final String WIKI_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWikiPage() <em>Wiki Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiPage()
	 * @generated
	 * @ordered
	 */
	protected String wikiPage = WIKI_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepiction() <em>Depiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepiction()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepiction() <em>Depiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepiction()
	 * @generated
	 * @ordered
	 */
	protected String depiction = DEPICTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JOBPackage.Literals.PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWikiPage() {
		return wikiPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWikiPage(String newWikiPage) {
		String oldWikiPage = wikiPage;
		wikiPage = newWikiPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__WIKI_PAGE, oldWikiPage, wikiPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepiction() {
		return depiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepiction(String newDepiction) {
		String oldDepiction = depiction;
		depiction = newDepiction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__DEPICTION, oldDepiction, depiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JOBPackage.PLACE__NAME:
				return getName();
			case JOBPackage.PLACE__DESCRIPTION:
				return getDescription();
			case JOBPackage.PLACE__WIKI_PAGE:
				return getWikiPage();
			case JOBPackage.PLACE__DEPICTION:
				return getDepiction();
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
			case JOBPackage.PLACE__NAME:
				setName((String)newValue);
				return;
			case JOBPackage.PLACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JOBPackage.PLACE__WIKI_PAGE:
				setWikiPage((String)newValue);
				return;
			case JOBPackage.PLACE__DEPICTION:
				setDepiction((String)newValue);
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
			case JOBPackage.PLACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JOBPackage.PLACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JOBPackage.PLACE__WIKI_PAGE:
				setWikiPage(WIKI_PAGE_EDEFAULT);
				return;
			case JOBPackage.PLACE__DEPICTION:
				setDepiction(DEPICTION_EDEFAULT);
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
			case JOBPackage.PLACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JOBPackage.PLACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case JOBPackage.PLACE__WIKI_PAGE:
				return WIKI_PAGE_EDEFAULT == null ? wikiPage != null : !WIKI_PAGE_EDEFAULT.equals(wikiPage);
			case JOBPackage.PLACE__DEPICTION:
				return DEPICTION_EDEFAULT == null ? depiction != null : !DEPICTION_EDEFAULT.equals(depiction);
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
		result.append(", wikiPage: ");
		result.append(wikiPage);
		result.append(", depiction: ");
		result.append(depiction);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
