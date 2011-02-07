package com.emf4sw.ui.owl2ecore;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.owl.resource.OWLTurtleResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class OWLTurtle2EcoreAction extends AbstractOWL2EcoreAction implements IObjectActionDelegate {

	public OWLTurtle2EcoreAction() {
		super();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new OWLTurtleResourceFactory());
	}
}
