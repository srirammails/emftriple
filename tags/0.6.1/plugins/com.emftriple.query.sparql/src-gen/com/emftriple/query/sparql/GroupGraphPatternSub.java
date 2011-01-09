/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Graph Pattern Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.GroupGraphPatternSub#getGraphPatterns <em>Graph Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getGroupGraphPatternSub()
 * @model
 * @generated
 */
public interface GroupGraphPatternSub extends GroupGraphPattern
{
  /**
   * Returns the value of the '<em><b>Graph Patterns</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.GraphPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph Patterns</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getGroupGraphPatternSub_GraphPatterns()
   * @model containment="true"
   * @generated
   */
  EList<GraphPattern> getGraphPatterns();

} // GroupGraphPatternSub
