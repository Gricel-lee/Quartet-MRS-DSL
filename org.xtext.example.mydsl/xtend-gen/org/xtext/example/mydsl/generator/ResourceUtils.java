package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.myDsl.Conservation;
import org.xtext.example.mydsl.myDsl.Maximize;
import org.xtext.example.mydsl.myDsl.Missions;
import org.xtext.example.mydsl.myDsl.Preservation;

/**
 * IResourceDescriptions and IEObjectDescriptions are updated in the following situations:
 * They are incrementally updated when editing a file within Eclipse (as long as �Project -> Build Automatically� is not disabled);
 * They are completely refreshed when performing �Project -> Clean.. -> Clean all projects�.
 * Based on: http://www.cs.ru.nl/J.Hooman/DSL/AdvancedXtextManual.pdf
 */
@SuppressWarnings("all")
public class ResourceUtils {
  public static String rewardSign(final String s, final String sign, final String measure, final double value, final Missions submission, final Resource resource) {
    String _string = Double.valueOf(value).toString();
    String _plus = (((("R{\"" + measure) + "\"}") + sign) + _string);
    String _plus_1 = (_plus + " [");
    String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
    String _plus_2 = (_plus_1 + _missionTranslated);
    return (_plus_2 + "]");
  }

  /**
   * Minimise reward
   */
  public static String minimizeReward(final Conservation m, final Resource resource) {
    return ResourceUtils.minimizeReward(m.getMissions(), m.getMeasure(), resource);
  }

  public static String minimizeReward(final Maximize m, final Resource resource) {
    String measure = m.getMeasure();
    Missions submission = m.getMission();
    return ResourceUtils.minimizeReward(submission, measure, resource);
  }

  public static String minimizeReward(final Missions submission, final String measure, final Resource resource) {
    String s = "";
    String _s = s;
    String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
    String _plus = ((("R{\"" + measure) + "\"}min=?[") + _missionTranslated);
    String _plus_1 = (_plus + "]");
    s = (_s + _plus_1);
    return s;
  }

  /**
   * Reward between
   */
  public static String rewardBetween_v1v2(final Preservation m, final Resource resource) {
    String _xblockexpression = null;
    {
      String s = "";
      Missions submission = m.getMissions();
      String _s = s;
      String _measure = m.getMeasure();
      String _plus = ("(R{\"" + _measure);
      String _plus_1 = (_plus + "\"}>=");
      double _value1 = m.getValue1();
      String _plus_2 = (_plus_1 + Double.valueOf(_value1));
      String _plus_3 = (_plus_2 + "[");
      s = (_s + _plus_3);
      String _s_1 = s;
      String _missionTranslated = ECPatterns.getMissionTranslated(submission, resource);
      String _plus_4 = (_missionTranslated + "]");
      s = (_s_1 + _plus_4);
      String _s_2 = s;
      s = (_s_2 + ") & (");
      String _s_3 = s;
      String _measure_1 = m.getMeasure();
      String _plus_5 = ("R{\"" + _measure_1);
      String _plus_6 = (_plus_5 + "\"}<=");
      double _value2 = m.getValue2();
      String _plus_7 = (_plus_6 + Double.valueOf(_value2));
      String _plus_8 = (_plus_7 + "[");
      s = (_s_3 + _plus_8);
      String _s_4 = s;
      String _missionTranslated_1 = ECPatterns.getMissionTranslated(submission, resource);
      String _plus_9 = (_missionTranslated_1 + "])");
      _xblockexpression = s = (_s_4 + _plus_9);
    }
    return _xblockexpression;
  }

  public static String getCondition(final Resource resource) {
    String _xblockexpression = null;
    {
      String s = "";
      _xblockexpression = s;
    }
    return _xblockexpression;
  }
}
