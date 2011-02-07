/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.resource;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


/**
 * {@link OWLFormats}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public enum OWLFormats {
	
	OWL { 
		@Override
		public String value() {
			return "OWL"; 
		}
		
		@Override
		public String extension() {
			return ".owl"; 
		}

		@Override
		public Factory factory() {
			return new OWLXMLResourceFactory();
		}
	},
	RDF { 
		@Override
		public String value() {
			return "RDF"; 
		}

		@Override
		public String extension() {
			return ".rdf";
		}
		
		@Override
		public Factory factory() {
			return new OWLXMLResourceFactory();
		}
	},
	N3 {
		@Override		
		public String value() {
			return "N3"; 
		}

		@Override
		public String extension() {
			return ".n3";
		}
		
		@Override
		public Factory factory() {
			return new OWLTurtleResourceFactory();
		}
	},
	TURTLE {
		@Override		
		public String value() {
			return "TTL"; 
		}

		@Override
		public String extension() {
			return ".ttl";
		}
		
		@Override
		public Factory factory() {
			return new OWLTurtleResourceFactory();
		}
	},
	TRIPLES {
		@Override
		public String value() {
			return "TRIPLES"; 
		}

		@Override
		public String extension() {
			return ".nt";
		}
		
		@Override
		public Factory factory() {
			return new OWLTurtleResourceFactory();
		}
	},
	XMI {
		@Override
		public String value() {
			return "XMI";
		}

		@Override
		public String extension() {
			return ".xmi";
		}
		
		@Override
		public Factory factory() {
			return new XMIResourceFactoryImpl();
		}
	},
	OFN {
		@Override		
		public String value() {
			return "OFN"; 
		}

		@Override
		public String extension() {
			return ".ofn";
		}
		
		@Override
		public Factory factory() {
			return new OWLXMLResourceFactory();
		}
	};
	
	public abstract String value();
	public abstract String extension();
	public abstract Factory factory();
}
