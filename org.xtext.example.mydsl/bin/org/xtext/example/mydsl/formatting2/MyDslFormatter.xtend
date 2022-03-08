/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.myDsl.ProblemSpecifications
import org.xtext.example.mydsl.myDsl.TopMissions
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(ProblemSpecifications problemSpecifications, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (location : problemSpecifications.location) {
			location.format
		}
		for (action : problemSpecifications.action) {
			action.format
		}
		for (robots : problemSpecifications.robots) {
			robots.format
		}
		for (condition : problemSpecifications.condition) {
			condition.format
		}
		for (topMissions : problemSpecifications.topmissions) {
			topMissions.format
		}
	}

	def dispatch void format(TopMissions topMissions, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		topMissions.mission.format
	}
	
	// TODO: implement for ShallMissions, ComplexMissions, Negation, Composition, React, Counteract, Delayed, Maximize, AtMost, Within, Conservation, Preservation, Pause, Timeout, Repeat, End, Proportional, Accrue, ReliabilityConfidence, Equidistance
}
