/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.DatasetClause#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getDatasetClause()
 * @model
 * @generated
 */
public interface DatasetClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Set</em>' containment reference.
   * @see #setDataSet(IRI)
   * @see com.emftriple.query.sparql.SparqlPackage#getDatasetClause_DataSet()
   * @model containment="true"
   * @generated
   */
  IRI getDataSet();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.DatasetClause#getDataSet <em>Data Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Set</em>' containment reference.
   * @see #getDataSet()
   * @generated
   */
  void setDataSet(IRI value);

} // DatasetClause
