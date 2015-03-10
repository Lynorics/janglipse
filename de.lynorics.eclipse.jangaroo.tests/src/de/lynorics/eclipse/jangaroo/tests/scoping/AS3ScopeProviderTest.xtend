package de.lynorics.eclipse.jangaroo.tests.scoping;

import com.google.inject.Inject
import de.lynorics.eclipse.jangaroo.AS3InjectorProvider
import de.lynorics.eclipse.jangaroo.aS3.AS3Package
import de.lynorics.eclipse.jangaroo.aS3.Block
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Member
import de.lynorics.eclipse.jangaroo.aS3.Model
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AS3InjectorProvider))
class AS3ScopeProviderTest {

	@Inject
	extension ParseHelper<Model>;

	@Inject
	extension ValidationTestHelper;

	@Inject
	extension IScopeProvider;

	@Test
	def void testScopeProvider() {
		var clazz = '''
		class C {
			var f:A;
			function m(p: A): A {
				var v: A = null;
				// This return statement will be the measure point
				return null;
			}
		}
		class A {}
		'''.parse.classes.head;
		 var member = (clazz as Class).members.last;
		 var block = ((member as Member).meth.eContents.last as Block);
		 (block.eContents.last as ReturnStatement).expr => [
			// Scope is "member"
			assertScope (AS3Package::eINSTANCE.class_Members, "f, m, C.f, C.m");
			// Scope is "symbol"
			assertScope(AS3Package::eINSTANCE.symbolRef_Symbol, "p, v, m.p, m.v, C.m.p, C.m.v")
		]
	}

	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		context.assertNoErrors;
		Assert.assertEquals(expected.toString,context.getScope(reference).allElements.map[name].join(", "));
	}

}