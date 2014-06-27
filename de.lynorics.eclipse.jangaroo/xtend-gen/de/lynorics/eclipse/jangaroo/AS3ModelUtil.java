/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import com.google.common.collect.Iterables;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

/**
 * Functions for usage within AS3Validator, etc.
 * These functions will be added as static methods to instances of EObject.
 */
@SuppressWarnings("all")
public class AS3ModelUtil {
  /**
   * @return the list of all fields of the class
   * 
   * @see VariableDeclaration
   */
  public static Iterable<VariableDeclaration> fields(final de.lynorics.eclipse.jangaroo.aS3.Class c) {
    EList<Member> _members = c.getMembers();
    return Iterables.<VariableDeclaration>filter(_members, VariableDeclaration.class);
  }
  
  /**
   * @return the list of all methods of the class
   * 
   * @see Method
   */
  public static Iterable<Method> methods(final de.lynorics.eclipse.jangaroo.aS3.Class c) {
    EList<Member> _members = c.getMembers();
    return Iterables.<Method>filter(_members, Method.class);
  }
  
  /**
   * @return the containing block of the EObject
   * 
   * @see Block
   */
  public static Block containingBlock(final EObject e) {
    return EcoreUtil2.<Block>getContainerOfType(e, Block.class);
  }
  
  /**
   * @return the containing class of the EObject
   * 
   * @see Class
   */
  public static de.lynorics.eclipse.jangaroo.aS3.Class containingClass(final EObject e) {
    return EcoreUtil2.<de.lynorics.eclipse.jangaroo.aS3.Class>getContainerOfType(e, de.lynorics.eclipse.jangaroo.aS3.Class.class);
  }
  
  /**
   * @return the containing method of the EObject
   * 
   * @see Method
   */
  public static Method containingMethod(final EObject e) {
    return EcoreUtil2.<Method>getContainerOfType(e, Method.class);
  }
  
  /**
   * @return the parent of the given EObject with the desired type,
   *         null if it doesn't exist
   */
  public static <E extends EObject> E findParentOfType(final EObject start, final Class<E> type) {
    return EcoreUtil2.<E>getContainerOfType(start, type);
  }
}
