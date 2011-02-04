/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.jpql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.jpql.NamedQuery#getName <em>Name</em>}</li>
 *   <li>{@link com.emftriple.query.jpql.NamedQuery#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.jpql.JpqlPackage#getNamedQuery()
 * @model
 * @generated
 */
public interface NamedQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.emftriple.query.jpql.JpqlPackage#getNamedQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.NamedQuery#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(JPQLQuery)
   * @see com.emftriple.query.jpql.JpqlPackage#getNamedQuery_Query()
   * @model containment="true"
   * @generated
   */
  JPQLQuery getQuery();

  /**
   * Sets the value of the '{@link com.emftriple.query.jpql.NamedQuery#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(JPQLQuery value);

} // NamedQuery
