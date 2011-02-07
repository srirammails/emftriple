/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.Prefix;
import com.emftriple.query.sparql.SparqlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.PrefixImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.impl.PrefixImpl#getIref <em>Iref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixImpl extends MinimalEObjectImpl.Container implements Prefix
{
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
   * The default value of the '{@link #getIref() <em>Iref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIref()
   * @generated
   * @ordered
   */
  protected static final String IREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIref() <em>Iref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIref()
   * @generated
   * @ordered
   */
  protected String iref = IREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SparqlPackage.Literals.PREFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.PREFIX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIref()
  {
    return iref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIref(String newIref)
  {
    String oldIref = iref;
    iref = newIref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.PREFIX__IREF, oldIref, iref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SparqlPackage.PREFIX__NAME:
        return getName();
      case SparqlPackage.PREFIX__IREF:
        return getIref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlPackage.PREFIX__NAME:
        setName((String)newValue);
        return;
      case SparqlPackage.PREFIX__IREF:
        setIref((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SparqlPackage.PREFIX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SparqlPackage.PREFIX__IREF:
        setIref(IREF_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SparqlPackage.PREFIX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SparqlPackage.PREFIX__IREF:
        return IREF_EDEFAULT == null ? iref != null : !IREF_EDEFAULT.equals(iref);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", iref: ");
    result.append(iref);
    result.append(')');
    return result.toString();
  }

} //PrefixImpl
