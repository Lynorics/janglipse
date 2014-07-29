/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import java.util.List;
import java.util.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
   * @return the containing model of the EObject
   * 
   * @see Model
   */
  public static Model containingModel(final EObject e) {
    return EcoreUtil2.<Model>getContainerOfType(e, Model.class);
  }
  
  /**
   * @return the parent of the given EObject with the desired type,
   *         null if it doesn't exist
   */
  public static <E extends EObject> E findParentOfType(final EObject start, final Class<E> type) {
    return EcoreUtil2.<E>getContainerOfType(start, type);
  }
  
  public static List<EObject> variablesDefinedBefore(final EObject e) {
    final List<EObject> list = new Vector<EObject>();
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(e, Model.class);
    de.lynorics.eclipse.jangaroo.aS3.Package _package = _containerOfType.getPackage();
    EList<EObject> allElements = _package.getMembers();
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject it) {
        return Boolean.valueOf(EcoreUtil.isAncestor(it, e));
      }
    };
    EObject containingElement = IterableExtensions.<EObject>findFirst(allElements, _function);
    int index = allElements.indexOf(containingElement);
    de.lynorics.eclipse.jangaroo.aS3.Class _containingClass = AS3ModelUtil.containingClass(e);
    boolean _equals = Objects.equal(_containingClass, null);
    if (_equals) {
      if ((index >= 0)) {
        List<EObject> _subList = allElements.subList(0, (index + 1));
        List<MemberVariableDeclaration> _typeSelect = EcoreUtil2.<MemberVariableDeclaration>typeSelect(_subList, MemberVariableDeclaration.class);
        list.addAll(_typeSelect);
      }
    } else {
      List<MemberVariableDeclaration> _typeSelect_1 = EcoreUtil2.<MemberVariableDeclaration>typeSelect(allElements, MemberVariableDeclaration.class);
      list.addAll(_typeSelect_1);
    }
    de.lynorics.eclipse.jangaroo.aS3.Class _containingClass_1 = AS3ModelUtil.containingClass(e);
    boolean _notEquals = (!Objects.equal(_containingClass_1, null));
    if (_notEquals) {
      de.lynorics.eclipse.jangaroo.aS3.Class _containingClass_2 = AS3ModelUtil.containingClass(e);
      EList<Member> _members = ((de.lynorics.eclipse.jangaroo.aS3.Class) _containingClass_2).getMembers();
      final Procedure1<Member> _function_1 = new Procedure1<Member>() {
        public void apply(final Member member) {
          MemberVariableDeclaration mvd = ((Member) member).getVar();
          boolean _notEquals = (!Objects.equal(mvd, null));
          if (_notEquals) {
            VariableDeclaration _decl = ((MemberVariableDeclaration) mvd).getDecl();
            list.add(((VariableDeclaration) _decl));
          }
        }
      };
      IterableExtensions.<Member>forEach(_members, _function_1);
    }
    Method _containingMethod = AS3ModelUtil.containingMethod(e);
    boolean _notEquals_1 = (!Objects.equal(_containingMethod, null));
    if (_notEquals_1) {
      Block _containingBlock = AS3ModelUtil.containingBlock(e);
      List<EObject> _collectVariablesWithinBlock = AS3ModelUtil.collectVariablesWithinBlock(e, _containingBlock);
      list.addAll(_collectVariablesWithinBlock);
    }
    Method _containingMethod_1 = AS3ModelUtil.containingMethod(e);
    boolean _notEquals_2 = (!Objects.equal(_containingMethod_1, null));
    if (_notEquals_2) {
      Method _containingMethod_2 = AS3ModelUtil.containingMethod(e);
      EList<Parameter> _params = ((Method) _containingMethod_2).getParams();
      list.addAll(_params);
    }
    return list;
  }
  
  private static List<EObject> collectVariablesWithinBlock(final EObject e, final Block block) {
    final List<EObject> list = new Vector<EObject>();
    boolean _notEquals = (!Objects.equal(block, null));
    if (_notEquals) {
      EObject _eContainer = block.eContainer();
      if ((_eContainer instanceof Block)) {
        EObject _eContainer_1 = block.eContainer();
        List<EObject> _collectVariablesWithinBlock = AS3ModelUtil.collectVariablesWithinBlock(e, ((Block) _eContainer_1));
        list.addAll(_collectVariablesWithinBlock);
      }
      EList<Statement> _statements = block.getStatements();
      List<VariableDeclaration> _typeSelect = EcoreUtil2.<VariableDeclaration>typeSelect(_statements, VariableDeclaration.class);
      list.addAll(_typeSelect);
    }
    return list;
  }
}
