/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import static extension org.eclipse.xtext.EcoreUtil2.*;
import org.eclipse.emf.ecore.EObject
import de.lynorics.eclipse.jangaroo.aS3.Block
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration

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
  * @return the parent of the given EObject with the desired type,
  *         null if it doesn't exist
  */
  def static <E extends EObject> E findParentOfType(EObject start, java.lang.Class<E> type) {
    return     start.getContainerOfType(type) as E;
//    var EObject current = start
//    while (current!=null && !(type.isInstance(current))) {
//      current = current.eContainer;
//    }
//    return current as E;
  }

}