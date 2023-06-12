package org.xtext.example.mydsl.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.xtext.example.mydsl.myDsl.Missions
import org.xtext.example.mydsl.myDsl.Preservation
import org.xtext.example.mydsl.myDsl.Conservation
import org.xtext.example.mydsl.myDsl.Maximize

/** 
 * IResourceDescriptions and IEObjectDescriptions are updated in the following situations:
 * They are incrementally updated when editing a file within Eclipse (as long as �Project -> Build Automatically� is not disabled);
 * They are completely refreshed when performing �Project -> Clean.. -> Clean all projects�.
 * Based on: http://www.cs.ru.nl/J.Hooman/DSL/AdvancedXtextManual.pdf 
**/
class ResourceUtils {
	
	def static rewardSign(String s, String sign, String measure, double value, Missions submission, Resource resource) {
		return "R{\""+measure+"\"}"+ sign + value.toString + " [" + ECPatterns.getMissionTranslated(submission, resource) + "]"
	}
	
	/**Minimise reward */
	def static minimizeReward(Conservation m, Resource resource){
		return minimizeReward(m.missions, m.measure , resource)
	}
	
	def static minimizeReward(Maximize m, Resource resource){
		var measure = m.measure
		var submission = m.mission
		return minimizeReward(submission, measure, resource)
	}
	
	def static minimizeReward(Missions submission, String measure, Resource resource){
		var s=""
		s += "R{\""+measure+"\"}min=?["+ ECPatterns.getMissionTranslated(submission, resource) +"]"
		return s
	}
	
	
	/**Reward between */
	def static rewardBetween_v1v2(Preservation m, Resource resource){
			var s=""
			var submission = m.missions
			s += "(R{\""+ m.measure +"\"}>=" + m.value1 + "["  
			s += ECPatterns.getMissionTranslated(submission, resource) + "]"
			s+= ") & ("
			s += "R{\""+ m.measure +"\"}<=" + m.value2 + "["  
			s += ECPatterns.getMissionTranslated(submission, resource) + "])"
		}
		
	
	
	def static getCondition(Resource resource) {
		//--print translated condition when called in a "pat"
		var s= ""
		s
	}
	
} 
