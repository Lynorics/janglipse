/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*;
import static extension org.eclipse.xtext.EcoreUtil2.*;
import org.eclipse.emf.ecore.EObject
import de.lynorics.eclipse.jangaroo.aS3.Block
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import de.lynorics.eclipse.jangaroo.aS3.Model
import java.util.Vector
import java.util.List
import de.lynorics.eclipse.jangaroo.aS3.Member
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration

/**
 * Functions for usage within AS3Validator, etc.
 * These functions will be added as static methods to instances of EObject.
 */
class AS3ModelUtil {

  /**
   * @return the list of all fields of the class
   * 
   * @see VariableDeclaration
   */
  def static fields(Class c) {
    c.members.filter(typeof(VariableDeclaration));
  } 

  /**
   * @return the list of all methods of the class
   * 
   * @see Method
   */
  def static methods(Class c) {
    c.members.filter(typeof(Method));
  } 

  /**
   * @return the containing block of the EObject
   * 
   * @see Block
   */
  def static containingBlock(EObject e) {
    e.getContainerOfType(typeof(Block));
  } 

  /**
   * @return the containing class of the EObject
   * 
   * @see Class
   */
  def static containingClass(EObject e) {
    e.getContainerOfType(typeof(Class));
  } 

  /**
   * @return the containing method of the EObject
   * 
   * @see Method
   */
  def static containingMethod(EObject e) {
    e.getContainerOfType(typeof(Method));
  } 

  /**
   * @return the containing model of the EObject
   * 
   * @see Model
   */
  def static containingModel(EObject e) {
    e.getContainerOfType(typeof(Model));
  } 

 /**
  * @return the parent of the given EObject with the desired type,
  *         null if it doesn't exist
  */
  def static <E extends EObject> E findParentOfType(EObject start, java.lang.Class<E> type) {
    return     start.getContainerOfType(type);
//    var EObject current = start
//    while (current!=null && !(type.isInstance(current))) {
//      current = current.eContainer;
//    }
//    return current as E;
  }

  def static variablesDefinedBefore(EObject e) {
  	val List<EObject> list = new Vector<EObject>();
  	// collect all variables of package
	var allElements = e.getContainerOfType(typeof(Model)).package.members
	var containingElement = allElements.findFirst[isAncestor(it, e)]
	var index = allElements.indexOf(containingElement);
	if (e.containingClass == null) {
		if (index >= 0) {
			list.addAll(allElements.subList(0, index+1).typeSelect(typeof(MemberVariableDeclaration)));
		}
	}
	else {
			list.addAll(allElements.typeSelect(typeof(MemberVariableDeclaration)));
	}
	// collect all variables of containing class
	if (e.containingClass != null) {
		(e.containingClass as Class).members.forEach[
			member |
			var mvd = (member as Member).^var;
			if  (mvd != null) {
				list.add((mvd as MemberVariableDeclaration).decl as VariableDeclaration);
			}
		]
	}
	// collect all variables of containing function respecting block hierarchy
	if (e.containingMethod != null) {
		list.addAll(collectVariablesWithinBlock(e, e.containingBlock));
	}
	// collect all parameters of containing function
	if (e.containingMethod != null) {
		list.addAll((e.containingMethod as Method).params);
	}
	return list;
  }
  
  private def static List<EObject> collectVariablesWithinBlock(EObject e, Block block) {
  	val List<EObject> list = new Vector<EObject>();
  	if (block != null) {
  		if (block.eContainer instanceof Block) {
			list.addAll(collectVariablesWithinBlock(e, block.eContainer as Block));
		}
	  	list.addAll(block.statements.typeSelect(typeof(VariableDeclaration)));
  	}
  	return list
  }
}