/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.rdf.resource;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */ 
public enum RDFFormats {

	RDF_XML_FORMAT { 
		public String value() {return "RDF/XML"; }
		public String extension() {return "rdf"; }
		@Override
		public Factory factory() {
			return new RDFXMLResourceFactory();
		}
	},
	RDF_XML_ABBREV_FORMAT { 
		public String value() {return "RDF/XML-ABBREV"; }
		public String extension() {return "rdf"; }
		@Override
		public Factory factory() {
			return new RDFXMLResourceFactory();
		}
	},
	TRIPLE_FORMAT { 
		public String value() {return "TRIPLE"; }
		public String extension() {return "nt"; }
		@Override
		public Factory factory() {
			return new RDFTriplesResourceFactory();
		}
	},
	N3_FORMAT {
		public String value() {return "N3"; }
		public String extension() {return "n3"; }
		@Override
		public Factory factory() {
			return new RDFTurtleResourceFactory();
		}
	},
	TURTLE_FORMAT {
		public String value() {return "TURTLE"; }
		public String extension() {return "ttl"; }
		@Override
		public Factory factory() {
			return new RDFTurtleResourceFactory();
		}
	},
	XMI_FORMAT {
		public String value() {return "XMI"; }
		public String extension() {return "xmi"; }
		@Override
		public Factory factory() {
			return new XMIResourceFactoryImpl();
		}
	};
	
	public abstract String value();	
	public abstract String extension();
	public abstract Factory factory();
	
}
