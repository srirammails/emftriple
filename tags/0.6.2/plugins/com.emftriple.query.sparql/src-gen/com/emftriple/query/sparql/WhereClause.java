/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.WhereClause#getGroupGraphPattern <em>Group Graph Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Graph Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Graph Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Graph Pattern</em>' containment reference.
   * @see #setGroupGraphPattern(GroupGraphPattern)
   * @see com.emftriple.query.sparql.SparqlPackage#getWhereClause_GroupGraphPattern()
   * @model containment="true"
   * @generated
   */
  GroupGraphPattern getGroupGraphPattern();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.WhereClause#getGroupGraphPattern <em>Group Graph Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Graph Pattern</em>' containment reference.
   * @see #getGroupGraphPattern()
   * @generated
   */
  void setGroupGraphPattern(GroupGraphPattern value);

} // WhereClause
