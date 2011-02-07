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
import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.setOf;
import static com.atl.common.trans.Transformations.transform;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.Map;

import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Properties;
import com.atl.common.trans.Transformation;
import com.emf4sw.owl.resource.OWLFormats;

/**
 * {@link Ecore2OWL}
 * 
 * Launcher class for the Ecore2OWL.atl transformation.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.4
 */
public class Ecore2OWL implements Transformation<EMFModel, EMFModel> {

	private final Properties<?, ?> properties;

	private final OWLFormats format;
	
    public Ecore2OWL() {
    	this.properties = Properties.createProperties();
    	this.format = OWLFormats.OWL;
    }

    public Ecore2OWL(OWLFormats format) {
    	this.properties = Properties.createProperties();
    	this.format = format;
    }
    
    public <K, V> Ecore2OWL(Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = OWLFormats.OWL;
    }
    
    public <K, V> Ecore2OWL(OWLFormats format, Map<String, Object> options) {
    	this.properties = Properties.createProperties(options);
    	this.format = format;
    }
    
	public EMFModel apply(EMFModel arg) {
        checkNotNull(arg, "Cannot execute transformation " + this + ", cause input null.");
        checkArgument( conformsTo(arg, ecore()) );
        EMFModel propertiesModel = inject(properties.serialize(), Properties.getReferenceModel());
        
        return transform(setOf(arg, propertiesModel), OWLTransformations.ecore2owl(format));
	}

}
