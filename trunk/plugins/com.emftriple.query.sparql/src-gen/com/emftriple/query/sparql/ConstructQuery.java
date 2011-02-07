/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.ConstructQuery#getConstructTemplate <em>Construct Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getConstructQuery()
 * @model
 * @generated
 */
public interface ConstructQuery extends SelectionQuery
{
  /**
   * Returns the value of the '<em><b>Construct Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct Template</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Construct Template</em>' containment reference.
   * @see #setConstructTemplate(GroupGraphPattern)
   * @see com.emftriple.query.sparql.SparqlPackage#getConstructQuery_ConstructTemplate()
   * @model containment="true"
   * @generated
   */
  GroupGraphPattern getConstructTemplate();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.ConstructQuery#getConstructTemplate <em>Construct Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct Template</em>' containment reference.
   * @see #getConstructTemplate()
   * @generated
   */
  void setConstructTemplate(GroupGraphPattern value);

} // ConstructQuery
