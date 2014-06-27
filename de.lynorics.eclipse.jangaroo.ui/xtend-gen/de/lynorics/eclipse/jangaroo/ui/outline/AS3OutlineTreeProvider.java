/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.outline;

import com.google.common.base.Objects;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class AS3OutlineTreeProvider extends DefaultOutlineTreeProvider {
  public void _createChildren(final DocumentRootNode parentNode, final Model model) {
    de.lynorics.eclipse.jangaroo.aS3.Package _package = model.getPackage();
    boolean _notEquals = (!Objects.equal(_package, null));
    if (_notEquals) {
      de.lynorics.eclipse.jangaroo.aS3.Package _package_1 = model.getPackage();
      this.createNode(parentNode, _package_1);
      de.lynorics.eclipse.jangaroo.aS3.Package _package_2 = model.getPackage();
      Imports _imp = _package_2.getImp();
      boolean _notEquals_1 = (!Objects.equal(_imp, null));
      if (_notEquals_1) {
        de.lynorics.eclipse.jangaroo.aS3.Package _package_3 = model.getPackage();
        Imports _imp_1 = _package_3.getImp();
        this.createNode(parentNode, _imp_1);
      }
      de.lynorics.eclipse.jangaroo.aS3.Package _package_4 = model.getPackage();
      EList<EObject> _classes = _package_4.getClasses();
      boolean _notEquals_2 = (!Objects.equal(_classes, null));
      if (_notEquals_2) {
        de.lynorics.eclipse.jangaroo.aS3.Package _package_5 = model.getPackage();
        EList<EObject> _classes_1 = _package_5.getClasses();
        for (final EObject clazz : _classes_1) {
          this.createNode(parentNode, clazz);
        }
      }
    } else {
      Imports _imp_2 = model.getImp();
      boolean _notEquals_3 = (!Objects.equal(_imp_2, null));
      if (_notEquals_3) {
        Imports _imp_3 = model.getImp();
        this.createNode(parentNode, _imp_3);
      }
      EList<EObject> _classes_2 = model.getClasses();
      boolean _notEquals_4 = (!Objects.equal(_classes_2, null));
      if (_notEquals_4) {
        EList<EObject> _classes_3 = model.getClasses();
        for (final EObject clazz_1 : _classes_3) {
          this.createNode(parentNode, clazz_1);
        }
      }
    }
  }
  
  public void _createChildren(final AbstractOutlineNode parentNode, final de.lynorics.eclipse.jangaroo.aS3.Class clazz) {
    EList<Member> _members = clazz.getMembers();
    for (final Member member : _members) {
      VariableDeclaration _var = member.getVar();
      boolean _notEquals = (!Objects.equal(_var, null));
      if (_notEquals) {
        VariableDeclaration _var_1 = member.getVar();
        this.createNode(parentNode, _var_1);
      }
    }
    EList<Member> _members_1 = clazz.getMembers();
    for (final Member member_1 : _members_1) {
      Method _meth = member_1.getMeth();
      boolean _notEquals_1 = (!Objects.equal(_meth, null));
      if (_notEquals_1) {
        Method _meth_1 = member_1.getMeth();
        this.createNode(parentNode, _meth_1);
      }
    }
  }
  
  public void _createChildren(final AbstractOutlineNode parentNode, final Interface intf) {
    EList<InterfaceMethod> _members = intf.getMembers();
    for (final InterfaceMethod member : _members) {
      this.createNode(parentNode, member);
    }
  }
  
  public boolean _isLeaf(final Method method) {
    return true;
  }
  
  public boolean _isLeaf(final InterfaceMethod method) {
    return true;
  }
  
  public boolean _isLeaf(final VariableDeclaration varDecl) {
    return true;
  }
  
  public boolean _isLeaf(final de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    return true;
  }
}
