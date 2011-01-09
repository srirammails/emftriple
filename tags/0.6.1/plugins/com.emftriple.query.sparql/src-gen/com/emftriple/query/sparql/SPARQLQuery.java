/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPARQL Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.SPARQLQuery#getPrefixes <em>Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getSPARQLQuery()
 * @model
 * @generated
 */
public interface SPARQLQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefixes</b></em>' containment reference list.
   * The list contents are of type {@link com.emftriple.query.sparql.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefixes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefixes</em>' containment reference list.
   * @see com.emftriple.query.sparql.SparqlPackage#getSPARQLQuery_Prefixes()
   * @model containment="true"
   * @generated
   */
  EList<Prefix> getPrefixes();

} // SPARQLQuery
