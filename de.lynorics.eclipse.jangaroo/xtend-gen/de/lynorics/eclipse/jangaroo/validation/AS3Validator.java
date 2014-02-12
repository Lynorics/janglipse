/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.validation;

import com.google.common.base.Objects;
import de.lynorics.eclipse.jangaroo.AS3ModelUtil;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.validation.AbstractAS3Validator;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AS3Validator extends AbstractAS3Validator {
  public final static String CLASS_SHOULD_START_WITH_CAPITAL_LETTER = "classStartsWithCapitalLetter";
  
  public final static String INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER = "interfaceStartsWithCapitalLetter";
  
  public final static String FIELD_SHOULD_START_WITH_LOWERCASE = "fieldStartsWithLowercase";
  
  public final static String CYCLE_IN_CLASS_HIERARCHY = "cycleInClassHierarchy";
  
  public final static String PACKAGE_SHOULD_START_WITH_LOWERCASE = "fieldStartsWithLowercase";
  
  public final static String METHOD_SHOULD_START_WITH_LOWERCASE = "methodStartsWithLowercase";
  
  public final static String UNREACHABLE_CODE = "unreachableCode";
  
  @Check
  public void checkClassStartsWithCapital(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    String _name = clas.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Class name should start with a capital", 
        AS3Package.Literals.CLASS__NAME, 
        AS3Validator.CLASS_SHOULD_START_WITH_CAPITAL_LETTER);
    }
  }
  
  @Check
  public void checkInterfaceStartsWithCapital(final Interface intf) {
    String _name = intf.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Interface name should start with a capital", 
        AS3Package.Literals.INTERFACE__NAME, 
        AS3Validator.INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER);
    }
  }
  
  @Check
  public void checkMethodStartsWithLowercase(final Method method) {
    de.lynorics.eclipse.jangaroo.aS3.Class clazz = this.<de.lynorics.eclipse.jangaroo.aS3.Class>findParentOfType(method, de.lynorics.eclipse.jangaroo.aS3.Class.class);
    boolean _and = false;
    String _name = method.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (!_isUpperCase) {
      _and = false;
    } else {
      String _name_1 = clazz.getName();
      String _name_2 = method.getName();
      boolean _equals = _name_1.equals(_name_2);
      boolean _not = (!_equals);
      _and = _not;
    }
    if (_and) {
      this.warning("Method name should start with a lowercase", 
        AS3Package.Literals.METHOD__NAME, 
        AS3Validator.METHOD_SHOULD_START_WITH_LOWERCASE);
    }
  }
  
  public <E extends EObject> E findParentOfType(final EObject start, final Class<E> type) {
    EObject current = start;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(current, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isInstance = type.isInstance(current);
      boolean _not = (!_isInstance);
      _and = _not;
    }
    boolean _while = _and;
    while (_while) {
      EObject _eContainer = current.eContainer();
      current = _eContainer;
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(current, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _isInstance_1 = type.isInstance(current);
        boolean _not_1 = (!_isInstance_1);
        _and_1 = _not_1;
      }
      _while = _and_1;
    }
    return ((E) current);
  }
  
  @Check
  public void checkMethodStartsWithLowercase(final InterfaceMethod method) {
    String _name = method.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      this.warning("Method name should start with a lowercase", 
        AS3Package.Literals.INTERFACE_METHOD__NAME, 
        AS3Validator.METHOD_SHOULD_START_WITH_LOWERCASE);
    }
  }
  
  @Check
  public void checkPackageStartsWithLowercase(final de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    String _name = pack.getName();
    String[] folders = _name.split(".");
    for (final String folder : folders) {
      char _charAt = folder.charAt(0);
      boolean _isUpperCase = Character.isUpperCase(_charAt);
      if (_isUpperCase) {
        this.warning("Package name should start with a lowercase", 
          AS3Package.Literals.PACKAGE__NAME, 
          AS3Validator.PACKAGE_SHOULD_START_WITH_LOWERCASE);
        return;
      }
    }
  }
  
  @Check
  public void checkNoCycleInClassHierarchie(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    de.lynorics.eclipse.jangaroo.aS3.Class _superType = clas.getSuperType();
    boolean _equals = Objects.equal(_superType, null);
    if (_equals) {
      return;
    }
    final HashSet<de.lynorics.eclipse.jangaroo.aS3.Class> visitedClasses = CollectionLiterals.<de.lynorics.eclipse.jangaroo.aS3.Class>newHashSet();
    visitedClasses.add(clas);
    de.lynorics.eclipse.jangaroo.aS3.Class current = clas.getSuperType();
    boolean _notEquals = (!Objects.equal(current, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        boolean _contains = visitedClasses.contains(current);
        if (_contains) {
          String _name = clas.getName();
          String _plus = ("Cycle in hierarchie of class " + _name);
          String _plus_1 = (_plus + "");
          this.error(_plus_1, 
            AS3Package.Literals.CLASS__NAME, 
            AS3Validator.CYCLE_IN_CLASS_HIERARCHY);
          return;
        }
        visitedClasses.add(current);
        de.lynorics.eclipse.jangaroo.aS3.Class _superType_1 = current.getSuperType();
        current = _superType_1;
      }
      boolean _notEquals_1 = (!Objects.equal(current, null));
      _while = _notEquals_1;
    }
  }
  
  @Check
  public void checkNoStatementAfterReturn(final ReturnStatement ret) {
    Block _containingBlock = AS3ModelUtil.containingBlock(ret);
    final EList<Statement> statements = _containingBlock.getStatements();
    Statement _last = IterableExtensions.<Statement>last(statements);
    boolean _notEquals = (!Objects.equal(_last, ret));
    if (_notEquals) {
      int _indexOf = statements.indexOf(ret);
      int _plus = (_indexOf + 1);
      Statement _get = statements.get(_plus);
      this.error("Unreachable code", _get, 
        null, 
        AS3Validator.UNREACHABLE_CODE);
    }
  }
}
