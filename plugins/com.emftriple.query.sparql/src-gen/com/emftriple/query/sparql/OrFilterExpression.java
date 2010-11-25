/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.OrFilterExpression#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getOrFilterExpression()
 * @model
 * @generated
 */
public interface OrFilterExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getOrFilterExpression_Entries()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getEntries();

} // OrFilterExpression