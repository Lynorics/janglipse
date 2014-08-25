/*
 * Copyright 2014
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import de.lynorics.eclipse.jangaroo.aS3.Model
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class AS3ResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy
{
	@Inject extension IQualifiedNameProvider
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Model) {
			(eObject as Model).classes.forEach[as3Class |
				val fullQualifiedName = as3Class.fullyQualifiedName
				if ( fullQualifiedName != null) {
					acceptor.accept(EObjectDescription::create(fullQualifiedName, as3Class))
				}
			]
			(eObject as Model).members.forEach[as3Member |
				val fullQualifiedName = as3Member.fullyQualifiedName
				if ( fullQualifiedName != null) {
					acceptor.accept(EObjectDescription::create(fullQualifiedName, as3Member))
				}
			]
			return true
		}
		else if (eObject instanceof de.lynorics.eclipse.jangaroo.aS3.Package) {
			(eObject as de.lynorics.eclipse.jangaroo.aS3.Package).classes.forEach[as3Class |
				val fullQualifiedName = as3Class.fullyQualifiedName
				if ( fullQualifiedName != null) {
					acceptor.accept(EObjectDescription::create(fullQualifiedName, as3Class))
				}
			]
			(eObject as de.lynorics.eclipse.jangaroo.aS3.Package).members.forEach[as3Member |
				val fullQualifiedName = as3Member.fullyQualifiedName
				if ( fullQualifiedName != null) {
					acceptor.accept(EObjectDescription::create(fullQualifiedName, as3Member))
				}
			]
			return true
		}
		else {
			return false
		}
	}
}