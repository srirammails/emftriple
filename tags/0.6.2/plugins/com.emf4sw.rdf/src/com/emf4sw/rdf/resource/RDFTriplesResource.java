/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.resource.extractor.RDFExtractor;
import com.emf4sw.rdf.resource.injector.RDFInjector;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.6
 */
public class RDFTriplesResource extends RDFResourceImpl implements RDFResource {

	public RDFTriplesResource() {
		super();
	}

	public RDFTriplesResource(URI uri) {
		super(uri);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Notification notification = setLoaded(true);
		try {
			final Model aModel = ModelFactory.createDefaultModel();
			final com.hp.hpl.jena.rdf.model.RDFReader reader = aModel.getReader("N-TRIPLES");
			reader.setProperty("WARN_REDEFINITION_OF_ID","EM_IGNORE");
			try {
				reader.read(aModel, inputStream, "");
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (!aModel.isEmpty()) {
				new RDFInjector(aModel).inject(this);
			}
		} finally {
			if (notification != null) {
				eNotify(notification);
			}

			setModified(false);
		}
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		final Model aModel = new RDFExtractor(this).extract();
		if (!aModel.isEmpty()) {
			com.hp.hpl.jena.rdf.model.RDFWriter writer = aModel.getWriter("N-TRIPLES");

			writer.write(aModel, outputStream, "");
		}
	}

}
