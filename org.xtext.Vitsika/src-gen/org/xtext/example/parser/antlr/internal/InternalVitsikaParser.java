package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.VitsikaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVitsikaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ataovy'", "'{'", "','", "'}'", "'tsindrio'", "'('", "')'", "'mikisaka'", "'miandry'", "'s'", "'m'", "'h'", "'sokafy'", "':'", "'vonoy'", "'Tranokala'", "'manokatraWifi'", "'Soraty'", "'manoratra_word'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVitsikaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVitsikaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVitsikaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVitsika.g"; }



     	private VitsikaGrammarAccess grammarAccess;

        public InternalVitsikaParser(TokenStream input, VitsikaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VitsikaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVitsika.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVitsika.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalVitsika.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVitsika.g:71:1: ruleModel returns [EObject current=null] : ( (lv_task_0_0= ruleAtaovyTask ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_task_0_0 = null;



        	enterRule();

        try {
            // InternalVitsika.g:77:2: ( ( (lv_task_0_0= ruleAtaovyTask ) ) )
            // InternalVitsika.g:78:2: ( (lv_task_0_0= ruleAtaovyTask ) )
            {
            // InternalVitsika.g:78:2: ( (lv_task_0_0= ruleAtaovyTask ) )
            // InternalVitsika.g:79:3: (lv_task_0_0= ruleAtaovyTask )
            {
            // InternalVitsika.g:79:3: (lv_task_0_0= ruleAtaovyTask )
            // InternalVitsika.g:80:4: lv_task_0_0= ruleAtaovyTask
            {

            				newCompositeNode(grammarAccess.getModelAccess().getTaskAtaovyTaskParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_task_0_0=ruleAtaovyTask();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"task",
            					lv_task_0_0,
            					"org.xtext.example.Vitsika.AtaovyTask");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAtaovyTask"
    // InternalVitsika.g:100:1: entryRuleAtaovyTask returns [EObject current=null] : iv_ruleAtaovyTask= ruleAtaovyTask EOF ;
    public final EObject entryRuleAtaovyTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtaovyTask = null;


        try {
            // InternalVitsika.g:100:51: (iv_ruleAtaovyTask= ruleAtaovyTask EOF )
            // InternalVitsika.g:101:2: iv_ruleAtaovyTask= ruleAtaovyTask EOF
            {
             newCompositeNode(grammarAccess.getAtaovyTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtaovyTask=ruleAtaovyTask();

            state._fsp--;

             current =iv_ruleAtaovyTask; 
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
    // $ANTLR end "entryRuleAtaovyTask"


    // $ANTLR start "ruleAtaovyTask"
    // InternalVitsika.g:107:1: ruleAtaovyTask returns [EObject current=null] : (otherlv_0= 'Ataovy' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleAtaovyTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actions_2_0 = null;

        EObject lv_actions_4_0 = null;



        	enterRule();

        try {
            // InternalVitsika.g:113:2: ( (otherlv_0= 'Ataovy' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )* otherlv_5= '}' ) )
            // InternalVitsika.g:114:2: (otherlv_0= 'Ataovy' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )* otherlv_5= '}' )
            {
            // InternalVitsika.g:114:2: (otherlv_0= 'Ataovy' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )* otherlv_5= '}' )
            // InternalVitsika.g:115:3: otherlv_0= 'Ataovy' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtaovyTaskAccess().getAtaovyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAtaovyTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVitsika.g:123:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalVitsika.g:124:4: (lv_actions_2_0= ruleAction )
            {
            // InternalVitsika.g:124:4: (lv_actions_2_0= ruleAction )
            // InternalVitsika.g:125:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtaovyTaskRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"org.xtext.example.Vitsika.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVitsika.g:142:3: (otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVitsika.g:143:4: otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAtaovyTaskAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalVitsika.g:147:4: ( (lv_actions_4_0= ruleAction ) )
            	    // InternalVitsika.g:148:5: (lv_actions_4_0= ruleAction )
            	    {
            	    // InternalVitsika.g:148:5: (lv_actions_4_0= ruleAction )
            	    // InternalVitsika.g:149:6: lv_actions_4_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAtaovyTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_4_0,
            	    							"org.xtext.example.Vitsika.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAtaovyTaskAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAtaovyTask"


    // $ANTLR start "entryRuleAction"
    // InternalVitsika.g:175:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalVitsika.g:175:47: (iv_ruleAction= ruleAction EOF )
            // InternalVitsika.g:176:2: iv_ruleAction= ruleAction EOF
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
    // InternalVitsika.g:182:1: ruleAction returns [EObject current=null] : (this_ClickAction_0= ruleClickAction | this_MoveAction_1= ruleMoveAction | this_WaitAction_2= ruleWaitAction | this_OpenApplicationAction_3= ruleOpenApplicationAction | this_Maty_4= ruleMaty | this_Surfer_5= ruleSurfer | this_WifiCreate_6= ruleWifiCreate | this_Typewrite_7= ruleTypewrite | this_WordTypingAuto_8= ruleWordTypingAuto ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ClickAction_0 = null;

        EObject this_MoveAction_1 = null;

        EObject this_WaitAction_2 = null;

        EObject this_OpenApplicationAction_3 = null;

        EObject this_Maty_4 = null;

        EObject this_Surfer_5 = null;

        EObject this_WifiCreate_6 = null;

        EObject this_Typewrite_7 = null;

        EObject this_WordTypingAuto_8 = null;



        	enterRule();

        try {
            // InternalVitsika.g:188:2: ( (this_ClickAction_0= ruleClickAction | this_MoveAction_1= ruleMoveAction | this_WaitAction_2= ruleWaitAction | this_OpenApplicationAction_3= ruleOpenApplicationAction | this_Maty_4= ruleMaty | this_Surfer_5= ruleSurfer | this_WifiCreate_6= ruleWifiCreate | this_Typewrite_7= ruleTypewrite | this_WordTypingAuto_8= ruleWordTypingAuto ) )
            // InternalVitsika.g:189:2: (this_ClickAction_0= ruleClickAction | this_MoveAction_1= ruleMoveAction | this_WaitAction_2= ruleWaitAction | this_OpenApplicationAction_3= ruleOpenApplicationAction | this_Maty_4= ruleMaty | this_Surfer_5= ruleSurfer | this_WifiCreate_6= ruleWifiCreate | this_Typewrite_7= ruleTypewrite | this_WordTypingAuto_8= ruleWordTypingAuto )
            {
            // InternalVitsika.g:189:2: (this_ClickAction_0= ruleClickAction | this_MoveAction_1= ruleMoveAction | this_WaitAction_2= ruleWaitAction | this_OpenApplicationAction_3= ruleOpenApplicationAction | this_Maty_4= ruleMaty | this_Surfer_5= ruleSurfer | this_WifiCreate_6= ruleWifiCreate | this_Typewrite_7= ruleTypewrite | this_WordTypingAuto_8= ruleWordTypingAuto )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            case 29:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVitsika.g:190:3: this_ClickAction_0= ruleClickAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickAction_0=ruleClickAction();

                    state._fsp--;


                    			current = this_ClickAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVitsika.g:199:3: this_MoveAction_1= ruleMoveAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMoveActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveAction_1=ruleMoveAction();

                    state._fsp--;


                    			current = this_MoveAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVitsika.g:208:3: this_WaitAction_2= ruleWaitAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWaitActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitAction_2=ruleWaitAction();

                    state._fsp--;


                    			current = this_WaitAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVitsika.g:217:3: this_OpenApplicationAction_3= ruleOpenApplicationAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getOpenApplicationActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenApplicationAction_3=ruleOpenApplicationAction();

                    state._fsp--;


                    			current = this_OpenApplicationAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVitsika.g:226:3: this_Maty_4= ruleMaty
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMatyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maty_4=ruleMaty();

                    state._fsp--;


                    			current = this_Maty_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVitsika.g:235:3: this_Surfer_5= ruleSurfer
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSurferParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Surfer_5=ruleSurfer();

                    state._fsp--;


                    			current = this_Surfer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalVitsika.g:244:3: this_WifiCreate_6= ruleWifiCreate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWifiCreateParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_WifiCreate_6=ruleWifiCreate();

                    state._fsp--;


                    			current = this_WifiCreate_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalVitsika.g:253:3: this_Typewrite_7= ruleTypewrite
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTypewriteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Typewrite_7=ruleTypewrite();

                    state._fsp--;


                    			current = this_Typewrite_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalVitsika.g:262:3: this_WordTypingAuto_8= ruleWordTypingAuto
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWordTypingAutoParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_WordTypingAuto_8=ruleWordTypingAuto();

                    state._fsp--;


                    			current = this_WordTypingAuto_8;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleClickAction"
    // InternalVitsika.g:274:1: entryRuleClickAction returns [EObject current=null] : iv_ruleClickAction= ruleClickAction EOF ;
    public final EObject entryRuleClickAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickAction = null;


        try {
            // InternalVitsika.g:274:52: (iv_ruleClickAction= ruleClickAction EOF )
            // InternalVitsika.g:275:2: iv_ruleClickAction= ruleClickAction EOF
            {
             newCompositeNode(grammarAccess.getClickActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickAction=ruleClickAction();

            state._fsp--;

             current =iv_ruleClickAction; 
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
    // $ANTLR end "entryRuleClickAction"


    // $ANTLR start "ruleClickAction"
    // InternalVitsika.g:281:1: ruleClickAction returns [EObject current=null] : (otherlv_0= 'tsindrio' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleClickAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVitsika.g:287:2: ( (otherlv_0= 'tsindrio' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalVitsika.g:288:2: (otherlv_0= 'tsindrio' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalVitsika.g:288:2: (otherlv_0= 'tsindrio' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalVitsika.g:289:3: otherlv_0= 'tsindrio' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClickActionAccess().getTsindrioKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getClickActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:297:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalVitsika.g:298:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalVitsika.g:298:4: (lv_key_2_0= RULE_STRING )
            // InternalVitsika.g:299:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_key_2_0, grammarAccess.getClickActionAccess().getKeySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClickActionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleClickAction"


    // $ANTLR start "entryRuleMoveAction"
    // InternalVitsika.g:323:1: entryRuleMoveAction returns [EObject current=null] : iv_ruleMoveAction= ruleMoveAction EOF ;
    public final EObject entryRuleMoveAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAction = null;


        try {
            // InternalVitsika.g:323:51: (iv_ruleMoveAction= ruleMoveAction EOF )
            // InternalVitsika.g:324:2: iv_ruleMoveAction= ruleMoveAction EOF
            {
             newCompositeNode(grammarAccess.getMoveActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveAction=ruleMoveAction();

            state._fsp--;

             current =iv_ruleMoveAction; 
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
    // $ANTLR end "entryRuleMoveAction"


    // $ANTLR start "ruleMoveAction"
    // InternalVitsika.g:330:1: ruleMoveAction returns [EObject current=null] : (otherlv_0= 'mikisaka' otherlv_1= '(' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleMoveAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_X_2_0=null;
        Token otherlv_3=null;
        Token lv_Y_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVitsika.g:336:2: ( (otherlv_0= 'mikisaka' otherlv_1= '(' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalVitsika.g:337:2: (otherlv_0= 'mikisaka' otherlv_1= '(' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalVitsika.g:337:2: (otherlv_0= 'mikisaka' otherlv_1= '(' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalVitsika.g:338:3: otherlv_0= 'mikisaka' otherlv_1= '(' ( (lv_X_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_Y_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveActionAccess().getMikisakaKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:346:3: ( (lv_X_2_0= RULE_INT ) )
            // InternalVitsika.g:347:4: (lv_X_2_0= RULE_INT )
            {
            // InternalVitsika.g:347:4: (lv_X_2_0= RULE_INT )
            // InternalVitsika.g:348:5: lv_X_2_0= RULE_INT
            {
            lv_X_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_X_2_0, grammarAccess.getMoveActionAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"X",
            						lv_X_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveActionAccess().getCommaKeyword_3());
            		
            // InternalVitsika.g:368:3: ( (lv_Y_4_0= RULE_INT ) )
            // InternalVitsika.g:369:4: (lv_Y_4_0= RULE_INT )
            {
            // InternalVitsika.g:369:4: (lv_Y_4_0= RULE_INT )
            // InternalVitsika.g:370:5: lv_Y_4_0= RULE_INT
            {
            lv_Y_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_Y_4_0, grammarAccess.getMoveActionAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Y",
            						lv_Y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveActionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMoveAction"


    // $ANTLR start "entryRuleWaitAction"
    // InternalVitsika.g:394:1: entryRuleWaitAction returns [EObject current=null] : iv_ruleWaitAction= ruleWaitAction EOF ;
    public final EObject entryRuleWaitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitAction = null;


        try {
            // InternalVitsika.g:394:51: (iv_ruleWaitAction= ruleWaitAction EOF )
            // InternalVitsika.g:395:2: iv_ruleWaitAction= ruleWaitAction EOF
            {
             newCompositeNode(grammarAccess.getWaitActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitAction=ruleWaitAction();

            state._fsp--;

             current =iv_ruleWaitAction; 
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
    // $ANTLR end "entryRuleWaitAction"


    // $ANTLR start "ruleWaitAction"
    // InternalVitsika.g:401:1: ruleWaitAction returns [EObject current=null] : (otherlv_0= 'miandry' otherlv_1= '(' ( (lv_duration_2_0= RULE_INT ) ) ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleWaitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_duration_2_0=null;
        Token lv_unit_3_1=null;
        Token lv_unit_3_2=null;
        Token lv_unit_3_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVitsika.g:407:2: ( (otherlv_0= 'miandry' otherlv_1= '(' ( (lv_duration_2_0= RULE_INT ) ) ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) ) otherlv_4= ')' ) )
            // InternalVitsika.g:408:2: (otherlv_0= 'miandry' otherlv_1= '(' ( (lv_duration_2_0= RULE_INT ) ) ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) ) otherlv_4= ')' )
            {
            // InternalVitsika.g:408:2: (otherlv_0= 'miandry' otherlv_1= '(' ( (lv_duration_2_0= RULE_INT ) ) ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) ) otherlv_4= ')' )
            // InternalVitsika.g:409:3: otherlv_0= 'miandry' otherlv_1= '(' ( (lv_duration_2_0= RULE_INT ) ) ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitActionAccess().getMiandryKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:417:3: ( (lv_duration_2_0= RULE_INT ) )
            // InternalVitsika.g:418:4: (lv_duration_2_0= RULE_INT )
            {
            // InternalVitsika.g:418:4: (lv_duration_2_0= RULE_INT )
            // InternalVitsika.g:419:5: lv_duration_2_0= RULE_INT
            {
            lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_duration_2_0, grammarAccess.getWaitActionAccess().getDurationINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalVitsika.g:435:3: ( ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) ) )
            // InternalVitsika.g:436:4: ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) )
            {
            // InternalVitsika.g:436:4: ( (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' ) )
            // InternalVitsika.g:437:5: (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' )
            {
            // InternalVitsika.g:437:5: (lv_unit_3_1= 's' | lv_unit_3_2= 'm' | lv_unit_3_3= 'h' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVitsika.g:438:6: lv_unit_3_1= 's'
                    {
                    lv_unit_3_1=(Token)match(input,20,FOLLOW_8); 

                    						newLeafNode(lv_unit_3_1, grammarAccess.getWaitActionAccess().getUnitSKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaitActionRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalVitsika.g:449:6: lv_unit_3_2= 'm'
                    {
                    lv_unit_3_2=(Token)match(input,21,FOLLOW_8); 

                    						newLeafNode(lv_unit_3_2, grammarAccess.getWaitActionAccess().getUnitMKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaitActionRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalVitsika.g:460:6: lv_unit_3_3= 'h'
                    {
                    lv_unit_3_3=(Token)match(input,22,FOLLOW_8); 

                    						newLeafNode(lv_unit_3_3, grammarAccess.getWaitActionAccess().getUnitHKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaitActionRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWaitActionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleWaitAction"


    // $ANTLR start "entryRuleOpenApplicationAction"
    // InternalVitsika.g:481:1: entryRuleOpenApplicationAction returns [EObject current=null] : iv_ruleOpenApplicationAction= ruleOpenApplicationAction EOF ;
    public final EObject entryRuleOpenApplicationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenApplicationAction = null;


        try {
            // InternalVitsika.g:481:62: (iv_ruleOpenApplicationAction= ruleOpenApplicationAction EOF )
            // InternalVitsika.g:482:2: iv_ruleOpenApplicationAction= ruleOpenApplicationAction EOF
            {
             newCompositeNode(grammarAccess.getOpenApplicationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenApplicationAction=ruleOpenApplicationAction();

            state._fsp--;

             current =iv_ruleOpenApplicationAction; 
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
    // $ANTLR end "entryRuleOpenApplicationAction"


    // $ANTLR start "ruleOpenApplicationAction"
    // InternalVitsika.g:488:1: ruleOpenApplicationAction returns [EObject current=null] : (otherlv_0= 'sokafy' otherlv_1= ':' ( (lv_applications_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleOpenApplicationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_applications_2_0=null;
        Token otherlv_3=null;
        Token lv_applications_4_0=null;


        	enterRule();

        try {
            // InternalVitsika.g:494:2: ( (otherlv_0= 'sokafy' otherlv_1= ':' ( (lv_applications_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )* ) )
            // InternalVitsika.g:495:2: (otherlv_0= 'sokafy' otherlv_1= ':' ( (lv_applications_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )* )
            {
            // InternalVitsika.g:495:2: (otherlv_0= 'sokafy' otherlv_1= ':' ( (lv_applications_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )* )
            // InternalVitsika.g:496:3: otherlv_0= 'sokafy' otherlv_1= ':' ( (lv_applications_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenApplicationActionAccess().getSokafyKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenApplicationActionAccess().getColonKeyword_1());
            		
            // InternalVitsika.g:504:3: ( (lv_applications_2_0= RULE_ID ) )
            // InternalVitsika.g:505:4: (lv_applications_2_0= RULE_ID )
            {
            // InternalVitsika.g:505:4: (lv_applications_2_0= RULE_ID )
            // InternalVitsika.g:506:5: lv_applications_2_0= RULE_ID
            {
            lv_applications_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_applications_2_0, grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenApplicationActionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"applications",
            						lv_applications_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVitsika.g:522:3: (otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_ID) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalVitsika.g:523:4: otherlv_3= ',' ( (lv_applications_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOpenApplicationActionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalVitsika.g:527:4: ( (lv_applications_4_0= RULE_ID ) )
            	    // InternalVitsika.g:528:5: (lv_applications_4_0= RULE_ID )
            	    {
            	    // InternalVitsika.g:528:5: (lv_applications_4_0= RULE_ID )
            	    // InternalVitsika.g:529:6: lv_applications_4_0= RULE_ID
            	    {
            	    lv_applications_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(lv_applications_4_0, grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOpenApplicationActionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"applications",
            	    							lv_applications_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleOpenApplicationAction"


    // $ANTLR start "entryRuleMaty"
    // InternalVitsika.g:550:1: entryRuleMaty returns [EObject current=null] : iv_ruleMaty= ruleMaty EOF ;
    public final EObject entryRuleMaty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaty = null;


        try {
            // InternalVitsika.g:550:45: (iv_ruleMaty= ruleMaty EOF )
            // InternalVitsika.g:551:2: iv_ruleMaty= ruleMaty EOF
            {
             newCompositeNode(grammarAccess.getMatyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaty=ruleMaty();

            state._fsp--;

             current =iv_ruleMaty; 
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
    // $ANTLR end "entryRuleMaty"


    // $ANTLR start "ruleMaty"
    // InternalVitsika.g:557:1: ruleMaty returns [EObject current=null] : (otherlv_0= 'vonoy' otherlv_1= '(' ( (lv_proc_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleMaty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_proc_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVitsika.g:563:2: ( (otherlv_0= 'vonoy' otherlv_1= '(' ( (lv_proc_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalVitsika.g:564:2: (otherlv_0= 'vonoy' otherlv_1= '(' ( (lv_proc_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalVitsika.g:564:2: (otherlv_0= 'vonoy' otherlv_1= '(' ( (lv_proc_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalVitsika.g:565:3: otherlv_0= 'vonoy' otherlv_1= '(' ( (lv_proc_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMatyAccess().getVonoyKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMatyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:573:3: ( (lv_proc_2_0= RULE_STRING ) )
            // InternalVitsika.g:574:4: (lv_proc_2_0= RULE_STRING )
            {
            // InternalVitsika.g:574:4: (lv_proc_2_0= RULE_STRING )
            // InternalVitsika.g:575:5: lv_proc_2_0= RULE_STRING
            {
            lv_proc_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_proc_2_0, grammarAccess.getMatyAccess().getProcSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"proc",
            						lv_proc_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMatyAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMaty"


    // $ANTLR start "entryRuleSurfer"
    // InternalVitsika.g:599:1: entryRuleSurfer returns [EObject current=null] : iv_ruleSurfer= ruleSurfer EOF ;
    public final EObject entryRuleSurfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfer = null;


        try {
            // InternalVitsika.g:599:47: (iv_ruleSurfer= ruleSurfer EOF )
            // InternalVitsika.g:600:2: iv_ruleSurfer= ruleSurfer EOF
            {
             newCompositeNode(grammarAccess.getSurferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurfer=ruleSurfer();

            state._fsp--;

             current =iv_ruleSurfer; 
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
    // $ANTLR end "entryRuleSurfer"


    // $ANTLR start "ruleSurfer"
    // InternalVitsika.g:606:1: ruleSurfer returns [EObject current=null] : (otherlv_0= 'Tranokala' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleSurfer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVitsika.g:612:2: ( (otherlv_0= 'Tranokala' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalVitsika.g:613:2: (otherlv_0= 'Tranokala' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalVitsika.g:613:2: (otherlv_0= 'Tranokala' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalVitsika.g:614:3: otherlv_0= 'Tranokala' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSurferAccess().getTranokalaKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSurferAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:622:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalVitsika.g:623:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalVitsika.g:623:4: (lv_url_2_0= RULE_STRING )
            // InternalVitsika.g:624:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_url_2_0, grammarAccess.getSurferAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSurferRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSurferAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSurfer"


    // $ANTLR start "entryRuleWifiCreate"
    // InternalVitsika.g:648:1: entryRuleWifiCreate returns [EObject current=null] : iv_ruleWifiCreate= ruleWifiCreate EOF ;
    public final EObject entryRuleWifiCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifiCreate = null;


        try {
            // InternalVitsika.g:648:51: (iv_ruleWifiCreate= ruleWifiCreate EOF )
            // InternalVitsika.g:649:2: iv_ruleWifiCreate= ruleWifiCreate EOF
            {
             newCompositeNode(grammarAccess.getWifiCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWifiCreate=ruleWifiCreate();

            state._fsp--;

             current =iv_ruleWifiCreate; 
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
    // $ANTLR end "entryRuleWifiCreate"


    // $ANTLR start "ruleWifiCreate"
    // InternalVitsika.g:655:1: ruleWifiCreate returns [EObject current=null] : (otherlv_0= 'manokatraWifi' otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_passwd_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleWifiCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ssid_2_0=null;
        Token otherlv_3=null;
        Token lv_passwd_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVitsika.g:661:2: ( (otherlv_0= 'manokatraWifi' otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_passwd_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalVitsika.g:662:2: (otherlv_0= 'manokatraWifi' otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_passwd_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalVitsika.g:662:2: (otherlv_0= 'manokatraWifi' otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_passwd_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalVitsika.g:663:3: otherlv_0= 'manokatraWifi' otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_passwd_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiCreateAccess().getManokatraWifiKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWifiCreateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVitsika.g:671:3: ( (lv_ssid_2_0= RULE_STRING ) )
            // InternalVitsika.g:672:4: (lv_ssid_2_0= RULE_STRING )
            {
            // InternalVitsika.g:672:4: (lv_ssid_2_0= RULE_STRING )
            // InternalVitsika.g:673:5: lv_ssid_2_0= RULE_STRING
            {
            lv_ssid_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_ssid_2_0, grammarAccess.getWifiCreateAccess().getSsidSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ssid",
            						lv_ssid_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWifiCreateAccess().getCommaKeyword_3());
            		
            // InternalVitsika.g:693:3: ( (lv_passwd_4_0= RULE_STRING ) )
            // InternalVitsika.g:694:4: (lv_passwd_4_0= RULE_STRING )
            {
            // InternalVitsika.g:694:4: (lv_passwd_4_0= RULE_STRING )
            // InternalVitsika.g:695:5: lv_passwd_4_0= RULE_STRING
            {
            lv_passwd_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_passwd_4_0, grammarAccess.getWifiCreateAccess().getPasswdSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"passwd",
            						lv_passwd_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWifiCreateAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleWifiCreate"


    // $ANTLR start "entryRuleTypewrite"
    // InternalVitsika.g:719:1: entryRuleTypewrite returns [EObject current=null] : iv_ruleTypewrite= ruleTypewrite EOF ;
    public final EObject entryRuleTypewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypewrite = null;


        try {
            // InternalVitsika.g:719:50: (iv_ruleTypewrite= ruleTypewrite EOF )
            // InternalVitsika.g:720:2: iv_ruleTypewrite= ruleTypewrite EOF
            {
             newCompositeNode(grammarAccess.getTypewriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypewrite=ruleTypewrite();

            state._fsp--;

             current =iv_ruleTypewrite; 
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
    // $ANTLR end "entryRuleTypewrite"


    // $ANTLR start "ruleTypewrite"
    // InternalVitsika.g:726:1: ruleTypewrite returns [EObject current=null] : (otherlv_0= 'Soraty' otherlv_1= ':' ( (lv_soratra_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypewrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_soratra_2_0=null;


        	enterRule();

        try {
            // InternalVitsika.g:732:2: ( (otherlv_0= 'Soraty' otherlv_1= ':' ( (lv_soratra_2_0= RULE_STRING ) ) ) )
            // InternalVitsika.g:733:2: (otherlv_0= 'Soraty' otherlv_1= ':' ( (lv_soratra_2_0= RULE_STRING ) ) )
            {
            // InternalVitsika.g:733:2: (otherlv_0= 'Soraty' otherlv_1= ':' ( (lv_soratra_2_0= RULE_STRING ) ) )
            // InternalVitsika.g:734:3: otherlv_0= 'Soraty' otherlv_1= ':' ( (lv_soratra_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTypewriteAccess().getSoratyKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypewriteAccess().getColonKeyword_1());
            		
            // InternalVitsika.g:742:3: ( (lv_soratra_2_0= RULE_STRING ) )
            // InternalVitsika.g:743:4: (lv_soratra_2_0= RULE_STRING )
            {
            // InternalVitsika.g:743:4: (lv_soratra_2_0= RULE_STRING )
            // InternalVitsika.g:744:5: lv_soratra_2_0= RULE_STRING
            {
            lv_soratra_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_soratra_2_0, grammarAccess.getTypewriteAccess().getSoratraSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypewriteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"soratra",
            						lv_soratra_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTypewrite"


    // $ANTLR start "entryRuleWordTypingAuto"
    // InternalVitsika.g:764:1: entryRuleWordTypingAuto returns [EObject current=null] : iv_ruleWordTypingAuto= ruleWordTypingAuto EOF ;
    public final EObject entryRuleWordTypingAuto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordTypingAuto = null;


        try {
            // InternalVitsika.g:764:55: (iv_ruleWordTypingAuto= ruleWordTypingAuto EOF )
            // InternalVitsika.g:765:2: iv_ruleWordTypingAuto= ruleWordTypingAuto EOF
            {
             newCompositeNode(grammarAccess.getWordTypingAutoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordTypingAuto=ruleWordTypingAuto();

            state._fsp--;

             current =iv_ruleWordTypingAuto; 
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
    // $ANTLR end "entryRuleWordTypingAuto"


    // $ANTLR start "ruleWordTypingAuto"
    // InternalVitsika.g:771:1: ruleWordTypingAuto returns [EObject current=null] : (otherlv_0= 'manoratra_word' otherlv_1= ':' ( (lv_teny_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleWordTypingAuto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_teny_2_0=null;


        	enterRule();

        try {
            // InternalVitsika.g:777:2: ( (otherlv_0= 'manoratra_word' otherlv_1= ':' ( (lv_teny_2_0= RULE_STRING ) ) ) )
            // InternalVitsika.g:778:2: (otherlv_0= 'manoratra_word' otherlv_1= ':' ( (lv_teny_2_0= RULE_STRING ) ) )
            {
            // InternalVitsika.g:778:2: (otherlv_0= 'manoratra_word' otherlv_1= ':' ( (lv_teny_2_0= RULE_STRING ) ) )
            // InternalVitsika.g:779:3: otherlv_0= 'manoratra_word' otherlv_1= ':' ( (lv_teny_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWordTypingAutoAccess().getManoratra_wordKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWordTypingAutoAccess().getColonKeyword_1());
            		
            // InternalVitsika.g:787:3: ( (lv_teny_2_0= RULE_STRING ) )
            // InternalVitsika.g:788:4: (lv_teny_2_0= RULE_STRING )
            {
            // InternalVitsika.g:788:4: (lv_teny_2_0= RULE_STRING )
            // InternalVitsika.g:789:5: lv_teny_2_0= RULE_STRING
            {
            lv_teny_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_teny_2_0, grammarAccess.getWordTypingAutoAccess().getTenySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWordTypingAutoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"teny",
            						lv_teny_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleWordTypingAuto"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000003E8C8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});

}