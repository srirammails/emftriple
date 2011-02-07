/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.emf4sw.owl.OWLPackage#getEntityExpression()
 * @model abstract="true"
 * @generated
 */
public interface EntityExpression extends DataRange, ClassExpression, Individual, ObjectPropertyExpression, DataPropertyExpression, AnnotationPropertyExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Entity getEntity();

} // EntityExpression
