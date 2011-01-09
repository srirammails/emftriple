/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.ExistsPattern#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getExistsPattern()
 * @model
 * @generated
 */
public interface ExistsPattern extends GraphPattern
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(GroupGraphPattern)
   * @see com.emftriple.query.sparql.SparqlPackage#getExistsPattern_Pattern()
   * @model containment="true"
   * @generated
   */
  GroupGraphPattern getPattern();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ExistsPattern#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(GroupGraphPattern value);

} // ExistsPattern
