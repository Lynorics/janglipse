/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
 * generated by Xtext
 */
package de.lynorics.eclipse.jangaroo;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.lynorics.eclipse.jangaroo.scoping.AS3ImportedNamespaceScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AS3RuntimeModule extends de.lynorics.eclipse.jangaroo.AbstractAS3RuntimeModule {
	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(AS3ImportedNamespaceScopeProvider.class);
	}
}