/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql.impl;

import com.emftriple.query.sparql.DatasetClause;
import com.emftriple.query.sparql.IRI;
import com.emftriple.query.sparql.SparqlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.impl.DatasetClauseImpl#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatasetClauseImpl extends MinimalEObjectImpl.Container implements DatasetClause
{
  /**
   * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSet()
   * @generated
   * @ordered
   */
  protected IRI dataSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatasetClauseImpl()
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
    return SparqlPackage.Literals.DATASET_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getDataSet()
  {
    return dataSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataSet(IRI newDataSet, NotificationChain msgs)
  {
    IRI oldDataSet = dataSet;
    dataSet = newDataSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlPackage.DATASET_CLAUSE__DATA_SET, oldDataSet, newDataSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataSet(IRI newDataSet)
  {
    if (newDataSet != dataSet)
    {
      NotificationChain msgs = null;
      if (dataSet != null)
        msgs = ((InternalEObject)dataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DATASET_CLAUSE__DATA_SET, null, msgs);
      if (newDataSet != null)
        msgs = ((InternalEObject)newDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlPackage.DATASET_CLAUSE__DATA_SET, null, msgs);
      msgs = basicSetDataSet(newDataSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlPackage.DATASET_CLAUSE__DATA_SET, newDataSet, newDataSet));
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
      case SparqlPackage.DATASET_CLAUSE__DATA_SET:
        return basicSetDataSet(null, msgs);
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
      case SparqlPackage.DATASET_CLAUSE__DATA_SET:
        return getDataSet();
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
      case SparqlPackage.DATASET_CLAUSE__DATA_SET:
        setDataSet((IRI)newValue);
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
      case SparqlPackage.DATASET_CLAUSE__DATA_SET:
        setDataSet((IRI)null);
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
      case SparqlPackage.DATASET_CLAUSE__DATA_SET:
        return dataSet != null;
    }
    return super.eIsSet(featureID);
  }

} //DatasetClauseImpl
