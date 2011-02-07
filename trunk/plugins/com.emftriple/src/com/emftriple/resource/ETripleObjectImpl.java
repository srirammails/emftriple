package com.emftriple.resource;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

import com.emftriple.impl.ETripleEntityManagerFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class ETripleObjectImpl extends EStoreEObjectImpl implements IETripleObject {
	
	private URI uri;
	
	public ETripleObjectImpl() {}

	@Override
	public URI eGetURI() {
		return uri;
	}
	
	@Override
	public void eSetURI(URI id) {
		this.uri = id;
	}
	
	@Override
	public Object dynamicGet(int dynamicFeatureID) {
		return super.dynamicGet(dynamicFeatureID);
	}
	
	@Override
	public void dynamicSet(int dynamicFeatureID, Object value) {	
		super.dynamicSet(dynamicFeatureID, value);
	}
	
	@Override
	public EStore eStore() {
		if (eStore == null)
		{
			EntityManager em = ETripleEntityManagerFactory.Registry.INSTANCE.getActiveEntityManager();
			eStore = new ETripleStore();
			if (em != null)
			{
				((ETripleStore)eStore).setEntityManager(em); 
			}
		}
		return eStore;
	}
	
}
