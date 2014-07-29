package de.lynorics.eclipse.jangaroo.ui.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.xtext.ui.editor.preferences.AbstractPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.fields.LabelFieldEditor;

/**
 * @author Lynorics
 */
public class AS3ValidatorPreferencePage extends AbstractPreferencePage {

	private static final String CHECK_NO_STATEMENT_AFTER_RETURN = "checkNoStatementAfterReturn";
	private static final String CHECK_NO_CYCLE_IN_CLASS_HIERARCHIE = "checkNoCycleInClassHierarchie";
	private static final String CHECK_PUBLIC_API_VIOLATION = "checkPublicApiViolation";
	private static final String CHECK_PACKAGE_STARTS_WITH_LOWERCASE = "checkPackageStartsWithLowercase";
	private static final String CHECK_METHOD_STARTS_WITH_LOWERCASE = "checkMethodStartsWithLowercase";
	private static final String CHECK_INTERFACE_STARTS_WITH_CAPITAL = "checkInterfaceStartsWithCapital";
	private static final String CHECK_CLASS_STARTS_WITH_CAPITAL = "checkClassStartsWithCapital";
    private static final String NAME_CLAS_VARIABLE_WITH_CLASS = "nameClashVariableWithClass";

	private static final String LEVEL_ERROR   = "Error";
	private static final String LEVEL_WARNING = "Warning";
	private static final String LEVEL_IGNORE  = "Ignore";
	
	private final static String[][] levels = new String[][] {
		{LEVEL_ERROR,LEVEL_ERROR},
		{LEVEL_WARNING,LEVEL_WARNING},
		{LEVEL_IGNORE,LEVEL_IGNORE}
	};
	
	private void initDefaults() {
		getPreferenceStore().setDefault(CHECK_NO_STATEMENT_AFTER_RETURN, LEVEL_ERROR);
		getPreferenceStore().setDefault(CHECK_NO_CYCLE_IN_CLASS_HIERARCHIE, LEVEL_ERROR);
		getPreferenceStore().setDefault(CHECK_PUBLIC_API_VIOLATION, LEVEL_WARNING);
		getPreferenceStore().setDefault(CHECK_PACKAGE_STARTS_WITH_LOWERCASE, LEVEL_WARNING);
		getPreferenceStore().setDefault(CHECK_METHOD_STARTS_WITH_LOWERCASE, LEVEL_WARNING);
		getPreferenceStore().setDefault(CHECK_INTERFACE_STARTS_WITH_CAPITAL, LEVEL_WARNING);
		getPreferenceStore().setDefault(CHECK_CLASS_STARTS_WITH_CAPITAL, LEVEL_WARNING);
		getPreferenceStore().setDefault(NAME_CLAS_VARIABLE_WITH_CLASS, LEVEL_WARNING);
	}
	
	@Override
	protected void createFieldEditors() {
		initDefaults();
        addHeader("Code style");
        addValidation(CHECK_CLASS_STARTS_WITH_CAPITAL, "Class should start with capital letter");
        addValidation(CHECK_INTERFACE_STARTS_WITH_CAPITAL, "Interface should start with capital letter");
        addValidation(CHECK_METHOD_STARTS_WITH_LOWERCASE, "Method should start with lower case letter");
        addValidation(CHECK_PACKAGE_STARTS_WITH_LOWERCASE, "Package should start with lower case letter");
        addHeader("Correctness");
        addValidation(CHECK_NO_CYCLE_IN_CLASS_HIERARCHIE, "Cycle in class hierarchie");
        addValidation(CHECK_NO_STATEMENT_AFTER_RETURN, "Unreachable statement after return");
        addValidation(CHECK_PUBLIC_API_VIOLATION, "Public API violation (experimental)");
        addValidation(NAME_CLAS_VARIABLE_WITH_CLASS, "Variable hides class/interface with same name");
	}

	private void addValidation(String propertyName, String label) {
		addField(new ComboFieldEditor(propertyName, label, levels, getFieldEditorParent()));
	}

	private void addHeader(String header) {
		addField(new LabelFieldEditor(header, getFieldEditorParent()));
	}
	
}
