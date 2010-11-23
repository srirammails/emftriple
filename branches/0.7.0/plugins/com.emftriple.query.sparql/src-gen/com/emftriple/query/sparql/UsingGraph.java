/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.sparql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.sparql.UsingGraph#isNamed <em>Named</em>}</li>
 *   <li>{@link com.emftriple.query.sparql.UsingGraph#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.sparql.SparqlPackage#getUsingGraph()
 * @model
 * @generated
 */
public interface UsingGraph extends EObject
{
  /**
   * Returns the value of the '<em><b>Named</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named</em>' attribute.
   * @see #setNamed(boolean)
   * @see com.emftriple.query.sparql.SparqlPackage#getUsingGraph_Named()
   * @model
   * @generated
   */
  boolean isNamed();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.UsingGraph#isNamed <em>Named</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named</em>' attribute.
   * @see #isNamed()
   * @generated
   */
  void setNamed(boolean value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see com.emftriple.query.sparql.SparqlPackage#getUsingGraph_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link com.emftriple.query.sparql.UsingGraph#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // UsingGraph
