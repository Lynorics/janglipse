/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Model;

/**
 * extends ImportedNamespaceAwareLocalScopeProvider
 * http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/plain/plugins/org.eclipse.xtext/src/org/eclipse/xtext/scoping/impl/ImportedNamespaceAwareLocalScopeProvider.java
 * 
 * This is a local scope provider that understands namespace imports.
 * 
 * It scans model elements for an EAttribute importedNamespace. The value of this attribute is interpreted
 * as qualified name to be imported. Wildcards are supported (see {@link #getWildCard()} for details).
 * 
 * Imports are valid for all elements in the same container and their children.
 * 
 * In the case of xtend then XbaseImportedNamespaceScopeProvider
 * is extended instead.
 * http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/plain/plugins/org.eclipse.xtext.xbase/src/org/eclipse/xtext/xbase/scoping/XbaseImportedNamespaceScopeProvider.java
 */
public class AS3ImportedNamespaceScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	/**
	 * Converts QualifiedNames to strings and back
	 */
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	// automatically import all types from the package we are in
	@SuppressWarnings("unchecked")
	@Override
	protected List internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		  if (!(context instanceof Model)) return Collections.emptyList();
		  Model file = (Model) context;
		  List importedNamespaceResolvers = Lists.newArrayList();
		  // import empty namespace
	      importedNamespaceResolvers.add(createImportedNamespaceResolver("default.*", ignoreCase));
		  // add the import statements
		  EList<Import> imports = file.getPackage() != null ?
				  file.getPackage().getImp().getImports() :
					  file.getImp().getImports();
		  for (Import imp : imports) {
		      String value = imp.getImportedNamespace();
		      ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
		      if (resolver != null)
		        importedNamespaceResolvers.add(resolver);
		  }
		  // then add types from own package
		  if (file.getPackage() != null &&
				  !Strings.isEmpty(file.getPackage().getName())) {
		    importedNamespaceResolvers.add(
		      // construct ImportNormalizer with wildCard set to true
		      // ImportNormalizer constructor has this form:
		      // ImportNormalizer(QualifiedName importedNamespace, boolean wildCard, boolean ignoreCase)
              // https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext/src/org/eclipse/xtext/scoping/impl/ImportNormalizer.java
		      new ImportNormalizer(
		        qualifiedNameConverter.toQualifiedName(
                  file.getPackage().getName()
                ), true, ignoreCase
              )
		    );
		    // add <package>.config
		    ImportNormalizer resolver = createImportedNamespaceResolver(file.getPackage().getName()+".config.*", ignoreCase);
		      if (resolver != null)
			        importedNamespaceResolvers.add(resolver);
		  }
		return importedNamespaceResolvers;
	}

}