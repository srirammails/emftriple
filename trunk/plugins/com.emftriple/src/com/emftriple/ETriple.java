/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import com.emftriple.resource.ETripleResourceSet;
import com.emftriple.util.Functions;
import com.google.common.base.Function;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETriple {

	private static ETriple INSTANCE;
	
	private static List<Module> modules = new ArrayList<Module>();

	private ETriple() {}

	static {
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("emftriple", new ETripleResourceSet());
	}
	
	public static ETriple getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ETriple();
		}
		return INSTANCE;
	}

	public static synchronized void init(Module... modules) {
		ETriple.modules.addAll(Arrays.asList(modules));
	}

	public static Injector inject(Module module) {
		return Guice.createInjector(module);
	}
	
	public static Module get(Class<? extends Module> aClass) {
		return Functions.transform(aClass, new ETriple.ModuleFinder());
	}
	
	private static class ModuleFinder implements Function<Class<? extends Module>, Module> {

		public ModuleFinder() {}

		@Override
		public Module apply(Class<? extends Module> aClass) {
			for (Module module: modules) {
				if (aClass.isInstance(module)) {
					return module;
				}
			}
			return null;
		}
	}

}
