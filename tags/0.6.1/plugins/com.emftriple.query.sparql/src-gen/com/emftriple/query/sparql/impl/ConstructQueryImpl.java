/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.SparqlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.ConstructQueryImpl#getConstructTemplate <em>Construct Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructQueryImpl extends SelectionQueryImpl implements ConstructQuery
{
  /**
   * The cached value of the '{@link #getConstructTemplate() <em>Construct Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructTemplate()
   * @generated
   * @ordered
   */
  protected GroupGraphPattern constructTemplate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructQueryImpl()
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
    return SparqlPackage.Literals.CONSTRUCT_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupGraphPattern getConstructTemplate()
  {
    return constructTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstructTemplate(GroupGraphPattern newConstructTemplate, NotificationChain msgs)
  {
    GroupGraphPattern oldConstructTemplate = constructTemplate;
    constructTemplate = newConstructTemplate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE, oldConstructTemplate, newConstructTemplate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructTemplate(GroupGraphPattern newConstructTemplate)
  {
    if (newConstructTemplate != constructTemplate)
    {
      NotificationChain msgs = null;
      if (constructTemplate != null)
        msgs = ((InternalEObject)constructTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE, null, msgs);
      if (newConstructTemplate != null)
        msgs = ((InternalEObject)newConstructTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE, null, msgs);
      msgs = basicSetConstructTemplate(newConstructTemplate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE, newConstructTemplate, newConstructTemplate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE:
        return basicSetConstructTemplate(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE:
        return getConstructTemplate();
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
      case SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE:
        setConstructTemplate((GroupGraphPattern)newValue);
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
      case SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE:
        setConstructTemplate((GroupGraphPattern)null);
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
      case SparqlPackage.CONSTRUCT_QUERY__CONSTRUCT_TEMPLATE:
        return constructTemplate != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstructQueryImpl
