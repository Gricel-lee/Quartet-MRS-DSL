package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.Avoid;
import org.xtext.example.mydsl.myDsl.AvoidanceVisit;
import org.xtext.example.mydsl.myDsl.Counteract;
import org.xtext.example.mydsl.myDsl.Location;
import org.xtext.example.mydsl.myDsl.Patrol;
import org.xtext.example.mydsl.myDsl.React;
import org.xtext.example.mydsl.myDsl.SpecificationPatterns;
import org.xtext.example.mydsl.myDsl.Visit1;
import org.xtext.example.mydsl.myDsl.Visit2;
import org.xtext.example.mydsl.myDsl.Wait;

@SuppressWarnings("all")
public class Patterns {
  /**
   * Specification pattern translation. Follows the form "rob shall pat"
   */
  public static String getPat(final SpecificationPatterns sp, final String rob, final Resource resource) {
    String _xblockexpression = null;
    {
      String s = "";
      boolean _matched = false;
      if (sp instanceof Visit1) {
        _matched=true;
        String _type = ((Visit1)sp).getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          int _length = ((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length;
          boolean _equals = (_length == 1);
          if (_equals) {
            String _s = s;
            String _name = ((Visit1)sp).getLocations().get(0).getName();
            String _plus = (("F \"" + rob) + _name);
            String _plus_1 = (_plus + "\"");
            s = (_s + _plus_1);
          } else {
            EList<Location> _locations = ((Visit1)sp).getLocations();
            for (final Location l : _locations) {
              String _s_1 = s;
              String _name_1 = l.getName();
              String _plus_2 = (("(F \"" + rob) + _name_1);
              String _plus_3 = (_plus_2 + "\") & ");
              s = (_s_1 + _plus_3);
            }
            int _length_1 = s.length();
            int _minus = (_length_1 - 3);
            s = s.substring(0, _minus);
          }
        } else {
          String _type_1 = ((Visit1)sp).getType();
          boolean _equals_1 = Objects.equal(_type_1, "in sequence");
          if (_equals_1) {
            String sFin = "";
            EList<Location> _locations_1 = ((Visit1)sp).getLocations();
            for (final Location l_1 : _locations_1) {
              {
                String _name_2 = l_1.getName();
                String _plus_4 = (("\"" + rob) + _name_2);
                String robToloc = (_plus_4 + "\"");
                String _s_2 = s;
                s = (_s_2 + (("(F " + robToloc) + " & "));
                String _sFin = sFin;
                sFin = (_sFin + ")");
              }
            }
            int _length_2 = s.length();
            int _minus_1 = (_length_2 - 2);
            s = s.substring(0, _minus_1);
            String _s_2 = s;
            s = (_s_2 + sFin);
          } else {
            String _type_2 = ((Visit1)sp).getType();
            boolean _equals_2 = Objects.equal(_type_2, "in order");
            if (_equals_2) {
              String sFin_1 = "";
              EList<Location> _locations_2 = ((Visit1)sp).getLocations();
              for (final Location l_2 : _locations_2) {
                {
                  String _name_2 = l_2.getName();
                  String _plus_4 = (("\"" + rob) + _name_2);
                  String robToloc = (_plus_4 + "\"");
                  String _s_3 = s;
                  s = (_s_3 + (("(F " + robToloc) + " & "));
                  String _sFin = sFin_1;
                  sFin_1 = (_sFin + ")");
                }
              }
              int _length_3 = s.length();
              int _minus_2 = (_length_3 - 2);
              s = s.substring(0, _minus_2);
              String _s_3 = s;
              s = (_s_3 + sFin_1);
              String s2 = "";
              for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length - 1)); i++) {
                {
                  String _name_2 = ((Visit1)sp).getLocations().get(i).getName();
                  String _plus_4 = (("\"" + rob) + _name_2);
                  String loc1 = (_plus_4 + "\"");
                  String _name_3 = ((Visit1)sp).getLocations().get((i + 1)).getName();
                  String _plus_5 = (("\"" + rob) + _name_3);
                  String loc2 = (_plus_5 + "\"");
                  String _s2 = s2;
                  s2 = (_s2 + (((("( !" + loc2) + " U ") + loc1) + ") &"));
                }
              }
              String _s_4 = s;
              int _length_4 = s2.length();
              int _minus_3 = (_length_4 - 2);
              String _substring = s2.substring(0, _minus_3);
              String _plus_4 = (" & " + _substring);
              s = (_s_4 + _plus_4);
            } else {
              String _type_3 = ((Visit1)sp).getType();
              boolean _equals_3 = Objects.equal(_type_3, "in strict order");
              if (_equals_3) {
                String sFin_2 = "";
                EList<Location> _locations_3 = ((Visit1)sp).getLocations();
                for (final Location l_3 : _locations_3) {
                  {
                    String _name_2 = l_3.getName();
                    String _plus_5 = (("\"" + rob) + _name_2);
                    String robToloc = (_plus_5 + "\"");
                    String _s_5 = s;
                    s = (_s_5 + (("(F " + robToloc) + " & "));
                    String _sFin = sFin_2;
                    sFin_2 = (_sFin + ")");
                  }
                }
                int _length_5 = s.length();
                int _minus_4 = (_length_5 - 2);
                s = s.substring(0, _minus_4);
                String _s_5 = s;
                s = (_s_5 + sFin_2);
                String s2_1 = "";
                for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length - 1)); i++) {
                  {
                    String _name_2 = ((Visit1)sp).getLocations().get(i).getName();
                    String _plus_5 = (("\"" + rob) + _name_2);
                    String loc1 = (_plus_5 + "\"");
                    String _name_3 = ((Visit1)sp).getLocations().get((i + 1)).getName();
                    String _plus_6 = (("\"" + rob) + _name_3);
                    String loc2 = (_plus_6 + "\"");
                    String _s2 = s2_1;
                    s2_1 = (_s2 + (((("( !" + loc2) + " U ") + loc1) + ") &"));
                  }
                }
                String _s_6 = s;
                int _length_6 = s2_1.length();
                int _minus_5 = (_length_6 - 2);
                String _substring_1 = s2_1.substring(0, _minus_5);
                String _plus_5 = (" & " + _substring_1);
                s = (_s_6 + _plus_5);
                s2_1 = "";
                for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length - 1)); i++) {
                  {
                    String _name_2 = ((Visit1)sp).getLocations().get(i).getName();
                    String _plus_6 = (("\"" + rob) + _name_2);
                    String loc1 = (_plus_6 + "\"");
                    String _name_3 = ((Visit1)sp).getLocations().get((i + 1)).getName();
                    String _plus_7 = (("\"" + rob) + _name_3);
                    String loc2 = (_plus_7 + "\"");
                    String _s2 = s2_1;
                    s2_1 = (_s2 + (((((((("( !" + loc1) + " U ( (") + loc1) + ") & (X !") + loc1) + " U ") + loc2) + ") ) ) &"));
                  }
                }
                String _s_7 = s;
                int _length_7 = s2_1.length();
                int _minus_6 = (_length_7 - 2);
                String _substring_2 = s2_1.substring(0, _minus_6);
                String _plus_6 = (" & " + _substring_2);
                s = (_s_7 + _plus_6);
              } else {
                String _type_4 = ((Visit1)sp).getType();
                boolean _equals_4 = Objects.equal(_type_4, "fairly");
                if (_equals_4) {
                  EList<Location> _locations_4 = ((Visit1)sp).getLocations();
                  for (final Location l_4 : _locations_4) {
                    {
                      String _name_2 = l_4.getName();
                      String _plus_7 = (("\"" + rob) + _name_2);
                      String robToloc = (_plus_7 + "\"");
                      String _s_8 = s;
                      s = (_s_8 + (("(F " + robToloc) + ") & "));
                    }
                  }
                  int _length_8 = s.length();
                  int _minus_7 = (_length_8 - 2);
                  s = s.substring(0, _minus_7);
                  String s2_2 = "";
                  int n = ((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length;
                  for (int i = 0; (i < ((Object[])Conversions.unwrapArray(((Visit1)sp).getLocations(), Object.class)).length); i++) {
                    {
                      String _name_2 = ((Visit1)sp).getLocations().get(i).getName();
                      String _plus_7 = (("\"" + rob) + _name_2);
                      String loc1 = (_plus_7 + "\"");
                      String _name_3 = ((Visit1)sp).getLocations().get(((i + 1) % n)).getName();
                      String _plus_8 = (("\"" + rob) + _name_3);
                      String loc2 = (_plus_8 + "\"");
                      String _s2 = s2_2;
                      s2_2 = (_s2 + (((((("( G(" + loc1) + "=>(X(!") + loc1) + " W ") + loc2) + ")) ) ) &"));
                    }
                  }
                  String _s_8 = s;
                  int _length_9 = s2_2.length();
                  int _minus_8 = (_length_9 - 2);
                  String _substring_3 = s2_2.substring(0, _minus_8);
                  String _plus_7 = (" & " + _substring_3);
                  s = (_s_8 + _plus_7);
                }
              }
            }
          }
        }
      }
      if (!_matched) {
        if (sp instanceof Patrol) {
          _matched=true;
          String _type = ((Patrol)sp).getType();
          boolean _tripleEquals = (_type == null);
          if (_tripleEquals) {
            int _length = ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length;
            boolean _equals = (_length == 1);
            if (_equals) {
              Location l = ((Patrol)sp).getLocations().get(0);
              String _s = s;
              String _name = l.getName();
              String _plus = (("G_space_F (\"" + rob) + _name);
              String _plus_1 = (_plus + "\")");
              s = (_s + _plus_1);
            } else {
              EList<Location> _locations = ((Patrol)sp).getLocations();
              for (final Location l_1 : _locations) {
                String _s_1 = s;
                String _name_1 = l_1.getName();
                String _plus_2 = (("(G_space_F (\"" + rob) + _name_1);
                String _plus_3 = (_plus_2 + "\") ) & ");
                s = (_s_1 + _plus_3);
              }
              int _length_1 = s.length();
              int _minus = (_length_1 - 3);
              s = s.substring(0, _minus);
            }
          } else {
            String _type_1 = ((Patrol)sp).getType();
            boolean _equals_1 = Objects.equal(_type_1, "in sequence");
            if (_equals_1) {
              String sFin = "";
              String _s_2 = s;
              s = (_s_2 + "G");
              EList<Location> _locations_1 = ((Patrol)sp).getLocations();
              for (final Location l_2 : _locations_1) {
                {
                  String _name_2 = l_2.getName();
                  String _plus_4 = (("\"" + rob) + _name_2);
                  String robToloc = (_plus_4 + "\"");
                  String _s_3 = s;
                  s = (_s_3 + (("(F " + robToloc) + " & "));
                  String _sFin = sFin;
                  sFin = (_sFin + ")");
                }
              }
              int _length_2 = s.length();
              int _minus_1 = (_length_2 - 2);
              s = s.substring(0, _minus_1);
              String _s_3 = s;
              s = (_s_3 + sFin);
            } else {
              String _type_2 = ((Patrol)sp).getType();
              boolean _equals_2 = Objects.equal(_type_2, "in order");
              if (_equals_2) {
                String sFin_1 = "";
                String _s_4 = s;
                s = (_s_4 + "G");
                EList<Location> _locations_2 = ((Patrol)sp).getLocations();
                for (final Location l_3 : _locations_2) {
                  {
                    String _name_2 = l_3.getName();
                    String _plus_4 = (("\"" + rob) + _name_2);
                    String robToloc = (_plus_4 + "\"");
                    String _s_5 = s;
                    s = (_s_5 + (("(F " + robToloc) + " & "));
                    String _sFin = sFin_1;
                    sFin_1 = (_sFin + ")");
                  }
                }
                int _length_3 = s.length();
                int _minus_2 = (_length_3 - 2);
                s = s.substring(0, _minus_2);
                String _s_5 = s;
                s = (_s_5 + sFin_1);
                String s2 = "";
                for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length - 1)); i++) {
                  {
                    String _name_2 = ((Patrol)sp).getLocations().get(i).getName();
                    String _plus_4 = (("\"" + rob) + _name_2);
                    String loc1 = (_plus_4 + "\"");
                    String _name_3 = ((Patrol)sp).getLocations().get((i + 1)).getName();
                    String _plus_5 = (("\"" + rob) + _name_3);
                    String loc2 = (_plus_5 + "\"");
                    String _s2 = s2;
                    s2 = (_s2 + (((("( !" + loc2) + " U ") + loc1) + ") &"));
                  }
                }
                String _s_6 = s;
                int _length_4 = s2.length();
                int _minus_3 = (_length_4 - 2);
                String _substring = s2.substring(0, _minus_3);
                String _plus_4 = (" & " + _substring);
                s = (_s_6 + _plus_4);
                s2 = "";
                int n = ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length;
                for (int i = 0; (i < ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length); i++) {
                  {
                    String _name_2 = ((Patrol)sp).getLocations().get(i).getName();
                    String _plus_5 = (("\"" + rob) + _name_2);
                    String loc1 = (_plus_5 + "\"");
                    String _name_3 = ((Patrol)sp).getLocations().get(((i + 1) % n)).getName();
                    String _plus_6 = (("\"" + rob) + _name_3);
                    String loc2 = (_plus_6 + "\"");
                    String _s2 = s2;
                    s2 = (_s2 + (((((("( G(" + loc2) + "=>(X(!") + loc2) + " U ") + loc1) + ")) ) ) &"));
                  }
                }
                String _s_7 = s;
                int _length_5 = s2.length();
                int _minus_4 = (_length_5 - 2);
                String _substring_1 = s2.substring(0, _minus_4);
                String _plus_5 = (" & " + _substring_1);
                s = (_s_7 + _plus_5);
              } else {
                String _type_3 = ((Patrol)sp).getType();
                boolean _equals_3 = Objects.equal(_type_3, "in strict order");
                if (_equals_3) {
                  String sFin_2 = "";
                  String _s_8 = s;
                  s = (_s_8 + "G");
                  EList<Location> _locations_3 = ((Patrol)sp).getLocations();
                  for (final Location l_4 : _locations_3) {
                    {
                      String _name_2 = l_4.getName();
                      String _plus_6 = (("\"" + rob) + _name_2);
                      String robToloc = (_plus_6 + "\"");
                      String _s_9 = s;
                      s = (_s_9 + (("(F " + robToloc) + " & "));
                      String _sFin = sFin_2;
                      sFin_2 = (_sFin + ")");
                    }
                  }
                  int _length_6 = s.length();
                  int _minus_5 = (_length_6 - 2);
                  s = s.substring(0, _minus_5);
                  String _s_9 = s;
                  s = (_s_9 + sFin_2);
                  String s2_1 = "";
                  for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length - 1)); i++) {
                    {
                      String _name_2 = ((Patrol)sp).getLocations().get(i).getName();
                      String _plus_6 = (("\"" + rob) + _name_2);
                      String loc1 = (_plus_6 + "\"");
                      String _name_3 = ((Patrol)sp).getLocations().get((i + 1)).getName();
                      String _plus_7 = (("\"" + rob) + _name_3);
                      String loc2 = (_plus_7 + "\"");
                      String _s2 = s2_1;
                      s2_1 = (_s2 + (((("( !" + loc2) + " U ") + loc1) + ") &"));
                    }
                  }
                  String _s_10 = s;
                  int _length_7 = s2_1.length();
                  int _minus_6 = (_length_7 - 2);
                  String _substring_2 = s2_1.substring(0, _minus_6);
                  String _plus_6 = (" & " + _substring_2);
                  s = (_s_10 + _plus_6);
                  s2_1 = "";
                  int n_1 = ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length;
                  for (int i = 0; (i < ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length); i++) {
                    {
                      String _name_2 = ((Patrol)sp).getLocations().get(i).getName();
                      String _plus_7 = (("\"" + rob) + _name_2);
                      String loc1 = (_plus_7 + "\"");
                      String _name_3 = ((Patrol)sp).getLocations().get(((i + 1) % n_1)).getName();
                      String _plus_8 = (("\"" + rob) + _name_3);
                      String loc2 = (_plus_8 + "\"");
                      String _s2 = s2_1;
                      s2_1 = (_s2 + (((((("( G(" + loc2) + "=>(X(!") + loc2) + " U ") + loc1) + ")) ) ) &"));
                    }
                  }
                  String _s_11 = s;
                  int _length_8 = s2_1.length();
                  int _minus_7 = (_length_8 - 2);
                  String _substring_3 = s2_1.substring(0, _minus_7);
                  String _plus_7 = (" & " + _substring_3);
                  s = (_s_11 + _plus_7);
                  s2_1 = "";
                  n_1 = ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length;
                  for (int i = 0; (i < (((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length - 1)); i++) {
                    {
                      String _name_2 = ((Patrol)sp).getLocations().get(i).getName();
                      String _plus_8 = (("\"" + rob) + _name_2);
                      String loc1 = (_plus_8 + "\"");
                      String _name_3 = ((Patrol)sp).getLocations().get(((i + 1) % n_1)).getName();
                      String _plus_9 = (("\"" + rob) + _name_3);
                      String loc2 = (_plus_9 + "\"");
                      String _s2 = s2_1;
                      s2_1 = (_s2 + (((((("( G(" + loc1) + "=>(X(!") + loc1) + " U ") + loc2) + ")) ) ) &"));
                    }
                  }
                  String _s_12 = s;
                  int _length_9 = s2_1.length();
                  int _minus_8 = (_length_9 - 2);
                  String _substring_4 = s2_1.substring(0, _minus_8);
                  String _plus_8 = (" & " + _substring_4);
                  s = (_s_12 + _plus_8);
                } else {
                  String _type_4 = ((Patrol)sp).getType();
                  boolean _equals_4 = Objects.equal(_type_4, "fairly");
                  if (_equals_4) {
                    EList<Location> _locations_4 = ((Patrol)sp).getLocations();
                    for (final Location l_5 : _locations_4) {
                      String _s_13 = s;
                      String _name_2 = l_5.getName();
                      String _plus_9 = (("(G_space_F (\"" + rob) + _name_2);
                      String _plus_10 = (_plus_9 + "\") ) & ");
                      s = (_s_13 + _plus_10);
                    }
                    int _length_10 = s.length();
                    int _minus_9 = (_length_10 - 3);
                    s = s.substring(0, _minus_9);
                    String s2_2 = "";
                    int n_2 = ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length;
                    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(((Patrol)sp).getLocations(), Object.class)).length); i++) {
                      {
                        String _name_3 = ((Patrol)sp).getLocations().get(i).getName();
                        String _plus_11 = (("\"" + rob) + _name_3);
                        String loc1 = (_plus_11 + "\"");
                        String _name_4 = ((Patrol)sp).getLocations().get(((i + 1) % n_2)).getName();
                        String _plus_12 = (("\"" + rob) + _name_4);
                        String loc2 = (_plus_12 + "\"");
                        String _s2 = s2_2;
                        s2_2 = (_s2 + (((((("( G(" + loc1) + "=>(X(!") + loc1) + " W ") + loc2) + ")) ) ) &"));
                      }
                    }
                    String _s_14 = s;
                    int _length_11 = s2_2.length();
                    int _minus_10 = (_length_11 - 2);
                    String _substring_5 = s2_2.substring(0, _minus_10);
                    String _plus_11 = (" & " + _substring_5);
                    s = (_s_14 + _plus_11);
                  }
                }
              }
            }
          }
        }
      }
      if (!_matched) {
        if (sp instanceof AvoidanceVisit) {
          _matched=true;
          boolean _matched_1 = false;
          if (sp instanceof Visit2) {
            _matched_1=true;
            String _type = ((Visit2)sp).getType();
            boolean _equals = Objects.equal(_type, "more than");
            if (_equals) {
              s = "(";
              String sFin = "";
              int num = ((Visit2)sp).getNumber();
              String _name = ((Visit2)sp).getLocations().get(0).getName();
              String _plus = (("\"" + rob) + _name);
              String loc1 = (_plus + "\"");
              for (int i = 0; (i < num); i++) {
                {
                  String _s = s;
                  s = (_s + (("F " + loc1) + " & (X_space_"));
                  String _sFin = sFin;
                  sFin = (_sFin + ")");
                }
              }
              String _s = s;
              s = (_s + ((("F" + loc1) + sFin) + ")"));
            } else {
              String _type_1 = ((Visit2)sp).getType();
              boolean _equals_1 = Objects.equal(_type_1, "less than");
              if (_equals_1) {
                s = "!(";
                String sFin_1 = "";
                int num_1 = ((Visit2)sp).getNumber();
                String _name_1 = ((Visit2)sp).getLocations().get(0).getName();
                String _plus_1 = (("\"" + rob) + _name_1);
                String loc1_1 = (_plus_1 + "\"");
                for (int i = 0; (i < num_1); i++) {
                  {
                    String _s_1 = s;
                    s = (_s_1 + (("F " + loc1_1) + " & (X_space_"));
                    String _sFin = sFin_1;
                    sFin_1 = (_sFin + ")");
                  }
                }
                String _s_1 = s;
                s = (_s_1 + ((("F" + loc1_1) + sFin_1) + ")"));
              } else {
                String _type_2 = ((Visit2)sp).getType();
                boolean _equals_2 = Objects.equal(_type_2, "exactly");
                if (_equals_2) {
                  s = "visit _space_ exactly:_space_No _space_ translation _space_ provided.";
                }
              }
            }
          }
          if (!_matched_1) {
            if (sp instanceof Avoid) {
              _matched_1=true;
              String _type = ((Avoid)sp).getType();
              boolean _tripleEquals = (_type == null);
              if (_tripleEquals) {
                s = "";
                int _length = ((Object[])Conversions.unwrapArray(((Avoid)sp).getLocations(), Object.class)).length;
                boolean _equals = (_length == 1);
                if (_equals) {
                  String _s = s;
                  String _name = ((Avoid)sp).getLocations().get(0).getName();
                  String _plus = (("G !\"" + rob) + _name);
                  String _plus_1 = (_plus + "\"");
                  s = (_s + _plus_1);
                } else {
                  EList<Location> _locations = ((Avoid)sp).getLocations();
                  for (final Location l : _locations) {
                    String _s_1 = s;
                    String _name_1 = l.getName();
                    String _plus_2 = (("(G !\"" + rob) + _name_1);
                    String _plus_3 = (_plus_2 + "\") & ");
                    s = (_s_1 + _plus_3);
                  }
                  int _length_1 = s.length();
                  int _minus = (_length_1 - 2);
                  s = s.substring(0, _minus);
                }
              } else {
                String _type_1 = ((Avoid)sp).getType();
                boolean _equals_1 = Objects.equal(_type_1, "until");
                if (_equals_1) {
                  String sStart = "(";
                  String sFin = ")";
                  EList<Location> _locations_1 = ((Avoid)sp).getLocations();
                  for (final Location l_1 : _locations_1) {
                    String _s_2 = s;
                    String _name_2 = l_1.getName();
                    String _plus_4 = (("(!\"" + rob) + _name_2);
                    String _plus_5 = (_plus_4 + "\") & ");
                    s = (_s_2 + _plus_5);
                  }
                  String cond = ((Avoid)sp).getCondition().getName();
                  int _length_2 = ((Object[])Conversions.unwrapArray(((Avoid)sp).getLocations(), Object.class)).length;
                  boolean _equals_2 = (_length_2 == 1);
                  if (_equals_2) {
                    sStart = "";
                    sFin = "";
                  }
                  int _length_3 = s.length();
                  int _minus_1 = (_length_3 - 2);
                  String _substring = s.substring(0, _minus_1);
                  String _plus_6 = (sStart + _substring);
                  String _plus_7 = (_plus_6 + sFin);
                  String _plus_8 = (_plus_7 + " U (\"");
                  String _plus_9 = (_plus_8 + cond);
                  String _plus_10 = (_plus_9 + "\")");
                  s = _plus_10;
                } else {
                  String _type_2 = ((Avoid)sp).getType();
                  boolean _equals_3 = Objects.equal(_type_2, "after");
                  if (_equals_3) {
                    String sFin_1 = "";
                    String sStart_1 = "";
                    String _name_3 = ((Avoid)sp).getCondition().getName();
                    String _plus_11 = ("G (\"" + _name_3);
                    String _plus_12 = (_plus_11 + "\" => ");
                    sStart_1 = _plus_12;
                    int _length_4 = ((Object[])Conversions.unwrapArray(((Avoid)sp).getLocations(), Object.class)).length;
                    boolean _equals_4 = (_length_4 == 1);
                    if (_equals_4) {
                      String _s_3 = s;
                      String _name_4 = ((Avoid)sp).getLocations().get(0).getName();
                      String _plus_13 = (("(G_space_!\"" + rob) + _name_4);
                      String _plus_14 = (_plus_13 + "\")  ");
                      s = (_s_3 + _plus_14);
                    } else {
                      String _s_4 = s;
                      s = (_s_4 + "(");
                      EList<Location> _locations_2 = ((Avoid)sp).getLocations();
                      for (final Location l_2 : _locations_2) {
                        String _s_5 = s;
                        String _name_5 = l_2.getName();
                        String _plus_15 = (("(G_space_!\"" + rob) + _name_5);
                        String _plus_16 = (_plus_15 + "\") & ");
                        s = (_s_5 + _plus_16);
                      }
                      String _sFin = sFin_1;
                      sFin_1 = (_sFin + ")");
                    }
                    String _sFin_1 = sFin_1;
                    sFin_1 = (_sFin_1 + ")");
                    int _length_5 = s.length();
                    int _minus_2 = (_length_5 - 2);
                    String _substring_1 = s.substring(0, _minus_2);
                    String _plus_17 = (sStart_1 + _substring_1);
                    String _plus_18 = (_plus_17 + sFin_1);
                    s = _plus_18;
                  }
                }
              }
            }
          }
        }
      }
      if (!_matched) {
        if (sp instanceof React) {
          _matched=true;
          String _type = ((React)sp).getType();
          boolean _equals = Objects.equal(_type, "instantly");
          if (_equals) {
            Action _action = ((React)sp).getAction();
            boolean _tripleNotEquals = (_action != null);
            if (_tripleNotEquals) {
              String _s = s;
              String _name = ((React)sp).getCondition().getName();
              String _plus = ("G (\"" + _name);
              String _plus_1 = (_plus + "\" => \"");
              String _name_1 = ((React)sp).getAction().getName();
              String _plus_2 = (_plus_1 + _name_1);
              String _plus_3 = (_plus_2 + "\")");
              s = (_s + _plus_3);
            } else {
              SpecificationPatterns _pattern = ((React)sp).getPattern();
              boolean _tripleNotEquals_1 = (_pattern != null);
              if (_tripleNotEquals_1) {
                String _s_1 = s;
                String _name_2 = ((React)sp).getCondition().getName();
                String _plus_4 = ("G(\"" + _name_2);
                String _plus_5 = (_plus_4 + "\" => (");
                s = (_s_1 + _plus_5);
                String _s_2 = s;
                String _pat = Patterns.getPat(((React)sp).getPattern(), rob, resource);
                s = (_s_2 + _pat);
                String _s_3 = s;
                s = (_s_3 + "))");
              } else {
                EList<Location> _locations = ((React)sp).getLocations();
                boolean _tripleNotEquals_2 = (_locations != null);
                if (_tripleNotEquals_2) {
                  String _s_4 = s;
                  String _name_3 = ((React)sp).getCondition().getName();
                  String _plus_6 = ("G (\"" + _name_3);
                  String _plus_7 = (_plus_6 + "\" => \"");
                  String _plus_8 = (_plus_7 + rob);
                  String _name_4 = IterableExtensions.<Location>head(((React)sp).getLocations()).getName();
                  String _plus_9 = (_plus_8 + _name_4);
                  String _plus_10 = (_plus_9 + "\")");
                  s = (_s_4 + _plus_10);
                }
              }
            }
          } else {
            String _type_1 = ((React)sp).getType();
            boolean _equals_1 = Objects.equal(_type_1, "with a delay");
            if (_equals_1) {
              Action _action_1 = ((React)sp).getAction();
              boolean _tripleNotEquals_3 = (_action_1 != null);
              if (_tripleNotEquals_3) {
                String _name_5 = ((React)sp).getCondition().getName();
                String _plus_11 = ("G(\"" + _name_5);
                String _plus_12 = (_plus_11 + "\" => (F\"");
                String _name_6 = ((React)sp).getAction().getName();
                String _plus_13 = (_plus_12 + _name_6);
                String _plus_14 = (_plus_13 + "\") )");
                s = _plus_14;
              } else {
                SpecificationPatterns _pattern_1 = ((React)sp).getPattern();
                boolean _tripleNotEquals_4 = (_pattern_1 != null);
                if (_tripleNotEquals_4) {
                  String _name_7 = ((React)sp).getCondition().getName();
                  String _plus_15 = ("G(\"" + _name_7);
                  String _plus_16 = (_plus_15 + "\" => (");
                  s = _plus_16;
                  String _s_5 = s;
                  String _pat_1 = Patterns.getPat(((React)sp).getPattern(), rob, resource);
                  s = (_s_5 + _pat_1);
                  String _s_6 = s;
                  s = (_s_6 + ") )");
                } else {
                  EList<Location> _locations_1 = ((React)sp).getLocations();
                  boolean _tripleNotEquals_5 = (_locations_1 != null);
                  if (_tripleNotEquals_5) {
                    String _name_8 = ((React)sp).getCondition().getName();
                    String _plus_17 = ("G(\"" + _name_8);
                    String _plus_18 = (_plus_17 + "\" => (F\"");
                    String _plus_19 = (_plus_18 + rob);
                    String _name_9 = IterableExtensions.<Location>head(((React)sp).getLocations()).getName();
                    String _plus_20 = (_plus_19 + _name_9);
                    String _plus_21 = (_plus_20 + "\") )");
                    s = _plus_21;
                  }
                }
              }
            } else {
              String _type_2 = ((React)sp).getType();
              boolean _equals_2 = Objects.equal(_type_2, "promptly");
              if (_equals_2) {
                Action _action_2 = ((React)sp).getAction();
                boolean _tripleNotEquals_6 = (_action_2 != null);
                if (_tripleNotEquals_6) {
                  String _name_10 = ((React)sp).getCondition().getName();
                  String _plus_22 = ("G(\"" + _name_10);
                  String _plus_23 = (_plus_22 + "\" => (X\"");
                  String _name_11 = ((React)sp).getAction().getName();
                  String _plus_24 = (_plus_23 + _name_11);
                  String _plus_25 = (_plus_24 + "\") )");
                  s = _plus_25;
                } else {
                  SpecificationPatterns _pattern_2 = ((React)sp).getPattern();
                  boolean _tripleNotEquals_7 = (_pattern_2 != null);
                  if (_tripleNotEquals_7) {
                    String _name_12 = ((React)sp).getCondition().getName();
                    String _plus_26 = ("G(\"" + _name_12);
                    String _plus_27 = (_plus_26 + "\" => (X(");
                    s = _plus_27;
                    String _s_7 = s;
                    String _pat_2 = Patterns.getPat(((React)sp).getPattern(), rob, resource);
                    s = (_s_7 + _pat_2);
                    String _s_8 = s;
                    s = (_s_8 + "\")_space_) )");
                  } else {
                    EList<Location> _locations_2 = ((React)sp).getLocations();
                    boolean _tripleNotEquals_8 = (_locations_2 != null);
                    if (_tripleNotEquals_8) {
                      String loc = IterableExtensions.<Location>head(((React)sp).getLocations()).getName();
                      String _name_13 = ((React)sp).getCondition().getName();
                      String _plus_28 = ("G(\"" + _name_13);
                      String _plus_29 = (_plus_28 + "\" => (X\"");
                      String _plus_30 = (_plus_29 + rob);
                      String _plus_31 = (_plus_30 + loc);
                      String _plus_32 = (_plus_31 + "\") )");
                      s = _plus_32;
                    }
                  }
                }
              }
            }
          }
        }
      }
      if (!_matched) {
        if (sp instanceof Counteract) {
          _matched=true;
          String _type = ((Counteract)sp).getType();
          boolean _equals = Objects.equal(_type, "instantly");
          if (_equals) {
            String _name = ((Counteract)sp).getCondition().getName();
            String _plus = ("G(\"" + _name);
            String _plus_1 = (_plus + "\" <=> \"");
            String _name_1 = ((Counteract)sp).getLocations().getName();
            String _plus_2 = (_plus_1 + _name_1);
            String _plus_3 = (_plus_2 + "\")");
            s = _plus_3;
          } else {
            String _type_1 = ((Counteract)sp).getType();
            boolean _equals_1 = Objects.equal(_type_1, "with a delay");
            if (_equals_1) {
              String _name_2 = ((Counteract)sp).getCondition().getName();
              String _plus_4 = ("G(\"" + _name_2);
              String _plus_5 = (_plus_4 + "\" <=> (X\"");
              String _name_3 = ((Counteract)sp).getLocations().getName();
              String _plus_6 = (_plus_5 + _name_3);
              String _plus_7 = (_plus_6 + "\"))");
              s = _plus_7;
            }
          }
        }
      }
      if (!_matched) {
        if (sp instanceof Wait) {
          _matched=true;
          String loc = IterableExtensions.<Location>head(((Wait)sp).getLocations()).getName();
          String _name = ((Wait)sp).getCondition().getName();
          String _plus = (((("(\"" + rob) + loc) + "\") U (\"") + _name);
          String _plus_1 = (_plus + "\")");
          s = _plus_1;
        }
      }
      _xblockexpression = s;
    }
    return _xblockexpression;
  }
}
