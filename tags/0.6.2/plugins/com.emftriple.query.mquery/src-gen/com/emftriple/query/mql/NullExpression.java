/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.NullExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getNullExpression()
 * @model
 * @generated
 */
public interface NullExpression extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.emftriple.query.mql.MqlPackage#getNullExpression_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.NullExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // NullExpression
