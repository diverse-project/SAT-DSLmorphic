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
import org.xtext.example.mydsl.services.DimacsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimacsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'c'", "'p'", "'cnf'", "'0'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDimacsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimacsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimacsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDimacs.g"; }


    	private DimacsGrammarAccess grammarAccess;

    	public void setGrammarAccess(DimacsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCNF"
    // InternalDimacs.g:53:1: entryRuleCNF : ruleCNF EOF ;
    public final void entryRuleCNF() throws RecognitionException {
        try {
            // InternalDimacs.g:54:1: ( ruleCNF EOF )
            // InternalDimacs.g:55:1: ruleCNF EOF
            {
             before(grammarAccess.getCNFRule()); 
            pushFollow(FOLLOW_1);
            ruleCNF();

            state._fsp--;

             after(grammarAccess.getCNFRule()); 
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
    // $ANTLR end "entryRuleCNF"


    // $ANTLR start "ruleCNF"
    // InternalDimacs.g:62:1: ruleCNF : ( ( rule__CNF__Group__0 ) ) ;
    public final void ruleCNF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:66:2: ( ( ( rule__CNF__Group__0 ) ) )
            // InternalDimacs.g:67:2: ( ( rule__CNF__Group__0 ) )
            {
            // InternalDimacs.g:67:2: ( ( rule__CNF__Group__0 ) )
            // InternalDimacs.g:68:3: ( rule__CNF__Group__0 )
            {
             before(grammarAccess.getCNFAccess().getGroup()); 
            // InternalDimacs.g:69:3: ( rule__CNF__Group__0 )
            // InternalDimacs.g:69:4: rule__CNF__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CNF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCNFAccess().getGroup()); 

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
    // $ANTLR end "ruleCNF"


    // $ANTLR start "entryRuleCommentaire"
    // InternalDimacs.g:78:1: entryRuleCommentaire : ruleCommentaire EOF ;
    public final void entryRuleCommentaire() throws RecognitionException {
        try {
            // InternalDimacs.g:79:1: ( ruleCommentaire EOF )
            // InternalDimacs.g:80:1: ruleCommentaire EOF
            {
             before(grammarAccess.getCommentaireRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentaire();

            state._fsp--;

             after(grammarAccess.getCommentaireRule()); 
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
    // $ANTLR end "entryRuleCommentaire"


    // $ANTLR start "ruleCommentaire"
    // InternalDimacs.g:87:1: ruleCommentaire : ( ( rule__Commentaire__Group__0 ) ) ;
    public final void ruleCommentaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:91:2: ( ( ( rule__Commentaire__Group__0 ) ) )
            // InternalDimacs.g:92:2: ( ( rule__Commentaire__Group__0 ) )
            {
            // InternalDimacs.g:92:2: ( ( rule__Commentaire__Group__0 ) )
            // InternalDimacs.g:93:3: ( rule__Commentaire__Group__0 )
            {
             before(grammarAccess.getCommentaireAccess().getGroup()); 
            // InternalDimacs.g:94:3: ( rule__Commentaire__Group__0 )
            // InternalDimacs.g:94:4: rule__Commentaire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Commentaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentaireAccess().getGroup()); 

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
    // $ANTLR end "ruleCommentaire"


    // $ANTLR start "entryRuleLigneProbleme"
    // InternalDimacs.g:103:1: entryRuleLigneProbleme : ruleLigneProbleme EOF ;
    public final void entryRuleLigneProbleme() throws RecognitionException {
        try {
            // InternalDimacs.g:104:1: ( ruleLigneProbleme EOF )
            // InternalDimacs.g:105:1: ruleLigneProbleme EOF
            {
             before(grammarAccess.getLigneProblemeRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneProbleme();

            state._fsp--;

             after(grammarAccess.getLigneProblemeRule()); 
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
    // $ANTLR end "entryRuleLigneProbleme"


    // $ANTLR start "ruleLigneProbleme"
    // InternalDimacs.g:112:1: ruleLigneProbleme : ( ( rule__LigneProbleme__Group__0 ) ) ;
    public final void ruleLigneProbleme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:116:2: ( ( ( rule__LigneProbleme__Group__0 ) ) )
            // InternalDimacs.g:117:2: ( ( rule__LigneProbleme__Group__0 ) )
            {
            // InternalDimacs.g:117:2: ( ( rule__LigneProbleme__Group__0 ) )
            // InternalDimacs.g:118:3: ( rule__LigneProbleme__Group__0 )
            {
             before(grammarAccess.getLigneProblemeAccess().getGroup()); 
            // InternalDimacs.g:119:3: ( rule__LigneProbleme__Group__0 )
            // InternalDimacs.g:119:4: rule__LigneProbleme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getGroup()); 

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
    // $ANTLR end "ruleLigneProbleme"


    // $ANTLR start "entryRuleLigneClause"
    // InternalDimacs.g:128:1: entryRuleLigneClause : ruleLigneClause EOF ;
    public final void entryRuleLigneClause() throws RecognitionException {
        try {
            // InternalDimacs.g:129:1: ( ruleLigneClause EOF )
            // InternalDimacs.g:130:1: ruleLigneClause EOF
            {
             before(grammarAccess.getLigneClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneClause();

            state._fsp--;

             after(grammarAccess.getLigneClauseRule()); 
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
    // $ANTLR end "entryRuleLigneClause"


    // $ANTLR start "ruleLigneClause"
    // InternalDimacs.g:137:1: ruleLigneClause : ( ( rule__LigneClause__Group__0 ) ) ;
    public final void ruleLigneClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:141:2: ( ( ( rule__LigneClause__Group__0 ) ) )
            // InternalDimacs.g:142:2: ( ( rule__LigneClause__Group__0 ) )
            {
            // InternalDimacs.g:142:2: ( ( rule__LigneClause__Group__0 ) )
            // InternalDimacs.g:143:3: ( rule__LigneClause__Group__0 )
            {
             before(grammarAccess.getLigneClauseAccess().getGroup()); 
            // InternalDimacs.g:144:3: ( rule__LigneClause__Group__0 )
            // InternalDimacs.g:144:4: rule__LigneClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LigneClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigneClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleLigneClause"


    // $ANTLR start "entryRulelitteral"
    // InternalDimacs.g:153:1: entryRulelitteral : rulelitteral EOF ;
    public final void entryRulelitteral() throws RecognitionException {
        try {
            // InternalDimacs.g:154:1: ( rulelitteral EOF )
            // InternalDimacs.g:155:1: rulelitteral EOF
            {
             before(grammarAccess.getLitteralRule()); 
            pushFollow(FOLLOW_1);
            rulelitteral();

            state._fsp--;

             after(grammarAccess.getLitteralRule()); 
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
    // $ANTLR end "entryRulelitteral"


    // $ANTLR start "rulelitteral"
    // InternalDimacs.g:162:1: rulelitteral : ( ( rule__Litteral__ValAssignment ) ) ;
    public final void rulelitteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:166:2: ( ( ( rule__Litteral__ValAssignment ) ) )
            // InternalDimacs.g:167:2: ( ( rule__Litteral__ValAssignment ) )
            {
            // InternalDimacs.g:167:2: ( ( rule__Litteral__ValAssignment ) )
            // InternalDimacs.g:168:3: ( rule__Litteral__ValAssignment )
            {
             before(grammarAccess.getLitteralAccess().getValAssignment()); 
            // InternalDimacs.g:169:3: ( rule__Litteral__ValAssignment )
            // InternalDimacs.g:169:4: rule__Litteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Litteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLitteralAccess().getValAssignment()); 

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
    // $ANTLR end "rulelitteral"


    // $ANTLR start "rule__CNF__Group__0"
    // InternalDimacs.g:177:1: rule__CNF__Group__0 : rule__CNF__Group__0__Impl rule__CNF__Group__1 ;
    public final void rule__CNF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:181:1: ( rule__CNF__Group__0__Impl rule__CNF__Group__1 )
            // InternalDimacs.g:182:2: rule__CNF__Group__0__Impl rule__CNF__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CNF__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CNF__Group__1();

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
    // $ANTLR end "rule__CNF__Group__0"


    // $ANTLR start "rule__CNF__Group__0__Impl"
    // InternalDimacs.g:189:1: rule__CNF__Group__0__Impl : ( ( rule__CNF__CommentsAssignment_0 )* ) ;
    public final void rule__CNF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:193:1: ( ( ( rule__CNF__CommentsAssignment_0 )* ) )
            // InternalDimacs.g:194:1: ( ( rule__CNF__CommentsAssignment_0 )* )
            {
            // InternalDimacs.g:194:1: ( ( rule__CNF__CommentsAssignment_0 )* )
            // InternalDimacs.g:195:2: ( rule__CNF__CommentsAssignment_0 )*
            {
             before(grammarAccess.getCNFAccess().getCommentsAssignment_0()); 
            // InternalDimacs.g:196:2: ( rule__CNF__CommentsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDimacs.g:196:3: rule__CNF__CommentsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CNF__CommentsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCNFAccess().getCommentsAssignment_0()); 

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
    // $ANTLR end "rule__CNF__Group__0__Impl"


    // $ANTLR start "rule__CNF__Group__1"
    // InternalDimacs.g:204:1: rule__CNF__Group__1 : rule__CNF__Group__1__Impl rule__CNF__Group__2 ;
    public final void rule__CNF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:208:1: ( rule__CNF__Group__1__Impl rule__CNF__Group__2 )
            // InternalDimacs.g:209:2: rule__CNF__Group__1__Impl rule__CNF__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CNF__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CNF__Group__2();

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
    // $ANTLR end "rule__CNF__Group__1"


    // $ANTLR start "rule__CNF__Group__1__Impl"
    // InternalDimacs.g:216:1: rule__CNF__Group__1__Impl : ( '\\n' ) ;
    public final void rule__CNF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:220:1: ( ( '\\n' ) )
            // InternalDimacs.g:221:1: ( '\\n' )
            {
            // InternalDimacs.g:221:1: ( '\\n' )
            // InternalDimacs.g:222:2: '\\n'
            {
             before(grammarAccess.getCNFAccess().getLineFeedKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCNFAccess().getLineFeedKeyword_1()); 

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
    // $ANTLR end "rule__CNF__Group__1__Impl"


    // $ANTLR start "rule__CNF__Group__2"
    // InternalDimacs.g:231:1: rule__CNF__Group__2 : rule__CNF__Group__2__Impl rule__CNF__Group__3 ;
    public final void rule__CNF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:235:1: ( rule__CNF__Group__2__Impl rule__CNF__Group__3 )
            // InternalDimacs.g:236:2: rule__CNF__Group__2__Impl rule__CNF__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CNF__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CNF__Group__3();

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
    // $ANTLR end "rule__CNF__Group__2"


    // $ANTLR start "rule__CNF__Group__2__Impl"
    // InternalDimacs.g:243:1: rule__CNF__Group__2__Impl : ( ( rule__CNF__ProblemAssignment_2 ) ) ;
    public final void rule__CNF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:247:1: ( ( ( rule__CNF__ProblemAssignment_2 ) ) )
            // InternalDimacs.g:248:1: ( ( rule__CNF__ProblemAssignment_2 ) )
            {
            // InternalDimacs.g:248:1: ( ( rule__CNF__ProblemAssignment_2 ) )
            // InternalDimacs.g:249:2: ( rule__CNF__ProblemAssignment_2 )
            {
             before(grammarAccess.getCNFAccess().getProblemAssignment_2()); 
            // InternalDimacs.g:250:2: ( rule__CNF__ProblemAssignment_2 )
            // InternalDimacs.g:250:3: rule__CNF__ProblemAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CNF__ProblemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCNFAccess().getProblemAssignment_2()); 

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
    // $ANTLR end "rule__CNF__Group__2__Impl"


    // $ANTLR start "rule__CNF__Group__3"
    // InternalDimacs.g:258:1: rule__CNF__Group__3 : rule__CNF__Group__3__Impl rule__CNF__Group__4 ;
    public final void rule__CNF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:262:1: ( rule__CNF__Group__3__Impl rule__CNF__Group__4 )
            // InternalDimacs.g:263:2: rule__CNF__Group__3__Impl rule__CNF__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CNF__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CNF__Group__4();

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
    // $ANTLR end "rule__CNF__Group__3"


    // $ANTLR start "rule__CNF__Group__3__Impl"
    // InternalDimacs.g:270:1: rule__CNF__Group__3__Impl : ( '\\n' ) ;
    public final void rule__CNF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:274:1: ( ( '\\n' ) )
            // InternalDimacs.g:275:1: ( '\\n' )
            {
            // InternalDimacs.g:275:1: ( '\\n' )
            // InternalDimacs.g:276:2: '\\n'
            {
             before(grammarAccess.getCNFAccess().getLineFeedKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCNFAccess().getLineFeedKeyword_3()); 

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
    // $ANTLR end "rule__CNF__Group__3__Impl"


    // $ANTLR start "rule__CNF__Group__4"
    // InternalDimacs.g:285:1: rule__CNF__Group__4 : rule__CNF__Group__4__Impl ;
    public final void rule__CNF__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:289:1: ( rule__CNF__Group__4__Impl )
            // InternalDimacs.g:290:2: rule__CNF__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CNF__Group__4__Impl();

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
    // $ANTLR end "rule__CNF__Group__4"


    // $ANTLR start "rule__CNF__Group__4__Impl"
    // InternalDimacs.g:296:1: rule__CNF__Group__4__Impl : ( ( rule__CNF__ClausesAssignment_4 )* ) ;
    public final void rule__CNF__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:300:1: ( ( ( rule__CNF__ClausesAssignment_4 )* ) )
            // InternalDimacs.g:301:1: ( ( rule__CNF__ClausesAssignment_4 )* )
            {
            // InternalDimacs.g:301:1: ( ( rule__CNF__ClausesAssignment_4 )* )
            // InternalDimacs.g:302:2: ( rule__CNF__ClausesAssignment_4 )*
            {
             before(grammarAccess.getCNFAccess().getClausesAssignment_4()); 
            // InternalDimacs.g:303:2: ( rule__CNF__ClausesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDimacs.g:303:3: rule__CNF__ClausesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CNF__ClausesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCNFAccess().getClausesAssignment_4()); 

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
    // $ANTLR end "rule__CNF__Group__4__Impl"


    // $ANTLR start "rule__Commentaire__Group__0"
    // InternalDimacs.g:312:1: rule__Commentaire__Group__0 : rule__Commentaire__Group__0__Impl rule__Commentaire__Group__1 ;
    public final void rule__Commentaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:316:1: ( rule__Commentaire__Group__0__Impl rule__Commentaire__Group__1 )
            // InternalDimacs.g:317:2: rule__Commentaire__Group__0__Impl rule__Commentaire__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Commentaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commentaire__Group__1();

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
    // $ANTLR end "rule__Commentaire__Group__0"


    // $ANTLR start "rule__Commentaire__Group__0__Impl"
    // InternalDimacs.g:324:1: rule__Commentaire__Group__0__Impl : ( 'c' ) ;
    public final void rule__Commentaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:328:1: ( ( 'c' ) )
            // InternalDimacs.g:329:1: ( 'c' )
            {
            // InternalDimacs.g:329:1: ( 'c' )
            // InternalDimacs.g:330:2: 'c'
            {
             before(grammarAccess.getCommentaireAccess().getCKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCommentaireAccess().getCKeyword_0()); 

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
    // $ANTLR end "rule__Commentaire__Group__0__Impl"


    // $ANTLR start "rule__Commentaire__Group__1"
    // InternalDimacs.g:339:1: rule__Commentaire__Group__1 : rule__Commentaire__Group__1__Impl rule__Commentaire__Group__2 ;
    public final void rule__Commentaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:343:1: ( rule__Commentaire__Group__1__Impl rule__Commentaire__Group__2 )
            // InternalDimacs.g:344:2: rule__Commentaire__Group__1__Impl rule__Commentaire__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Commentaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commentaire__Group__2();

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
    // $ANTLR end "rule__Commentaire__Group__1"


    // $ANTLR start "rule__Commentaire__Group__1__Impl"
    // InternalDimacs.g:351:1: rule__Commentaire__Group__1__Impl : ( ( rule__Commentaire__ContentAssignment_1 ) ) ;
    public final void rule__Commentaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:355:1: ( ( ( rule__Commentaire__ContentAssignment_1 ) ) )
            // InternalDimacs.g:356:1: ( ( rule__Commentaire__ContentAssignment_1 ) )
            {
            // InternalDimacs.g:356:1: ( ( rule__Commentaire__ContentAssignment_1 ) )
            // InternalDimacs.g:357:2: ( rule__Commentaire__ContentAssignment_1 )
            {
             before(grammarAccess.getCommentaireAccess().getContentAssignment_1()); 
            // InternalDimacs.g:358:2: ( rule__Commentaire__ContentAssignment_1 )
            // InternalDimacs.g:358:3: rule__Commentaire__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Commentaire__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentaireAccess().getContentAssignment_1()); 

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
    // $ANTLR end "rule__Commentaire__Group__1__Impl"


    // $ANTLR start "rule__Commentaire__Group__2"
    // InternalDimacs.g:366:1: rule__Commentaire__Group__2 : rule__Commentaire__Group__2__Impl ;
    public final void rule__Commentaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:370:1: ( rule__Commentaire__Group__2__Impl )
            // InternalDimacs.g:371:2: rule__Commentaire__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commentaire__Group__2__Impl();

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
    // $ANTLR end "rule__Commentaire__Group__2"


    // $ANTLR start "rule__Commentaire__Group__2__Impl"
    // InternalDimacs.g:377:1: rule__Commentaire__Group__2__Impl : ( '\\n' ) ;
    public final void rule__Commentaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:381:1: ( ( '\\n' ) )
            // InternalDimacs.g:382:1: ( '\\n' )
            {
            // InternalDimacs.g:382:1: ( '\\n' )
            // InternalDimacs.g:383:2: '\\n'
            {
             before(grammarAccess.getCommentaireAccess().getLineFeedKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCommentaireAccess().getLineFeedKeyword_2()); 

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
    // $ANTLR end "rule__Commentaire__Group__2__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__0"
    // InternalDimacs.g:393:1: rule__LigneProbleme__Group__0 : rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1 ;
    public final void rule__LigneProbleme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:397:1: ( rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1 )
            // InternalDimacs.g:398:2: rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LigneProbleme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__1();

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
    // $ANTLR end "rule__LigneProbleme__Group__0"


    // $ANTLR start "rule__LigneProbleme__Group__0__Impl"
    // InternalDimacs.g:405:1: rule__LigneProbleme__Group__0__Impl : ( 'p' ) ;
    public final void rule__LigneProbleme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:409:1: ( ( 'p' ) )
            // InternalDimacs.g:410:1: ( 'p' )
            {
            // InternalDimacs.g:410:1: ( 'p' )
            // InternalDimacs.g:411:2: 'p'
            {
             before(grammarAccess.getLigneProblemeAccess().getPKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getPKeyword_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__0__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__1"
    // InternalDimacs.g:420:1: rule__LigneProbleme__Group__1 : rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2 ;
    public final void rule__LigneProbleme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:424:1: ( rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2 )
            // InternalDimacs.g:425:2: rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__LigneProbleme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__2();

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
    // $ANTLR end "rule__LigneProbleme__Group__1"


    // $ANTLR start "rule__LigneProbleme__Group__1__Impl"
    // InternalDimacs.g:432:1: rule__LigneProbleme__Group__1__Impl : ( 'cnf' ) ;
    public final void rule__LigneProbleme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:436:1: ( ( 'cnf' ) )
            // InternalDimacs.g:437:1: ( 'cnf' )
            {
            // InternalDimacs.g:437:1: ( 'cnf' )
            // InternalDimacs.g:438:2: 'cnf'
            {
             before(grammarAccess.getLigneProblemeAccess().getCnfKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getCnfKeyword_1()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__1__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__2"
    // InternalDimacs.g:447:1: rule__LigneProbleme__Group__2 : rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3 ;
    public final void rule__LigneProbleme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:451:1: ( rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3 )
            // InternalDimacs.g:452:2: rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LigneProbleme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__3();

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
    // $ANTLR end "rule__LigneProbleme__Group__2"


    // $ANTLR start "rule__LigneProbleme__Group__2__Impl"
    // InternalDimacs.g:459:1: rule__LigneProbleme__Group__2__Impl : ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) ) ;
    public final void rule__LigneProbleme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:463:1: ( ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) ) )
            // InternalDimacs.g:464:1: ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) )
            {
            // InternalDimacs.g:464:1: ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) )
            // InternalDimacs.g:465:2: ( rule__LigneProbleme__Nb_variablesAssignment_2 )
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_variablesAssignment_2()); 
            // InternalDimacs.g:466:2: ( rule__LigneProbleme__Nb_variablesAssignment_2 )
            // InternalDimacs.g:466:3: rule__LigneProbleme__Nb_variablesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Nb_variablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getNb_variablesAssignment_2()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__2__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__3"
    // InternalDimacs.g:474:1: rule__LigneProbleme__Group__3 : rule__LigneProbleme__Group__3__Impl rule__LigneProbleme__Group__4 ;
    public final void rule__LigneProbleme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:478:1: ( rule__LigneProbleme__Group__3__Impl rule__LigneProbleme__Group__4 )
            // InternalDimacs.g:479:2: rule__LigneProbleme__Group__3__Impl rule__LigneProbleme__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__LigneProbleme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__4();

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
    // $ANTLR end "rule__LigneProbleme__Group__3"


    // $ANTLR start "rule__LigneProbleme__Group__3__Impl"
    // InternalDimacs.g:486:1: rule__LigneProbleme__Group__3__Impl : ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) ) ;
    public final void rule__LigneProbleme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:490:1: ( ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) ) )
            // InternalDimacs.g:491:1: ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) )
            {
            // InternalDimacs.g:491:1: ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) )
            // InternalDimacs.g:492:2: ( rule__LigneProbleme__Nb_clausesAssignment_3 )
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_clausesAssignment_3()); 
            // InternalDimacs.g:493:2: ( rule__LigneProbleme__Nb_clausesAssignment_3 )
            // InternalDimacs.g:493:3: rule__LigneProbleme__Nb_clausesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Nb_clausesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getNb_clausesAssignment_3()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__3__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__4"
    // InternalDimacs.g:501:1: rule__LigneProbleme__Group__4 : rule__LigneProbleme__Group__4__Impl ;
    public final void rule__LigneProbleme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:505:1: ( rule__LigneProbleme__Group__4__Impl )
            // InternalDimacs.g:506:2: rule__LigneProbleme__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__4__Impl();

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
    // $ANTLR end "rule__LigneProbleme__Group__4"


    // $ANTLR start "rule__LigneProbleme__Group__4__Impl"
    // InternalDimacs.g:512:1: rule__LigneProbleme__Group__4__Impl : ( '\\n' ) ;
    public final void rule__LigneProbleme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:516:1: ( ( '\\n' ) )
            // InternalDimacs.g:517:1: ( '\\n' )
            {
            // InternalDimacs.g:517:1: ( '\\n' )
            // InternalDimacs.g:518:2: '\\n'
            {
             before(grammarAccess.getLigneProblemeAccess().getLineFeedKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getLineFeedKeyword_4()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__4__Impl"


    // $ANTLR start "rule__LigneClause__Group__0"
    // InternalDimacs.g:528:1: rule__LigneClause__Group__0 : rule__LigneClause__Group__0__Impl rule__LigneClause__Group__1 ;
    public final void rule__LigneClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:532:1: ( rule__LigneClause__Group__0__Impl rule__LigneClause__Group__1 )
            // InternalDimacs.g:533:2: rule__LigneClause__Group__0__Impl rule__LigneClause__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LigneClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneClause__Group__1();

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
    // $ANTLR end "rule__LigneClause__Group__0"


    // $ANTLR start "rule__LigneClause__Group__0__Impl"
    // InternalDimacs.g:540:1: rule__LigneClause__Group__0__Impl : ( ( ( rule__LigneClause__LitterauxAssignment_0 ) ) ( ( rule__LigneClause__LitterauxAssignment_0 )* ) ) ;
    public final void rule__LigneClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:544:1: ( ( ( ( rule__LigneClause__LitterauxAssignment_0 ) ) ( ( rule__LigneClause__LitterauxAssignment_0 )* ) ) )
            // InternalDimacs.g:545:1: ( ( ( rule__LigneClause__LitterauxAssignment_0 ) ) ( ( rule__LigneClause__LitterauxAssignment_0 )* ) )
            {
            // InternalDimacs.g:545:1: ( ( ( rule__LigneClause__LitterauxAssignment_0 ) ) ( ( rule__LigneClause__LitterauxAssignment_0 )* ) )
            // InternalDimacs.g:546:2: ( ( rule__LigneClause__LitterauxAssignment_0 ) ) ( ( rule__LigneClause__LitterauxAssignment_0 )* )
            {
            // InternalDimacs.g:546:2: ( ( rule__LigneClause__LitterauxAssignment_0 ) )
            // InternalDimacs.g:547:3: ( rule__LigneClause__LitterauxAssignment_0 )
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxAssignment_0()); 
            // InternalDimacs.g:548:3: ( rule__LigneClause__LitterauxAssignment_0 )
            // InternalDimacs.g:548:4: rule__LigneClause__LitterauxAssignment_0
            {
            pushFollow(FOLLOW_7);
            rule__LigneClause__LitterauxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLigneClauseAccess().getLitterauxAssignment_0()); 

            }

            // InternalDimacs.g:551:2: ( ( rule__LigneClause__LitterauxAssignment_0 )* )
            // InternalDimacs.g:552:3: ( rule__LigneClause__LitterauxAssignment_0 )*
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxAssignment_0()); 
            // InternalDimacs.g:553:3: ( rule__LigneClause__LitterauxAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDimacs.g:553:4: rule__LigneClause__LitterauxAssignment_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LigneClause__LitterauxAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLigneClauseAccess().getLitterauxAssignment_0()); 

            }


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
    // $ANTLR end "rule__LigneClause__Group__0__Impl"


    // $ANTLR start "rule__LigneClause__Group__1"
    // InternalDimacs.g:562:1: rule__LigneClause__Group__1 : rule__LigneClause__Group__1__Impl ;
    public final void rule__LigneClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:566:1: ( rule__LigneClause__Group__1__Impl )
            // InternalDimacs.g:567:2: rule__LigneClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneClause__Group__1__Impl();

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
    // $ANTLR end "rule__LigneClause__Group__1"


    // $ANTLR start "rule__LigneClause__Group__1__Impl"
    // InternalDimacs.g:573:1: rule__LigneClause__Group__1__Impl : ( '0' ) ;
    public final void rule__LigneClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:577:1: ( ( '0' ) )
            // InternalDimacs.g:578:1: ( '0' )
            {
            // InternalDimacs.g:578:1: ( '0' )
            // InternalDimacs.g:579:2: '0'
            {
             before(grammarAccess.getLigneClauseAccess().getDigitZeroKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLigneClauseAccess().getDigitZeroKeyword_1()); 

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
    // $ANTLR end "rule__LigneClause__Group__1__Impl"


    // $ANTLR start "rule__CNF__CommentsAssignment_0"
    // InternalDimacs.g:589:1: rule__CNF__CommentsAssignment_0 : ( ruleCommentaire ) ;
    public final void rule__CNF__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:593:1: ( ( ruleCommentaire ) )
            // InternalDimacs.g:594:2: ( ruleCommentaire )
            {
            // InternalDimacs.g:594:2: ( ruleCommentaire )
            // InternalDimacs.g:595:3: ruleCommentaire
            {
             before(grammarAccess.getCNFAccess().getCommentsCommentaireParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommentaire();

            state._fsp--;

             after(grammarAccess.getCNFAccess().getCommentsCommentaireParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CNF__CommentsAssignment_0"


    // $ANTLR start "rule__CNF__ProblemAssignment_2"
    // InternalDimacs.g:604:1: rule__CNF__ProblemAssignment_2 : ( ruleLigneProbleme ) ;
    public final void rule__CNF__ProblemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:608:1: ( ( ruleLigneProbleme ) )
            // InternalDimacs.g:609:2: ( ruleLigneProbleme )
            {
            // InternalDimacs.g:609:2: ( ruleLigneProbleme )
            // InternalDimacs.g:610:3: ruleLigneProbleme
            {
             before(grammarAccess.getCNFAccess().getProblemLigneProblemeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneProbleme();

            state._fsp--;

             after(grammarAccess.getCNFAccess().getProblemLigneProblemeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CNF__ProblemAssignment_2"


    // $ANTLR start "rule__CNF__ClausesAssignment_4"
    // InternalDimacs.g:619:1: rule__CNF__ClausesAssignment_4 : ( ruleLigneClause ) ;
    public final void rule__CNF__ClausesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:623:1: ( ( ruleLigneClause ) )
            // InternalDimacs.g:624:2: ( ruleLigneClause )
            {
            // InternalDimacs.g:624:2: ( ruleLigneClause )
            // InternalDimacs.g:625:3: ruleLigneClause
            {
             before(grammarAccess.getCNFAccess().getClausesLigneClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneClause();

            state._fsp--;

             after(grammarAccess.getCNFAccess().getClausesLigneClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CNF__ClausesAssignment_4"


    // $ANTLR start "rule__Commentaire__ContentAssignment_1"
    // InternalDimacs.g:634:1: rule__Commentaire__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Commentaire__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:638:1: ( ( RULE_STRING ) )
            // InternalDimacs.g:639:2: ( RULE_STRING )
            {
            // InternalDimacs.g:639:2: ( RULE_STRING )
            // InternalDimacs.g:640:3: RULE_STRING
            {
             before(grammarAccess.getCommentaireAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentaireAccess().getContentSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Commentaire__ContentAssignment_1"


    // $ANTLR start "rule__LigneProbleme__Nb_variablesAssignment_2"
    // InternalDimacs.g:649:1: rule__LigneProbleme__Nb_variablesAssignment_2 : ( RULE_INT ) ;
    public final void rule__LigneProbleme__Nb_variablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:653:1: ( ( RULE_INT ) )
            // InternalDimacs.g:654:2: ( RULE_INT )
            {
            // InternalDimacs.g:654:2: ( RULE_INT )
            // InternalDimacs.g:655:3: RULE_INT
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_variablesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getNb_variablesINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Nb_variablesAssignment_2"


    // $ANTLR start "rule__LigneProbleme__Nb_clausesAssignment_3"
    // InternalDimacs.g:664:1: rule__LigneProbleme__Nb_clausesAssignment_3 : ( RULE_INT ) ;
    public final void rule__LigneProbleme__Nb_clausesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:668:1: ( ( RULE_INT ) )
            // InternalDimacs.g:669:2: ( RULE_INT )
            {
            // InternalDimacs.g:669:2: ( RULE_INT )
            // InternalDimacs.g:670:3: RULE_INT
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_clausesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getNb_clausesINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Nb_clausesAssignment_3"


    // $ANTLR start "rule__LigneClause__LitterauxAssignment_0"
    // InternalDimacs.g:679:1: rule__LigneClause__LitterauxAssignment_0 : ( rulelitteral ) ;
    public final void rule__LigneClause__LitterauxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:683:1: ( ( rulelitteral ) )
            // InternalDimacs.g:684:2: ( rulelitteral )
            {
            // InternalDimacs.g:684:2: ( rulelitteral )
            // InternalDimacs.g:685:3: rulelitteral
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulelitteral();

            state._fsp--;

             after(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LigneClause__LitterauxAssignment_0"


    // $ANTLR start "rule__Litteral__ValAssignment"
    // InternalDimacs.g:694:1: rule__Litteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__Litteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:698:1: ( ( RULE_INT ) )
            // InternalDimacs.g:699:2: ( RULE_INT )
            {
            // InternalDimacs.g:699:2: ( RULE_INT )
            // InternalDimacs.g:700:3: RULE_INT
            {
             before(grammarAccess.getLitteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLitteralAccess().getValINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Litteral__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});

}