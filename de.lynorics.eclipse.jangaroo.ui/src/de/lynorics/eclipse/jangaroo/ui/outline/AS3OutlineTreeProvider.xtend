/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
* generated by Xtext
*/
package de.lynorics.eclipse.jangaroo.ui.outline

import de.lynorics.eclipse.jangaroo.aS3.Method
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import de.lynorics.eclipse.jangaroo.aS3.Model
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode
import de.lynorics.eclipse.jangaroo.aS3.Member
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class AS3OutlineTreeProvider extends DefaultOutlineTreeProvider {

  def _createChildren(DocumentRootNode parentNode,
      Model model) {
      if (model.package != null) {
        createNode(parentNode, model.package);
        if (model.package.imp != null) {
          createNode(parentNode, model.package.imp)
        }
        if (model.package.classes != null) {
          for (EObject clazz: model.package.classes)
          createNode(parentNode, clazz)
        }
      }
      else {
        if (model.imp != null) {
          createNode(parentNode, model.imp)
        }
        if (model.classes != null) {
          for (EObject clazz: model.classes)
            createNode(parentNode, clazz)
        }
      }
  }
  
  def _createChildren(AbstractOutlineNode parentNode,
      de.lynorics.eclipse.jangaroo.aS3.Class clazz) {
    for (Member member : clazz.members) {
      if (member.^var != null) {
        createNode(parentNode, member.^var);
      }
    }
    for (Member member : clazz.members) {
      if (member.meth != null) {
        createNode(parentNode, member.meth);
      }
    }
  }
  
  def _createChildren(AbstractOutlineNode parentNode,
      Interface intf) {
    for (InterfaceMethod member : intf.members) {
      createNode(parentNode, member);
    }
  }
  
  def _isLeaf(Method method) {
    return true;
  }

  def _isLeaf(InterfaceMethod method) {
    return true;
  }

  def _isLeaf(VariableDeclaration varDecl) {
    return true;
  }
  
  def _isLeaf(de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    return true;
  }
  
}
