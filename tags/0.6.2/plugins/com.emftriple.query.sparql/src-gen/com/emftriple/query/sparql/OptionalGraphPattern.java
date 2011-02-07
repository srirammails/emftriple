/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Graph Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.OptionalGraphPattern#getGraphPattern <em>Graph Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getOptionalGraphPattern()
 * @model
 * @generated
 */
public interface OptionalGraphPattern extends GraphPattern
{
  /**
   * Returns the value of the '<em><b>Graph Pattern</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.GroupGraphPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph Pattern</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph Pattern</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getOptionalGraphPattern_GraphPattern()
   * @model containment="true"
   * @generated
   */
  EList<GroupGraphPattern> getGraphPattern();

} // OptionalGraphPattern
