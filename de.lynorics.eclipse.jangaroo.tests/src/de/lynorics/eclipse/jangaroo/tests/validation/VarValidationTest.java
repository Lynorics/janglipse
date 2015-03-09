package de.lynorics.eclipse.jangaroo.tests.validation;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.lynorics.eclipse.jangaroo.AS3InjectorProvider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.validation.AS3Validator;

@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class VarValidationTest {
	@Inject
	Provider<ResourceSet> resourceSetProvider;

	@Inject
	ParseHelper<Model> parseHelper;

	ValidationTestHelper validationTestHelper = new ValidationTestHelper();

	@Test
	@Ignore("TODO")
	public void testParsingAndLinkingWithVars() throws Exception {
		Model first = parseHelper.parse("var s1 = 'foo'; var s2 = 'bar'; var s3 = s1 + s2;");
		validationTestHelper.assertNoErrors(first);
	}

	@Test
	public void testParsingAndLinkingWithMissingVar() throws Exception {
		Model first = parseHelper.parse("var s1 = s2;");
		validationTestHelper.assertError(first, AS3Package.eINSTANCE.getSymbolRef(), Diagnostic.LINKING_DIAGNOSTIC, "Couldn't resolve reference to EObject 's2'.");
	}

	@Test
	@Ignore("TODO")
	public void testParsingAndLinkingWithWrongVarOrder() throws Exception {
		Model first = parseHelper.parse("var s1 = s2; var s2 = s1;");
		validationTestHelper.assertError(first, AS3Package.eINSTANCE.getClass_(), AS3Validator.FORWARD_REFERENCE, "forwardReference");
	}

}