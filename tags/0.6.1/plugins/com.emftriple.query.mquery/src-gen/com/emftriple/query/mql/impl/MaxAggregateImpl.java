/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql.impl;

import org.eclipse.emf.ecore.EClass;

import com.emftriple.query.mql.MaxAggregate;
import com.emftriple.query.mql.MqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaxAggregateImpl extends SelectAggregateExpressionImpl implements MaxAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxAggregateImpl()
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
    return MqlPackage.Literals.MAX_AGGREGATE;
  }

} //MaxAggregateImpl
