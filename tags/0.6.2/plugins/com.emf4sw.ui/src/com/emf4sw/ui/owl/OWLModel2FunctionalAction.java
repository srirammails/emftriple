package com.emf4sw.ui.owl;

import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.ui.OWLFileAction;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class OWLModel2FunctionalAction extends OWLFileAction implements IObjectActionDelegate {

	public OWLModel2FunctionalAction() {
		super(OWLFormats.OFN);
	}

}
