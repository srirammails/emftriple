/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.semweb.jobs.JOBPackage;
import com.semweb.jobs.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getDepiction <em>Depiction</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.PlaceImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends ExternalElementImpl implements Place {
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
	 * The default value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected String homePage = HOME_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected String population = POPULATION_EDEFAULT;

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
	public String getHomePage() {
		return homePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomePage(String newHomePage) {
		String oldHomePage = homePage;
		homePage = newHomePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__HOME_PAGE, oldHomePage, homePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(String newPopulation) {
		String oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.PLACE__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JOBPackage.PLACE__DEPICTION:
				return getDepiction();
			case JOBPackage.PLACE__HOME_PAGE:
				return getHomePage();
			case JOBPackage.PLACE__POPULATION:
				return getPopulation();
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
			case JOBPackage.PLACE__DEPICTION:
				setDepiction((String)newValue);
				return;
			case JOBPackage.PLACE__HOME_PAGE:
				setHomePage((String)newValue);
				return;
			case JOBPackage.PLACE__POPULATION:
				setPopulation((String)newValue);
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
			case JOBPackage.PLACE__DEPICTION:
				setDepiction(DEPICTION_EDEFAULT);
				return;
			case JOBPackage.PLACE__HOME_PAGE:
				setHomePage(HOME_PAGE_EDEFAULT);
				return;
			case JOBPackage.PLACE__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
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
			case JOBPackage.PLACE__DEPICTION:
				return DEPICTION_EDEFAULT == null ? depiction != null : !DEPICTION_EDEFAULT.equals(depiction);
			case JOBPackage.PLACE__HOME_PAGE:
				return HOME_PAGE_EDEFAULT == null ? homePage != null : !HOME_PAGE_EDEFAULT.equals(homePage);
			case JOBPackage.PLACE__POPULATION:
				return POPULATION_EDEFAULT == null ? population != null : !POPULATION_EDEFAULT.equals(population);
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
		result.append(" (depiction: ");
		result.append(depiction);
		result.append(", homePage: ");
		result.append(homePage);
		result.append(", population: ");
		result.append(population);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
