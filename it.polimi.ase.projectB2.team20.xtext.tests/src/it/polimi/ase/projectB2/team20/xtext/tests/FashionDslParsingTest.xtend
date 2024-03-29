/*
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.tests

import com.google.inject.Inject
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDomain
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(FashionDslInjectorProvider)
class FashionDslParsingTest{

	@Inject
	ParseHelper<FashionDomain> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
