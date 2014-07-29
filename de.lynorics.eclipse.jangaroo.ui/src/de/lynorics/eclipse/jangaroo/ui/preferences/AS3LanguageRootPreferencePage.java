/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.preferences;

import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.fields.LabelFieldEditor;

import de.lynorics.eclipse.jangaroo.ui.internal.AS3Activator;

/**
 * 
 * @author Lynorics
 */
public class AS3LanguageRootPreferencePage extends LanguageRootPreferencePage {
	
    @Override
    public void init(IWorkbench workbench) {
        setPreferenceStore(AS3Activator.getInstance().getPreferenceStore());
    }
    
    @Override
    protected void createFieldEditors() {
        addField(new LabelFieldEditor("Jangaroo for Eclipse", getFieldEditorParent()));
    }
    
}