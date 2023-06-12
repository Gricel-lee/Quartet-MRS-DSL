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

class Patterns {
	/**Specification pattern translation. Follows the form "rob shall pat" */
	def static String getPat(SpecificationPatterns sp, String rob, Resource resource){
		var s = ""
		
		switch sp{ //simple pattern
			Visit1:{
				// visit - done & PRISM tested (as LTL inside P)
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
				// visit in sequence - done & PRISM tested (as LTL inside P)
				else if(sp.type=="in sequence"){
					var sFin = ""
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
				}
				
				// visit in order  - done & PRISM tested (as LTL inside P)
				else if(sp.type=="in order"){
					var sFin = ""
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
					
					var s2 = "";
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get(i+1).name +"\"" 
						s2 += "( !" + loc2 + " U " + loc1 + ") &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
				}
				
				// visit in strict order  - done & PRISM tested (as LTL inside P)
				else if(sp.type=="in strict order"){
					var sFin = ""
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
					
					var s2 = "";
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get(i+1).name +"\"" 
						s2 += "( !" + loc2 + " U " + loc1 + ") &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
					s2 = "";
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get(i+1).name +"\"" 
						s2 += "( !" + loc1 + " U ( (" + loc1 + ") & (X !"+loc1+" U "+loc2+") ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
				}
				
				// visit fairly - done & PRISM tested (as LTL inside P)
				else if(sp.type=="fairly"){
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +") & "
					}
					s = s.substring(0, s.length() - 2);
					
					var s2 = "";
					var n = sp.locations.length
					for (var i=0; i<sp.locations.length; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get( (i+1)%n ).name +"\"" 
						s2 += "( G(" + loc1 + "=>(X(!" + loc1 + " W " + loc2 + ")) ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
				}
				
				
			}
			Patrol:{
				// patrol - done & PRISM tested (as LTL inside P)
				if (sp.type===null){
					if (sp.locations.length==1){
						var l = sp.locations.get(0)
						s += "G_space_F (\"" + rob + l.name +"\")"
					}
					else{
						for (l:sp.locations){
							s += "(G_space_F (\"" + rob + l.name +"\") ) & "
						}
					s = s.substring(0, s.length() - 3);
					}
				}
				
				// patrol in sequence - done & PRISM tested (as LTL inside P)
				else if(sp.type=="in sequence"){
					var sFin = ""
					s += "G"
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
				}
				
				// patrol in order- done & PRISM tested (as LTL inside P)
				else if(sp.type=="in order"){
					var sFin = ""
					s += "G"
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
					
					var s2 = "";
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get(i+1).name +"\"" 
						s2 += "( !" + loc2 + " U " + loc1 + ") &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
					s2 = "";
					var n = sp.locations.length
					for (var i=0; i<sp.locations.length; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get( (i+1)%n ).name +"\"" 
						s2 += "( G(" + loc2 + "=>(X(!" + loc2 + " U " + loc1 + ")) ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
				}
					
					
				
				// patrol in strict order - done & PRISM tested (as LTL inside P)
				else if(sp.type=="in strict order"){
					var sFin = ""
					s += "G"
					for (l:sp.locations){
						var robToloc= "\"" + rob + l.name +"\"" 
						s += "(F "+ robToloc +" & "
						sFin += ")"
					}
					s = s.substring(0, s.length() - 2);
					s +=sFin
					
					var s2 = "";
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get(i+1).name +"\"" 
						s2 += "( !" + loc2 + " U " + loc1 + ") &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
					s2 = "";
					var n = sp.locations.length
					for (var i=0; i<sp.locations.length; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get( (i+1)%n ).name +"\"" 
						s2 += "( G(" + loc2 + "=>(X(!" + loc2 + " U " + loc1 + ")) ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
					s2 = "";
					n = sp.locations.length
					for (var i=0; i<sp.locations.length-1; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get( (i+1)%n ).name +"\"" 
						s2 += "( G(" + loc1 + "=>(X(!" + loc1 + " U " + loc2 + ")) ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
				}
				
				// patrol fairly - done & PRISM tested (as LTL inside P)
				else if(sp.type=="fairly"){
					for (l:sp.locations){
							s += "(G_space_F (\"" + rob + l.name +"\") ) & "
						}
					s = s.substring(0, s.length() - 3);
					
					var s2 = "";
					var n = sp.locations.length
					for (var i=0; i<sp.locations.length; i++){
						var loc1 = "\"" + rob + sp.locations.get(i).name +"\"" 
						var loc2 = "\"" + rob + sp.locations.get( (i+1)%n ).name +"\"" 
						s2 += "( G(" + loc1 + "=>(X(!" + loc1 + " W " + loc2 + ")) ) ) &"
					}
					s += " & "+ s2.substring(0, s2.length() - 2)
					
				}
			}
			AvoidanceVisit:{
				switch sp{
					Visit2:{
						//in QUARTET - more than - done & PRISM tested (as LTL inside P)
						//in PSALM - lower rest avoidance 
						if (sp.type=="more than"){  
							s="("
							var sFin=""
							var num = sp.number
							var loc1 = "\"" + rob + sp.locations.get(0).name +"\"" 
							
							for (var i=0; i<num; i++){
								s += "F "+ loc1 +" & (X_space_"
								sFin += ")"
							}
							s += "F" + loc1 + sFin + ")"
						}
						
						
						//in QUARTET - less than - done & PRISM tested (as LTL inside P)
						//in PSALM - upper rest avoidance 
						else if(sp.type=="less than"){
							s="!("
							var sFin=""
							var num = sp.number
							var loc1 = "\"" + rob + sp.locations.get(0).name +"\"" 
							
							for (var i=0; i<num; i++){
								s += "F "+ loc1 +" & (X_space_"
								sFin += ")"
							}
							s += "F" + loc1 + sFin + ")"
						}
						
						
						//in QUARTET - less than
						//in PSALM - exact rest avoidance 
						else if(sp.type=="exactly"){
							s= "visit _space_ exactly:_space_No _space_ translation _space_ provided."
						}
						
					}
					Avoid:{
						// avoid -- (global avoidance in paper)  done & PRISM tested
						if (sp.type===null){
							s=""
							if (sp.locations.length==1){
								s += "G !\"" + rob + sp.locations.get(0).name +"\""						
							}
							else{
								for (l:sp.locations){
									s += "(G !\"" + rob + l.name +"\") & "
								}
								s = s.substring(0, s.length() - 2);
							}
							
						}
						
						// avoid until - (past avoidance)  done & PRISM tested
						else if(sp.type=="until"){
							var sStart = "("
							var sFin =")"
							for (l:sp.locations){
								s += "(!\"" + rob + l.name +"\") & "
							}	
							var cond = sp.condition.name
							if (sp.locations.length==1){
								sStart = ""
								sFin= ""
							}
							s = sStart + s.substring(0, s.length() - 2) +  sFin + " U (\"" + cond + "\")" // add label of "condition" -- if needed
						}
						
						
						// avoid - (future avoidance) done & PRISM tested
						else if(sp.type=="after"){							
							var sFin = ""
							var sStart =""
							sStart="G (\""+ sp.condition.name + "\" => "
							if (sp.locations.length==1){
								s += "(G_space_!\""+ rob + sp.locations.get(0).name +"\")  "
							}
							else{
								s+="("
								for (l:sp.locations){
									s += "(G_space_!\""+ rob + l.name +"\") & "
								}
								sFin+=")"
							}
							sFin+=")"
							s = sStart + s.substring(0, s.length() - 2)  + sFin 
							
						}
					}
				}
			}
			
			React:{
				// react instantly - (inst. reaction) -- done & PRISM tested
				if (sp.type=="instantly"){
					
					// exec action -- done
					if (sp.action!==null){
						s+= "G (\""+ sp.condition.name +"\" => \"" + sp.action.name +"\")"
					}
					// pattern -- done
					else if (sp.pattern!==null){
						s+= "G(\""+ sp.condition.name +"\" => ("  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+="))"
					}
					// reach loc -- done   * must be a single location 
					else if (sp.locations!==null){
						s+= "G (\""+ sp.condition.name +"\" => \"" + rob + sp.locations.head.name +"\")"
					}
				}
				
				//react with a delay - (delayed reaction) -- done & PRISM tested
				else if(sp.type=="with a delay"){
					
					// exec action -- done
					if (sp.action!==null){
						s = "G(\""+ sp.condition.name +"\" => (F\"" + sp.action.name +"\") )"
					}
					// pattern -- done
					else if (sp.pattern!==null){
						s = "G(\""+ sp.condition.name +"\" => ("  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+=") )"
					}
					// reach loc * must be a single location -- done
					// ---***Note: it may return unwanted formulae, e.g. = m19: G("c1" => F(F ("r10l2") ) )
					// so it may be appropriate to delete this pattern as the "promptly" (i.e., F) is already handled within the sub-pattern
					else if (sp.locations!==null){
						s = "G(\""+ sp.condition.name +"\" => (F\"" + rob + sp.locations.head.name +"\") )"
					}
				}
				
				//react promptly - (promt reaction) -- done
				else if(sp.type=="promptly"){
					
					// exec act -- done
					if (sp.action!==null){
						s = "G(\""+ sp.condition.name +"\" => (X\"" + sp.action.name +"\") )"
					}
					// pat -- done
					else if (sp.pattern!==null){
						s = "G(\""+ sp.condition.name +"\" => (X("  
						s+= getPat(sp.pattern, rob, resource) // get pattern
						s+="\")_space_) )"
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
					s = "G(\""+ sp.condition.name +"\" <=> \"" + sp.locations.name +"\")"
				}
				
				//counteract with a delay
				else if(sp.type=="with a delay"){
					s = "G(\""+ sp.condition.name +"\" <=> (X\"" + sp.locations.name +"\"))"
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