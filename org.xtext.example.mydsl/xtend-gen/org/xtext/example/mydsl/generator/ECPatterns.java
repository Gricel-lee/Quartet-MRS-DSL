package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.myDsl.Accrue;
import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.AtMost;
import org.xtext.example.mydsl.myDsl.ComplexMissions;
import org.xtext.example.mydsl.myDsl.CompositePatterns;
import org.xtext.example.mydsl.myDsl.Composition;
import org.xtext.example.mydsl.myDsl.Conservation;
import org.xtext.example.mydsl.myDsl.ElementaryPatterns;
import org.xtext.example.mydsl.myDsl.End;
import org.xtext.example.mydsl.myDsl.Equidistance;
import org.xtext.example.mydsl.myDsl.Execute;
import org.xtext.example.mydsl.myDsl.Maximize;
import org.xtext.example.mydsl.myDsl.MissionOperation;
import org.xtext.example.mydsl.myDsl.Missions;
import org.xtext.example.mydsl.myDsl.Negation;
import org.xtext.example.mydsl.myDsl.Pause;
import org.xtext.example.mydsl.myDsl.Preservation;
import org.xtext.example.mydsl.myDsl.Proportional;
import org.xtext.example.mydsl.myDsl.ReliabilityConfidence;
import org.xtext.example.mydsl.myDsl.Repeat;
import org.xtext.example.mydsl.myDsl.ShallMissions;
import org.xtext.example.mydsl.myDsl.SpecificationPatterns;
import org.xtext.example.mydsl.myDsl.Timeout;
import org.xtext.example.mydsl.myDsl.Trail;
import org.xtext.example.mydsl.myDsl.Within;

@SuppressWarnings("all")
public class ECPatterns {
  public static String getMissionTranslated(final Missions miss, final Resource resource) {
    String s = new String();
    boolean _matched = false;
    if (miss instanceof ShallMissions) {
      _matched=true;
      String rob = ((ShallMissions)miss).getRobots().getName();
      SpecificationPatterns pat = ((ShallMissions)miss).getMovementPatterns();
      String patt = Patterns.getPat(pat, rob, resource);
      String _s = s;
      s = (_s + patt);
    }
    if (!_matched) {
      if (miss instanceof ComplexMissions) {
        _matched=true;
        MissionOperation typeComplexMiss = ((ComplexMissions)miss).getComposition();
        boolean _matched_1 = false;
        if (typeComplexMiss instanceof Negation) {
          _matched_1=true;
          Missions miss_negated = ((Negation)typeComplexMiss).getNot();
          String _s = s;
          s = (_s + "!(");
          String _s_1 = s;
          String _missionTranslated = ECPatterns.getMissionTranslated(miss_negated, resource);
          s = (_s_1 + _missionTranslated);
          String _s_2 = s;
          s = (_s_2 + ")");
        }
        if (!_matched_1) {
          if (typeComplexMiss instanceof Composition) {
            _matched_1=true;
            Missions miss1 = ((Composition)typeComplexMiss).getMiss1();
            Missions miss2 = ((Composition)typeComplexMiss).getMiss2();
            String _s = s;
            s = (_s + "(");
            String _s_1 = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(miss1, resource);
            s = (_s_1 + _missionTranslated);
            String _binaryType = ((Composition)typeComplexMiss).getBinaryType();
            boolean _equals = Objects.equal(_binaryType, "and");
            if (_equals) {
              String _s_2 = s;
              s = (_s_2 + ") & (");
            } else {
              String _binaryType_1 = ((Composition)typeComplexMiss).getBinaryType();
              boolean _equals_1 = Objects.equal(_binaryType_1, "or");
              if (_equals_1) {
                String _s_3 = s;
                s = (_s_3 + ") | (");
              }
            }
            String _s_4 = s;
            String _missionTranslated_1 = ECPatterns.getMissionTranslated(miss2, resource);
            s = (_s_4 + _missionTranslated_1);
            String _s_5 = s;
            s = (_s_5 + " )");
          }
        }
      }
    }
    if (!_matched) {
      if (miss instanceof ElementaryPatterns) {
        _matched=true;
        ElementaryPatterns m = ((ElementaryPatterns)miss);
        Missions submission = m.getMission();
        String _reward = m.getReward();
        boolean _tripleEquals = (_reward == null);
        if (_tripleEquals) {
          boolean _matched_1 = false;
          if (m instanceof Maximize) {
            _matched_1=true;
            String _type = ((Maximize)m).getType();
            boolean _equals = Objects.equal(_type, "maximize");
            if (_equals) {
              String _s = s;
              String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
              String _plus = ("Pmax=?[" + _missionTranslated);
              String _plus_1 = (_plus + "]");
              s = (_s + _plus_1);
            } else {
              String _type_1 = ((Maximize)m).getType();
              boolean _equals_1 = Objects.equal(_type_1, "minimize");
              if (_equals_1) {
                String _s_1 = s;
                String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_2 = ("Pmin=?[" + _missionTranslated_1);
                String _plus_3 = (_plus_2 + "]");
                s = (_s_1 + _plus_3);
              }
            }
          }
          if (!_matched_1) {
            if (m instanceof AtMost) {
              _matched_1=true;
              String sign = "";
              String _type = ((AtMost)m).getType();
              boolean _equals = Objects.equal(_type, "at most");
              if (_equals) {
                sign = "<=";
              } else {
                String _type_1 = ((AtMost)m).getType();
                boolean _equals_1 = Objects.equal(_type_1, "less than");
                if (_equals_1) {
                  sign = "<";
                } else {
                  String _type_2 = ((AtMost)m).getType();
                  boolean _equals_2 = Objects.equal(_type_2, "at least");
                  if (_equals_2) {
                    sign = ">=";
                  } else {
                    String _type_3 = ((AtMost)m).getType();
                    boolean _equals_3 = Objects.equal(_type_3, "greater than");
                    if (_equals_3) {
                      sign = ">";
                    }
                  }
                }
              }
              String _type_4 = ((AtMost)m).getType();
              boolean _equals_4 = Objects.equal(_type_4, "exactly");
              if (_equals_4) {
                String _s = s;
                String _string = Double.valueOf(((AtMost)m).getValue()).toString();
                String _plus = ("(P>=" + _string);
                String _plus_1 = (_plus + "[");
                String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_2 = (_plus_1 + _missionTranslated);
                String _plus_3 = (_plus_2 + "]");
                s = (_s + _plus_3);
                String _s_1 = s;
                s = (_s_1 + ") & (");
                String _s_2 = s;
                String _string_1 = Double.valueOf(((AtMost)m).getValue()).toString();
                String _plus_4 = ("P<=" + _string_1);
                String _plus_5 = (_plus_4 + "[");
                String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_6 = (_plus_5 + _missionTranslated_1);
                String _plus_7 = (_plus_6 + "])");
                s = (_s_2 + _plus_7);
              } else {
                String _s_3 = s;
                String _string_2 = Double.valueOf(((AtMost)m).getValue()).toString();
                String _plus_8 = (("P" + sign) + _string_2);
                String _plus_9 = (_plus_8 + "[");
                String _missionTranslated_2 = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_10 = (_plus_9 + _missionTranslated_2);
                String _plus_11 = (_plus_10 + "]");
                s = (_s_3 + _plus_11);
              }
            }
          }
          if (!_matched_1) {
            if (m instanceof Within) {
              _matched_1=true;
              String _type = ((Within)m).getType();
              boolean _equals = Objects.equal(_type, "within");
              if (_equals) {
                String _s = s;
                String _string = Double.valueOf(((Within)m).getValue1()).toString();
                String _plus = ("(P>=" + _string);
                String _plus_1 = (_plus + "[");
                String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_2 = (_plus_1 + _missionTranslated);
                String _plus_3 = (_plus_2 + "])");
                s = (_s + _plus_3);
                String _s_1 = s;
                s = (_s_1 + " & ");
                String _s_2 = s;
                String _string_1 = Double.valueOf(((Within)m).getValue2()).toString();
                String _plus_4 = ("(P<=" + _string_1);
                String _plus_5 = (_plus_4 + "[");
                String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_6 = (_plus_5 + _missionTranslated_1);
                String _plus_7 = (_plus_6 + "])");
                s = (_s_2 + _plus_7);
              } else {
                String _type_1 = ((Within)m).getType();
                boolean _equals_1 = Objects.equal(_type_1, "strictly within");
                if (_equals_1) {
                  String _s_3 = s;
                  String _string_2 = Double.valueOf(((Within)m).getValue1()).toString();
                  String _plus_8 = ("(P>" + _string_2);
                  String _plus_9 = (_plus_8 + "[");
                  String _missionTranslated_2 = ECPatterns.getMissionTranslated(submission, resource);
                  String _plus_10 = (_plus_9 + _missionTranslated_2);
                  String _plus_11 = (_plus_10 + "])");
                  s = (_s_3 + _plus_11);
                  String _s_4 = s;
                  s = (_s_4 + " & ");
                  String _s_5 = s;
                  String _string_3 = Double.valueOf(((Within)m).getValue2()).toString();
                  String _plus_12 = ("(P<" + _string_3);
                  String _plus_13 = (_plus_12 + "[");
                  String _missionTranslated_3 = ECPatterns.getMissionTranslated(submission, resource);
                  String _plus_14 = (_plus_13 + _missionTranslated_3);
                  String _plus_15 = (_plus_14 + "])");
                  s = (_s_5 + _plus_15);
                }
              }
            }
          }
        } else {
          String _reward_1 = m.getReward();
          boolean _tripleNotEquals = (_reward_1 != null);
          if (_tripleNotEquals) {
            boolean _matched_2 = false;
            if (m instanceof Maximize) {
              _matched_2=true;
              String _type = ((Maximize)m).getType();
              boolean _equals = Objects.equal(_type, "maximize");
              if (_equals) {
                String _s = s;
                String _measure = ((Maximize)m).getMeasure();
                String _plus = ("R{\"" + _measure);
                String _plus_1 = (_plus + "\"}max=?[");
                String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
                String _plus_2 = (_plus_1 + _missionTranslated);
                String _plus_3 = (_plus_2 + "]");
                s = (_s + _plus_3);
              } else {
                String _type_1 = ((Maximize)m).getType();
                boolean _equals_1 = Objects.equal(_type_1, "minimize");
                if (_equals_1) {
                  String _s_1 = s;
                  String _minimizeReward = ResourceUtils.minimizeReward(((Maximize)m), resource);
                  s = (_s_1 + _minimizeReward);
                }
              }
            }
            if (!_matched_2) {
              if (m instanceof AtMost) {
                _matched_2=true;
                String sign = "";
                String _type = ((AtMost)m).getType();
                boolean _equals = Objects.equal(_type, "at most");
                if (_equals) {
                  sign = "<=";
                } else {
                  String _type_1 = ((AtMost)m).getType();
                  boolean _equals_1 = Objects.equal(_type_1, "less than");
                  if (_equals_1) {
                    sign = "<";
                  } else {
                    String _type_2 = ((AtMost)m).getType();
                    boolean _equals_2 = Objects.equal(_type_2, "at least");
                    if (_equals_2) {
                      sign = ">=";
                    } else {
                      String _type_3 = ((AtMost)m).getType();
                      boolean _equals_3 = Objects.equal(_type_3, "greater than");
                      if (_equals_3) {
                        sign = ">";
                      }
                    }
                  }
                }
                String _type_4 = ((AtMost)m).getType();
                boolean _equals_4 = Objects.equal(_type_4, "exactly");
                if (_equals_4) {
                  String _s = s;
                  String _rewardSign = ResourceUtils.rewardSign(s, ">=", ((AtMost)m).getMeasure(), ((AtMost)m).getValue(), submission, resource);
                  String _plus = ("(" + _rewardSign);
                  String _plus_1 = (_plus + ")");
                  s = (_s + _plus_1);
                  String _s_1 = s;
                  s = (_s_1 + " & ");
                  String _s_2 = s;
                  String _rewardSign_1 = ResourceUtils.rewardSign(s, "<=", ((AtMost)m).getMeasure(), ((AtMost)m).getValue(), submission, resource);
                  String _plus_2 = ("(" + _rewardSign_1);
                  String _plus_3 = (_plus_2 + ")");
                  s = (_s_2 + _plus_3);
                } else {
                  String _s_3 = s;
                  String _rewardSign_2 = ResourceUtils.rewardSign(s, sign, ((AtMost)m).getMeasure(), ((AtMost)m).getValue(), submission, resource);
                  s = (_s_3 + _rewardSign_2);
                }
              }
            }
            if (!_matched_2) {
              if (m instanceof Within) {
                _matched_2=true;
                String _type = ((Within)m).getType();
                boolean _equals = Objects.equal(_type, "within");
                if (_equals) {
                  String _s = s;
                  String _rewardSign = ResourceUtils.rewardSign(s, ">=", ((Within)m).getMeasure(), ((Within)m).getValue1(), submission, resource);
                  String _plus = ("(" + _rewardSign);
                  String _plus_1 = (_plus + ")");
                  s = (_s + _plus_1);
                  String _s_1 = s;
                  s = (_s_1 + " & ");
                  String _s_2 = s;
                  String _rewardSign_1 = ResourceUtils.rewardSign(s, "<=", ((Within)m).getMeasure(), ((Within)m).getValue2(), submission, resource);
                  String _plus_2 = ("(" + _rewardSign_1);
                  String _plus_3 = (_plus_2 + ")");
                  s = (_s_2 + _plus_3);
                } else {
                  String _type_1 = ((Within)m).getType();
                  boolean _equals_1 = Objects.equal(_type_1, "strictly within");
                  if (_equals_1) {
                    String _s_3 = s;
                    String _rewardSign_2 = ResourceUtils.rewardSign(s, ">", ((Within)m).getMeasure(), ((Within)m).getValue1(), submission, resource);
                    String _plus_4 = ("(" + _rewardSign_2);
                    String _plus_5 = (_plus_4 + ")");
                    s = (_s_3 + _plus_5);
                    String _s_4 = s;
                    s = (_s_4 + " & ");
                    String _s_5 = s;
                    String _rewardSign_3 = ResourceUtils.rewardSign(s, "<", ((Within)m).getMeasure(), ((Within)m).getValue2(), submission, resource);
                    String _plus_6 = ("(" + _rewardSign_3);
                    String _plus_7 = (_plus_6 + ")");
                    s = (_s_5 + _plus_7);
                  }
                }
              }
            }
          }
        }
      }
    }
    if (!_matched) {
      if (miss instanceof CompositePatterns) {
        _matched=true;
        CompositePatterns m = ((CompositePatterns)miss);
        boolean _matched_1 = false;
        if (m instanceof Conservation) {
          _matched_1=true;
          String _s = s;
          String _minimizeReward = ResourceUtils.minimizeReward(((Conservation)m), resource);
          s = (_s + _minimizeReward);
        }
        if (!_matched_1) {
          if (m instanceof Preservation) {
            _matched_1=true;
            String _s = s;
            String _rewardBetween_v1v2 = ResourceUtils.rewardBetween_v1v2(((Preservation)m), resource);
            s = (_s + _rewardBetween_v1v2);
          }
        }
        if (!_matched_1) {
          if (m instanceof Pause) {
            _matched_1=true;
            Missions submission = ((Pause)m).getMissions();
            int _value = ((Pause)m).getValue();
            int m2 = (_value + 1);
            String _s = s;
            String _string = Integer.valueOf(((Pause)m).getValue()).toString();
            String _plus = ("(G [0," + _string);
            String _plus_1 = (_plus + "]_space_");
            s = (_s + _plus_1);
            String _s_1 = s;
            s = (_s_1 + "!(");
            String _s_2 = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
            s = (_s_2 + _missionTranslated);
            String _s_3 = s;
            s = (_s_3 + ") ) & ( ");
            String _s_4 = s;
            String _string_1 = Integer.valueOf(m2).toString();
            String _plus_2 = ("F[" + _string_1);
            String _plus_3 = (_plus_2 + ",");
            String _string_2 = Integer.valueOf(m2).toString();
            String _plus_4 = (_plus_3 + _string_2);
            String _plus_5 = (_plus_4 + "]");
            s = (_s_4 + _plus_5);
            String _s_5 = s;
            String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_6 = (_missionTranslated_1 + ")");
            s = (_s_5 + _plus_6);
          }
        }
        if (!_matched_1) {
          if (m instanceof Timeout) {
            _matched_1=true;
            Missions submission = ((Timeout)m).getMissions();
            String _s = s;
            String _string = Integer.valueOf(((Timeout)m).getValue()).toString();
            String _plus = ("G>=" + _string);
            s = (_s + _plus);
            String _s_1 = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_1 = (" _space_! (" + _missionTranslated);
            String _plus_2 = (_plus_1 + ")");
            s = (_s_1 + _plus_2);
          }
        }
        if (!_matched_1) {
          if (m instanceof Repeat) {
            _matched_1=true;
            Missions submission = ((Repeat)m).getMissions();
            int _value = ((Repeat)m).getValue();
            int m0 = (_value - 1);
            String _s = s;
            s = (_s + "(");
            String _s_1 = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
            s = (_s_1 + _missionTranslated);
            String _s_2 = s;
            s = (_s_2 + ") & (");
            String _s_3 = s;
            s = (_s_3 + "G(");
            String _s_4 = s;
            String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
            String _plus = ("(" + _missionTranslated_1);
            String _plus_1 = (_plus + ")");
            s = (_s_4 + _plus_1);
            String _s_5 = s;
            String _string = Integer.valueOf(m0).toString();
            String _plus_2 = ("=>(G[1," + _string);
            String _plus_3 = (_plus_2 + "] (!(");
            String _missionTranslated_2 = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_4 = (_plus_3 + _missionTranslated_2);
            String _plus_5 = (_plus_4 + ")) & (F[");
            int _value_1 = ((Repeat)m).getValue();
            String _plus_6 = (_plus_5 + Integer.valueOf(_value_1));
            String _plus_7 = (_plus_6 + ",");
            int _value_2 = ((Repeat)m).getValue();
            String _plus_8 = (_plus_7 + Integer.valueOf(_value_2));
            String _plus_9 = (_plus_8 + "] (");
            String _missionTranslated_3 = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_10 = (_plus_9 + _missionTranslated_3);
            String _plus_11 = (_plus_10 + ") ) )");
            s = (_s_5 + _plus_11);
            String _s_6 = s;
            s = (_s_6 + "))");
          }
        }
        if (!_matched_1) {
          if (m instanceof End) {
            _matched_1=true;
            Missions submission = ((End)m).getMissions();
            String _s = s;
            String _string = Integer.valueOf(((End)m).getValue()).toString();
            String _plus = ("(G>" + _string);
            String _plus_1 = (_plus + "_space_");
            s = (_s + _plus_1);
            String _s_1 = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_2 = ("(" + _missionTranslated);
            String _plus_3 = (_plus_2 + "))");
            s = (_s_1 + _plus_3);
            String _s_2 = s;
            String _string_1 = Integer.valueOf(((End)m).getValue()).toString();
            String _plus_4 = (" & (G>=" + _string_1);
            String _plus_5 = (_plus_4 + "_space_!(");
            String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
            String _plus_6 = (_plus_5 + _missionTranslated_1);
            String _plus_7 = (_plus_6 + ")");
            s = (_s_2 + _plus_7);
            String _s_3 = s;
            s = (_s_3 + ")");
          }
        }
        if (!_matched_1) {
          if (m instanceof Proportional) {
            _matched_1=true;
            String _s = s;
            s = (_s + "Proportional: _space_No _space_translation _space_available.");
          }
        }
        if (!_matched_1) {
          if (m instanceof Execute) {
            _matched_1=true;
            ((Execute)m).getRobots();
            ((Execute)m).getSetOfActions();
            EList<Action> _setOfActions = ((Execute)m).getSetOfActions();
            for (final Action a : _setOfActions) {
              String _s = s;
              String _name = ((Execute)m).getRobots().getName();
              String _plus = ("(F \"" + _name);
              String _name_1 = a.getName();
              String _plus_1 = (_plus + _name_1);
              String _plus_2 = (_plus_1 + "\") & ");
              s = (_s + _plus_2);
            }
            int _length = s.length();
            int _minus = (_length - 3);
            s = s.substring(0, _minus);
          }
        }
        if (!_matched_1) {
          if (m instanceof Accrue) {
            _matched_1=true;
            Missions submission = ((Accrue)m).getMissions();
            ((Accrue)m).getRobots();
            ((Accrue)m).getMeasure();
            String _s = s;
            String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
            String _plus = ("Rmax=?[" + _missionTranslated);
            String _plus_1 = (_plus + "]");
            s = (_s + _plus_1);
          }
        }
        if (!_matched_1) {
          if (m instanceof ReliabilityConfidence) {
            _matched_1=true;
            Missions submission = ((ReliabilityConfidence)m).getMissions();
            String _type1 = ((ReliabilityConfidence)m).getType1();
            boolean _equals = Objects.equal(_type1, "with reliability");
            if (_equals) {
              String _type2 = ((ReliabilityConfidence)m).getType2();
              boolean _equals_1 = Objects.equal(_type2, "greater than");
              if (_equals_1) {
                String _s = s;
                String _rewardSign = ResourceUtils.rewardSign(s, ">", ((ReliabilityConfidence)m).getMeasure(), ((ReliabilityConfidence)m).getValue(), submission, resource);
                s = (_s + _rewardSign);
              } else {
                String _type2_1 = ((ReliabilityConfidence)m).getType2();
                boolean _equals_2 = Objects.equal(_type2_1, "less than");
                if (_equals_2) {
                  String _s_1 = s;
                  String _rewardSign_1 = ResourceUtils.rewardSign(s, "<", ((ReliabilityConfidence)m).getMeasure(), ((ReliabilityConfidence)m).getValue(), submission, resource);
                  s = (_s_1 + _rewardSign_1);
                }
              }
            } else {
              String _type1_1 = ((ReliabilityConfidence)m).getType1();
              boolean _equals_3 = Objects.equal(_type1_1, "with confidence");
              if (_equals_3) {
                String _type2_2 = ((ReliabilityConfidence)m).getType2();
                boolean _equals_4 = Objects.equal(_type2_2, "greater than");
                if (_equals_4) {
                  String _s_2 = s;
                  s = (_s_2 + "With _space_ confidence: _space_No _space_translation _space_available.");
                } else {
                  String _type2_3 = ((ReliabilityConfidence)m).getType2();
                  boolean _equals_5 = Objects.equal(_type2_3, "less than");
                  if (_equals_5) {
                    String _s_3 = s;
                    s = (_s_3 + "With _space_confidence: _space_No _space_translation _space_available.");
                  }
                }
              }
            }
          }
        }
        if (!_matched_1) {
          if (m instanceof Equidistance) {
            _matched_1=true;
            String _s = s;
            s = (_s + "Equidistance: _space_Translation _space_not _space_available.");
          }
        }
        if (!_matched_1) {
          if (m instanceof Trail) {
            _matched_1=true;
            String _s = s;
            s = (_s + "Trail: _space_Translation _space_not _space_available");
          }
        }
      }
    }
    return s;
  }
}
