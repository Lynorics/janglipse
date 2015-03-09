package de.lynorics.eclipse.jangaroo.tests;

import com.google.inject.Inject
import de.lynorics.eclipse.jangaroo.AS3Index
import de.lynorics.eclipse.jangaroo.AS3InjectorProvider
import de.lynorics.eclipse.jangaroo.aS3.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert
import org.eclipse.emf.ecore.EObject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(AS3InjectorProvider))
public class AS3IndexTest {
	@Inject
	extension AS3Index;

	@Inject
	extension ParseHelper<Model>;

	/**
	 * TODO what about a private class?
	 * TODO what about a private global const/var?
	 */
	@Test
	def testExportedEObjectDescriptions() {
		'''
		// Should be visible because it is declared globally without scope
		const c1;
		
		// Should be visible because it is declared globally without scope
		var v1;
		
		// Should be visible
		class C {
			// Should not be visible because it is within a scope
			var f: A;
			function m(p:A): A {
				var v: A = null;
				return null;
			}
		}

		// Should be visible
		class A {}
		'''.parse.assertExportedEObjectDescriptions("C, A, c1, v1");
	}

	@Test
	def testExportedEObjectDescriptionsWithPackages() {
		'''
		package my.pack {
		// Should be visible because it is declared globally without scope
		const c1;
		
		// Should be visible because it is declared globally without scope
		var v1;
		
		// Should be visible
		class C {
			// Should not be visible because it is within a scope
			var f: A;
			function m(p:A): A {
				var v: A = null;
				return null;
			}
		}

		// Should be visible
		class A {}
		}
		'''.parse.assertExportedEObjectDescriptions("my.pack.C, my.pack.A, my.pack.c1, my.pack.v1");
	}

	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		Assert.assertEquals(expected.toString,
			o.getExportedEObjectDescriptions.map[
				qualifiedName
			].join(", ")
		)
	}
}