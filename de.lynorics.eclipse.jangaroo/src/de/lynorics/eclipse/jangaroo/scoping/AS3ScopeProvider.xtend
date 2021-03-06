/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
 * generated by Xtext
 */
package de.lynorics.eclipse.jangaroo.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

import static extension de.lynorics.eclipse.jangaroo.AS3ModelUtil.*

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class AS3ScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {

//	override getScope(EObject context, EReference reference) {
////		 for debugging purposes
////		System.out.println("scope_"+reference.EContainingClass.name +
////			"_"+reference.name +
////			"(" + context.eClass.name + ", ..)"
////		);
//		super.getScope(context, reference)
//	}
//	
//	def scope_SymbolRef_symbol(SymbolRef sr, EReference r) {
//		var parentScope = IScope::NULLSCOPE
//		val de.lynorics.eclipse.jangaroo.aS3.Class type = sr.containingClass
//		
//		if (type == null )//|| type.isPrimitive)
//			return parentScope
//
//		for (c : type.classHierarchy.reverseView) {
//			var test = c.selectMembers(sr);
//			parentScope = Scopes::scopeFor(
//				test, 
//				parentScope
//			)
//		}
//		Scopes::scopeFor(type.selectMembers(sr), parentScope)
//	}
//	
//		def selectMembers(de.lynorics.eclipse.jangaroo.aS3.Class type, Object sel) {
////		if (sel.methodinvocation)
//			type.methods + type.fields
////		else
////			type.fields + type.methods
//	}
	
}
