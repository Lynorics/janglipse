/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.validation

import static extension de.lynorics.eclipse.jangaroo.AS3ModelUtil.*;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Package
import org.eclipse.xtext.validation.Check
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AS3Validator extends AbstractAS3Validator {

  public static val CLASS_SHOULD_START_WITH_CAPITAL_LETTER = 'classStartsWithCapitalLetter';
  public static val INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER = 'interfaceStartsWithCapitalLetter';
  public static val FIELD_SHOULD_START_WITH_LOWERCASE = 'fieldStartsWithLowercase';
  public static val CYCLE_IN_CLASS_HIERARCHY = "cycleInClassHierarchy";
  public static val PACKAGE_SHOULD_START_WITH_LOWERCASE = 'fieldStartsWithLowercase';
  public static val METHOD_SHOULD_START_WITH_LOWERCASE = 'methodStartsWithLowercase';
  public static val UNREACHABLE_CODE = 'unreachableCode';

  @Check
  def checkClassStartsWithCapital(Class clas) {
    if (!Character.isUpperCase(clas.name.charAt(0))) {
      warning('Class name should start with a capital', 
          AS3Package.Literals.CLASS__NAME,
          CLASS_SHOULD_START_WITH_CAPITAL_LETTER)
    }
  }

  @Check
  def checkInterfaceStartsWithCapital(Interface intf) {
    if (!Character.isUpperCase(intf.name.charAt(0))) {
      warning('Interface name should start with a capital', 
          AS3Package.Literals.INTERFACE__NAME,
          INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER)
    }
  }

  @Check
  def checkMethodStartsWithLowercase(Method method) {
    var Class clazz =  method.findParentOfType(Class);
    if (Character.isUpperCase(method.name.charAt(0)) &&
        !clazz.name.equals(method.name)) {
      warning('Method name should start with a lowercase', 
          AS3Package.Literals.METHOD__NAME,
          METHOD_SHOULD_START_WITH_LOWERCASE)
    }
  }
  
  @Check
  def checkMethodStartsWithLowercase(InterfaceMethod method) {
    if (Character.isUpperCase(method.name.charAt(0))) {
      warning('Method name should start with a lowercase', 
          AS3Package.Literals.INTERFACE_METHOD__NAME,
          METHOD_SHOULD_START_WITH_LOWERCASE)
    }
  }

  @Check
  def checkPackageStartsWithLowercase(Package pack) {
    var folders = pack.name.split(".");
    for(folder: folders) {
      if (Character.isUpperCase(folder.charAt(0))) {
        warning('Package name should start with a lowercase', 
            AS3Package.Literals.PACKAGE__NAME,
            PACKAGE_SHOULD_START_WITH_LOWERCASE);
        return;
      }
    }
  }

//  @Check
//  def checkFieldStartsWithLowercase(VariableDeclaration variable) {
//    if (!Character.isUpperCase(variable.name.charAt(0))) {
//      warning('Field name should start with a lowercase', 
//          AS3Package.Literals.VARIABLEDECLARATION__NAME,
//          FIELD_SHOULD_START_WITH_LOWERCASE)
//    }
//  }

  @Check
  def checkNoCycleInClassHierarchie(Class clas) {
    if (clas.superType == null) {
      return
    }
    val visitedClasses = <Class>newHashSet();
    visitedClasses.add(clas);
    var current = clas.superType;
    while (current != null) {
      if (visitedClasses.contains(current)) {
        error("Cycle in hierarchie of class "+clas.name+"",
          AS3Package.Literals.CLASS__NAME,
          CYCLE_IN_CLASS_HIERARCHY);
          return;
      }
      visitedClasses.add(current);
      current = current.superType;
    }
  }

  @Check
  def checkNoStatementAfterReturn(ReturnStatement ret) {
    val statements = ret.containingBlock.statements;
    if (statements.last != ret) {
      error("Unreachable code",
        statements.get(statements.indexOf(ret)+1),
        null,
        UNREACHABLE_CODE);
    }
  }

}