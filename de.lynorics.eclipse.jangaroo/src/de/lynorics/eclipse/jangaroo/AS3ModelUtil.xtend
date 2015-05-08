/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import de.lynorics.eclipse.jangaroo.aS3.Block
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.Member
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.Model
import de.lynorics.eclipse.jangaroo.aS3.Parameter
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import java.util.List
import java.util.Vector
import org.eclipse.emf.ecore.EObject

import static org.eclipse.emf.ecore.util.EcoreUtil.*

import static extension org.eclipse.xtext.EcoreUtil2.*
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod

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

	def static classHierarchy(Class c) {
		val visited = <Class>newArrayList()
		var current = c.superclass
		while (current != null && !visited.contains(current)) {
			visited.add(current)
			current = current.superclass
		}
		visited
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
//    return     start.getContainerOfType(type);
    var EObject current = start;
    while (current!=null && !(type.isInstance(current))) {
      current = current.eContainer;
    }
    return current as E;
  }

  /**
   *
   */
  def static attributes(EObject e) {
  	val List<EObject> list = new Vector<EObject>();
  	if (e.getContainerOfType(typeof(Model)) != null) {
	  	// collect all variables of package
	  	var packages = e.getContainerOfType(typeof(Model)).package;
	  	if (packages != null) {
			var allElements = packages.members
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
		}
	}
	// collect all variables of containing class
	if (e.containingClass != null) {
		(e.containingClass as Class).members.forEach[
			member |
			var mvd = (member as Member).^var;
			if  (mvd != null) {
				list.add(mvd);
			}
		]
	}
	return list;
  }
  
  /**
   *
   */
  def static variablesDefinedBefore(EObject e) {
  	val List<EObject> list = new Vector<EObject>();
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
  
  def static accessibleFunctions(EObject e) {
  	val List<EObject> list = new Vector<EObject>();
	// collect all functions of containing class
	if (e.containingClass != null) {
		(e.containingClass as Class).members.forEach[
			member |
			var meth = (member as Member).^meth;
			if  (meth != null) {
				list.add(meth);
			}
		]
	}
	return list;
  }
  
  	def static String getTypeName(Method meth) {
		var EObject type = meth.type;
		if (type != null) {
			var String result = getTypeName(type);
			if (result != null) {
				return result;
			}
		}
		else
		{
			return meth.getAnytype();
		}
		return null;	
	}
  
  	def static String getTypeName(InterfaceMethod meth) {
		var EObject type = meth.type;
		if (type != null) {
			var String result = getTypeName(type);
			if (result != null) {
				return result;
			}
		}
		else
		{
			return meth.getAnytype();
		}
		return null;	
	}
  
  	def static String getTypeName(Parameter param) {
		var EObject type = param.type;
		if (type != null) {
			var String result = getTypeName(type);
			if (result != null) {
				return result;
			}
		}
		else
		{
			return param.getAnytype();
		}
		return null;	
	}
  
  	def static String getTypeName(EObject type) {
		if (type instanceof Class) {
			return (type as Class).name;
		}
		else if (type instanceof Interface) {
			return (type as Interface).name;
		}
		return null;	
	}
  
}
