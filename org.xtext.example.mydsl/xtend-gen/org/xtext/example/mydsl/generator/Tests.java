package org.xtext.example.mydsl.generator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Work in progress: testing regex for identifying not PRISM formulae
 */
@SuppressWarnings("all")
public class Tests {
  public static String test_regex() {
    String _xblockexpression = null;
    {
      Pattern p = Pattern.compile("a*b");
      Matcher m = p.matcher("aaaaab");
      boolean b1 = m.matches();
      String str = "";
      String patt = "";
      boolean b = false;
      patt = "\\w*";
      str = "aaaaab";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("1pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "a*b";
      str = "aaaaab";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("2pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "\\d";
      str = "aaaaab";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("3pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "\\d";
      str = "aaaaab1";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("31pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "G>|<=?\\d";
      str = "(G<=1)";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("411pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "G(<|>)=?\\d";
      str = "(G<1)";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("422pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "G(<|>)=?\\d";
      str = "(G>=1)";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("433pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "G>=\\d";
      str = "G>=1";
      b = Pattern.matches(patt, str);
      InputOutput.<String>println((((((("4pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
      patt = "G>=\\d";
      str = "G>=1 F[m]";
      b = Pattern.matches(patt, str);
      _xblockexpression = InputOutput.<String>println((((((("4pattern: " + patt) + " str: ") + str) + " ") + " = ") + Boolean.valueOf(b)));
    }
    return _xblockexpression;
  }
}
