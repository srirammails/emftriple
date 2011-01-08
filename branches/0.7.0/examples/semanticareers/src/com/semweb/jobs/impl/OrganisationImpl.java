/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.semweb.jobs.JOBPackage;
import com.semweb.jobs.Organisation;
import com.semweb.jobs.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getFormationYear <em>Formation Year</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.OrganisationImpl#getNumEmployees <em>Num Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationImpl extends ExternalElementImpl implements Organisation {
	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected String logo = LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final String REVENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected String revenue = REVENUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> products;

	/**
	 * The default value of the '{@link #getFormationYear() <em>Formation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormationYear()
	 * @generated
	 * @ordered
	 */
	protected static final Date FORMATION_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormationYear() <em>Formation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormationYear()
	 * @generated
	 * @ordered
	 */
	protected Date formationYear = FORMATION_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Place location;

	/**
	 * The default value of the '{@link #getNumEmployees() <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_EMPLOYEES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumEmployees() <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEmployees()
	 * @generated
	 * @ordered
	 */
	protected String numEmployees = NUM_EMPLOYEES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JOBPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogo(String newLogo) {
		String oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.ORGANISATION__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(String newRevenue) {
		String oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.ORGANISATION__REVENUE, oldRevenue, revenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProducts() {
		if (products == null) {
			products = new EDataTypeUniqueEList<String>(String.class, this, JOBPackage.ORGANISATION__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFormationYear() {
		return formationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormationYear(Date newFormationYear) {
		Date oldFormationYear = formationYear;
		formationYear = newFormationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.ORGANISATION__FORMATION_YEAR, oldFormationYear, formationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Place)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JOBPackage.ORGANISATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Place newLocation) {
		Place oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.ORGANISATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumEmployees() {
		return numEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumEmployees(String newNumEmployees) {
		String oldNumEmployees = numEmployees;
		numEmployees = newNumEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.ORGANISATION__NUM_EMPLOYEES, oldNumEmployees, numEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JOBPackage.ORGANISATION__LOGO:
				return getLogo();
			case JOBPackage.ORGANISATION__REVENUE:
				return getRevenue();
			case JOBPackage.ORGANISATION__PRODUCTS:
				return getProducts();
			case JOBPackage.ORGANISATION__FORMATION_YEAR:
				return getFormationYear();
			case JOBPackage.ORGANISATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case JOBPackage.ORGANISATION__NUM_EMPLOYEES:
				return getNumEmployees();
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
			case JOBPackage.ORGANISATION__LOGO:
				setLogo((String)newValue);
				return;
			case JOBPackage.ORGANISATION__REVENUE:
				setRevenue((String)newValue);
				return;
			case JOBPackage.ORGANISATION__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends String>)newValue);
				return;
			case JOBPackage.ORGANISATION__FORMATION_YEAR:
				setFormationYear((Date)newValue);
				return;
			case JOBPackage.ORGANISATION__LOCATION:
				setLocation((Place)newValue);
				return;
			case JOBPackage.ORGANISATION__NUM_EMPLOYEES:
				setNumEmployees((String)newValue);
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
			case JOBPackage.ORGANISATION__LOGO:
				setLogo(LOGO_EDEFAULT);
				return;
			case JOBPackage.ORGANISATION__REVENUE:
				setRevenue(REVENUE_EDEFAULT);
				return;
			case JOBPackage.ORGANISATION__PRODUCTS:
				getProducts().clear();
				return;
			case JOBPackage.ORGANISATION__FORMATION_YEAR:
				setFormationYear(FORMATION_YEAR_EDEFAULT);
				return;
			case JOBPackage.ORGANISATION__LOCATION:
				setLocation((Place)null);
				return;
			case JOBPackage.ORGANISATION__NUM_EMPLOYEES:
				setNumEmployees(NUM_EMPLOYEES_EDEFAULT);
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
			case JOBPackage.ORGANISATION__LOGO:
				return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
			case JOBPackage.ORGANISATION__REVENUE:
				return REVENUE_EDEFAULT == null ? revenue != null : !REVENUE_EDEFAULT.equals(revenue);
			case JOBPackage.ORGANISATION__PRODUCTS:
				return products != null && !products.isEmpty();
			case JOBPackage.ORGANISATION__FORMATION_YEAR:
				return FORMATION_YEAR_EDEFAULT == null ? formationYear != null : !FORMATION_YEAR_EDEFAULT.equals(formationYear);
			case JOBPackage.ORGANISATION__LOCATION:
				return location != null;
			case JOBPackage.ORGANISATION__NUM_EMPLOYEES:
				return NUM_EMPLOYEES_EDEFAULT == null ? numEmployees != null : !NUM_EMPLOYEES_EDEFAULT.equals(numEmployees);
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
		result.append(" (logo: ");
		result.append(logo);
		result.append(", revenue: ");
		result.append(revenue);
		result.append(", products: ");
		result.append(products);
		result.append(", formationYear: ");
		result.append(formationYear);
		result.append(", numEmployees: ");
		result.append(numEmployees);
		result.append(')');
		return result.toString();
	}

} //OrganisationImpl
