/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple;

import static com.emftriple.util.Functions.transform;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.spi.PersistenceProvider;

import com.emftriple.config.persistence.PersistenceConfig;
import com.emftriple.impl.ETripleModule;
import com.emftriple.impl.FileDescriptorModule;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * 
 * ETriple
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 * @version 0.1
 */
public class ETriple {

	private static Injector injector;

	private static boolean initialized = false;

	private static ETriple INSTANCE;

	private static PersistenceConfig configuration;

	private ETriple() {
	}

	public static ETriple getInstance() {
		if (INSTANCE == null) {
			if (!initialized) {
				ETriple.init(new FileDescriptorModule());
			}
			INSTANCE = new ETriple();
		}
		return INSTANCE;
	}

	private static void init(Module module) {
		injector = Guice.createInjector( module );
		initialized = true;
	}

	public static synchronized void init(PersistenceConfig config, Module... modules) {
		configuration = config;

		Module mainModule = transform(Arrays.asList(modules), new FilterModuleByType(ETripleModule.class));
		List<Module> aModules = null;
		if (mainModule == null) {
			aModules = Lists.asList(new ETripleModule(configuration), modules);
		} else {
			aModules = Arrays.asList(modules);
		}
		injector = Guice.createInjector( aModules );
		initialized = true;
	}

	public PersistenceProvider getPersistenceProvider() {
		return injector.getInstance(PersistenceProvider.class);
	}

	public <T> T instance(Class<T> aClass) {
		return injector.getInstance(aClass);
	}

	private static class FilterModuleByType implements Function<List<Module>, Module> {

		private final Class<? extends Module> aClass;

		public FilterModuleByType(Class<? extends Module> aClass) {
			this.aClass = aClass;
		}

		@Override
		public Module apply(List<Module> from) {
			for (Module module: from) {
				if (aClass.isInstance(module)) {
					return module;
				}
			}
			return null;
		}

	}

	public Map<String, Object> properties() {
		return null;
	}
}