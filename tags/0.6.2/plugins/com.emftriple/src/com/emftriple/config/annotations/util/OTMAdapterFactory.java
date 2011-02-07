/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emftriple.config.annotations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.emftriple.config.annotations.EntityMapping;
import com.emftriple.config.annotations.EntityType;
import com.emftriple.config.annotations.NamedNativeQueryType;
import com.emftriple.config.annotations.NamedQueryType;
import com.emftriple.config.annotations.OTMPackage;
import com.emftriple.config.annotations.PersistenceUnitMetadata;
import com.emftriple.config.annotations.QueryType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emftriple.config.annotations.OTMPackage
 * @generated
 */
public class OTMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OTMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OTMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OTMPackage.eINSTANCE;
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
	protected OTMSwitch<Adapter> modelSwitch =
		new OTMSwitch<Adapter>() {
			@Override
			public Adapter caseEntityMapping(EntityMapping object) {
				return createEntityMappingAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseQueryType(QueryType object) {
				return createQueryTypeAdapter();
			}
			@Override
			public Adapter caseNamedQueryType(NamedQueryType object) {
				return createNamedQueryTypeAdapter();
			}
			@Override
			public Adapter caseNamedNativeQueryType(NamedNativeQueryType object) {
				return createNamedNativeQueryTypeAdapter();
			}
			@Override
			public Adapter casePersistenceUnitMetadata(PersistenceUnitMetadata object) {
				return createPersistenceUnitMetadataAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.EntityMapping <em>Entity Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.EntityMapping
	 * @generated
	 */
	public Adapter createEntityMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.QueryType
	 * @generated
	 */
	public Adapter createQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.NamedQueryType <em>Named Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.NamedQueryType
	 * @generated
	 */
	public Adapter createNamedQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.NamedNativeQueryType <em>Named Native Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.NamedNativeQueryType
	 * @generated
	 */
	public Adapter createNamedNativeQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emftriple.config.annotations.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emftriple.config.annotations.PersistenceUnitMetadata
	 * @generated
	 */
	public Adapter createPersistenceUnitMetadataAdapter() {
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

} //OTMAdapterFactory
