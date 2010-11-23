/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.resource;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.RDFFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.2
 */
public abstract class RDFResourceImpl extends ResourceImpl implements RDFResource {

	protected RDFReader<?> reader;

	protected RDFWriter<?> writer;

	public RDFResourceImpl() {
		super();
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	public RDFResourceImpl(URI uri) {
		super(uri);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	@Override
	public DocumentGraph createGraph() {
		final DocumentGraph aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
		this.getContents().add(aGraph);

		return aGraph;
	}

	@Override
	public DocumentGraph getGraph() {
		return getContents().get(0) == null ? null : (DocumentGraph) getContents().get(0);
	}

	@Override
	public NamedGraph getNamedGraph(URI uri) {
		return getGraph().getNamedGraph(uri.toString());
	}

	public final static class DummyRDFResource extends RDFResourceImpl {
		public DummyRDFResource() {
			super();
		}

		@Override
		protected void doLoad(InputStream inputStream, Map<?, ?> options) throws UnsupportedOperationException {
			throw new UnsupportedOperationException("Can't load dummy resources, use other implementation.");
		}

		@Override
		protected void doSave(OutputStream outputStream, Map<?, ?> options) throws UnsupportedOperationException {
			throw new UnsupportedOperationException("Can't save dummy resources, use other implementation.");
		}

	}
}
