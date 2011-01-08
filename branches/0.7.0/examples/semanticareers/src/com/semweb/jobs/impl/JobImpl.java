/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.semweb.jobs.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.semweb.jobs.JOBPackage;
import com.semweb.jobs.Job;
import com.semweb.jobs.Organisation;
import com.semweb.jobs.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getPosted <em>Posted</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link com.semweb.jobs.impl.JobImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobImpl extends EObjectImpl implements Job {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirements() <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected String requirements = REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkills() <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected String skills = SKILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosted()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosted()
	 * @generated
	 * @ordered
	 */
	protected Date posted = POSTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Organisation organisation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JOBPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(String newRequirements) {
		String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__REQUIREMENTS, oldRequirements, requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkills(String newSkills) {
		String oldSkills = skills;
		skills = newSkills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__SKILLS, oldSkills, skills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPosted() {
		return posted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosted(Date newPosted) {
		Date oldPosted = posted;
		posted = newPosted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__POSTED, oldPosted, posted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getOrganisation() {
		if (organisation != null && organisation.eIsProxy()) {
			InternalEObject oldOrganisation = (InternalEObject)organisation;
			organisation = (Organisation)eResolveProxy(oldOrganisation);
			if (organisation != oldOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JOBPackage.JOB__ORGANISATION, oldOrganisation, organisation));
			}
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation basicGetOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organisation newOrganisation) {
		Organisation oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__ORGANISATION, oldOrganisation, organisation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JOBPackage.JOB__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JOBPackage.JOB__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JOBPackage.JOB__ID:
				return getId();
			case JOBPackage.JOB__TITLE:
				return getTitle();
			case JOBPackage.JOB__SUMMARY:
				return getSummary();
			case JOBPackage.JOB__REQUIREMENTS:
				return getRequirements();
			case JOBPackage.JOB__SKILLS:
				return getSkills();
			case JOBPackage.JOB__POSTED:
				return getPosted();
			case JOBPackage.JOB__TYPE:
				return getType();
			case JOBPackage.JOB__ORGANISATION:
				if (resolve) return getOrganisation();
				return basicGetOrganisation();
			case JOBPackage.JOB__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case JOBPackage.JOB__ID:
				setId((String)newValue);
				return;
			case JOBPackage.JOB__TITLE:
				setTitle((String)newValue);
				return;
			case JOBPackage.JOB__SUMMARY:
				setSummary((String)newValue);
				return;
			case JOBPackage.JOB__REQUIREMENTS:
				setRequirements((String)newValue);
				return;
			case JOBPackage.JOB__SKILLS:
				setSkills((String)newValue);
				return;
			case JOBPackage.JOB__POSTED:
				setPosted((Date)newValue);
				return;
			case JOBPackage.JOB__TYPE:
				setType((String)newValue);
				return;
			case JOBPackage.JOB__ORGANISATION:
				setOrganisation((Organisation)newValue);
				return;
			case JOBPackage.JOB__LOCATION:
				setLocation((Place)newValue);
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
			case JOBPackage.JOB__ID:
				setId(ID_EDEFAULT);
				return;
			case JOBPackage.JOB__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case JOBPackage.JOB__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case JOBPackage.JOB__REQUIREMENTS:
				setRequirements(REQUIREMENTS_EDEFAULT);
				return;
			case JOBPackage.JOB__SKILLS:
				setSkills(SKILLS_EDEFAULT);
				return;
			case JOBPackage.JOB__POSTED:
				setPosted(POSTED_EDEFAULT);
				return;
			case JOBPackage.JOB__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JOBPackage.JOB__ORGANISATION:
				setOrganisation((Organisation)null);
				return;
			case JOBPackage.JOB__LOCATION:
				setLocation((Place)null);
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
			case JOBPackage.JOB__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JOBPackage.JOB__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case JOBPackage.JOB__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case JOBPackage.JOB__REQUIREMENTS:
				return REQUIREMENTS_EDEFAULT == null ? requirements != null : !REQUIREMENTS_EDEFAULT.equals(requirements);
			case JOBPackage.JOB__SKILLS:
				return SKILLS_EDEFAULT == null ? skills != null : !SKILLS_EDEFAULT.equals(skills);
			case JOBPackage.JOB__POSTED:
				return POSTED_EDEFAULT == null ? posted != null : !POSTED_EDEFAULT.equals(posted);
			case JOBPackage.JOB__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case JOBPackage.JOB__ORGANISATION:
				return organisation != null;
			case JOBPackage.JOB__LOCATION:
				return location != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", summary: ");
		result.append(summary);
		result.append(", requirements: ");
		result.append(requirements);
		result.append(", skills: ");
		result.append(skills);
		result.append(", posted: ");
		result.append(posted);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //JobImpl
