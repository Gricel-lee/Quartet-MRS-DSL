/**
 * Multi-robot systems pattern- Generator
 * Xtext 2.25.0
 */
package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Missions;
import org.xtext.example.mydsl.myDsl.ProblemSpecifications;
import org.xtext.example.mydsl.myDsl.TopMissions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * 
 * Constraints:
 * (a) prohibit nested probabilities, (b) accept only LTL
 * properties for the reward and probability operators, and
 * (c) prohibit the definition of specifications that lead to
 * the conjunction of quantitative and non-quantitative PRISM
 * formulae since such formulae can not be processed by PRISM.
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = null;
    if (resource!=null) {
      _allContents=resource.getAllContents();
    }
    EObject _head = null;
    if (_allContents!=null) {
      _head=IteratorExtensions.<EObject>head(_allContents);
    }
    final ProblemSpecifications root = ((ProblemSpecifications) _head);
    final EList<TopMissions> topmissions = root.getTopmissions();
    String finalString = "";
    List<TopMissions> _list = IterableExtensions.<TopMissions>toList(topmissions);
    for (final TopMissions tm : _list) {
      String _finalString = finalString;
      String _topMissionTranslated = MyDslGenerator.getTopMissionTranslated(tm, resource);
      finalString = (_finalString + _topMissionTranslated);
    }
    String _lastSegment = resource.getURI().lastSegment();
    String _plus = (_lastSegment + ".prop");
    fsa.generateFile(_plus, finalString);
    Tests.test_regex();
  }

  public static String getTopMissionTranslated(final TopMissions tmiss, final Resource resource) {
    String _xblockexpression = null;
    {
      String id = tmiss.getName();
      Missions miss = tmiss.getMission();
      String s = new String();
      s = ECPatterns.getMissionTranslated(miss, resource).replaceAll("\\s", "").replaceAll("_space_", " ").replaceAll("\"\"", "\"");
      s = MyDslGenerator.checkFormulae(s);
      s = (((id + ": ") + s) + "\n\n");
      _xblockexpression = s;
    }
    return _xblockexpression;
  }

  /**
   * Constraints:
   * (a) prohibit nested probabilities, (b) accept only LTL
   * properties for the reward and probability operators, and
   * (c) prohibit the definition of specifications that lead to
   * the conjunction of quantitative and non-quantitative PRISM
   * formulae since such formulae can not be processed by PRISM.
   */
  public static String checkFormulae(final String s) {
    String checked_s = "";
    boolean _contains = s.contains("(R");
    if (_contains) {
      String _checked_s = checked_s;
      checked_s = (_checked_s + ("-Formulae: " + s));
      String _checked_s_1 = checked_s;
      checked_s = (_checked_s_1 + "\n  \t\t\t\t-WARNING. Translation into PRISM may not be supported.");
      String _checked_s_2 = checked_s;
      checked_s = (_checked_s_2 + "\n  \t\t\t\t--Feedback: Reward found inside inside parenthesis-- ");
      return checked_s;
    } else {
      boolean _contains_1 = s.contains("(P");
      if (_contains_1) {
        String _checked_s_3 = checked_s;
        checked_s = (_checked_s_3 + ("-Formulae: " + s));
        String _checked_s_4 = checked_s;
        checked_s = (_checked_s_4 + "\n  \t\t\t\t-WARNING. Translation into PRISM may not be supported.");
        String _checked_s_5 = checked_s;
        checked_s = (_checked_s_5 + "\n  \t\t\t\t--Feedback: Probability found inside parenthesis-- ");
        return checked_s;
      } else {
        boolean _contains_2 = s.contains("(G[");
        if (_contains_2) {
          String _checked_s_6 = checked_s;
          checked_s = (_checked_s_6 + ("-Formulae: " + s));
          String _checked_s_7 = checked_s;
          checked_s = (_checked_s_7 + "\n  \t\t\t\t-WARNING. Translation into PRISM may not be supported.");
          String _checked_s_8 = checked_s;
          checked_s = (_checked_s_8 + "\n  \t\t\t\t--Feedback: G bounded [...] found inside parenthesis-- ");
          return checked_s;
        } else {
          checked_s = s;
        }
      }
    }
    return checked_s;
  }
}
