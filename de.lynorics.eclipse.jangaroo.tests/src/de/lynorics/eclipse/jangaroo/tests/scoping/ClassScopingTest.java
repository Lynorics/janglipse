package de.lynorics.eclipse.jangaroo.tests.scoping;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.lynorics.eclipse.jangaroo.AS3InjectorProvider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Model;

@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class ClassScopingTest {
	@Inject
	Provider<ResourceSet> resourceSetProvider;

	@Inject
	ParseHelper<AS3Package> parseHelper;

	ValidationTestHelper validationTestHelper = new ValidationTestHelper();
	
	@Test
	public void testTwoFiles() throws Exception {
		ResourceSet resourceSet = resourceSetProvider.get();
		Model first = (Model) parseHelper.parse("class B extends A {}", resourceSet);
		Model second = (Model) parseHelper.parse("class A { var b: B; }", resourceSet);
		validationTestHelper.assertNoErrors(first);
		validationTestHelper.assertNoErrors(second);
		Assert.assertSame("Scoping must reference the same class instance!", second.getClasses().get(0), ((de.lynorics.eclipse.jangaroo.aS3.Class)first.getClasses().get(0)).getSuperclass());
	}

	@Test
	public void testPackagesAndClassQualifiedNames() throws Exception {
		ResourceSet resourceSet = resourceSetProvider.get();
		Model first = (Model) parseHelper.parse("package my.first.pack { class B extends my.second.pack.A {} }", resourceSet);
		Model second = (Model) parseHelper.parse("package my.second.pack { class A { var b: my.first.pack.B; } }", resourceSet);
		validationTestHelper.assertNoErrors(first);
		validationTestHelper.assertNoErrors(second);
		Assert.assertSame("Scoping must reference the same class instance!", second.getPackage().getClasses().get(0), ((de.lynorics.eclipse.jangaroo.aS3.Class)first.getPackage().getClasses().get(0)).getSuperclass());
	}

	@Test
	public void testSamePackage() throws Exception {
		ResourceSet resourceSet = resourceSetProvider.get();
		Model first = (Model) parseHelper.parse("package my.first.pack { class B extends A {} }", resourceSet);
		Model second = (Model) parseHelper.parse("package my.first.pack { class A { var b: B; } }", resourceSet);
		validationTestHelper.assertNoErrors(first);
		validationTestHelper.assertNoErrors(second);
		Assert.assertSame("Classes within the same package must be available in the scope!", second.getPackage().getClasses().get(0), ((de.lynorics.eclipse.jangaroo.aS3.Class)first.getPackage().getClasses().get(0)).getSuperclass());
	}
	
	@Test
	public void testImports() throws Exception {
		ResourceSet resourceSet = resourceSetProvider.get();
		Model first = (Model) parseHelper.parse("package my.first.pack { class C1 {} class C2 {} }", resourceSet);
		Model second = (Model) parseHelper.parse("package my.second.pack { class D1 {} class D2 {} }", resourceSet);
		Model third = (Model) parseHelper.parse("package my.third.pack { import my.first.pack.C1; class E extends C1 { var c: my.first.pack.C2; } }", resourceSet);
		Model fourth = (Model) parseHelper.parse("package my.fourth.pack { import my.second.pack.*; class F { var d1: D1; var d2: D2; } }", resourceSet);
		validationTestHelper.assertNoErrors(first);
		validationTestHelper.assertNoErrors(second);
		validationTestHelper.assertNoErrors(third);
		validationTestHelper.assertNoErrors(fourth);
		
	}

	@Test
	public void testImportMissing() throws Exception {
		ResourceSet resourceSet = resourceSetProvider.get();
		Model first = (Model) parseHelper.parse("package my.first.pack { class C1 {} class C2 {} }", resourceSet);
		Model second = (Model) parseHelper.parse("package my.third.pack { import my.first.pack.C1; class D extends C2 {} }", resourceSet);
		validationTestHelper.assertNoErrors(first);
		validationTestHelper.assertError(second, AS3Package.eINSTANCE.getClass_(), Diagnostic.LINKING_DIAGNOSTIC, "Couldn't resolve reference to Class 'C2'.");
	}
}