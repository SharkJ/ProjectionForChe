package org.xtext.projection.ide.contentassist.antlr.internal;

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
import org.xtext.projection.services.ProjectionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TIME", "RULE_CAMELCASE_IDENTIFIER", "RULE_DECIMAL", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_LINE_COMMENT", "RULE_LINE_COMMENT2", "RULE_ALERT_LINE_COMMENT", "RULE_QUESTION_LINE_COMMENT", "RULE_GOOD_LINE_COMMENT", "RULE_REGION_COMMENT", "RULE_CHARACTER", "RULE_ANY_OTHER", "'Hi'", "'Integer:'", "'Decimal:'", "'ID:'", "'Time:'"
    };
    public static final int RULE_CHARACTER=19;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_QUESTION_LINE_COMMENT=16;
    public static final int RULE_GOOD_LINE_COMMENT=17;
    public static final int RULE_TIME=4;
    public static final int EOF=-1;
    public static final int RULE_REGION_COMMENT=18;
    public static final int RULE_CAMELCASE_IDENTIFIER=5;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_LINE_COMMENT2=14;
    public static final int RULE_ALERT_LINE_COMMENT=15;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_LINE_COMMENT=13;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjection.g"; }


    	private ProjectionGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProjectionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalProjection.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalProjection.g:54:1: ( ruleModel EOF )
            // InternalProjection.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProjection.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalProjection.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalProjection.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalProjection.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalProjection.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjection.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalProjection.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalProjection.g:79:1: ( ruleElement EOF )
            // InternalProjection.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalProjection.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalProjection.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalProjection.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalProjection.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalProjection.g:94:3: ( rule__Element__Alternatives )
            // InternalProjection.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMyText"
    // InternalProjection.g:103:1: entryRuleMyText : ruleMyText EOF ;
    public final void entryRuleMyText() throws RecognitionException {
        try {
            // InternalProjection.g:104:1: ( ruleMyText EOF )
            // InternalProjection.g:105:1: ruleMyText EOF
            {
             before(grammarAccess.getMyTextRule()); 
            pushFollow(FOLLOW_1);
            ruleMyText();

            state._fsp--;

             after(grammarAccess.getMyTextRule()); 
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
    // $ANTLR end "entryRuleMyText"


    // $ANTLR start "ruleMyText"
    // InternalProjection.g:112:1: ruleMyText : ( ( rule__MyText__Group__0 ) ) ;
    public final void ruleMyText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:116:2: ( ( ( rule__MyText__Group__0 ) ) )
            // InternalProjection.g:117:2: ( ( rule__MyText__Group__0 ) )
            {
            // InternalProjection.g:117:2: ( ( rule__MyText__Group__0 ) )
            // InternalProjection.g:118:3: ( rule__MyText__Group__0 )
            {
             before(grammarAccess.getMyTextAccess().getGroup()); 
            // InternalProjection.g:119:3: ( rule__MyText__Group__0 )
            // InternalProjection.g:119:4: rule__MyText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyTextAccess().getGroup()); 

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
    // $ANTLR end "ruleMyText"


    // $ANTLR start "entryRuleMyInt"
    // InternalProjection.g:128:1: entryRuleMyInt : ruleMyInt EOF ;
    public final void entryRuleMyInt() throws RecognitionException {
        try {
            // InternalProjection.g:129:1: ( ruleMyInt EOF )
            // InternalProjection.g:130:1: ruleMyInt EOF
            {
             before(grammarAccess.getMyIntRule()); 
            pushFollow(FOLLOW_1);
            ruleMyInt();

            state._fsp--;

             after(grammarAccess.getMyIntRule()); 
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
    // $ANTLR end "entryRuleMyInt"


    // $ANTLR start "ruleMyInt"
    // InternalProjection.g:137:1: ruleMyInt : ( ( rule__MyInt__Group__0 ) ) ;
    public final void ruleMyInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:141:2: ( ( ( rule__MyInt__Group__0 ) ) )
            // InternalProjection.g:142:2: ( ( rule__MyInt__Group__0 ) )
            {
            // InternalProjection.g:142:2: ( ( rule__MyInt__Group__0 ) )
            // InternalProjection.g:143:3: ( rule__MyInt__Group__0 )
            {
             before(grammarAccess.getMyIntAccess().getGroup()); 
            // InternalProjection.g:144:3: ( rule__MyInt__Group__0 )
            // InternalProjection.g:144:4: rule__MyInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIntAccess().getGroup()); 

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
    // $ANTLR end "ruleMyInt"


    // $ANTLR start "entryRuleMyDecimal"
    // InternalProjection.g:153:1: entryRuleMyDecimal : ruleMyDecimal EOF ;
    public final void entryRuleMyDecimal() throws RecognitionException {
        try {
            // InternalProjection.g:154:1: ( ruleMyDecimal EOF )
            // InternalProjection.g:155:1: ruleMyDecimal EOF
            {
             before(grammarAccess.getMyDecimalRule()); 
            pushFollow(FOLLOW_1);
            ruleMyDecimal();

            state._fsp--;

             after(grammarAccess.getMyDecimalRule()); 
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
    // $ANTLR end "entryRuleMyDecimal"


    // $ANTLR start "ruleMyDecimal"
    // InternalProjection.g:162:1: ruleMyDecimal : ( ( rule__MyDecimal__Group__0 ) ) ;
    public final void ruleMyDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:166:2: ( ( ( rule__MyDecimal__Group__0 ) ) )
            // InternalProjection.g:167:2: ( ( rule__MyDecimal__Group__0 ) )
            {
            // InternalProjection.g:167:2: ( ( rule__MyDecimal__Group__0 ) )
            // InternalProjection.g:168:3: ( rule__MyDecimal__Group__0 )
            {
             before(grammarAccess.getMyDecimalAccess().getGroup()); 
            // InternalProjection.g:169:3: ( rule__MyDecimal__Group__0 )
            // InternalProjection.g:169:4: rule__MyDecimal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyDecimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyDecimalAccess().getGroup()); 

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
    // $ANTLR end "ruleMyDecimal"


    // $ANTLR start "entryRuleMyId"
    // InternalProjection.g:178:1: entryRuleMyId : ruleMyId EOF ;
    public final void entryRuleMyId() throws RecognitionException {
        try {
            // InternalProjection.g:179:1: ( ruleMyId EOF )
            // InternalProjection.g:180:1: ruleMyId EOF
            {
             before(grammarAccess.getMyIdRule()); 
            pushFollow(FOLLOW_1);
            ruleMyId();

            state._fsp--;

             after(grammarAccess.getMyIdRule()); 
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
    // $ANTLR end "entryRuleMyId"


    // $ANTLR start "ruleMyId"
    // InternalProjection.g:187:1: ruleMyId : ( ( rule__MyId__Group__0 ) ) ;
    public final void ruleMyId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:191:2: ( ( ( rule__MyId__Group__0 ) ) )
            // InternalProjection.g:192:2: ( ( rule__MyId__Group__0 ) )
            {
            // InternalProjection.g:192:2: ( ( rule__MyId__Group__0 ) )
            // InternalProjection.g:193:3: ( rule__MyId__Group__0 )
            {
             before(grammarAccess.getMyIdAccess().getGroup()); 
            // InternalProjection.g:194:3: ( rule__MyId__Group__0 )
            // InternalProjection.g:194:4: rule__MyId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIdAccess().getGroup()); 

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
    // $ANTLR end "ruleMyId"


    // $ANTLR start "entryRuleMyTime"
    // InternalProjection.g:203:1: entryRuleMyTime : ruleMyTime EOF ;
    public final void entryRuleMyTime() throws RecognitionException {
        try {
            // InternalProjection.g:204:1: ( ruleMyTime EOF )
            // InternalProjection.g:205:1: ruleMyTime EOF
            {
             before(grammarAccess.getMyTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleMyTime();

            state._fsp--;

             after(grammarAccess.getMyTimeRule()); 
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
    // $ANTLR end "entryRuleMyTime"


    // $ANTLR start "ruleMyTime"
    // InternalProjection.g:212:1: ruleMyTime : ( ( rule__MyTime__Group__0 ) ) ;
    public final void ruleMyTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:216:2: ( ( ( rule__MyTime__Group__0 ) ) )
            // InternalProjection.g:217:2: ( ( rule__MyTime__Group__0 ) )
            {
            // InternalProjection.g:217:2: ( ( rule__MyTime__Group__0 ) )
            // InternalProjection.g:218:3: ( rule__MyTime__Group__0 )
            {
             before(grammarAccess.getMyTimeAccess().getGroup()); 
            // InternalProjection.g:219:3: ( rule__MyTime__Group__0 )
            // InternalProjection.g:219:4: rule__MyTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleMyTime"


    // $ANTLR start "entryRuleTerminal"
    // InternalProjection.g:228:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalProjection.g:229:1: ( ruleTerminal EOF )
            // InternalProjection.g:230:1: ruleTerminal EOF
            {
             before(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getTerminalRule()); 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalProjection.g:237:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:241:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // InternalProjection.g:242:2: ( ( rule__Terminal__Alternatives ) )
            {
            // InternalProjection.g:242:2: ( ( rule__Terminal__Alternatives ) )
            // InternalProjection.g:243:3: ( rule__Terminal__Alternatives )
            {
             before(grammarAccess.getTerminalAccess().getAlternatives()); 
            // InternalProjection.g:244:3: ( rule__Terminal__Alternatives )
            // InternalProjection.g:244:4: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalProjection.g:252:1: rule__Element__Alternatives : ( ( ruleMyText ) | ( ruleMyInt ) | ( ruleMyDecimal ) | ( ruleMyId ) | ( ruleMyTime ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:256:1: ( ( ruleMyText ) | ( ruleMyInt ) | ( ruleMyDecimal ) | ( ruleMyId ) | ( ruleMyTime ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 25:
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
                    // InternalProjection.g:257:2: ( ruleMyText )
                    {
                    // InternalProjection.g:257:2: ( ruleMyText )
                    // InternalProjection.g:258:3: ruleMyText
                    {
                     before(grammarAccess.getElementAccess().getMyTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMyText();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMyTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjection.g:263:2: ( ruleMyInt )
                    {
                    // InternalProjection.g:263:2: ( ruleMyInt )
                    // InternalProjection.g:264:3: ruleMyInt
                    {
                     before(grammarAccess.getElementAccess().getMyIntParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMyInt();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMyIntParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProjection.g:269:2: ( ruleMyDecimal )
                    {
                    // InternalProjection.g:269:2: ( ruleMyDecimal )
                    // InternalProjection.g:270:3: ruleMyDecimal
                    {
                     before(grammarAccess.getElementAccess().getMyDecimalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMyDecimal();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMyDecimalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProjection.g:275:2: ( ruleMyId )
                    {
                    // InternalProjection.g:275:2: ( ruleMyId )
                    // InternalProjection.g:276:3: ruleMyId
                    {
                     before(grammarAccess.getElementAccess().getMyIdParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMyId();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMyIdParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProjection.g:281:2: ( ruleMyTime )
                    {
                    // InternalProjection.g:281:2: ( ruleMyTime )
                    // InternalProjection.g:282:3: ruleMyTime
                    {
                     before(grammarAccess.getElementAccess().getMyTimeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMyTime();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMyTimeParserRuleCall_4()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Terminal__Alternatives"
    // InternalProjection.g:291:1: rule__Terminal__Alternatives : ( ( RULE_TIME ) | ( RULE_CAMELCASE_IDENTIFIER ) | ( RULE_DECIMAL ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:295:1: ( ( RULE_TIME ) | ( RULE_CAMELCASE_IDENTIFIER ) | ( RULE_DECIMAL ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_TIME:
                {
                alt3=1;
                }
                break;
            case RULE_CAMELCASE_IDENTIFIER:
                {
                alt3=2;
                }
                break;
            case RULE_DECIMAL:
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
                    // InternalProjection.g:296:2: ( RULE_TIME )
                    {
                    // InternalProjection.g:296:2: ( RULE_TIME )
                    // InternalProjection.g:297:3: RULE_TIME
                    {
                     before(grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0()); 
                    match(input,RULE_TIME,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjection.g:302:2: ( RULE_CAMELCASE_IDENTIFIER )
                    {
                    // InternalProjection.g:302:2: ( RULE_CAMELCASE_IDENTIFIER )
                    // InternalProjection.g:303:3: RULE_CAMELCASE_IDENTIFIER
                    {
                     before(grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1()); 
                    match(input,RULE_CAMELCASE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProjection.g:308:2: ( RULE_DECIMAL )
                    {
                    // InternalProjection.g:308:2: ( RULE_DECIMAL )
                    // InternalProjection.g:309:3: RULE_DECIMAL
                    {
                     before(grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2()); 
                    match(input,RULE_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__MyText__Group__0"
    // InternalProjection.g:318:1: rule__MyText__Group__0 : rule__MyText__Group__0__Impl rule__MyText__Group__1 ;
    public final void rule__MyText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:322:1: ( rule__MyText__Group__0__Impl rule__MyText__Group__1 )
            // InternalProjection.g:323:2: rule__MyText__Group__0__Impl rule__MyText__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MyText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyText__Group__1();

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
    // $ANTLR end "rule__MyText__Group__0"


    // $ANTLR start "rule__MyText__Group__0__Impl"
    // InternalProjection.g:330:1: rule__MyText__Group__0__Impl : ( 'Hi' ) ;
    public final void rule__MyText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:334:1: ( ( 'Hi' ) )
            // InternalProjection.g:335:1: ( 'Hi' )
            {
            // InternalProjection.g:335:1: ( 'Hi' )
            // InternalProjection.g:336:2: 'Hi'
            {
             before(grammarAccess.getMyTextAccess().getHiKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMyTextAccess().getHiKeyword_0()); 

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
    // $ANTLR end "rule__MyText__Group__0__Impl"


    // $ANTLR start "rule__MyText__Group__1"
    // InternalProjection.g:345:1: rule__MyText__Group__1 : rule__MyText__Group__1__Impl ;
    public final void rule__MyText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:349:1: ( rule__MyText__Group__1__Impl )
            // InternalProjection.g:350:2: rule__MyText__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyText__Group__1__Impl();

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
    // $ANTLR end "rule__MyText__Group__1"


    // $ANTLR start "rule__MyText__Group__1__Impl"
    // InternalProjection.g:356:1: rule__MyText__Group__1__Impl : ( ( rule__MyText__NameAssignment_1 ) ) ;
    public final void rule__MyText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:360:1: ( ( ( rule__MyText__NameAssignment_1 ) ) )
            // InternalProjection.g:361:1: ( ( rule__MyText__NameAssignment_1 ) )
            {
            // InternalProjection.g:361:1: ( ( rule__MyText__NameAssignment_1 ) )
            // InternalProjection.g:362:2: ( rule__MyText__NameAssignment_1 )
            {
             before(grammarAccess.getMyTextAccess().getNameAssignment_1()); 
            // InternalProjection.g:363:2: ( rule__MyText__NameAssignment_1 )
            // InternalProjection.g:363:3: rule__MyText__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyText__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyTextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MyText__Group__1__Impl"


    // $ANTLR start "rule__MyInt__Group__0"
    // InternalProjection.g:372:1: rule__MyInt__Group__0 : rule__MyInt__Group__0__Impl rule__MyInt__Group__1 ;
    public final void rule__MyInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:376:1: ( rule__MyInt__Group__0__Impl rule__MyInt__Group__1 )
            // InternalProjection.g:377:2: rule__MyInt__Group__0__Impl rule__MyInt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MyInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyInt__Group__1();

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
    // $ANTLR end "rule__MyInt__Group__0"


    // $ANTLR start "rule__MyInt__Group__0__Impl"
    // InternalProjection.g:384:1: rule__MyInt__Group__0__Impl : ( 'Integer:' ) ;
    public final void rule__MyInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:388:1: ( ( 'Integer:' ) )
            // InternalProjection.g:389:1: ( 'Integer:' )
            {
            // InternalProjection.g:389:1: ( 'Integer:' )
            // InternalProjection.g:390:2: 'Integer:'
            {
             before(grammarAccess.getMyIntAccess().getIntegerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMyIntAccess().getIntegerKeyword_0()); 

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
    // $ANTLR end "rule__MyInt__Group__0__Impl"


    // $ANTLR start "rule__MyInt__Group__1"
    // InternalProjection.g:399:1: rule__MyInt__Group__1 : rule__MyInt__Group__1__Impl ;
    public final void rule__MyInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:403:1: ( rule__MyInt__Group__1__Impl )
            // InternalProjection.g:404:2: rule__MyInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyInt__Group__1__Impl();

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
    // $ANTLR end "rule__MyInt__Group__1"


    // $ANTLR start "rule__MyInt__Group__1__Impl"
    // InternalProjection.g:410:1: rule__MyInt__Group__1__Impl : ( ( rule__MyInt__IntAssignment_1 ) ) ;
    public final void rule__MyInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:414:1: ( ( ( rule__MyInt__IntAssignment_1 ) ) )
            // InternalProjection.g:415:1: ( ( rule__MyInt__IntAssignment_1 ) )
            {
            // InternalProjection.g:415:1: ( ( rule__MyInt__IntAssignment_1 ) )
            // InternalProjection.g:416:2: ( rule__MyInt__IntAssignment_1 )
            {
             before(grammarAccess.getMyIntAccess().getIntAssignment_1()); 
            // InternalProjection.g:417:2: ( rule__MyInt__IntAssignment_1 )
            // InternalProjection.g:417:3: rule__MyInt__IntAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyInt__IntAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyIntAccess().getIntAssignment_1()); 

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
    // $ANTLR end "rule__MyInt__Group__1__Impl"


    // $ANTLR start "rule__MyDecimal__Group__0"
    // InternalProjection.g:426:1: rule__MyDecimal__Group__0 : rule__MyDecimal__Group__0__Impl rule__MyDecimal__Group__1 ;
    public final void rule__MyDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:430:1: ( rule__MyDecimal__Group__0__Impl rule__MyDecimal__Group__1 )
            // InternalProjection.g:431:2: rule__MyDecimal__Group__0__Impl rule__MyDecimal__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MyDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyDecimal__Group__1();

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
    // $ANTLR end "rule__MyDecimal__Group__0"


    // $ANTLR start "rule__MyDecimal__Group__0__Impl"
    // InternalProjection.g:438:1: rule__MyDecimal__Group__0__Impl : ( 'Decimal:' ) ;
    public final void rule__MyDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:442:1: ( ( 'Decimal:' ) )
            // InternalProjection.g:443:1: ( 'Decimal:' )
            {
            // InternalProjection.g:443:1: ( 'Decimal:' )
            // InternalProjection.g:444:2: 'Decimal:'
            {
             before(grammarAccess.getMyDecimalAccess().getDecimalKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMyDecimalAccess().getDecimalKeyword_0()); 

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
    // $ANTLR end "rule__MyDecimal__Group__0__Impl"


    // $ANTLR start "rule__MyDecimal__Group__1"
    // InternalProjection.g:453:1: rule__MyDecimal__Group__1 : rule__MyDecimal__Group__1__Impl ;
    public final void rule__MyDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:457:1: ( rule__MyDecimal__Group__1__Impl )
            // InternalProjection.g:458:2: rule__MyDecimal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyDecimal__Group__1__Impl();

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
    // $ANTLR end "rule__MyDecimal__Group__1"


    // $ANTLR start "rule__MyDecimal__Group__1__Impl"
    // InternalProjection.g:464:1: rule__MyDecimal__Group__1__Impl : ( ( rule__MyDecimal__DecAssignment_1 ) ) ;
    public final void rule__MyDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:468:1: ( ( ( rule__MyDecimal__DecAssignment_1 ) ) )
            // InternalProjection.g:469:1: ( ( rule__MyDecimal__DecAssignment_1 ) )
            {
            // InternalProjection.g:469:1: ( ( rule__MyDecimal__DecAssignment_1 ) )
            // InternalProjection.g:470:2: ( rule__MyDecimal__DecAssignment_1 )
            {
             before(grammarAccess.getMyDecimalAccess().getDecAssignment_1()); 
            // InternalProjection.g:471:2: ( rule__MyDecimal__DecAssignment_1 )
            // InternalProjection.g:471:3: rule__MyDecimal__DecAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyDecimal__DecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyDecimalAccess().getDecAssignment_1()); 

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
    // $ANTLR end "rule__MyDecimal__Group__1__Impl"


    // $ANTLR start "rule__MyId__Group__0"
    // InternalProjection.g:480:1: rule__MyId__Group__0 : rule__MyId__Group__0__Impl rule__MyId__Group__1 ;
    public final void rule__MyId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:484:1: ( rule__MyId__Group__0__Impl rule__MyId__Group__1 )
            // InternalProjection.g:485:2: rule__MyId__Group__0__Impl rule__MyId__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MyId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyId__Group__1();

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
    // $ANTLR end "rule__MyId__Group__0"


    // $ANTLR start "rule__MyId__Group__0__Impl"
    // InternalProjection.g:492:1: rule__MyId__Group__0__Impl : ( 'ID:' ) ;
    public final void rule__MyId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:496:1: ( ( 'ID:' ) )
            // InternalProjection.g:497:1: ( 'ID:' )
            {
            // InternalProjection.g:497:1: ( 'ID:' )
            // InternalProjection.g:498:2: 'ID:'
            {
             before(grammarAccess.getMyIdAccess().getIDKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMyIdAccess().getIDKeyword_0()); 

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
    // $ANTLR end "rule__MyId__Group__0__Impl"


    // $ANTLR start "rule__MyId__Group__1"
    // InternalProjection.g:507:1: rule__MyId__Group__1 : rule__MyId__Group__1__Impl ;
    public final void rule__MyId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:511:1: ( rule__MyId__Group__1__Impl )
            // InternalProjection.g:512:2: rule__MyId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyId__Group__1__Impl();

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
    // $ANTLR end "rule__MyId__Group__1"


    // $ANTLR start "rule__MyId__Group__1__Impl"
    // InternalProjection.g:518:1: rule__MyId__Group__1__Impl : ( ( rule__MyId__IdAssignment_1 ) ) ;
    public final void rule__MyId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:522:1: ( ( ( rule__MyId__IdAssignment_1 ) ) )
            // InternalProjection.g:523:1: ( ( rule__MyId__IdAssignment_1 ) )
            {
            // InternalProjection.g:523:1: ( ( rule__MyId__IdAssignment_1 ) )
            // InternalProjection.g:524:2: ( rule__MyId__IdAssignment_1 )
            {
             before(grammarAccess.getMyIdAccess().getIdAssignment_1()); 
            // InternalProjection.g:525:2: ( rule__MyId__IdAssignment_1 )
            // InternalProjection.g:525:3: rule__MyId__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyId__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyIdAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__MyId__Group__1__Impl"


    // $ANTLR start "rule__MyTime__Group__0"
    // InternalProjection.g:534:1: rule__MyTime__Group__0 : rule__MyTime__Group__0__Impl rule__MyTime__Group__1 ;
    public final void rule__MyTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:538:1: ( rule__MyTime__Group__0__Impl rule__MyTime__Group__1 )
            // InternalProjection.g:539:2: rule__MyTime__Group__0__Impl rule__MyTime__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MyTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyTime__Group__1();

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
    // $ANTLR end "rule__MyTime__Group__0"


    // $ANTLR start "rule__MyTime__Group__0__Impl"
    // InternalProjection.g:546:1: rule__MyTime__Group__0__Impl : ( 'Time:' ) ;
    public final void rule__MyTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:550:1: ( ( 'Time:' ) )
            // InternalProjection.g:551:1: ( 'Time:' )
            {
            // InternalProjection.g:551:1: ( 'Time:' )
            // InternalProjection.g:552:2: 'Time:'
            {
             before(grammarAccess.getMyTimeAccess().getTimeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMyTimeAccess().getTimeKeyword_0()); 

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
    // $ANTLR end "rule__MyTime__Group__0__Impl"


    // $ANTLR start "rule__MyTime__Group__1"
    // InternalProjection.g:561:1: rule__MyTime__Group__1 : rule__MyTime__Group__1__Impl ;
    public final void rule__MyTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:565:1: ( rule__MyTime__Group__1__Impl )
            // InternalProjection.g:566:2: rule__MyTime__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyTime__Group__1__Impl();

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
    // $ANTLR end "rule__MyTime__Group__1"


    // $ANTLR start "rule__MyTime__Group__1__Impl"
    // InternalProjection.g:572:1: rule__MyTime__Group__1__Impl : ( ( rule__MyTime__TimeAssignment_1 ) ) ;
    public final void rule__MyTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:576:1: ( ( ( rule__MyTime__TimeAssignment_1 ) ) )
            // InternalProjection.g:577:1: ( ( rule__MyTime__TimeAssignment_1 ) )
            {
            // InternalProjection.g:577:1: ( ( rule__MyTime__TimeAssignment_1 ) )
            // InternalProjection.g:578:2: ( rule__MyTime__TimeAssignment_1 )
            {
             before(grammarAccess.getMyTimeAccess().getTimeAssignment_1()); 
            // InternalProjection.g:579:2: ( rule__MyTime__TimeAssignment_1 )
            // InternalProjection.g:579:3: rule__MyTime__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyTime__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyTimeAccess().getTimeAssignment_1()); 

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
    // $ANTLR end "rule__MyTime__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalProjection.g:588:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:592:1: ( ( ruleElement ) )
            // InternalProjection.g:593:2: ( ruleElement )
            {
            // InternalProjection.g:593:2: ( ruleElement )
            // InternalProjection.g:594:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__MyText__NameAssignment_1"
    // InternalProjection.g:603:1: rule__MyText__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MyText__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:607:1: ( ( RULE_STRING ) )
            // InternalProjection.g:608:2: ( RULE_STRING )
            {
            // InternalProjection.g:608:2: ( RULE_STRING )
            // InternalProjection.g:609:3: RULE_STRING
            {
             before(grammarAccess.getMyTextAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMyTextAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyText__NameAssignment_1"


    // $ANTLR start "rule__MyInt__IntAssignment_1"
    // InternalProjection.g:618:1: rule__MyInt__IntAssignment_1 : ( RULE_INT ) ;
    public final void rule__MyInt__IntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:622:1: ( ( RULE_INT ) )
            // InternalProjection.g:623:2: ( RULE_INT )
            {
            // InternalProjection.g:623:2: ( RULE_INT )
            // InternalProjection.g:624:3: RULE_INT
            {
             before(grammarAccess.getMyIntAccess().getIntINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMyIntAccess().getIntINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyInt__IntAssignment_1"


    // $ANTLR start "rule__MyDecimal__DecAssignment_1"
    // InternalProjection.g:633:1: rule__MyDecimal__DecAssignment_1 : ( RULE_DECIMAL ) ;
    public final void rule__MyDecimal__DecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:637:1: ( ( RULE_DECIMAL ) )
            // InternalProjection.g:638:2: ( RULE_DECIMAL )
            {
            // InternalProjection.g:638:2: ( RULE_DECIMAL )
            // InternalProjection.g:639:3: RULE_DECIMAL
            {
             before(grammarAccess.getMyDecimalAccess().getDecDECIMALTerminalRuleCall_1_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getMyDecimalAccess().getDecDECIMALTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyDecimal__DecAssignment_1"


    // $ANTLR start "rule__MyId__IdAssignment_1"
    // InternalProjection.g:648:1: rule__MyId__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyId__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:652:1: ( ( RULE_ID ) )
            // InternalProjection.g:653:2: ( RULE_ID )
            {
            // InternalProjection.g:653:2: ( RULE_ID )
            // InternalProjection.g:654:3: RULE_ID
            {
             before(grammarAccess.getMyIdAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMyIdAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyId__IdAssignment_1"


    // $ANTLR start "rule__MyTime__TimeAssignment_1"
    // InternalProjection.g:663:1: rule__MyTime__TimeAssignment_1 : ( RULE_TIME ) ;
    public final void rule__MyTime__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjection.g:667:1: ( ( RULE_TIME ) )
            // InternalProjection.g:668:2: ( RULE_TIME )
            {
            // InternalProjection.g:668:2: ( RULE_TIME )
            // InternalProjection.g:669:3: RULE_TIME
            {
             before(grammarAccess.getMyTimeAccess().getTimeTIMETerminalRuleCall_1_0()); 
            match(input,RULE_TIME,FOLLOW_2); 
             after(grammarAccess.getMyTimeAccess().getTimeTIMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyTime__TimeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}