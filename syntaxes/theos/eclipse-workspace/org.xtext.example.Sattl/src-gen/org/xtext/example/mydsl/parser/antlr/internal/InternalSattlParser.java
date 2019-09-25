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
import org.xtext.example.mydsl.services.SattlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSattlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'OR'", "'AND'", "'NAND'", "'IMPLIES'", "'BIIMPLIES'", "'NOT'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSattlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSattlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSattlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSattl.g"; }



     	private SattlGrammarAccess grammarAccess;

        public InternalSattlParser(TokenStream input, SattlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected SattlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalSattl.g:64:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalSattl.g:64:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalSattl.g:65:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalSattl.g:71:1: ruleDocument returns [EObject current=null] : ( (lv_Form_0_0= ruleFormulae ) )* ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_Form_0_0 = null;



        	enterRule();

        try {
            // InternalSattl.g:77:2: ( ( (lv_Form_0_0= ruleFormulae ) )* )
            // InternalSattl.g:78:2: ( (lv_Form_0_0= ruleFormulae ) )*
            {
            // InternalSattl.g:78:2: ( (lv_Form_0_0= ruleFormulae ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSattl.g:79:3: (lv_Form_0_0= ruleFormulae )
            	    {
            	    // InternalSattl.g:79:3: (lv_Form_0_0= ruleFormulae )
            	    // InternalSattl.g:80:4: lv_Form_0_0= ruleFormulae
            	    {

            	    				newCompositeNode(grammarAccess.getDocumentAccess().getFormFormulaeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Form_0_0=ruleFormulae();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Form",
            	    					lv_Form_0_0,
            	    					"org.xtext.example.mydsl.Sattl.Formulae");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleFormulae"
    // InternalSattl.g:100:1: entryRuleFormulae returns [EObject current=null] : iv_ruleFormulae= ruleFormulae EOF ;
    public final EObject entryRuleFormulae() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulae = null;


        try {
            // InternalSattl.g:100:49: (iv_ruleFormulae= ruleFormulae EOF )
            // InternalSattl.g:101:2: iv_ruleFormulae= ruleFormulae EOF
            {
             newCompositeNode(grammarAccess.getFormulaeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulae=ruleFormulae();

            state._fsp--;

             current =iv_ruleFormulae; 
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
    // $ANTLR end "entryRuleFormulae"


    // $ANTLR start "ruleFormulae"
    // InternalSattl.g:107:1: ruleFormulae returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' ) | ( (lv_atom_9_0= ruleAtom ) ) ) ;
    public final EObject ruleFormulae() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_form_left_1_0 = null;

        AntlrDatatypeRuleToken lv_binop_2_0 = null;

        EObject lv_form_right_3_0 = null;

        AntlrDatatypeRuleToken lv_unop_6_0 = null;

        EObject lv_form_7_0 = null;

        EObject lv_atom_9_0 = null;



        	enterRule();

        try {
            // InternalSattl.g:113:2: ( ( (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' ) | ( (lv_atom_9_0= ruleAtom ) ) ) )
            // InternalSattl.g:114:2: ( (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' ) | ( (lv_atom_9_0= ruleAtom ) ) )
            {
            // InternalSattl.g:114:2: ( (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' ) | ( (lv_atom_9_0= ruleAtom ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID||LA2_1==11) ) {
                    alt2=1;
                }
                else if ( (LA2_1==18) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSattl.g:115:3: (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' )
                    {
                    // InternalSattl.g:115:3: (otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')' )
                    // InternalSattl.g:116:4: otherlv_0= '(' ( (lv_form_left_1_0= ruleFormulae ) ) ( (lv_binop_2_0= ruleBinop ) ) ( (lv_form_right_3_0= ruleFormulae ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalSattl.g:120:4: ( (lv_form_left_1_0= ruleFormulae ) )
                    // InternalSattl.g:121:5: (lv_form_left_1_0= ruleFormulae )
                    {
                    // InternalSattl.g:121:5: (lv_form_left_1_0= ruleFormulae )
                    // InternalSattl.g:122:6: lv_form_left_1_0= ruleFormulae
                    {

                    						newCompositeNode(grammarAccess.getFormulaeAccess().getForm_leftFormulaeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_form_left_1_0=ruleFormulae();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    						}
                    						add(
                    							current,
                    							"form_left",
                    							lv_form_left_1_0,
                    							"org.xtext.example.mydsl.Sattl.Formulae");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSattl.g:139:4: ( (lv_binop_2_0= ruleBinop ) )
                    // InternalSattl.g:140:5: (lv_binop_2_0= ruleBinop )
                    {
                    // InternalSattl.g:140:5: (lv_binop_2_0= ruleBinop )
                    // InternalSattl.g:141:6: lv_binop_2_0= ruleBinop
                    {

                    						newCompositeNode(grammarAccess.getFormulaeAccess().getBinopBinopParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_binop_2_0=ruleBinop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    						}
                    						add(
                    							current,
                    							"binop",
                    							lv_binop_2_0,
                    							"org.xtext.example.mydsl.Sattl.Binop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSattl.g:158:4: ( (lv_form_right_3_0= ruleFormulae ) )
                    // InternalSattl.g:159:5: (lv_form_right_3_0= ruleFormulae )
                    {
                    // InternalSattl.g:159:5: (lv_form_right_3_0= ruleFormulae )
                    // InternalSattl.g:160:6: lv_form_right_3_0= ruleFormulae
                    {

                    						newCompositeNode(grammarAccess.getFormulaeAccess().getForm_rightFormulaeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_form_right_3_0=ruleFormulae();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    						}
                    						add(
                    							current,
                    							"form_right",
                    							lv_form_right_3_0,
                    							"org.xtext.example.mydsl.Sattl.Formulae");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSattl.g:183:3: (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' )
                    {
                    // InternalSattl.g:183:3: (otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')' )
                    // InternalSattl.g:184:4: otherlv_5= '(' ( (lv_unop_6_0= ruleUnop ) ) ( (lv_form_7_0= ruleFormulae ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSattl.g:188:4: ( (lv_unop_6_0= ruleUnop ) )
                    // InternalSattl.g:189:5: (lv_unop_6_0= ruleUnop )
                    {
                    // InternalSattl.g:189:5: (lv_unop_6_0= ruleUnop )
                    // InternalSattl.g:190:6: lv_unop_6_0= ruleUnop
                    {

                    						newCompositeNode(grammarAccess.getFormulaeAccess().getUnopUnopParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_unop_6_0=ruleUnop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    						}
                    						add(
                    							current,
                    							"unop",
                    							lv_unop_6_0,
                    							"org.xtext.example.mydsl.Sattl.Unop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSattl.g:207:4: ( (lv_form_7_0= ruleFormulae ) )
                    // InternalSattl.g:208:5: (lv_form_7_0= ruleFormulae )
                    {
                    // InternalSattl.g:208:5: (lv_form_7_0= ruleFormulae )
                    // InternalSattl.g:209:6: lv_form_7_0= ruleFormulae
                    {

                    						newCompositeNode(grammarAccess.getFormulaeAccess().getFormFormulaeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_form_7_0=ruleFormulae();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    						}
                    						add(
                    							current,
                    							"form",
                    							lv_form_7_0,
                    							"org.xtext.example.mydsl.Sattl.Formulae");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSattl.g:232:3: ( (lv_atom_9_0= ruleAtom ) )
                    {
                    // InternalSattl.g:232:3: ( (lv_atom_9_0= ruleAtom ) )
                    // InternalSattl.g:233:4: (lv_atom_9_0= ruleAtom )
                    {
                    // InternalSattl.g:233:4: (lv_atom_9_0= ruleAtom )
                    // InternalSattl.g:234:5: lv_atom_9_0= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getFormulaeAccess().getAtomAtomParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atom_9_0=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormulaeRule());
                    					}
                    					add(
                    						current,
                    						"atom",
                    						lv_atom_9_0,
                    						"org.xtext.example.mydsl.Sattl.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleFormulae"


    // $ANTLR start "entryRuleAtom"
    // InternalSattl.g:255:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSattl.g:255:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSattl.g:256:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSattl.g:262:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSattl.g:268:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSattl.g:269:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSattl.g:269:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSattl.g:270:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSattl.g:270:3: (lv_name_0_0= RULE_ID )
            // InternalSattl.g:271:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleBinop"
    // InternalSattl.g:290:1: entryRuleBinop returns [String current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final String entryRuleBinop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinop = null;


        try {
            // InternalSattl.g:290:45: (iv_ruleBinop= ruleBinop EOF )
            // InternalSattl.g:291:2: iv_ruleBinop= ruleBinop EOF
            {
             newCompositeNode(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinop=ruleBinop();

            state._fsp--;

             current =iv_ruleBinop.getText(); 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalSattl.g:297:1: ruleBinop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OR' | kw= 'AND' | kw= 'NAND' | kw= 'IMPLIES' | kw= 'BIIMPLIES' ) ;
    public final AntlrDatatypeRuleToken ruleBinop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSattl.g:303:2: ( (kw= 'OR' | kw= 'AND' | kw= 'NAND' | kw= 'IMPLIES' | kw= 'BIIMPLIES' ) )
            // InternalSattl.g:304:2: (kw= 'OR' | kw= 'AND' | kw= 'NAND' | kw= 'IMPLIES' | kw= 'BIIMPLIES' )
            {
            // InternalSattl.g:304:2: (kw= 'OR' | kw= 'AND' | kw= 'NAND' | kw= 'IMPLIES' | kw= 'BIIMPLIES' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSattl.g:305:3: kw= 'OR'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getORKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSattl.g:311:3: kw= 'AND'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getANDKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSattl.g:317:3: kw= 'NAND'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getNANDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSattl.g:323:3: kw= 'IMPLIES'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getIMPLIESKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSattl.g:329:3: kw= 'BIIMPLIES'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinopAccess().getBIIMPLIESKeyword_4());
                    		

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleUnop"
    // InternalSattl.g:338:1: entryRuleUnop returns [String current=null] : iv_ruleUnop= ruleUnop EOF ;
    public final String entryRuleUnop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnop = null;


        try {
            // InternalSattl.g:338:44: (iv_ruleUnop= ruleUnop EOF )
            // InternalSattl.g:339:2: iv_ruleUnop= ruleUnop EOF
            {
             newCompositeNode(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnop=ruleUnop();

            state._fsp--;

             current =iv_ruleUnop.getText(); 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalSattl.g:345:1: ruleUnop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleUnop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSattl.g:351:2: (kw= 'NOT' )
            // InternalSattl.g:352:2: kw= 'NOT'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnopAccess().getNOTKeyword());
            	

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
    // $ANTLR end "ruleUnop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}