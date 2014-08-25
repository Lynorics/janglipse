/**
 * Copyright 2013
 * 
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.outline;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.AS3ModelUtil;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineMode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeFactory;
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class AS3OutlineTreeProvider extends DefaultOutlineTreeProvider implements IOutlineTreeProvider.ModeAware {
  private final static OutlineMode HIDE_INHERITED_MODE = new OutlineMode("hide", "hide inherited members");
  
  private final static OutlineMode SHOW_INHERITED_MODE = new OutlineMode("show", "show inherited members");
  
  private final static List<OutlineMode> MODES = CollectionLiterals.<OutlineMode>newArrayList(AS3OutlineTreeProvider.HIDE_INHERITED_MODE, AS3OutlineTreeProvider.SHOW_INHERITED_MODE);
  
  private int currentModeIndex = 0;
  
  @Inject
  private ILabelProvider labelProvider;
  
  @Inject
  private OutlineNodeFactory factory;
  
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
      EList<directive> _directives = _package_4.getDirectives();
      boolean _notEquals_2 = (!Objects.equal(_directives, null));
      if (_notEquals_2) {
        de.lynorics.eclipse.jangaroo.aS3.Package _package_5 = model.getPackage();
        EList<directive> _directives_1 = _package_5.getDirectives();
        for (final directive dir : _directives_1) {
          Uses _uses = dir.getUses();
          this.createNode(parentNode, _uses);
        }
      }
      de.lynorics.eclipse.jangaroo.aS3.Package _package_6 = model.getPackage();
      EList<EObject> _classes = _package_6.getClasses();
      boolean _notEquals_3 = (!Objects.equal(_classes, null));
      if (_notEquals_3) {
        de.lynorics.eclipse.jangaroo.aS3.Package _package_7 = model.getPackage();
        EList<EObject> _classes_1 = _package_7.getClasses();
        for (final EObject clazz : _classes_1) {
          this.createNode(parentNode, clazz);
        }
      }
    } else {
      Imports _imp_2 = model.getImp();
      boolean _notEquals_4 = (!Objects.equal(_imp_2, null));
      if (_notEquals_4) {
        Imports _imp_3 = model.getImp();
        this.createNode(parentNode, _imp_3);
      }
      EList<EObject> _classes_2 = model.getClasses();
      boolean _notEquals_5 = (!Objects.equal(_classes_2, null));
      if (_notEquals_5) {
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
      {
        MemberVariableDeclaration _var = member.getVar();
        boolean _notEquals = (!Objects.equal(_var, null));
        if (_notEquals) {
          MemberVariableDeclaration _var_1 = member.getVar();
          this.createNode(parentNode, _var_1);
        }
        Method _meth = member.getMeth();
        boolean _notEquals_1 = (!Objects.equal(_meth, null));
        if (_notEquals_1) {
          Method _meth_1 = member.getMeth();
          this.createNode(parentNode, _meth_1);
        }
      }
    }
    boolean _and = false;
    OutlineMode _currentMode = this.getCurrentMode();
    boolean _equals = Objects.equal(AS3OutlineTreeProvider.SHOW_INHERITED_MODE, _currentMode);
    if (!_equals) {
      _and = false;
    } else {
      de.lynorics.eclipse.jangaroo.aS3.Class _containingClass = AS3ModelUtil.containingClass(clazz);
      boolean _notEquals = (!Objects.equal(_containingClass, null));
      _and = _notEquals;
    }
    if (_and) {
      de.lynorics.eclipse.jangaroo.aS3.Class _containingClass_1 = AS3ModelUtil.containingClass(clazz);
      de.lynorics.eclipse.jangaroo.aS3.Class myclass = _containingClass_1.getSuperclass();
      boolean collectPrivate = true;
      boolean _notEquals_1 = (!Objects.equal(myclass, null));
      boolean _while = _notEquals_1;
      while (_while) {
        {
          this.collectMethodsOfClass(parentNode, myclass, collectPrivate);
          de.lynorics.eclipse.jangaroo.aS3.Class _superclass = myclass.getSuperclass();
          myclass = _superclass;
          collectPrivate = false;
        }
        boolean _notEquals_2 = (!Objects.equal(myclass, null));
        _while = _notEquals_2;
      }
    }
  }
  
  private void collectMethodsOfClass(final AbstractOutlineNode parentNode, final de.lynorics.eclipse.jangaroo.aS3.Class clazz, final boolean collectPrivate) {
    List<EObject> _accessibleFunctions = AS3ModelUtil.accessibleFunctions(clazz);
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      public void apply(final EObject meth) {
        if ((meth instanceof Method)) {
          boolean _or = false;
          if (collectPrivate) {
            _or = true;
          } else {
            String _name = AccessLevel.PRIVATE.getName();
            Modifier _modifier = ((Method)meth).getModifier();
            AccessLevel _access = _modifier.getAccess();
            String _name_1 = ((AccessLevel) _access).getName();
            boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_name_1);
            boolean _not = (!_equalsIgnoreCase);
            _or = _not;
          }
          if (_or) {
            EObjectNode eno = AS3OutlineTreeProvider.this.createAS3Node(parentNode, meth);
            Object label = AS3OutlineTreeProvider.this.getText(meth);
            if ((!(label instanceof StyledString))) {
              String _string = label.toString();
              StyledString _styledString = new StyledString(_string);
              label = _styledString;
            }
            de.lynorics.eclipse.jangaroo.aS3.Class _containingClass = AS3ModelUtil.containingClass(meth);
            String _name_2 = _containingClass.getName();
            String _plus = (" - " + _name_2);
            StyledString _styledString_1 = new StyledString(_plus, StyledString.COUNTER_STYLER);
            ((StyledString) label).append(_styledString_1);
            eno.setText(((StyledString) label));
          }
        }
      }
    };
    IterableExtensions.<EObject>forEach(_accessibleFunctions, _function);
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
  
  public boolean _isLeaf(final MemberVariableDeclaration varDecl) {
    return true;
  }
  
  public boolean _isLeaf(final de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    return true;
  }
  
  public OutlineMode getCurrentMode() {
    List<OutlineMode> _outlineModes = this.getOutlineModes();
    return _outlineModes.get(this.currentModeIndex);
  }
  
  public OutlineMode getNextMode() {
    List<OutlineMode> _outlineModes = this.getOutlineModes();
    List<OutlineMode> _outlineModes_1 = this.getOutlineModes();
    int _size = _outlineModes_1.size();
    int _modulo = ((this.currentModeIndex + 1) % _size);
    return _outlineModes.get(_modulo);
  }
  
  public List<OutlineMode> getOutlineModes() {
    return AS3OutlineTreeProvider.MODES;
  }
  
  public void setCurrentMode(final OutlineMode outlineMode) {
    List<OutlineMode> _outlineModes = this.getOutlineModes();
    int newIndex = _outlineModes.indexOf(outlineMode);
    if ((newIndex != (-1))) {
      this.currentModeIndex = newIndex;
    }
  }
  
  private EObjectNode createAS3Node(final IOutlineNode parentNode, final EObject modelElement) {
    Object text = this.getText(modelElement);
    ImageDescriptor image = this.getImageDescriptor(modelElement);
    return this.factory.createEObjectNode(parentNode, modelElement, ((ImageDescriptor) image), text, true);
  }
  
  private ImageDescriptor getImageDescriptor(final Object modelElement) {
    if ((this.labelProvider instanceof ILabelProviderImageDescriptorExtension)) {
      return ((ILabelProviderImageDescriptorExtension)this.labelProvider).getImageDescriptor(modelElement);
    } else {
      return null;
    }
  }
  
  private Object getText(final Object modelElement) {
    if ((this.labelProvider instanceof DelegatingStyledCellLabelProvider.IStyledLabelProvider)) {
      return ((DelegatingStyledCellLabelProvider.IStyledLabelProvider)this.labelProvider).getStyledText(modelElement);
    } else {
      return this.labelProvider.getText(modelElement);
    }
  }
}
