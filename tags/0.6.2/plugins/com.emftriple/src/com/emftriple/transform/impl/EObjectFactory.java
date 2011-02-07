package com.emftriple.transform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

public abstract class EObjectFactory {

	public abstract EObject create(EClass eClass);
	
	public static class EObjectEFactoryFactory extends EObjectFactory {

		private EFactory eFactory;
		
		public EObjectEFactoryFactory(EFactory eFactory) {
			this.eFactory = eFactory;
		}
		
		@Override
		public EObject create(EClass eClass) {
			return eFactory.create(eClass);
		}
		
	}
	
	public static class EObjectEStoreFactory extends EObjectFactory {
		
		public EStore eStore;
		
		public EObjectEStoreFactory(EStore eStore) {
			this.eStore = eStore;
		}

		@Override
		public EObject create(EClass eClass) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
}
