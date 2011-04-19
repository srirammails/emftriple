package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emftriple.IMapping;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.resource.ETripleResource.ResourceManager;
import com.emftriple.transform.IGetObject;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class GetEStoreObjectImpl extends AbstractGetObject implements IGetObject {

	private final EStore eStore;
	
	public GetEStoreObjectImpl(ResourceManager manager, IMapping mapping, IEntityDataSourceManager dataSourceManager, EStore eStore) {
		super(manager, mapping, dataSourceManager);
		this.eStore = eStore;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> entityClass, URI key) {
//		final RDFGraph aGraph = getGraph(entityClass, key);
//		final EClass aClass = Functions.transform(key, new TypeResolver(entityClass, mapping, aGraph));
//		
//		EObject obj = (aClass == null) ? null : eStore.create(aClass);
//		if (obj != null) {
//			((IETripleObject)obj).eSetURI(key);
//		}
//		
		return  null;
	}

	@Override
	public EObject get(EClass eClass, URI key) {
		// TODO Auto-generated method stub
		return null;
	}

}
