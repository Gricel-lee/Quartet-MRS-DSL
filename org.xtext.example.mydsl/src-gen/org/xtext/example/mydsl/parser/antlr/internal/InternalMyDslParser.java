package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "'specifications'", "'{'", "'locations:'", "','", "'actions:'", "'robots:'", "'conditions:'", "'missions:'", "';'", "'}'", "':'", "'is'", "'true'", "'('", "')'", "'ended'", "'at loc'", "'shall'", "'not'", "'and'", "'or'", "'visit'", "'in sequence'", "'in order'", "'in strict order'", "'fairly'", "'patrol'", "'more than'", "'less than'", "'exactly'", "'times'", "'avoid'", "'until'", "'after'", "'react'", "'instantly'", "'with a delay'", "'promptly'", "'to'", "'by'", "'exec'", "'reach'", "'counteract'", "'when'", "'wait in'", "'reward'", "'maximize'", "'minimize'", "'at most'", "'at least'", "'greater than'", "'within'", "'strictly within'", "'conserve'", "'while'", "'preserve'", "'['", "']'", "'pause'", "'timeout'", "'repeat'", "'every'", "'end'", "'exactly_at'", "'time'", "'of'", "'proportional to'", "'factor'", "'execute'", "'actions'", "'accrue'", "'achieve'", "'with confidence'", "'with reliability'", "'equidistance'", "'trail'", "'with distance'", "'.'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProblemSpecifications";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProblemSpecifications"
    // InternalMyDsl.g:64:1: entryRuleProblemSpecifications returns [EObject current=null] : iv_ruleProblemSpecifications= ruleProblemSpecifications EOF ;
    public final EObject entryRuleProblemSpecifications() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemSpecifications = null;


        try {
            // InternalMyDsl.g:64:62: (iv_ruleProblemSpecifications= ruleProblemSpecifications EOF )
            // InternalMyDsl.g:65:2: iv_ruleProblemSpecifications= ruleProblemSpecifications EOF
            {
             newCompositeNode(grammarAccess.getProblemSpecificationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblemSpecifications=ruleProblemSpecifications();

            state._fsp--;

             current =iv_ruleProblemSpecifications; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblemSpecifications"


    // $ANTLR start "ruleProblemSpecifications"
    // InternalMyDsl.g:71:1: ruleProblemSpecifications returns [EObject current=null] : ( () otherlv_1= 'problem' otherlv_2= 'specifications' otherlv_3= '{' (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )? (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )? (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )? (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )? (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )? otherlv_23= '}' ) ;
    public final EObject ruleProblemSpecifications() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_location_5_0 = null;

        EObject lv_location_7_0 = null;

        EObject lv_action_9_0 = null;

        EObject lv_action_11_0 = null;

        EObject lv_robots_13_0 = null;

        EObject lv_robots_15_0 = null;

        EObject lv_condition_17_0 = null;

        EObject lv_condition_18_0 = null;

        EObject lv_topmissions_20_0 = null;

        EObject lv_topmissions_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'problem' otherlv_2= 'specifications' otherlv_3= '{' (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )? (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )? (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )? (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )? (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )? otherlv_23= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'problem' otherlv_2= 'specifications' otherlv_3= '{' (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )? (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )? (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )? (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )? (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )? otherlv_23= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'problem' otherlv_2= 'specifications' otherlv_3= '{' (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )? (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )? (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )? (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )? (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )? otherlv_23= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'problem' otherlv_2= 'specifications' otherlv_3= '{' (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )? (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )? (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )? (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )? (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )? otherlv_23= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProblemSpecificationsAccess().getProblemSpecificationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProblemSpecificationsAccess().getProblemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProblemSpecificationsAccess().getSpecificationsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProblemSpecificationsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:98:3: (otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:99:4: otherlv_4= 'locations:' ( (lv_location_5_0= ruleLocation ) ) (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )*
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getProblemSpecificationsAccess().getLocationsKeyword_4_0());
                    			
                    // InternalMyDsl.g:103:4: ( (lv_location_5_0= ruleLocation ) )
                    // InternalMyDsl.g:104:5: (lv_location_5_0= ruleLocation )
                    {
                    // InternalMyDsl.g:104:5: (lv_location_5_0= ruleLocation )
                    // InternalMyDsl.g:105:6: lv_location_5_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getLocationLocationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_location_5_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    						}
                    						add(
                    							current,
                    							"location",
                    							lv_location_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:122:4: (otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:123:5: otherlv_6= ',' ( (lv_location_7_0= ruleLocation ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProblemSpecificationsAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:127:5: ( (lv_location_7_0= ruleLocation ) )
                    	    // InternalMyDsl.g:128:6: (lv_location_7_0= ruleLocation )
                    	    {
                    	    // InternalMyDsl.g:128:6: (lv_location_7_0= ruleLocation )
                    	    // InternalMyDsl.g:129:7: lv_location_7_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getLocationLocationParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_location_7_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"location",
                    	    								lv_location_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:148:3: (otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:149:4: otherlv_8= 'actions:' ( (lv_action_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )*
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getProblemSpecificationsAccess().getActionsKeyword_5_0());
                    			
                    // InternalMyDsl.g:153:4: ( (lv_action_9_0= ruleAction ) )
                    // InternalMyDsl.g:154:5: (lv_action_9_0= ruleAction )
                    {
                    // InternalMyDsl.g:154:5: (lv_action_9_0= ruleAction )
                    // InternalMyDsl.g:155:6: lv_action_9_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getActionActionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_action_9_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_9_0,
                    							"org.xtext.example.mydsl.MyDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:172:4: (otherlv_10= ',' ( (lv_action_11_0= ruleAction ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:173:5: otherlv_10= ',' ( (lv_action_11_0= ruleAction ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProblemSpecificationsAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:177:5: ( (lv_action_11_0= ruleAction ) )
                    	    // InternalMyDsl.g:178:6: (lv_action_11_0= ruleAction )
                    	    {
                    	    // InternalMyDsl.g:178:6: (lv_action_11_0= ruleAction )
                    	    // InternalMyDsl.g:179:7: lv_action_11_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getActionActionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_action_11_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"action",
                    	    								lv_action_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:198:3: (otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:199:4: otherlv_12= 'robots:' ( (lv_robots_13_0= ruleRobots ) ) (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getProblemSpecificationsAccess().getRobotsKeyword_6_0());
                    			
                    // InternalMyDsl.g:203:4: ( (lv_robots_13_0= ruleRobots ) )
                    // InternalMyDsl.g:204:5: (lv_robots_13_0= ruleRobots )
                    {
                    // InternalMyDsl.g:204:5: (lv_robots_13_0= ruleRobots )
                    // InternalMyDsl.g:205:6: lv_robots_13_0= ruleRobots
                    {

                    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getRobotsRobotsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_robots_13_0=ruleRobots();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    						}
                    						add(
                    							current,
                    							"robots",
                    							lv_robots_13_0,
                    							"org.xtext.example.mydsl.MyDsl.Robots");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:222:4: (otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:223:5: otherlv_14= ',' ( (lv_robots_15_0= ruleRobots ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getProblemSpecificationsAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:227:5: ( (lv_robots_15_0= ruleRobots ) )
                    	    // InternalMyDsl.g:228:6: (lv_robots_15_0= ruleRobots )
                    	    {
                    	    // InternalMyDsl.g:228:6: (lv_robots_15_0= ruleRobots )
                    	    // InternalMyDsl.g:229:7: lv_robots_15_0= ruleRobots
                    	    {

                    	    							newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getRobotsRobotsParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_robots_15_0=ruleRobots();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"robots",
                    	    								lv_robots_15_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Robots");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:248:3: (otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:249:4: otherlv_16= 'conditions:' ( (lv_condition_17_0= ruleCondition ) ) ( (lv_condition_18_0= ruleCondition ) )*
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getProblemSpecificationsAccess().getConditionsKeyword_7_0());
                    			
                    // InternalMyDsl.g:253:4: ( (lv_condition_17_0= ruleCondition ) )
                    // InternalMyDsl.g:254:5: (lv_condition_17_0= ruleCondition )
                    {
                    // InternalMyDsl.g:254:5: (lv_condition_17_0= ruleCondition )
                    // InternalMyDsl.g:255:6: lv_condition_17_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getConditionConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_condition_17_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_17_0,
                    							"org.xtext.example.mydsl.MyDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:272:4: ( (lv_condition_18_0= ruleCondition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:273:5: (lv_condition_18_0= ruleCondition )
                    	    {
                    	    // InternalMyDsl.g:273:5: (lv_condition_18_0= ruleCondition )
                    	    // InternalMyDsl.g:274:6: lv_condition_18_0= ruleCondition
                    	    {

                    	    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getConditionConditionParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_condition_18_0=ruleCondition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"condition",
                    	    							lv_condition_18_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Condition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:292:3: (otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:293:4: otherlv_19= 'missions:' ( (lv_topmissions_20_0= ruleTopMissions ) ) (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )*
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getProblemSpecificationsAccess().getMissionsKeyword_8_0());
                    			
                    // InternalMyDsl.g:297:4: ( (lv_topmissions_20_0= ruleTopMissions ) )
                    // InternalMyDsl.g:298:5: (lv_topmissions_20_0= ruleTopMissions )
                    {
                    // InternalMyDsl.g:298:5: (lv_topmissions_20_0= ruleTopMissions )
                    // InternalMyDsl.g:299:6: lv_topmissions_20_0= ruleTopMissions
                    {

                    						newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getTopmissionsTopMissionsParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_topmissions_20_0=ruleTopMissions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    						}
                    						add(
                    							current,
                    							"topmissions",
                    							lv_topmissions_20_0,
                    							"org.xtext.example.mydsl.MyDsl.TopMissions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:316:4: (otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:317:5: otherlv_21= ';' ( (lv_topmissions_22_0= ruleTopMissions ) )
                    	    {
                    	    otherlv_21=(Token)match(input,20,FOLLOW_6); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getProblemSpecificationsAccess().getSemicolonKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:321:5: ( (lv_topmissions_22_0= ruleTopMissions ) )
                    	    // InternalMyDsl.g:322:6: (lv_topmissions_22_0= ruleTopMissions )
                    	    {
                    	    // InternalMyDsl.g:322:6: (lv_topmissions_22_0= ruleTopMissions )
                    	    // InternalMyDsl.g:323:7: lv_topmissions_22_0= ruleTopMissions
                    	    {

                    	    							newCompositeNode(grammarAccess.getProblemSpecificationsAccess().getTopmissionsTopMissionsParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_topmissions_22_0=ruleTopMissions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProblemSpecificationsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"topmissions",
                    	    								lv_topmissions_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.TopMissions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getProblemSpecificationsAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblemSpecifications"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:350:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:350:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:351:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:357:1: ruleCondition returns [EObject current=null] : (this_Event_0= ruleEvent | this_ActionEnd_1= ruleActionEnd | this_LocationEvent_2= ruleLocationEvent ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Event_0 = null;

        EObject this_ActionEnd_1 = null;

        EObject this_LocationEvent_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:363:2: ( (this_Event_0= ruleEvent | this_ActionEnd_1= ruleActionEnd | this_LocationEvent_2= ruleLocationEvent ) )
            // InternalMyDsl.g:364:2: (this_Event_0= ruleEvent | this_ActionEnd_1= ruleActionEnd | this_LocationEvent_2= ruleLocationEvent )
            {
            // InternalMyDsl.g:364:2: (this_Event_0= ruleEvent | this_ActionEnd_1= ruleActionEnd | this_LocationEvent_2= ruleLocationEvent )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:365:3: this_Event_0= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_0=ruleEvent();

                    state._fsp--;


                    			current = this_Event_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:374:3: this_ActionEnd_1= ruleActionEnd
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getActionEndParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionEnd_1=ruleActionEnd();

                    state._fsp--;


                    			current = this_ActionEnd_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:383:3: this_LocationEvent_2= ruleLocationEvent
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getLocationEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationEvent_2=ruleLocationEvent();

                    state._fsp--;


                    			current = this_LocationEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:395:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:395:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:396:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:402:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleEString ) ) otherlv_4= 'is' otherlv_5= 'true' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:408:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleEString ) ) otherlv_4= 'is' otherlv_5= 'true' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) )
            // InternalMyDsl.g:409:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleEString ) ) otherlv_4= 'is' otherlv_5= 'true' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            {
            // InternalMyDsl.g:409:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleEString ) ) otherlv_4= 'is' otherlv_5= 'true' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            // InternalMyDsl.g:410:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleEString ) ) otherlv_4= 'is' otherlv_5= 'true' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            {
            // InternalMyDsl.g:410:3: ()
            // InternalMyDsl.g:411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:417:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:418:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:418:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:419:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:440:3: ( (lv_condition_3_0= ruleEString ) )
            // InternalMyDsl.g:441:4: (lv_condition_3_0= ruleEString )
            {
            // InternalMyDsl.g:441:4: (lv_condition_3_0= ruleEString )
            // InternalMyDsl.g:442:5: lv_condition_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConditionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_condition_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getIsKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getTrueKeyword_5());
            		
            // InternalMyDsl.g:467:3: (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:468:4: otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalMyDsl.g:472:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalMyDsl.g:473:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:473:5: (lv_description_7_0= ruleEString )
                    // InternalMyDsl.g:474:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleActionEnd"
    // InternalMyDsl.g:500:1: entryRuleActionEnd returns [EObject current=null] : iv_ruleActionEnd= ruleActionEnd EOF ;
    public final EObject entryRuleActionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionEnd = null;


        try {
            // InternalMyDsl.g:500:50: (iv_ruleActionEnd= ruleActionEnd EOF )
            // InternalMyDsl.g:501:2: iv_ruleActionEnd= ruleActionEnd EOF
            {
             newCompositeNode(grammarAccess.getActionEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionEnd=ruleActionEnd();

            state._fsp--;

             current =iv_ruleActionEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionEnd"


    // $ANTLR start "ruleActionEnd"
    // InternalMyDsl.g:507:1: ruleActionEnd returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'is' otherlv_5= 'ended' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleActionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:513:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'is' otherlv_5= 'ended' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) )
            // InternalMyDsl.g:514:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'is' otherlv_5= 'ended' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            {
            // InternalMyDsl.g:514:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'is' otherlv_5= 'ended' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            // InternalMyDsl.g:515:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'is' otherlv_5= 'ended' (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            {
            // InternalMyDsl.g:515:3: ()
            // InternalMyDsl.g:516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionEndAccess().getActionEndAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:522:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:523:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:523:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:524:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionEndAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getActionEndAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:545:3: ( ( ruleEString ) )
            // InternalMyDsl.g:546:4: ( ruleEString )
            {
            // InternalMyDsl.g:546:4: ( ruleEString )
            // InternalMyDsl.g:547:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionEndAccess().getActionActionCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getActionEndAccess().getIsKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getActionEndAccess().getEndedKeyword_5());
            		
            // InternalMyDsl.g:569:3: (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:570:4: otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionEndAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalMyDsl.g:574:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalMyDsl.g:575:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:575:5: (lv_description_7_0= ruleEString )
                    // InternalMyDsl.g:576:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionEndAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionEndRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionEndAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEnd"


    // $ANTLR start "entryRuleLocationEvent"
    // InternalMyDsl.g:602:1: entryRuleLocationEvent returns [EObject current=null] : iv_ruleLocationEvent= ruleLocationEvent EOF ;
    public final EObject entryRuleLocationEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationEvent = null;


        try {
            // InternalMyDsl.g:602:54: (iv_ruleLocationEvent= ruleLocationEvent EOF )
            // InternalMyDsl.g:603:2: iv_ruleLocationEvent= ruleLocationEvent EOF
            {
             newCompositeNode(grammarAccess.getLocationEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationEvent=ruleLocationEvent();

            state._fsp--;

             current =iv_ruleLocationEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationEvent"


    // $ANTLR start "ruleLocationEvent"
    // InternalMyDsl.g:609:1: ruleLocationEvent returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'at loc' ( ( ruleEString ) ) (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleLocationEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:615:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'at loc' ( ( ruleEString ) ) (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? ) )
            // InternalMyDsl.g:616:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'at loc' ( ( ruleEString ) ) (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            {
            // InternalMyDsl.g:616:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'at loc' ( ( ruleEString ) ) (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )? )
            // InternalMyDsl.g:617:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'at loc' ( ( ruleEString ) ) (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            {
            // InternalMyDsl.g:617:3: ()
            // InternalMyDsl.g:618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationEventAccess().getLocationEventAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:624:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:625:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:625:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:626:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationEventAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationEventAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:647:3: ( ( ruleEString ) )
            // InternalMyDsl.g:648:4: ( ruleEString )
            {
            // InternalMyDsl.g:648:4: ( ruleEString )
            // InternalMyDsl.g:649:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLocationEventAccess().getRobotsRobotsCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationEventAccess().getAtLocKeyword_4());
            		
            // InternalMyDsl.g:667:3: ( ( ruleEString ) )
            // InternalMyDsl.g:668:4: ( ruleEString )
            {
            // InternalMyDsl.g:668:4: ( ruleEString )
            // InternalMyDsl.g:669:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLocationEventAccess().getLocationLocationCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:683:3: (otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:684:4: otherlv_6= '(' ( (lv_description_7_0= ruleEString ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getLocationEventAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalMyDsl.g:688:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalMyDsl.g:689:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:689:5: (lv_description_7_0= ruleEString )
                    // InternalMyDsl.g:690:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLocationEventAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationEventRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getLocationEventAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationEvent"


    // $ANTLR start "entryRuleLocation"
    // InternalMyDsl.g:716:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalMyDsl.g:716:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalMyDsl.g:717:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalMyDsl.g:723:1: ruleLocation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:729:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:730:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:730:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:731:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:731:3: ()
            // InternalMyDsl.g:732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:738:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:739:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:739:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:740:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:761:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:761:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:762:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:768:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:774:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:775:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:775:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:776:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:776:3: ()
            // InternalMyDsl.g:777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:783:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:784:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:784:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:785:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleRobots"
    // InternalMyDsl.g:806:1: entryRuleRobots returns [EObject current=null] : iv_ruleRobots= ruleRobots EOF ;
    public final EObject entryRuleRobots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobots = null;


        try {
            // InternalMyDsl.g:806:47: (iv_ruleRobots= ruleRobots EOF )
            // InternalMyDsl.g:807:2: iv_ruleRobots= ruleRobots EOF
            {
             newCompositeNode(grammarAccess.getRobotsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobots=ruleRobots();

            state._fsp--;

             current =iv_ruleRobots; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobots"


    // $ANTLR start "ruleRobots"
    // InternalMyDsl.g:813:1: ruleRobots returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRobots() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:819:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:820:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:820:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:821:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:821:3: ()
            // InternalMyDsl.g:822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotsAccess().getRobotsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:828:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:829:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:829:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:830:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotsAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobots"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:851:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:851:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:852:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:858:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:864:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:865:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:865:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:866:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:874:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTopMissions"
    // InternalMyDsl.g:885:1: entryRuleTopMissions returns [EObject current=null] : iv_ruleTopMissions= ruleTopMissions EOF ;
    public final EObject entryRuleTopMissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopMissions = null;


        try {
            // InternalMyDsl.g:885:52: (iv_ruleTopMissions= ruleTopMissions EOF )
            // InternalMyDsl.g:886:2: iv_ruleTopMissions= ruleTopMissions EOF
            {
             newCompositeNode(grammarAccess.getTopMissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopMissions=ruleTopMissions();

            state._fsp--;

             current =iv_ruleTopMissions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopMissions"


    // $ANTLR start "ruleTopMissions"
    // InternalMyDsl.g:892:1: ruleTopMissions returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_mission_2_0= ruleMissions ) ) ) ;
    public final EObject ruleTopMissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_mission_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:898:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_mission_2_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:899:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_mission_2_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:899:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_mission_2_0= ruleMissions ) ) )
            // InternalMyDsl.g:900:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_mission_2_0= ruleMissions ) )
            {
            // InternalMyDsl.g:900:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:901:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:901:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:902:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopMissionsAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopMissionsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTopMissionsAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:923:3: ( (lv_mission_2_0= ruleMissions ) )
            // InternalMyDsl.g:924:4: (lv_mission_2_0= ruleMissions )
            {
            // InternalMyDsl.g:924:4: (lv_mission_2_0= ruleMissions )
            // InternalMyDsl.g:925:5: lv_mission_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getTopMissionsAccess().getMissionMissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_mission_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopMissionsRule());
            					}
            					set(
            						current,
            						"mission",
            						lv_mission_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopMissions"


    // $ANTLR start "entryRuleMissions"
    // InternalMyDsl.g:946:1: entryRuleMissions returns [EObject current=null] : iv_ruleMissions= ruleMissions EOF ;
    public final EObject entryRuleMissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissions = null;


        try {
            // InternalMyDsl.g:946:49: (iv_ruleMissions= ruleMissions EOF )
            // InternalMyDsl.g:947:2: iv_ruleMissions= ruleMissions EOF
            {
             newCompositeNode(grammarAccess.getMissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissions=ruleMissions();

            state._fsp--;

             current =iv_ruleMissions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMissions"


    // $ANTLR start "ruleMissions"
    // InternalMyDsl.g:953:1: ruleMissions returns [EObject current=null] : (this_ShallMissions_0= ruleShallMissions | this_ComplexMissions_1= ruleComplexMissions | this_ElementaryPatterns_2= ruleElementaryPatterns | this_CompositePatterns_3= ruleCompositePatterns ) ;
    public final EObject ruleMissions() throws RecognitionException {
        EObject current = null;

        EObject this_ShallMissions_0 = null;

        EObject this_ComplexMissions_1 = null;

        EObject this_ElementaryPatterns_2 = null;

        EObject this_CompositePatterns_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( (this_ShallMissions_0= ruleShallMissions | this_ComplexMissions_1= ruleComplexMissions | this_ElementaryPatterns_2= ruleElementaryPatterns | this_CompositePatterns_3= ruleCompositePatterns ) )
            // InternalMyDsl.g:960:2: (this_ShallMissions_0= ruleShallMissions | this_ComplexMissions_1= ruleComplexMissions | this_ElementaryPatterns_2= ruleElementaryPatterns | this_CompositePatterns_3= ruleCompositePatterns )
            {
            // InternalMyDsl.g:960:2: (this_ShallMissions_0= ruleShallMissions | this_ComplexMissions_1= ruleComplexMissions | this_ElementaryPatterns_2= ruleElementaryPatterns | this_CompositePatterns_3= ruleCompositePatterns )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_ID:
                case 25:
                case 30:
                case 57:
                case 58:
                case 59:
                case 65:
                case 67:
                case 70:
                case 71:
                case 72:
                case 74:
                case 76:
                case 80:
                case 82:
                case 83:
                case 87:
                    {
                    alt16=4;
                    }
                    break;
                case 29:
                    {
                    alt16=1;
                    }
                    break;
                case 40:
                case 41:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                    {
                    alt16=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt16=1;
                    }
                    break;
                case 40:
                case 41:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                    {
                    alt16=3;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case 25:
                case 30:
                case 57:
                case 58:
                case 59:
                case 65:
                case 67:
                case 70:
                case 71:
                case 72:
                case 74:
                case 76:
                case 80:
                case 82:
                case 83:
                case 87:
                    {
                    alt16=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

                }
                break;
            case 25:
            case 30:
                {
                alt16=2;
                }
                break;
            case 57:
            case 58:
            case 59:
                {
                alt16=3;
                }
                break;
            case 65:
            case 67:
            case 70:
            case 71:
            case 72:
            case 74:
            case 76:
            case 80:
            case 83:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:961:3: this_ShallMissions_0= ruleShallMissions
                    {

                    			newCompositeNode(grammarAccess.getMissionsAccess().getShallMissionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShallMissions_0=ruleShallMissions();

                    state._fsp--;


                    			current = this_ShallMissions_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:970:3: this_ComplexMissions_1= ruleComplexMissions
                    {

                    			newCompositeNode(grammarAccess.getMissionsAccess().getComplexMissionsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexMissions_1=ruleComplexMissions();

                    state._fsp--;


                    			current = this_ComplexMissions_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:979:3: this_ElementaryPatterns_2= ruleElementaryPatterns
                    {

                    			newCompositeNode(grammarAccess.getMissionsAccess().getElementaryPatternsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementaryPatterns_2=ruleElementaryPatterns();

                    state._fsp--;


                    			current = this_ElementaryPatterns_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:988:3: this_CompositePatterns_3= ruleCompositePatterns
                    {

                    			newCompositeNode(grammarAccess.getMissionsAccess().getCompositePatternsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositePatterns_3=ruleCompositePatterns();

                    state._fsp--;


                    			current = this_CompositePatterns_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissions"


    // $ANTLR start "entryRuleMissionOperation"
    // InternalMyDsl.g:1000:1: entryRuleMissionOperation returns [EObject current=null] : iv_ruleMissionOperation= ruleMissionOperation EOF ;
    public final EObject entryRuleMissionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionOperation = null;


        try {
            // InternalMyDsl.g:1000:57: (iv_ruleMissionOperation= ruleMissionOperation EOF )
            // InternalMyDsl.g:1001:2: iv_ruleMissionOperation= ruleMissionOperation EOF
            {
             newCompositeNode(grammarAccess.getMissionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionOperation=ruleMissionOperation();

            state._fsp--;

             current =iv_ruleMissionOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMissionOperation"


    // $ANTLR start "ruleMissionOperation"
    // InternalMyDsl.g:1007:1: ruleMissionOperation returns [EObject current=null] : (this_Negation_0= ruleNegation | this_Composition_1= ruleComposition ) ;
    public final EObject ruleMissionOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_Composition_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1013:2: ( (this_Negation_0= ruleNegation | this_Composition_1= ruleComposition ) )
            // InternalMyDsl.g:1014:2: (this_Negation_0= ruleNegation | this_Composition_1= ruleComposition )
            {
            // InternalMyDsl.g:1014:2: (this_Negation_0= ruleNegation | this_Composition_1= ruleComposition )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1015:3: this_Negation_0= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getMissionOperationAccess().getNegationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_0=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1024:3: this_Composition_1= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getMissionOperationAccess().getCompositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_1=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissionOperation"


    // $ANTLR start "entryRuleShallMissions"
    // InternalMyDsl.g:1036:1: entryRuleShallMissions returns [EObject current=null] : iv_ruleShallMissions= ruleShallMissions EOF ;
    public final EObject entryRuleShallMissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShallMissions = null;


        try {
            // InternalMyDsl.g:1036:54: (iv_ruleShallMissions= ruleShallMissions EOF )
            // InternalMyDsl.g:1037:2: iv_ruleShallMissions= ruleShallMissions EOF
            {
             newCompositeNode(grammarAccess.getShallMissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShallMissions=ruleShallMissions();

            state._fsp--;

             current =iv_ruleShallMissions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShallMissions"


    // $ANTLR start "ruleShallMissions"
    // InternalMyDsl.g:1043:1: ruleShallMissions returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'shall' ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) ) ) ;
    public final EObject ruleShallMissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_movementPatterns_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1049:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'shall' ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) ) ) )
            // InternalMyDsl.g:1050:2: ( () ( ( ruleEString ) ) otherlv_2= 'shall' ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) ) )
            {
            // InternalMyDsl.g:1050:2: ( () ( ( ruleEString ) ) otherlv_2= 'shall' ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) ) )
            // InternalMyDsl.g:1051:3: () ( ( ruleEString ) ) otherlv_2= 'shall' ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) )
            {
            // InternalMyDsl.g:1051:3: ()
            // InternalMyDsl.g:1052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShallMissionsAccess().getShallMissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1058:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1059:4: ( ruleEString )
            {
            // InternalMyDsl.g:1059:4: ( ruleEString )
            // InternalMyDsl.g:1060:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShallMissionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getShallMissionsAccess().getRobotsRobotsCrossReference_1_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getShallMissionsAccess().getShallKeyword_2());
            		
            // InternalMyDsl.g:1078:3: ( (lv_movementPatterns_3_0= ruleSpecificationPatterns ) )
            // InternalMyDsl.g:1079:4: (lv_movementPatterns_3_0= ruleSpecificationPatterns )
            {
            // InternalMyDsl.g:1079:4: (lv_movementPatterns_3_0= ruleSpecificationPatterns )
            // InternalMyDsl.g:1080:5: lv_movementPatterns_3_0= ruleSpecificationPatterns
            {

            					newCompositeNode(grammarAccess.getShallMissionsAccess().getMovementPatternsSpecificationPatternsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_movementPatterns_3_0=ruleSpecificationPatterns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShallMissionsRule());
            					}
            					set(
            						current,
            						"movementPatterns",
            						lv_movementPatterns_3_0,
            						"org.xtext.example.mydsl.MyDsl.SpecificationPatterns");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShallMissions"


    // $ANTLR start "entryRuleComplexMissions"
    // InternalMyDsl.g:1101:1: entryRuleComplexMissions returns [EObject current=null] : iv_ruleComplexMissions= ruleComplexMissions EOF ;
    public final EObject entryRuleComplexMissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMissions = null;


        try {
            // InternalMyDsl.g:1101:56: (iv_ruleComplexMissions= ruleComplexMissions EOF )
            // InternalMyDsl.g:1102:2: iv_ruleComplexMissions= ruleComplexMissions EOF
            {
             newCompositeNode(grammarAccess.getComplexMissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexMissions=ruleComplexMissions();

            state._fsp--;

             current =iv_ruleComplexMissions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexMissions"


    // $ANTLR start "ruleComplexMissions"
    // InternalMyDsl.g:1108:1: ruleComplexMissions returns [EObject current=null] : ( () ( (lv_composition_1_0= ruleMissionOperation ) ) ) ;
    public final EObject ruleComplexMissions() throws RecognitionException {
        EObject current = null;

        EObject lv_composition_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1114:2: ( ( () ( (lv_composition_1_0= ruleMissionOperation ) ) ) )
            // InternalMyDsl.g:1115:2: ( () ( (lv_composition_1_0= ruleMissionOperation ) ) )
            {
            // InternalMyDsl.g:1115:2: ( () ( (lv_composition_1_0= ruleMissionOperation ) ) )
            // InternalMyDsl.g:1116:3: () ( (lv_composition_1_0= ruleMissionOperation ) )
            {
            // InternalMyDsl.g:1116:3: ()
            // InternalMyDsl.g:1117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexMissionsAccess().getComplexMissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1123:3: ( (lv_composition_1_0= ruleMissionOperation ) )
            // InternalMyDsl.g:1124:4: (lv_composition_1_0= ruleMissionOperation )
            {
            // InternalMyDsl.g:1124:4: (lv_composition_1_0= ruleMissionOperation )
            // InternalMyDsl.g:1125:5: lv_composition_1_0= ruleMissionOperation
            {

            					newCompositeNode(grammarAccess.getComplexMissionsAccess().getCompositionMissionOperationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_composition_1_0=ruleMissionOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMissionsRule());
            					}
            					set(
            						current,
            						"composition",
            						lv_composition_1_0,
            						"org.xtext.example.mydsl.MyDsl.MissionOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexMissions"


    // $ANTLR start "entryRuleNegation"
    // InternalMyDsl.g:1146:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMyDsl.g:1146:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMyDsl.g:1147:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMyDsl.g:1153:1: ruleNegation returns [EObject current=null] : ( () otherlv_1= 'not' otherlv_2= '(' ( (lv_not_3_0= ruleMissions ) ) otherlv_4= ')' ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_not_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1159:2: ( ( () otherlv_1= 'not' otherlv_2= '(' ( (lv_not_3_0= ruleMissions ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1160:2: ( () otherlv_1= 'not' otherlv_2= '(' ( (lv_not_3_0= ruleMissions ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1160:2: ( () otherlv_1= 'not' otherlv_2= '(' ( (lv_not_3_0= ruleMissions ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1161:3: () otherlv_1= 'not' otherlv_2= '(' ( (lv_not_3_0= ruleMissions ) ) otherlv_4= ')'
            {
            // InternalMyDsl.g:1161:3: ()
            // InternalMyDsl.g:1162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegationAccess().getNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getNegationAccess().getNotKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getNegationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1176:3: ( (lv_not_3_0= ruleMissions ) )
            // InternalMyDsl.g:1177:4: (lv_not_3_0= ruleMissions )
            {
            // InternalMyDsl.g:1177:4: (lv_not_3_0= ruleMissions )
            // InternalMyDsl.g:1178:5: lv_not_3_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getNotMissionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_not_3_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"not",
            						lv_not_3_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNegationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleComposition"
    // InternalMyDsl.g:1203:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalMyDsl.g:1203:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalMyDsl.g:1204:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMyDsl.g:1210:1: ruleComposition returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_miss1_2_0= ruleMissions ) ) otherlv_3= ')' ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) ) otherlv_5= '(' ( (lv_miss2_6_0= ruleMissions ) ) otherlv_7= ')' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_binaryType_4_1=null;
        Token lv_binaryType_4_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_miss1_2_0 = null;

        EObject lv_miss2_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1216:2: ( ( () otherlv_1= '(' ( (lv_miss1_2_0= ruleMissions ) ) otherlv_3= ')' ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) ) otherlv_5= '(' ( (lv_miss2_6_0= ruleMissions ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:1217:2: ( () otherlv_1= '(' ( (lv_miss1_2_0= ruleMissions ) ) otherlv_3= ')' ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) ) otherlv_5= '(' ( (lv_miss2_6_0= ruleMissions ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:1217:2: ( () otherlv_1= '(' ( (lv_miss1_2_0= ruleMissions ) ) otherlv_3= ')' ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) ) otherlv_5= '(' ( (lv_miss2_6_0= ruleMissions ) ) otherlv_7= ')' )
            // InternalMyDsl.g:1218:3: () otherlv_1= '(' ( (lv_miss1_2_0= ruleMissions ) ) otherlv_3= ')' ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) ) otherlv_5= '(' ( (lv_miss2_6_0= ruleMissions ) ) otherlv_7= ')'
            {
            // InternalMyDsl.g:1218:3: ()
            // InternalMyDsl.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositionAccess().getCompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1229:3: ( (lv_miss1_2_0= ruleMissions ) )
            // InternalMyDsl.g:1230:4: (lv_miss1_2_0= ruleMissions )
            {
            // InternalMyDsl.g:1230:4: (lv_miss1_2_0= ruleMissions )
            // InternalMyDsl.g:1231:5: lv_miss1_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMiss1MissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_miss1_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"miss1",
            						lv_miss1_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1252:3: ( ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) ) )
            // InternalMyDsl.g:1253:4: ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) )
            {
            // InternalMyDsl.g:1253:4: ( (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' ) )
            // InternalMyDsl.g:1254:5: (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' )
            {
            // InternalMyDsl.g:1254:5: (lv_binaryType_4_1= 'and' | lv_binaryType_4_2= 'or' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1255:6: lv_binaryType_4_1= 'and'
                    {
                    lv_binaryType_4_1=(Token)match(input,31,FOLLOW_22); 

                    						newLeafNode(lv_binaryType_4_1, grammarAccess.getCompositionAccess().getBinaryTypeAndKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionRule());
                    						}
                    						setWithLastConsumed(current, "binaryType", lv_binaryType_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1266:6: lv_binaryType_4_2= 'or'
                    {
                    lv_binaryType_4_2=(Token)match(input,32,FOLLOW_22); 

                    						newLeafNode(lv_binaryType_4_2, grammarAccess.getCompositionAccess().getBinaryTypeOrKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionRule());
                    						}
                    						setWithLastConsumed(current, "binaryType", lv_binaryType_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMyDsl.g:1283:3: ( (lv_miss2_6_0= ruleMissions ) )
            // InternalMyDsl.g:1284:4: (lv_miss2_6_0= ruleMissions )
            {
            // InternalMyDsl.g:1284:4: (lv_miss2_6_0= ruleMissions )
            // InternalMyDsl.g:1285:5: lv_miss2_6_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMiss2MissionsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_miss2_6_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"miss2",
            						lv_miss2_6_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleSpecificationPatterns"
    // InternalMyDsl.g:1310:1: entryRuleSpecificationPatterns returns [EObject current=null] : iv_ruleSpecificationPatterns= ruleSpecificationPatterns EOF ;
    public final EObject entryRuleSpecificationPatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationPatterns = null;


        try {
            // InternalMyDsl.g:1310:62: (iv_ruleSpecificationPatterns= ruleSpecificationPatterns EOF )
            // InternalMyDsl.g:1311:2: iv_ruleSpecificationPatterns= ruleSpecificationPatterns EOF
            {
             newCompositeNode(grammarAccess.getSpecificationPatternsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificationPatterns=ruleSpecificationPatterns();

            state._fsp--;

             current =iv_ruleSpecificationPatterns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificationPatterns"


    // $ANTLR start "ruleSpecificationPatterns"
    // InternalMyDsl.g:1317:1: ruleSpecificationPatterns returns [EObject current=null] : (this_Visit1_0= ruleVisit1 | this_Patrol_1= rulePatrol | this_AvoidanceVisit_2= ruleAvoidanceVisit | this_React_3= ruleReact | this_Counteract_4= ruleCounteract | this_Wait_5= ruleWait ) ;
    public final EObject ruleSpecificationPatterns() throws RecognitionException {
        EObject current = null;

        EObject this_Visit1_0 = null;

        EObject this_Patrol_1 = null;

        EObject this_AvoidanceVisit_2 = null;

        EObject this_React_3 = null;

        EObject this_Counteract_4 = null;

        EObject this_Wait_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1323:2: ( (this_Visit1_0= ruleVisit1 | this_Patrol_1= rulePatrol | this_AvoidanceVisit_2= ruleAvoidanceVisit | this_React_3= ruleReact | this_Counteract_4= ruleCounteract | this_Wait_5= ruleWait ) )
            // InternalMyDsl.g:1324:2: (this_Visit1_0= ruleVisit1 | this_Patrol_1= rulePatrol | this_AvoidanceVisit_2= ruleAvoidanceVisit | this_React_3= ruleReact | this_Counteract_4= ruleCounteract | this_Wait_5= ruleWait )
            {
            // InternalMyDsl.g:1324:2: (this_Visit1_0= ruleVisit1 | this_Patrol_1= rulePatrol | this_AvoidanceVisit_2= ruleAvoidanceVisit | this_React_3= ruleReact | this_Counteract_4= ruleCounteract | this_Wait_5= ruleWait )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=RULE_STRING && LA19_1<=RULE_ID)||(LA19_1>=34 && LA19_1<=37)) ) {
                    alt19=1;
                }
                else if ( ((LA19_1>=39 && LA19_1<=41)) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            case 46:
                {
                alt19=4;
                }
                break;
            case 54:
                {
                alt19=5;
                }
                break;
            case 56:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1325:3: this_Visit1_0= ruleVisit1
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getVisit1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visit1_0=ruleVisit1();

                    state._fsp--;


                    			current = this_Visit1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1334:3: this_Patrol_1= rulePatrol
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getPatrolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Patrol_1=rulePatrol();

                    state._fsp--;


                    			current = this_Patrol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1343:3: this_AvoidanceVisit_2= ruleAvoidanceVisit
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getAvoidanceVisitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AvoidanceVisit_2=ruleAvoidanceVisit();

                    state._fsp--;


                    			current = this_AvoidanceVisit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1352:3: this_React_3= ruleReact
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getReactParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_React_3=ruleReact();

                    state._fsp--;


                    			current = this_React_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1361:3: this_Counteract_4= ruleCounteract
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getCounteractParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Counteract_4=ruleCounteract();

                    state._fsp--;


                    			current = this_Counteract_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1370:3: this_Wait_5= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getSpecificationPatternsAccess().getWaitParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_5=ruleWait();

                    state._fsp--;


                    			current = this_Wait_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificationPatterns"


    // $ANTLR start "entryRuleVisit1"
    // InternalMyDsl.g:1382:1: entryRuleVisit1 returns [EObject current=null] : iv_ruleVisit1= ruleVisit1 EOF ;
    public final EObject entryRuleVisit1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit1 = null;


        try {
            // InternalMyDsl.g:1382:47: (iv_ruleVisit1= ruleVisit1 EOF )
            // InternalMyDsl.g:1383:2: iv_ruleVisit1= ruleVisit1 EOF
            {
             newCompositeNode(grammarAccess.getVisit1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisit1=ruleVisit1();

            state._fsp--;

             current =iv_ruleVisit1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisit1"


    // $ANTLR start "ruleVisit1"
    // InternalMyDsl.g:1389:1: ruleVisit1 returns [EObject current=null] : ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleVisit1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1395:2: ( ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:1396:2: ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:1396:2: ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:1397:3: () otherlv_1= 'visit' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:1397:3: ()
            // InternalMyDsl.g:1398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisit1Access().getVisit1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getVisit1Access().getVisitKeyword_1());
            		
            // InternalMyDsl.g:1408:3: ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=34 && LA21_0<=37)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1409:4: ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) )
                    {
                    // InternalMyDsl.g:1409:4: ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) )
                    // InternalMyDsl.g:1410:5: (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' )
                    {
                    // InternalMyDsl.g:1410:5: (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt20=1;
                        }
                        break;
                    case 35:
                        {
                        alt20=2;
                        }
                        break;
                    case 36:
                        {
                        alt20=3;
                        }
                        break;
                    case 37:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:1411:6: lv_type_2_1= 'in sequence'
                            {
                            lv_type_2_1=(Token)match(input,34,FOLLOW_6); 

                            						newLeafNode(lv_type_2_1, grammarAccess.getVisit1Access().getTypeInSequenceKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisit1Rule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1422:6: lv_type_2_2= 'in order'
                            {
                            lv_type_2_2=(Token)match(input,35,FOLLOW_6); 

                            						newLeafNode(lv_type_2_2, grammarAccess.getVisit1Access().getTypeInOrderKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisit1Rule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1433:6: lv_type_2_3= 'in strict order'
                            {
                            lv_type_2_3=(Token)match(input,36,FOLLOW_6); 

                            						newLeafNode(lv_type_2_3, grammarAccess.getVisit1Access().getTypeInStrictOrderKeyword_2_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisit1Rule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:1444:6: lv_type_2_4= 'fairly'
                            {
                            lv_type_2_4=(Token)match(input,37,FOLLOW_6); 

                            						newLeafNode(lv_type_2_4, grammarAccess.getVisit1Access().getTypeFairlyKeyword_2_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisit1Rule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_4, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1457:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1458:4: ( ruleEString )
            {
            // InternalMyDsl.g:1458:4: ( ruleEString )
            // InternalMyDsl.g:1459:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisit1Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getVisit1Access().getLocationsLocationCrossReference_3_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1473:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1474:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVisit1Access().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1478:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1479:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1479:5: ( ruleEString )
            	    // InternalMyDsl.g:1480:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisit1Rule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getVisit1Access().getLocationsLocationCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisit1"


    // $ANTLR start "entryRulePatrol"
    // InternalMyDsl.g:1499:1: entryRulePatrol returns [EObject current=null] : iv_rulePatrol= rulePatrol EOF ;
    public final EObject entryRulePatrol() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatrol = null;


        try {
            // InternalMyDsl.g:1499:47: (iv_rulePatrol= rulePatrol EOF )
            // InternalMyDsl.g:1500:2: iv_rulePatrol= rulePatrol EOF
            {
             newCompositeNode(grammarAccess.getPatrolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatrol=rulePatrol();

            state._fsp--;

             current =iv_rulePatrol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatrol"


    // $ANTLR start "rulePatrol"
    // InternalMyDsl.g:1506:1: rulePatrol returns [EObject current=null] : ( () otherlv_1= 'patrol' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject rulePatrol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1512:2: ( ( () otherlv_1= 'patrol' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:1513:2: ( () otherlv_1= 'patrol' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:1513:2: ( () otherlv_1= 'patrol' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:1514:3: () otherlv_1= 'patrol' ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )? ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:1514:3: ()
            // InternalMyDsl.g:1515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatrolAccess().getPatrolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPatrolAccess().getPatrolKeyword_1());
            		
            // InternalMyDsl.g:1525:3: ( ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=34 && LA24_0<=37)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1526:4: ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) )
                    {
                    // InternalMyDsl.g:1526:4: ( (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' ) )
                    // InternalMyDsl.g:1527:5: (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' )
                    {
                    // InternalMyDsl.g:1527:5: (lv_type_2_1= 'in sequence' | lv_type_2_2= 'in order' | lv_type_2_3= 'in strict order' | lv_type_2_4= 'fairly' )
                    int alt23=4;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt23=1;
                        }
                        break;
                    case 35:
                        {
                        alt23=2;
                        }
                        break;
                    case 36:
                        {
                        alt23=3;
                        }
                        break;
                    case 37:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:1528:6: lv_type_2_1= 'in sequence'
                            {
                            lv_type_2_1=(Token)match(input,34,FOLLOW_6); 

                            						newLeafNode(lv_type_2_1, grammarAccess.getPatrolAccess().getTypeInSequenceKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPatrolRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1539:6: lv_type_2_2= 'in order'
                            {
                            lv_type_2_2=(Token)match(input,35,FOLLOW_6); 

                            						newLeafNode(lv_type_2_2, grammarAccess.getPatrolAccess().getTypeInOrderKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPatrolRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1550:6: lv_type_2_3= 'in strict order'
                            {
                            lv_type_2_3=(Token)match(input,36,FOLLOW_6); 

                            						newLeafNode(lv_type_2_3, grammarAccess.getPatrolAccess().getTypeInStrictOrderKeyword_2_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPatrolRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:1561:6: lv_type_2_4= 'fairly'
                            {
                            lv_type_2_4=(Token)match(input,37,FOLLOW_6); 

                            						newLeafNode(lv_type_2_4, grammarAccess.getPatrolAccess().getTypeFairlyKeyword_2_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPatrolRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_2_4, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1574:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1575:4: ( ruleEString )
            {
            // InternalMyDsl.g:1575:4: ( ruleEString )
            // InternalMyDsl.g:1576:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatrolRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPatrolAccess().getLocationsLocationCrossReference_3_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1590:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1591:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPatrolAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1595:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1596:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1596:5: ( ruleEString )
            	    // InternalMyDsl.g:1597:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPatrolRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPatrolAccess().getLocationsLocationCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatrol"


    // $ANTLR start "entryRuleAvoidanceVisit"
    // InternalMyDsl.g:1616:1: entryRuleAvoidanceVisit returns [EObject current=null] : iv_ruleAvoidanceVisit= ruleAvoidanceVisit EOF ;
    public final EObject entryRuleAvoidanceVisit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoidanceVisit = null;


        try {
            // InternalMyDsl.g:1616:55: (iv_ruleAvoidanceVisit= ruleAvoidanceVisit EOF )
            // InternalMyDsl.g:1617:2: iv_ruleAvoidanceVisit= ruleAvoidanceVisit EOF
            {
             newCompositeNode(grammarAccess.getAvoidanceVisitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvoidanceVisit=ruleAvoidanceVisit();

            state._fsp--;

             current =iv_ruleAvoidanceVisit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvoidanceVisit"


    // $ANTLR start "ruleAvoidanceVisit"
    // InternalMyDsl.g:1623:1: ruleAvoidanceVisit returns [EObject current=null] : (this_Visit2_0= ruleVisit2 | this_Avoid_1= ruleAvoid ) ;
    public final EObject ruleAvoidanceVisit() throws RecognitionException {
        EObject current = null;

        EObject this_Visit2_0 = null;

        EObject this_Avoid_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1629:2: ( (this_Visit2_0= ruleVisit2 | this_Avoid_1= ruleAvoid ) )
            // InternalMyDsl.g:1630:2: (this_Visit2_0= ruleVisit2 | this_Avoid_1= ruleAvoid )
            {
            // InternalMyDsl.g:1630:2: (this_Visit2_0= ruleVisit2 | this_Avoid_1= ruleAvoid )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1631:3: this_Visit2_0= ruleVisit2
                    {

                    			newCompositeNode(grammarAccess.getAvoidanceVisitAccess().getVisit2ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visit2_0=ruleVisit2();

                    state._fsp--;


                    			current = this_Visit2_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1640:3: this_Avoid_1= ruleAvoid
                    {

                    			newCompositeNode(grammarAccess.getAvoidanceVisitAccess().getAvoidParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avoid_1=ruleAvoid();

                    state._fsp--;


                    			current = this_Avoid_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvoidanceVisit"


    // $ANTLR start "entryRuleVisit2"
    // InternalMyDsl.g:1652:1: entryRuleVisit2 returns [EObject current=null] : iv_ruleVisit2= ruleVisit2 EOF ;
    public final EObject entryRuleVisit2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisit2 = null;


        try {
            // InternalMyDsl.g:1652:47: (iv_ruleVisit2= ruleVisit2 EOF )
            // InternalMyDsl.g:1653:2: iv_ruleVisit2= ruleVisit2 EOF
            {
             newCompositeNode(grammarAccess.getVisit2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisit2=ruleVisit2();

            state._fsp--;

             current =iv_ruleVisit2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisit2"


    // $ANTLR start "ruleVisit2"
    // InternalMyDsl.g:1659:1: ruleVisit2 returns [EObject current=null] : ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) ) ( (lv_number_3_0= ruleEInt ) ) otherlv_4= 'times' ( ( ruleEString ) ) ) ;
    public final EObject ruleVisit2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1665:2: ( ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) ) ( (lv_number_3_0= ruleEInt ) ) otherlv_4= 'times' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:1666:2: ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) ) ( (lv_number_3_0= ruleEInt ) ) otherlv_4= 'times' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:1666:2: ( () otherlv_1= 'visit' ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) ) ( (lv_number_3_0= ruleEInt ) ) otherlv_4= 'times' ( ( ruleEString ) ) )
            // InternalMyDsl.g:1667:3: () otherlv_1= 'visit' ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) ) ( (lv_number_3_0= ruleEInt ) ) otherlv_4= 'times' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1667:3: ()
            // InternalMyDsl.g:1668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisit2Access().getVisit2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getVisit2Access().getVisitKeyword_1());
            		
            // InternalMyDsl.g:1678:3: ( ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) ) )
            // InternalMyDsl.g:1679:4: ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) )
            {
            // InternalMyDsl.g:1679:4: ( (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' ) )
            // InternalMyDsl.g:1680:5: (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' )
            {
            // InternalMyDsl.g:1680:5: (lv_type_2_1= 'more than' | lv_type_2_2= 'less than' | lv_type_2_3= 'exactly' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt27=1;
                }
                break;
            case 40:
                {
                alt27=2;
                }
                break;
            case 41:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1681:6: lv_type_2_1= 'more than'
                    {
                    lv_type_2_1=(Token)match(input,39,FOLLOW_27); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getVisit2Access().getTypeMoreThanKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisit2Rule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1692:6: lv_type_2_2= 'less than'
                    {
                    lv_type_2_2=(Token)match(input,40,FOLLOW_27); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getVisit2Access().getTypeLessThanKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisit2Rule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1703:6: lv_type_2_3= 'exactly'
                    {
                    lv_type_2_3=(Token)match(input,41,FOLLOW_27); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getVisit2Access().getTypeExactlyKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisit2Rule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:1716:3: ( (lv_number_3_0= ruleEInt ) )
            // InternalMyDsl.g:1717:4: (lv_number_3_0= ruleEInt )
            {
            // InternalMyDsl.g:1717:4: (lv_number_3_0= ruleEInt )
            // InternalMyDsl.g:1718:5: lv_number_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVisit2Access().getNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisit2Rule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getVisit2Access().getTimesKeyword_4());
            		
            // InternalMyDsl.g:1739:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1740:4: ( ruleEString )
            {
            // InternalMyDsl.g:1740:4: ( ruleEString )
            // InternalMyDsl.g:1741:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisit2Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getVisit2Access().getLocationsLocationCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisit2"


    // $ANTLR start "entryRuleAvoid"
    // InternalMyDsl.g:1759:1: entryRuleAvoid returns [EObject current=null] : iv_ruleAvoid= ruleAvoid EOF ;
    public final EObject entryRuleAvoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvoid = null;


        try {
            // InternalMyDsl.g:1759:46: (iv_ruleAvoid= ruleAvoid EOF )
            // InternalMyDsl.g:1760:2: iv_ruleAvoid= ruleAvoid EOF
            {
             newCompositeNode(grammarAccess.getAvoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvoid=ruleAvoid();

            state._fsp--;

             current =iv_ruleAvoid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvoid"


    // $ANTLR start "ruleAvoid"
    // InternalMyDsl.g:1766:1: ruleAvoid returns [EObject current=null] : ( () otherlv_1= 'avoid' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )? ( ( ruleEString ) )? ) ;
    public final EObject ruleAvoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_type_5_1=null;
        Token lv_type_5_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1772:2: ( ( () otherlv_1= 'avoid' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )? ( ( ruleEString ) )? ) )
            // InternalMyDsl.g:1773:2: ( () otherlv_1= 'avoid' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )? ( ( ruleEString ) )? )
            {
            // InternalMyDsl.g:1773:2: ( () otherlv_1= 'avoid' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )? ( ( ruleEString ) )? )
            // InternalMyDsl.g:1774:3: () otherlv_1= 'avoid' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )? ( ( ruleEString ) )?
            {
            // InternalMyDsl.g:1774:3: ()
            // InternalMyDsl.g:1775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAvoidAccess().getAvoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAvoidAccess().getAvoidKeyword_1());
            		
            // InternalMyDsl.g:1785:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1786:4: ( ruleEString )
            {
            // InternalMyDsl.g:1786:4: ( ruleEString )
            // InternalMyDsl.g:1787:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvoidRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAvoidAccess().getLocationsLocationCrossReference_2_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1801:3: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1802:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAvoidAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1806:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1807:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1807:5: ( ruleEString )
            	    // InternalMyDsl.g:1808:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAvoidRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAvoidAccess().getLocationsLocationCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMyDsl.g:1823:3: ( ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=44 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1824:4: ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) )
                    {
                    // InternalMyDsl.g:1824:4: ( (lv_type_5_1= 'until' | lv_type_5_2= 'after' ) )
                    // InternalMyDsl.g:1825:5: (lv_type_5_1= 'until' | lv_type_5_2= 'after' )
                    {
                    // InternalMyDsl.g:1825:5: (lv_type_5_1= 'until' | lv_type_5_2= 'after' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==44) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==45) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:1826:6: lv_type_5_1= 'until'
                            {
                            lv_type_5_1=(Token)match(input,44,FOLLOW_30); 

                            						newLeafNode(lv_type_5_1, grammarAccess.getAvoidAccess().getTypeUntilKeyword_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAvoidRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_5_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1837:6: lv_type_5_2= 'after'
                            {
                            lv_type_5_2=(Token)match(input,45,FOLLOW_30); 

                            						newLeafNode(lv_type_5_2, grammarAccess.getAvoidAccess().getTypeAfterKeyword_4_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAvoidRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_5_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1850:3: ( ( ruleEString ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1851:4: ( ruleEString )
                    {
                    // InternalMyDsl.g:1851:4: ( ruleEString )
                    // InternalMyDsl.g:1852:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAvoidRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getAvoidAccess().getConditionConditionCrossReference_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvoid"


    // $ANTLR start "entryRuleReact"
    // InternalMyDsl.g:1870:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalMyDsl.g:1870:46: (iv_ruleReact= ruleReact EOF )
            // InternalMyDsl.g:1871:2: iv_ruleReact= ruleReact EOF
            {
             newCompositeNode(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReact=ruleReact();

            state._fsp--;

             current =iv_ruleReact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalMyDsl.g:1877:1: ruleReact returns [EObject current=null] : ( () otherlv_1= 'react' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'by' ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) ) ) ;
    public final EObject ruleReact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_pattern_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1883:2: ( ( () otherlv_1= 'react' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'by' ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) ) ) )
            // InternalMyDsl.g:1884:2: ( () otherlv_1= 'react' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'by' ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) ) )
            {
            // InternalMyDsl.g:1884:2: ( () otherlv_1= 'react' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'by' ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) ) )
            // InternalMyDsl.g:1885:3: () otherlv_1= 'react' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'by' ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) )
            {
            // InternalMyDsl.g:1885:3: ()
            // InternalMyDsl.g:1886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactAccess().getReactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getReactAccess().getReactKeyword_1());
            		
            // InternalMyDsl.g:1896:3: ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) ) )
            // InternalMyDsl.g:1897:4: ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) )
            {
            // InternalMyDsl.g:1897:4: ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' ) )
            // InternalMyDsl.g:1898:5: (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' )
            {
            // InternalMyDsl.g:1898:5: (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' | lv_type_2_3= 'promptly' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case 49:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1899:6: lv_type_2_1= 'instantly'
                    {
                    lv_type_2_1=(Token)match(input,47,FOLLOW_32); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getReactAccess().getTypeInstantlyKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1910:6: lv_type_2_2= 'with a delay'
                    {
                    lv_type_2_2=(Token)match(input,48,FOLLOW_32); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getReactAccess().getTypeWithADelayKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1921:6: lv_type_2_3= 'promptly'
                    {
                    lv_type_2_3=(Token)match(input,49,FOLLOW_32); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getReactAccess().getTypePromptlyKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getReactAccess().getToKeyword_3());
            		
            // InternalMyDsl.g:1938:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1939:4: ( ruleEString )
            {
            // InternalMyDsl.g:1939:4: ( ruleEString )
            // InternalMyDsl.g:1940:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReactAccess().getConditionConditionCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getReactAccess().getByKeyword_5());
            		
            // InternalMyDsl.g:1958:3: ( (otherlv_6= 'exec' ( ( ruleEString ) ) ) | ( (lv_pattern_8_0= ruleSpecificationPatterns ) ) | (otherlv_9= 'reach' ( ( ruleEString ) ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt33=1;
                }
                break;
            case 33:
            case 38:
            case 43:
            case 46:
            case 54:
            case 56:
                {
                alt33=2;
                }
                break;
            case 53:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1959:4: (otherlv_6= 'exec' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1959:4: (otherlv_6= 'exec' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1960:5: otherlv_6= 'exec' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getReactAccess().getExecKeyword_6_0_0());
                    				
                    // InternalMyDsl.g:1964:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1965:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1965:6: ( ruleEString )
                    // InternalMyDsl.g:1966:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReactRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReactAccess().getActionActionCrossReference_6_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1982:4: ( (lv_pattern_8_0= ruleSpecificationPatterns ) )
                    {
                    // InternalMyDsl.g:1982:4: ( (lv_pattern_8_0= ruleSpecificationPatterns ) )
                    // InternalMyDsl.g:1983:5: (lv_pattern_8_0= ruleSpecificationPatterns )
                    {
                    // InternalMyDsl.g:1983:5: (lv_pattern_8_0= ruleSpecificationPatterns )
                    // InternalMyDsl.g:1984:6: lv_pattern_8_0= ruleSpecificationPatterns
                    {

                    						newCompositeNode(grammarAccess.getReactAccess().getPatternSpecificationPatternsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pattern_8_0=ruleSpecificationPatterns();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactRule());
                    						}
                    						set(
                    							current,
                    							"pattern",
                    							lv_pattern_8_0,
                    							"org.xtext.example.mydsl.MyDsl.SpecificationPatterns");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2002:4: (otherlv_9= 'reach' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2002:4: (otherlv_9= 'reach' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2003:5: otherlv_9= 'reach' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getReactAccess().getReachKeyword_6_2_0());
                    				
                    // InternalMyDsl.g:2007:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2008:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2008:6: ( ruleEString )
                    // InternalMyDsl.g:2009:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReactRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReactAccess().getLocationsLocationCrossReference_6_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleCounteract"
    // InternalMyDsl.g:2029:1: entryRuleCounteract returns [EObject current=null] : iv_ruleCounteract= ruleCounteract EOF ;
    public final EObject entryRuleCounteract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounteract = null;


        try {
            // InternalMyDsl.g:2029:51: (iv_ruleCounteract= ruleCounteract EOF )
            // InternalMyDsl.g:2030:2: iv_ruleCounteract= ruleCounteract EOF
            {
             newCompositeNode(grammarAccess.getCounteractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounteract=ruleCounteract();

            state._fsp--;

             current =iv_ruleCounteract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCounteract"


    // $ANTLR start "ruleCounteract"
    // InternalMyDsl.g:2036:1: ruleCounteract returns [EObject current=null] : ( () otherlv_1= 'counteract' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) ) otherlv_3= 'when' otherlv_4= 'reach' ( ( ruleEString ) ) otherlv_6= 'by' ( ( ruleEString ) ) ) ;
    public final EObject ruleCounteract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2042:2: ( ( () otherlv_1= 'counteract' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) ) otherlv_3= 'when' otherlv_4= 'reach' ( ( ruleEString ) ) otherlv_6= 'by' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:2043:2: ( () otherlv_1= 'counteract' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) ) otherlv_3= 'when' otherlv_4= 'reach' ( ( ruleEString ) ) otherlv_6= 'by' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:2043:2: ( () otherlv_1= 'counteract' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) ) otherlv_3= 'when' otherlv_4= 'reach' ( ( ruleEString ) ) otherlv_6= 'by' ( ( ruleEString ) ) )
            // InternalMyDsl.g:2044:3: () otherlv_1= 'counteract' ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) ) otherlv_3= 'when' otherlv_4= 'reach' ( ( ruleEString ) ) otherlv_6= 'by' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2044:3: ()
            // InternalMyDsl.g:2045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCounteractAccess().getCounteractAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getCounteractAccess().getCounteractKeyword_1());
            		
            // InternalMyDsl.g:2055:3: ( ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) ) )
            // InternalMyDsl.g:2056:4: ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) )
            {
            // InternalMyDsl.g:2056:4: ( (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' ) )
            // InternalMyDsl.g:2057:5: (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' )
            {
            // InternalMyDsl.g:2057:5: (lv_type_2_1= 'instantly' | lv_type_2_2= 'with a delay' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            else if ( (LA34_0==48) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2058:6: lv_type_2_1= 'instantly'
                    {
                    lv_type_2_1=(Token)match(input,47,FOLLOW_36); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getCounteractAccess().getTypeInstantlyKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCounteractRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2069:6: lv_type_2_2= 'with a delay'
                    {
                    lv_type_2_2=(Token)match(input,48,FOLLOW_36); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getCounteractAccess().getTypeWithADelayKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCounteractRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getCounteractAccess().getWhenKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCounteractAccess().getReachKeyword_4());
            		
            // InternalMyDsl.g:2090:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2091:4: ( ruleEString )
            {
            // InternalMyDsl.g:2091:4: ( ruleEString )
            // InternalMyDsl.g:2092:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounteractRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCounteractAccess().getLocationsLocationCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCounteractAccess().getByKeyword_6());
            		
            // InternalMyDsl.g:2110:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2111:4: ( ruleEString )
            {
            // InternalMyDsl.g:2111:4: ( ruleEString )
            // InternalMyDsl.g:2112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounteractRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCounteractAccess().getConditionConditionCrossReference_7_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCounteract"


    // $ANTLR start "entryRuleWait"
    // InternalMyDsl.g:2130:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMyDsl.g:2130:45: (iv_ruleWait= ruleWait EOF )
            // InternalMyDsl.g:2131:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMyDsl.g:2137:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait in' ( ( ruleEString ) ) otherlv_3= 'until' ( ( ruleEString ) ) ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2143:2: ( ( () otherlv_1= 'wait in' ( ( ruleEString ) ) otherlv_3= 'until' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:2144:2: ( () otherlv_1= 'wait in' ( ( ruleEString ) ) otherlv_3= 'until' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:2144:2: ( () otherlv_1= 'wait in' ( ( ruleEString ) ) otherlv_3= 'until' ( ( ruleEString ) ) )
            // InternalMyDsl.g:2145:3: () otherlv_1= 'wait in' ( ( ruleEString ) ) otherlv_3= 'until' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2145:3: ()
            // InternalMyDsl.g:2146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitInKeyword_1());
            		
            // InternalMyDsl.g:2156:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2157:4: ( ruleEString )
            {
            // InternalMyDsl.g:2157:4: ( ruleEString )
            // InternalMyDsl.g:2158:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWaitAccess().getLocationsLocationCrossReference_2_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getUntilKeyword_3());
            		
            // InternalMyDsl.g:2176:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2177:4: ( ruleEString )
            {
            // InternalMyDsl.g:2177:4: ( ruleEString )
            // InternalMyDsl.g:2178:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWaitAccess().getConditionConditionCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleElementaryPatterns"
    // InternalMyDsl.g:2196:1: entryRuleElementaryPatterns returns [EObject current=null] : iv_ruleElementaryPatterns= ruleElementaryPatterns EOF ;
    public final EObject entryRuleElementaryPatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryPatterns = null;


        try {
            // InternalMyDsl.g:2196:59: (iv_ruleElementaryPatterns= ruleElementaryPatterns EOF )
            // InternalMyDsl.g:2197:2: iv_ruleElementaryPatterns= ruleElementaryPatterns EOF
            {
             newCompositeNode(grammarAccess.getElementaryPatternsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementaryPatterns=ruleElementaryPatterns();

            state._fsp--;

             current =iv_ruleElementaryPatterns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementaryPatterns"


    // $ANTLR start "ruleElementaryPatterns"
    // InternalMyDsl.g:2203:1: ruleElementaryPatterns returns [EObject current=null] : (this_Maximize_0= ruleMaximize | this_AtMost_1= ruleAtMost | this_Within_2= ruleWithin ) ;
    public final EObject ruleElementaryPatterns() throws RecognitionException {
        EObject current = null;

        EObject this_Maximize_0 = null;

        EObject this_AtMost_1 = null;

        EObject this_Within_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2209:2: ( (this_Maximize_0= ruleMaximize | this_AtMost_1= ruleAtMost | this_Within_2= ruleWithin ) )
            // InternalMyDsl.g:2210:2: (this_Maximize_0= ruleMaximize | this_AtMost_1= ruleAtMost | this_Within_2= ruleWithin )
            {
            // InternalMyDsl.g:2210:2: (this_Maximize_0= ruleMaximize | this_AtMost_1= ruleAtMost | this_Within_2= ruleWithin )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                switch ( input.LA(2) ) {
                case 58:
                case 59:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA35_3 = input.LA(3);

                    if ( ((LA35_3>=40 && LA35_3<=41)||(LA35_3>=60 && LA35_3<=62)) ) {
                        alt35=2;
                    }
                    else if ( ((LA35_3>=63 && LA35_3<=64)) ) {
                        alt35=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA35_4 = input.LA(3);

                    if ( ((LA35_4>=40 && LA35_4<=41)||(LA35_4>=60 && LA35_4<=62)) ) {
                        alt35=2;
                    }
                    else if ( ((LA35_4>=63 && LA35_4<=64)) ) {
                        alt35=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

                }
                break;
            case 58:
            case 59:
                {
                alt35=1;
                }
                break;
            case RULE_STRING:
                {
                int LA35_3 = input.LA(2);

                if ( ((LA35_3>=40 && LA35_3<=41)||(LA35_3>=60 && LA35_3<=62)) ) {
                    alt35=2;
                }
                else if ( ((LA35_3>=63 && LA35_3<=64)) ) {
                    alt35=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA35_4 = input.LA(2);

                if ( ((LA35_4>=40 && LA35_4<=41)||(LA35_4>=60 && LA35_4<=62)) ) {
                    alt35=2;
                }
                else if ( ((LA35_4>=63 && LA35_4<=64)) ) {
                    alt35=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2211:3: this_Maximize_0= ruleMaximize
                    {

                    			newCompositeNode(grammarAccess.getElementaryPatternsAccess().getMaximizeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maximize_0=ruleMaximize();

                    state._fsp--;


                    			current = this_Maximize_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2220:3: this_AtMost_1= ruleAtMost
                    {

                    			newCompositeNode(grammarAccess.getElementaryPatternsAccess().getAtMostParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtMost_1=ruleAtMost();

                    state._fsp--;


                    			current = this_AtMost_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2229:3: this_Within_2= ruleWithin
                    {

                    			newCompositeNode(grammarAccess.getElementaryPatternsAccess().getWithinParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Within_2=ruleWithin();

                    state._fsp--;


                    			current = this_Within_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementaryPatterns"


    // $ANTLR start "entryRuleMaximize"
    // InternalMyDsl.g:2241:1: entryRuleMaximize returns [EObject current=null] : iv_ruleMaximize= ruleMaximize EOF ;
    public final EObject entryRuleMaximize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximize = null;


        try {
            // InternalMyDsl.g:2241:49: (iv_ruleMaximize= ruleMaximize EOF )
            // InternalMyDsl.g:2242:2: iv_ruleMaximize= ruleMaximize EOF
            {
             newCompositeNode(grammarAccess.getMaximizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximize=ruleMaximize();

            state._fsp--;

             current =iv_ruleMaximize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximize"


    // $ANTLR start "ruleMaximize"
    // InternalMyDsl.g:2248:1: ruleMaximize returns [EObject current=null] : ( () ( (lv_reward_1_0= 'reward' ) )? ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) ) ( (lv_measure_3_0= ruleEString ) ) ( (lv_mission_4_0= ruleMissions ) ) ) ;
    public final EObject ruleMaximize() throws RecognitionException {
        EObject current = null;

        Token lv_reward_1_0=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        AntlrDatatypeRuleToken lv_measure_3_0 = null;

        EObject lv_mission_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2254:2: ( ( () ( (lv_reward_1_0= 'reward' ) )? ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) ) ( (lv_measure_3_0= ruleEString ) ) ( (lv_mission_4_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2255:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) ) ( (lv_measure_3_0= ruleEString ) ) ( (lv_mission_4_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2255:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) ) ( (lv_measure_3_0= ruleEString ) ) ( (lv_mission_4_0= ruleMissions ) ) )
            // InternalMyDsl.g:2256:3: () ( (lv_reward_1_0= 'reward' ) )? ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) ) ( (lv_measure_3_0= ruleEString ) ) ( (lv_mission_4_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2256:3: ()
            // InternalMyDsl.g:2257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaximizeAccess().getMaximizeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2263:3: ( (lv_reward_1_0= 'reward' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2264:4: (lv_reward_1_0= 'reward' )
                    {
                    // InternalMyDsl.g:2264:4: (lv_reward_1_0= 'reward' )
                    // InternalMyDsl.g:2265:5: lv_reward_1_0= 'reward'
                    {
                    lv_reward_1_0=(Token)match(input,57,FOLLOW_39); 

                    					newLeafNode(lv_reward_1_0, grammarAccess.getMaximizeAccess().getRewardRewardKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMaximizeRule());
                    					}
                    					setWithLastConsumed(current, "reward", lv_reward_1_0, "reward");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2277:3: ( ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) ) )
            // InternalMyDsl.g:2278:4: ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) )
            {
            // InternalMyDsl.g:2278:4: ( (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' ) )
            // InternalMyDsl.g:2279:5: (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' )
            {
            // InternalMyDsl.g:2279:5: (lv_type_2_1= 'maximize' | lv_type_2_2= 'minimize' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            else if ( (LA37_0==59) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2280:6: lv_type_2_1= 'maximize'
                    {
                    lv_type_2_1=(Token)match(input,58,FOLLOW_6); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getMaximizeAccess().getTypeMaximizeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaximizeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2291:6: lv_type_2_2= 'minimize'
                    {
                    lv_type_2_2=(Token)match(input,59,FOLLOW_6); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getMaximizeAccess().getTypeMinimizeKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaximizeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:2304:3: ( (lv_measure_3_0= ruleEString ) )
            // InternalMyDsl.g:2305:4: (lv_measure_3_0= ruleEString )
            {
            // InternalMyDsl.g:2305:4: (lv_measure_3_0= ruleEString )
            // InternalMyDsl.g:2306:5: lv_measure_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaximizeAccess().getMeasureEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_measure_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaximizeRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2323:3: ( (lv_mission_4_0= ruleMissions ) )
            // InternalMyDsl.g:2324:4: (lv_mission_4_0= ruleMissions )
            {
            // InternalMyDsl.g:2324:4: (lv_mission_4_0= ruleMissions )
            // InternalMyDsl.g:2325:5: lv_mission_4_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getMaximizeAccess().getMissionMissionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_mission_4_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaximizeRule());
            					}
            					set(
            						current,
            						"mission",
            						lv_mission_4_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximize"


    // $ANTLR start "entryRuleAtMost"
    // InternalMyDsl.g:2346:1: entryRuleAtMost returns [EObject current=null] : iv_ruleAtMost= ruleAtMost EOF ;
    public final EObject entryRuleAtMost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtMost = null;


        try {
            // InternalMyDsl.g:2346:47: (iv_ruleAtMost= ruleAtMost EOF )
            // InternalMyDsl.g:2347:2: iv_ruleAtMost= ruleAtMost EOF
            {
             newCompositeNode(grammarAccess.getAtMostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtMost=ruleAtMost();

            state._fsp--;

             current =iv_ruleAtMost; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtMost"


    // $ANTLR start "ruleAtMost"
    // InternalMyDsl.g:2353:1: ruleAtMost returns [EObject current=null] : ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) ) ( (lv_value_4_0= ruleEDouble ) ) ( (lv_mission_5_0= ruleMissions ) ) ) ;
    public final EObject ruleAtMost() throws RecognitionException {
        EObject current = null;

        Token lv_reward_1_0=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_type_3_5=null;
        AntlrDatatypeRuleToken lv_measure_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_mission_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2359:2: ( ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) ) ( (lv_value_4_0= ruleEDouble ) ) ( (lv_mission_5_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2360:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) ) ( (lv_value_4_0= ruleEDouble ) ) ( (lv_mission_5_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2360:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) ) ( (lv_value_4_0= ruleEDouble ) ) ( (lv_mission_5_0= ruleMissions ) ) )
            // InternalMyDsl.g:2361:3: () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) ) ( (lv_value_4_0= ruleEDouble ) ) ( (lv_mission_5_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2361:3: ()
            // InternalMyDsl.g:2362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtMostAccess().getAtMostAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2368:3: ( (lv_reward_1_0= 'reward' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2369:4: (lv_reward_1_0= 'reward' )
                    {
                    // InternalMyDsl.g:2369:4: (lv_reward_1_0= 'reward' )
                    // InternalMyDsl.g:2370:5: lv_reward_1_0= 'reward'
                    {
                    lv_reward_1_0=(Token)match(input,57,FOLLOW_6); 

                    					newLeafNode(lv_reward_1_0, grammarAccess.getAtMostAccess().getRewardRewardKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtMostRule());
                    					}
                    					setWithLastConsumed(current, "reward", lv_reward_1_0, "reward");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2382:3: ( (lv_measure_2_0= ruleEString ) )
            // InternalMyDsl.g:2383:4: (lv_measure_2_0= ruleEString )
            {
            // InternalMyDsl.g:2383:4: (lv_measure_2_0= ruleEString )
            // InternalMyDsl.g:2384:5: lv_measure_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtMostAccess().getMeasureEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_measure_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtMostRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2401:3: ( ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) ) )
            // InternalMyDsl.g:2402:4: ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) )
            {
            // InternalMyDsl.g:2402:4: ( (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' ) )
            // InternalMyDsl.g:2403:5: (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' )
            {
            // InternalMyDsl.g:2403:5: (lv_type_3_1= 'at most' | lv_type_3_2= 'less than' | lv_type_3_3= 'at least' | lv_type_3_4= 'greater than' | lv_type_3_5= 'exactly' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt39=1;
                }
                break;
            case 40:
                {
                alt39=2;
                }
                break;
            case 61:
                {
                alt39=3;
                }
                break;
            case 62:
                {
                alt39=4;
                }
                break;
            case 41:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2404:6: lv_type_3_1= 'at most'
                    {
                    lv_type_3_1=(Token)match(input,60,FOLLOW_41); 

                    						newLeafNode(lv_type_3_1, grammarAccess.getAtMostAccess().getTypeAtMostKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtMostRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2415:6: lv_type_3_2= 'less than'
                    {
                    lv_type_3_2=(Token)match(input,40,FOLLOW_41); 

                    						newLeafNode(lv_type_3_2, grammarAccess.getAtMostAccess().getTypeLessThanKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtMostRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2426:6: lv_type_3_3= 'at least'
                    {
                    lv_type_3_3=(Token)match(input,61,FOLLOW_41); 

                    						newLeafNode(lv_type_3_3, grammarAccess.getAtMostAccess().getTypeAtLeastKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtMostRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2437:6: lv_type_3_4= 'greater than'
                    {
                    lv_type_3_4=(Token)match(input,62,FOLLOW_41); 

                    						newLeafNode(lv_type_3_4, grammarAccess.getAtMostAccess().getTypeGreaterThanKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtMostRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2448:6: lv_type_3_5= 'exactly'
                    {
                    lv_type_3_5=(Token)match(input,41,FOLLOW_41); 

                    						newLeafNode(lv_type_3_5, grammarAccess.getAtMostAccess().getTypeExactlyKeyword_3_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtMostRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_5, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:2461:3: ( (lv_value_4_0= ruleEDouble ) )
            // InternalMyDsl.g:2462:4: (lv_value_4_0= ruleEDouble )
            {
            // InternalMyDsl.g:2462:4: (lv_value_4_0= ruleEDouble )
            // InternalMyDsl.g:2463:5: lv_value_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAtMostAccess().getValueEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtMostRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2480:3: ( (lv_mission_5_0= ruleMissions ) )
            // InternalMyDsl.g:2481:4: (lv_mission_5_0= ruleMissions )
            {
            // InternalMyDsl.g:2481:4: (lv_mission_5_0= ruleMissions )
            // InternalMyDsl.g:2482:5: lv_mission_5_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getAtMostAccess().getMissionMissionsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_mission_5_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtMostRule());
            					}
            					set(
            						current,
            						"mission",
            						lv_mission_5_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtMost"


    // $ANTLR start "entryRuleWithin"
    // InternalMyDsl.g:2503:1: entryRuleWithin returns [EObject current=null] : iv_ruleWithin= ruleWithin EOF ;
    public final EObject entryRuleWithin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithin = null;


        try {
            // InternalMyDsl.g:2503:47: (iv_ruleWithin= ruleWithin EOF )
            // InternalMyDsl.g:2504:2: iv_ruleWithin= ruleWithin EOF
            {
             newCompositeNode(grammarAccess.getWithinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithin=ruleWithin();

            state._fsp--;

             current =iv_ruleWithin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWithin"


    // $ANTLR start "ruleWithin"
    // InternalMyDsl.g:2510:1: ruleWithin returns [EObject current=null] : ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) ) ( (lv_value1_4_0= ruleEDouble ) ) otherlv_5= 'and' ( (lv_value2_6_0= ruleEDouble ) ) ( (lv_mission_7_0= ruleMissions ) ) ) ;
    public final EObject ruleWithin() throws RecognitionException {
        EObject current = null;

        Token lv_reward_1_0=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_measure_2_0 = null;

        AntlrDatatypeRuleToken lv_value1_4_0 = null;

        AntlrDatatypeRuleToken lv_value2_6_0 = null;

        EObject lv_mission_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2516:2: ( ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) ) ( (lv_value1_4_0= ruleEDouble ) ) otherlv_5= 'and' ( (lv_value2_6_0= ruleEDouble ) ) ( (lv_mission_7_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2517:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) ) ( (lv_value1_4_0= ruleEDouble ) ) otherlv_5= 'and' ( (lv_value2_6_0= ruleEDouble ) ) ( (lv_mission_7_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2517:2: ( () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) ) ( (lv_value1_4_0= ruleEDouble ) ) otherlv_5= 'and' ( (lv_value2_6_0= ruleEDouble ) ) ( (lv_mission_7_0= ruleMissions ) ) )
            // InternalMyDsl.g:2518:3: () ( (lv_reward_1_0= 'reward' ) )? ( (lv_measure_2_0= ruleEString ) ) ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) ) ( (lv_value1_4_0= ruleEDouble ) ) otherlv_5= 'and' ( (lv_value2_6_0= ruleEDouble ) ) ( (lv_mission_7_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2518:3: ()
            // InternalMyDsl.g:2519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWithinAccess().getWithinAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2525:3: ( (lv_reward_1_0= 'reward' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2526:4: (lv_reward_1_0= 'reward' )
                    {
                    // InternalMyDsl.g:2526:4: (lv_reward_1_0= 'reward' )
                    // InternalMyDsl.g:2527:5: lv_reward_1_0= 'reward'
                    {
                    lv_reward_1_0=(Token)match(input,57,FOLLOW_6); 

                    					newLeafNode(lv_reward_1_0, grammarAccess.getWithinAccess().getRewardRewardKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWithinRule());
                    					}
                    					setWithLastConsumed(current, "reward", lv_reward_1_0, "reward");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2539:3: ( (lv_measure_2_0= ruleEString ) )
            // InternalMyDsl.g:2540:4: (lv_measure_2_0= ruleEString )
            {
            // InternalMyDsl.g:2540:4: (lv_measure_2_0= ruleEString )
            // InternalMyDsl.g:2541:5: lv_measure_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWithinAccess().getMeasureEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
            lv_measure_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithinRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2558:3: ( ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) ) )
            // InternalMyDsl.g:2559:4: ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) )
            {
            // InternalMyDsl.g:2559:4: ( (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' ) )
            // InternalMyDsl.g:2560:5: (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' )
            {
            // InternalMyDsl.g:2560:5: (lv_type_3_1= 'within' | lv_type_3_2= 'strictly within' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            else if ( (LA41_0==64) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2561:6: lv_type_3_1= 'within'
                    {
                    lv_type_3_1=(Token)match(input,63,FOLLOW_41); 

                    						newLeafNode(lv_type_3_1, grammarAccess.getWithinAccess().getTypeWithinKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWithinRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2572:6: lv_type_3_2= 'strictly within'
                    {
                    lv_type_3_2=(Token)match(input,64,FOLLOW_41); 

                    						newLeafNode(lv_type_3_2, grammarAccess.getWithinAccess().getTypeStrictlyWithinKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWithinRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:2585:3: ( (lv_value1_4_0= ruleEDouble ) )
            // InternalMyDsl.g:2586:4: (lv_value1_4_0= ruleEDouble )
            {
            // InternalMyDsl.g:2586:4: (lv_value1_4_0= ruleEDouble )
            // InternalMyDsl.g:2587:5: lv_value1_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getWithinAccess().getValue1EDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
            lv_value1_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithinRule());
            					}
            					set(
            						current,
            						"value1",
            						lv_value1_4_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getWithinAccess().getAndKeyword_5());
            		
            // InternalMyDsl.g:2608:3: ( (lv_value2_6_0= ruleEDouble ) )
            // InternalMyDsl.g:2609:4: (lv_value2_6_0= ruleEDouble )
            {
            // InternalMyDsl.g:2609:4: (lv_value2_6_0= ruleEDouble )
            // InternalMyDsl.g:2610:5: lv_value2_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getWithinAccess().getValue2EDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_value2_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithinRule());
            					}
            					set(
            						current,
            						"value2",
            						lv_value2_6_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2627:3: ( (lv_mission_7_0= ruleMissions ) )
            // InternalMyDsl.g:2628:4: (lv_mission_7_0= ruleMissions )
            {
            // InternalMyDsl.g:2628:4: (lv_mission_7_0= ruleMissions )
            // InternalMyDsl.g:2629:5: lv_mission_7_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getWithinAccess().getMissionMissionsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_mission_7_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithinRule());
            					}
            					set(
            						current,
            						"mission",
            						lv_mission_7_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithin"


    // $ANTLR start "entryRuleCompositePatterns"
    // InternalMyDsl.g:2650:1: entryRuleCompositePatterns returns [EObject current=null] : iv_ruleCompositePatterns= ruleCompositePatterns EOF ;
    public final EObject entryRuleCompositePatterns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePatterns = null;


        try {
            // InternalMyDsl.g:2650:58: (iv_ruleCompositePatterns= ruleCompositePatterns EOF )
            // InternalMyDsl.g:2651:2: iv_ruleCompositePatterns= ruleCompositePatterns EOF
            {
             newCompositeNode(grammarAccess.getCompositePatternsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositePatterns=ruleCompositePatterns();

            state._fsp--;

             current =iv_ruleCompositePatterns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositePatterns"


    // $ANTLR start "ruleCompositePatterns"
    // InternalMyDsl.g:2657:1: ruleCompositePatterns returns [EObject current=null] : (this_Conservation_0= ruleConservation | this_Preservation_1= rulePreservation | this_Pause_2= rulePause | this_Timeout_3= ruleTimeout | this_Repeat_4= ruleRepeat | this_End_5= ruleEnd | this_Proportional_6= ruleProportional | this_Execute_7= ruleExecute | this_Accrue_8= ruleAccrue | this_ReliabilityConfidence_9= ruleReliabilityConfidence | this_Equidistance_10= ruleEquidistance | this_Trail_11= ruleTrail ) ;
    public final EObject ruleCompositePatterns() throws RecognitionException {
        EObject current = null;

        EObject this_Conservation_0 = null;

        EObject this_Preservation_1 = null;

        EObject this_Pause_2 = null;

        EObject this_Timeout_3 = null;

        EObject this_Repeat_4 = null;

        EObject this_End_5 = null;

        EObject this_Proportional_6 = null;

        EObject this_Execute_7 = null;

        EObject this_Accrue_8 = null;

        EObject this_ReliabilityConfidence_9 = null;

        EObject this_Equidistance_10 = null;

        EObject this_Trail_11 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2663:2: ( (this_Conservation_0= ruleConservation | this_Preservation_1= rulePreservation | this_Pause_2= rulePause | this_Timeout_3= ruleTimeout | this_Repeat_4= ruleRepeat | this_End_5= ruleEnd | this_Proportional_6= ruleProportional | this_Execute_7= ruleExecute | this_Accrue_8= ruleAccrue | this_ReliabilityConfidence_9= ruleReliabilityConfidence | this_Equidistance_10= ruleEquidistance | this_Trail_11= ruleTrail ) )
            // InternalMyDsl.g:2664:2: (this_Conservation_0= ruleConservation | this_Preservation_1= rulePreservation | this_Pause_2= rulePause | this_Timeout_3= ruleTimeout | this_Repeat_4= ruleRepeat | this_End_5= ruleEnd | this_Proportional_6= ruleProportional | this_Execute_7= ruleExecute | this_Accrue_8= ruleAccrue | this_ReliabilityConfidence_9= ruleReliabilityConfidence | this_Equidistance_10= ruleEquidistance | this_Trail_11= ruleTrail )
            {
            // InternalMyDsl.g:2664:2: (this_Conservation_0= ruleConservation | this_Preservation_1= rulePreservation | this_Pause_2= rulePause | this_Timeout_3= ruleTimeout | this_Repeat_4= ruleRepeat | this_End_5= ruleEnd | this_Proportional_6= ruleProportional | this_Execute_7= ruleExecute | this_Accrue_8= ruleAccrue | this_ReliabilityConfidence_9= ruleReliabilityConfidence | this_Equidistance_10= ruleEquidistance | this_Trail_11= ruleTrail )
            int alt42=12;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2665:3: this_Conservation_0= ruleConservation
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getConservationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conservation_0=ruleConservation();

                    state._fsp--;


                    			current = this_Conservation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2674:3: this_Preservation_1= rulePreservation
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getPreservationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Preservation_1=rulePreservation();

                    state._fsp--;


                    			current = this_Preservation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2683:3: this_Pause_2= rulePause
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getPauseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pause_2=rulePause();

                    state._fsp--;


                    			current = this_Pause_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2692:3: this_Timeout_3= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getTimeoutParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_3=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2701:3: this_Repeat_4= ruleRepeat
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getRepeatParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeat_4=ruleRepeat();

                    state._fsp--;


                    			current = this_Repeat_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2710:3: this_End_5= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getEndParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_5=ruleEnd();

                    state._fsp--;


                    			current = this_End_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2719:3: this_Proportional_6= ruleProportional
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getProportionalParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Proportional_6=ruleProportional();

                    state._fsp--;


                    			current = this_Proportional_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2728:3: this_Execute_7= ruleExecute
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getExecuteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Execute_7=ruleExecute();

                    state._fsp--;


                    			current = this_Execute_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2737:3: this_Accrue_8= ruleAccrue
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getAccrueParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Accrue_8=ruleAccrue();

                    state._fsp--;


                    			current = this_Accrue_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2746:3: this_ReliabilityConfidence_9= ruleReliabilityConfidence
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getReliabilityConfidenceParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReliabilityConfidence_9=ruleReliabilityConfidence();

                    state._fsp--;


                    			current = this_ReliabilityConfidence_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:2755:3: this_Equidistance_10= ruleEquidistance
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getEquidistanceParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equidistance_10=ruleEquidistance();

                    state._fsp--;


                    			current = this_Equidistance_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:2764:3: this_Trail_11= ruleTrail
                    {

                    			newCompositeNode(grammarAccess.getCompositePatternsAccess().getTrailParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Trail_11=ruleTrail();

                    state._fsp--;


                    			current = this_Trail_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositePatterns"


    // $ANTLR start "entryRuleConservation"
    // InternalMyDsl.g:2776:1: entryRuleConservation returns [EObject current=null] : iv_ruleConservation= ruleConservation EOF ;
    public final EObject entryRuleConservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConservation = null;


        try {
            // InternalMyDsl.g:2776:53: (iv_ruleConservation= ruleConservation EOF )
            // InternalMyDsl.g:2777:2: iv_ruleConservation= ruleConservation EOF
            {
             newCompositeNode(grammarAccess.getConservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConservation=ruleConservation();

            state._fsp--;

             current =iv_ruleConservation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConservation"


    // $ANTLR start "ruleConservation"
    // InternalMyDsl.g:2783:1: ruleConservation returns [EObject current=null] : ( () otherlv_1= 'conserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'while' ( (lv_missions_4_0= ruleMissions ) ) ) ;
    public final EObject ruleConservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_measure_2_0 = null;

        EObject lv_missions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2789:2: ( ( () otherlv_1= 'conserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'while' ( (lv_missions_4_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2790:2: ( () otherlv_1= 'conserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'while' ( (lv_missions_4_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2790:2: ( () otherlv_1= 'conserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'while' ( (lv_missions_4_0= ruleMissions ) ) )
            // InternalMyDsl.g:2791:3: () otherlv_1= 'conserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'while' ( (lv_missions_4_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2791:3: ()
            // InternalMyDsl.g:2792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConservationAccess().getConservationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConservationAccess().getConserveKeyword_1());
            		
            // InternalMyDsl.g:2802:3: ( (lv_measure_2_0= ruleEString ) )
            // InternalMyDsl.g:2803:4: (lv_measure_2_0= ruleEString )
            {
            // InternalMyDsl.g:2803:4: (lv_measure_2_0= ruleEString )
            // InternalMyDsl.g:2804:5: lv_measure_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConservationAccess().getMeasureEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
            lv_measure_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConservationRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getConservationAccess().getWhileKeyword_3());
            		
            // InternalMyDsl.g:2825:3: ( (lv_missions_4_0= ruleMissions ) )
            // InternalMyDsl.g:2826:4: (lv_missions_4_0= ruleMissions )
            {
            // InternalMyDsl.g:2826:4: (lv_missions_4_0= ruleMissions )
            // InternalMyDsl.g:2827:5: lv_missions_4_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getConservationAccess().getMissionsMissionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_missions_4_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConservationRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_4_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConservation"


    // $ANTLR start "entryRulePreservation"
    // InternalMyDsl.g:2848:1: entryRulePreservation returns [EObject current=null] : iv_rulePreservation= rulePreservation EOF ;
    public final EObject entryRulePreservation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreservation = null;


        try {
            // InternalMyDsl.g:2848:53: (iv_rulePreservation= rulePreservation EOF )
            // InternalMyDsl.g:2849:2: iv_rulePreservation= rulePreservation EOF
            {
             newCompositeNode(grammarAccess.getPreservationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreservation=rulePreservation();

            state._fsp--;

             current =iv_rulePreservation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreservation"


    // $ANTLR start "rulePreservation"
    // InternalMyDsl.g:2855:1: rulePreservation returns [EObject current=null] : ( () otherlv_1= 'preserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'within' otherlv_4= '[' ( (lv_value1_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_value2_7_0= ruleEDouble ) ) otherlv_8= ']' otherlv_9= 'while' ( (lv_missions_10_0= ruleMissions ) ) ) ;
    public final EObject rulePreservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_measure_2_0 = null;

        AntlrDatatypeRuleToken lv_value1_5_0 = null;

        AntlrDatatypeRuleToken lv_value2_7_0 = null;

        EObject lv_missions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2861:2: ( ( () otherlv_1= 'preserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'within' otherlv_4= '[' ( (lv_value1_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_value2_7_0= ruleEDouble ) ) otherlv_8= ']' otherlv_9= 'while' ( (lv_missions_10_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2862:2: ( () otherlv_1= 'preserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'within' otherlv_4= '[' ( (lv_value1_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_value2_7_0= ruleEDouble ) ) otherlv_8= ']' otherlv_9= 'while' ( (lv_missions_10_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2862:2: ( () otherlv_1= 'preserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'within' otherlv_4= '[' ( (lv_value1_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_value2_7_0= ruleEDouble ) ) otherlv_8= ']' otherlv_9= 'while' ( (lv_missions_10_0= ruleMissions ) ) )
            // InternalMyDsl.g:2863:3: () otherlv_1= 'preserve' ( (lv_measure_2_0= ruleEString ) ) otherlv_3= 'within' otherlv_4= '[' ( (lv_value1_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_value2_7_0= ruleEDouble ) ) otherlv_8= ']' otherlv_9= 'while' ( (lv_missions_10_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2863:3: ()
            // InternalMyDsl.g:2864:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreservationAccess().getPreservationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPreservationAccess().getPreserveKeyword_1());
            		
            // InternalMyDsl.g:2874:3: ( (lv_measure_2_0= ruleEString ) )
            // InternalMyDsl.g:2875:4: (lv_measure_2_0= ruleEString )
            {
            // InternalMyDsl.g:2875:4: (lv_measure_2_0= ruleEString )
            // InternalMyDsl.g:2876:5: lv_measure_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreservationAccess().getMeasureEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_measure_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreservationRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getPreservationAccess().getWithinKeyword_3());
            		
            otherlv_4=(Token)match(input,68,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getPreservationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMyDsl.g:2901:3: ( (lv_value1_5_0= ruleEDouble ) )
            // InternalMyDsl.g:2902:4: (lv_value1_5_0= ruleEDouble )
            {
            // InternalMyDsl.g:2902:4: (lv_value1_5_0= ruleEDouble )
            // InternalMyDsl.g:2903:5: lv_value1_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreservationAccess().getValue1EDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_47);
            lv_value1_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreservationRule());
            					}
            					set(
            						current,
            						"value1",
            						lv_value1_5_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getPreservationAccess().getCommaKeyword_6());
            		
            // InternalMyDsl.g:2924:3: ( (lv_value2_7_0= ruleEDouble ) )
            // InternalMyDsl.g:2925:4: (lv_value2_7_0= ruleEDouble )
            {
            // InternalMyDsl.g:2925:4: (lv_value2_7_0= ruleEDouble )
            // InternalMyDsl.g:2926:5: lv_value2_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreservationAccess().getValue2EDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_48);
            lv_value2_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreservationRule());
            					}
            					set(
            						current,
            						"value2",
            						lv_value2_7_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,69,FOLLOW_44); 

            			newLeafNode(otherlv_8, grammarAccess.getPreservationAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getPreservationAccess().getWhileKeyword_9());
            		
            // InternalMyDsl.g:2951:3: ( (lv_missions_10_0= ruleMissions ) )
            // InternalMyDsl.g:2952:4: (lv_missions_10_0= ruleMissions )
            {
            // InternalMyDsl.g:2952:4: (lv_missions_10_0= ruleMissions )
            // InternalMyDsl.g:2953:5: lv_missions_10_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getPreservationAccess().getMissionsMissionsParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_missions_10_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreservationRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_10_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreservation"


    // $ANTLR start "entryRulePause"
    // InternalMyDsl.g:2974:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalMyDsl.g:2974:46: (iv_rulePause= rulePause EOF )
            // InternalMyDsl.g:2975:2: iv_rulePause= rulePause EOF
            {
             newCompositeNode(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePause=rulePause();

            state._fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalMyDsl.g:2981:1: rulePause returns [EObject current=null] : ( () otherlv_1= 'pause' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_missions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2987:2: ( ( () otherlv_1= 'pause' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:2988:2: ( () otherlv_1= 'pause' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:2988:2: ( () otherlv_1= 'pause' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) )
            // InternalMyDsl.g:2989:3: () otherlv_1= 'pause' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) )
            {
            // InternalMyDsl.g:2989:3: ()
            // InternalMyDsl.g:2990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPauseAccess().getPauseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getPauseKeyword_1());
            		
            // InternalMyDsl.g:3000:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalMyDsl.g:3001:4: (lv_value_2_0= ruleEInt )
            {
            // InternalMyDsl.g:3001:4: (lv_value_2_0= ruleEInt )
            // InternalMyDsl.g:3002:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3019:3: ( (lv_missions_3_0= ruleMissions ) )
            // InternalMyDsl.g:3020:4: (lv_missions_3_0= ruleMissions )
            {
            // InternalMyDsl.g:3020:4: (lv_missions_3_0= ruleMissions )
            // InternalMyDsl.g:3021:5: lv_missions_3_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getMissionsMissionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_missions_3_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_3_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleTimeout"
    // InternalMyDsl.g:3042:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalMyDsl.g:3042:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalMyDsl.g:3043:2: iv_ruleTimeout= ruleTimeout EOF
            {
             newCompositeNode(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeout=ruleTimeout();

            state._fsp--;

             current =iv_ruleTimeout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // InternalMyDsl.g:3049:1: ruleTimeout returns [EObject current=null] : ( () otherlv_1= 'timeout' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_missions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3055:2: ( ( () otherlv_1= 'timeout' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:3056:2: ( () otherlv_1= 'timeout' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:3056:2: ( () otherlv_1= 'timeout' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) ) )
            // InternalMyDsl.g:3057:3: () otherlv_1= 'timeout' ( (lv_value_2_0= ruleEInt ) ) ( (lv_missions_3_0= ruleMissions ) )
            {
            // InternalMyDsl.g:3057:3: ()
            // InternalMyDsl.g:3058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeoutAccess().getTimeoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getTimeoutKeyword_1());
            		
            // InternalMyDsl.g:3068:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalMyDsl.g:3069:4: (lv_value_2_0= ruleEInt )
            {
            // InternalMyDsl.g:3069:4: (lv_value_2_0= ruleEInt )
            // InternalMyDsl.g:3070:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeoutAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3087:3: ( (lv_missions_3_0= ruleMissions ) )
            // InternalMyDsl.g:3088:4: (lv_missions_3_0= ruleMissions )
            {
            // InternalMyDsl.g:3088:4: (lv_missions_3_0= ruleMissions )
            // InternalMyDsl.g:3089:5: lv_missions_3_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getTimeoutAccess().getMissionsMissionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_missions_3_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_3_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleRepeat"
    // InternalMyDsl.g:3110:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalMyDsl.g:3110:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalMyDsl.g:3111:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalMyDsl.g:3117:1: ruleRepeat returns [EObject current=null] : ( () otherlv_1= 'repeat' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'every' ( (lv_value_4_0= ruleEInt ) ) ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_missions_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3123:2: ( ( () otherlv_1= 'repeat' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'every' ( (lv_value_4_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:3124:2: ( () otherlv_1= 'repeat' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'every' ( (lv_value_4_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:3124:2: ( () otherlv_1= 'repeat' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'every' ( (lv_value_4_0= ruleEInt ) ) )
            // InternalMyDsl.g:3125:3: () otherlv_1= 'repeat' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'every' ( (lv_value_4_0= ruleEInt ) )
            {
            // InternalMyDsl.g:3125:3: ()
            // InternalMyDsl.g:3126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatAccess().getRepeatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_1());
            		
            // InternalMyDsl.g:3136:3: ( (lv_missions_2_0= ruleMissions ) )
            // InternalMyDsl.g:3137:4: (lv_missions_2_0= ruleMissions )
            {
            // InternalMyDsl.g:3137:4: (lv_missions_2_0= ruleMissions )
            // InternalMyDsl.g:3138:5: lv_missions_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getMissionsMissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
            lv_missions_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,73,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getEveryKeyword_3());
            		
            // InternalMyDsl.g:3159:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalMyDsl.g:3160:4: (lv_value_4_0= ruleEInt )
            {
            // InternalMyDsl.g:3160:4: (lv_value_4_0= ruleEInt )
            // InternalMyDsl.g:3161:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleEnd"
    // InternalMyDsl.g:3182:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalMyDsl.g:3182:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalMyDsl.g:3183:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalMyDsl.g:3189:1: ruleEnd returns [EObject current=null] : ( () otherlv_1= 'end' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'exactly_at' ( (lv_value_4_0= ruleEInt ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_missions_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3195:2: ( ( () otherlv_1= 'end' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'exactly_at' ( (lv_value_4_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:3196:2: ( () otherlv_1= 'end' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'exactly_at' ( (lv_value_4_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:3196:2: ( () otherlv_1= 'end' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'exactly_at' ( (lv_value_4_0= ruleEInt ) ) )
            // InternalMyDsl.g:3197:3: () otherlv_1= 'end' ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'exactly_at' ( (lv_value_4_0= ruleEInt ) )
            {
            // InternalMyDsl.g:3197:3: ()
            // InternalMyDsl.g:3198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
            		
            // InternalMyDsl.g:3208:3: ( (lv_missions_2_0= ruleMissions ) )
            // InternalMyDsl.g:3209:4: (lv_missions_2_0= ruleMissions )
            {
            // InternalMyDsl.g:3209:4: (lv_missions_2_0= ruleMissions )
            // InternalMyDsl.g:3210:5: lv_missions_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getEndAccess().getMissionsMissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_missions_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,75,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getEndAccess().getExactly_atKeyword_3());
            		
            // InternalMyDsl.g:3231:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalMyDsl.g:3232:4: (lv_value_4_0= ruleEInt )
            {
            // InternalMyDsl.g:3232:4: (lv_value_4_0= ruleEInt )
            // InternalMyDsl.g:3233:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEndAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleProportional"
    // InternalMyDsl.g:3254:1: entryRuleProportional returns [EObject current=null] : iv_ruleProportional= ruleProportional EOF ;
    public final EObject entryRuleProportional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProportional = null;


        try {
            // InternalMyDsl.g:3254:53: (iv_ruleProportional= ruleProportional EOF )
            // InternalMyDsl.g:3255:2: iv_ruleProportional= ruleProportional EOF
            {
             newCompositeNode(grammarAccess.getProportionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProportional=ruleProportional();

            state._fsp--;

             current =iv_ruleProportional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProportional"


    // $ANTLR start "ruleProportional"
    // InternalMyDsl.g:3261:1: ruleProportional returns [EObject current=null] : ( () otherlv_1= 'time' otherlv_2= 'of' ( (lv_mission1_3_0= ruleMissions ) ) otherlv_4= 'proportional to' ( (lv_mission2_5_0= ruleMissions ) ) otherlv_6= 'by' otherlv_7= 'factor' ( (lv_value_8_0= ruleEInt ) ) ) ;
    public final EObject ruleProportional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_mission1_3_0 = null;

        EObject lv_mission2_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3267:2: ( ( () otherlv_1= 'time' otherlv_2= 'of' ( (lv_mission1_3_0= ruleMissions ) ) otherlv_4= 'proportional to' ( (lv_mission2_5_0= ruleMissions ) ) otherlv_6= 'by' otherlv_7= 'factor' ( (lv_value_8_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:3268:2: ( () otherlv_1= 'time' otherlv_2= 'of' ( (lv_mission1_3_0= ruleMissions ) ) otherlv_4= 'proportional to' ( (lv_mission2_5_0= ruleMissions ) ) otherlv_6= 'by' otherlv_7= 'factor' ( (lv_value_8_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:3268:2: ( () otherlv_1= 'time' otherlv_2= 'of' ( (lv_mission1_3_0= ruleMissions ) ) otherlv_4= 'proportional to' ( (lv_mission2_5_0= ruleMissions ) ) otherlv_6= 'by' otherlv_7= 'factor' ( (lv_value_8_0= ruleEInt ) ) )
            // InternalMyDsl.g:3269:3: () otherlv_1= 'time' otherlv_2= 'of' ( (lv_mission1_3_0= ruleMissions ) ) otherlv_4= 'proportional to' ( (lv_mission2_5_0= ruleMissions ) ) otherlv_6= 'by' otherlv_7= 'factor' ( (lv_value_8_0= ruleEInt ) )
            {
            // InternalMyDsl.g:3269:3: ()
            // InternalMyDsl.g:3270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProportionalAccess().getProportionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getProportionalAccess().getTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getProportionalAccess().getOfKeyword_2());
            		
            // InternalMyDsl.g:3284:3: ( (lv_mission1_3_0= ruleMissions ) )
            // InternalMyDsl.g:3285:4: (lv_mission1_3_0= ruleMissions )
            {
            // InternalMyDsl.g:3285:4: (lv_mission1_3_0= ruleMissions )
            // InternalMyDsl.g:3286:5: lv_mission1_3_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getProportionalAccess().getMission1MissionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
            lv_mission1_3_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProportionalRule());
            					}
            					set(
            						current,
            						"mission1",
            						lv_mission1_3_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,78,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getProportionalAccess().getProportionalToKeyword_4());
            		
            // InternalMyDsl.g:3307:3: ( (lv_mission2_5_0= ruleMissions ) )
            // InternalMyDsl.g:3308:4: (lv_mission2_5_0= ruleMissions )
            {
            // InternalMyDsl.g:3308:4: (lv_mission2_5_0= ruleMissions )
            // InternalMyDsl.g:3309:5: lv_mission2_5_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getProportionalAccess().getMission2MissionsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_mission2_5_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProportionalRule());
            					}
            					set(
            						current,
            						"mission2",
            						lv_mission2_5_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_53); 

            			newLeafNode(otherlv_6, grammarAccess.getProportionalAccess().getByKeyword_6());
            		
            otherlv_7=(Token)match(input,79,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getProportionalAccess().getFactorKeyword_7());
            		
            // InternalMyDsl.g:3334:3: ( (lv_value_8_0= ruleEInt ) )
            // InternalMyDsl.g:3335:4: (lv_value_8_0= ruleEInt )
            {
            // InternalMyDsl.g:3335:4: (lv_value_8_0= ruleEInt )
            // InternalMyDsl.g:3336:5: lv_value_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getProportionalAccess().getValueEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProportionalRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProportional"


    // $ANTLR start "entryRuleExecute"
    // InternalMyDsl.g:3357:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalMyDsl.g:3357:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalMyDsl.g:3358:2: iv_ruleExecute= ruleExecute EOF
            {
             newCompositeNode(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecute=ruleExecute();

            state._fsp--;

             current =iv_ruleExecute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalMyDsl.g:3364:1: ruleExecute returns [EObject current=null] : ( () otherlv_1= 'execute' ( ( ruleEString ) ) otherlv_3= 'actions' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3370:2: ( ( () otherlv_1= 'execute' ( ( ruleEString ) ) otherlv_3= 'actions' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:3371:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) otherlv_3= 'actions' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:3371:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) otherlv_3= 'actions' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:3372:3: () otherlv_1= 'execute' ( ( ruleEString ) ) otherlv_3= 'actions' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:3372:3: ()
            // InternalMyDsl.g:3373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecuteAccess().getExecuteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteAccess().getExecuteKeyword_1());
            		
            // InternalMyDsl.g:3383:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3384:4: ( ruleEString )
            {
            // InternalMyDsl.g:3384:4: ( ruleEString )
            // InternalMyDsl.g:3385:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExecuteAccess().getRobotsRobotsCrossReference_2_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,81,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExecuteAccess().getActionsKeyword_3());
            		
            // InternalMyDsl.g:3403:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3404:4: ( ruleEString )
            {
            // InternalMyDsl.g:3404:4: ( ruleEString )
            // InternalMyDsl.g:3405:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExecuteAccess().getSetOfActionsActionCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3419:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==15) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:3420:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getExecuteAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:3424:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:3425:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:3425:5: ( ruleEString )
            	    // InternalMyDsl.g:3426:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExecuteRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getExecuteAccess().getSetOfActionsActionCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecute"


    // $ANTLR start "entryRuleAccrue"
    // InternalMyDsl.g:3445:1: entryRuleAccrue returns [EObject current=null] : iv_ruleAccrue= ruleAccrue EOF ;
    public final EObject entryRuleAccrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccrue = null;


        try {
            // InternalMyDsl.g:3445:47: (iv_ruleAccrue= ruleAccrue EOF )
            // InternalMyDsl.g:3446:2: iv_ruleAccrue= ruleAccrue EOF
            {
             newCompositeNode(grammarAccess.getAccrueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccrue=ruleAccrue();

            state._fsp--;

             current =iv_ruleAccrue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccrue"


    // $ANTLR start "ruleAccrue"
    // InternalMyDsl.g:3452:1: ruleAccrue returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'accrue' ( (lv_measure_3_0= ruleEString ) ) otherlv_4= 'while' ( (lv_missions_5_0= ruleMissions ) ) ) ;
    public final EObject ruleAccrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_measure_3_0 = null;

        EObject lv_missions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3458:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'accrue' ( (lv_measure_3_0= ruleEString ) ) otherlv_4= 'while' ( (lv_missions_5_0= ruleMissions ) ) ) )
            // InternalMyDsl.g:3459:2: ( () ( ( ruleEString ) ) otherlv_2= 'accrue' ( (lv_measure_3_0= ruleEString ) ) otherlv_4= 'while' ( (lv_missions_5_0= ruleMissions ) ) )
            {
            // InternalMyDsl.g:3459:2: ( () ( ( ruleEString ) ) otherlv_2= 'accrue' ( (lv_measure_3_0= ruleEString ) ) otherlv_4= 'while' ( (lv_missions_5_0= ruleMissions ) ) )
            // InternalMyDsl.g:3460:3: () ( ( ruleEString ) ) otherlv_2= 'accrue' ( (lv_measure_3_0= ruleEString ) ) otherlv_4= 'while' ( (lv_missions_5_0= ruleMissions ) )
            {
            // InternalMyDsl.g:3460:3: ()
            // InternalMyDsl.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccrueAccess().getAccrueAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:3467:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3468:4: ( ruleEString )
            {
            // InternalMyDsl.g:3468:4: ( ruleEString )
            // InternalMyDsl.g:3469:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccrueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAccrueAccess().getRobotsRobotsCrossReference_1_0());
            				
            pushFollow(FOLLOW_55);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,82,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAccrueAccess().getAccrueKeyword_2());
            		
            // InternalMyDsl.g:3487:3: ( (lv_measure_3_0= ruleEString ) )
            // InternalMyDsl.g:3488:4: (lv_measure_3_0= ruleEString )
            {
            // InternalMyDsl.g:3488:4: (lv_measure_3_0= ruleEString )
            // InternalMyDsl.g:3489:5: lv_measure_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAccrueAccess().getMeasureEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_measure_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccrueRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,66,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAccrueAccess().getWhileKeyword_4());
            		
            // InternalMyDsl.g:3510:3: ( (lv_missions_5_0= ruleMissions ) )
            // InternalMyDsl.g:3511:4: (lv_missions_5_0= ruleMissions )
            {
            // InternalMyDsl.g:3511:4: (lv_missions_5_0= ruleMissions )
            // InternalMyDsl.g:3512:5: lv_missions_5_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getAccrueAccess().getMissionsMissionsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_missions_5_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccrueRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_5_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccrue"


    // $ANTLR start "entryRuleReliabilityConfidence"
    // InternalMyDsl.g:3533:1: entryRuleReliabilityConfidence returns [EObject current=null] : iv_ruleReliabilityConfidence= ruleReliabilityConfidence EOF ;
    public final EObject entryRuleReliabilityConfidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReliabilityConfidence = null;


        try {
            // InternalMyDsl.g:3533:62: (iv_ruleReliabilityConfidence= ruleReliabilityConfidence EOF )
            // InternalMyDsl.g:3534:2: iv_ruleReliabilityConfidence= ruleReliabilityConfidence EOF
            {
             newCompositeNode(grammarAccess.getReliabilityConfidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReliabilityConfidence=ruleReliabilityConfidence();

            state._fsp--;

             current =iv_ruleReliabilityConfidence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReliabilityConfidence"


    // $ANTLR start "ruleReliabilityConfidence"
    // InternalMyDsl.g:3540:1: ruleReliabilityConfidence returns [EObject current=null] : ( () otherlv_1= 'achieve' ( (lv_missions_2_0= ruleMissions ) ) ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) ) ( (lv_measure_4_0= ruleEString ) ) ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) ) ( (lv_value_6_0= ruleEDouble ) ) ) ;
    public final EObject ruleReliabilityConfidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type1_3_1=null;
        Token lv_type1_3_2=null;
        Token lv_type2_5_1=null;
        Token lv_type2_5_2=null;
        EObject lv_missions_2_0 = null;

        AntlrDatatypeRuleToken lv_measure_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3546:2: ( ( () otherlv_1= 'achieve' ( (lv_missions_2_0= ruleMissions ) ) ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) ) ( (lv_measure_4_0= ruleEString ) ) ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) ) ( (lv_value_6_0= ruleEDouble ) ) ) )
            // InternalMyDsl.g:3547:2: ( () otherlv_1= 'achieve' ( (lv_missions_2_0= ruleMissions ) ) ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) ) ( (lv_measure_4_0= ruleEString ) ) ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) ) ( (lv_value_6_0= ruleEDouble ) ) )
            {
            // InternalMyDsl.g:3547:2: ( () otherlv_1= 'achieve' ( (lv_missions_2_0= ruleMissions ) ) ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) ) ( (lv_measure_4_0= ruleEString ) ) ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) ) ( (lv_value_6_0= ruleEDouble ) ) )
            // InternalMyDsl.g:3548:3: () otherlv_1= 'achieve' ( (lv_missions_2_0= ruleMissions ) ) ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) ) ( (lv_measure_4_0= ruleEString ) ) ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) ) ( (lv_value_6_0= ruleEDouble ) )
            {
            // InternalMyDsl.g:3548:3: ()
            // InternalMyDsl.g:3549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReliabilityConfidenceAccess().getReliabilityConfidenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReliabilityConfidenceAccess().getAchieveKeyword_1());
            		
            // InternalMyDsl.g:3559:3: ( (lv_missions_2_0= ruleMissions ) )
            // InternalMyDsl.g:3560:4: (lv_missions_2_0= ruleMissions )
            {
            // InternalMyDsl.g:3560:4: (lv_missions_2_0= ruleMissions )
            // InternalMyDsl.g:3561:5: lv_missions_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getReliabilityConfidenceAccess().getMissionsMissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
            lv_missions_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReliabilityConfidenceRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3578:3: ( ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) ) )
            // InternalMyDsl.g:3579:4: ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) )
            {
            // InternalMyDsl.g:3579:4: ( (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' ) )
            // InternalMyDsl.g:3580:5: (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' )
            {
            // InternalMyDsl.g:3580:5: (lv_type1_3_1= 'with confidence' | lv_type1_3_2= 'with reliability' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==84) ) {
                alt44=1;
            }
            else if ( (LA44_0==85) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3581:6: lv_type1_3_1= 'with confidence'
                    {
                    lv_type1_3_1=(Token)match(input,84,FOLLOW_6); 

                    						newLeafNode(lv_type1_3_1, grammarAccess.getReliabilityConfidenceAccess().getType1WithConfidenceKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReliabilityConfidenceRule());
                    						}
                    						setWithLastConsumed(current, "type1", lv_type1_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3592:6: lv_type1_3_2= 'with reliability'
                    {
                    lv_type1_3_2=(Token)match(input,85,FOLLOW_6); 

                    						newLeafNode(lv_type1_3_2, grammarAccess.getReliabilityConfidenceAccess().getType1WithReliabilityKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReliabilityConfidenceRule());
                    						}
                    						setWithLastConsumed(current, "type1", lv_type1_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:3605:3: ( (lv_measure_4_0= ruleEString ) )
            // InternalMyDsl.g:3606:4: (lv_measure_4_0= ruleEString )
            {
            // InternalMyDsl.g:3606:4: (lv_measure_4_0= ruleEString )
            // InternalMyDsl.g:3607:5: lv_measure_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReliabilityConfidenceAccess().getMeasureEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_57);
            lv_measure_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReliabilityConfidenceRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3624:3: ( ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) ) )
            // InternalMyDsl.g:3625:4: ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) )
            {
            // InternalMyDsl.g:3625:4: ( (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' ) )
            // InternalMyDsl.g:3626:5: (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' )
            {
            // InternalMyDsl.g:3626:5: (lv_type2_5_1= 'greater than' | lv_type2_5_2= 'less than' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            else if ( (LA45_0==40) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:3627:6: lv_type2_5_1= 'greater than'
                    {
                    lv_type2_5_1=(Token)match(input,62,FOLLOW_41); 

                    						newLeafNode(lv_type2_5_1, grammarAccess.getReliabilityConfidenceAccess().getType2GreaterThanKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReliabilityConfidenceRule());
                    						}
                    						setWithLastConsumed(current, "type2", lv_type2_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3638:6: lv_type2_5_2= 'less than'
                    {
                    lv_type2_5_2=(Token)match(input,40,FOLLOW_41); 

                    						newLeafNode(lv_type2_5_2, grammarAccess.getReliabilityConfidenceAccess().getType2LessThanKeyword_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReliabilityConfidenceRule());
                    						}
                    						setWithLastConsumed(current, "type2", lv_type2_5_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:3651:3: ( (lv_value_6_0= ruleEDouble ) )
            // InternalMyDsl.g:3652:4: (lv_value_6_0= ruleEDouble )
            {
            // InternalMyDsl.g:3652:4: (lv_value_6_0= ruleEDouble )
            // InternalMyDsl.g:3653:5: lv_value_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getReliabilityConfidenceAccess().getValueEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReliabilityConfidenceRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReliabilityConfidence"


    // $ANTLR start "entryRuleEquidistance"
    // InternalMyDsl.g:3674:1: entryRuleEquidistance returns [EObject current=null] : iv_ruleEquidistance= ruleEquidistance EOF ;
    public final EObject entryRuleEquidistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquidistance = null;


        try {
            // InternalMyDsl.g:3674:53: (iv_ruleEquidistance= ruleEquidistance EOF )
            // InternalMyDsl.g:3675:2: iv_ruleEquidistance= ruleEquidistance EOF
            {
             newCompositeNode(grammarAccess.getEquidistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquidistance=ruleEquidistance();

            state._fsp--;

             current =iv_ruleEquidistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquidistance"


    // $ANTLR start "ruleEquidistance"
    // InternalMyDsl.g:3681:1: ruleEquidistance returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'equidistance' ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleEquidistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_missions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3687:2: ( ( () ( ( ruleEString ) ) ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'equidistance' ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:3688:2: ( () ( ( ruleEString ) ) ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'equidistance' ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:3688:2: ( () ( ( ruleEString ) ) ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'equidistance' ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalMyDsl.g:3689:3: () ( ( ruleEString ) ) ( (lv_missions_2_0= ruleMissions ) ) otherlv_3= 'equidistance' ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3689:3: ()
            // InternalMyDsl.g:3690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEquidistanceAccess().getEquidistanceAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:3696:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3697:4: ( ruleEString )
            {
            // InternalMyDsl.g:3697:4: ( ruleEString )
            // InternalMyDsl.g:3698:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquidistanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEquidistanceAccess().getRobotsRobotsCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3712:3: ( (lv_missions_2_0= ruleMissions ) )
            // InternalMyDsl.g:3713:4: (lv_missions_2_0= ruleMissions )
            {
            // InternalMyDsl.g:3713:4: (lv_missions_2_0= ruleMissions )
            // InternalMyDsl.g:3714:5: lv_missions_2_0= ruleMissions
            {

            					newCompositeNode(grammarAccess.getEquidistanceAccess().getMissionsMissionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_58);
            lv_missions_2_0=ruleMissions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquidistanceRule());
            					}
            					set(
            						current,
            						"missions",
            						lv_missions_2_0,
            						"org.xtext.example.mydsl.MyDsl.Missions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,86,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEquidistanceAccess().getEquidistanceKeyword_3());
            		
            // InternalMyDsl.g:3735:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3736:4: ( ruleEString )
            {
            // InternalMyDsl.g:3736:4: ( ruleEString )
            // InternalMyDsl.g:3737:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquidistanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEquidistanceAccess().getRobots1RobotsCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3751:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3752:4: ( ruleEString )
            {
            // InternalMyDsl.g:3752:4: ( ruleEString )
            // InternalMyDsl.g:3753:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquidistanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEquidistanceAccess().getRobots2RobotsCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquidistance"


    // $ANTLR start "entryRuleTrail"
    // InternalMyDsl.g:3771:1: entryRuleTrail returns [EObject current=null] : iv_ruleTrail= ruleTrail EOF ;
    public final EObject entryRuleTrail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrail = null;


        try {
            // InternalMyDsl.g:3771:46: (iv_ruleTrail= ruleTrail EOF )
            // InternalMyDsl.g:3772:2: iv_ruleTrail= ruleTrail EOF
            {
             newCompositeNode(grammarAccess.getTrailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrail=ruleTrail();

            state._fsp--;

             current =iv_ruleTrail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrail"


    // $ANTLR start "ruleTrail"
    // InternalMyDsl.g:3778:1: ruleTrail returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'trail' ( (lv_objetToFollow_3_0= ruleEString ) ) otherlv_4= 'with distance' ( (lv_value_5_0= ruleEInt ) ) ) ;
    public final EObject ruleTrail() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_objetToFollow_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3784:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'trail' ( (lv_objetToFollow_3_0= ruleEString ) ) otherlv_4= 'with distance' ( (lv_value_5_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:3785:2: ( () ( ( ruleEString ) ) otherlv_2= 'trail' ( (lv_objetToFollow_3_0= ruleEString ) ) otherlv_4= 'with distance' ( (lv_value_5_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:3785:2: ( () ( ( ruleEString ) ) otherlv_2= 'trail' ( (lv_objetToFollow_3_0= ruleEString ) ) otherlv_4= 'with distance' ( (lv_value_5_0= ruleEInt ) ) )
            // InternalMyDsl.g:3786:3: () ( ( ruleEString ) ) otherlv_2= 'trail' ( (lv_objetToFollow_3_0= ruleEString ) ) otherlv_4= 'with distance' ( (lv_value_5_0= ruleEInt ) )
            {
            // InternalMyDsl.g:3786:3: ()
            // InternalMyDsl.g:3787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrailAccess().getTrailAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:3793:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3794:4: ( ruleEString )
            {
            // InternalMyDsl.g:3794:4: ( ruleEString )
            // InternalMyDsl.g:3795:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrailRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTrailAccess().getRobotsRobotsCrossReference_1_0());
            				
            pushFollow(FOLLOW_59);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,87,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTrailAccess().getTrailKeyword_2());
            		
            // InternalMyDsl.g:3813:3: ( (lv_objetToFollow_3_0= ruleEString ) )
            // InternalMyDsl.g:3814:4: (lv_objetToFollow_3_0= ruleEString )
            {
            // InternalMyDsl.g:3814:4: (lv_objetToFollow_3_0= ruleEString )
            // InternalMyDsl.g:3815:5: lv_objetToFollow_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrailAccess().getObjetToFollowEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_60);
            lv_objetToFollow_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrailRule());
            					}
            					set(
            						current,
            						"objetToFollow",
            						lv_objetToFollow_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getTrailAccess().getWithDistanceKeyword_4());
            		
            // InternalMyDsl.g:3836:3: ( (lv_value_5_0= ruleEInt ) )
            // InternalMyDsl.g:3837:4: (lv_value_5_0= ruleEInt )
            {
            // InternalMyDsl.g:3837:4: (lv_value_5_0= ruleEInt )
            // InternalMyDsl.g:3838:5: lv_value_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTrailAccess().getValueEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrailRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrail"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:3859:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:3859:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:3860:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:3866:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3872:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:3873:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:3873:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:3874:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,89,FOLLOW_41); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:3897:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:3897:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:3898:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:3904:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3910:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:3911:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:3911:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:3912:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:3912:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==90) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3913:4: kw= '-'
                    {
                    kw=(Token)match(input,90,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\26\1\4\2\27\1\30\3\uffff";
    static final String dfa_3s = "\1\5\2\26\1\5\2\34\1\33\3\uffff";
    static final String dfa_4s = "\7\uffff\1\3\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4\1\5",
            "\1\6\4\uffff\1\7",
            "\1\6\4\uffff\1\7",
            "\1\10\2\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "364:2: (this_Event_0= ruleEvent | this_ActionEnd_1= ruleActionEnd | this_LocationEvent_2= ruleLocationEvent )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\4\10\uffff\2\4\4\uffff";
    static final String dfa_9s = "\1\123\10\uffff\2\127\4\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\12\1\11\1\13\1\14";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\1\12\73\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\7\3\uffff\1\10\2\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\23\uffff\1\15\4\uffff\1\15\32\uffff\3\15\5\uffff\1\15\1\uffff\1\15\2\uffff\3\15\1\uffff\1\15\1\uffff\1\15\3\uffff\1\15\1\uffff\1\14\1\15\3\uffff\1\16",
            "\2\15\23\uffff\1\15\4\uffff\1\15\32\uffff\3\15\5\uffff\1\15\1\uffff\1\15\2\uffff\3\15\1\uffff\1\15\1\uffff\1\15\3\uffff\1\15\1\uffff\1\14\1\15\3\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2664:2: (this_Conservation_0= ruleConservation | this_Preservation_1= rulePreservation | this_Pause_2= rulePause | this_Timeout_3= ruleTimeout | this_Repeat_4= ruleRepeat | this_End_5= ruleEnd | this_Proportional_6= ruleProportional | this_Execute_7= ruleExecute | this_Accrue_8= ruleAccrue | this_ReliabilityConfidence_9= ruleReliabilityConfidence | this_Equidistance_10= ruleEquidistance | this_Trail_11= ruleTrail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000002F4000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000002F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000002E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0E00000042000030L,0x00000000000915CAL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0140484200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003C00000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L,0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000300000008032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0170484200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7000030000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000010000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}