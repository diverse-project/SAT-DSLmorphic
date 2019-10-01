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
import org.xtext.example.mydsl.services.SattlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSattlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NOT'", "'OR'", "'AND'", "'NAND'", "'IMPLIES'", "'BIIMPLIES'", "'('", "')'"
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

    	public void setGrammarAccess(SattlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocument"
    // InternalSattl.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalSattl.g:54:1: ( ruleDocument EOF )
            // InternalSattl.g:55:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalSattl.g:62:1: ruleDocument : ( ( rule__Document__FormAssignment )* ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:66:2: ( ( ( rule__Document__FormAssignment )* ) )
            // InternalSattl.g:67:2: ( ( rule__Document__FormAssignment )* )
            {
            // InternalSattl.g:67:2: ( ( rule__Document__FormAssignment )* )
            // InternalSattl.g:68:3: ( rule__Document__FormAssignment )*
            {
             before(grammarAccess.getDocumentAccess().getFormAssignment()); 
            // InternalSattl.g:69:3: ( rule__Document__FormAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSattl.g:69:4: rule__Document__FormAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Document__FormAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getFormAssignment()); 

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleFormulae"
    // InternalSattl.g:78:1: entryRuleFormulae : ruleFormulae EOF ;
    public final void entryRuleFormulae() throws RecognitionException {
        try {
            // InternalSattl.g:79:1: ( ruleFormulae EOF )
            // InternalSattl.g:80:1: ruleFormulae EOF
            {
             before(grammarAccess.getFormulaeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulae();

            state._fsp--;

             after(grammarAccess.getFormulaeRule()); 
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
    // $ANTLR end "entryRuleFormulae"


    // $ANTLR start "ruleFormulae"
    // InternalSattl.g:87:1: ruleFormulae : ( ( rule__Formulae__Alternatives ) ) ;
    public final void ruleFormulae() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:91:2: ( ( ( rule__Formulae__Alternatives ) ) )
            // InternalSattl.g:92:2: ( ( rule__Formulae__Alternatives ) )
            {
            // InternalSattl.g:92:2: ( ( rule__Formulae__Alternatives ) )
            // InternalSattl.g:93:3: ( rule__Formulae__Alternatives )
            {
             before(grammarAccess.getFormulaeAccess().getAlternatives()); 
            // InternalSattl.g:94:3: ( rule__Formulae__Alternatives )
            // InternalSattl.g:94:4: rule__Formulae__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormulae"


    // $ANTLR start "entryRuleAtom"
    // InternalSattl.g:103:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSattl.g:104:1: ( ruleAtom EOF )
            // InternalSattl.g:105:1: ruleAtom EOF
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
    // InternalSattl.g:112:1: ruleAtom : ( ( rule__Atom__NameAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:116:2: ( ( ( rule__Atom__NameAssignment ) ) )
            // InternalSattl.g:117:2: ( ( rule__Atom__NameAssignment ) )
            {
            // InternalSattl.g:117:2: ( ( rule__Atom__NameAssignment ) )
            // InternalSattl.g:118:3: ( rule__Atom__NameAssignment )
            {
             before(grammarAccess.getAtomAccess().getNameAssignment()); 
            // InternalSattl.g:119:3: ( rule__Atom__NameAssignment )
            // InternalSattl.g:119:4: rule__Atom__NameAssignment
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


    // $ANTLR start "entryRuleBinop"
    // InternalSattl.g:128:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // InternalSattl.g:129:1: ( ruleBinop EOF )
            // InternalSattl.g:130:1: ruleBinop EOF
            {
             before(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getBinopRule()); 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalSattl.g:137:1: ruleBinop : ( ( rule__Binop__Alternatives ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:141:2: ( ( ( rule__Binop__Alternatives ) ) )
            // InternalSattl.g:142:2: ( ( rule__Binop__Alternatives ) )
            {
            // InternalSattl.g:142:2: ( ( rule__Binop__Alternatives ) )
            // InternalSattl.g:143:3: ( rule__Binop__Alternatives )
            {
             before(grammarAccess.getBinopAccess().getAlternatives()); 
            // InternalSattl.g:144:3: ( rule__Binop__Alternatives )
            // InternalSattl.g:144:4: rule__Binop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Binop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleUnop"
    // InternalSattl.g:153:1: entryRuleUnop : ruleUnop EOF ;
    public final void entryRuleUnop() throws RecognitionException {
        try {
            // InternalSattl.g:154:1: ( ruleUnop EOF )
            // InternalSattl.g:155:1: ruleUnop EOF
            {
             before(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            ruleUnop();

            state._fsp--;

             after(grammarAccess.getUnopRule()); 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalSattl.g:162:1: ruleUnop : ( 'NOT' ) ;
    public final void ruleUnop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:166:2: ( ( 'NOT' ) )
            // InternalSattl.g:167:2: ( 'NOT' )
            {
            // InternalSattl.g:167:2: ( 'NOT' )
            // InternalSattl.g:168:3: 'NOT'
            {
             before(grammarAccess.getUnopAccess().getNOTKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnopAccess().getNOTKeyword()); 

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
    // $ANTLR end "ruleUnop"


    // $ANTLR start "rule__Formulae__Alternatives"
    // InternalSattl.g:177:1: rule__Formulae__Alternatives : ( ( ( rule__Formulae__Group_0__0 ) ) | ( ( rule__Formulae__Group_1__0 ) ) | ( ( rule__Formulae__AtomAssignment_2 ) ) );
    public final void rule__Formulae__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:181:1: ( ( ( rule__Formulae__Group_0__0 ) ) | ( ( rule__Formulae__Group_1__0 ) ) | ( ( rule__Formulae__AtomAssignment_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID||LA2_1==17) ) {
                    alt2=1;
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
                    // InternalSattl.g:182:2: ( ( rule__Formulae__Group_0__0 ) )
                    {
                    // InternalSattl.g:182:2: ( ( rule__Formulae__Group_0__0 ) )
                    // InternalSattl.g:183:3: ( rule__Formulae__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaeAccess().getGroup_0()); 
                    // InternalSattl.g:184:3: ( rule__Formulae__Group_0__0 )
                    // InternalSattl.g:184:4: rule__Formulae__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formulae__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSattl.g:188:2: ( ( rule__Formulae__Group_1__0 ) )
                    {
                    // InternalSattl.g:188:2: ( ( rule__Formulae__Group_1__0 ) )
                    // InternalSattl.g:189:3: ( rule__Formulae__Group_1__0 )
                    {
                     before(grammarAccess.getFormulaeAccess().getGroup_1()); 
                    // InternalSattl.g:190:3: ( rule__Formulae__Group_1__0 )
                    // InternalSattl.g:190:4: rule__Formulae__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formulae__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSattl.g:194:2: ( ( rule__Formulae__AtomAssignment_2 ) )
                    {
                    // InternalSattl.g:194:2: ( ( rule__Formulae__AtomAssignment_2 ) )
                    // InternalSattl.g:195:3: ( rule__Formulae__AtomAssignment_2 )
                    {
                     before(grammarAccess.getFormulaeAccess().getAtomAssignment_2()); 
                    // InternalSattl.g:196:3: ( rule__Formulae__AtomAssignment_2 )
                    // InternalSattl.g:196:4: rule__Formulae__AtomAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formulae__AtomAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaeAccess().getAtomAssignment_2()); 

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
    // $ANTLR end "rule__Formulae__Alternatives"


    // $ANTLR start "rule__Binop__Alternatives"
    // InternalSattl.g:204:1: rule__Binop__Alternatives : ( ( 'OR' ) | ( 'AND' ) | ( 'NAND' ) | ( 'IMPLIES' ) | ( 'BIIMPLIES' ) );
    public final void rule__Binop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:208:1: ( ( 'OR' ) | ( 'AND' ) | ( 'NAND' ) | ( 'IMPLIES' ) | ( 'BIIMPLIES' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
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
                    // InternalSattl.g:209:2: ( 'OR' )
                    {
                    // InternalSattl.g:209:2: ( 'OR' )
                    // InternalSattl.g:210:3: 'OR'
                    {
                     before(grammarAccess.getBinopAccess().getORKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getORKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSattl.g:215:2: ( 'AND' )
                    {
                    // InternalSattl.g:215:2: ( 'AND' )
                    // InternalSattl.g:216:3: 'AND'
                    {
                     before(grammarAccess.getBinopAccess().getANDKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getANDKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSattl.g:221:2: ( 'NAND' )
                    {
                    // InternalSattl.g:221:2: ( 'NAND' )
                    // InternalSattl.g:222:3: 'NAND'
                    {
                     before(grammarAccess.getBinopAccess().getNANDKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getNANDKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSattl.g:227:2: ( 'IMPLIES' )
                    {
                    // InternalSattl.g:227:2: ( 'IMPLIES' )
                    // InternalSattl.g:228:3: 'IMPLIES'
                    {
                     before(grammarAccess.getBinopAccess().getIMPLIESKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getIMPLIESKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSattl.g:233:2: ( 'BIIMPLIES' )
                    {
                    // InternalSattl.g:233:2: ( 'BIIMPLIES' )
                    // InternalSattl.g:234:3: 'BIIMPLIES'
                    {
                     before(grammarAccess.getBinopAccess().getBIIMPLIESKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinopAccess().getBIIMPLIESKeyword_4()); 

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
    // $ANTLR end "rule__Binop__Alternatives"


    // $ANTLR start "rule__Formulae__Group_0__0"
    // InternalSattl.g:243:1: rule__Formulae__Group_0__0 : rule__Formulae__Group_0__0__Impl rule__Formulae__Group_0__1 ;
    public final void rule__Formulae__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:247:1: ( rule__Formulae__Group_0__0__Impl rule__Formulae__Group_0__1 )
            // InternalSattl.g:248:2: rule__Formulae__Group_0__0__Impl rule__Formulae__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Formulae__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_0__1();

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
    // $ANTLR end "rule__Formulae__Group_0__0"


    // $ANTLR start "rule__Formulae__Group_0__0__Impl"
    // InternalSattl.g:255:1: rule__Formulae__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Formulae__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:259:1: ( ( '(' ) )
            // InternalSattl.g:260:1: ( '(' )
            {
            // InternalSattl.g:260:1: ( '(' )
            // InternalSattl.g:261:2: '('
            {
             before(grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Formulae__Group_0__0__Impl"


    // $ANTLR start "rule__Formulae__Group_0__1"
    // InternalSattl.g:270:1: rule__Formulae__Group_0__1 : rule__Formulae__Group_0__1__Impl rule__Formulae__Group_0__2 ;
    public final void rule__Formulae__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:274:1: ( rule__Formulae__Group_0__1__Impl rule__Formulae__Group_0__2 )
            // InternalSattl.g:275:2: rule__Formulae__Group_0__1__Impl rule__Formulae__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Formulae__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_0__2();

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
    // $ANTLR end "rule__Formulae__Group_0__1"


    // $ANTLR start "rule__Formulae__Group_0__1__Impl"
    // InternalSattl.g:282:1: rule__Formulae__Group_0__1__Impl : ( ( rule__Formulae__Form_leftAssignment_0_1 ) ) ;
    public final void rule__Formulae__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:286:1: ( ( ( rule__Formulae__Form_leftAssignment_0_1 ) ) )
            // InternalSattl.g:287:1: ( ( rule__Formulae__Form_leftAssignment_0_1 ) )
            {
            // InternalSattl.g:287:1: ( ( rule__Formulae__Form_leftAssignment_0_1 ) )
            // InternalSattl.g:288:2: ( rule__Formulae__Form_leftAssignment_0_1 )
            {
             before(grammarAccess.getFormulaeAccess().getForm_leftAssignment_0_1()); 
            // InternalSattl.g:289:2: ( rule__Formulae__Form_leftAssignment_0_1 )
            // InternalSattl.g:289:3: rule__Formulae__Form_leftAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__Form_leftAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getForm_leftAssignment_0_1()); 

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
    // $ANTLR end "rule__Formulae__Group_0__1__Impl"


    // $ANTLR start "rule__Formulae__Group_0__2"
    // InternalSattl.g:297:1: rule__Formulae__Group_0__2 : rule__Formulae__Group_0__2__Impl rule__Formulae__Group_0__3 ;
    public final void rule__Formulae__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:301:1: ( rule__Formulae__Group_0__2__Impl rule__Formulae__Group_0__3 )
            // InternalSattl.g:302:2: rule__Formulae__Group_0__2__Impl rule__Formulae__Group_0__3
            {
            pushFollow(FOLLOW_4);
            rule__Formulae__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_0__3();

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
    // $ANTLR end "rule__Formulae__Group_0__2"


    // $ANTLR start "rule__Formulae__Group_0__2__Impl"
    // InternalSattl.g:309:1: rule__Formulae__Group_0__2__Impl : ( ( rule__Formulae__BinopAssignment_0_2 ) ) ;
    public final void rule__Formulae__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:313:1: ( ( ( rule__Formulae__BinopAssignment_0_2 ) ) )
            // InternalSattl.g:314:1: ( ( rule__Formulae__BinopAssignment_0_2 ) )
            {
            // InternalSattl.g:314:1: ( ( rule__Formulae__BinopAssignment_0_2 ) )
            // InternalSattl.g:315:2: ( rule__Formulae__BinopAssignment_0_2 )
            {
             before(grammarAccess.getFormulaeAccess().getBinopAssignment_0_2()); 
            // InternalSattl.g:316:2: ( rule__Formulae__BinopAssignment_0_2 )
            // InternalSattl.g:316:3: rule__Formulae__BinopAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__BinopAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getBinopAssignment_0_2()); 

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
    // $ANTLR end "rule__Formulae__Group_0__2__Impl"


    // $ANTLR start "rule__Formulae__Group_0__3"
    // InternalSattl.g:324:1: rule__Formulae__Group_0__3 : rule__Formulae__Group_0__3__Impl rule__Formulae__Group_0__4 ;
    public final void rule__Formulae__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:328:1: ( rule__Formulae__Group_0__3__Impl rule__Formulae__Group_0__4 )
            // InternalSattl.g:329:2: rule__Formulae__Group_0__3__Impl rule__Formulae__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Formulae__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_0__4();

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
    // $ANTLR end "rule__Formulae__Group_0__3"


    // $ANTLR start "rule__Formulae__Group_0__3__Impl"
    // InternalSattl.g:336:1: rule__Formulae__Group_0__3__Impl : ( ( rule__Formulae__Form_rightAssignment_0_3 ) ) ;
    public final void rule__Formulae__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:340:1: ( ( ( rule__Formulae__Form_rightAssignment_0_3 ) ) )
            // InternalSattl.g:341:1: ( ( rule__Formulae__Form_rightAssignment_0_3 ) )
            {
            // InternalSattl.g:341:1: ( ( rule__Formulae__Form_rightAssignment_0_3 ) )
            // InternalSattl.g:342:2: ( rule__Formulae__Form_rightAssignment_0_3 )
            {
             before(grammarAccess.getFormulaeAccess().getForm_rightAssignment_0_3()); 
            // InternalSattl.g:343:2: ( rule__Formulae__Form_rightAssignment_0_3 )
            // InternalSattl.g:343:3: rule__Formulae__Form_rightAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__Form_rightAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getForm_rightAssignment_0_3()); 

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
    // $ANTLR end "rule__Formulae__Group_0__3__Impl"


    // $ANTLR start "rule__Formulae__Group_0__4"
    // InternalSattl.g:351:1: rule__Formulae__Group_0__4 : rule__Formulae__Group_0__4__Impl ;
    public final void rule__Formulae__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:355:1: ( rule__Formulae__Group_0__4__Impl )
            // InternalSattl.g:356:2: rule__Formulae__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__Group_0__4__Impl();

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
    // $ANTLR end "rule__Formulae__Group_0__4"


    // $ANTLR start "rule__Formulae__Group_0__4__Impl"
    // InternalSattl.g:362:1: rule__Formulae__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Formulae__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:366:1: ( ( ')' ) )
            // InternalSattl.g:367:1: ( ')' )
            {
            // InternalSattl.g:367:1: ( ')' )
            // InternalSattl.g:368:2: ')'
            {
             before(grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_0_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_0_4()); 

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
    // $ANTLR end "rule__Formulae__Group_0__4__Impl"


    // $ANTLR start "rule__Formulae__Group_1__0"
    // InternalSattl.g:378:1: rule__Formulae__Group_1__0 : rule__Formulae__Group_1__0__Impl rule__Formulae__Group_1__1 ;
    public final void rule__Formulae__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:382:1: ( rule__Formulae__Group_1__0__Impl rule__Formulae__Group_1__1 )
            // InternalSattl.g:383:2: rule__Formulae__Group_1__0__Impl rule__Formulae__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Formulae__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_1__1();

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
    // $ANTLR end "rule__Formulae__Group_1__0"


    // $ANTLR start "rule__Formulae__Group_1__0__Impl"
    // InternalSattl.g:390:1: rule__Formulae__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Formulae__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:394:1: ( ( '(' ) )
            // InternalSattl.g:395:1: ( '(' )
            {
            // InternalSattl.g:395:1: ( '(' )
            // InternalSattl.g:396:2: '('
            {
             before(grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormulaeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Formulae__Group_1__0__Impl"


    // $ANTLR start "rule__Formulae__Group_1__1"
    // InternalSattl.g:405:1: rule__Formulae__Group_1__1 : rule__Formulae__Group_1__1__Impl rule__Formulae__Group_1__2 ;
    public final void rule__Formulae__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:409:1: ( rule__Formulae__Group_1__1__Impl rule__Formulae__Group_1__2 )
            // InternalSattl.g:410:2: rule__Formulae__Group_1__1__Impl rule__Formulae__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Formulae__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_1__2();

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
    // $ANTLR end "rule__Formulae__Group_1__1"


    // $ANTLR start "rule__Formulae__Group_1__1__Impl"
    // InternalSattl.g:417:1: rule__Formulae__Group_1__1__Impl : ( ( rule__Formulae__UnopAssignment_1_1 ) ) ;
    public final void rule__Formulae__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:421:1: ( ( ( rule__Formulae__UnopAssignment_1_1 ) ) )
            // InternalSattl.g:422:1: ( ( rule__Formulae__UnopAssignment_1_1 ) )
            {
            // InternalSattl.g:422:1: ( ( rule__Formulae__UnopAssignment_1_1 ) )
            // InternalSattl.g:423:2: ( rule__Formulae__UnopAssignment_1_1 )
            {
             before(grammarAccess.getFormulaeAccess().getUnopAssignment_1_1()); 
            // InternalSattl.g:424:2: ( rule__Formulae__UnopAssignment_1_1 )
            // InternalSattl.g:424:3: rule__Formulae__UnopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__UnopAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getUnopAssignment_1_1()); 

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
    // $ANTLR end "rule__Formulae__Group_1__1__Impl"


    // $ANTLR start "rule__Formulae__Group_1__2"
    // InternalSattl.g:432:1: rule__Formulae__Group_1__2 : rule__Formulae__Group_1__2__Impl rule__Formulae__Group_1__3 ;
    public final void rule__Formulae__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:436:1: ( rule__Formulae__Group_1__2__Impl rule__Formulae__Group_1__3 )
            // InternalSattl.g:437:2: rule__Formulae__Group_1__2__Impl rule__Formulae__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Formulae__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formulae__Group_1__3();

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
    // $ANTLR end "rule__Formulae__Group_1__2"


    // $ANTLR start "rule__Formulae__Group_1__2__Impl"
    // InternalSattl.g:444:1: rule__Formulae__Group_1__2__Impl : ( ( rule__Formulae__FormAssignment_1_2 ) ) ;
    public final void rule__Formulae__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:448:1: ( ( ( rule__Formulae__FormAssignment_1_2 ) ) )
            // InternalSattl.g:449:1: ( ( rule__Formulae__FormAssignment_1_2 ) )
            {
            // InternalSattl.g:449:1: ( ( rule__Formulae__FormAssignment_1_2 ) )
            // InternalSattl.g:450:2: ( rule__Formulae__FormAssignment_1_2 )
            {
             before(grammarAccess.getFormulaeAccess().getFormAssignment_1_2()); 
            // InternalSattl.g:451:2: ( rule__Formulae__FormAssignment_1_2 )
            // InternalSattl.g:451:3: rule__Formulae__FormAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__FormAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaeAccess().getFormAssignment_1_2()); 

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
    // $ANTLR end "rule__Formulae__Group_1__2__Impl"


    // $ANTLR start "rule__Formulae__Group_1__3"
    // InternalSattl.g:459:1: rule__Formulae__Group_1__3 : rule__Formulae__Group_1__3__Impl ;
    public final void rule__Formulae__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:463:1: ( rule__Formulae__Group_1__3__Impl )
            // InternalSattl.g:464:2: rule__Formulae__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formulae__Group_1__3__Impl();

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
    // $ANTLR end "rule__Formulae__Group_1__3"


    // $ANTLR start "rule__Formulae__Group_1__3__Impl"
    // InternalSattl.g:470:1: rule__Formulae__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Formulae__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:474:1: ( ( ')' ) )
            // InternalSattl.g:475:1: ( ')' )
            {
            // InternalSattl.g:475:1: ( ')' )
            // InternalSattl.g:476:2: ')'
            {
             before(grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormulaeAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Formulae__Group_1__3__Impl"


    // $ANTLR start "rule__Document__FormAssignment"
    // InternalSattl.g:486:1: rule__Document__FormAssignment : ( ruleFormulae ) ;
    public final void rule__Document__FormAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:490:1: ( ( ruleFormulae ) )
            // InternalSattl.g:491:2: ( ruleFormulae )
            {
            // InternalSattl.g:491:2: ( ruleFormulae )
            // InternalSattl.g:492:3: ruleFormulae
            {
             before(grammarAccess.getDocumentAccess().getFormFormulaeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulae();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getFormFormulaeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Document__FormAssignment"


    // $ANTLR start "rule__Formulae__Form_leftAssignment_0_1"
    // InternalSattl.g:501:1: rule__Formulae__Form_leftAssignment_0_1 : ( ruleFormulae ) ;
    public final void rule__Formulae__Form_leftAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:505:1: ( ( ruleFormulae ) )
            // InternalSattl.g:506:2: ( ruleFormulae )
            {
            // InternalSattl.g:506:2: ( ruleFormulae )
            // InternalSattl.g:507:3: ruleFormulae
            {
             before(grammarAccess.getFormulaeAccess().getForm_leftFormulaeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulae();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getForm_leftFormulaeParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Formulae__Form_leftAssignment_0_1"


    // $ANTLR start "rule__Formulae__BinopAssignment_0_2"
    // InternalSattl.g:516:1: rule__Formulae__BinopAssignment_0_2 : ( ruleBinop ) ;
    public final void rule__Formulae__BinopAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:520:1: ( ( ruleBinop ) )
            // InternalSattl.g:521:2: ( ruleBinop )
            {
            // InternalSattl.g:521:2: ( ruleBinop )
            // InternalSattl.g:522:3: ruleBinop
            {
             before(grammarAccess.getFormulaeAccess().getBinopBinopParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getBinopBinopParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Formulae__BinopAssignment_0_2"


    // $ANTLR start "rule__Formulae__Form_rightAssignment_0_3"
    // InternalSattl.g:531:1: rule__Formulae__Form_rightAssignment_0_3 : ( ruleFormulae ) ;
    public final void rule__Formulae__Form_rightAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:535:1: ( ( ruleFormulae ) )
            // InternalSattl.g:536:2: ( ruleFormulae )
            {
            // InternalSattl.g:536:2: ( ruleFormulae )
            // InternalSattl.g:537:3: ruleFormulae
            {
             before(grammarAccess.getFormulaeAccess().getForm_rightFormulaeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulae();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getForm_rightFormulaeParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Formulae__Form_rightAssignment_0_3"


    // $ANTLR start "rule__Formulae__UnopAssignment_1_1"
    // InternalSattl.g:546:1: rule__Formulae__UnopAssignment_1_1 : ( ruleUnop ) ;
    public final void rule__Formulae__UnopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:550:1: ( ( ruleUnop ) )
            // InternalSattl.g:551:2: ( ruleUnop )
            {
            // InternalSattl.g:551:2: ( ruleUnop )
            // InternalSattl.g:552:3: ruleUnop
            {
             before(grammarAccess.getFormulaeAccess().getUnopUnopParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnop();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getUnopUnopParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Formulae__UnopAssignment_1_1"


    // $ANTLR start "rule__Formulae__FormAssignment_1_2"
    // InternalSattl.g:561:1: rule__Formulae__FormAssignment_1_2 : ( ruleFormulae ) ;
    public final void rule__Formulae__FormAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:565:1: ( ( ruleFormulae ) )
            // InternalSattl.g:566:2: ( ruleFormulae )
            {
            // InternalSattl.g:566:2: ( ruleFormulae )
            // InternalSattl.g:567:3: ruleFormulae
            {
             before(grammarAccess.getFormulaeAccess().getFormFormulaeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulae();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getFormFormulaeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Formulae__FormAssignment_1_2"


    // $ANTLR start "rule__Formulae__AtomAssignment_2"
    // InternalSattl.g:576:1: rule__Formulae__AtomAssignment_2 : ( ruleAtom ) ;
    public final void rule__Formulae__AtomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:580:1: ( ( ruleAtom ) )
            // InternalSattl.g:581:2: ( ruleAtom )
            {
            // InternalSattl.g:581:2: ( ruleAtom )
            // InternalSattl.g:582:3: ruleAtom
            {
             before(grammarAccess.getFormulaeAccess().getAtomAtomParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFormulaeAccess().getAtomAtomParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Formulae__AtomAssignment_2"


    // $ANTLR start "rule__Atom__NameAssignment"
    // InternalSattl.g:591:1: rule__Atom__NameAssignment : ( RULE_ID ) ;
    public final void rule__Atom__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSattl.g:595:1: ( ( RULE_ID ) )
            // InternalSattl.g:596:2: ( RULE_ID )
            {
            // InternalSattl.g:596:2: ( RULE_ID )
            // InternalSattl.g:597:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});

}