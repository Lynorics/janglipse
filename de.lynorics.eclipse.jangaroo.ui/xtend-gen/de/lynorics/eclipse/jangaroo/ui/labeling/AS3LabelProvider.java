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
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VarType;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class AS3LabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  private IImageHelper imageHelper;
  
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
  
  public String image(final InterfaceMethod meth) {
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
  
  public Image image(final Method meth) {
    Image image = null;
    AccessLevel _access = meth.getAccess();
    final AccessLevel _switchValue = _access;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PUBLIC)) {
        _matched=true;
        Image _image = this.imageHelper.getImage("outline-function-public.gif");
        image = _image;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PROTECTED)) {
        _matched=true;
        Image _image_1 = this.imageHelper.getImage("outline-function-protected.gif");
        image = _image_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.PRIVATE)) {
        _matched=true;
        Image _image_2 = this.imageHelper.getImage("outline-function-private.gif");
        image = _image_2;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,AccessLevel.INTERNAL)) {
        _matched=true;
        Image _image_3 = this.imageHelper.getImage("outline-function-internal.gif");
        image = _image_3;
      }
    }
    return image;
  }
  
  public String text(final Uses uses) {
    return "use declarations";
  }
  
  public String image(final Uses uses) {
    return "outline-uses.gif";
  }
  
  public String text(final VariableDeclaration varDecl) {
    VarType _type = varDecl.getType();
    String name = _type.getName();
    boolean _equals = Objects.equal(name, null);
    if (_equals) {
      VarType _type_1 = varDecl.getType();
      EObject _type_2 = _type_1.getType();
      String _text = this.getText(_type_2);
      name = _text;
    }
    String _name = varDecl.getName();
    String _plus = (_name + ": ");
    return (_plus + name);
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
