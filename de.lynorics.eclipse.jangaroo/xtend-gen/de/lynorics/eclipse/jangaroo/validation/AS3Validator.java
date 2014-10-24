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
import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.validation.AbstractAS3Validator;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Custom validation rules.
 * 
 * @invariant Every check-method ensures that it is just called for real source (.../src/...) not generated one (.../target/..., .../generated-src/..., and so on).
 * 
 * @see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AS3Validator extends AbstractAS3Validator {
  public final static String CLASS_SHOULD_START_WITH_CAPITAL_LETTER = "classStartsWithCapitalLetter";
  
  public final static String INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER = "interfaceStartsWithCapitalLetter";
  
  public final static String VARIABLE_SHOULD_START_WITH_LOWERCASE = "variableStartsWithLowercase";
  
  public final static String CYCLE_IN_CLASS_HIERARCHY = "cycleInClassHierarchy";
  
  public final static String PACKAGE_SHOULD_START_WITH_LOWERCASE = "fieldStartsWithLowercase";
  
  public final static String METHOD_SHOULD_START_WITH_LOWERCASE = "methodStartsWithLowercase";
  
  public final static String UNREACHABLE_CODE = "unreachableCode";
  
  public final static String PUBLIC_API_VIOLATION = "publicApiViolation";
  
  public final static String NAME_CLASH_VARIABLE_WITH_CLASS = "nameClashVariableWithClass";
  
  public final static String FORWARD_REFERENCE = "forwardReference";
  
  private boolean checkForSourcePath(final EObject eobj) {
    Resource _eResource = eobj.eResource();
    URI _uRI = _eResource.getURI();
    String _string = _uRI.toString();
    return _string.contains("/src/");
  }
  
  @Check
  public void checkClassStartsWithCapital(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    boolean _checkForSourcePath = this.checkForSourcePath(clas);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    String _name = clas.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not_1 = (!_isUpperCase);
    if (_not_1) {
      this.warning("Class name should start with a capital", 
        AS3Package.Literals.CLASS__NAME, 
        AS3Validator.CLASS_SHOULD_START_WITH_CAPITAL_LETTER);
    }
  }
  
  @Check(value = CheckType.FAST)
  public void checkInterfaceStartsWithCapital(final Interface intf) {
    boolean _checkForSourcePath = this.checkForSourcePath(intf);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    String _name = intf.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not_1 = (!_isUpperCase);
    if (_not_1) {
      this.warning("Interface name should start with a capital", 
        AS3Package.Literals.INTERFACE__NAME, 
        AS3Validator.INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER);
    }
  }
  
  @Check(value = CheckType.FAST)
  public void checkMethodStartsWithLowercase(final Method method) {
    boolean _checkForSourcePath = this.checkForSourcePath(method);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    de.lynorics.eclipse.jangaroo.aS3.Class clazz = AS3ModelUtil.<de.lynorics.eclipse.jangaroo.aS3.Class>findParentOfType(method, de.lynorics.eclipse.jangaroo.aS3.Class.class);
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
      boolean _not_1 = (!_equals);
      _and = _not_1;
    }
    if (_and) {
      this.warning("Method name should start with a lowercase", 
        AS3Package.Literals.METHOD__NAME, 
        AS3Validator.METHOD_SHOULD_START_WITH_LOWERCASE);
    }
  }
  
  @Check(value = CheckType.FAST)
  public void checkMethodStartsWithLowercase(final InterfaceMethod method) {
    boolean _checkForSourcePath = this.checkForSourcePath(method);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    String _name = method.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      this.warning("Method name should start with a lowercase", 
        AS3Package.Literals.INTERFACE_METHOD__NAME, 
        AS3Validator.METHOD_SHOULD_START_WITH_LOWERCASE);
    }
  }
  
  @Check(value = CheckType.FAST)
  public void checkPackageStartsWithLowercase(final de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    boolean _checkForSourcePath = this.checkForSourcePath(pack);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
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
  public void checkVariableStartsWithLowercase(final VariableDeclaration variable) {
    boolean _checkForSourcePath = this.checkForSourcePath(variable);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    String _name = variable.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      this.warning("Variable name should start with a lowercase", 
        AS3Package.Literals.VARIABLE_DECLARATION__NAME, 
        AS3Validator.VARIABLE_SHOULD_START_WITH_LOWERCASE);
    }
  }
  
  @Check(value = CheckType.NORMAL)
  public void checkNoCycleInClassHierarchie(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    boolean _checkForSourcePath = this.checkForSourcePath(clas);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    de.lynorics.eclipse.jangaroo.aS3.Class _superclass = clas.getSuperclass();
    boolean _equals = Objects.equal(_superclass, null);
    if (_equals) {
      return;
    }
    final HashSet<de.lynorics.eclipse.jangaroo.aS3.Class> visitedClasses = CollectionLiterals.<de.lynorics.eclipse.jangaroo.aS3.Class>newHashSet();
    visitedClasses.add(clas);
    de.lynorics.eclipse.jangaroo.aS3.Class current = clas.getSuperclass();
    while ((!Objects.equal(current, null))) {
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
        de.lynorics.eclipse.jangaroo.aS3.Class _superclass_1 = current.getSuperclass();
        current = _superclass_1;
      }
    }
  }
  
  @Check(value = CheckType.FAST)
  public void checkNoStatementAfterReturn(final ReturnStatement ret) {
    boolean _checkForSourcePath = this.checkForSourcePath(ret);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
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
  
  @Check(value = CheckType.NORMAL)
  public void checkNameClashOfVariableWithClass(final VariableDeclaration variableDeclaration) {
    boolean _checkForSourcePath = this.checkForSourcePath(variableDeclaration);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    String _name = variableDeclaration.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      de.lynorics.eclipse.jangaroo.aS3.Class _containingClass = AS3ModelUtil.containingClass(variableDeclaration);
      boolean _notEquals_1 = (!Objects.equal(_containingClass, null));
      if (_notEquals_1) {
        de.lynorics.eclipse.jangaroo.aS3.Class _containingClass_1 = AS3ModelUtil.containingClass(variableDeclaration);
        String _name_1 = _containingClass_1.getName();
        String _name_2 = variableDeclaration.getName();
        boolean _equals = _name_1.equals(_name_2);
        if (_equals) {
          String _name_3 = variableDeclaration.getName();
          String _plus = ("Name clash: variable hides class " + _name_3);
          this.warning(_plus, 
            AS3Package.Literals.VARIABLE_DECLARATION__NAME, 
            AS3Validator.NAME_CLASH_VARIABLE_WITH_CLASS);
          return;
        }
        de.lynorics.eclipse.jangaroo.aS3.Class _containingClass_2 = AS3ModelUtil.containingClass(variableDeclaration);
        EObject packageImpl = _containingClass_2.eContainer();
        if ((packageImpl instanceof de.lynorics.eclipse.jangaroo.aS3.Package)) {
          Imports _imp = ((de.lynorics.eclipse.jangaroo.aS3.Package)packageImpl).getImp();
          EList<Import> _imports = _imp.getImports();
          for (final Import imp : _imports) {
            {
              String _importedNamespace = imp.getImportedNamespace();
              String _importedNamespace_1 = imp.getImportedNamespace();
              int _lastIndexOf = _importedNamespace_1.lastIndexOf(".");
              int _plus_1 = (_lastIndexOf + 1);
              String name = _importedNamespace.substring(_plus_1);
              String _name_4 = variableDeclaration.getName();
              boolean _equals_1 = name.equals(_name_4);
              if (_equals_1) {
                String _name_5 = variableDeclaration.getName();
                String _plus_2 = ("Name clash: variable hides class " + _name_5);
                this.warning(_plus_2, 
                  AS3Package.Literals.VARIABLE_DECLARATION__NAME, 
                  AS3Validator.NAME_CLASH_VARIABLE_WITH_CLASS);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  @Check(value = CheckType.NORMAL)
  public void checkPublicApiViolation(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    boolean _checkForSourcePath = this.checkForSourcePath(clas);
    boolean _not = (!_checkForSourcePath);
    if (_not) {
      return;
    }
    EList<Annotation> _annotations = clas.getAnnotations();
    boolean _notEquals = (!Objects.equal(_annotations, null));
    if (_notEquals) {
      EList<Annotation> _annotations_1 = clas.getAnnotations();
      for (final Annotation annotation : _annotations_1) {
        String _name = annotation.getName();
        boolean _equals = "ExcludeClass".equals(_name);
        if (_equals) {
          String _name_1 = clas.getName();
          String _plus = ("Public API violation: the usage of " + _name_1);
          String _plus_1 = (_plus + " is restricted");
          this.warning(_plus_1, 
            AS3Package.Literals.CLASS__NAME, 
            AS3Validator.PUBLIC_API_VIOLATION);
          return;
        }
      }
    }
  }
}
