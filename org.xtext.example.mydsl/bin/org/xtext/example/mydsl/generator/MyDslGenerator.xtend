/*
 * Multi-robot systems pattern- Generator 
 * Xtext 2.25.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.ProblemSpecifications
import org.xtext.example.mydsl.myDsl.TopMissions


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * 
 * Constraints:
 * (a) prohibit nested probabilities, (b) accept only LTL
 * properties for the reward and probability operators, and 
 * (c) prohibit the definition of specifications that lead to
 * the conjunction of quantitative and non-quantitative PRISM
 * formulae since such formulae can not be processed by PRISM.
 */

class MyDslGenerator extends AbstractGenerator {
	
	// open root "problemSpecification" resource as a EObject - EObjects are automatically updated
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		// -- instance tree
		val root = resource?.allContents?.head as ProblemSpecifications;
		// -- top missions
		val topmissions = root.topmissions
		// -- type of mission
		var finalString = ""
		for (tm: topmissions.toList){
			finalString += org.xtext.example.mydsl.generator.MyDslGenerator.getTopMissionTranslated(tm, resource) //check each mission in topmissions
		}
		// --save file
		fsa.generateFile(resource.getURI().lastSegment + '.prop', finalString);
		
		Tests.test_regex()
		
	}
	
	def static getTopMissionTranslated(TopMissions tmiss, Resource resource){
		var id = tmiss.name // mission ID
		var miss = tmiss.mission // mission in top mission
		var s = new String // return string
		// -- get mission translated
		s = ECPatterns.getMissionTranslated(miss,resource).replaceAll("\\s","").replaceAll("_space_"," ").replaceAll("\"\"", "\"");
		// -- check formulae for consistency
		s = checkFormulae(s)
		// -- add id
		s = id + ": " + s + "\n\n"
		s //return string
	}
	
	
	
	
	
	
	/** Constraints:
	 * (a) prohibit nested probabilities, (b) accept only LTL
	 * properties for the reward and probability operators, and 
	 * (c) prohibit the definition of specifications that lead to
	 * the conjunction of quantitative and non-quantitative PRISM
	 * formulae since such formulae can not be processed by PRISM.
	 */
	def static String checkFormulae(String s){
		var checked_s = ""
		
		//Reward inside a parenthesis means it is inside a R or P structure P...(R...), or part of a logic boolean formulae (e.g.: (R...)&(...) ) 
		if (s.contains("(R")){
			checked_s += "-Formulae: " + s
			checked_s += "\n  				-WARNING. Translation into PRISM may not be supported."
			checked_s += "\n  				--Feedback: Reward found inside inside parenthesis-- "
			return checked_s
		}
		//Prob. inside a parenthesis means it is inside a R or P structure P...(P...), or part of a logic boolean formulae (e.g.: (P...)&(...) )
		else if (s.contains("(P")){
			checked_s += "-Formulae: " + s
			checked_s += "\n  				-WARNING. Translation into PRISM may not be supported."
			checked_s += "\n  				--Feedback: Probability found inside parenthesis-- "
			return checked_s
		}
		//Possible error using (G[
		else if (s.contains("(G[")){
			checked_s += "-Formulae: " + s
			checked_s += "\n  				-WARNING. Translation into PRISM may not be supported."
			checked_s += "\n  				--Feedback: G bounded [...] found inside parenthesis-- "
			return checked_s
		}
		else{
			checked_s = s
		}
		
		/**REGEX not working on xtend
		var s2 = "1(R)"
		var rege = "\\("
		checked_s += s2
		if (s2.matches(rege)){
			checked_s += " here: " + rege
		}
		**/
		
		
		return checked_s
	}
	
	
	
	
}
