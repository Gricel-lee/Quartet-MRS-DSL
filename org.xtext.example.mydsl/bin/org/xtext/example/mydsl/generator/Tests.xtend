package org.xtext.example.mydsl.generator

import java.util.regex.Pattern
import java.util.regex.Matcher


/** Work in progress: testing regex for identifying not PRISM formulae */
class Tests{
	
	def static test_regex(){
		
		//
		// (( (F<1) | (F>2) ) & ())
		
		//[P] //matches P
		
		//G[1,29]
		//G>=3
		//G[0,2]
		//F[3,3]
		//G[0,2]
		// =>
		
		//[G\[]
		
		var Pattern p = Pattern.compile("a*b");
		var Matcher m = p.matcher("aaaaab");
		var boolean b1 = m.matches();
		
		var str = ""
		var patt = ""
		var boolean b 
		
		patt = "\\w*"
		str= "aaaaab"
		b = Pattern.matches(patt, str);
		println("1pattern: " + patt + " str: " + str + " " + " = " + b)
		
		
		patt = "a*b"
		str= "aaaaab"
		b = Pattern.matches(patt, str);
		println("2pattern: " + patt + " str: " + str + " " + " = " + b)
		
		patt = "\\d"
		str= "aaaaab"
		b = Pattern.matches(patt, str);
		println("3pattern: " + patt + " str: " + str + " " + " = " + b)
		
		patt = "\\d"
		str= "aaaaab1"
		b = Pattern.matches(patt, str);
		println("31pattern: " + patt + " str: " + str + " " + " = " + b)
		
		
		patt = "G>|<=?\\d"
		str= "(G<=1)"
		b = Pattern.matches(patt, str);
		println("411pattern: " + patt + " str: " + str + " " + " = " + b)
		
		patt = "G(<|>)=?\\d"
		str= "(G<1)"
		b = Pattern.matches(patt, str);
		println("422pattern: " + patt + " str: " + str + " " + " = " + b)
		
		patt = "G(<|>)=?\\d"
		str= "(G>=1)"
		b = Pattern.matches(patt, str);
		println("433pattern: " + patt + " str: " + str + " " + " = " + b)
		
		
		patt = "G>=\\d"
		str= "G>=1"
		b = Pattern.matches(patt, str);
		println("4pattern: " + patt + " str: " + str + " " + " = " + b)
		
		patt = "G>=\\d"
		str= "G>=1 F[m]"
		b = Pattern.matches(patt, str);
		println("4pattern: " + patt + " str: " + str + " " + " = " + b)
		
		
		
				
		/**REGEX not working on xtend
		var s2 = "1(R)"
		var rege = "\\("
		checked_s += s2
		if (s2.matches(rege)){
			checked_s += " here: " + rege
		}
		**/
	}
}
