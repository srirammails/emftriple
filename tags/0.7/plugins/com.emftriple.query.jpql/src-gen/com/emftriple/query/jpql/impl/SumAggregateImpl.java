/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql.impl;

import com.emftriple.query.jpql.JpqlPackage;
import com.emftriple.query.jpql.SumAggregate;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SumAggregateImpl extends SelectAggregateExpressionImpl implements SumAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumAggregateImpl()
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
    return JpqlPackage.Literals.SUM_AGGREGATE;
  }

} //SumAggregateImpl
