package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.xtext.example.mydsl.myDsl.SpecificationPatterns
import org.xtext.example.mydsl.myDsl.Visit1
import org.xtext.example.mydsl.myDsl.Patrol
import org.xtext.example.mydsl.myDsl.AvoidanceVisit
import org.xtext.example.mydsl.myDsl.Avoid
import org.xtext.example.mydsl.myDsl.React
import org.xtext.example.mydsl.myDsl.Counteract
import org.xtext.example.mydsl.myDsl.Wait
import org.xtext.example.mydsl.myDsl.Visit2

class ResourcePattern {
	def static String getPat(SpecificationPatterns sp, String rob, Resource resource){
		var s = ""
		
		switch sp{
			Visit1:{	
				// visit - done
				if (sp.type===null){
					
					if (sp.locations.length==1){
						s += "F \"" + rob + sp.locations.get(0).name +"\""						
					}
					else{
						for (l:sp.locations){
							s += "(F \"" + rob + l.name +"\") & "
						}
						s = s.substring(0, s.length() - 3);
					}
					
				}
				// visit in sequence - done & PRISM tested
				else if(sp.type=="in sequence"){
					var sFin = ""
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "F ("+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
				}
				
				// visit in order - not ok yet
				else if(sp.type=="in order"){
					var sFin = ""
					for (var i=0; i<sp.locations.length; i++){
						var l = sp.locations.get(i)
						var robToloc= "\"" + rob + l.name +"\"" 
						if (i!==sp.locations.length-1){
							s += "F( ("+ robToloc +") & ("
							sFin += "))"
							//println(s + sFin)
						}
						else if (i===sp.locations.length-1){
							s +="F("+ robToloc +")"
							sFin += ")"
							//println("done: " + s + sFin)
						}
					}
					//s = s.substring(0, s.length());
					s +=sFin
					s= "( " + s + " )" 
					//println("S:" + s)
					for (var i =1 ; i < sp.locations.length ; i++){
						s= s + "& ((!(" +"\"" + rob + sp.locations.get(i).name + "\")) U ("+ "\"" + rob + sp.locations.get(i-1).name + "\"))"
					}
					//println("S:" + s)
					
					s= "Visit in order: NOT WORKING YET"
					
				}
				
				// visit in strict order - done
				else if(sp.type=="in strict order"){
					var sFin = ""
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "F ("+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
					for (var i =1 ; i < sp.locations.length ; i++){
						
						s+= " & ( (!(" +"\"" + rob + sp.locations.get(i).name + "\")) U ("+ "\"" + rob + sp.locations.get(i-1).name + "\"))"
					}	
					for (var i =1 ; i < sp.locations.length ; i++){
						
						var loc1 = sp.locations.get(i-1).name
						var loc2 = sp.locations.get(i).name
						
						s+= " & ("
						s+= " (!(" +"\"" + rob + loc1 + "\")) U" 
						s+= "( "
						s+="( \"" + rob + loc1 + "\") & (X(!(\""+ rob + loc2 + "\")"
						s+= " U ("+ "\"" + rob + loc1 + "\" "+ ")"
						s+= " ) )"
						s+= ")"
					}	
				}
				
				// visit fairly - NOT done
				else if(sp.type=="fairly"){
					var s2 = ""
					var count = 0
					for (l:sp.locations){
						count+=1
						var l2 = "\"" + rob + sp.locations.get((count+1)%sp.locations.length).name + "\""
						var l1 = "\"" + rob + l.name + "\"" 
						s += "F (\"" + rob + l1 +"\") & "
						// LTL weak definition:
						s2 += "(A[G("+l1+"=>(X !"+l1+" U "+l2+") | (A[G "+l1+"]) )]) & "
					}
					
					s += s + s2.substring(0, s2.length() - 3)
					
					s= "Visit fairly: NOT WORKING YET"
					
				}
				
				
			}
			Patrol:{
				// patrol - done & PRISM checked
				if (sp.type===null){
					if (sp.locations.length==1){
						var l = sp.locations.get(0)
						s += "G F (\"" + rob + l.name +"\")"
					}
					else{
						for (l:sp.locations){
							s += "(G F (\"" + rob + l.name +"\") ) & "
						}
					s = s.substring(0, s.length() - 3);
					}
				}
				
				// patrol in sequence - Not PRISM done
				else if(sp.type=="in sequence"){
					var sFin = ""
					s+="F[ ("
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "G ("+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 3);
					s = s + sFin + ") ]"
					s= "Patrol sequence: NOT CHECKED YET"
					
				}
				//***NOT DONE
				// patrol in order - done
				else if(sp.type=="in order"){
					var sFin = ""
					s+="F[ ("
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "G (\""+ robToloc +"\" & "
						sFin += ") ]"
					}
					s = s.substring(0, s.length() - 3);
					s = s + sFin + ")"
					
					for (var i =1 ; i < sp.locations.length ; i++){
						
						s+= " & (!(" +"\"" + rob + sp.locations.get(i).name + "\") U ("+ "\"" + rob + sp.locations.get(i-1).name + "\"))"
					}
					
					
					for (var i =1 ; i < sp.locations.length ; i++){
						var l1 = "\"" + rob + sp.locations.get(i).name + "\"" 
						var l2 = "\"" + rob + sp.locations.get((i+1)%sp.locations.length).name + "\""
						println((i+1)%sp.locations.length)
						println("i: "+i)
						s+= " & ( F[G(\""+ rob+l2 +"\" => (X!\""+ rob + l2+"\" U \""+ rob + l1 +"\") )] )"
					}
					s= "Patrol in order: NOT CHECKED YET"
				}
				//***NOT DONE
				// patrol in strict order - done
				else if(sp.type=="in strict order"){
					var sFin = ""
					s+="G("
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "F ("+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s = s + sFin + ")"
					
					for (var i =1 ; i < sp.locations.length ; i++){
						
						s+= " & ((!(" +"\"" + rob + sp.locations.get(i).name + "\")) U ("+ "\"" + rob + sp.locations.get(i-1).name + "\"))"
					}
					
					for (var i =1 ; i < sp.locations.length ; i++){
						
						s+= " & G(ASK WHAT is % and =>)"
					}	
					for (var i =1 ; i < sp.locations.length ; i++){
						
						s+= " & G(ASK WHAT is % and =>)"
					}
					s= "Patrol in strict order: NOT DONE YET"
				}
				//***NOT DONE
				// patrol fairly - NOT done
				else if(sp.type=="fairly"){
					for (l:sp.locations){
						s += "GF (\"" + rob + l.name +"\") & "
					}
					s = s.substring(0, s.length() - 2);
					//s+= "do WEAK on prism"
					s= "Patrol fairly: NOT DONE YET"
				}
			}
			AvoidanceVisit:{
				switch sp{
					Visit2:{
						if (sp.type=="visit more than"){
							var num = sp.number
							s= "visit more than: NOT DONE YET"
						}
						else if(sp.type=="visit less than"){
							s= "visit less than: NOT DONE YET"
						}
						else if(sp.type=="visit exactly"){
							s= "visit exactly: NOT DONE YET"
						}
						
					}
					Avoid:{
						// avoid -- done (global avoidance in paper)
						if (sp.type===null){
							s+="G("
							for (l:sp.locations){
								s += "!\"" + rob + l.name +"\") & "
							}
							s = s.substring(0, s.length() - 2);
						}
						
						// avoid until - (past avoidance)  done & PRISM tested
						else if(sp.type=="until"){
							var sFin =")"
							var sStart = "("
							for (l:sp.locations){
								s += "(!\"" + rob + l.name +"\") & "
							}	
							var cond = sp.condition.name
							s = sStart + s.substring(0, s.length() - 2) +  sFin + " U (\"" + cond + "\")" // add label of "condition" -- if needed
						}
						
						
						// avoid - (future avoidance)
						else if(sp.type=="after"){							
							var sFin = ""
							var sStart =""
							sStart="A[G( (\""+ sp.condition.name + "\") => "
							for (l:sp.locations){
								s += "(G(!\""+ rob + l.name +"\") & "
								sFin += ")"
							}
							s = sStart + s.substring(0, s.length() - 2)  + sFin +" )]"
							}
					}
				}
			}
			
			React:{
				// react instantly - (inst. reaction) -- done
				if (sp.type=="instantly"){
					
					// exec action -- done
					if (sp.action!==null){
						s+= "A[G \""+ sp.condition.name +"\" => \"" + sp.action.name +"\"]"
					}
					// pattern -- done
					else if (sp.pattern!==null){
						s+= "A[G\""+ sp.condition.name +"\" => ("  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+=")]"
					}
					// reach loc -- done   * must be a single location 
					else if (sp.locations!==null){
						s+= "A[G \""+ sp.condition.name +"\" => \"" + rob + sp.locations.head.name +"\"]"
					}
				}
				
				//react with a delay - (delayed reaction) -- done
				else if(sp.type=="with a delay"){
					
					// exec action -- done
					if (sp.action!==null){
						s = "A[G\""+ sp.condition.name +"\" => F(\"" + sp.action.name +"\") ]"
					}
					// pattern -- done
					else if (sp.pattern!==null){
						s = "A[G\""+ sp.condition.name +"\" => ("  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+=") ]"
					}
					// reach loc * must be a single location -- done
					// ---***Note: it may return unwanted formulae, e.g. = m19: G("c1" => F(F ("r10l2") ) )
					// so it may be appropriate to delete this pattern as the "promptly" (i.e., F) is already handled within the sub-pattern
					else if (sp.locations!==null){
						s = "A[G\""+ sp.condition.name +"\" => F(\"" + rob + sp.locations.head.name +"\") ]"
					}
				}
				
				//react promptly - (promt reaction) -- done
				else if(sp.type=="promptly"){
					
					// exec act -- done
					if (sp.action!==null){
						s = "G(\""+ sp.condition.name +"\" => (X\"" + sp.action.name +") )"
					}
					// pat -- done
					else if (sp.pattern!==null){
						s = "G(\""+ sp.condition.name +"\" => (X"  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+="\") )"
					}
					// reach loc -- done 
					// ---***Note: it may return unwanted formulae, e.g. = m19: G("c1" => F(F ("r10l2") ) )
					// so it may be appropriate to delete this pattern as the "promptly" (i.e., F) is already handled withing the subpattern
					else if (sp.locations!==null){ 
						var loc = sp.locations.head.name //must be a single location
						s = "G(\""+ sp.condition.name +"\" => (X\"" + rob + loc +"\") )"
					}
				}
			}
			
			Counteract:{
				// counteract instantly
				if (sp.type=="instantly"){
					s = "A[G\""+ sp.condition.name +"\" <=> (X\"" + sp.locations.name +"\")]"
				}
				
				//counteract with a delay
				else if(sp.type=="with a delay"){
					s = "A[G\""+ sp.condition.name +"\" <=> \"" + sp.locations.name +"\"]"
				}
				
			}
			Wait:{
				var loc = sp.locations.head.name //must be a single location
				s = "(\""+ rob + loc +"\") U (\""+ sp.condition.name +"\")"
				
			}
		}
		
		s
	}
	
	
	
}