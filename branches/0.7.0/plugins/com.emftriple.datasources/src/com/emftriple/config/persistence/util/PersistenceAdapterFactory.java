/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.persistence.util;

import com.emftriple.config.persistence.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.config.persistence.PersistencePackage
 * @generated
 */
public class PersistenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceSwitch<Adapter> modelSwitch =
		new PersistenceSwitch<Adapter>() {
			@Override
			public Adapter casePersistenceMetaData(PersistenceMetaData object) {
				return createPersistenceMetaDataAdapter();
			}
			@Override
			public Adapter casePersistenceUnit(PersistenceUnit object) {
				return createPersistenceUnitAdapter();
			}
			@Override
			public Adapter caseFederation(Federation object) {
				return createFederationAdapter();
			}
			@Override
			public Adapter caseDataSourceBuilder(DataSourceBuilder object) {
				return createDataSourceBuilderAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.PersistenceMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.PersistenceMetaData
	 * @generated
	 */
	public Adapter createPersistenceMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.PersistenceUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.PersistenceUnit
	 * @generated
	 */
	public Adapter createPersistenceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.Federation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.Federation
	 * @generated
	 */
	public Adapter createFederationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.DataSourceBuilder <em>Data Source Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.DataSourceBuilder
	 * @generated
	 */
	public Adapter createDataSourceBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.persistence.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.persistence.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PersistenceAdapterFactory