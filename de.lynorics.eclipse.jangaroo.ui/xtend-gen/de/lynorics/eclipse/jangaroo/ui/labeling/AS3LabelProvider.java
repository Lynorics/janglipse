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
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
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
  
  public StyledString text(final InterfaceMethod meth) {
    String _name = meth.getName();
    EObject _type = meth.getType();
    EList<Parameter> _params = meth.getParams();
    return this.computeTextForMethod(_name, _type, _params);
  }
  
  private StyledString computeTextForMethod(final String methName, final EObject type, final EList<Parameter> parameters) {
    String parameterNames = null;
    String name = null;
    if ((type instanceof Interface)) {
      String _name = ((Interface) type).getName();
      name = _name;
    } else {
      if ((type instanceof de.lynorics.eclipse.jangaroo.aS3.Class)) {
        String _name_1 = ((de.lynorics.eclipse.jangaroo.aS3.Class) type).getName();
        name = _name_1;
      }
    }
    boolean _equals = Objects.equal(name, null);
    if (_equals) {
      String _text = this.getText(type);
      name = _text;
    }
    boolean _notEquals = (!Objects.equal(parameters, null));
    if (_notEquals) {
      for (final Parameter param : parameters) {
        {
          String pname = "*";
          EObject _type = param.getType();
          boolean _notEquals_1 = (!Objects.equal(_type, null));
          if (_notEquals_1) {
            EObject _type_1 = param.getType();
            if ((_type_1 instanceof Interface)) {
              EObject _type_2 = param.getType();
              String _name_2 = ((Interface) _type_2).getName();
              pname = _name_2;
            } else {
              EObject _type_3 = param.getType();
              if ((_type_3 instanceof de.lynorics.eclipse.jangaroo.aS3.Class)) {
                EObject _type_4 = param.getType();
                String _name_3 = ((de.lynorics.eclipse.jangaroo.aS3.Class) _type_4).getName();
                pname = _name_3;
              }
            }
            boolean _equals_1 = Objects.equal(pname, null);
            if (_equals_1) {
              EObject _type_5 = param.getType();
              String _text_1 = this.getText(_type_5);
              pname = _text_1;
            }
          }
          boolean _equals_2 = Objects.equal(pname, null);
          if (_equals_2) {
            pname = "*";
          }
          boolean _equals_3 = Objects.equal(parameterNames, null);
          if (_equals_3) {
            parameterNames = pname;
          } else {
            parameterNames = ((parameterNames + ",") + pname);
          }
        }
      }
    }
    boolean _notEquals_1 = (!Objects.equal(parameterNames, null));
    if (_notEquals_1) {
      parameterNames = (("(" + parameterNames) + ")");
    } else {
      parameterNames = "()";
    }
    StyledString _styledString = new StyledString((methName + parameterNames));
    StyledString _styledString_1 = new StyledString((": " + name), 
      StyledString.DECORATIONS_STYLER);
    return _styledString.append(_styledString_1);
  }
  
  public String image(final InterfaceMethod meth) {
    Modifier _modifier = meth.getModifier();
    AccessLevel _access = _modifier.getAccess();
    switch (_access) {
      case PUBLIC:
        return "outline-function-public.gif";
      case PROTECTED:
        return "outline-function-protected.gif";
      case PRIVATE:
        return "outline-function-private.gif";
      case INTERNAL:
        return "outline-function-internal.gif";
      default:
        break;
    }
    return null;
  }
  
  public StyledString text(final Method meth) {
    String _name = meth.getName();
    EObject _type = meth.getType();
    EList<Parameter> _params = meth.getParams();
    return this.computeTextForMethod(_name, _type, _params);
  }
  
  public Image image(final Method meth) {
    Image image = null;
    Modifier _modifier = meth.getModifier();
    AccessLevel _access = _modifier.getAccess();
    switch (_access) {
      case PUBLIC:
        Image _image = this.imageHelper.getImage("outline-function-public.gif");
        image = _image;
        break;
      case PROTECTED:
        Image _image_1 = this.imageHelper.getImage("outline-function-protected.gif");
        image = _image_1;
        break;
      case PRIVATE:
        Image _image_2 = this.imageHelper.getImage("outline-function-private.gif");
        image = _image_2;
        break;
      case INTERNAL:
        Image _image_3 = this.imageHelper.getImage("outline-function-internal.gif");
        image = _image_3;
        break;
      default:
        break;
    }
    return image;
  }
  
  public String text(final Uses uses) {
    return "use declarations";
  }
  
  public String image(final Uses uses) {
    return "outline-uses.gif";
  }
  
  public StyledString text(final VariableDeclaration varDecl) {
    String name = null;
    EObject _type = varDecl.getType();
    if ((_type instanceof Interface)) {
      EObject _type_1 = varDecl.getType();
      String _name = ((Interface) _type_1).getName();
      name = _name;
    } else {
      EObject _type_2 = varDecl.getType();
      if ((_type_2 instanceof de.lynorics.eclipse.jangaroo.aS3.Class)) {
        EObject _type_3 = varDecl.getType();
        String _name_1 = ((de.lynorics.eclipse.jangaroo.aS3.Class) _type_3).getName();
        name = _name_1;
      }
    }
    boolean _equals = Objects.equal(name, null);
    if (_equals) {
      EObject _type_4 = varDecl.getType();
      String _text = this.getText(_type_4);
      name = _text;
    }
    String _name_2 = varDecl.getName();
    StyledString _styledString = new StyledString(_name_2);
    StyledString _styledString_1 = new StyledString((": " + name), 
      StyledString.DECORATIONS_STYLER);
    return _styledString.append(_styledString_1);
  }
  
  public String image(final MemberVariableDeclaration varDecl) {
    Modifier _modifier = varDecl.getModifier();
    AccessLevel _access = _modifier.getAccess();
    switch (_access) {
      case PUBLIC:
        return "outline-field-public.gif";
      case PROTECTED:
        return "outline-field-protected.gif";
      case PRIVATE:
        return "outline-field-private.gif";
      case INTERNAL:
        return "outline-field-internal.gif";
      default:
        break;
    }
    return null;
  }
}
