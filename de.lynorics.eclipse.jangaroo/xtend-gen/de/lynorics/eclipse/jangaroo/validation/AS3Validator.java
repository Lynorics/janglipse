/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.validation;

import com.google.common.base.Objects;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.validation.AbstractAS3Validator;
import java.util.HashSet;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AS3Validator extends AbstractAS3Validator {
  public final static String CLASS_SHOULD_START_WITH_CAPITAL_LETTER = "classStartsWithCapitalLetter";
  
  public final static String FIELD_SHOULD_START_WITH_LOWERCASE = "fieldStartsWithCapitalLetter";
  
  public final static String CYCLE_IN_CLASS_HIERARCHY = "cycleInClassHierarchy";
  
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
}
