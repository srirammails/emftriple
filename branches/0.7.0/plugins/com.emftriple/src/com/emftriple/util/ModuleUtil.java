package com.emftriple.util;

import com.google.inject.Module;

public final class ModuleUtil {

	@SuppressWarnings("unchecked")
	public static Class<? extends Module> getModuleClass(final String className) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<? extends Module> m = null;
		try {
			m = (Class<? extends Module>) loader.loadClass(className); // wtf
		} catch (ClassNotFoundException e) {
			return null;
		}
		return m;
	}
}
