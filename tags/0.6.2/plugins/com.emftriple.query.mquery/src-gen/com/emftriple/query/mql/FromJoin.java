/**
 * <copyright>
 * </copyright>
 *

 */
package com.emftriple.query.mql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.emftriple.query.mql.FromJoin#isIsFetch <em>Is Fetch</em>}</li>
 *   <li>{@link com.emftriple.query.mql.FromJoin#getPath <em>Path</em>}</li>
 *   <li>{@link com.emftriple.query.mql.FromJoin#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.emftriple.query.mql.MqlPackage#getFromJoin()
 * @model
 * @generated
 */
public interface FromJoin extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fetch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fetch</em>' attribute.
   * @see #setIsFetch(boolean)
   * @see com.emftriple.query.mql.MqlPackage#getFromJoin_IsFetch()
   * @model
   * @generated
   */
  boolean isIsFetch();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.FromJoin#isIsFetch <em>Is Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Fetch</em>' attribute.
   * @see #isIsFetch()
   * @generated
   */
  void setIsFetch(boolean value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(AliasAttributeExpression)
   * @see com.emftriple.query.mql.MqlPackage#getFromJoin_Path()
   * @model containment="true"
   * @generated
   */
  AliasAttributeExpression getPath();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.FromJoin#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(AliasAttributeExpression value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see com.emftriple.query.mql.MqlPackage#getFromJoin_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link com.emftriple.query.mql.FromJoin#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // FromJoin
