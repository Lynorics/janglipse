/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class AS3LabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public AS3LabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  /**
   * def text(EObject ele) {
   * return ele.class.name + ": " + super.text(ele);
   * }
   */
  public String image(final de.lynorics.eclipse.jangaroo.aS3.Class clas) {
    return "outline-class.gif";
  }
  
  public String image(final de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    return "outline-package.gif";
  }
  
  public String image(final Interface inter) {
    return "outline-interface.gif";
  }
  
  public String text(final Imports imp) {
    return "import declarations";
  }
  
  public String image(final Imports imp) {
    return "outline-imports.gif";
  }
  
  public String image(final Import imp) {
    return "outline-import.gif";
  }
  
  public String image(final Method meth) {
    AccessLevel _access = meth.getAccess();
    final AccessLevel _switchValue = _access;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PUBLIC)) {
        _matched=true;
        return "outline-function-public.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PROTECTED)) {
        _matched=true;
        return "outline-function-protected.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PRIVATE)) {
        _matched=true;
        return "outline-function-private.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.INTERNAL)) {
        _matched=true;
        return "outline-function-internal.gif";
      }
    }
    return null;
  }
  
  public String text(final Uses uses) {
    return "use declarations";
  }
  
  public String image(final Uses uses) {
    return "outline-uses.gif";
  }
  
  public String text(final VariableDeclaration varDecl) {
    String _name = varDecl.getName();
    return (_name + ": ");
  }
  
  public String image(final VariableDeclaration varDecl) {
    AccessLevel _access = varDecl.getAccess();
    final AccessLevel _switchValue = _access;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PUBLIC)) {
        _matched=true;
        return "outline-field-public.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PROTECTED)) {
        _matched=true;
        return "outline-field-protected.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PRIVATE)) {
        _matched=true;
        return "outline-field-private.gif";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.INTERNAL)) {
        _matched=true;
        return "outline-field-internal.gif";
      }
    }
    return null;
  }
}
