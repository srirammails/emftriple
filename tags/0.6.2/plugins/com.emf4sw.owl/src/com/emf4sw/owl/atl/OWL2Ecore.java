/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.atl;

import static com.atl.common.models.Models.conformsTo;
import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.register;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;
import static com.emf4sw.owl.atl.OWL2EcoreOptions.needRefiningTransformation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.trans.Transformation;
import com.emf4sw.owl.OWLPackage;

/**
 * {@link OWL2Ecore}
 * 
 * Launcher class for the OWL2Ecore.atl tranformation.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class OWL2Ecore implements Transformation<EMFModel, EMFModel> {

	private final Map<String, Object> options;
	
    public OWL2Ecore() {
    	options = new HashMap<String, Object>();
    }

    public OWL2Ecore(Map<String, Object> options) {
    	this.options = options; 
    }
    
    static {
    	register(OWLPackage.eINSTANCE.eResource());
    }
    
	public EMFModel apply(EMFModel arg) {
        checkNotNull(arg, "Cannot execute transformation " + this + ", cause input null.");
        checkArgument(conformsTo(arg, get(OWLPackage.eNS_URI)));
        
        EMFModel owlModel = transform(arg, OWLTransformations.owl2ecore());
        
        return needRefiningTransformation(options) ? transform(owlModel, new EcoreRefine()) : owlModel;
	}
	
}
