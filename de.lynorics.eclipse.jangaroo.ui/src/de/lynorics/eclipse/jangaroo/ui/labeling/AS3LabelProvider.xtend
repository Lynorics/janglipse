/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
* generated by Xtext
*/
package de.lynorics.eclipse.jangaroo.ui.labeling

import com.google.inject.Inject
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Import
import de.lynorics.eclipse.jangaroo.aS3.Imports
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.Package
import de.lynorics.eclipse.jangaroo.aS3.Parameter
import de.lynorics.eclipse.jangaroo.aS3.Uses
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

import static de.lynorics.eclipse.jangaroo.aS3.AccessLevel.*
import de.lynorics.eclipse.jangaroo.aS3.VarType
import org.eclipse.emf.common.util.EList

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class AS3LabelProvider extends DefaultEObjectLabelProvider {

  @Inject
  private IImageHelper imageHelper;
  
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

    def image(Class clas) {
      return "outline-class.gif";
    }

    def image(Package pack) {
      return "outline-package.gif";
    }

    def image(Interface inter) {
      return "outline-interface.gif";
    }

    def text(Imports imp) {
      return 'import declarations';  
    }
    
    def image(Imports imp) {
      return "outline-imports.gif";
    }

    def image(Import imp) {
      return "outline-import.gif";
    }

    def text(InterfaceMethod meth) {
      computeTextForMethod(meth.name, meth.type, meth.params);  
    }
    
  private def computeTextForMethod(String methName, VarType varType, EList<Parameter> parameters) {
      var String parameterNames = null
        var String name = varType.name;
        if (name == null) {
          name = varType.type.getText;
        }
        if (parameters != null) {
          for (Parameter param: parameters) {
            var String pname = '*';
            if (param.type != null) {
              pname = param.type.name;
              if (pname == null &&
                  param.type.type != null) {
                pname = param.type.type.getText;
              }
            }
            if (pname == null) {
              pname = '*';
            }
            if (parameterNames == null) {
              parameterNames = pname;
            }
            else {
              parameterNames = parameterNames+','+pname;
            }
          }
        }
        if (parameterNames != null) {
          parameterNames = '('+parameterNames+')'
        }
        else {
          parameterNames = '()'
        }
        return new StyledString(methName + parameterNames).
         append(new StyledString(': ' +name,
           StyledString::DECORATIONS_STYLER
         ))
    }
    
    def image(InterfaceMethod meth) {
      switch(meth.modifier.access) {
        case PUBLIC: {
          return "outline-function-public.gif";
        }
        case PROTECTED: {
          return "outline-function-protected.gif";
        }
        case PRIVATE: {
          return "outline-function-private.gif";
        }
        case INTERNAL: {
          return "outline-function-internal.gif";
        }
      }
    }

    def text(Method meth) {
      computeTextForMethod(meth.name, meth.type, meth.params);  
    }
  
    def Image image(Method meth) {
      var Image image = null;
      switch(meth.modifier.access) {
        case PUBLIC: {
          image = imageHelper.getImage("outline-function-public.gif");
        }
        case PROTECTED: {
          image = imageHelper.getImage("outline-function-protected.gif");
        }
        case PRIVATE: {
          image = imageHelper.getImage("outline-function-private.gif");
        }
        case INTERNAL: {
          image = imageHelper.getImage("outline-function-internal.gif");
        }
      }
//      var Class parent = meth.eContainer.eContainer as Class;
//      if (parent.name.equals(meth.name)) {
//          var Image overlay = imageHelper.getImage("outline-overlay-constructor.gif");
//          image = new DecorationOverlayIcon(image, overlay.imageDescriptor, IDecoration.TOP_RIGHT).convertToImage;
//      }
      return image;
    }

    def text(Uses uses) {
      return 'use declarations';  
    }
    
    def image(Uses uses) {
      return "outline-uses.gif";
    }

    def text(VariableDeclaration varDecl) {
      var String name = varDecl.type.name;
      if (name == null) {
        name = varDecl.type.type.getText;
      }
      return new StyledString(varDecl.name).
       append(new StyledString(': ' +name,
         StyledString::DECORATIONS_STYLER
       ));  
    }
    
    def image(VariableDeclaration varDecl) {
      switch(varDecl.access) {
        case PUBLIC: {
          return "outline-field-public.gif";
        }
        case PROTECTED: {
          return "outline-field-protected.gif";
        }
        case PRIVATE: {
          return "outline-field-private.gif";
        }
        case INTERNAL: {
          return "outline-field-internal.gif";
        }
      }
    }

}
