/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.validation

import de.lynorics.eclipse.jangaroo.aS3.AS3Package
import de.lynorics.eclipse.jangaroo.aS3.Annotation
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.Package
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

import static extension de.lynorics.eclipse.jangaroo.AS3ModelUtil.*
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import de.lynorics.eclipse.jangaroo.aS3.Import
import org.eclipse.xtext.validation.CheckType
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.lynorics.eclipse.jangaroo.AS3Index

/**
 * Custom validation rules.
 *
 * @invariant Every check-method ensures that it is just called for real source (.../src/...) not generated one (.../target/..., .../generated-src/..., and so on).
 * 
 * @see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AS3Validator extends AbstractAS3Validator {

	@Inject
	extension AS3Index
	
	@Inject
	extension IQualifiedNameProvider
	
  public static val CLASS_SHOULD_START_WITH_CAPITAL_LETTER = 'classStartsWithCapitalLetter';
  public static val INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER = 'interfaceStartsWithCapitalLetter';
  public static val VARIABLE_SHOULD_START_WITH_LOWERCASE = 'variableStartsWithLowercase';
  public static val CYCLE_IN_CLASS_HIERARCHY = "cycleInClassHierarchy";
  public static val PACKAGE_SHOULD_START_WITH_LOWERCASE = 'fieldStartsWithLowercase';
  public static val METHOD_SHOULD_START_WITH_LOWERCASE = 'methodStartsWithLowercase';
  public static val UNREACHABLE_CODE = 'unreachableCode';
  public static val PUBLIC_API_VIOLATION = "publicApiViolation";
  public static val NAME_CLASH_VARIABLE_WITH_CLASS = "nameClashVariableWithClass";
  public static val FORWARD_REFERENCE = "forwardReference";
  public static val WRONG_TYPE = "wrongType";
  public static val DUPLICATE_CLASS = "duplicateClass";

  private def checkForSourcePath(EObject eobj) {
	return eobj.eResource.URI.toString.contains("/src/");
  }

  @Check(CheckType.FAST)
  def checkClassStartsWithCapital(Class clas) {
  	if (!checkForSourcePath(clas)) {
  		return
  	}
    if (!Character.isUpperCase(clas.name.charAt(0))) {
      warning('Class name should start with a capital', 
          AS3Package.Literals.CLASS__NAME,
          CLASS_SHOULD_START_WITH_CAPITAL_LETTER)
    }
  }

  @Check(CheckType.FAST)
  def checkInterfaceStartsWithCapital(Interface intf) {
  	if (!checkForSourcePath(intf)) {
  		return
  	}
    if (!Character.isUpperCase(intf.name.charAt(0))) {
      warning('Interface name should start with a capital', 
          AS3Package.Literals.INTERFACE__NAME,
          INTERFACE_SHOULD_START_WITH_CAPITAL_LETTER)
    }
  }

  @Check(CheckType.FAST)
  def checkMethodStartsWithLowercase(Method method) {
  	if (!checkForSourcePath(method)) {
  		return
  	}
    var Class clazz =  method.findParentOfType(Class);
    if (Character.isUpperCase(method.name.charAt(0)) &&
        !clazz.name.equals(method.name)) {
      warning('Method name should start with a lowercase', 
          AS3Package.Literals.METHOD__NAME,
          METHOD_SHOULD_START_WITH_LOWERCASE)
    }
  }
  
  @Check(CheckType.FAST)
  def checkMethodStartsWithLowercase(InterfaceMethod method) {
  	if (!checkForSourcePath(method)) {
  		return
  	}
    if (Character.isUpperCase(method.name.charAt(0))) {
      warning('Method name should start with a lowercase', 
          AS3Package.Literals.INTERFACE_METHOD__NAME,
          METHOD_SHOULD_START_WITH_LOWERCASE)
    }
  }

  @Check(CheckType.FAST)
  def checkPackageStartsWithLowercase(Package pack) {
  	if (!checkForSourcePath(pack)) {
  		return
  	}
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

  @Check(CheckType.FAST)
  def checkVariableStartsWithLowercase(VariableDeclaration variable) {
  	if (!checkForSourcePath(variable)) {
  		return
  	}
    if (Character.isUpperCase(variable.name.charAt(0))) {
      warning('Variable name should start with a lowercase', 
          AS3Package.Literals.VARIABLE_DECLARATION__NAME,
          VARIABLE_SHOULD_START_WITH_LOWERCASE)
    }
  }

  @Check(CheckType.NORMAL)
  def checkNoCycleInClassHierarchie(Class clas) {
  	if (!checkForSourcePath(clas)) {
  		return
  	}
    if (clas.superclass == null) {
      return
    }
    val visitedClasses = <Class>newHashSet();
    visitedClasses.add(clas);
    var current = clas.superclass;
    while (current != null) {
      if (visitedClasses.contains(current)) {
        error("Cycle in hierarchie of class "+clas.name+"",
          AS3Package.Literals.CLASS__NAME,
          CYCLE_IN_CLASS_HIERARCHY);
          return;
      }
      visitedClasses.add(current);
      current = current.superclass;
    }
  }

  @Check(CheckType.FAST)
  def checkNoStatementAfterReturn(ReturnStatement ret) {
  	if (!checkForSourcePath(ret)) {
  		return
  	}
    val statements = ret.containingBlock.statements;
    if (statements.last != ret) {
      error("Unreachable code",
        statements.get(statements.indexOf(ret)+1),
        null,
        UNREACHABLE_CODE);
    }
  }

  @Check(CheckType.NORMAL)
  def checkNameClashOfVariableWithClass(VariableDeclaration variableDeclaration) {
  	if (!checkForSourcePath(variableDeclaration)) {
  		return
  	}
  	if (variableDeclaration.name != null) {
    		if (variableDeclaration.containingClass != null) {
    			if (variableDeclaration.containingClass.name.equals(variableDeclaration.name)) {
        			warning("Name clash: variable hides class "+variableDeclaration.name,
          				AS3Package.Literals.VARIABLE_DECLARATION__NAME,
          				NAME_CLASH_VARIABLE_WITH_CLASS);
          			return;
    			}
    			var packageImpl = variableDeclaration.containingClass.eContainer;
    			if (packageImpl instanceof Package) {
    				for (Import imp: packageImpl.imp.imports) {
    					var name = imp.importedNamespace.substring(imp.importedNamespace.lastIndexOf('.')+1);
		    			if (name.equals(variableDeclaration.name)) {
        					warning("Name clash: variable hides class "+variableDeclaration.name,
          						AS3Package.Literals.VARIABLE_DECLARATION__NAME,
          						NAME_CLASH_VARIABLE_WITH_CLASS);
          					return;
    					}
    				}
    			}
    		}
    }
  }

  @Check(CheckType.NORMAL)
  def checkPublicApiViolation(Class clas) {
  	if (!checkForSourcePath(clas)) {
  		return
  	}
  	// TODO implement me correctly
  	if (clas.annotations != null) {
    	for(Annotation annotation: clas.annotations) {
    		if ("ExcludeClass".equals(annotation.name))
    		{
        		warning("Public API violation: the usage of "+clas.name+" is restricted",
          			AS3Package.Literals.CLASS__NAME,
          			PUBLIC_API_VIOLATION);
          		return;
    		}
    	}
    }
  }

  @Check(CheckType.EXPENSIVE)
  def checkForwardReference(SymbolRef ref) {
  	if (!checkForSourcePath(ref)) {
  		return
  	}
  	val variable = ref.symbol;
  	if (variable != null &&
  		!ref.variablesDefinedBefore.contains(variable)) {
			error("Variable forward reference not allowed for "+variable,
				AS3Package.Literals.SYMBOL_REF__SYMBOL,
				FORWARD_REFERENCE, variable+"");
			return;
  		}
  }

  @Check(CheckType::NORMAL)
  def checkDuplicateClassesInFiles(Class c) {
  	val className = c.fullyQualifiedName;
  	c.visibleClassesDesscriptions.forEach[
  		desc |
  		if (desc.qualifiedName == className &&
  			desc.EObjectOrProxy != c &&
  			desc.EObjectURI.trimFragment != c.eResource.URI) {
  				error(
  					"The type " + c.name + " is already defined",
  					AS3Package::eINSTANCE.class_Name,
  					DUPLICATE_CLASS);
  					return
  			}
  	]
  }
}
