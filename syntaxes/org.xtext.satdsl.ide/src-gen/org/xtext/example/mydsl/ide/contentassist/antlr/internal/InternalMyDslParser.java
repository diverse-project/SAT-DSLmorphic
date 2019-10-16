package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'^'", "'v'", "'->'", "'<->'", "'|'", "'#t'", "'#f'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:53:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleExpression EOF )
            // InternalMyDsl.g:55:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:62:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:69:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinExpr"
    // InternalMyDsl.g:78:1: entryRuleBinExpr : ruleBinExpr EOF ;
    public final void entryRuleBinExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBinExpr EOF )
            // InternalMyDsl.g:80:1: ruleBinExpr EOF
            {
             before(grammarAccess.getBinExprRule()); 
            pushFollow(FOLLOW_1);
            ruleBinExpr();

            state._fsp--;

             after(grammarAccess.getBinExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinExpr"


    // $ANTLR start "ruleBinExpr"
    // InternalMyDsl.g:87:1: ruleBinExpr : ( ( rule__BinExpr__Group__0 ) ) ;
    public final void ruleBinExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__BinExpr__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__BinExpr__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__BinExpr__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__BinExpr__Group__0 )
            {
             before(grammarAccess.getBinExprAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__BinExpr__Group__0 )
            // InternalMyDsl.g:94:4: rule__BinExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinExpr"


    // $ANTLR start "entryRuleBinOp"
    // InternalMyDsl.g:103:1: entryRuleBinOp : ruleBinOp EOF ;
    public final void entryRuleBinOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBinOp EOF )
            // InternalMyDsl.g:105:1: ruleBinOp EOF
            {
             before(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getBinOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalMyDsl.g:112:1: ruleBinOp : ( ( rule__BinOp__Alternatives ) ) ;
    public final void ruleBinOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__BinOp__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__BinOp__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__BinOp__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__BinOp__Alternatives )
            {
             before(grammarAccess.getBinOpAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__BinOp__Alternatives )
            // InternalMyDsl.g:119:4: rule__BinOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnExpr"
    // InternalMyDsl.g:128:1: entryRuleUnExpr : ruleUnExpr EOF ;
    public final void entryRuleUnExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleUnExpr EOF )
            // InternalMyDsl.g:130:1: ruleUnExpr EOF
            {
             before(grammarAccess.getUnExprRule()); 
            pushFollow(FOLLOW_1);
            ruleUnExpr();

            state._fsp--;

             after(grammarAccess.getUnExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnExpr"


    // $ANTLR start "ruleUnExpr"
    // InternalMyDsl.g:137:1: ruleUnExpr : ( ( rule__UnExpr__Group__0 ) ) ;
    public final void ruleUnExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__UnExpr__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__UnExpr__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__UnExpr__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__UnExpr__Group__0 )
            {
             before(grammarAccess.getUnExprAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__UnExpr__Group__0 )
            // InternalMyDsl.g:144:4: rule__UnExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnExpr"


    // $ANTLR start "entryRuleUnOp"
    // InternalMyDsl.g:153:1: entryRuleUnOp : ruleUnOp EOF ;
    public final void entryRuleUnOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleUnOp EOF )
            // InternalMyDsl.g:155:1: ruleUnOp EOF
            {
             before(grammarAccess.getUnOpRule()); 
            pushFollow(FOLLOW_1);
            ruleUnOp();

            state._fsp--;

             after(grammarAccess.getUnOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnOp"


    // $ANTLR start "ruleUnOp"
    // InternalMyDsl.g:162:1: ruleUnOp : ( '!' ) ;
    public final void ruleUnOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( '!' ) )
            // InternalMyDsl.g:167:2: ( '!' )
            {
            // InternalMyDsl.g:167:2: ( '!' )
            // InternalMyDsl.g:168:3: '!'
            {
             before(grammarAccess.getUnOpAccess().getExclamationMarkKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnOpAccess().getExclamationMarkKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnOp"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:178:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLiteral EOF )
            // InternalMyDsl.g:180:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:187:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Literal__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Literal__Alternatives )
            // InternalMyDsl.g:194:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:203:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAtom EOF )
            // InternalMyDsl.g:205:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMyDsl.g:212:1: ruleAtom : ( ( rule__Atom__NameAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Atom__NameAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Atom__NameAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Atom__NameAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__Atom__NameAssignment )
            {
             before(grammarAccess.getAtomAccess().getNameAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__Atom__NameAssignment )
            // InternalMyDsl.g:219:4: rule__Atom__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atom__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleConst"
    // InternalMyDsl.g:228:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleConst EOF )
            // InternalMyDsl.g:230:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalMyDsl.g:237:1: ruleConst : ( ( rule__Const__Alternatives ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Const__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Const__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Const__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Const__Alternatives )
            {
             before(grammarAccess.getConstAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Const__Alternatives )
            // InternalMyDsl.g:244:4: rule__Const__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Const__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:252:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ruleUnExpr ) | ( ruleLiteral ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ruleUnExpr ) | ( ruleLiteral ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID||(LA1_1>=17 && LA1_1<=19)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==11) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=17 && LA1_0<=18)) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:257:2: ( ( rule__Expression__ExprAssignment_0 ) )
                    {
                    // InternalMyDsl.g:257:2: ( ( rule__Expression__ExprAssignment_0 ) )
                    // InternalMyDsl.g:258:3: ( rule__Expression__ExprAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getExprAssignment_0()); 
                    // InternalMyDsl.g:259:3: ( rule__Expression__ExprAssignment_0 )
                    // InternalMyDsl.g:259:4: rule__Expression__ExprAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ExprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:2: ( ruleUnExpr )
                    {
                    // InternalMyDsl.g:263:2: ( ruleUnExpr )
                    // InternalMyDsl.g:264:3: ruleUnExpr
                    {
                     before(grammarAccess.getExpressionAccess().getUnExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnExpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUnExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:269:2: ( ruleLiteral )
                    {
                    // InternalMyDsl.g:269:2: ( ruleLiteral )
                    // InternalMyDsl.g:270:3: ruleLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BinOp__Alternatives"
    // InternalMyDsl.g:279:1: rule__BinOp__Alternatives : ( ( '^' ) | ( 'v' ) | ( '->' ) | ( '<->' ) | ( '|' ) );
    public final void rule__BinOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( ( '^' ) | ( 'v' ) | ( '->' ) | ( '<->' ) | ( '|' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:284:2: ( '^' )
                    {
                    // InternalMyDsl.g:284:2: ( '^' )
                    // InternalMyDsl.g:285:3: '^'
                    {
                     before(grammarAccess.getBinOpAccess().getCircumflexAccentKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getCircumflexAccentKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:290:2: ( 'v' )
                    {
                    // InternalMyDsl.g:290:2: ( 'v' )
                    // InternalMyDsl.g:291:3: 'v'
                    {
                     before(grammarAccess.getBinOpAccess().getVKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getVKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:296:2: ( '->' )
                    {
                    // InternalMyDsl.g:296:2: ( '->' )
                    // InternalMyDsl.g:297:3: '->'
                    {
                     before(grammarAccess.getBinOpAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:302:2: ( '<->' )
                    {
                    // InternalMyDsl.g:302:2: ( '<->' )
                    // InternalMyDsl.g:303:3: '<->'
                    {
                     before(grammarAccess.getBinOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:308:2: ( '|' )
                    {
                    // InternalMyDsl.g:308:2: ( '|' )
                    // InternalMyDsl.g:309:3: '|'
                    {
                     before(grammarAccess.getBinOpAccess().getVerticalLineKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinOpAccess().getVerticalLineKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinOp__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMyDsl.g:318:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Lit_atomAssignment_0 ) ) | ( ( rule__Literal__Lit_constAssignment_1 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ( rule__Literal__Lit_atomAssignment_0 ) ) | ( ( rule__Literal__Lit_constAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:323:2: ( ( rule__Literal__Lit_atomAssignment_0 ) )
                    {
                    // InternalMyDsl.g:323:2: ( ( rule__Literal__Lit_atomAssignment_0 ) )
                    // InternalMyDsl.g:324:3: ( rule__Literal__Lit_atomAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getLit_atomAssignment_0()); 
                    // InternalMyDsl.g:325:3: ( rule__Literal__Lit_atomAssignment_0 )
                    // InternalMyDsl.g:325:4: rule__Literal__Lit_atomAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Lit_atomAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getLit_atomAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:329:2: ( ( rule__Literal__Lit_constAssignment_1 ) )
                    {
                    // InternalMyDsl.g:329:2: ( ( rule__Literal__Lit_constAssignment_1 ) )
                    // InternalMyDsl.g:330:3: ( rule__Literal__Lit_constAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getLit_constAssignment_1()); 
                    // InternalMyDsl.g:331:3: ( rule__Literal__Lit_constAssignment_1 )
                    // InternalMyDsl.g:331:4: rule__Literal__Lit_constAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Lit_constAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getLit_constAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Const__Alternatives"
    // InternalMyDsl.g:339:1: rule__Const__Alternatives : ( ( '#t' ) | ( '#f' ) );
    public final void rule__Const__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( '#t' ) | ( '#f' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:344:2: ( '#t' )
                    {
                    // InternalMyDsl.g:344:2: ( '#t' )
                    // InternalMyDsl.g:345:3: '#t'
                    {
                     before(grammarAccess.getConstAccess().getTKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:350:2: ( '#f' )
                    {
                    // InternalMyDsl.g:350:2: ( '#f' )
                    // InternalMyDsl.g:351:3: '#f'
                    {
                     before(grammarAccess.getConstAccess().getFKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getFKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Alternatives"


    // $ANTLR start "rule__BinExpr__Group__0"
    // InternalMyDsl.g:360:1: rule__BinExpr__Group__0 : rule__BinExpr__Group__0__Impl rule__BinExpr__Group__1 ;
    public final void rule__BinExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__BinExpr__Group__0__Impl rule__BinExpr__Group__1 )
            // InternalMyDsl.g:365:2: rule__BinExpr__Group__0__Impl rule__BinExpr__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BinExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__0"


    // $ANTLR start "rule__BinExpr__Group__0__Impl"
    // InternalMyDsl.g:372:1: rule__BinExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__BinExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( ( '(' ) )
            // InternalMyDsl.g:377:1: ( '(' )
            {
            // InternalMyDsl.g:377:1: ( '(' )
            // InternalMyDsl.g:378:2: '('
            {
             before(grammarAccess.getBinExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBinExprAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__0__Impl"


    // $ANTLR start "rule__BinExpr__Group__1"
    // InternalMyDsl.g:387:1: rule__BinExpr__Group__1 : rule__BinExpr__Group__1__Impl rule__BinExpr__Group__2 ;
    public final void rule__BinExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__BinExpr__Group__1__Impl rule__BinExpr__Group__2 )
            // InternalMyDsl.g:392:2: rule__BinExpr__Group__1__Impl rule__BinExpr__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BinExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__1"


    // $ANTLR start "rule__BinExpr__Group__1__Impl"
    // InternalMyDsl.g:399:1: rule__BinExpr__Group__1__Impl : ( ( rule__BinExpr__LeftexprAssignment_1 ) ) ;
    public final void rule__BinExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( ( rule__BinExpr__LeftexprAssignment_1 ) ) )
            // InternalMyDsl.g:404:1: ( ( rule__BinExpr__LeftexprAssignment_1 ) )
            {
            // InternalMyDsl.g:404:1: ( ( rule__BinExpr__LeftexprAssignment_1 ) )
            // InternalMyDsl.g:405:2: ( rule__BinExpr__LeftexprAssignment_1 )
            {
             before(grammarAccess.getBinExprAccess().getLeftexprAssignment_1()); 
            // InternalMyDsl.g:406:2: ( rule__BinExpr__LeftexprAssignment_1 )
            // InternalMyDsl.g:406:3: rule__BinExpr__LeftexprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinExpr__LeftexprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinExprAccess().getLeftexprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__1__Impl"


    // $ANTLR start "rule__BinExpr__Group__2"
    // InternalMyDsl.g:414:1: rule__BinExpr__Group__2 : rule__BinExpr__Group__2__Impl rule__BinExpr__Group__3 ;
    public final void rule__BinExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__BinExpr__Group__2__Impl rule__BinExpr__Group__3 )
            // InternalMyDsl.g:419:2: rule__BinExpr__Group__2__Impl rule__BinExpr__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__BinExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__2"


    // $ANTLR start "rule__BinExpr__Group__2__Impl"
    // InternalMyDsl.g:426:1: rule__BinExpr__Group__2__Impl : ( ( rule__BinExpr__OpAssignment_2 ) ) ;
    public final void rule__BinExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( ( rule__BinExpr__OpAssignment_2 ) ) )
            // InternalMyDsl.g:431:1: ( ( rule__BinExpr__OpAssignment_2 ) )
            {
            // InternalMyDsl.g:431:1: ( ( rule__BinExpr__OpAssignment_2 ) )
            // InternalMyDsl.g:432:2: ( rule__BinExpr__OpAssignment_2 )
            {
             before(grammarAccess.getBinExprAccess().getOpAssignment_2()); 
            // InternalMyDsl.g:433:2: ( rule__BinExpr__OpAssignment_2 )
            // InternalMyDsl.g:433:3: rule__BinExpr__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinExpr__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinExprAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__2__Impl"


    // $ANTLR start "rule__BinExpr__Group__3"
    // InternalMyDsl.g:441:1: rule__BinExpr__Group__3 : rule__BinExpr__Group__3__Impl rule__BinExpr__Group__4 ;
    public final void rule__BinExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__BinExpr__Group__3__Impl rule__BinExpr__Group__4 )
            // InternalMyDsl.g:446:2: rule__BinExpr__Group__3__Impl rule__BinExpr__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__BinExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__3"


    // $ANTLR start "rule__BinExpr__Group__3__Impl"
    // InternalMyDsl.g:453:1: rule__BinExpr__Group__3__Impl : ( ( rule__BinExpr__RightexprAssignment_3 ) ) ;
    public final void rule__BinExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ( rule__BinExpr__RightexprAssignment_3 ) ) )
            // InternalMyDsl.g:458:1: ( ( rule__BinExpr__RightexprAssignment_3 ) )
            {
            // InternalMyDsl.g:458:1: ( ( rule__BinExpr__RightexprAssignment_3 ) )
            // InternalMyDsl.g:459:2: ( rule__BinExpr__RightexprAssignment_3 )
            {
             before(grammarAccess.getBinExprAccess().getRightexprAssignment_3()); 
            // InternalMyDsl.g:460:2: ( rule__BinExpr__RightexprAssignment_3 )
            // InternalMyDsl.g:460:3: rule__BinExpr__RightexprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinExpr__RightexprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinExprAccess().getRightexprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__3__Impl"


    // $ANTLR start "rule__BinExpr__Group__4"
    // InternalMyDsl.g:468:1: rule__BinExpr__Group__4 : rule__BinExpr__Group__4__Impl ;
    public final void rule__BinExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__BinExpr__Group__4__Impl )
            // InternalMyDsl.g:473:2: rule__BinExpr__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinExpr__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__4"


    // $ANTLR start "rule__BinExpr__Group__4__Impl"
    // InternalMyDsl.g:479:1: rule__BinExpr__Group__4__Impl : ( ')' ) ;
    public final void rule__BinExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( ( ')' ) )
            // InternalMyDsl.g:484:1: ( ')' )
            {
            // InternalMyDsl.g:484:1: ( ')' )
            // InternalMyDsl.g:485:2: ')'
            {
             before(grammarAccess.getBinExprAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBinExprAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__Group__4__Impl"


    // $ANTLR start "rule__UnExpr__Group__0"
    // InternalMyDsl.g:495:1: rule__UnExpr__Group__0 : rule__UnExpr__Group__0__Impl rule__UnExpr__Group__1 ;
    public final void rule__UnExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__UnExpr__Group__0__Impl rule__UnExpr__Group__1 )
            // InternalMyDsl.g:500:2: rule__UnExpr__Group__0__Impl rule__UnExpr__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__UnExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__0"


    // $ANTLR start "rule__UnExpr__Group__0__Impl"
    // InternalMyDsl.g:507:1: rule__UnExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__UnExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( '(' ) )
            // InternalMyDsl.g:512:1: ( '(' )
            {
            // InternalMyDsl.g:512:1: ( '(' )
            // InternalMyDsl.g:513:2: '('
            {
             before(grammarAccess.getUnExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnExprAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__0__Impl"


    // $ANTLR start "rule__UnExpr__Group__1"
    // InternalMyDsl.g:522:1: rule__UnExpr__Group__1 : rule__UnExpr__Group__1__Impl rule__UnExpr__Group__2 ;
    public final void rule__UnExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__UnExpr__Group__1__Impl rule__UnExpr__Group__2 )
            // InternalMyDsl.g:527:2: rule__UnExpr__Group__1__Impl rule__UnExpr__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__UnExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__1"


    // $ANTLR start "rule__UnExpr__Group__1__Impl"
    // InternalMyDsl.g:534:1: rule__UnExpr__Group__1__Impl : ( ( rule__UnExpr__OpAssignment_1 ) ) ;
    public final void rule__UnExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( ( rule__UnExpr__OpAssignment_1 ) ) )
            // InternalMyDsl.g:539:1: ( ( rule__UnExpr__OpAssignment_1 ) )
            {
            // InternalMyDsl.g:539:1: ( ( rule__UnExpr__OpAssignment_1 ) )
            // InternalMyDsl.g:540:2: ( rule__UnExpr__OpAssignment_1 )
            {
             before(grammarAccess.getUnExprAccess().getOpAssignment_1()); 
            // InternalMyDsl.g:541:2: ( rule__UnExpr__OpAssignment_1 )
            // InternalMyDsl.g:541:3: rule__UnExpr__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnExpr__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnExprAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__1__Impl"


    // $ANTLR start "rule__UnExpr__Group__2"
    // InternalMyDsl.g:549:1: rule__UnExpr__Group__2 : rule__UnExpr__Group__2__Impl rule__UnExpr__Group__3 ;
    public final void rule__UnExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__UnExpr__Group__2__Impl rule__UnExpr__Group__3 )
            // InternalMyDsl.g:554:2: rule__UnExpr__Group__2__Impl rule__UnExpr__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UnExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__2"


    // $ANTLR start "rule__UnExpr__Group__2__Impl"
    // InternalMyDsl.g:561:1: rule__UnExpr__Group__2__Impl : ( ( rule__UnExpr__ExprAssignment_2 ) ) ;
    public final void rule__UnExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( ( rule__UnExpr__ExprAssignment_2 ) ) )
            // InternalMyDsl.g:566:1: ( ( rule__UnExpr__ExprAssignment_2 ) )
            {
            // InternalMyDsl.g:566:1: ( ( rule__UnExpr__ExprAssignment_2 ) )
            // InternalMyDsl.g:567:2: ( rule__UnExpr__ExprAssignment_2 )
            {
             before(grammarAccess.getUnExprAccess().getExprAssignment_2()); 
            // InternalMyDsl.g:568:2: ( rule__UnExpr__ExprAssignment_2 )
            // InternalMyDsl.g:568:3: rule__UnExpr__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnExpr__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnExprAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__2__Impl"


    // $ANTLR start "rule__UnExpr__Group__3"
    // InternalMyDsl.g:576:1: rule__UnExpr__Group__3 : rule__UnExpr__Group__3__Impl ;
    public final void rule__UnExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__UnExpr__Group__3__Impl )
            // InternalMyDsl.g:581:2: rule__UnExpr__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnExpr__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__3"


    // $ANTLR start "rule__UnExpr__Group__3__Impl"
    // InternalMyDsl.g:587:1: rule__UnExpr__Group__3__Impl : ( ')' ) ;
    public final void rule__UnExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ')' ) )
            // InternalMyDsl.g:592:1: ( ')' )
            {
            // InternalMyDsl.g:592:1: ( ')' )
            // InternalMyDsl.g:593:2: ')'
            {
             before(grammarAccess.getUnExprAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnExprAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__Group__3__Impl"


    // $ANTLR start "rule__Expression__ExprAssignment_0"
    // InternalMyDsl.g:603:1: rule__Expression__ExprAssignment_0 : ( ruleBinExpr ) ;
    public final void rule__Expression__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ruleBinExpr ) )
            // InternalMyDsl.g:608:2: ( ruleBinExpr )
            {
            // InternalMyDsl.g:608:2: ( ruleBinExpr )
            // InternalMyDsl.g:609:3: ruleBinExpr
            {
             before(grammarAccess.getExpressionAccess().getExprBinExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinExpr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExprBinExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExprAssignment_0"


    // $ANTLR start "rule__BinExpr__LeftexprAssignment_1"
    // InternalMyDsl.g:618:1: rule__BinExpr__LeftexprAssignment_1 : ( ruleExpression ) ;
    public final void rule__BinExpr__LeftexprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:623:2: ( ruleExpression )
            {
            // InternalMyDsl.g:623:2: ( ruleExpression )
            // InternalMyDsl.g:624:3: ruleExpression
            {
             before(grammarAccess.getBinExprAccess().getLeftexprExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinExprAccess().getLeftexprExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__LeftexprAssignment_1"


    // $ANTLR start "rule__BinExpr__OpAssignment_2"
    // InternalMyDsl.g:633:1: rule__BinExpr__OpAssignment_2 : ( ruleBinOp ) ;
    public final void rule__BinExpr__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ruleBinOp ) )
            // InternalMyDsl.g:638:2: ( ruleBinOp )
            {
            // InternalMyDsl.g:638:2: ( ruleBinOp )
            // InternalMyDsl.g:639:3: ruleBinOp
            {
             before(grammarAccess.getBinExprAccess().getOpBinOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinOp();

            state._fsp--;

             after(grammarAccess.getBinExprAccess().getOpBinOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__OpAssignment_2"


    // $ANTLR start "rule__BinExpr__RightexprAssignment_3"
    // InternalMyDsl.g:648:1: rule__BinExpr__RightexprAssignment_3 : ( ruleExpression ) ;
    public final void rule__BinExpr__RightexprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:653:2: ( ruleExpression )
            {
            // InternalMyDsl.g:653:2: ( ruleExpression )
            // InternalMyDsl.g:654:3: ruleExpression
            {
             before(grammarAccess.getBinExprAccess().getRightexprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinExprAccess().getRightexprExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExpr__RightexprAssignment_3"


    // $ANTLR start "rule__UnExpr__OpAssignment_1"
    // InternalMyDsl.g:663:1: rule__UnExpr__OpAssignment_1 : ( ruleUnOp ) ;
    public final void rule__UnExpr__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( ruleUnOp ) )
            // InternalMyDsl.g:668:2: ( ruleUnOp )
            {
            // InternalMyDsl.g:668:2: ( ruleUnOp )
            // InternalMyDsl.g:669:3: ruleUnOp
            {
             before(grammarAccess.getUnExprAccess().getOpUnOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnOp();

            state._fsp--;

             after(grammarAccess.getUnExprAccess().getOpUnOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__OpAssignment_1"


    // $ANTLR start "rule__UnExpr__ExprAssignment_2"
    // InternalMyDsl.g:678:1: rule__UnExpr__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__UnExpr__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:683:2: ( ruleExpression )
            {
            // InternalMyDsl.g:683:2: ( ruleExpression )
            // InternalMyDsl.g:684:3: ruleExpression
            {
             before(grammarAccess.getUnExprAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUnExprAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpr__ExprAssignment_2"


    // $ANTLR start "rule__Literal__Lit_atomAssignment_0"
    // InternalMyDsl.g:693:1: rule__Literal__Lit_atomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Literal__Lit_atomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:698:2: ( ruleAtom )
            {
            // InternalMyDsl.g:698:2: ( ruleAtom )
            // InternalMyDsl.g:699:3: ruleAtom
            {
             before(grammarAccess.getLiteralAccess().getLit_atomAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLit_atomAtomParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Lit_atomAssignment_0"


    // $ANTLR start "rule__Literal__Lit_constAssignment_1"
    // InternalMyDsl.g:708:1: rule__Literal__Lit_constAssignment_1 : ( ruleConst ) ;
    public final void rule__Literal__Lit_constAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( ( ruleConst ) )
            // InternalMyDsl.g:713:2: ( ruleConst )
            {
            // InternalMyDsl.g:713:2: ( ruleConst )
            // InternalMyDsl.g:714:3: ruleConst
            {
             before(grammarAccess.getLiteralAccess().getLit_constConstParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLit_constConstParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Lit_constAssignment_1"


    // $ANTLR start "rule__Atom__NameAssignment"
    // InternalMyDsl.g:723:1: rule__Atom__NameAssignment : ( RULE_ID ) ;
    public final void rule__Atom__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:728:2: ( RULE_ID )
            {
            // InternalMyDsl.g:728:2: ( RULE_ID )
            // InternalMyDsl.g:729:3: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});

}