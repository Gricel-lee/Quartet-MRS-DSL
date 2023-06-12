package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource


import org.xtext.example.mydsl.myDsl.Missions
import org.xtext.example.mydsl.myDsl.ShallMissions
import org.xtext.example.mydsl.myDsl.ComplexMissions
import org.xtext.example.mydsl.myDsl.ElementaryPatterns
import org.xtext.example.mydsl.myDsl.Negation
import org.xtext.example.mydsl.myDsl.Composition
import org.xtext.example.mydsl.myDsl.Maximize
import org.xtext.example.mydsl.myDsl.AtMost
import org.xtext.example.mydsl.myDsl.Within
import org.xtext.example.mydsl.myDsl.Conservation
import org.xtext.example.mydsl.myDsl.Preservation
import org.xtext.example.mydsl.myDsl.Pause
import org.xtext.example.mydsl.myDsl.Timeout
import org.xtext.example.mydsl.myDsl.Repeat
import org.xtext.example.mydsl.myDsl.End
import org.xtext.example.mydsl.myDsl.Proportional
import org.xtext.example.mydsl.myDsl.Execute
import org.xtext.example.mydsl.myDsl.Accrue
import org.xtext.example.mydsl.myDsl.ReliabilityConfidence
import org.xtext.example.mydsl.myDsl.Equidistance
import org.xtext.example.mydsl.myDsl.Trail
import org.xtext.example.mydsl.myDsl.CompositePatterns

class ECPatterns {
	
	def static String getMissionTranslated(Missions miss, Resource resource){
		var s = new String // return string
		switch miss {
			//====================
			//--- *Shall missions
			ShallMissions:{
				// robot SHALL pat
				var rob = miss.robots.name //robot
				var pat = miss.movementPatterns //pattern
				var patt =  Patterns.getPat(pat, rob, resource)  //specification pattern translation
				s += patt
				//*Continue with getting patterns
			}
			//====================
			//--- *Complex (and,or,not) missions
			ComplexMissions:{
				//complex mission: NOT, AND, OR
				var typeComplexMiss = miss.composition
				switch typeComplexMiss{
					Negation:{
						var miss_negated = typeComplexMiss.not 
						s += "!("
						s += getMissionTranslated(miss_negated, resource) // get mission translated
						s+=")"
					}
					Composition:{
						var miss1 = typeComplexMiss.miss1
						var miss2 = typeComplexMiss.miss2
						s+= "("
						s += getMissionTranslated(miss1, resource) // get mission translated
						
						if (typeComplexMiss.binaryType=="and"){
							s += ") & ("	
						}
						else if (typeComplexMiss.binaryType=="or"){
							s += ") | ("
						}
						s += getMissionTranslated(miss2, resource) // get mission translated
						s+= " )"
					}
				}
				
			}
			//====================
			//-- *Elementary (Maximize | AtMost | Within) missions
			ElementaryPatterns:{
				var m = miss
				var submission = m.mission
				// if probability -- done
				if (m.reward===null){
					switch m{
						//-- done
						Maximize:{
							if (m.type=="maximize"){
								s += "Pmax=?["+ getMissionTranslated(submission, resource) +"]"
							}
							else if (m.type=="minimize"){
								s += "Pmin=?["+ getMissionTranslated(submission, resource) +"]"
							}
						}
						//-- done
						AtMost:{
							//sign
							var sign = ""
							if (m.type=="at most")
								sign = "<="
							else if (m.type=="less than")
								sign = "<"
							else if (m.type=="at least")
								sign = ">="
							else if (m.type=="greater than")
								sign = ">"
								
							//string
							if (m.type=="exactly"){
								s += "(P>=" + m.value.toString +"["+ getMissionTranslated(submission, resource) +"]"
								s += ") & ("
								s += "P<=" + m.value.toString +"["+ getMissionTranslated(submission, resource) +"])"
							}
							else{
								s += "P"+ sign + m.value.toString +"["+ getMissionTranslated(submission, resource) +"]"
							}
							
						}
						//-- done
						Within:{
							if (m.type=="within"){
								s += "(P>="+ m.value1.toString +"["+ getMissionTranslated(submission, resource) +"])"
								s += " & "
								s += "(P<="+ m.value2.toString +"["+ getMissionTranslated(submission, resource) +"])"
							}
							else if (m.type=="strictly within"){
								s += "(P>"+ m.value1.toString +"["+ getMissionTranslated(submission, resource) +"])"
								s += " & "
								s += "(P<"+ m.value2.toString +"["+ getMissionTranslated(submission, resource) +"])"
							}
							
						}
					}
				}
				
				// if reward --done 
				else if (m.reward!==null){
					switch m{
						// --done
						Maximize:{
							if (m.type=="maximize"){
								s += "R{\""+m.measure+"\"}max=?["+ getMissionTranslated(submission, resource) +"]"
							}
							else if (m.type=="minimize"){
								s += ResourceUtils.minimizeReward(m, resource)
								
							}
						}
						// --done
						AtMost:{
							var sign =""
							if (m.type=="at most"){
								sign = "<="
							}
							else if (m.type=="less than"){
								sign = "<"
							}
							else if (m.type=="at least"){
								sign = ">="
							}
							else if (m.type=="greater than"){
								sign = ">"
							}
							
							if (m.type=="exactly"){
								s += "("+ ResourceUtils.rewardSign(s, ">=", m.measure, m.value, submission, resource) +")"
								s += " & "
								s += "("+ ResourceUtils.rewardSign(s, "<=", m.measure, m.value, submission, resource) +")"
							}
							else{
								s+=	ResourceUtils.rewardSign(s, sign, m.measure, m.value, submission, resource)
							}
							
						}
						// --done
						Within:{
							if (m.type=="within"){
								s += "("+ ResourceUtils.rewardSign(s, ">=", m.measure, m.value1, submission, resource) +")"
								s += " & "
								s += "("+ ResourceUtils.rewardSign(s, "<=", m.measure, m.value2, submission, resource) +")"
							}
							else if (m.type=="strictly within"){
								s += "("+ ResourceUtils.rewardSign(s, ">", m.measure, m.value1, submission, resource) +")"
								s += " & "
								s += "("+ ResourceUtils.rewardSign(s, "<", m.measure, m.value2, submission, resource) +")"
							}
						}
					}	
				}
			}
			
			//====================
			//-- *Composite Patterns
			CompositePatterns:{
				var m = miss
				// -- done
				switch m{
					Conservation:{
						s+= ResourceUtils.minimizeReward(m, resource)
					}
					Preservation:{
						
						s += ResourceUtils.rewardBetween_v1v2(m, resource)
					}
					Pause:{
						var submission = m.missions
						var m2 = m.value + 1 // next time step
						
						s += "(G [0,"+m.value.toString+"]_space_"
						s += "!("
						s += getMissionTranslated(submission, resource)
						s += ") ) & ( "
						s += "F["+ m2.toString +","+ m2.toString +"]"
						s += getMissionTranslated(submission, resource) + ")"
					}
					Timeout:{
						var submission = m.missions
						s+= "G>=" + m.value.toString
						s+= " _space_! ("+ getMissionTranslated(submission, resource)+")"
					}
					Repeat:{
						var submission = m.missions
						var m0 = m.value - 1 // last time step
						
						s+= "("
						s += getMissionTranslated(submission,resource)
						s+= ") & ("
						s+= "G("
						s+= "(" + getMissionTranslated(submission,resource)+")"
						s+= "=>(G[1,"+ m0.toString +"] (!(" +
							getMissionTranslated(submission,resource)
							+")) & (F["+m.value + "," + m.value+ "] ("
							+ getMissionTranslated(submission,resource)
							+") ) )"
						s+="))"
					}
					End:{
						var submission = m.missions
						s+= "(G>" + m.value.toString + "_space_"
						s+= "("+getMissionTranslated(submission,resource)+"))"
						s+= " & (G>="+ m.value.toString + "_space_!("+ getMissionTranslated(submission,resource) +")"
						s+= ")"
					}
					
					Proportional:{
						s+= "Proportional: _space_No _space_translation _space_available."
					}
					Execute:{
						m.robots
						m.setOfActions
						for (a: m.setOfActions){
							s+= "(F \""+m.robots.name + a.name + "\") & "
						}
						s = s.substring(0, s.length() - 3);
						//s= "NA (NOT AVAILABLE)"
					}
					Accrue:{
						var submission = m.missions
						m.robots
						m.measure
						s += "Rmax=?["+ getMissionTranslated(submission, resource) +"]"
					}
					ReliabilityConfidence:{
						var submission = m.missions
						if (m.type1=='with reliability'){
							if(m.type2=='greater than'){
								s+=	ResourceUtils.rewardSign(s, '>', m.measure, m.value, submission, resource)
							}
							else if(m.type2=='less than'){
								s+=	ResourceUtils.rewardSign(s, '<', m.measure, m.value, submission, resource)
							} 
						}
						else if (m.type1=='with confidence'){
							if(m.type2=='greater than'){
								s+="With _space_ confidence: _space_No _space_translation _space_available."// for L
							}
							else if(m.type2=='less than'){
								s+="With _space_confidence: _space_No _space_translation _space_available."// for L
							}
						}
						
					}
					Equidistance:{
						s+= "Equidistance: _space_Translation _space_not _space_available."
					}
					Trail:{
						s+= "Trail: _space_Translation _space_not _space_available"
					}
				}
			}
		}
		return s // return string
	}
	
	
}