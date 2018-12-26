package org.xtext.projection.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.projection.services.ProjectionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_TIME", "RULE_CAMELCASE_IDENTIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_LINE_COMMENT", "RULE_LINE_COMMENT2", "RULE_ALERT_LINE_COMMENT", "RULE_QUESTION_LINE_COMMENT", "RULE_GOOD_LINE_COMMENT", "RULE_REGION_COMMENT", "RULE_CHARACTER", "RULE_ANY_OTHER", "'Hi'", "'Integer:'", "'Decimal:'", "'ID:'", "'Time:'"
    };
    public static final int RULE_CHARACTER=19;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_QUESTION_LINE_COMMENT=16;
    public static final int RULE_GOOD_LINE_COMMENT=17;
    public static final int RULE_TIME=8;
    public static final int EOF=-1;
    public static final int RULE_REGION_COMMENT=18;
    public static final int RULE_CAMELCASE_IDENTIFIER=9;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_LINE_COMMENT2=14;
    public static final int RULE_ALERT_LINE_COMMENT=15;
    public static final int RULE_INT=5;
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

        public InternalProjectionParser(TokenStream input, ProjectionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ProjectionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalProjection.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalProjection.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalProjection.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalProjection.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalProjection.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalProjection.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalProjection.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjection.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalProjection.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalProjection.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.projection.Projection.Element");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalProjection.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalProjection.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalProjection.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalProjection.g:107:1: ruleElement returns [EObject current=null] : (this_MyText_0= ruleMyText | this_MyInt_1= ruleMyInt | this_MyDecimal_2= ruleMyDecimal | this_MyId_3= ruleMyId | this_MyTime_4= ruleMyTime ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_MyText_0 = null;

        EObject this_MyInt_1 = null;

        EObject this_MyDecimal_2 = null;

        EObject this_MyId_3 = null;

        EObject this_MyTime_4 = null;



        	enterRule();

        try {
            // InternalProjection.g:113:2: ( (this_MyText_0= ruleMyText | this_MyInt_1= ruleMyInt | this_MyDecimal_2= ruleMyDecimal | this_MyId_3= ruleMyId | this_MyTime_4= ruleMyTime ) )
            // InternalProjection.g:114:2: (this_MyText_0= ruleMyText | this_MyInt_1= ruleMyInt | this_MyDecimal_2= ruleMyDecimal | this_MyId_3= ruleMyId | this_MyTime_4= ruleMyTime )
            {
            // InternalProjection.g:114:2: (this_MyText_0= ruleMyText | this_MyInt_1= ruleMyInt | this_MyDecimal_2= ruleMyDecimal | this_MyId_3= ruleMyId | this_MyTime_4= ruleMyTime )
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
                    // InternalProjection.g:115:3: this_MyText_0= ruleMyText
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMyTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyText_0=ruleMyText();

                    state._fsp--;


                    			current = this_MyText_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProjection.g:124:3: this_MyInt_1= ruleMyInt
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMyIntParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyInt_1=ruleMyInt();

                    state._fsp--;


                    			current = this_MyInt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProjection.g:133:3: this_MyDecimal_2= ruleMyDecimal
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMyDecimalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyDecimal_2=ruleMyDecimal();

                    state._fsp--;


                    			current = this_MyDecimal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProjection.g:142:3: this_MyId_3= ruleMyId
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMyIdParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyId_3=ruleMyId();

                    state._fsp--;


                    			current = this_MyId_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProjection.g:151:3: this_MyTime_4= ruleMyTime
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMyTimeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyTime_4=ruleMyTime();

                    state._fsp--;


                    			current = this_MyTime_4;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleMyText"
    // InternalProjection.g:163:1: entryRuleMyText returns [EObject current=null] : iv_ruleMyText= ruleMyText EOF ;
    public final EObject entryRuleMyText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyText = null;


        try {
            // InternalProjection.g:163:47: (iv_ruleMyText= ruleMyText EOF )
            // InternalProjection.g:164:2: iv_ruleMyText= ruleMyText EOF
            {
             newCompositeNode(grammarAccess.getMyTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyText=ruleMyText();

            state._fsp--;

             current =iv_ruleMyText; 
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
    // $ANTLR end "entryRuleMyText"


    // $ANTLR start "ruleMyText"
    // InternalProjection.g:170:1: ruleMyText returns [EObject current=null] : (otherlv_0= 'Hi' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMyText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProjection.g:176:2: ( (otherlv_0= 'Hi' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalProjection.g:177:2: (otherlv_0= 'Hi' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalProjection.g:177:2: (otherlv_0= 'Hi' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalProjection.g:178:3: otherlv_0= 'Hi' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMyTextAccess().getHiKeyword_0());
            		
            // InternalProjection.g:182:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProjection.g:183:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProjection.g:183:4: (lv_name_1_0= RULE_STRING )
            // InternalProjection.g:184:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMyTextAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleMyText"


    // $ANTLR start "entryRuleMyInt"
    // InternalProjection.g:204:1: entryRuleMyInt returns [EObject current=null] : iv_ruleMyInt= ruleMyInt EOF ;
    public final EObject entryRuleMyInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyInt = null;


        try {
            // InternalProjection.g:204:46: (iv_ruleMyInt= ruleMyInt EOF )
            // InternalProjection.g:205:2: iv_ruleMyInt= ruleMyInt EOF
            {
             newCompositeNode(grammarAccess.getMyIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyInt=ruleMyInt();

            state._fsp--;

             current =iv_ruleMyInt; 
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
    // $ANTLR end "entryRuleMyInt"


    // $ANTLR start "ruleMyInt"
    // InternalProjection.g:211:1: ruleMyInt returns [EObject current=null] : (otherlv_0= 'Integer:' ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMyInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalProjection.g:217:2: ( (otherlv_0= 'Integer:' ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalProjection.g:218:2: (otherlv_0= 'Integer:' ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalProjection.g:218:2: (otherlv_0= 'Integer:' ( (lv_int_1_0= RULE_INT ) ) )
            // InternalProjection.g:219:3: otherlv_0= 'Integer:' ( (lv_int_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMyIntAccess().getIntegerKeyword_0());
            		
            // InternalProjection.g:223:3: ( (lv_int_1_0= RULE_INT ) )
            // InternalProjection.g:224:4: (lv_int_1_0= RULE_INT )
            {
            // InternalProjection.g:224:4: (lv_int_1_0= RULE_INT )
            // InternalProjection.g:225:5: lv_int_1_0= RULE_INT
            {
            lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_int_1_0, grammarAccess.getMyIntAccess().getIntINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyIntRule());
            					}
            					setWithLastConsumed(
            						current,
            						"int",
            						lv_int_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMyInt"


    // $ANTLR start "entryRuleMyDecimal"
    // InternalProjection.g:245:1: entryRuleMyDecimal returns [EObject current=null] : iv_ruleMyDecimal= ruleMyDecimal EOF ;
    public final EObject entryRuleMyDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyDecimal = null;


        try {
            // InternalProjection.g:245:50: (iv_ruleMyDecimal= ruleMyDecimal EOF )
            // InternalProjection.g:246:2: iv_ruleMyDecimal= ruleMyDecimal EOF
            {
             newCompositeNode(grammarAccess.getMyDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyDecimal=ruleMyDecimal();

            state._fsp--;

             current =iv_ruleMyDecimal; 
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
    // $ANTLR end "entryRuleMyDecimal"


    // $ANTLR start "ruleMyDecimal"
    // InternalProjection.g:252:1: ruleMyDecimal returns [EObject current=null] : (otherlv_0= 'Decimal:' ( (lv_dec_1_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleMyDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dec_1_0=null;


        	enterRule();

        try {
            // InternalProjection.g:258:2: ( (otherlv_0= 'Decimal:' ( (lv_dec_1_0= RULE_DECIMAL ) ) ) )
            // InternalProjection.g:259:2: (otherlv_0= 'Decimal:' ( (lv_dec_1_0= RULE_DECIMAL ) ) )
            {
            // InternalProjection.g:259:2: (otherlv_0= 'Decimal:' ( (lv_dec_1_0= RULE_DECIMAL ) ) )
            // InternalProjection.g:260:3: otherlv_0= 'Decimal:' ( (lv_dec_1_0= RULE_DECIMAL ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMyDecimalAccess().getDecimalKeyword_0());
            		
            // InternalProjection.g:264:3: ( (lv_dec_1_0= RULE_DECIMAL ) )
            // InternalProjection.g:265:4: (lv_dec_1_0= RULE_DECIMAL )
            {
            // InternalProjection.g:265:4: (lv_dec_1_0= RULE_DECIMAL )
            // InternalProjection.g:266:5: lv_dec_1_0= RULE_DECIMAL
            {
            lv_dec_1_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

            					newLeafNode(lv_dec_1_0, grammarAccess.getMyDecimalAccess().getDecDECIMALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyDecimalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dec",
            						lv_dec_1_0,
            						"org.xtext.projection.CustomTerminals.DECIMAL");
            				

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
    // $ANTLR end "ruleMyDecimal"


    // $ANTLR start "entryRuleMyId"
    // InternalProjection.g:286:1: entryRuleMyId returns [EObject current=null] : iv_ruleMyId= ruleMyId EOF ;
    public final EObject entryRuleMyId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyId = null;


        try {
            // InternalProjection.g:286:45: (iv_ruleMyId= ruleMyId EOF )
            // InternalProjection.g:287:2: iv_ruleMyId= ruleMyId EOF
            {
             newCompositeNode(grammarAccess.getMyIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyId=ruleMyId();

            state._fsp--;

             current =iv_ruleMyId; 
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
    // $ANTLR end "entryRuleMyId"


    // $ANTLR start "ruleMyId"
    // InternalProjection.g:293:1: ruleMyId returns [EObject current=null] : (otherlv_0= 'ID:' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMyId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalProjection.g:299:2: ( (otherlv_0= 'ID:' ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalProjection.g:300:2: (otherlv_0= 'ID:' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalProjection.g:300:2: (otherlv_0= 'ID:' ( (lv_id_1_0= RULE_ID ) ) )
            // InternalProjection.g:301:3: otherlv_0= 'ID:' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMyIdAccess().getIDKeyword_0());
            		
            // InternalProjection.g:305:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalProjection.g:306:4: (lv_id_1_0= RULE_ID )
            {
            // InternalProjection.g:306:4: (lv_id_1_0= RULE_ID )
            // InternalProjection.g:307:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getMyIdAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleMyId"


    // $ANTLR start "entryRuleMyTime"
    // InternalProjection.g:327:1: entryRuleMyTime returns [EObject current=null] : iv_ruleMyTime= ruleMyTime EOF ;
    public final EObject entryRuleMyTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyTime = null;


        try {
            // InternalProjection.g:327:47: (iv_ruleMyTime= ruleMyTime EOF )
            // InternalProjection.g:328:2: iv_ruleMyTime= ruleMyTime EOF
            {
             newCompositeNode(grammarAccess.getMyTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyTime=ruleMyTime();

            state._fsp--;

             current =iv_ruleMyTime; 
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
    // $ANTLR end "entryRuleMyTime"


    // $ANTLR start "ruleMyTime"
    // InternalProjection.g:334:1: ruleMyTime returns [EObject current=null] : (otherlv_0= 'Time:' ( (lv_time_1_0= RULE_TIME ) ) ) ;
    public final EObject ruleMyTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;


        	enterRule();

        try {
            // InternalProjection.g:340:2: ( (otherlv_0= 'Time:' ( (lv_time_1_0= RULE_TIME ) ) ) )
            // InternalProjection.g:341:2: (otherlv_0= 'Time:' ( (lv_time_1_0= RULE_TIME ) ) )
            {
            // InternalProjection.g:341:2: (otherlv_0= 'Time:' ( (lv_time_1_0= RULE_TIME ) ) )
            // InternalProjection.g:342:3: otherlv_0= 'Time:' ( (lv_time_1_0= RULE_TIME ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMyTimeAccess().getTimeKeyword_0());
            		
            // InternalProjection.g:346:3: ( (lv_time_1_0= RULE_TIME ) )
            // InternalProjection.g:347:4: (lv_time_1_0= RULE_TIME )
            {
            // InternalProjection.g:347:4: (lv_time_1_0= RULE_TIME )
            // InternalProjection.g:348:5: lv_time_1_0= RULE_TIME
            {
            lv_time_1_0=(Token)match(input,RULE_TIME,FOLLOW_2); 

            					newLeafNode(lv_time_1_0, grammarAccess.getMyTimeAccess().getTimeTIMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.xtext.projection.CustomTerminals.TIME");
            				

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
    // $ANTLR end "ruleMyTime"


    // $ANTLR start "entryRuleTerminal"
    // InternalProjection.g:368:1: entryRuleTerminal returns [String current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final String entryRuleTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminal = null;


        try {
            // InternalProjection.g:368:48: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalProjection.g:369:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal.getText(); 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalProjection.g:375:1: ruleTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TIME_0=null;
        Token this_CAMELCASE_IDENTIFIER_1=null;
        Token this_DECIMAL_2=null;


        	enterRule();

        try {
            // InternalProjection.g:381:2: ( (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL ) )
            // InternalProjection.g:382:2: (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL )
            {
            // InternalProjection.g:382:2: (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL )
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
                    // InternalProjection.g:383:3: this_TIME_0= RULE_TIME
                    {
                    this_TIME_0=(Token)match(input,RULE_TIME,FOLLOW_2); 

                    			current.merge(this_TIME_0);
                    		

                    			newLeafNode(this_TIME_0, grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProjection.g:391:3: this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER
                    {
                    this_CAMELCASE_IDENTIFIER_1=(Token)match(input,RULE_CAMELCASE_IDENTIFIER,FOLLOW_2); 

                    			current.merge(this_CAMELCASE_IDENTIFIER_1);
                    		

                    			newLeafNode(this_CAMELCASE_IDENTIFIER_1, grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProjection.g:399:3: this_DECIMAL_2= RULE_DECIMAL
                    {
                    this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    			current.merge(this_DECIMAL_2);
                    		

                    			newLeafNode(this_DECIMAL_2, grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleTerminal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});

}