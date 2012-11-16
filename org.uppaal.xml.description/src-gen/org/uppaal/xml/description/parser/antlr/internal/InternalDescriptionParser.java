package org.uppaal.xml.description.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uppaal.xml.description.services.DescriptionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDescriptionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SYSTEM'", "'DECLARATIONS'", "'PARAMS'", "'EXPRESSION'", "'SELECT'", "'UPDATE'", "'SYNC'", "';'", "'('", "')'", "':='", "'='", "','", "'system'", "'<'", "'['", "']'", "'urgent'", "'broadcast'", "'meta'", "'const'", "'{'", "'}'", "'typedef'", "'int'", "'clock'", "'chan'", "'bool'", "'scalar'", "'struct'", "'&'", "'forall'", "'exists'", "':'", "'imply'", "'or'", "'and'", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<?'", "'>?'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'.'", "'true'", "'false'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalDescriptionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDescriptionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDescriptionParser.tokenNames; }
    public String getGrammarFileName() { return "../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g"; }



     	private DescriptionGrammarAccess grammarAccess;
     	
        public InternalDescriptionParser(TokenStream input, DescriptionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Top";	
       	}
       	
       	@Override
       	protected DescriptionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTop"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:68:1: entryRuleTop returns [EObject current=null] : iv_ruleTop= ruleTop EOF ;
    public final EObject entryRuleTop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTop = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:69:2: (iv_ruleTop= ruleTop EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:70:2: iv_ruleTop= ruleTop EOF
            {
             newCompositeNode(grammarAccess.getTopRule()); 
            pushFollow(FOLLOW_ruleTop_in_entryRuleTop75);
            iv_ruleTop=ruleTop();

            state._fsp--;

             current =iv_ruleTop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTop85); 

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
    // $ANTLR end "entryRuleTop"


    // $ANTLR start "ruleTop"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:77:1: ruleTop returns [EObject current=null] : ( (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition ) | (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations ) | (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters ) | (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression ) | (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList ) | (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate ) | (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation ) ) ;
    public final EObject ruleTop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_UASystemDefinition_1 = null;

        EObject this_UADeclarations_3 = null;

        EObject this_UAParameters_5 = null;

        EObject this_UAExpression_7 = null;

        EObject this_UASelectList_9 = null;

        EObject this_UAUpdate_11 = null;

        EObject this_UASynchronisation_13 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:80:28: ( ( (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition ) | (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations ) | (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters ) | (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression ) | (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList ) | (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate ) | (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:81:1: ( (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition ) | (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations ) | (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters ) | (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression ) | (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList ) | (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate ) | (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:81:1: ( (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition ) | (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations ) | (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters ) | (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression ) | (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList ) | (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate ) | (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:81:2: (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:81:2: (otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:81:4: otherlv_0= 'SYSTEM' this_UASystemDefinition_1= ruleUASystemDefinition
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTop123); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopAccess().getSYSTEMKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUASystemDefinitionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleUASystemDefinition_in_ruleTop145);
                    this_UASystemDefinition_1=ruleUASystemDefinition();

                    state._fsp--;

                     
                            current = this_UASystemDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:95:6: (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:95:6: (otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:95:8: otherlv_2= 'DECLARATIONS' this_UADeclarations_3= ruleUADeclarations
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTop164); 

                        	newLeafNode(otherlv_2, grammarAccess.getTopAccess().getDECLARATIONSKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUADeclarationsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleUADeclarations_in_ruleTop186);
                    this_UADeclarations_3=ruleUADeclarations();

                    state._fsp--;

                     
                            current = this_UADeclarations_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:109:6: (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:109:6: (otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:109:8: otherlv_4= 'PARAMS' this_UAParameters_5= ruleUAParameters
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTop205); 

                        	newLeafNode(otherlv_4, grammarAccess.getTopAccess().getPARAMSKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUAParametersParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleUAParameters_in_ruleTop227);
                    this_UAParameters_5=ruleUAParameters();

                    state._fsp--;

                     
                            current = this_UAParameters_5; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:123:6: (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:123:6: (otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:123:8: otherlv_6= 'EXPRESSION' this_UAExpression_7= ruleUAExpression
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTop246); 

                        	newLeafNode(otherlv_6, grammarAccess.getTopAccess().getEXPRESSIONKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUAExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleUAExpression_in_ruleTop268);
                    this_UAExpression_7=ruleUAExpression();

                    state._fsp--;

                     
                            current = this_UAExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:137:6: (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:137:6: (otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:137:8: otherlv_8= 'SELECT' this_UASelectList_9= ruleUASelectList
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleTop287); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopAccess().getSELECTKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUASelectListParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleUASelectList_in_ruleTop309);
                    this_UASelectList_9=ruleUASelectList();

                    state._fsp--;

                     
                            current = this_UASelectList_9; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:151:6: (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:151:6: (otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:151:8: otherlv_10= 'UPDATE' this_UAUpdate_11= ruleUAUpdate
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleTop328); 

                        	newLeafNode(otherlv_10, grammarAccess.getTopAccess().getUPDATEKeyword_5_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUAUpdateParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleUAUpdate_in_ruleTop350);
                    this_UAUpdate_11=ruleUAUpdate();

                    state._fsp--;

                     
                            current = this_UAUpdate_11; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:165:6: (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:165:6: (otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:165:8: otherlv_12= 'SYNC' this_UASynchronisation_13= ruleUASynchronisation
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTop369); 

                        	newLeafNode(otherlv_12, grammarAccess.getTopAccess().getSYNCKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getTopAccess().getUASynchronisationParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleUASynchronisation_in_ruleTop391);
                    this_UASynchronisation_13=ruleUASynchronisation();

                    state._fsp--;

                     
                            current = this_UASynchronisation_13; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTop"


    // $ANTLR start "entryRuleUASystemDefinition"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:186:1: entryRuleUASystemDefinition returns [EObject current=null] : iv_ruleUASystemDefinition= ruleUASystemDefinition EOF ;
    public final EObject entryRuleUASystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASystemDefinition = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:187:2: (iv_ruleUASystemDefinition= ruleUASystemDefinition EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:188:2: iv_ruleUASystemDefinition= ruleUASystemDefinition EOF
            {
             newCompositeNode(grammarAccess.getUASystemDefinitionRule()); 
            pushFollow(FOLLOW_ruleUASystemDefinition_in_entryRuleUASystemDefinition427);
            iv_ruleUASystemDefinition=ruleUASystemDefinition();

            state._fsp--;

             current =iv_ruleUASystemDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASystemDefinition437); 

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
    // $ANTLR end "entryRuleUASystemDefinition"


    // $ANTLR start "ruleUASystemDefinition"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:195:1: ruleUASystemDefinition returns [EObject current=null] : ( () ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )* ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )? ) ;
    public final EObject ruleUASystemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_definitions_1_0 = null;

        EObject lv_system_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:198:28: ( ( () ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )* ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:199:1: ( () ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )* ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:199:1: ( () ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )* ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:199:2: () ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )* ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )?
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:199:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:200:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUASystemDefinitionAccess().getUASystemDefinitionAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:205:2: ( ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=28 && LA3_0<=31)||(LA3_0>=34 && LA3_0<=40)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:205:3: ( (lv_definitions_1_0= ruleUADefinition ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:205:3: ( (lv_definitions_1_0= ruleUADefinition ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:206:1: (lv_definitions_1_0= ruleUADefinition )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:206:1: (lv_definitions_1_0= ruleUADefinition )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:207:3: lv_definitions_1_0= ruleUADefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUASystemDefinitionAccess().getDefinitionsUADefinitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUADefinition_in_ruleUASystemDefinition493);
            	    lv_definitions_1_0=ruleUADefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUASystemDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_1_0, 
            	            		"UADefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:223:2: (otherlv_2= ';' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==18) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:223:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleUASystemDefinition506); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUASystemDefinitionAccess().getSemicolonKeyword_1_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:227:5: ( ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:227:6: ( (lv_system_3_0= ruleUASystem ) ) (otherlv_4= ';' )?
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:227:6: ( (lv_system_3_0= ruleUASystem ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:228:1: (lv_system_3_0= ruleUASystem )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:228:1: (lv_system_3_0= ruleUASystem )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:229:3: lv_system_3_0= ruleUASystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getUASystemDefinitionAccess().getSystemUASystemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUASystem_in_ruleUASystemDefinition532);
                    lv_system_3_0=ruleUASystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUASystemDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"system",
                            		lv_system_3_0, 
                            		"UASystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:245:2: (otherlv_4= ';' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:245:4: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleUASystemDefinition545); 

                                	newLeafNode(otherlv_4, grammarAccess.getUASystemDefinitionAccess().getSemicolonKeyword_2_1());
                                

                            }
                            break;

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
    // $ANTLR end "ruleUASystemDefinition"


    // $ANTLR start "entryRuleUADefinition"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:257:1: entryRuleUADefinition returns [EObject current=null] : iv_ruleUADefinition= ruleUADefinition EOF ;
    public final EObject entryRuleUADefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUADefinition = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:258:2: (iv_ruleUADefinition= ruleUADefinition EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:259:2: iv_ruleUADefinition= ruleUADefinition EOF
            {
             newCompositeNode(grammarAccess.getUADefinitionRule()); 
            pushFollow(FOLLOW_ruleUADefinition_in_entryRuleUADefinition585);
            iv_ruleUADefinition=ruleUADefinition();

            state._fsp--;

             current =iv_ruleUADefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUADefinition595); 

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
    // $ANTLR end "entryRuleUADefinition"


    // $ANTLR start "ruleUADefinition"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:266:1: ruleUADefinition returns [EObject current=null] : (this_UADeclaration_0= ruleUADeclaration | this_UAInstantiation_1= ruleUAInstantiation ) ;
    public final EObject ruleUADefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UADeclaration_0 = null;

        EObject this_UAInstantiation_1 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:269:28: ( (this_UADeclaration_0= ruleUADeclaration | this_UAInstantiation_1= ruleUAInstantiation ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:270:1: (this_UADeclaration_0= ruleUADeclaration | this_UAInstantiation_1= ruleUAInstantiation )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:270:1: (this_UADeclaration_0= ruleUADeclaration | this_UAInstantiation_1= ruleUAInstantiation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=28 && LA6_0<=31)||(LA6_0>=34 && LA6_0<=40)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_2==19||(LA6_2>=21 && LA6_2<=22)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:271:5: this_UADeclaration_0= ruleUADeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUADefinitionAccess().getUADeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUADeclaration_in_ruleUADefinition642);
                    this_UADeclaration_0=ruleUADeclaration();

                    state._fsp--;

                     
                            current = this_UADeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:281:5: this_UAInstantiation_1= ruleUAInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getUADefinitionAccess().getUAInstantiationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUAInstantiation_in_ruleUADefinition669);
                    this_UAInstantiation_1=ruleUAInstantiation();

                    state._fsp--;

                     
                            current = this_UAInstantiation_1; 
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
    // $ANTLR end "ruleUADefinition"


    // $ANTLR start "entryRuleUAInstantiation"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:297:1: entryRuleUAInstantiation returns [EObject current=null] : iv_ruleUAInstantiation= ruleUAInstantiation EOF ;
    public final EObject entryRuleUAInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAInstantiation = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:298:2: (iv_ruleUAInstantiation= ruleUAInstantiation EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:299:2: iv_ruleUAInstantiation= ruleUAInstantiation EOF
            {
             newCompositeNode(grammarAccess.getUAInstantiationRule()); 
            pushFollow(FOLLOW_ruleUAInstantiation_in_entryRuleUAInstantiation704);
            iv_ruleUAInstantiation=ruleUAInstantiation();

            state._fsp--;

             current =iv_ruleUAInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAInstantiation714); 

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
    // $ANTLR end "entryRuleUAInstantiation"


    // $ANTLR start "ruleUAInstantiation"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:306:1: ruleUAInstantiation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )? (otherlv_4= ':=' | otherlv_5= '=' ) ( (lv_target_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_arguments_8_0= ruleUAExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )* otherlv_11= ')' ) ;
    public final EObject ruleUAInstantiation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_target_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:309:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )? (otherlv_4= ':=' | otherlv_5= '=' ) ( (lv_target_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_arguments_8_0= ruleUAExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )* otherlv_11= ')' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:310:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )? (otherlv_4= ':=' | otherlv_5= '=' ) ( (lv_target_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_arguments_8_0= ruleUAExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )* otherlv_11= ')' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:310:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )? (otherlv_4= ':=' | otherlv_5= '=' ) ( (lv_target_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_arguments_8_0= ruleUAExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )* otherlv_11= ')' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:310:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )? (otherlv_4= ':=' | otherlv_5= '=' ) ( (lv_target_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_arguments_8_0= ruleUAExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )* otherlv_11= ')'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:310:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:311:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:311:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:312:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAInstantiation756); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUAInstantiationAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAInstantiationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:328:2: (otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:328:4: otherlv_1= '(' ( (lv_parameters_2_0= ruleUAParameters ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleUAInstantiation774); 

                        	newLeafNode(otherlv_1, grammarAccess.getUAInstantiationAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:332:1: ( (lv_parameters_2_0= ruleUAParameters ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:333:1: (lv_parameters_2_0= ruleUAParameters )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:333:1: (lv_parameters_2_0= ruleUAParameters )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:334:3: lv_parameters_2_0= ruleUAParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAInstantiationAccess().getParametersUAParametersParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAParameters_in_ruleUAInstantiation795);
                    lv_parameters_2_0=ruleUAParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"UAParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleUAInstantiation807); 

                        	newLeafNode(otherlv_3, grammarAccess.getUAInstantiationAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:354:3: (otherlv_4= ':=' | otherlv_5= '=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:354:5: otherlv_4= ':='
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleUAInstantiation822); 

                        	newLeafNode(otherlv_4, grammarAccess.getUAInstantiationAccess().getColonEqualsSignKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:359:7: otherlv_5= '='
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleUAInstantiation840); 

                        	newLeafNode(otherlv_5, grammarAccess.getUAInstantiationAccess().getEqualsSignKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:363:2: ( (lv_target_6_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:364:1: (lv_target_6_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:364:1: (lv_target_6_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:365:3: lv_target_6_0= RULE_ID
            {
            lv_target_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAInstantiation858); 

            			newLeafNode(lv_target_6_0, grammarAccess.getUAInstantiationAccess().getTargetIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAInstantiationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"target",
                    		lv_target_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleUAInstantiation875); 

                	newLeafNode(otherlv_7, grammarAccess.getUAInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:385:1: ( (lv_arguments_8_0= ruleUAExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:386:1: (lv_arguments_8_0= ruleUAExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:386:1: (lv_arguments_8_0= ruleUAExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:387:3: lv_arguments_8_0= ruleUAExpression
            {
             
            	        newCompositeNode(grammarAccess.getUAInstantiationAccess().getArgumentsUAExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUAInstantiation896);
            lv_arguments_8_0=ruleUAExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAInstantiationRule());
            	        }
                   		add(
                   			current, 
                   			"arguments",
                    		lv_arguments_8_0, 
                    		"UAExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:403:2: (otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:403:4: otherlv_9= ',' ( (lv_arguments_10_0= ruleUAExpression ) )
            	    {
            	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleUAInstantiation909); 

            	        	newLeafNode(otherlv_9, grammarAccess.getUAInstantiationAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:407:1: ( (lv_arguments_10_0= ruleUAExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:408:1: (lv_arguments_10_0= ruleUAExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:408:1: (lv_arguments_10_0= ruleUAExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:409:3: lv_arguments_10_0= ruleUAExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAInstantiationAccess().getArgumentsUAExpressionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAInstantiation930);
            	    lv_arguments_10_0=ruleUAExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAInstantiationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_10_0, 
            	            		"UAExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleUAInstantiation944); 

                	newLeafNode(otherlv_11, grammarAccess.getUAInstantiationAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleUAInstantiation"


    // $ANTLR start "entryRuleUASystem"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:437:1: entryRuleUASystem returns [EObject current=null] : iv_ruleUASystem= ruleUASystem EOF ;
    public final EObject entryRuleUASystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASystem = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:438:2: (iv_ruleUASystem= ruleUASystem EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:439:2: iv_ruleUASystem= ruleUASystem EOF
            {
             newCompositeNode(grammarAccess.getUASystemRule()); 
            pushFollow(FOLLOW_ruleUASystem_in_entryRuleUASystem980);
            iv_ruleUASystem=ruleUASystem();

            state._fsp--;

             current =iv_ruleUASystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASystem990); 

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
    // $ANTLR end "entryRuleUASystem"


    // $ANTLR start "ruleUASystem"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:446:1: ruleUASystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_systems_1_0= ruleUASystemID ) ) ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )* ) ;
    public final EObject ruleUASystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_systems_1_0 = null;

        EObject lv_systems_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:449:28: ( (otherlv_0= 'system' ( (lv_systems_1_0= ruleUASystemID ) ) ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:450:1: (otherlv_0= 'system' ( (lv_systems_1_0= ruleUASystemID ) ) ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:450:1: (otherlv_0= 'system' ( (lv_systems_1_0= ruleUASystemID ) ) ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:450:3: otherlv_0= 'system' ( (lv_systems_1_0= ruleUASystemID ) ) ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleUASystem1027); 

                	newLeafNode(otherlv_0, grammarAccess.getUASystemAccess().getSystemKeyword_0());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:454:1: ( (lv_systems_1_0= ruleUASystemID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:455:1: (lv_systems_1_0= ruleUASystemID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:455:1: (lv_systems_1_0= ruleUASystemID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:456:3: lv_systems_1_0= ruleUASystemID
            {
             
            	        newCompositeNode(grammarAccess.getUASystemAccess().getSystemsUASystemIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUASystemID_in_ruleUASystem1048);
            lv_systems_1_0=ruleUASystemID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASystemRule());
            	        }
                   		add(
                   			current, 
                   			"systems",
                    		lv_systems_1_0, 
                    		"UASystemID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:472:2: ( (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:472:3: (otherlv_2= ',' | otherlv_3= '<' ) ( (lv_systems_4_0= ruleUASystemID ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:472:3: (otherlv_2= ',' | otherlv_3= '<' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==23) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==25) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:472:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUASystem1062); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUASystemAccess().getCommaKeyword_2_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:477:7: otherlv_3= '<'
            	            {
            	            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleUASystem1080); 

            	                	newLeafNode(otherlv_3, grammarAccess.getUASystemAccess().getLessThanSignKeyword_2_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:481:2: ( (lv_systems_4_0= ruleUASystemID ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:482:1: (lv_systems_4_0= ruleUASystemID )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:482:1: (lv_systems_4_0= ruleUASystemID )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:483:3: lv_systems_4_0= ruleUASystemID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUASystemAccess().getSystemsUASystemIDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUASystemID_in_ruleUASystem1102);
            	    lv_systems_4_0=ruleUASystemID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUASystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_4_0, 
            	            		"UASystemID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleUASystem"


    // $ANTLR start "entryRuleUASystemID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:507:1: entryRuleUASystemID returns [EObject current=null] : iv_ruleUASystemID= ruleUASystemID EOF ;
    public final EObject entryRuleUASystemID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASystemID = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:508:2: (iv_ruleUASystemID= ruleUASystemID EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:509:2: iv_ruleUASystemID= ruleUASystemID EOF
            {
             newCompositeNode(grammarAccess.getUASystemIDRule()); 
            pushFollow(FOLLOW_ruleUASystemID_in_entryRuleUASystemID1140);
            iv_ruleUASystemID=ruleUASystemID();

            state._fsp--;

             current =iv_ruleUASystemID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASystemID1150); 

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
    // $ANTLR end "entryRuleUASystemID"


    // $ANTLR start "ruleUASystemID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:516:1: ruleUASystemID returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUASystemID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:519:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:520:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:520:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:521:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:521:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:522:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUASystemID1191); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUASystemIDAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUASystemIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleUASystemID"


    // $ANTLR start "entryRuleUAArrayDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:546:1: entryRuleUAArrayDeclaration returns [EObject current=null] : iv_ruleUAArrayDeclaration= ruleUAArrayDeclaration EOF ;
    public final EObject entryRuleUAArrayDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAArrayDeclaration = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:547:2: (iv_ruleUAArrayDeclaration= ruleUAArrayDeclaration EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:548:2: iv_ruleUAArrayDeclaration= ruleUAArrayDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUAArrayDeclarationRule()); 
            pushFollow(FOLLOW_ruleUAArrayDeclaration_in_entryRuleUAArrayDeclaration1231);
            iv_ruleUAArrayDeclaration=ruleUAArrayDeclaration();

            state._fsp--;

             current =iv_ruleUAArrayDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAArrayDeclaration1241); 

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
    // $ANTLR end "entryRuleUAArrayDeclaration"


    // $ANTLR start "ruleUAArrayDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:555:1: ruleUAArrayDeclaration returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= ruleUAExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleUAArrayDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_size_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:558:28: ( (otherlv_0= '[' ( (lv_size_1_0= ruleUAExpression ) ) otherlv_2= ']' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:559:1: (otherlv_0= '[' ( (lv_size_1_0= ruleUAExpression ) ) otherlv_2= ']' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:559:1: (otherlv_0= '[' ( (lv_size_1_0= ruleUAExpression ) ) otherlv_2= ']' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:559:3: otherlv_0= '[' ( (lv_size_1_0= ruleUAExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUAArrayDeclaration1278); 

                	newLeafNode(otherlv_0, grammarAccess.getUAArrayDeclarationAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:563:1: ( (lv_size_1_0= ruleUAExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:564:1: (lv_size_1_0= ruleUAExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:564:1: (lv_size_1_0= ruleUAExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:565:3: lv_size_1_0= ruleUAExpression
            {
             
            	        newCompositeNode(grammarAccess.getUAArrayDeclarationAccess().getSizeUAExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUAArrayDeclaration1299);
            lv_size_1_0=ruleUAExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAArrayDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_1_0, 
                    		"UAExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleUAArrayDeclaration1311); 

                	newLeafNode(otherlv_2, grammarAccess.getUAArrayDeclarationAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleUAArrayDeclaration"


    // $ANTLR start "entryRuleUADeclarations"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:593:1: entryRuleUADeclarations returns [EObject current=null] : iv_ruleUADeclarations= ruleUADeclarations EOF ;
    public final EObject entryRuleUADeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUADeclarations = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:594:2: (iv_ruleUADeclarations= ruleUADeclarations EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:595:2: iv_ruleUADeclarations= ruleUADeclarations EOF
            {
             newCompositeNode(grammarAccess.getUADeclarationsRule()); 
            pushFollow(FOLLOW_ruleUADeclarations_in_entryRuleUADeclarations1347);
            iv_ruleUADeclarations=ruleUADeclarations();

            state._fsp--;

             current =iv_ruleUADeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUADeclarations1357); 

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
    // $ANTLR end "entryRuleUADeclarations"


    // $ANTLR start "ruleUADeclarations"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:602:1: ruleUADeclarations returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleUADeclaration ) ) (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )* (otherlv_3= ';' )? ) ;
    public final EObject ruleUADeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_0_0 = null;

        EObject lv_declarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:605:28: ( ( ( (lv_declarations_0_0= ruleUADeclaration ) ) (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )* (otherlv_3= ';' )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:606:1: ( ( (lv_declarations_0_0= ruleUADeclaration ) ) (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )* (otherlv_3= ';' )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:606:1: ( ( (lv_declarations_0_0= ruleUADeclaration ) ) (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )* (otherlv_3= ';' )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:606:2: ( (lv_declarations_0_0= ruleUADeclaration ) ) (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )* (otherlv_3= ';' )?
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:606:2: ( (lv_declarations_0_0= ruleUADeclaration ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:607:1: (lv_declarations_0_0= ruleUADeclaration )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:607:1: (lv_declarations_0_0= ruleUADeclaration )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:608:3: lv_declarations_0_0= ruleUADeclaration
            {
             
            	        newCompositeNode(grammarAccess.getUADeclarationsAccess().getDeclarationsUADeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUADeclaration_in_ruleUADeclarations1403);
            lv_declarations_0_0=ruleUADeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUADeclarationsRule());
            	        }
                   		add(
                   			current, 
                   			"declarations",
                    		lv_declarations_0_0, 
                    		"UADeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:624:2: (otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID||(LA12_1>=28 && LA12_1<=31)||(LA12_1>=34 && LA12_1<=40)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:624:4: otherlv_1= ';' ( (lv_declarations_2_0= ruleUADeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleUADeclarations1416); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUADeclarationsAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:628:1: ( (lv_declarations_2_0= ruleUADeclaration ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:629:1: (lv_declarations_2_0= ruleUADeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:629:1: (lv_declarations_2_0= ruleUADeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:630:3: lv_declarations_2_0= ruleUADeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUADeclarationsAccess().getDeclarationsUADeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUADeclaration_in_ruleUADeclarations1437);
            	    lv_declarations_2_0=ruleUADeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUADeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_2_0, 
            	            		"UADeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:646:4: (otherlv_3= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:646:6: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUADeclarations1452); 

                        	newLeafNode(otherlv_3, grammarAccess.getUADeclarationsAccess().getSemicolonKeyword_2());
                        

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
    // $ANTLR end "ruleUADeclarations"


    // $ANTLR start "entryRuleUADeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:658:1: entryRuleUADeclaration returns [EObject current=null] : iv_ruleUADeclaration= ruleUADeclaration EOF ;
    public final EObject entryRuleUADeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUADeclaration = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:659:2: (iv_ruleUADeclaration= ruleUADeclaration EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:660:2: iv_ruleUADeclaration= ruleUADeclaration EOF
            {
             newCompositeNode(grammarAccess.getUADeclarationRule()); 
            pushFollow(FOLLOW_ruleUADeclaration_in_entryRuleUADeclaration1490);
            iv_ruleUADeclaration=ruleUADeclaration();

            state._fsp--;

             current =iv_ruleUADeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUADeclaration1500); 

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
    // $ANTLR end "entryRuleUADeclaration"


    // $ANTLR start "ruleUADeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:667:1: ruleUADeclaration returns [EObject current=null] : (this_UAVariableDeclaration_0= ruleUAVariableDeclaration | this_UATypeDeclaration_1= ruleUATypeDeclaration ) ;
    public final EObject ruleUADeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_UAVariableDeclaration_0 = null;

        EObject this_UATypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:670:28: ( (this_UAVariableDeclaration_0= ruleUAVariableDeclaration | this_UATypeDeclaration_1= ruleUATypeDeclaration ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:671:1: (this_UAVariableDeclaration_0= ruleUAVariableDeclaration | this_UATypeDeclaration_1= ruleUATypeDeclaration )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:671:1: (this_UAVariableDeclaration_0= ruleUAVariableDeclaration | this_UATypeDeclaration_1= ruleUATypeDeclaration )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=28 && LA14_0<=31)||(LA14_0>=35 && LA14_0<=40)) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:672:5: this_UAVariableDeclaration_0= ruleUAVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUADeclarationAccess().getUAVariableDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAVariableDeclaration_in_ruleUADeclaration1547);
                    this_UAVariableDeclaration_0=ruleUAVariableDeclaration();

                    state._fsp--;

                     
                            current = this_UAVariableDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:682:5: this_UATypeDeclaration_1= ruleUATypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUADeclarationAccess().getUATypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUATypeDeclaration_in_ruleUADeclaration1574);
                    this_UATypeDeclaration_1=ruleUATypeDeclaration();

                    state._fsp--;

                     
                            current = this_UATypeDeclaration_1; 
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
    // $ANTLR end "ruleUADeclaration"


    // $ANTLR start "entryRuleUAType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:698:1: entryRuleUAType returns [EObject current=null] : iv_ruleUAType= ruleUAType EOF ;
    public final EObject entryRuleUAType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:699:2: (iv_ruleUAType= ruleUAType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:700:2: iv_ruleUAType= ruleUAType EOF
            {
             newCompositeNode(grammarAccess.getUATypeRule()); 
            pushFollow(FOLLOW_ruleUAType_in_entryRuleUAType1609);
            iv_ruleUAType=ruleUAType();

            state._fsp--;

             current =iv_ruleUAType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAType1619); 

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
    // $ANTLR end "entryRuleUAType"


    // $ANTLR start "ruleUAType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:707:1: ruleUAType returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleUATypeModifiers ) ) ( (lv_identifier_1_0= ruleUATypeIdentifier ) ) ) ;
    public final EObject ruleUAType() throws RecognitionException {
        EObject current = null;

        EObject lv_modifiers_0_0 = null;

        EObject lv_identifier_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:710:28: ( ( ( (lv_modifiers_0_0= ruleUATypeModifiers ) ) ( (lv_identifier_1_0= ruleUATypeIdentifier ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:711:1: ( ( (lv_modifiers_0_0= ruleUATypeModifiers ) ) ( (lv_identifier_1_0= ruleUATypeIdentifier ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:711:1: ( ( (lv_modifiers_0_0= ruleUATypeModifiers ) ) ( (lv_identifier_1_0= ruleUATypeIdentifier ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:711:2: ( (lv_modifiers_0_0= ruleUATypeModifiers ) ) ( (lv_identifier_1_0= ruleUATypeIdentifier ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:711:2: ( (lv_modifiers_0_0= ruleUATypeModifiers ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:712:1: (lv_modifiers_0_0= ruleUATypeModifiers )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:712:1: (lv_modifiers_0_0= ruleUATypeModifiers )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:713:3: lv_modifiers_0_0= ruleUATypeModifiers
            {
             
            	        newCompositeNode(grammarAccess.getUATypeAccess().getModifiersUATypeModifiersParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUATypeModifiers_in_ruleUAType1665);
            lv_modifiers_0_0=ruleUATypeModifiers();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUATypeRule());
            	        }
                   		set(
                   			current, 
                   			"modifiers",
                    		lv_modifiers_0_0, 
                    		"UATypeModifiers");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:729:2: ( (lv_identifier_1_0= ruleUATypeIdentifier ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:730:1: (lv_identifier_1_0= ruleUATypeIdentifier )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:730:1: (lv_identifier_1_0= ruleUATypeIdentifier )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:731:3: lv_identifier_1_0= ruleUATypeIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getUATypeAccess().getIdentifierUATypeIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUATypeIdentifier_in_ruleUAType1686);
            lv_identifier_1_0=ruleUATypeIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUATypeRule());
            	        }
                   		set(
                   			current, 
                   			"identifier",
                    		lv_identifier_1_0, 
                    		"UATypeIdentifier");
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
    // $ANTLR end "ruleUAType"


    // $ANTLR start "entryRuleUATypeModifiers"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:755:1: entryRuleUATypeModifiers returns [EObject current=null] : iv_ruleUATypeModifiers= ruleUATypeModifiers EOF ;
    public final EObject entryRuleUATypeModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUATypeModifiers = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:756:2: (iv_ruleUATypeModifiers= ruleUATypeModifiers EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:757:2: iv_ruleUATypeModifiers= ruleUATypeModifiers EOF
            {
             newCompositeNode(grammarAccess.getUATypeModifiersRule()); 
            pushFollow(FOLLOW_ruleUATypeModifiers_in_entryRuleUATypeModifiers1722);
            iv_ruleUATypeModifiers=ruleUATypeModifiers();

            state._fsp--;

             current =iv_ruleUATypeModifiers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUATypeModifiers1732); 

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
    // $ANTLR end "entryRuleUATypeModifiers"


    // $ANTLR start "ruleUATypeModifiers"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:764:1: ruleUATypeModifiers returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleUATypeModifiers() throws RecognitionException {
        EObject current = null;

        Token lv_urgent_2_0=null;
        Token lv_broadcast_3_0=null;
        Token lv_meta_4_0=null;
        Token lv_const_5_0=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:767:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:768:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:768:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:768:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:768:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:769:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUATypeModifiersAccess().getUATypeModifiersAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:774:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:776:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:776:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:777:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:780:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:781:3: ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:781:3: ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) ) )*
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 3) ) {
                    alt15=4;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:783:4: ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:783:4: ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:784:5: {...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:784:112: ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:785:6: ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:788:6: ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:788:7: {...}? => ( (lv_urgent_2_0= 'urgent' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "true");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:788:16: ( (lv_urgent_2_0= 'urgent' ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:789:1: (lv_urgent_2_0= 'urgent' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:789:1: (lv_urgent_2_0= 'urgent' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:790:3: lv_urgent_2_0= 'urgent'
            	    {
            	    lv_urgent_2_0=(Token)match(input,28,FOLLOW_28_in_ruleUATypeModifiers1829); 

            	            newLeafNode(lv_urgent_2_0, grammarAccess.getUATypeModifiersAccess().getUrgentUrgentKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUATypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "urgent", true, "urgent");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:810:4: ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:810:4: ({...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:811:5: {...}? => ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:811:112: ( ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:812:6: ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:815:6: ({...}? => ( (lv_broadcast_3_0= 'broadcast' ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:815:7: {...}? => ( (lv_broadcast_3_0= 'broadcast' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "true");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:815:16: ( (lv_broadcast_3_0= 'broadcast' ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:816:1: (lv_broadcast_3_0= 'broadcast' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:816:1: (lv_broadcast_3_0= 'broadcast' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:817:3: lv_broadcast_3_0= 'broadcast'
            	    {
            	    lv_broadcast_3_0=(Token)match(input,29,FOLLOW_29_in_ruleUATypeModifiers1914); 

            	            newLeafNode(lv_broadcast_3_0, grammarAccess.getUATypeModifiersAccess().getBroadcastBroadcastKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUATypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "broadcast", true, "broadcast");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:837:4: ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:837:4: ({...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:838:5: {...}? => ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:838:112: ( ({...}? => ( (lv_meta_4_0= 'meta' ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:839:6: ({...}? => ( (lv_meta_4_0= 'meta' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:842:6: ({...}? => ( (lv_meta_4_0= 'meta' ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:842:7: {...}? => ( (lv_meta_4_0= 'meta' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "true");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:842:16: ( (lv_meta_4_0= 'meta' ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:843:1: (lv_meta_4_0= 'meta' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:843:1: (lv_meta_4_0= 'meta' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:844:3: lv_meta_4_0= 'meta'
            	    {
            	    lv_meta_4_0=(Token)match(input,30,FOLLOW_30_in_ruleUATypeModifiers1999); 

            	            newLeafNode(lv_meta_4_0, grammarAccess.getUATypeModifiersAccess().getMetaMetaKeyword_1_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUATypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "meta", true, "meta");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:864:4: ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:864:4: ({...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:865:5: {...}? => ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:865:112: ( ({...}? => ( (lv_const_5_0= 'const' ) ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:866:6: ({...}? => ( (lv_const_5_0= 'const' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:869:6: ({...}? => ( (lv_const_5_0= 'const' ) ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:869:7: {...}? => ( (lv_const_5_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUATypeModifiers", "true");
            	    }
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:869:16: ( (lv_const_5_0= 'const' ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:870:1: (lv_const_5_0= 'const' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:870:1: (lv_const_5_0= 'const' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:871:3: lv_const_5_0= 'const'
            	    {
            	    lv_const_5_0=(Token)match(input,31,FOLLOW_31_in_ruleUATypeModifiers2084); 

            	            newLeafNode(lv_const_5_0, grammarAccess.getUATypeModifiersAccess().getConstConstKeyword_1_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUATypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "const", true, "const");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getUATypeModifiersAccess().getUnorderedGroup_1());
            	

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
    // $ANTLR end "ruleUATypeModifiers"


    // $ANTLR start "entryRuleUAVariableDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:906:1: entryRuleUAVariableDeclaration returns [EObject current=null] : iv_ruleUAVariableDeclaration= ruleUAVariableDeclaration EOF ;
    public final EObject entryRuleUAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAVariableDeclaration = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:907:2: (iv_ruleUAVariableDeclaration= ruleUAVariableDeclaration EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:908:2: iv_ruleUAVariableDeclaration= ruleUAVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUAVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleUAVariableDeclaration_in_entryRuleUAVariableDeclaration2173);
            iv_ruleUAVariableDeclaration=ruleUAVariableDeclaration();

            state._fsp--;

             current =iv_ruleUAVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAVariableDeclaration2183); 

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
    // $ANTLR end "entryRuleUAVariableDeclaration"


    // $ANTLR start "ruleUAVariableDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:915:1: ruleUAVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_variables_1_0= ruleUAVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )* ) ;
    public final EObject ruleUAVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:918:28: ( ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_variables_1_0= ruleUAVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:919:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_variables_1_0= ruleUAVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:919:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_variables_1_0= ruleUAVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:919:2: ( (lv_type_0_0= ruleUAType ) ) ( (lv_variables_1_0= ruleUAVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:919:2: ( (lv_type_0_0= ruleUAType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:920:1: (lv_type_0_0= ruleUAType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:920:1: (lv_type_0_0= ruleUAType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:921:3: lv_type_0_0= ruleUAType
            {
             
            	        newCompositeNode(grammarAccess.getUAVariableDeclarationAccess().getTypeUATypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUAType_in_ruleUAVariableDeclaration2229);
            lv_type_0_0=ruleUAType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"UAType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:937:2: ( (lv_variables_1_0= ruleUAVariableID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:938:1: (lv_variables_1_0= ruleUAVariableID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:938:1: (lv_variables_1_0= ruleUAVariableID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:939:3: lv_variables_1_0= ruleUAVariableID
            {
             
            	        newCompositeNode(grammarAccess.getUAVariableDeclarationAccess().getVariablesUAVariableIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUAVariableID_in_ruleUAVariableDeclaration2250);
            lv_variables_1_0=ruleUAVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAVariableDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_1_0, 
                    		"UAVariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:955:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:955:4: otherlv_2= ',' ( (lv_variables_3_0= ruleUAVariableID ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUAVariableDeclaration2263); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAVariableDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:959:1: ( (lv_variables_3_0= ruleUAVariableID ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:960:1: (lv_variables_3_0= ruleUAVariableID )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:960:1: (lv_variables_3_0= ruleUAVariableID )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:961:3: lv_variables_3_0= ruleUAVariableID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAVariableDeclarationAccess().getVariablesUAVariableIDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAVariableID_in_ruleUAVariableDeclaration2284);
            	    lv_variables_3_0=ruleUAVariableID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAVariableDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"UAVariableID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleUAVariableDeclaration"


    // $ANTLR start "entryRuleUAVariableID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:985:1: entryRuleUAVariableID returns [EObject current=null] : iv_ruleUAVariableID= ruleUAVariableID EOF ;
    public final EObject entryRuleUAVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAVariableID = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:986:2: (iv_ruleUAVariableID= ruleUAVariableID EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:987:2: iv_ruleUAVariableID= ruleUAVariableID EOF
            {
             newCompositeNode(grammarAccess.getUAVariableIDRule()); 
            pushFollow(FOLLOW_ruleUAVariableID_in_entryRuleUAVariableID2322);
            iv_ruleUAVariableID=ruleUAVariableID();

            state._fsp--;

             current =iv_ruleUAVariableID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAVariableID2332); 

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
    // $ANTLR end "entryRuleUAVariableID"


    // $ANTLR start "ruleUAVariableID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:994:1: ruleUAVariableID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )? ) ;
    public final EObject ruleUAVariableID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_dimensions_1_0 = null;

        EObject lv_initialiser_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:997:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:998:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:998:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:998:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )?
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:998:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:999:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:999:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1000:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAVariableID2374); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUAVariableIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAVariableIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1016:2: ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1017:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1017:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1018:3: lv_dimensions_1_0= ruleUAArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAVariableIDAccess().getDimensionsUAArrayDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAArrayDeclaration_in_ruleUAVariableID2400);
            	    lv_dimensions_1_0=ruleUAArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAVariableIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"UAArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1034:3: (otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1034:5: otherlv_2= '=' ( (lv_initialiser_3_0= ruleUAInitialiser ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleUAVariableID2414); 

                        	newLeafNode(otherlv_2, grammarAccess.getUAVariableIDAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1038:1: ( (lv_initialiser_3_0= ruleUAInitialiser ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1039:1: (lv_initialiser_3_0= ruleUAInitialiser )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1039:1: (lv_initialiser_3_0= ruleUAInitialiser )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1040:3: lv_initialiser_3_0= ruleUAInitialiser
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAVariableIDAccess().getInitialiserUAInitialiserParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAInitialiser_in_ruleUAVariableID2435);
                    lv_initialiser_3_0=ruleUAInitialiser();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAVariableIDRule());
                    	        }
                           		set(
                           			current, 
                           			"initialiser",
                            		lv_initialiser_3_0, 
                            		"UAInitialiser");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleUAVariableID"


    // $ANTLR start "entryRuleUAInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1064:1: entryRuleUAInitialiser returns [EObject current=null] : iv_ruleUAInitialiser= ruleUAInitialiser EOF ;
    public final EObject entryRuleUAInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAInitialiser = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1065:2: (iv_ruleUAInitialiser= ruleUAInitialiser EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1066:2: iv_ruleUAInitialiser= ruleUAInitialiser EOF
            {
             newCompositeNode(grammarAccess.getUAInitialiserRule()); 
            pushFollow(FOLLOW_ruleUAInitialiser_in_entryRuleUAInitialiser2473);
            iv_ruleUAInitialiser=ruleUAInitialiser();

            state._fsp--;

             current =iv_ruleUAInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAInitialiser2483); 

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
    // $ANTLR end "entryRuleUAInitialiser"


    // $ANTLR start "ruleUAInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1073:1: ruleUAInitialiser returns [EObject current=null] : (this_UASingleInitialiser_0= ruleUASingleInitialiser | this_UAMultiInitialiser_1= ruleUAMultiInitialiser ) ;
    public final EObject ruleUAInitialiser() throws RecognitionException {
        EObject current = null;

        EObject this_UASingleInitialiser_0 = null;

        EObject this_UAMultiInitialiser_1 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1076:28: ( (this_UASingleInitialiser_0= ruleUASingleInitialiser | this_UAMultiInitialiser_1= ruleUAMultiInitialiser ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1077:1: (this_UASingleInitialiser_0= ruleUASingleInitialiser | this_UAMultiInitialiser_1= ruleUAMultiInitialiser )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1077:1: (this_UASingleInitialiser_0= ruleUASingleInitialiser | this_UAMultiInitialiser_1= ruleUAMultiInitialiser )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==19||(LA19_0>=42 && LA19_0<=43)||LA19_0==73||(LA19_0>=77 && LA19_0<=79)||(LA19_0>=81 && LA19_0<=82)) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1078:5: this_UASingleInitialiser_0= ruleUASingleInitialiser
                    {
                     
                            newCompositeNode(grammarAccess.getUAInitialiserAccess().getUASingleInitialiserParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUASingleInitialiser_in_ruleUAInitialiser2530);
                    this_UASingleInitialiser_0=ruleUASingleInitialiser();

                    state._fsp--;

                     
                            current = this_UASingleInitialiser_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1088:5: this_UAMultiInitialiser_1= ruleUAMultiInitialiser
                    {
                     
                            newCompositeNode(grammarAccess.getUAInitialiserAccess().getUAMultiInitialiserParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUAMultiInitialiser_in_ruleUAInitialiser2557);
                    this_UAMultiInitialiser_1=ruleUAMultiInitialiser();

                    state._fsp--;

                     
                            current = this_UAMultiInitialiser_1; 
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
    // $ANTLR end "ruleUAInitialiser"


    // $ANTLR start "entryRuleUASingleInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1104:1: entryRuleUASingleInitialiser returns [EObject current=null] : iv_ruleUASingleInitialiser= ruleUASingleInitialiser EOF ;
    public final EObject entryRuleUASingleInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASingleInitialiser = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1105:2: (iv_ruleUASingleInitialiser= ruleUASingleInitialiser EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1106:2: iv_ruleUASingleInitialiser= ruleUASingleInitialiser EOF
            {
             newCompositeNode(grammarAccess.getUASingleInitialiserRule()); 
            pushFollow(FOLLOW_ruleUASingleInitialiser_in_entryRuleUASingleInitialiser2592);
            iv_ruleUASingleInitialiser=ruleUASingleInitialiser();

            state._fsp--;

             current =iv_ruleUASingleInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASingleInitialiser2602); 

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
    // $ANTLR end "entryRuleUASingleInitialiser"


    // $ANTLR start "ruleUASingleInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1113:1: ruleUASingleInitialiser returns [EObject current=null] : ( (lv_expression_0_0= ruleUAExpression ) ) ;
    public final EObject ruleUASingleInitialiser() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1116:28: ( ( (lv_expression_0_0= ruleUAExpression ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1117:1: ( (lv_expression_0_0= ruleUAExpression ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1117:1: ( (lv_expression_0_0= ruleUAExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1118:1: (lv_expression_0_0= ruleUAExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1118:1: (lv_expression_0_0= ruleUAExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1119:3: lv_expression_0_0= ruleUAExpression
            {
             
            	        newCompositeNode(grammarAccess.getUASingleInitialiserAccess().getExpressionUAExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUASingleInitialiser2647);
            lv_expression_0_0=ruleUAExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASingleInitialiserRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"UAExpression");
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
    // $ANTLR end "ruleUASingleInitialiser"


    // $ANTLR start "entryRuleUAMultiInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1143:1: entryRuleUAMultiInitialiser returns [EObject current=null] : iv_ruleUAMultiInitialiser= ruleUAMultiInitialiser EOF ;
    public final EObject entryRuleUAMultiInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAMultiInitialiser = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1144:2: (iv_ruleUAMultiInitialiser= ruleUAMultiInitialiser EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1145:2: iv_ruleUAMultiInitialiser= ruleUAMultiInitialiser EOF
            {
             newCompositeNode(grammarAccess.getUAMultiInitialiserRule()); 
            pushFollow(FOLLOW_ruleUAMultiInitialiser_in_entryRuleUAMultiInitialiser2682);
            iv_ruleUAMultiInitialiser=ruleUAMultiInitialiser();

            state._fsp--;

             current =iv_ruleUAMultiInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAMultiInitialiser2692); 

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
    // $ANTLR end "entryRuleUAMultiInitialiser"


    // $ANTLR start "ruleUAMultiInitialiser"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1152:1: ruleUAMultiInitialiser returns [EObject current=null] : (otherlv_0= '{' ( (lv_initialisers_1_0= ruleUAInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleUAMultiInitialiser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initialisers_1_0 = null;

        EObject lv_initialisers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1155:28: ( (otherlv_0= '{' ( (lv_initialisers_1_0= ruleUAInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )* otherlv_4= '}' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1156:1: (otherlv_0= '{' ( (lv_initialisers_1_0= ruleUAInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )* otherlv_4= '}' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1156:1: (otherlv_0= '{' ( (lv_initialisers_1_0= ruleUAInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )* otherlv_4= '}' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1156:3: otherlv_0= '{' ( (lv_initialisers_1_0= ruleUAInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleUAMultiInitialiser2729); 

                	newLeafNode(otherlv_0, grammarAccess.getUAMultiInitialiserAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1160:1: ( (lv_initialisers_1_0= ruleUAInitialiser ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1161:1: (lv_initialisers_1_0= ruleUAInitialiser )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1161:1: (lv_initialisers_1_0= ruleUAInitialiser )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1162:3: lv_initialisers_1_0= ruleUAInitialiser
            {
             
            	        newCompositeNode(grammarAccess.getUAMultiInitialiserAccess().getInitialisersUAInitialiserParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUAInitialiser_in_ruleUAMultiInitialiser2750);
            lv_initialisers_1_0=ruleUAInitialiser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAMultiInitialiserRule());
            	        }
                   		add(
                   			current, 
                   			"initialisers",
                    		lv_initialisers_1_0, 
                    		"UAInitialiser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1178:2: (otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1178:4: otherlv_2= ',' ( (lv_initialisers_3_0= ruleUAInitialiser ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUAMultiInitialiser2763); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAMultiInitialiserAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1182:1: ( (lv_initialisers_3_0= ruleUAInitialiser ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1183:1: (lv_initialisers_3_0= ruleUAInitialiser )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1183:1: (lv_initialisers_3_0= ruleUAInitialiser )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1184:3: lv_initialisers_3_0= ruleUAInitialiser
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAMultiInitialiserAccess().getInitialisersUAInitialiserParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAInitialiser_in_ruleUAMultiInitialiser2784);
            	    lv_initialisers_3_0=ruleUAInitialiser();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAMultiInitialiserRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisers",
            	            		lv_initialisers_3_0, 
            	            		"UAInitialiser");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleUAMultiInitialiser2798); 

                	newLeafNode(otherlv_4, grammarAccess.getUAMultiInitialiserAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleUAMultiInitialiser"


    // $ANTLR start "entryRuleUATypeDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1212:1: entryRuleUATypeDeclaration returns [EObject current=null] : iv_ruleUATypeDeclaration= ruleUATypeDeclaration EOF ;
    public final EObject entryRuleUATypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUATypeDeclaration = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1213:2: (iv_ruleUATypeDeclaration= ruleUATypeDeclaration EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1214:2: iv_ruleUATypeDeclaration= ruleUATypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUATypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUATypeDeclaration_in_entryRuleUATypeDeclaration2834);
            iv_ruleUATypeDeclaration=ruleUATypeDeclaration();

            state._fsp--;

             current =iv_ruleUATypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUATypeDeclaration2844); 

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
    // $ANTLR end "entryRuleUATypeDeclaration"


    // $ANTLR start "ruleUATypeDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1221:1: ruleUATypeDeclaration returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleUAType ) ) ( (lv_types_2_0= ruleUATypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )* ) ;
    public final EObject ruleUATypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_baseType_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1224:28: ( (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleUAType ) ) ( (lv_types_2_0= ruleUATypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1225:1: (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleUAType ) ) ( (lv_types_2_0= ruleUATypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1225:1: (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleUAType ) ) ( (lv_types_2_0= ruleUATypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1225:3: otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleUAType ) ) ( (lv_types_2_0= ruleUATypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleUATypeDeclaration2881); 

                	newLeafNode(otherlv_0, grammarAccess.getUATypeDeclarationAccess().getTypedefKeyword_0());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1229:1: ( (lv_baseType_1_0= ruleUAType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1230:1: (lv_baseType_1_0= ruleUAType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1230:1: (lv_baseType_1_0= ruleUAType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1231:3: lv_baseType_1_0= ruleUAType
            {
             
            	        newCompositeNode(grammarAccess.getUATypeDeclarationAccess().getBaseTypeUATypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUAType_in_ruleUATypeDeclaration2902);
            lv_baseType_1_0=ruleUAType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUATypeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"baseType",
                    		lv_baseType_1_0, 
                    		"UAType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1247:2: ( (lv_types_2_0= ruleUATypeID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1248:1: (lv_types_2_0= ruleUATypeID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1248:1: (lv_types_2_0= ruleUATypeID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1249:3: lv_types_2_0= ruleUATypeID
            {
             
            	        newCompositeNode(grammarAccess.getUATypeDeclarationAccess().getTypesUATypeIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUATypeID_in_ruleUATypeDeclaration2923);
            lv_types_2_0=ruleUATypeID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUATypeDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_2_0, 
                    		"UATypeID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1265:2: (otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1265:4: otherlv_3= ',' ( (lv_types_4_0= ruleUATypeID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleUATypeDeclaration2936); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUATypeDeclarationAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1269:1: ( (lv_types_4_0= ruleUATypeID ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1270:1: (lv_types_4_0= ruleUATypeID )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1270:1: (lv_types_4_0= ruleUATypeID )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1271:3: lv_types_4_0= ruleUATypeID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUATypeDeclarationAccess().getTypesUATypeIDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUATypeID_in_ruleUATypeDeclaration2957);
            	    lv_types_4_0=ruleUATypeID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUATypeDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_4_0, 
            	            		"UATypeID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleUATypeDeclaration"


    // $ANTLR start "entryRuleUATypeID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1295:1: entryRuleUATypeID returns [EObject current=null] : iv_ruleUATypeID= ruleUATypeID EOF ;
    public final EObject entryRuleUATypeID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUATypeID = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1296:2: (iv_ruleUATypeID= ruleUATypeID EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1297:2: iv_ruleUATypeID= ruleUATypeID EOF
            {
             newCompositeNode(grammarAccess.getUATypeIDRule()); 
            pushFollow(FOLLOW_ruleUATypeID_in_entryRuleUATypeID2995);
            iv_ruleUATypeID=ruleUATypeID();

            state._fsp--;

             current =iv_ruleUATypeID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUATypeID3005); 

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
    // $ANTLR end "entryRuleUATypeID"


    // $ANTLR start "ruleUATypeID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1304:1: ruleUATypeID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* ) ;
    public final EObject ruleUATypeID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_dimensions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1307:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1308:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1308:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1308:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1308:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1309:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1309:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1310:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUATypeID3047); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUATypeIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUATypeIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1326:2: ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1327:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1327:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1328:3: lv_dimensions_1_0= ruleUAArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUATypeIDAccess().getDimensionsUAArrayDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAArrayDeclaration_in_ruleUATypeID3073);
            	    lv_dimensions_1_0=ruleUAArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUATypeIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"UAArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleUATypeID"


    // $ANTLR start "entryRuleUATypeIdentifier"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1352:1: entryRuleUATypeIdentifier returns [EObject current=null] : iv_ruleUATypeIdentifier= ruleUATypeIdentifier EOF ;
    public final EObject entryRuleUATypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUATypeIdentifier = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1353:2: (iv_ruleUATypeIdentifier= ruleUATypeIdentifier EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1354:2: iv_ruleUATypeIdentifier= ruleUATypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getUATypeIdentifierRule()); 
            pushFollow(FOLLOW_ruleUATypeIdentifier_in_entryRuleUATypeIdentifier3110);
            iv_ruleUATypeIdentifier=ruleUATypeIdentifier();

            state._fsp--;

             current =iv_ruleUATypeIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUATypeIdentifier3120); 

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
    // $ANTLR end "entryRuleUATypeIdentifier"


    // $ANTLR start "ruleUATypeIdentifier"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1361:1: ruleUATypeIdentifier returns [EObject current=null] : (this_UAIntegerType_0= ruleUAIntegerType | this_UAClockType_1= ruleUAClockType | this_UAChannelType_2= ruleUAChannelType | this_UABooleanType_3= ruleUABooleanType | this_UAScalarType_4= ruleUAScalarType | this_UAStructType_5= ruleUAStructType | ( () ( (lv_name_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleUATypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_7_0=null;
        EObject this_UAIntegerType_0 = null;

        EObject this_UAClockType_1 = null;

        EObject this_UAChannelType_2 = null;

        EObject this_UABooleanType_3 = null;

        EObject this_UAScalarType_4 = null;

        EObject this_UAStructType_5 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1364:28: ( (this_UAIntegerType_0= ruleUAIntegerType | this_UAClockType_1= ruleUAClockType | this_UAChannelType_2= ruleUAChannelType | this_UABooleanType_3= ruleUABooleanType | this_UAScalarType_4= ruleUAScalarType | this_UAStructType_5= ruleUAStructType | ( () ( (lv_name_7_0= RULE_ID ) ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1365:1: (this_UAIntegerType_0= ruleUAIntegerType | this_UAClockType_1= ruleUAClockType | this_UAChannelType_2= ruleUAChannelType | this_UABooleanType_3= ruleUABooleanType | this_UAScalarType_4= ruleUAScalarType | this_UAStructType_5= ruleUAStructType | ( () ( (lv_name_7_0= RULE_ID ) ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1365:1: (this_UAIntegerType_0= ruleUAIntegerType | this_UAClockType_1= ruleUAClockType | this_UAChannelType_2= ruleUAChannelType | this_UABooleanType_3= ruleUABooleanType | this_UAScalarType_4= ruleUAScalarType | this_UAStructType_5= ruleUAStructType | ( () ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            case 38:
                {
                alt23=4;
                }
                break;
            case 39:
                {
                alt23=5;
                }
                break;
            case 40:
                {
                alt23=6;
                }
                break;
            case RULE_ID:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1366:5: this_UAIntegerType_0= ruleUAIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUAIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAIntegerType_in_ruleUATypeIdentifier3167);
                    this_UAIntegerType_0=ruleUAIntegerType();

                    state._fsp--;

                     
                            current = this_UAIntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1376:5: this_UAClockType_1= ruleUAClockType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUAClockTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUAClockType_in_ruleUATypeIdentifier3194);
                    this_UAClockType_1=ruleUAClockType();

                    state._fsp--;

                     
                            current = this_UAClockType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1386:5: this_UAChannelType_2= ruleUAChannelType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUAChannelTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUAChannelType_in_ruleUATypeIdentifier3221);
                    this_UAChannelType_2=ruleUAChannelType();

                    state._fsp--;

                     
                            current = this_UAChannelType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1396:5: this_UABooleanType_3= ruleUABooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUABooleanTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUABooleanType_in_ruleUATypeIdentifier3248);
                    this_UABooleanType_3=ruleUABooleanType();

                    state._fsp--;

                     
                            current = this_UABooleanType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1406:5: this_UAScalarType_4= ruleUAScalarType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUAScalarTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUAScalarType_in_ruleUATypeIdentifier3275);
                    this_UAScalarType_4=ruleUAScalarType();

                    state._fsp--;

                     
                            current = this_UAScalarType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1416:5: this_UAStructType_5= ruleUAStructType
                    {
                     
                            newCompositeNode(grammarAccess.getUATypeIdentifierAccess().getUAStructTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUAStructType_in_ruleUATypeIdentifier3302);
                    this_UAStructType_5=ruleUAStructType();

                    state._fsp--;

                     
                            current = this_UAStructType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1425:6: ( () ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1425:6: ( () ( (lv_name_7_0= RULE_ID ) ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1425:7: () ( (lv_name_7_0= RULE_ID ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1425:7: ()
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1426:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUATypeIdentifierAccess().getUAUserTypeAction_6_0(),
                                current);
                        

                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1431:2: ( (lv_name_7_0= RULE_ID ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1432:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1432:1: (lv_name_7_0= RULE_ID )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1433:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUATypeIdentifier3334); 

                    			newLeafNode(lv_name_7_0, grammarAccess.getUATypeIdentifierAccess().getNameIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUATypeIdentifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleUATypeIdentifier"


    // $ANTLR start "entryRuleUAIntegerType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1457:1: entryRuleUAIntegerType returns [EObject current=null] : iv_ruleUAIntegerType= ruleUAIntegerType EOF ;
    public final EObject entryRuleUAIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAIntegerType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1458:2: (iv_ruleUAIntegerType= ruleUAIntegerType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1459:2: iv_ruleUAIntegerType= ruleUAIntegerType EOF
            {
             newCompositeNode(grammarAccess.getUAIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleUAIntegerType_in_entryRuleUAIntegerType3376);
            iv_ruleUAIntegerType=ruleUAIntegerType();

            state._fsp--;

             current =iv_ruleUAIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAIntegerType3386); 

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
    // $ANTLR end "entryRuleUAIntegerType"


    // $ANTLR start "ruleUAIntegerType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1466:1: ruleUAIntegerType returns [EObject current=null] : ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleUAIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1469:28: ( ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1470:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1470:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1470:2: () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )?
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1470:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1471:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAIntegerTypeAccess().getUAIntegerTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleUAIntegerType3432); 

                	newLeafNode(otherlv_1, grammarAccess.getUAIntegerTypeAccess().getIntKeyword_1());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1480:1: (otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1480:3: otherlv_2= '[' ( (lv_min_3_0= ruleUAExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleUAExpression ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUAIntegerType3445); 

                        	newLeafNode(otherlv_2, grammarAccess.getUAIntegerTypeAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1484:1: ( (lv_min_3_0= ruleUAExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1485:1: (lv_min_3_0= ruleUAExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1485:1: (lv_min_3_0= ruleUAExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1486:3: lv_min_3_0= ruleUAExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAIntegerTypeAccess().getMinUAExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAIntegerType3466);
                    lv_min_3_0=ruleUAExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAIntegerTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"UAExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleUAIntegerType3478); 

                        	newLeafNode(otherlv_4, grammarAccess.getUAIntegerTypeAccess().getCommaKeyword_2_2());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1506:1: ( (lv_max_5_0= ruleUAExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1507:1: (lv_max_5_0= ruleUAExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1507:1: (lv_max_5_0= ruleUAExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1508:3: lv_max_5_0= ruleUAExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAIntegerTypeAccess().getMaxUAExpressionParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAIntegerType3499);
                    lv_max_5_0=ruleUAExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAIntegerTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"UAExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleUAIntegerType3511); 

                        	newLeafNode(otherlv_6, grammarAccess.getUAIntegerTypeAccess().getRightSquareBracketKeyword_2_4());
                        

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
    // $ANTLR end "ruleUAIntegerType"


    // $ANTLR start "entryRuleUAClockType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1536:1: entryRuleUAClockType returns [EObject current=null] : iv_ruleUAClockType= ruleUAClockType EOF ;
    public final EObject entryRuleUAClockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAClockType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1537:2: (iv_ruleUAClockType= ruleUAClockType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1538:2: iv_ruleUAClockType= ruleUAClockType EOF
            {
             newCompositeNode(grammarAccess.getUAClockTypeRule()); 
            pushFollow(FOLLOW_ruleUAClockType_in_entryRuleUAClockType3549);
            iv_ruleUAClockType=ruleUAClockType();

            state._fsp--;

             current =iv_ruleUAClockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAClockType3559); 

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
    // $ANTLR end "entryRuleUAClockType"


    // $ANTLR start "ruleUAClockType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1545:1: ruleUAClockType returns [EObject current=null] : ( () otherlv_1= 'clock' ) ;
    public final EObject ruleUAClockType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1548:28: ( ( () otherlv_1= 'clock' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1549:1: ( () otherlv_1= 'clock' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1549:1: ( () otherlv_1= 'clock' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1549:2: () otherlv_1= 'clock'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1549:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1550:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAClockTypeAccess().getUAClockTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUAClockType3605); 

                	newLeafNode(otherlv_1, grammarAccess.getUAClockTypeAccess().getClockKeyword_1());
                

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
    // $ANTLR end "ruleUAClockType"


    // $ANTLR start "entryRuleUAChannelType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1567:1: entryRuleUAChannelType returns [EObject current=null] : iv_ruleUAChannelType= ruleUAChannelType EOF ;
    public final EObject entryRuleUAChannelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAChannelType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1568:2: (iv_ruleUAChannelType= ruleUAChannelType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1569:2: iv_ruleUAChannelType= ruleUAChannelType EOF
            {
             newCompositeNode(grammarAccess.getUAChannelTypeRule()); 
            pushFollow(FOLLOW_ruleUAChannelType_in_entryRuleUAChannelType3641);
            iv_ruleUAChannelType=ruleUAChannelType();

            state._fsp--;

             current =iv_ruleUAChannelType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAChannelType3651); 

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
    // $ANTLR end "entryRuleUAChannelType"


    // $ANTLR start "ruleUAChannelType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1576:1: ruleUAChannelType returns [EObject current=null] : ( () otherlv_1= 'chan' ) ;
    public final EObject ruleUAChannelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1579:28: ( ( () otherlv_1= 'chan' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1580:1: ( () otherlv_1= 'chan' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1580:1: ( () otherlv_1= 'chan' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1580:2: () otherlv_1= 'chan'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1580:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAChannelTypeAccess().getUAChannelTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleUAChannelType3697); 

                	newLeafNode(otherlv_1, grammarAccess.getUAChannelTypeAccess().getChanKeyword_1());
                

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
    // $ANTLR end "ruleUAChannelType"


    // $ANTLR start "entryRuleUABooleanType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1598:1: entryRuleUABooleanType returns [EObject current=null] : iv_ruleUABooleanType= ruleUABooleanType EOF ;
    public final EObject entryRuleUABooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABooleanType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1599:2: (iv_ruleUABooleanType= ruleUABooleanType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1600:2: iv_ruleUABooleanType= ruleUABooleanType EOF
            {
             newCompositeNode(grammarAccess.getUABooleanTypeRule()); 
            pushFollow(FOLLOW_ruleUABooleanType_in_entryRuleUABooleanType3733);
            iv_ruleUABooleanType=ruleUABooleanType();

            state._fsp--;

             current =iv_ruleUABooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABooleanType3743); 

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
    // $ANTLR end "entryRuleUABooleanType"


    // $ANTLR start "ruleUABooleanType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1607:1: ruleUABooleanType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleUABooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1610:28: ( ( () otherlv_1= 'bool' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1611:1: ( () otherlv_1= 'bool' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1611:1: ( () otherlv_1= 'bool' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1611:2: () otherlv_1= 'bool'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1611:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1612:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUABooleanTypeAccess().getUABooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUABooleanType3789); 

                	newLeafNode(otherlv_1, grammarAccess.getUABooleanTypeAccess().getBoolKeyword_1());
                

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
    // $ANTLR end "ruleUABooleanType"


    // $ANTLR start "entryRuleUAScalarType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1629:1: entryRuleUAScalarType returns [EObject current=null] : iv_ruleUAScalarType= ruleUAScalarType EOF ;
    public final EObject entryRuleUAScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAScalarType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1630:2: (iv_ruleUAScalarType= ruleUAScalarType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1631:2: iv_ruleUAScalarType= ruleUAScalarType EOF
            {
             newCompositeNode(grammarAccess.getUAScalarTypeRule()); 
            pushFollow(FOLLOW_ruleUAScalarType_in_entryRuleUAScalarType3825);
            iv_ruleUAScalarType=ruleUAScalarType();

            state._fsp--;

             current =iv_ruleUAScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAScalarType3835); 

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
    // $ANTLR end "entryRuleUAScalarType"


    // $ANTLR start "ruleUAScalarType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1638:1: ruleUAScalarType returns [EObject current=null] : ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleUAExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleUAScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_size_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1641:28: ( ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleUAExpression ) ) otherlv_4= ']' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1642:1: ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleUAExpression ) ) otherlv_4= ']' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1642:1: ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleUAExpression ) ) otherlv_4= ']' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1642:2: () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleUAExpression ) ) otherlv_4= ']'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1642:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1643:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAScalarTypeAccess().getUAScalarTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleUAScalarType3881); 

                	newLeafNode(otherlv_1, grammarAccess.getUAScalarTypeAccess().getScalarKeyword_1());
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUAScalarType3893); 

                	newLeafNode(otherlv_2, grammarAccess.getUAScalarTypeAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1656:1: ( (lv_size_3_0= ruleUAExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1657:1: (lv_size_3_0= ruleUAExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1657:1: (lv_size_3_0= ruleUAExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1658:3: lv_size_3_0= ruleUAExpression
            {
             
            	        newCompositeNode(grammarAccess.getUAScalarTypeAccess().getSizeUAExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUAScalarType3914);
            lv_size_3_0=ruleUAExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAScalarTypeRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_3_0, 
                    		"UAExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleUAScalarType3926); 

                	newLeafNode(otherlv_4, grammarAccess.getUAScalarTypeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleUAScalarType"


    // $ANTLR start "entryRuleUAStructType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1686:1: entryRuleUAStructType returns [EObject current=null] : iv_ruleUAStructType= ruleUAStructType EOF ;
    public final EObject entryRuleUAStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAStructType = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1687:2: (iv_ruleUAStructType= ruleUAStructType EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1688:2: iv_ruleUAStructType= ruleUAStructType EOF
            {
             newCompositeNode(grammarAccess.getUAStructTypeRule()); 
            pushFollow(FOLLOW_ruleUAStructType_in_entryRuleUAStructType3962);
            iv_ruleUAStructType=ruleUAStructType();

            state._fsp--;

             current =iv_ruleUAStructType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAStructType3972); 

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
    // $ANTLR end "entryRuleUAStructType"


    // $ANTLR start "ruleUAStructType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1695:1: ruleUAStructType returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleUAFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) ;
    public final EObject ruleUAStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_declarations_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1698:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleUAFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1699:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleUAFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1699:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleUAFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1699:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleUAFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}'
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1699:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1700:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAStructTypeAccess().getUAStructTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleUAStructType4018); 

                	newLeafNode(otherlv_1, grammarAccess.getUAStructTypeAccess().getStructKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleUAStructType4030); 

                	newLeafNode(otherlv_2, grammarAccess.getUAStructTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1713:1: ( (lv_declarations_3_0= ruleUAFieldDeclaration ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1714:1: (lv_declarations_3_0= ruleUAFieldDeclaration )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1714:1: (lv_declarations_3_0= ruleUAFieldDeclaration )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1715:3: lv_declarations_3_0= ruleUAFieldDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getUAStructTypeAccess().getDeclarationsUAFieldDeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUAFieldDeclaration_in_ruleUAStructType4051);
            lv_declarations_3_0=ruleUAFieldDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAStructTypeRule());
            	        }
                   		add(
                   			current, 
                   			"declarations",
                    		lv_declarations_3_0, 
                    		"UAFieldDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1731:2: (otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID||(LA25_1>=28 && LA25_1<=31)||(LA25_1>=35 && LA25_1<=40)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1731:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleUAFieldDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleUAStructType4064); 

            	        	newLeafNode(otherlv_4, grammarAccess.getUAStructTypeAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1735:1: ( (lv_declarations_5_0= ruleUAFieldDeclaration ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1736:1: (lv_declarations_5_0= ruleUAFieldDeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1736:1: (lv_declarations_5_0= ruleUAFieldDeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1737:3: lv_declarations_5_0= ruleUAFieldDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAStructTypeAccess().getDeclarationsUAFieldDeclarationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAFieldDeclaration_in_ruleUAStructType4085);
            	    lv_declarations_5_0=ruleUAFieldDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAStructTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_5_0, 
            	            		"UAFieldDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1753:4: (otherlv_6= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1753:6: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleUAStructType4100); 

                        	newLeafNode(otherlv_6, grammarAccess.getUAStructTypeAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleUAStructType4114); 

                	newLeafNode(otherlv_7, grammarAccess.getUAStructTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleUAStructType"


    // $ANTLR start "entryRuleUAFieldDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1769:1: entryRuleUAFieldDeclaration returns [EObject current=null] : iv_ruleUAFieldDeclaration= ruleUAFieldDeclaration EOF ;
    public final EObject entryRuleUAFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAFieldDeclaration = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1770:2: (iv_ruleUAFieldDeclaration= ruleUAFieldDeclaration EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1771:2: iv_ruleUAFieldDeclaration= ruleUAFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUAFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleUAFieldDeclaration_in_entryRuleUAFieldDeclaration4150);
            iv_ruleUAFieldDeclaration=ruleUAFieldDeclaration();

            state._fsp--;

             current =iv_ruleUAFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAFieldDeclaration4160); 

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
    // $ANTLR end "entryRuleUAFieldDeclaration"


    // $ANTLR start "ruleUAFieldDeclaration"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1778:1: ruleUAFieldDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_fields_1_0= ruleUAFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )* ) ;
    public final EObject ruleUAFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_fields_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1781:28: ( ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_fields_1_0= ruleUAFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1782:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_fields_1_0= ruleUAFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1782:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_fields_1_0= ruleUAFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1782:2: ( (lv_type_0_0= ruleUAType ) ) ( (lv_fields_1_0= ruleUAFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1782:2: ( (lv_type_0_0= ruleUAType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1783:1: (lv_type_0_0= ruleUAType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1783:1: (lv_type_0_0= ruleUAType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1784:3: lv_type_0_0= ruleUAType
            {
             
            	        newCompositeNode(grammarAccess.getUAFieldDeclarationAccess().getTypeUATypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUAType_in_ruleUAFieldDeclaration4206);
            lv_type_0_0=ruleUAType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAFieldDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"UAType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1800:2: ( (lv_fields_1_0= ruleUAFieldID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1801:1: (lv_fields_1_0= ruleUAFieldID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1801:1: (lv_fields_1_0= ruleUAFieldID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1802:3: lv_fields_1_0= ruleUAFieldID
            {
             
            	        newCompositeNode(grammarAccess.getUAFieldDeclarationAccess().getFieldsUAFieldIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUAFieldID_in_ruleUAFieldDeclaration4227);
            lv_fields_1_0=ruleUAFieldID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAFieldDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_1_0, 
                    		"UAFieldID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1818:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1818:4: otherlv_2= ',' ( (lv_fields_3_0= ruleUAFieldID ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUAFieldDeclaration4240); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAFieldDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1822:1: ( (lv_fields_3_0= ruleUAFieldID ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1823:1: (lv_fields_3_0= ruleUAFieldID )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1823:1: (lv_fields_3_0= ruleUAFieldID )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1824:3: lv_fields_3_0= ruleUAFieldID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAFieldDeclarationAccess().getFieldsUAFieldIDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAFieldID_in_ruleUAFieldDeclaration4261);
            	    lv_fields_3_0=ruleUAFieldID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAFieldDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"UAFieldID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleUAFieldDeclaration"


    // $ANTLR start "entryRuleUAFieldID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1848:1: entryRuleUAFieldID returns [EObject current=null] : iv_ruleUAFieldID= ruleUAFieldID EOF ;
    public final EObject entryRuleUAFieldID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAFieldID = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1849:2: (iv_ruleUAFieldID= ruleUAFieldID EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1850:2: iv_ruleUAFieldID= ruleUAFieldID EOF
            {
             newCompositeNode(grammarAccess.getUAFieldIDRule()); 
            pushFollow(FOLLOW_ruleUAFieldID_in_entryRuleUAFieldID4299);
            iv_ruleUAFieldID=ruleUAFieldID();

            state._fsp--;

             current =iv_ruleUAFieldID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAFieldID4309); 

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
    // $ANTLR end "entryRuleUAFieldID"


    // $ANTLR start "ruleUAFieldID"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1857:1: ruleUAFieldID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* ) ;
    public final EObject ruleUAFieldID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_dimensions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1860:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1861:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1861:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1861:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1861:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1862:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1862:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1863:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAFieldID4351); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUAFieldIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAFieldIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1879:2: ( (lv_dimensions_1_0= ruleUAArrayDeclaration ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1880:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1880:1: (lv_dimensions_1_0= ruleUAArrayDeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1881:3: lv_dimensions_1_0= ruleUAArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAFieldIDAccess().getDimensionsUAArrayDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAArrayDeclaration_in_ruleUAFieldID4377);
            	    lv_dimensions_1_0=ruleUAArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAFieldIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"UAArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleUAFieldID"


    // $ANTLR start "entryRuleUAParameters"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1905:1: entryRuleUAParameters returns [EObject current=null] : iv_ruleUAParameters= ruleUAParameters EOF ;
    public final EObject entryRuleUAParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAParameters = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1906:2: (iv_ruleUAParameters= ruleUAParameters EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1907:2: iv_ruleUAParameters= ruleUAParameters EOF
            {
             newCompositeNode(grammarAccess.getUAParametersRule()); 
            pushFollow(FOLLOW_ruleUAParameters_in_entryRuleUAParameters4414);
            iv_ruleUAParameters=ruleUAParameters();

            state._fsp--;

             current =iv_ruleUAParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAParameters4424); 

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
    // $ANTLR end "entryRuleUAParameters"


    // $ANTLR start "ruleUAParameters"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1914:1: ruleUAParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleUAParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )* ) ;
    public final EObject ruleUAParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1917:28: ( ( ( (lv_parameters_0_0= ruleUAParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1918:1: ( ( (lv_parameters_0_0= ruleUAParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1918:1: ( ( (lv_parameters_0_0= ruleUAParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1918:2: ( (lv_parameters_0_0= ruleUAParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1918:2: ( (lv_parameters_0_0= ruleUAParameter ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1919:1: (lv_parameters_0_0= ruleUAParameter )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1919:1: (lv_parameters_0_0= ruleUAParameter )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1920:3: lv_parameters_0_0= ruleUAParameter
            {
             
            	        newCompositeNode(grammarAccess.getUAParametersAccess().getParametersUAParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUAParameter_in_ruleUAParameters4470);
            lv_parameters_0_0=ruleUAParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"UAParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1936:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1936:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleUAParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUAParameters4483); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUAParametersAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1940:1: ( (lv_parameters_2_0= ruleUAParameter ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1941:1: (lv_parameters_2_0= ruleUAParameter )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1941:1: (lv_parameters_2_0= ruleUAParameter )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1942:3: lv_parameters_2_0= ruleUAParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAParametersAccess().getParametersUAParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAParameter_in_ruleUAParameters4504);
            	    lv_parameters_2_0=ruleUAParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"UAParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleUAParameters"


    // $ANTLR start "entryRuleUAParameter"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1966:1: entryRuleUAParameter returns [EObject current=null] : iv_ruleUAParameter= ruleUAParameter EOF ;
    public final EObject entryRuleUAParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAParameter = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1967:2: (iv_ruleUAParameter= ruleUAParameter EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1968:2: iv_ruleUAParameter= ruleUAParameter EOF
            {
             newCompositeNode(grammarAccess.getUAParameterRule()); 
            pushFollow(FOLLOW_ruleUAParameter_in_entryRuleUAParameter4542);
            iv_ruleUAParameter=ruleUAParameter();

            state._fsp--;

             current =iv_ruleUAParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAParameter4552); 

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
    // $ANTLR end "entryRuleUAParameter"


    // $ANTLR start "ruleUAParameter"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1975:1: ruleUAParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_byReference_1_0= '&' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )* ) ;
    public final EObject ruleUAParameter() throws RecognitionException {
        EObject current = null;

        Token lv_byReference_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_dimensions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1978:28: ( ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_byReference_1_0= '&' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1979:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_byReference_1_0= '&' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1979:1: ( ( (lv_type_0_0= ruleUAType ) ) ( (lv_byReference_1_0= '&' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1979:2: ( (lv_type_0_0= ruleUAType ) ) ( (lv_byReference_1_0= '&' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1979:2: ( (lv_type_0_0= ruleUAType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1980:1: (lv_type_0_0= ruleUAType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1980:1: (lv_type_0_0= ruleUAType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1981:3: lv_type_0_0= ruleUAType
            {
             
            	        newCompositeNode(grammarAccess.getUAParameterAccess().getTypeUATypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUAType_in_ruleUAParameter4598);
            lv_type_0_0=ruleUAType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUAParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"UAType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1997:2: ( (lv_byReference_1_0= '&' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1998:1: (lv_byReference_1_0= '&' )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1998:1: (lv_byReference_1_0= '&' )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:1999:3: lv_byReference_1_0= '&'
                    {
                    lv_byReference_1_0=(Token)match(input,41,FOLLOW_41_in_ruleUAParameter4616); 

                            newLeafNode(lv_byReference_1_0, grammarAccess.getUAParameterAccess().getByReferenceAmpersandKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUAParameterRule());
                    	        }
                           		setWithLastConsumed(current, "byReference", true, "&");
                    	    

                    }


                    }
                    break;

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2012:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2013:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2013:1: (lv_name_2_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2014:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAParameter4647); 

            			newLeafNode(lv_name_2_0, grammarAccess.getUAParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2030:2: ( (lv_dimensions_3_0= ruleUAArrayDeclaration ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2031:1: (lv_dimensions_3_0= ruleUAArrayDeclaration )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2031:1: (lv_dimensions_3_0= ruleUAArrayDeclaration )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2032:3: lv_dimensions_3_0= ruleUAArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAParameterAccess().getDimensionsUAArrayDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAArrayDeclaration_in_ruleUAParameter4673);
            	    lv_dimensions_3_0=ruleUAArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_3_0, 
            	            		"UAArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleUAParameter"


    // $ANTLR start "entryRuleUAExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2056:1: entryRuleUAExpression returns [EObject current=null] : iv_ruleUAExpression= ruleUAExpression EOF ;
    public final EObject entryRuleUAExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2057:2: (iv_ruleUAExpression= ruleUAExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2058:2: iv_ruleUAExpression= ruleUAExpression EOF
            {
             newCompositeNode(grammarAccess.getUAExpressionRule()); 
            pushFollow(FOLLOW_ruleUAExpression_in_entryRuleUAExpression4710);
            iv_ruleUAExpression=ruleUAExpression();

            state._fsp--;

             current =iv_ruleUAExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAExpression4720); 

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
    // $ANTLR end "entryRuleUAExpression"


    // $ANTLR start "ruleUAExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2065:1: ruleUAExpression returns [EObject current=null] : (this_UAImplyLogicOrExpression_0= ruleUAImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) ) ) ;
    public final EObject ruleUAExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_UAImplyLogicOrExpression_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_expression_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2068:28: ( (this_UAImplyLogicOrExpression_0= ruleUAImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2069:1: (this_UAImplyLogicOrExpression_0= ruleUAImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2069:1: (this_UAImplyLogicOrExpression_0= ruleUAImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||LA33_0==19||LA33_0==73||(LA33_0>=77 && LA33_0<=79)||(LA33_0>=81 && LA33_0<=82)) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=42 && LA33_0<=43)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2070:5: this_UAImplyLogicOrExpression_0= ruleUAImplyLogicOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUAExpressionAccess().getUAImplyLogicOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAImplyLogicOrExpression_in_ruleUAExpression4767);
                    this_UAImplyLogicOrExpression_0=ruleUAImplyLogicOrExpression();

                    state._fsp--;

                     
                            current = this_UAImplyLogicOrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:6: ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:6: ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:7: ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleUAType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleUAExpression ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:7: ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==42) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==43) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:8: ( () otherlv_2= 'forall' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:8: ( () otherlv_2= 'forall' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:9: () otherlv_2= 'forall'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2079:9: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2080:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAExpressionAccess().getUAForallExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleUAExpression4796); 

                                	newLeafNode(otherlv_2, grammarAccess.getUAExpressionAccess().getForallKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2090:6: ( () otherlv_4= 'exists' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2090:6: ( () otherlv_4= 'exists' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2090:7: () otherlv_4= 'exists'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2090:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2091:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAExpressionAccess().getUAExistsExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleUAExpression4825); 

                                	newLeafNode(otherlv_4, grammarAccess.getUAExpressionAccess().getExistsKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUAExpression4839); 

                        	newLeafNode(otherlv_5, grammarAccess.getUAExpressionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2104:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2105:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2105:1: (lv_name_6_0= RULE_ID )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2106:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAExpression4856); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getUAExpressionAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUAExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleUAExpression4873); 

                        	newLeafNode(otherlv_7, grammarAccess.getUAExpressionAccess().getColonKeyword_1_3());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2126:1: ( (lv_type_8_0= ruleUAType ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2127:1: (lv_type_8_0= ruleUAType )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2127:1: (lv_type_8_0= ruleUAType )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2128:3: lv_type_8_0= ruleUAType
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAExpressionAccess().getTypeUATypeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAType_in_ruleUAExpression4894);
                    lv_type_8_0=ruleUAType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_8_0, 
                            		"UAType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleUAExpression4906); 

                        	newLeafNode(otherlv_9, grammarAccess.getUAExpressionAccess().getRightParenthesisKeyword_1_5());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2148:1: ( (lv_expression_10_0= ruleUAExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2149:1: (lv_expression_10_0= ruleUAExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2149:1: (lv_expression_10_0= ruleUAExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2150:3: lv_expression_10_0= ruleUAExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAExpressionAccess().getExpressionUAExpressionParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAExpression4927);
                    lv_expression_10_0=ruleUAExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_10_0, 
                            		"UAExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleUAExpression"


    // $ANTLR start "entryRuleUAImplyLogicOrExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2174:1: entryRuleUAImplyLogicOrExpression returns [EObject current=null] : iv_ruleUAImplyLogicOrExpression= ruleUAImplyLogicOrExpression EOF ;
    public final EObject entryRuleUAImplyLogicOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAImplyLogicOrExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2175:2: (iv_ruleUAImplyLogicOrExpression= ruleUAImplyLogicOrExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2176:2: iv_ruleUAImplyLogicOrExpression= ruleUAImplyLogicOrExpression EOF
            {
             newCompositeNode(grammarAccess.getUAImplyLogicOrExpressionRule()); 
            pushFollow(FOLLOW_ruleUAImplyLogicOrExpression_in_entryRuleUAImplyLogicOrExpression4964);
            iv_ruleUAImplyLogicOrExpression=ruleUAImplyLogicOrExpression();

            state._fsp--;

             current =iv_ruleUAImplyLogicOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAImplyLogicOrExpression4974); 

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
    // $ANTLR end "entryRuleUAImplyLogicOrExpression"


    // $ANTLR start "ruleUAImplyLogicOrExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2183:1: ruleUAImplyLogicOrExpression returns [EObject current=null] : (this_UALogicAndExpression1_0= ruleUALogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )* ) ;
    public final EObject ruleUAImplyLogicOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UALogicAndExpression1_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2186:28: ( (this_UALogicAndExpression1_0= ruleUALogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2187:1: (this_UALogicAndExpression1_0= ruleUALogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2187:1: (this_UALogicAndExpression1_0= ruleUALogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2188:5: this_UALogicAndExpression1_0= ruleUALogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicAndExpression1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUALogicAndExpression1_in_ruleUAImplyLogicOrExpression5021);
            this_UALogicAndExpression1_0=ruleUALogicAndExpression1();

            state._fsp--;

             
                    current = this_UALogicAndExpression1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:1: ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=45 && LA35_0<=46)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:2: ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleUALogicAndExpression1 ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:2: ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==45) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==46) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:3: ( () otherlv_2= 'imply' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:3: ( () otherlv_2= 'imply' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:4: () otherlv_2= 'imply'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2196:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2197:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleUAImplyLogicOrExpression5044); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAImplyLogicOrExpressionAccess().getImplyKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2207:6: ( () otherlv_4= 'or' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2207:6: ( () otherlv_4= 'or' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2207:7: () otherlv_4= 'or'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2207:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2208:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleUAImplyLogicOrExpression5073); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAImplyLogicOrExpressionAccess().getOrKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2217:3: ( (lv_right_5_0= ruleUALogicAndExpression1 ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2218:1: (lv_right_5_0= ruleUALogicAndExpression1 )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2218:1: (lv_right_5_0= ruleUALogicAndExpression1 )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2219:3: lv_right_5_0= ruleUALogicAndExpression1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAImplyLogicOrExpressionAccess().getRightUALogicAndExpression1ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUALogicAndExpression1_in_ruleUAImplyLogicOrExpression5096);
            	    lv_right_5_0=ruleUALogicAndExpression1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAImplyLogicOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"UALogicAndExpression1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleUAImplyLogicOrExpression"


    // $ANTLR start "entryRuleUALogicAndExpression1"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2243:1: entryRuleUALogicAndExpression1 returns [EObject current=null] : iv_ruleUALogicAndExpression1= ruleUALogicAndExpression1 EOF ;
    public final EObject entryRuleUALogicAndExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUALogicAndExpression1 = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2244:2: (iv_ruleUALogicAndExpression1= ruleUALogicAndExpression1 EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2245:2: iv_ruleUALogicAndExpression1= ruleUALogicAndExpression1 EOF
            {
             newCompositeNode(grammarAccess.getUALogicAndExpression1Rule()); 
            pushFollow(FOLLOW_ruleUALogicAndExpression1_in_entryRuleUALogicAndExpression15134);
            iv_ruleUALogicAndExpression1=ruleUALogicAndExpression1();

            state._fsp--;

             current =iv_ruleUALogicAndExpression1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUALogicAndExpression15144); 

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
    // $ANTLR end "entryRuleUALogicAndExpression1"


    // $ANTLR start "ruleUALogicAndExpression1"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2252:1: ruleUALogicAndExpression1 returns [EObject current=null] : (this_UALogicNotExpression1_0= ruleUALogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )* ) ;
    public final EObject ruleUALogicAndExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UALogicNotExpression1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2255:28: ( (this_UALogicNotExpression1_0= ruleUALogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2256:1: (this_UALogicNotExpression1_0= ruleUALogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2256:1: (this_UALogicNotExpression1_0= ruleUALogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2257:5: this_UALogicNotExpression1_0= ruleUALogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUALogicAndExpression1Access().getUALogicNotExpression1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUALogicNotExpression1_in_ruleUALogicAndExpression15191);
            this_UALogicNotExpression1_0=ruleUALogicNotExpression1();

            state._fsp--;

             
                    current = this_UALogicNotExpression1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2265:1: ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2265:2: ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleUALogicNotExpression1 ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2265:2: ( () otherlv_2= 'and' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2265:3: () otherlv_2= 'and'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2265:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2266:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleUALogicAndExpression15213); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUALogicAndExpression1Access().getAndKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2275:2: ( (lv_right_3_0= ruleUALogicNotExpression1 ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2276:1: (lv_right_3_0= ruleUALogicNotExpression1 )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2276:1: (lv_right_3_0= ruleUALogicNotExpression1 )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2277:3: lv_right_3_0= ruleUALogicNotExpression1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUALogicAndExpression1Access().getRightUALogicNotExpression1ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUALogicNotExpression1_in_ruleUALogicAndExpression15235);
            	    lv_right_3_0=ruleUALogicNotExpression1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUALogicAndExpression1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UALogicNotExpression1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleUALogicAndExpression1"


    // $ANTLR start "entryRuleUALogicNotExpression1"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2301:1: entryRuleUALogicNotExpression1 returns [EObject current=null] : iv_ruleUALogicNotExpression1= ruleUALogicNotExpression1 EOF ;
    public final EObject entryRuleUALogicNotExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUALogicNotExpression1 = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2302:2: (iv_ruleUALogicNotExpression1= ruleUALogicNotExpression1 EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2303:2: iv_ruleUALogicNotExpression1= ruleUALogicNotExpression1 EOF
            {
             newCompositeNode(grammarAccess.getUALogicNotExpression1Rule()); 
            pushFollow(FOLLOW_ruleUALogicNotExpression1_in_entryRuleUALogicNotExpression15273);
            iv_ruleUALogicNotExpression1=ruleUALogicNotExpression1();

            state._fsp--;

             current =iv_ruleUALogicNotExpression1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUALogicNotExpression15283); 

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
    // $ANTLR end "entryRuleUALogicNotExpression1"


    // $ANTLR start "ruleUALogicNotExpression1"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2310:1: ruleUALogicNotExpression1 returns [EObject current=null] : this_UAAssignmentExpression_0= ruleUAAssignmentExpression ;
    public final EObject ruleUALogicNotExpression1() throws RecognitionException {
        EObject current = null;

        EObject this_UAAssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2313:28: (this_UAAssignmentExpression_0= ruleUAAssignmentExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2315:5: this_UAAssignmentExpression_0= ruleUAAssignmentExpression
            {
             
                    newCompositeNode(grammarAccess.getUALogicNotExpression1Access().getUAAssignmentExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUAAssignmentExpression_in_ruleUALogicNotExpression15329);
            this_UAAssignmentExpression_0=ruleUAAssignmentExpression();

            state._fsp--;

             
                    current = this_UAAssignmentExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleUALogicNotExpression1"


    // $ANTLR start "entryRuleUAAssignmentExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2331:1: entryRuleUAAssignmentExpression returns [EObject current=null] : iv_ruleUAAssignmentExpression= ruleUAAssignmentExpression EOF ;
    public final EObject entryRuleUAAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAAssignmentExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2332:2: (iv_ruleUAAssignmentExpression= ruleUAAssignmentExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2333:2: iv_ruleUAAssignmentExpression= ruleUAAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getUAAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleUAAssignmentExpression_in_entryRuleUAAssignmentExpression5363);
            iv_ruleUAAssignmentExpression=ruleUAAssignmentExpression();

            state._fsp--;

             current =iv_ruleUAAssignmentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAAssignmentExpression5373); 

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
    // $ANTLR end "entryRuleUAAssignmentExpression"


    // $ANTLR start "ruleUAAssignmentExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2340:1: ruleUAAssignmentExpression returns [EObject current=null] : (this_UAConditionalExpression_0= ruleUAConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )? ) ;
    public final EObject ruleUAAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject this_UAConditionalExpression_0 = null;

        EObject lv_right_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2343:28: ( (this_UAConditionalExpression_0= ruleUAConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2344:1: (this_UAConditionalExpression_0= ruleUAConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2344:1: (this_UAConditionalExpression_0= ruleUAConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2345:5: this_UAConditionalExpression_0= ruleUAConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getUAAssignmentExpressionAccess().getUAConditionalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAConditionalExpression_in_ruleUAAssignmentExpression5420);
            this_UAConditionalExpression_0=ruleUAConditionalExpression();

            state._fsp--;

             
                    current = this_UAConditionalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:1: ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=21 && LA38_0<=22)||(LA38_0>=48 && LA38_0<=57)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleUAAssignmentExpression ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) )
                    int alt37=12;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt37=1;
                        }
                        break;
                    case 21:
                        {
                        alt37=2;
                        }
                        break;
                    case 48:
                        {
                        alt37=3;
                        }
                        break;
                    case 49:
                        {
                        alt37=4;
                        }
                        break;
                    case 50:
                        {
                        alt37=5;
                        }
                        break;
                    case 51:
                        {
                        alt37=6;
                        }
                        break;
                    case 52:
                        {
                        alt37=7;
                        }
                        break;
                    case 53:
                        {
                        alt37=8;
                        }
                        break;
                    case 54:
                        {
                        alt37=9;
                        }
                        break;
                    case 55:
                        {
                        alt37=10;
                        }
                        break;
                    case 56:
                        {
                        alt37=11;
                        }
                        break;
                    case 57:
                        {
                        alt37=12;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:3: ( () otherlv_2= '=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:3: ( () otherlv_2= '=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:4: () otherlv_2= '='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2353:4: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2354:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleUAAssignmentExpression5443); 

                                	newLeafNode(otherlv_2, grammarAccess.getUAAssignmentExpressionAccess().getEqualsSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2364:6: ( () otherlv_4= ':=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2364:6: ( () otherlv_4= ':=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2364:7: () otherlv_4= ':='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2364:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2365:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleUAAssignmentExpression5472); 

                                	newLeafNode(otherlv_4, grammarAccess.getUAAssignmentExpressionAccess().getColonEqualsSignKeyword_1_0_1_1());
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2375:6: ( () otherlv_6= '+=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2375:6: ( () otherlv_6= '+=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2375:7: () otherlv_6= '+='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2375:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2376:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0(),
                                        current);
                                

                            }

                            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleUAAssignmentExpression5501); 

                                	newLeafNode(otherlv_6, grammarAccess.getUAAssignmentExpressionAccess().getPlusSignEqualsSignKeyword_1_0_2_1());
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2386:6: ( () otherlv_8= '-=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2386:6: ( () otherlv_8= '-=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2386:7: () otherlv_8= '-='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2386:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2387:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleUAAssignmentExpression5530); 

                                	newLeafNode(otherlv_8, grammarAccess.getUAAssignmentExpressionAccess().getHyphenMinusEqualsSignKeyword_1_0_3_1());
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2397:6: ( () otherlv_10= '*=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2397:6: ( () otherlv_10= '*=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2397:7: () otherlv_10= '*='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2397:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2398:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0(),
                                        current);
                                

                            }

                            otherlv_10=(Token)match(input,50,FOLLOW_50_in_ruleUAAssignmentExpression5559); 

                                	newLeafNode(otherlv_10, grammarAccess.getUAAssignmentExpressionAccess().getAsteriskEqualsSignKeyword_1_0_4_1());
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2408:6: ( () otherlv_12= '/=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2408:6: ( () otherlv_12= '/=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2408:7: () otherlv_12= '/='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2408:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2409:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0(),
                                        current);
                                

                            }

                            otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleUAAssignmentExpression5588); 

                                	newLeafNode(otherlv_12, grammarAccess.getUAAssignmentExpressionAccess().getSolidusEqualsSignKeyword_1_0_5_1());
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2419:6: ( () otherlv_14= '%=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2419:6: ( () otherlv_14= '%=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2419:7: () otherlv_14= '%='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2419:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2420:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0(),
                                        current);
                                

                            }

                            otherlv_14=(Token)match(input,52,FOLLOW_52_in_ruleUAAssignmentExpression5617); 

                                	newLeafNode(otherlv_14, grammarAccess.getUAAssignmentExpressionAccess().getPercentSignEqualsSignKeyword_1_0_6_1());
                                

                            }


                            }
                            break;
                        case 8 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2430:6: ( () otherlv_16= '|=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2430:6: ( () otherlv_16= '|=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2430:7: () otherlv_16= '|='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2430:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2431:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0(),
                                        current);
                                

                            }

                            otherlv_16=(Token)match(input,53,FOLLOW_53_in_ruleUAAssignmentExpression5646); 

                                	newLeafNode(otherlv_16, grammarAccess.getUAAssignmentExpressionAccess().getVerticalLineEqualsSignKeyword_1_0_7_1());
                                

                            }


                            }
                            break;
                        case 9 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2441:6: ( () otherlv_18= '&=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2441:6: ( () otherlv_18= '&=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2441:7: () otherlv_18= '&='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2441:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2442:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0(),
                                        current);
                                

                            }

                            otherlv_18=(Token)match(input,54,FOLLOW_54_in_ruleUAAssignmentExpression5675); 

                                	newLeafNode(otherlv_18, grammarAccess.getUAAssignmentExpressionAccess().getAmpersandEqualsSignKeyword_1_0_8_1());
                                

                            }


                            }
                            break;
                        case 10 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2452:6: ( () otherlv_20= '^=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2452:6: ( () otherlv_20= '^=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2452:7: () otherlv_20= '^='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2452:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2453:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0(),
                                        current);
                                

                            }

                            otherlv_20=(Token)match(input,55,FOLLOW_55_in_ruleUAAssignmentExpression5704); 

                                	newLeafNode(otherlv_20, grammarAccess.getUAAssignmentExpressionAccess().getCircumflexAccentEqualsSignKeyword_1_0_9_1());
                                

                            }


                            }
                            break;
                        case 11 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2463:6: ( () otherlv_22= '<<=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2463:6: ( () otherlv_22= '<<=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2463:7: () otherlv_22= '<<='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2463:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2464:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0(),
                                        current);
                                

                            }

                            otherlv_22=(Token)match(input,56,FOLLOW_56_in_ruleUAAssignmentExpression5733); 

                                	newLeafNode(otherlv_22, grammarAccess.getUAAssignmentExpressionAccess().getLessThanSignLessThanSignEqualsSignKeyword_1_0_10_1());
                                

                            }


                            }
                            break;
                        case 12 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2474:6: ( () otherlv_24= '>>=' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2474:6: ( () otherlv_24= '>>=' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2474:7: () otherlv_24= '>>='
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2474:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2475:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0(),
                                        current);
                                

                            }

                            otherlv_24=(Token)match(input,57,FOLLOW_57_in_ruleUAAssignmentExpression5762); 

                                	newLeafNode(otherlv_24, grammarAccess.getUAAssignmentExpressionAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0_11_1());
                                

                            }


                            }
                            break;

                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2484:3: ( (lv_right_25_0= ruleUAAssignmentExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2485:1: (lv_right_25_0= ruleUAAssignmentExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2485:1: (lv_right_25_0= ruleUAAssignmentExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2486:3: lv_right_25_0= ruleUAAssignmentExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAAssignmentExpression_in_ruleUAAssignmentExpression5785);
                    lv_right_25_0=ruleUAAssignmentExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAAssignmentExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_25_0, 
                            		"UAAssignmentExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleUAAssignmentExpression"


    // $ANTLR start "entryRuleUAConditionalExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2510:1: entryRuleUAConditionalExpression returns [EObject current=null] : iv_ruleUAConditionalExpression= ruleUAConditionalExpression EOF ;
    public final EObject entryRuleUAConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAConditionalExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2511:2: (iv_ruleUAConditionalExpression= ruleUAConditionalExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2512:2: iv_ruleUAConditionalExpression= ruleUAConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getUAConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleUAConditionalExpression_in_entryRuleUAConditionalExpression5823);
            iv_ruleUAConditionalExpression=ruleUAConditionalExpression();

            state._fsp--;

             current =iv_ruleUAConditionalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAConditionalExpression5833); 

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
    // $ANTLR end "entryRuleUAConditionalExpression"


    // $ANTLR start "ruleUAConditionalExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2519:1: ruleUAConditionalExpression returns [EObject current=null] : (this_UALogicOrExpression2_0= ruleUALogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )? ) ;
    public final EObject ruleUAConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UALogicOrExpression2_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2522:28: ( (this_UALogicOrExpression2_0= ruleUALogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2523:1: (this_UALogicOrExpression2_0= ruleUALogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2523:1: (this_UALogicOrExpression2_0= ruleUALogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2524:5: this_UALogicOrExpression2_0= ruleUALogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getUAConditionalExpressionAccess().getUALogicOrExpression2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUALogicOrExpression2_in_ruleUAConditionalExpression5880);
            this_UALogicOrExpression2_0=ruleUALogicOrExpression2();

            state._fsp--;

             
                    current = this_UALogicOrExpression2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2532:1: ( () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                int LA39_1 = input.LA(2);

                if ( ((LA39_1>=RULE_ID && LA39_1<=RULE_INT)||LA39_1==19||LA39_1==73||(LA39_1>=77 && LA39_1<=79)||(LA39_1>=81 && LA39_1<=82)) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2532:2: () otherlv_2= '?' ( (lv_then_3_0= ruleUALogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleUAConditionalExpression ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2532:2: ()
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2533:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleUAConditionalExpression5901); 

                        	newLeafNode(otherlv_2, grammarAccess.getUAConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2542:1: ( (lv_then_3_0= ruleUALogicOrExpression2 ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2543:1: (lv_then_3_0= ruleUALogicOrExpression2 )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2543:1: (lv_then_3_0= ruleUALogicOrExpression2 )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2544:3: lv_then_3_0= ruleUALogicOrExpression2
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAConditionalExpressionAccess().getThenUALogicOrExpression2ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUALogicOrExpression2_in_ruleUAConditionalExpression5922);
                    lv_then_3_0=ruleUALogicOrExpression2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"then",
                            		lv_then_3_0, 
                            		"UALogicOrExpression2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleUAConditionalExpression5934); 

                        	newLeafNode(otherlv_4, grammarAccess.getUAConditionalExpressionAccess().getColonKeyword_1_3());
                        
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2564:1: ( (lv_else_5_0= ruleUAConditionalExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2565:1: (lv_else_5_0= ruleUAConditionalExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2565:1: (lv_else_5_0= ruleUAConditionalExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2566:3: lv_else_5_0= ruleUAConditionalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAConditionalExpressionAccess().getElseUAConditionalExpressionParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAConditionalExpression_in_ruleUAConditionalExpression5955);
                    lv_else_5_0=ruleUAConditionalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_5_0, 
                            		"UAConditionalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleUAConditionalExpression"


    // $ANTLR start "entryRuleUALogicOrExpression2"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2590:1: entryRuleUALogicOrExpression2 returns [EObject current=null] : iv_ruleUALogicOrExpression2= ruleUALogicOrExpression2 EOF ;
    public final EObject entryRuleUALogicOrExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUALogicOrExpression2 = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2591:2: (iv_ruleUALogicOrExpression2= ruleUALogicOrExpression2 EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2592:2: iv_ruleUALogicOrExpression2= ruleUALogicOrExpression2 EOF
            {
             newCompositeNode(grammarAccess.getUALogicOrExpression2Rule()); 
            pushFollow(FOLLOW_ruleUALogicOrExpression2_in_entryRuleUALogicOrExpression25993);
            iv_ruleUALogicOrExpression2=ruleUALogicOrExpression2();

            state._fsp--;

             current =iv_ruleUALogicOrExpression2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUALogicOrExpression26003); 

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
    // $ANTLR end "entryRuleUALogicOrExpression2"


    // $ANTLR start "ruleUALogicOrExpression2"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2599:1: ruleUALogicOrExpression2 returns [EObject current=null] : (this_UALogicAndExpression2_0= ruleUALogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )* ) ;
    public final EObject ruleUALogicOrExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UALogicAndExpression2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2602:28: ( (this_UALogicAndExpression2_0= ruleUALogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2603:1: (this_UALogicAndExpression2_0= ruleUALogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2603:1: (this_UALogicAndExpression2_0= ruleUALogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2604:5: this_UALogicAndExpression2_0= ruleUALogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUALogicOrExpression2Access().getUALogicAndExpression2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUALogicAndExpression2_in_ruleUALogicOrExpression26050);
            this_UALogicAndExpression2_0=ruleUALogicAndExpression2();

            state._fsp--;

             
                    current = this_UALogicAndExpression2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2612:1: ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==59) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2612:2: ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleUALogicAndExpression2 ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2612:2: ( () otherlv_2= '||' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2612:3: () otherlv_2= '||'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2612:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2613:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleUALogicOrExpression26072); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUALogicOrExpression2Access().getVerticalLineVerticalLineKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2622:2: ( (lv_right_3_0= ruleUALogicAndExpression2 ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2623:1: (lv_right_3_0= ruleUALogicAndExpression2 )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2623:1: (lv_right_3_0= ruleUALogicAndExpression2 )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2624:3: lv_right_3_0= ruleUALogicAndExpression2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUALogicOrExpression2Access().getRightUALogicAndExpression2ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUALogicAndExpression2_in_ruleUALogicOrExpression26094);
            	    lv_right_3_0=ruleUALogicAndExpression2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUALogicOrExpression2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UALogicAndExpression2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleUALogicOrExpression2"


    // $ANTLR start "entryRuleUALogicAndExpression2"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2648:1: entryRuleUALogicAndExpression2 returns [EObject current=null] : iv_ruleUALogicAndExpression2= ruleUALogicAndExpression2 EOF ;
    public final EObject entryRuleUALogicAndExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUALogicAndExpression2 = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2649:2: (iv_ruleUALogicAndExpression2= ruleUALogicAndExpression2 EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2650:2: iv_ruleUALogicAndExpression2= ruleUALogicAndExpression2 EOF
            {
             newCompositeNode(grammarAccess.getUALogicAndExpression2Rule()); 
            pushFollow(FOLLOW_ruleUALogicAndExpression2_in_entryRuleUALogicAndExpression26132);
            iv_ruleUALogicAndExpression2=ruleUALogicAndExpression2();

            state._fsp--;

             current =iv_ruleUALogicAndExpression2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUALogicAndExpression26142); 

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
    // $ANTLR end "entryRuleUALogicAndExpression2"


    // $ANTLR start "ruleUALogicAndExpression2"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2657:1: ruleUALogicAndExpression2 returns [EObject current=null] : (this_UABitOrExpression_0= ruleUABitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )* ) ;
    public final EObject ruleUALogicAndExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UABitOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2660:28: ( (this_UABitOrExpression_0= ruleUABitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2661:1: (this_UABitOrExpression_0= ruleUABitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2661:1: (this_UABitOrExpression_0= ruleUABitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2662:5: this_UABitOrExpression_0= ruleUABitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUALogicAndExpression2Access().getUABitOrExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUABitOrExpression_in_ruleUALogicAndExpression26189);
            this_UABitOrExpression_0=ruleUABitOrExpression();

            state._fsp--;

             
                    current = this_UABitOrExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2670:1: ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2670:2: ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleUABitOrExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2670:2: ( () otherlv_2= '&&' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2670:3: () otherlv_2= '&&'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2670:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2671:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleUALogicAndExpression26211); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUALogicAndExpression2Access().getAmpersandAmpersandKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2680:2: ( (lv_right_3_0= ruleUABitOrExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2681:1: (lv_right_3_0= ruleUABitOrExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2681:1: (lv_right_3_0= ruleUABitOrExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2682:3: lv_right_3_0= ruleUABitOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUALogicAndExpression2Access().getRightUABitOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUABitOrExpression_in_ruleUALogicAndExpression26233);
            	    lv_right_3_0=ruleUABitOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUALogicAndExpression2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UABitOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleUALogicAndExpression2"


    // $ANTLR start "entryRuleUABitOrExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2706:1: entryRuleUABitOrExpression returns [EObject current=null] : iv_ruleUABitOrExpression= ruleUABitOrExpression EOF ;
    public final EObject entryRuleUABitOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABitOrExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2707:2: (iv_ruleUABitOrExpression= ruleUABitOrExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2708:2: iv_ruleUABitOrExpression= ruleUABitOrExpression EOF
            {
             newCompositeNode(grammarAccess.getUABitOrExpressionRule()); 
            pushFollow(FOLLOW_ruleUABitOrExpression_in_entryRuleUABitOrExpression6271);
            iv_ruleUABitOrExpression=ruleUABitOrExpression();

            state._fsp--;

             current =iv_ruleUABitOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABitOrExpression6281); 

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
    // $ANTLR end "entryRuleUABitOrExpression"


    // $ANTLR start "ruleUABitOrExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2715:1: ruleUABitOrExpression returns [EObject current=null] : (this_UABitXORExpression_0= ruleUABitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )* ) ;
    public final EObject ruleUABitOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UABitXORExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2718:28: ( (this_UABitXORExpression_0= ruleUABitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2719:1: (this_UABitXORExpression_0= ruleUABitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2719:1: (this_UABitXORExpression_0= ruleUABitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2720:5: this_UABitXORExpression_0= ruleUABitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUABitOrExpressionAccess().getUABitXORExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUABitXORExpression_in_ruleUABitOrExpression6328);
            this_UABitXORExpression_0=ruleUABitXORExpression();

            state._fsp--;

             
                    current = this_UABitXORExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2728:1: ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==61) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2728:2: ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleUABitXORExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2728:2: ( () otherlv_2= '|' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2728:3: () otherlv_2= '|'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2728:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2729:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleUABitOrExpression6350); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUABitOrExpressionAccess().getVerticalLineKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2738:2: ( (lv_right_3_0= ruleUABitXORExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2739:1: (lv_right_3_0= ruleUABitXORExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2739:1: (lv_right_3_0= ruleUABitXORExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2740:3: lv_right_3_0= ruleUABitXORExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUABitOrExpressionAccess().getRightUABitXORExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUABitXORExpression_in_ruleUABitOrExpression6372);
            	    lv_right_3_0=ruleUABitXORExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUABitOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UABitXORExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleUABitOrExpression"


    // $ANTLR start "entryRuleUABitXORExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2764:1: entryRuleUABitXORExpression returns [EObject current=null] : iv_ruleUABitXORExpression= ruleUABitXORExpression EOF ;
    public final EObject entryRuleUABitXORExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABitXORExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2765:2: (iv_ruleUABitXORExpression= ruleUABitXORExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2766:2: iv_ruleUABitXORExpression= ruleUABitXORExpression EOF
            {
             newCompositeNode(grammarAccess.getUABitXORExpressionRule()); 
            pushFollow(FOLLOW_ruleUABitXORExpression_in_entryRuleUABitXORExpression6410);
            iv_ruleUABitXORExpression=ruleUABitXORExpression();

            state._fsp--;

             current =iv_ruleUABitXORExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABitXORExpression6420); 

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
    // $ANTLR end "entryRuleUABitXORExpression"


    // $ANTLR start "ruleUABitXORExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2773:1: ruleUABitXORExpression returns [EObject current=null] : (this_UABitAndExpression_0= ruleUABitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )* ) ;
    public final EObject ruleUABitXORExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UABitAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2776:28: ( (this_UABitAndExpression_0= ruleUABitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2777:1: (this_UABitAndExpression_0= ruleUABitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2777:1: (this_UABitAndExpression_0= ruleUABitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2778:5: this_UABitAndExpression_0= ruleUABitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUABitXORExpressionAccess().getUABitAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUABitAndExpression_in_ruleUABitXORExpression6467);
            this_UABitAndExpression_0=ruleUABitAndExpression();

            state._fsp--;

             
                    current = this_UABitAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2786:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==62) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2786:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUABitAndExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2786:2: ( () otherlv_2= '^' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2786:3: () otherlv_2= '^'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2786:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2787:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleUABitXORExpression6489); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUABitXORExpressionAccess().getCircumflexAccentKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2796:2: ( (lv_right_3_0= ruleUABitAndExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2797:1: (lv_right_3_0= ruleUABitAndExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2797:1: (lv_right_3_0= ruleUABitAndExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2798:3: lv_right_3_0= ruleUABitAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUABitXORExpressionAccess().getRightUABitAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUABitAndExpression_in_ruleUABitXORExpression6511);
            	    lv_right_3_0=ruleUABitAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUABitXORExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UABitAndExpression");
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
    // $ANTLR end "ruleUABitXORExpression"


    // $ANTLR start "entryRuleUABitAndExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2822:1: entryRuleUABitAndExpression returns [EObject current=null] : iv_ruleUABitAndExpression= ruleUABitAndExpression EOF ;
    public final EObject entryRuleUABitAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABitAndExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2823:2: (iv_ruleUABitAndExpression= ruleUABitAndExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2824:2: iv_ruleUABitAndExpression= ruleUABitAndExpression EOF
            {
             newCompositeNode(grammarAccess.getUABitAndExpressionRule()); 
            pushFollow(FOLLOW_ruleUABitAndExpression_in_entryRuleUABitAndExpression6549);
            iv_ruleUABitAndExpression=ruleUABitAndExpression();

            state._fsp--;

             current =iv_ruleUABitAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABitAndExpression6559); 

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
    // $ANTLR end "entryRuleUABitAndExpression"


    // $ANTLR start "ruleUABitAndExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2831:1: ruleUABitAndExpression returns [EObject current=null] : (this_UAEqualityExpression_0= ruleUAEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )* ) ;
    public final EObject ruleUABitAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UAEqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2834:28: ( (this_UAEqualityExpression_0= ruleUAEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2835:1: (this_UAEqualityExpression_0= ruleUAEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2835:1: (this_UAEqualityExpression_0= ruleUAEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2836:5: this_UAEqualityExpression_0= ruleUAEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUABitAndExpressionAccess().getUAEqualityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAEqualityExpression_in_ruleUABitAndExpression6606);
            this_UAEqualityExpression_0=ruleUAEqualityExpression();

            state._fsp--;

             
                    current = this_UAEqualityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2844:1: ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==41) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2844:2: ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleUAEqualityExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2844:2: ( () otherlv_2= '&' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2844:3: () otherlv_2= '&'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2844:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2845:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleUABitAndExpression6628); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUABitAndExpressionAccess().getAmpersandKeyword_1_0_1());
            	        

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2854:2: ( (lv_right_3_0= ruleUAEqualityExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2855:1: (lv_right_3_0= ruleUAEqualityExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2855:1: (lv_right_3_0= ruleUAEqualityExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2856:3: lv_right_3_0= ruleUAEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUABitAndExpressionAccess().getRightUAEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAEqualityExpression_in_ruleUABitAndExpression6650);
            	    lv_right_3_0=ruleUAEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUABitAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UAEqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleUABitAndExpression"


    // $ANTLR start "entryRuleUAEqualityExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2880:1: entryRuleUAEqualityExpression returns [EObject current=null] : iv_ruleUAEqualityExpression= ruleUAEqualityExpression EOF ;
    public final EObject entryRuleUAEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAEqualityExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2881:2: (iv_ruleUAEqualityExpression= ruleUAEqualityExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2882:2: iv_ruleUAEqualityExpression= ruleUAEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getUAEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleUAEqualityExpression_in_entryRuleUAEqualityExpression6688);
            iv_ruleUAEqualityExpression=ruleUAEqualityExpression();

            state._fsp--;

             current =iv_ruleUAEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAEqualityExpression6698); 

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
    // $ANTLR end "entryRuleUAEqualityExpression"


    // $ANTLR start "ruleUAEqualityExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2889:1: ruleUAEqualityExpression returns [EObject current=null] : (this_UAInequalityExpression_0= ruleUAInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )* ) ;
    public final EObject ruleUAEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAInequalityExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2892:28: ( (this_UAInequalityExpression_0= ruleUAInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2893:1: (this_UAInequalityExpression_0= ruleUAInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2893:1: (this_UAInequalityExpression_0= ruleUAInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2894:5: this_UAInequalityExpression_0= ruleUAInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAEqualityExpressionAccess().getUAInequalityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAInequalityExpression_in_ruleUAEqualityExpression6745);
            this_UAInequalityExpression_0=ruleUAInequalityExpression();

            state._fsp--;

             
                    current = this_UAInequalityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:1: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=63 && LA46_0<=64)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleUAInequalityExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==63) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==64) ) {
            	        alt45=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:3: ( () otherlv_2= '==' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:3: ( () otherlv_2= '==' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:4: () otherlv_2= '=='
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2902:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2903:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleUAEqualityExpression6768); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2913:6: ( () otherlv_4= '!=' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2913:6: ( () otherlv_4= '!=' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2913:7: () otherlv_4= '!='
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2913:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2914:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleUAEqualityExpression6797); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2923:3: ( (lv_right_5_0= ruleUAInequalityExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2924:1: (lv_right_5_0= ruleUAInequalityExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2924:1: (lv_right_5_0= ruleUAInequalityExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2925:3: lv_right_5_0= ruleUAInequalityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAEqualityExpressionAccess().getRightUAInequalityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAInequalityExpression_in_ruleUAEqualityExpression6820);
            	    lv_right_5_0=ruleUAInequalityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAEqualityExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"UAInequalityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "ruleUAEqualityExpression"


    // $ANTLR start "entryRuleUAInequalityExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2949:1: entryRuleUAInequalityExpression returns [EObject current=null] : iv_ruleUAInequalityExpression= ruleUAInequalityExpression EOF ;
    public final EObject entryRuleUAInequalityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAInequalityExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2950:2: (iv_ruleUAInequalityExpression= ruleUAInequalityExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2951:2: iv_ruleUAInequalityExpression= ruleUAInequalityExpression EOF
            {
             newCompositeNode(grammarAccess.getUAInequalityExpressionRule()); 
            pushFollow(FOLLOW_ruleUAInequalityExpression_in_entryRuleUAInequalityExpression6858);
            iv_ruleUAInequalityExpression=ruleUAInequalityExpression();

            state._fsp--;

             current =iv_ruleUAInequalityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAInequalityExpression6868); 

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
    // $ANTLR end "entryRuleUAInequalityExpression"


    // $ANTLR start "ruleUAInequalityExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2958:1: ruleUAInequalityExpression returns [EObject current=null] : (this_UAMinMaxExpression_0= ruleUAMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )* ) ;
    public final EObject ruleUAInequalityExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_UAMinMaxExpression_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2961:28: ( (this_UAMinMaxExpression_0= ruleUAMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2962:1: (this_UAMinMaxExpression_0= ruleUAMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2962:1: (this_UAMinMaxExpression_0= ruleUAMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2963:5: this_UAMinMaxExpression_0= ruleUAMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAInequalityExpressionAccess().getUAMinMaxExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAMinMaxExpression_in_ruleUAInequalityExpression6915);
            this_UAMinMaxExpression_0=ruleUAMinMaxExpression();

            state._fsp--;

             
                    current = this_UAMinMaxExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:1: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==25||(LA48_0>=65 && LA48_0<=67)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:2: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleUAMinMaxExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:2: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) )
            	    int alt47=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt47=3;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt47=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:3: ( () otherlv_2= '<' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:3: ( () otherlv_2= '<' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:4: () otherlv_2= '<'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2971:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2972:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleUAInequalityExpression6938); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAInequalityExpressionAccess().getLessThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2982:6: ( () otherlv_4= '<=' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2982:6: ( () otherlv_4= '<=' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2982:7: () otherlv_4= '<='
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2982:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2983:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleUAInequalityExpression6967); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAInequalityExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2993:6: ( () otherlv_6= '>=' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2993:6: ( () otherlv_6= '>=' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2993:7: () otherlv_6= '>='
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2993:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:2994:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleUAInequalityExpression6996); 

            	                	newLeafNode(otherlv_6, grammarAccess.getUAInequalityExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3004:6: ( () otherlv_8= '>' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3004:6: ( () otherlv_8= '>' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3004:7: () otherlv_8= '>'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3004:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3005:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0(),
            	                        current);
            	                

            	            }

            	            otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleUAInequalityExpression7025); 

            	                	newLeafNode(otherlv_8, grammarAccess.getUAInequalityExpressionAccess().getGreaterThanSignKeyword_1_0_3_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3014:3: ( (lv_right_9_0= ruleUAMinMaxExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3015:1: (lv_right_9_0= ruleUAMinMaxExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3015:1: (lv_right_9_0= ruleUAMinMaxExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3016:3: lv_right_9_0= ruleUAMinMaxExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAInequalityExpressionAccess().getRightUAMinMaxExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAMinMaxExpression_in_ruleUAInequalityExpression7048);
            	    lv_right_9_0=ruleUAMinMaxExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAInequalityExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"UAMinMaxExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleUAInequalityExpression"


    // $ANTLR start "entryRuleUAMinMaxExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3040:1: entryRuleUAMinMaxExpression returns [EObject current=null] : iv_ruleUAMinMaxExpression= ruleUAMinMaxExpression EOF ;
    public final EObject entryRuleUAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAMinMaxExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3041:2: (iv_ruleUAMinMaxExpression= ruleUAMinMaxExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3042:2: iv_ruleUAMinMaxExpression= ruleUAMinMaxExpression EOF
            {
             newCompositeNode(grammarAccess.getUAMinMaxExpressionRule()); 
            pushFollow(FOLLOW_ruleUAMinMaxExpression_in_entryRuleUAMinMaxExpression7086);
            iv_ruleUAMinMaxExpression=ruleUAMinMaxExpression();

            state._fsp--;

             current =iv_ruleUAMinMaxExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAMinMaxExpression7096); 

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
    // $ANTLR end "entryRuleUAMinMaxExpression"


    // $ANTLR start "ruleUAMinMaxExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3049:1: ruleUAMinMaxExpression returns [EObject current=null] : (this_UABitLeftBRightExpression_0= ruleUABitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )* ) ;
    public final EObject ruleUAMinMaxExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UABitLeftBRightExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3052:28: ( (this_UABitLeftBRightExpression_0= ruleUABitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3053:1: (this_UABitLeftBRightExpression_0= ruleUABitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3053:1: (this_UABitLeftBRightExpression_0= ruleUABitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3054:5: this_UABitLeftBRightExpression_0= ruleUABitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAMinMaxExpressionAccess().getUABitLeftBRightExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUABitLeftBRightExpression_in_ruleUAMinMaxExpression7143);
            this_UABitLeftBRightExpression_0=ruleUABitLeftBRightExpression();

            state._fsp--;

             
                    current = this_UABitLeftBRightExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:1: ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=68 && LA50_0<=69)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:2: ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleUABitLeftBRightExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:2: ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==68) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==69) ) {
            	        alt49=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:3: ( () otherlv_2= '<?' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:3: ( () otherlv_2= '<?' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:4: () otherlv_2= '<?'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3062:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3063:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleUAMinMaxExpression7166); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAMinMaxExpressionAccess().getLessThanSignQuestionMarkKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3073:6: ( () otherlv_4= '>?' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3073:6: ( () otherlv_4= '>?' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3073:7: () otherlv_4= '>?'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3073:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3074:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleUAMinMaxExpression7195); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAMinMaxExpressionAccess().getGreaterThanSignQuestionMarkKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3083:3: ( (lv_right_5_0= ruleUABitLeftBRightExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3084:1: (lv_right_5_0= ruleUABitLeftBRightExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3084:1: (lv_right_5_0= ruleUABitLeftBRightExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3085:3: lv_right_5_0= ruleUABitLeftBRightExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAMinMaxExpressionAccess().getRightUABitLeftBRightExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUABitLeftBRightExpression_in_ruleUAMinMaxExpression7218);
            	    lv_right_5_0=ruleUABitLeftBRightExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAMinMaxExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"UABitLeftBRightExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleUAMinMaxExpression"


    // $ANTLR start "entryRuleUABitLeftBRightExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3109:1: entryRuleUABitLeftBRightExpression returns [EObject current=null] : iv_ruleUABitLeftBRightExpression= ruleUABitLeftBRightExpression EOF ;
    public final EObject entryRuleUABitLeftBRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABitLeftBRightExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3110:2: (iv_ruleUABitLeftBRightExpression= ruleUABitLeftBRightExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3111:2: iv_ruleUABitLeftBRightExpression= ruleUABitLeftBRightExpression EOF
            {
             newCompositeNode(grammarAccess.getUABitLeftBRightExpressionRule()); 
            pushFollow(FOLLOW_ruleUABitLeftBRightExpression_in_entryRuleUABitLeftBRightExpression7256);
            iv_ruleUABitLeftBRightExpression=ruleUABitLeftBRightExpression();

            state._fsp--;

             current =iv_ruleUABitLeftBRightExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABitLeftBRightExpression7266); 

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
    // $ANTLR end "entryRuleUABitLeftBRightExpression"


    // $ANTLR start "ruleUABitLeftBRightExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3118:1: ruleUABitLeftBRightExpression returns [EObject current=null] : (this_UAAdditiveExpression_0= ruleUAAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )* ) ;
    public final EObject ruleUABitLeftBRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAAdditiveExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3121:28: ( (this_UAAdditiveExpression_0= ruleUAAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3122:1: (this_UAAdditiveExpression_0= ruleUAAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3122:1: (this_UAAdditiveExpression_0= ruleUAAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3123:5: this_UAAdditiveExpression_0= ruleUAAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUABitLeftBRightExpressionAccess().getUAAdditiveExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAAdditiveExpression_in_ruleUABitLeftBRightExpression7313);
            this_UAAdditiveExpression_0=ruleUAAdditiveExpression();

            state._fsp--;

             
                    current = this_UAAdditiveExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:1: ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=70 && LA52_0<=71)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:2: ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleUAAdditiveExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:2: ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==70) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==71) ) {
            	        alt51=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:3: ( () otherlv_2= '<<' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:3: ( () otherlv_2= '<<' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:4: () otherlv_2= '<<'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3131:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3132:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleUABitLeftBRightExpression7336); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUABitLeftBRightExpressionAccess().getLessThanSignLessThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3142:6: ( () otherlv_4= '>>' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3142:6: ( () otherlv_4= '>>' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3142:7: () otherlv_4= '>>'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3142:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3143:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleUABitLeftBRightExpression7365); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUABitLeftBRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3152:3: ( (lv_right_5_0= ruleUAAdditiveExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3153:1: (lv_right_5_0= ruleUAAdditiveExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3153:1: (lv_right_5_0= ruleUAAdditiveExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3154:3: lv_right_5_0= ruleUAAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUABitLeftBRightExpressionAccess().getRightUAAdditiveExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAAdditiveExpression_in_ruleUABitLeftBRightExpression7388);
            	    lv_right_5_0=ruleUAAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUABitLeftBRightExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"UAAdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleUABitLeftBRightExpression"


    // $ANTLR start "entryRuleUAAdditiveExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3178:1: entryRuleUAAdditiveExpression returns [EObject current=null] : iv_ruleUAAdditiveExpression= ruleUAAdditiveExpression EOF ;
    public final EObject entryRuleUAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAAdditiveExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3179:2: (iv_ruleUAAdditiveExpression= ruleUAAdditiveExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3180:2: iv_ruleUAAdditiveExpression= ruleUAAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getUAAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleUAAdditiveExpression_in_entryRuleUAAdditiveExpression7426);
            iv_ruleUAAdditiveExpression=ruleUAAdditiveExpression();

            state._fsp--;

             current =iv_ruleUAAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAAdditiveExpression7436); 

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
    // $ANTLR end "entryRuleUAAdditiveExpression"


    // $ANTLR start "ruleUAAdditiveExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3187:1: ruleUAAdditiveExpression returns [EObject current=null] : (this_UAMultiplicativeExpression_0= ruleUAMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleUAAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAMultiplicativeExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3190:28: ( (this_UAMultiplicativeExpression_0= ruleUAMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3191:1: (this_UAMultiplicativeExpression_0= ruleUAMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3191:1: (this_UAMultiplicativeExpression_0= ruleUAMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3192:5: this_UAMultiplicativeExpression_0= ruleUAMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAAdditiveExpressionAccess().getUAMultiplicativeExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAMultiplicativeExpression_in_ruleUAAdditiveExpression7483);
            this_UAMultiplicativeExpression_0=ruleUAMultiplicativeExpression();

            state._fsp--;

             
                    current = this_UAMultiplicativeExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=72 && LA54_0<=73)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleUAMultiplicativeExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==72) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==73) ) {
            	        alt53=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:3: ( () otherlv_2= '+' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:4: () otherlv_2= '+'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3200:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3201:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleUAAdditiveExpression7506); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAAdditiveExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3211:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3211:6: ( () otherlv_4= '-' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3211:7: () otherlv_4= '-'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3211:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3212:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleUAAdditiveExpression7535); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3221:3: ( (lv_right_5_0= ruleUAMultiplicativeExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3222:1: (lv_right_5_0= ruleUAMultiplicativeExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3222:1: (lv_right_5_0= ruleUAMultiplicativeExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3223:3: lv_right_5_0= ruleUAMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAAdditiveExpressionAccess().getRightUAMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAMultiplicativeExpression_in_ruleUAAdditiveExpression7558);
            	    lv_right_5_0=ruleUAMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAAdditiveExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"UAMultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "ruleUAAdditiveExpression"


    // $ANTLR start "entryRuleUAMultiplicativeExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3247:1: entryRuleUAMultiplicativeExpression returns [EObject current=null] : iv_ruleUAMultiplicativeExpression= ruleUAMultiplicativeExpression EOF ;
    public final EObject entryRuleUAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAMultiplicativeExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3248:2: (iv_ruleUAMultiplicativeExpression= ruleUAMultiplicativeExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3249:2: iv_ruleUAMultiplicativeExpression= ruleUAMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getUAMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleUAMultiplicativeExpression_in_entryRuleUAMultiplicativeExpression7596);
            iv_ruleUAMultiplicativeExpression=ruleUAMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleUAMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAMultiplicativeExpression7606); 

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
    // $ANTLR end "entryRuleUAMultiplicativeExpression"


    // $ANTLR start "ruleUAMultiplicativeExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3256:1: ruleUAMultiplicativeExpression returns [EObject current=null] : (this_UAPrefixExpression_0= ruleUAPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )* ) ;
    public final EObject ruleUAMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UAPrefixExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3259:28: ( (this_UAPrefixExpression_0= ruleUAPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3260:1: (this_UAPrefixExpression_0= ruleUAPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3260:1: (this_UAPrefixExpression_0= ruleUAPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3261:5: this_UAPrefixExpression_0= ruleUAPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAMultiplicativeExpressionAccess().getUAPrefixExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAPrefixExpression_in_ruleUAMultiplicativeExpression7653);
            this_UAPrefixExpression_0=ruleUAPrefixExpression();

            state._fsp--;

             
                    current = this_UAPrefixExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=74 && LA56_0<=76)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUAPrefixExpression ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt55=3;
            	    switch ( input.LA(1) ) {
            	    case 74:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case 75:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case 76:
            	        {
            	        alt55=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt55) {
            	        case 1 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:3: ( () otherlv_2= '*' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:4: () otherlv_2= '*'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3269:4: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3270:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleUAMultiplicativeExpression7676); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUAMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3280:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3280:6: ( () otherlv_4= '/' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3280:7: () otherlv_4= '/'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3280:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3281:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleUAMultiplicativeExpression7705); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUAMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3291:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3291:6: ( () otherlv_6= '%' )
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3291:7: () otherlv_6= '%'
            	            {
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3291:7: ()
            	            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3292:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleUAMultiplicativeExpression7734); 

            	                	newLeafNode(otherlv_6, grammarAccess.getUAMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3301:3: ( (lv_right_7_0= ruleUAPrefixExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3302:1: (lv_right_7_0= ruleUAPrefixExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3302:1: (lv_right_7_0= ruleUAPrefixExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3303:3: lv_right_7_0= ruleUAPrefixExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAMultiplicativeExpressionAccess().getRightUAPrefixExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAPrefixExpression_in_ruleUAMultiplicativeExpression7757);
            	    lv_right_7_0=ruleUAPrefixExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAMultiplicativeExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"UAPrefixExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleUAMultiplicativeExpression"


    // $ANTLR start "entryRuleUAPrefixExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3327:1: entryRuleUAPrefixExpression returns [EObject current=null] : iv_ruleUAPrefixExpression= ruleUAPrefixExpression EOF ;
    public final EObject entryRuleUAPrefixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAPrefixExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3328:2: (iv_ruleUAPrefixExpression= ruleUAPrefixExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3329:2: iv_ruleUAPrefixExpression= ruleUAPrefixExpression EOF
            {
             newCompositeNode(grammarAccess.getUAPrefixExpressionRule()); 
            pushFollow(FOLLOW_ruleUAPrefixExpression_in_entryRuleUAPrefixExpression7795);
            iv_ruleUAPrefixExpression=ruleUAPrefixExpression();

            state._fsp--;

             current =iv_ruleUAPrefixExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAPrefixExpression7805); 

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
    // $ANTLR end "entryRuleUAPrefixExpression"


    // $ANTLR start "ruleUAPrefixExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3336:1: ruleUAPrefixExpression returns [EObject current=null] : (this_UAUnaryExpression_0= ruleUAUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) ) ) ;
    public final EObject ruleUAPrefixExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAUnaryExpression_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3339:28: ( (this_UAUnaryExpression_0= ruleUAUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3340:1: (this_UAUnaryExpression_0= ruleUAUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3340:1: (this_UAUnaryExpression_0= ruleUAUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||LA58_0==19||LA58_0==73||LA58_0==79||(LA58_0>=81 && LA58_0<=82)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=77 && LA58_0<=78)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3341:5: this_UAUnaryExpression_0= ruleUAUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUAPrefixExpressionAccess().getUAUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAUnaryExpression_in_ruleUAPrefixExpression7852);
                    this_UAUnaryExpression_0=ruleUAUnaryExpression();

                    state._fsp--;

                     
                            current = this_UAUnaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:6: ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:6: ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:7: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleUAPrefixExpression ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:7: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==77) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==78) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:8: ( () otherlv_2= '++' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:8: ( () otherlv_2= '++' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:9: () otherlv_2= '++'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3350:9: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3351:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAPrefixExpressionAccess().getUAPreIncrementExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleUAPrefixExpression7881); 

                                	newLeafNode(otherlv_2, grammarAccess.getUAPrefixExpressionAccess().getPlusSignPlusSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3361:6: ( () otherlv_4= '--' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3361:6: ( () otherlv_4= '--' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3361:7: () otherlv_4= '--'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3361:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3362:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAPrefixExpressionAccess().getUAPreDecrementExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleUAPrefixExpression7910); 

                                	newLeafNode(otherlv_4, grammarAccess.getUAPrefixExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3371:3: ( (lv_expression_5_0= ruleUAPrefixExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3372:1: (lv_expression_5_0= ruleUAPrefixExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3372:1: (lv_expression_5_0= ruleUAPrefixExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3373:3: lv_expression_5_0= ruleUAPrefixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAPrefixExpressionAccess().getExpressionUAPrefixExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAPrefixExpression_in_ruleUAPrefixExpression7933);
                    lv_expression_5_0=ruleUAPrefixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAPrefixExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"UAPrefixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleUAPrefixExpression"


    // $ANTLR start "entryRuleUAUnaryExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3397:1: entryRuleUAUnaryExpression returns [EObject current=null] : iv_ruleUAUnaryExpression= ruleUAUnaryExpression EOF ;
    public final EObject entryRuleUAUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAUnaryExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3398:2: (iv_ruleUAUnaryExpression= ruleUAUnaryExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3399:2: iv_ruleUAUnaryExpression= ruleUAUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUAUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUAUnaryExpression_in_entryRuleUAUnaryExpression7970);
            iv_ruleUAUnaryExpression=ruleUAUnaryExpression();

            state._fsp--;

             current =iv_ruleUAUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAUnaryExpression7980); 

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
    // $ANTLR end "entryRuleUAUnaryExpression"


    // $ANTLR start "ruleUAUnaryExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3406:1: ruleUAUnaryExpression returns [EObject current=null] : (this_UAPostfixExpression_0= ruleUAPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) ) ) ;
    public final EObject ruleUAUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAPostfixExpression_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3409:28: ( (this_UAPostfixExpression_0= ruleUAPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3410:1: (this_UAPostfixExpression_0= ruleUAPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3410:1: (this_UAPostfixExpression_0= ruleUAPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_INT)||LA60_0==19||(LA60_0>=81 && LA60_0<=82)) ) {
                alt60=1;
            }
            else if ( (LA60_0==73||LA60_0==79) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3411:5: this_UAPostfixExpression_0= ruleUAPostfixExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUAUnaryExpressionAccess().getUAPostfixExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAPostfixExpression_in_ruleUAUnaryExpression8027);
                    this_UAPostfixExpression_0=ruleUAPostfixExpression();

                    state._fsp--;

                     
                            current = this_UAPostfixExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:6: ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:6: ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:7: ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleUAUnaryExpression ) )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:7: ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==79) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==73) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:8: ( () otherlv_2= '!' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:8: ( () otherlv_2= '!' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:9: () otherlv_2= '!'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3420:9: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3421:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAUnaryExpressionAccess().getUALogicNotExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleUAUnaryExpression8056); 

                                	newLeafNode(otherlv_2, grammarAccess.getUAUnaryExpressionAccess().getExclamationMarkKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3431:6: ( () otherlv_4= '-' )
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3431:6: ( () otherlv_4= '-' )
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3431:7: () otherlv_4= '-'
                            {
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3431:7: ()
                            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3432:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getUAUnaryExpressionAccess().getUAMinusExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleUAUnaryExpression8085); 

                                	newLeafNode(otherlv_4, grammarAccess.getUAUnaryExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3441:3: ( (lv_expression_5_0= ruleUAUnaryExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3442:1: (lv_expression_5_0= ruleUAUnaryExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3442:1: (lv_expression_5_0= ruleUAUnaryExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3443:3: lv_expression_5_0= ruleUAUnaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAUnaryExpressionAccess().getExpressionUAUnaryExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAUnaryExpression_in_ruleUAUnaryExpression8108);
                    lv_expression_5_0=ruleUAUnaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"UAUnaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleUAUnaryExpression"


    // $ANTLR start "entryRuleUAPostfixExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3467:1: entryRuleUAPostfixExpression returns [EObject current=null] : iv_ruleUAPostfixExpression= ruleUAPostfixExpression EOF ;
    public final EObject entryRuleUAPostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAPostfixExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3468:2: (iv_ruleUAPostfixExpression= ruleUAPostfixExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3469:2: iv_ruleUAPostfixExpression= ruleUAPostfixExpression EOF
            {
             newCompositeNode(grammarAccess.getUAPostfixExpressionRule()); 
            pushFollow(FOLLOW_ruleUAPostfixExpression_in_entryRuleUAPostfixExpression8145);
            iv_ruleUAPostfixExpression=ruleUAPostfixExpression();

            state._fsp--;

             current =iv_ruleUAPostfixExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAPostfixExpression8155); 

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
    // $ANTLR end "entryRuleUAPostfixExpression"


    // $ANTLR start "ruleUAPostfixExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3476:1: ruleUAPostfixExpression returns [EObject current=null] : (this_UAStructExpression_0= ruleUAStructExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* ) ;
    public final EObject ruleUAPostfixExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAStructExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3479:28: ( (this_UAStructExpression_0= ruleUAStructExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3480:1: (this_UAStructExpression_0= ruleUAStructExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3480:1: (this_UAStructExpression_0= ruleUAStructExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3481:5: this_UAStructExpression_0= ruleUAStructExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAPostfixExpressionAccess().getUAStructExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAStructExpression_in_ruleUAPostfixExpression8202);
            this_UAStructExpression_0=ruleUAStructExpression();

            state._fsp--;

             
                    current = this_UAStructExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3489:1: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==77) ) {
                    alt61=1;
                }
                else if ( (LA61_0==78) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3489:2: ( () otherlv_2= '++' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3489:2: ( () otherlv_2= '++' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3489:3: () otherlv_2= '++'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3489:3: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3490:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleUAPostfixExpression8224); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAPostfixExpressionAccess().getPlusSignPlusSignKeyword_1_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3500:6: ( () otherlv_4= '--' )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3500:6: ( () otherlv_4= '--' )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3500:7: () otherlv_4= '--'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3500:7: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3501:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleUAPostfixExpression8253); 

            	        	newLeafNode(otherlv_4, grammarAccess.getUAPostfixExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // $ANTLR end "ruleUAPostfixExpression"


    // $ANTLR start "entryRuleUAStructExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3518:1: entryRuleUAStructExpression returns [EObject current=null] : iv_ruleUAStructExpression= ruleUAStructExpression EOF ;
    public final EObject entryRuleUAStructExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAStructExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3519:2: (iv_ruleUAStructExpression= ruleUAStructExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3520:2: iv_ruleUAStructExpression= ruleUAStructExpression EOF
            {
             newCompositeNode(grammarAccess.getUAStructExpressionRule()); 
            pushFollow(FOLLOW_ruleUAStructExpression_in_entryRuleUAStructExpression8292);
            iv_ruleUAStructExpression=ruleUAStructExpression();

            state._fsp--;

             current =iv_ruleUAStructExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAStructExpression8302); 

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
    // $ANTLR end "entryRuleUAStructExpression"


    // $ANTLR start "ruleUAStructExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3527:1: ruleUAStructExpression returns [EObject current=null] : (this_UAArrayExpression_0= ruleUAArrayExpression ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleUAStructExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_right_3_0=null;
        EObject this_UAArrayExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3530:28: ( (this_UAArrayExpression_0= ruleUAArrayExpression ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3531:1: (this_UAArrayExpression_0= ruleUAArrayExpression ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3531:1: (this_UAArrayExpression_0= ruleUAArrayExpression ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3532:5: this_UAArrayExpression_0= ruleUAArrayExpression ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUAStructExpressionAccess().getUAArrayExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAArrayExpression_in_ruleUAStructExpression8349);
            this_UAArrayExpression_0=ruleUAArrayExpression();

            state._fsp--;

             
                    current = this_UAArrayExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3540:1: ( () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==80) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3540:2: () otherlv_2= '.' ( (lv_right_3_0= RULE_ID ) )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3540:2: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3541:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleUAStructExpression8370); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAStructExpressionAccess().getFullStopKeyword_1_1());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3550:1: ( (lv_right_3_0= RULE_ID ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3551:1: (lv_right_3_0= RULE_ID )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3551:1: (lv_right_3_0= RULE_ID )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3552:3: lv_right_3_0= RULE_ID
            	    {
            	    lv_right_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAStructExpression8387); 

            	    			newLeafNode(lv_right_3_0, grammarAccess.getUAStructExpressionAccess().getRightIDTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUAStructExpressionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleUAStructExpression"


    // $ANTLR start "entryRuleUAArrayExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3576:1: entryRuleUAArrayExpression returns [EObject current=null] : iv_ruleUAArrayExpression= ruleUAArrayExpression EOF ;
    public final EObject entryRuleUAArrayExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAArrayExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3577:2: (iv_ruleUAArrayExpression= ruleUAArrayExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3578:2: iv_ruleUAArrayExpression= ruleUAArrayExpression EOF
            {
             newCompositeNode(grammarAccess.getUAArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleUAArrayExpression_in_entryRuleUAArrayExpression8430);
            iv_ruleUAArrayExpression=ruleUAArrayExpression();

            state._fsp--;

             current =iv_ruleUAArrayExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAArrayExpression8440); 

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
    // $ANTLR end "entryRuleUAArrayExpression"


    // $ANTLR start "ruleUAArrayExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3585:1: ruleUAArrayExpression returns [EObject current=null] : (this_UAPrimaryExpression_0= ruleUAPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleUAArrayExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UAPrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3588:28: ( (this_UAPrimaryExpression_0= ruleUAPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3589:1: (this_UAPrimaryExpression_0= ruleUAPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3589:1: (this_UAPrimaryExpression_0= ruleUAPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3590:5: this_UAPrimaryExpression_0= ruleUAPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )*
            {
             
                    newCompositeNode(grammarAccess.getUAArrayExpressionAccess().getUAPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUAPrimaryExpression_in_ruleUAArrayExpression8487);
            this_UAPrimaryExpression_0=ruleUAPrimaryExpression();

            state._fsp--;

             
                    current = this_UAPrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3598:1: ( () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']' )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==26) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3598:2: () otherlv_2= '[' ( (lv_right_3_0= ruleUAExpression ) ) otherlv_4= ']'
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3598:2: ()
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3599:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUAArrayExpression8508); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUAArrayExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3608:1: ( (lv_right_3_0= ruleUAExpression ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3609:1: (lv_right_3_0= ruleUAExpression )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3609:1: (lv_right_3_0= ruleUAExpression )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3610:3: lv_right_3_0= ruleUAExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUAArrayExpressionAccess().getRightUAExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAArrayExpression8529);
            	    lv_right_3_0=ruleUAExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUAArrayExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UAExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleUAArrayExpression8541); 

            	        	newLeafNode(otherlv_4, grammarAccess.getUAArrayExpressionAccess().getRightSquareBracketKeyword_1_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // $ANTLR end "ruleUAArrayExpression"


    // $ANTLR start "entryRuleUAPrimaryExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3638:1: entryRuleUAPrimaryExpression returns [EObject current=null] : iv_ruleUAPrimaryExpression= ruleUAPrimaryExpression EOF ;
    public final EObject entryRuleUAPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAPrimaryExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3639:2: (iv_ruleUAPrimaryExpression= ruleUAPrimaryExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3640:2: iv_ruleUAPrimaryExpression= ruleUAPrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUAPrimaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUAPrimaryExpression_in_entryRuleUAPrimaryExpression8579);
            iv_ruleUAPrimaryExpression=ruleUAPrimaryExpression();

            state._fsp--;

             current =iv_ruleUAPrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAPrimaryExpression8589); 

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
    // $ANTLR end "entryRuleUAPrimaryExpression"


    // $ANTLR start "ruleUAPrimaryExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3647:1: ruleUAPrimaryExpression returns [EObject current=null] : (this_UAReference_0= ruleUAReference | this_UANumberLiteral_1= ruleUANumberLiteral | this_UABooleanLiteral_2= ruleUABooleanLiteral | this_UAParenthesizedExpression_3= ruleUAParenthesizedExpression ) ;
    public final EObject ruleUAPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UAReference_0 = null;

        EObject this_UANumberLiteral_1 = null;

        EObject this_UABooleanLiteral_2 = null;

        EObject this_UAParenthesizedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3650:28: ( (this_UAReference_0= ruleUAReference | this_UANumberLiteral_1= ruleUANumberLiteral | this_UABooleanLiteral_2= ruleUABooleanLiteral | this_UAParenthesizedExpression_3= ruleUAParenthesizedExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3651:1: (this_UAReference_0= ruleUAReference | this_UANumberLiteral_1= ruleUANumberLiteral | this_UABooleanLiteral_2= ruleUABooleanLiteral | this_UAParenthesizedExpression_3= ruleUAParenthesizedExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3651:1: (this_UAReference_0= ruleUAReference | this_UANumberLiteral_1= ruleUANumberLiteral | this_UABooleanLiteral_2= ruleUABooleanLiteral | this_UAParenthesizedExpression_3= ruleUAParenthesizedExpression )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt64=1;
                }
                break;
            case RULE_INT:
                {
                alt64=2;
                }
                break;
            case 81:
            case 82:
                {
                alt64=3;
                }
                break;
            case 19:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3652:5: this_UAReference_0= ruleUAReference
                    {
                     
                            newCompositeNode(grammarAccess.getUAPrimaryExpressionAccess().getUAReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUAReference_in_ruleUAPrimaryExpression8636);
                    this_UAReference_0=ruleUAReference();

                    state._fsp--;

                     
                            current = this_UAReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3662:5: this_UANumberLiteral_1= ruleUANumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getUAPrimaryExpressionAccess().getUANumberLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUANumberLiteral_in_ruleUAPrimaryExpression8663);
                    this_UANumberLiteral_1=ruleUANumberLiteral();

                    state._fsp--;

                     
                            current = this_UANumberLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3672:5: this_UABooleanLiteral_2= ruleUABooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getUAPrimaryExpressionAccess().getUABooleanLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUABooleanLiteral_in_ruleUAPrimaryExpression8690);
                    this_UABooleanLiteral_2=ruleUABooleanLiteral();

                    state._fsp--;

                     
                            current = this_UABooleanLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3682:5: this_UAParenthesizedExpression_3= ruleUAParenthesizedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUAPrimaryExpressionAccess().getUAParenthesizedExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUAParenthesizedExpression_in_ruleUAPrimaryExpression8717);
                    this_UAParenthesizedExpression_3=ruleUAParenthesizedExpression();

                    state._fsp--;

                     
                            current = this_UAParenthesizedExpression_3; 
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
    // $ANTLR end "ruleUAPrimaryExpression"


    // $ANTLR start "entryRuleUAReference"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3698:1: entryRuleUAReference returns [EObject current=null] : iv_ruleUAReference= ruleUAReference EOF ;
    public final EObject entryRuleUAReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAReference = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3699:2: (iv_ruleUAReference= ruleUAReference EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3700:2: iv_ruleUAReference= ruleUAReference EOF
            {
             newCompositeNode(grammarAccess.getUAReferenceRule()); 
            pushFollow(FOLLOW_ruleUAReference_in_entryRuleUAReference8752);
            iv_ruleUAReference=ruleUAReference();

            state._fsp--;

             current =iv_ruleUAReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAReference8762); 

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
    // $ANTLR end "entryRuleUAReference"


    // $ANTLR start "ruleUAReference"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3707:1: ruleUAReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUAReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3710:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3711:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3711:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3711:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3711:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAReferenceAccess().getUAReferenceAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3717:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3718:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3718:1: (lv_name_1_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUAReference8813); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUAReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUAReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleUAReference"


    // $ANTLR start "entryRuleUABooleanLiteral"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3743:1: entryRuleUABooleanLiteral returns [EObject current=null] : iv_ruleUABooleanLiteral= ruleUABooleanLiteral EOF ;
    public final EObject entryRuleUABooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUABooleanLiteral = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3744:2: (iv_ruleUABooleanLiteral= ruleUABooleanLiteral EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3745:2: iv_ruleUABooleanLiteral= ruleUABooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getUABooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleUABooleanLiteral_in_entryRuleUABooleanLiteral8854);
            iv_ruleUABooleanLiteral=ruleUABooleanLiteral();

            state._fsp--;

             current =iv_ruleUABooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUABooleanLiteral8864); 

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
    // $ANTLR end "entryRuleUABooleanLiteral"


    // $ANTLR start "ruleUABooleanLiteral"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3752:1: ruleUABooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleBOOL ) ) ) ;
    public final EObject ruleUABooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3755:28: ( ( () ( (lv_value_1_0= ruleBOOL ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3756:1: ( () ( (lv_value_1_0= ruleBOOL ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3756:1: ( () ( (lv_value_1_0= ruleBOOL ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3756:2: () ( (lv_value_1_0= ruleBOOL ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3756:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3757:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUABooleanLiteralAccess().getUABooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3762:2: ( (lv_value_1_0= ruleBOOL ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3763:1: (lv_value_1_0= ruleBOOL )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3763:1: (lv_value_1_0= ruleBOOL )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3764:3: lv_value_1_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getUABooleanLiteralAccess().getValueBOOLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleUABooleanLiteral8919);
            lv_value_1_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUABooleanLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BOOL");
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
    // $ANTLR end "ruleUABooleanLiteral"


    // $ANTLR start "entryRuleBOOL"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3788:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3789:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3790:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL8956);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL8967); 

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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3797:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3800:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3801:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3801:1: (kw= 'true' | kw= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==81) ) {
                alt65=1;
            }
            else if ( (LA65_0==82) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3802:2: kw= 'true'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleBOOL9005); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3809:2: kw= 'false'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleBOOL9024); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleUANumberLiteral"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3822:1: entryRuleUANumberLiteral returns [EObject current=null] : iv_ruleUANumberLiteral= ruleUANumberLiteral EOF ;
    public final EObject entryRuleUANumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUANumberLiteral = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3823:2: (iv_ruleUANumberLiteral= ruleUANumberLiteral EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3824:2: iv_ruleUANumberLiteral= ruleUANumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getUANumberLiteralRule()); 
            pushFollow(FOLLOW_ruleUANumberLiteral_in_entryRuleUANumberLiteral9064);
            iv_ruleUANumberLiteral=ruleUANumberLiteral();

            state._fsp--;

             current =iv_ruleUANumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUANumberLiteral9074); 

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
    // $ANTLR end "entryRuleUANumberLiteral"


    // $ANTLR start "ruleUANumberLiteral"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3831:1: ruleUANumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUANumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3834:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3835:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3835:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3835:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3835:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3836:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUANumberLiteralAccess().getUANumberLiteralAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3841:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3842:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3842:1: (lv_value_1_0= RULE_INT )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3843:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUANumberLiteral9125); 

            			newLeafNode(lv_value_1_0, grammarAccess.getUANumberLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUANumberLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleUANumberLiteral"


    // $ANTLR start "entryRuleUAParenthesizedExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3867:1: entryRuleUAParenthesizedExpression returns [EObject current=null] : iv_ruleUAParenthesizedExpression= ruleUAParenthesizedExpression EOF ;
    public final EObject entryRuleUAParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAParenthesizedExpression = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3868:2: (iv_ruleUAParenthesizedExpression= ruleUAParenthesizedExpression EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3869:2: iv_ruleUAParenthesizedExpression= ruleUAParenthesizedExpression EOF
            {
             newCompositeNode(grammarAccess.getUAParenthesizedExpressionRule()); 
            pushFollow(FOLLOW_ruleUAParenthesizedExpression_in_entryRuleUAParenthesizedExpression9166);
            iv_ruleUAParenthesizedExpression=ruleUAParenthesizedExpression();

            state._fsp--;

             current =iv_ruleUAParenthesizedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAParenthesizedExpression9176); 

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
    // $ANTLR end "entryRuleUAParenthesizedExpression"


    // $ANTLR start "ruleUAParenthesizedExpression"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3876:1: ruleUAParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_UAExpression_1= ruleUAExpression otherlv_2= ')' ) ;
    public final EObject ruleUAParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_UAExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3879:28: ( (otherlv_0= '(' this_UAExpression_1= ruleUAExpression otherlv_2= ')' ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3880:1: (otherlv_0= '(' this_UAExpression_1= ruleUAExpression otherlv_2= ')' )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3880:1: (otherlv_0= '(' this_UAExpression_1= ruleUAExpression otherlv_2= ')' )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3880:3: otherlv_0= '(' this_UAExpression_1= ruleUAExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUAParenthesizedExpression9213); 

                	newLeafNode(otherlv_0, grammarAccess.getUAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getUAParenthesizedExpressionAccess().getUAExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUAParenthesizedExpression9235);
            this_UAExpression_1=ruleUAExpression();

            state._fsp--;

             
                    current = this_UAExpression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleUAParenthesizedExpression9246); 

                	newLeafNode(otherlv_2, grammarAccess.getUAParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleUAParenthesizedExpression"


    // $ANTLR start "entryRuleUASelectList"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3905:1: entryRuleUASelectList returns [EObject current=null] : iv_ruleUASelectList= ruleUASelectList EOF ;
    public final EObject entryRuleUASelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASelectList = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3906:2: (iv_ruleUASelectList= ruleUASelectList EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3907:2: iv_ruleUASelectList= ruleUASelectList EOF
            {
             newCompositeNode(grammarAccess.getUASelectListRule()); 
            pushFollow(FOLLOW_ruleUASelectList_in_entryRuleUASelectList9282);
            iv_ruleUASelectList=ruleUASelectList();

            state._fsp--;

             current =iv_ruleUASelectList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASelectList9292); 

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
    // $ANTLR end "entryRuleUASelectList"


    // $ANTLR start "ruleUASelectList"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3914:1: ruleUASelectList returns [EObject current=null] : ( ( (lv_selects_0_0= ruleUASelect ) ) (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )* ) ;
    public final EObject ruleUASelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selects_0_0 = null;

        EObject lv_selects_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3917:28: ( ( ( (lv_selects_0_0= ruleUASelect ) ) (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )* ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3918:1: ( ( (lv_selects_0_0= ruleUASelect ) ) (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )* )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3918:1: ( ( (lv_selects_0_0= ruleUASelect ) ) (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )* )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3918:2: ( (lv_selects_0_0= ruleUASelect ) ) (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )*
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3918:2: ( (lv_selects_0_0= ruleUASelect ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3919:1: (lv_selects_0_0= ruleUASelect )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3919:1: (lv_selects_0_0= ruleUASelect )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3920:3: lv_selects_0_0= ruleUASelect
            {
             
            	        newCompositeNode(grammarAccess.getUASelectListAccess().getSelectsUASelectParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUASelect_in_ruleUASelectList9338);
            lv_selects_0_0=ruleUASelect();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASelectListRule());
            	        }
                   		add(
                   			current, 
                   			"selects",
                    		lv_selects_0_0, 
                    		"UASelect");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3936:2: (otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==23) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3936:4: otherlv_1= ',' ( (lv_selects_2_0= ruleUASelect ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUASelectList9351); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUASelectListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3940:1: ( (lv_selects_2_0= ruleUASelect ) )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3941:1: (lv_selects_2_0= ruleUASelect )
            	    {
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3941:1: (lv_selects_2_0= ruleUASelect )
            	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3942:3: lv_selects_2_0= ruleUASelect
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUASelectListAccess().getSelectsUASelectParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUASelect_in_ruleUASelectList9372);
            	    lv_selects_2_0=ruleUASelect();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUASelectListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selects",
            	            		lv_selects_2_0, 
            	            		"UASelect");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // $ANTLR end "ruleUASelectList"


    // $ANTLR start "entryRuleUASelect"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3966:1: entryRuleUASelect returns [EObject current=null] : iv_ruleUASelect= ruleUASelect EOF ;
    public final EObject entryRuleUASelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASelect = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3967:2: (iv_ruleUASelect= ruleUASelect EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3968:2: iv_ruleUASelect= ruleUASelect EOF
            {
             newCompositeNode(grammarAccess.getUASelectRule()); 
            pushFollow(FOLLOW_ruleUASelect_in_entryRuleUASelect9410);
            iv_ruleUASelect=ruleUASelect();

            state._fsp--;

             current =iv_ruleUASelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASelect9420); 

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
    // $ANTLR end "entryRuleUASelect"


    // $ANTLR start "ruleUASelect"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3975:1: ruleUASelect returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUAType ) ) ) ;
    public final EObject ruleUASelect() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3978:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUAType ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3979:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUAType ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3979:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUAType ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3979:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleUAType ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3979:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3980:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3980:1: (lv_name_0_0= RULE_ID )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:3981:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUASelect9462); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUASelectAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUASelectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleUASelect9479); 

                	newLeafNode(otherlv_1, grammarAccess.getUASelectAccess().getColonKeyword_1());
                
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4001:1: ( (lv_type_2_0= ruleUAType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4002:1: (lv_type_2_0= ruleUAType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4002:1: (lv_type_2_0= ruleUAType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4003:3: lv_type_2_0= ruleUAType
            {
             
            	        newCompositeNode(grammarAccess.getUASelectAccess().getTypeUATypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUAType_in_ruleUASelect9500);
            lv_type_2_0=ruleUAType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASelectRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"UAType");
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
    // $ANTLR end "ruleUASelect"


    // $ANTLR start "entryRuleUAUpdate"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4027:1: entryRuleUAUpdate returns [EObject current=null] : iv_ruleUAUpdate= ruleUAUpdate EOF ;
    public final EObject entryRuleUAUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUAUpdate = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4028:2: (iv_ruleUAUpdate= ruleUAUpdate EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4029:2: iv_ruleUAUpdate= ruleUAUpdate EOF
            {
             newCompositeNode(grammarAccess.getUAUpdateRule()); 
            pushFollow(FOLLOW_ruleUAUpdate_in_entryRuleUAUpdate9536);
            iv_ruleUAUpdate=ruleUAUpdate();

            state._fsp--;

             current =iv_ruleUAUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUAUpdate9546); 

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
    // $ANTLR end "entryRuleUAUpdate"


    // $ANTLR start "ruleUAUpdate"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4036:1: ruleUAUpdate returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )? ) ;
    public final EObject ruleUAUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4039:28: ( ( () ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )? ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4040:1: ( () ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )? )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4040:1: ( () ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )? )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4040:2: () ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )?
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4040:2: ()
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4041:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUAUpdateAccess().getUAUpdateAction_0(),
                        current);
                

            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4046:2: ( ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||LA68_0==19||(LA68_0>=42 && LA68_0<=43)||LA68_0==73||(LA68_0>=77 && LA68_0<=79)||(LA68_0>=81 && LA68_0<=82)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4046:3: ( (lv_expressions_1_0= ruleUAExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )*
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4046:3: ( (lv_expressions_1_0= ruleUAExpression ) )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4047:1: (lv_expressions_1_0= ruleUAExpression )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4047:1: (lv_expressions_1_0= ruleUAExpression )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4048:3: lv_expressions_1_0= ruleUAExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUAUpdateAccess().getExpressionsUAExpressionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAUpdate9602);
                    lv_expressions_1_0=ruleUAExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUAUpdateRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_1_0, 
                            		"UAExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4064:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==23) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4064:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleUAExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUAUpdate9615); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getUAUpdateAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4068:1: ( (lv_expressions_3_0= ruleUAExpression ) )
                    	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4069:1: (lv_expressions_3_0= ruleUAExpression )
                    	    {
                    	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4069:1: (lv_expressions_3_0= ruleUAExpression )
                    	    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4070:3: lv_expressions_3_0= ruleUAExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUAUpdateAccess().getExpressionsUAExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUAExpression_in_ruleUAUpdate9636);
                    	    lv_expressions_3_0=ruleUAExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUAUpdateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_3_0, 
                    	            		"UAExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


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
    // $ANTLR end "ruleUAUpdate"


    // $ANTLR start "entryRuleUASynchronisation"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4094:1: entryRuleUASynchronisation returns [EObject current=null] : iv_ruleUASynchronisation= ruleUASynchronisation EOF ;
    public final EObject entryRuleUASynchronisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUASynchronisation = null;


        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4095:2: (iv_ruleUASynchronisation= ruleUASynchronisation EOF )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4096:2: iv_ruleUASynchronisation= ruleUASynchronisation EOF
            {
             newCompositeNode(grammarAccess.getUASynchronisationRule()); 
            pushFollow(FOLLOW_ruleUASynchronisation_in_entryRuleUASynchronisation9676);
            iv_ruleUASynchronisation=ruleUASynchronisation();

            state._fsp--;

             current =iv_ruleUASynchronisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUASynchronisation9686); 

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
    // $ANTLR end "entryRuleUASynchronisation"


    // $ANTLR start "ruleUASynchronisation"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4103:1: ruleUASynchronisation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleUAExpression ) ) ( (lv_type_1_0= ruleUASynchronisationType ) ) ) ;
    public final EObject ruleUASynchronisation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4106:28: ( ( ( (lv_expression_0_0= ruleUAExpression ) ) ( (lv_type_1_0= ruleUASynchronisationType ) ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4107:1: ( ( (lv_expression_0_0= ruleUAExpression ) ) ( (lv_type_1_0= ruleUASynchronisationType ) ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4107:1: ( ( (lv_expression_0_0= ruleUAExpression ) ) ( (lv_type_1_0= ruleUASynchronisationType ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4107:2: ( (lv_expression_0_0= ruleUAExpression ) ) ( (lv_type_1_0= ruleUASynchronisationType ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4107:2: ( (lv_expression_0_0= ruleUAExpression ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4108:1: (lv_expression_0_0= ruleUAExpression )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4108:1: (lv_expression_0_0= ruleUAExpression )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4109:3: lv_expression_0_0= ruleUAExpression
            {
             
            	        newCompositeNode(grammarAccess.getUASynchronisationAccess().getExpressionUAExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUAExpression_in_ruleUASynchronisation9732);
            lv_expression_0_0=ruleUAExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASynchronisationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"UAExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4125:2: ( (lv_type_1_0= ruleUASynchronisationType ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4126:1: (lv_type_1_0= ruleUASynchronisationType )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4126:1: (lv_type_1_0= ruleUASynchronisationType )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4127:3: lv_type_1_0= ruleUASynchronisationType
            {
             
            	        newCompositeNode(grammarAccess.getUASynchronisationAccess().getTypeUASynchronisationTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUASynchronisationType_in_ruleUASynchronisation9753);
            lv_type_1_0=ruleUASynchronisationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUASynchronisationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"UASynchronisationType");
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
    // $ANTLR end "ruleUASynchronisation"


    // $ANTLR start "ruleUASynchronisationType"
    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4151:1: ruleUASynchronisationType returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleUASynchronisationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4153:28: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4154:1: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4154:1: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==79) ) {
                alt69=1;
            }
            else if ( (LA69_0==58) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4154:2: (enumLiteral_0= '!' )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4154:2: (enumLiteral_0= '!' )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4154:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleUASynchronisationType9803); 

                            current = grammarAccess.getUASynchronisationTypeAccess().getEMISSIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUASynchronisationTypeAccess().getEMISSIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4160:6: (enumLiteral_1= '?' )
                    {
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4160:6: (enumLiteral_1= '?' )
                    // ../org.uppaal.xml.description/src-gen/org/uppaal/xml/description/parser/antlr/internal/InternalDescription.g:4160:8: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleUASynchronisationType9820); 

                            current = grammarAccess.getUASynchronisationTypeAccess().getRECEPTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUASynchronisationTypeAccess().getRECEPTIONEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleUASynchronisationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTop_in_entryRuleTop75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTop85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTop123 = new BitSet(new long[]{0x000001FCF1000010L});
    public static final BitSet FOLLOW_ruleUASystemDefinition_in_ruleTop145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTop164 = new BitSet(new long[]{0x000001FCF0000010L});
    public static final BitSet FOLLOW_ruleUADeclarations_in_ruleTop186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTop205 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAParameters_in_ruleTop227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTop246 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleTop268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTop287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUASelectList_in_ruleTop309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTop328 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAUpdate_in_ruleTop350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTop369 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUASynchronisation_in_ruleTop391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASystemDefinition_in_entryRuleUASystemDefinition427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASystemDefinition437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADefinition_in_ruleUASystemDefinition493 = new BitSet(new long[]{0x000001FCF1040012L});
    public static final BitSet FOLLOW_18_in_ruleUASystemDefinition506 = new BitSet(new long[]{0x000001FCF1000012L});
    public static final BitSet FOLLOW_ruleUASystem_in_ruleUASystemDefinition532 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUASystemDefinition545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADefinition_in_entryRuleUADefinition585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUADefinition595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADeclaration_in_ruleUADefinition642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAInstantiation_in_ruleUADefinition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAInstantiation_in_entryRuleUAInstantiation704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAInstantiation714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAInstantiation756 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_19_in_ruleUAInstantiation774 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAParameters_in_ruleUAInstantiation795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUAInstantiation807 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleUAInstantiation822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleUAInstantiation840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAInstantiation858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUAInstantiation875 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAInstantiation896 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleUAInstantiation909 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAInstantiation930 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleUAInstantiation944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASystem_in_entryRuleUASystem980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASystem990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUASystem1027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUASystemID_in_ruleUASystem1048 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_23_in_ruleUASystem1062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25_in_ruleUASystem1080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUASystemID_in_ruleUASystem1102 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_ruleUASystemID_in_entryRuleUASystemID1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASystemID1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUASystemID1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAArrayDeclaration_in_entryRuleUAArrayDeclaration1231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAArrayDeclaration1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUAArrayDeclaration1278 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAArrayDeclaration1299 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUAArrayDeclaration1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADeclarations_in_entryRuleUADeclarations1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUADeclarations1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADeclaration_in_ruleUADeclarations1403 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUADeclarations1416 = new BitSet(new long[]{0x000001FCF0000010L});
    public static final BitSet FOLLOW_ruleUADeclaration_in_ruleUADeclarations1437 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleUADeclarations1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUADeclaration_in_entryRuleUADeclaration1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUADeclaration1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAVariableDeclaration_in_ruleUADeclaration1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUATypeDeclaration_in_ruleUADeclaration1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAType_in_entryRuleUAType1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAType1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUATypeModifiers_in_ruleUAType1665 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUATypeIdentifier_in_ruleUAType1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUATypeModifiers_in_entryRuleUATypeModifiers1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUATypeModifiers1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUATypeModifiers1829 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_29_in_ruleUATypeModifiers1914 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_30_in_ruleUATypeModifiers1999 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_31_in_ruleUATypeModifiers2084 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleUAVariableDeclaration_in_entryRuleUAVariableDeclaration2173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAVariableDeclaration2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUAVariableDeclaration2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUAVariableID_in_ruleUAVariableDeclaration2250 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUAVariableDeclaration2263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUAVariableID_in_ruleUAVariableDeclaration2284 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUAVariableID_in_entryRuleUAVariableID2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAVariableID2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAVariableID2374 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_ruleUAArrayDeclaration_in_ruleUAVariableID2400 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_22_in_ruleUAVariableID2414 = new BitSet(new long[]{0x00000C0100080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAInitialiser_in_ruleUAVariableID2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAInitialiser_in_entryRuleUAInitialiser2473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAInitialiser2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASingleInitialiser_in_ruleUAInitialiser2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAMultiInitialiser_in_ruleUAInitialiser2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASingleInitialiser_in_entryRuleUASingleInitialiser2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASingleInitialiser2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUASingleInitialiser2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAMultiInitialiser_in_entryRuleUAMultiInitialiser2682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAMultiInitialiser2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUAMultiInitialiser2729 = new BitSet(new long[]{0x00000C0100080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAInitialiser_in_ruleUAMultiInitialiser2750 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_ruleUAMultiInitialiser2763 = new BitSet(new long[]{0x00000C0100080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAInitialiser_in_ruleUAMultiInitialiser2784 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_ruleUAMultiInitialiser2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUATypeDeclaration_in_entryRuleUATypeDeclaration2834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUATypeDeclaration2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUATypeDeclaration2881 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUATypeDeclaration2902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUATypeID_in_ruleUATypeDeclaration2923 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUATypeDeclaration2936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUATypeID_in_ruleUATypeDeclaration2957 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUATypeID_in_entryRuleUATypeID2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUATypeID3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUATypeID3047 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAArrayDeclaration_in_ruleUATypeID3073 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUATypeIdentifier_in_entryRuleUATypeIdentifier3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUATypeIdentifier3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAIntegerType_in_ruleUATypeIdentifier3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAClockType_in_ruleUATypeIdentifier3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAChannelType_in_ruleUATypeIdentifier3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABooleanType_in_ruleUATypeIdentifier3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAScalarType_in_ruleUATypeIdentifier3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAStructType_in_ruleUATypeIdentifier3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUATypeIdentifier3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAIntegerType_in_entryRuleUAIntegerType3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAIntegerType3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUAIntegerType3432 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleUAIntegerType3445 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAIntegerType3466 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUAIntegerType3478 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAIntegerType3499 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUAIntegerType3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAClockType_in_entryRuleUAClockType3549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAClockType3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUAClockType3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAChannelType_in_entryRuleUAChannelType3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAChannelType3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUAChannelType3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABooleanType_in_entryRuleUABooleanType3733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABooleanType3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUABooleanType3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAScalarType_in_entryRuleUAScalarType3825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAScalarType3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUAScalarType3881 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUAScalarType3893 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAScalarType3914 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUAScalarType3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAStructType_in_entryRuleUAStructType3962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAStructType3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUAStructType4018 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleUAStructType4030 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAFieldDeclaration_in_ruleUAStructType4051 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_18_in_ruleUAStructType4064 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAFieldDeclaration_in_ruleUAStructType4085 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_18_in_ruleUAStructType4100 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleUAStructType4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAFieldDeclaration_in_entryRuleUAFieldDeclaration4150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAFieldDeclaration4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUAFieldDeclaration4206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUAFieldID_in_ruleUAFieldDeclaration4227 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUAFieldDeclaration4240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUAFieldID_in_ruleUAFieldDeclaration4261 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUAFieldID_in_entryRuleUAFieldID4299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAFieldID4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAFieldID4351 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAArrayDeclaration_in_ruleUAFieldID4377 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAParameters_in_entryRuleUAParameters4414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAParameters4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAParameter_in_ruleUAParameters4470 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUAParameters4483 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAParameter_in_ruleUAParameters4504 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUAParameter_in_entryRuleUAParameter4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAParameter4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUAParameter4598 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleUAParameter4616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAParameter4647 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAArrayDeclaration_in_ruleUAParameter4673 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAExpression_in_entryRuleUAExpression4710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAExpression4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAImplyLogicOrExpression_in_ruleUAExpression4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleUAExpression4796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_43_in_ruleUAExpression4825 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUAExpression4839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAExpression4856 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUAExpression4873 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUAExpression4894 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUAExpression4906 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAExpression4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAImplyLogicOrExpression_in_entryRuleUAImplyLogicOrExpression4964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAImplyLogicOrExpression4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression1_in_ruleUAImplyLogicOrExpression5021 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleUAImplyLogicOrExpression5044 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_46_in_ruleUAImplyLogicOrExpression5073 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression1_in_ruleUAImplyLogicOrExpression5096 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression1_in_entryRuleUALogicAndExpression15134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUALogicAndExpression15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUALogicNotExpression1_in_ruleUALogicAndExpression15191 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleUALogicAndExpression15213 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUALogicNotExpression1_in_ruleUALogicAndExpression15235 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleUALogicNotExpression1_in_entryRuleUALogicNotExpression15273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUALogicNotExpression15283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAAssignmentExpression_in_ruleUALogicNotExpression15329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAAssignmentExpression_in_entryRuleUAAssignmentExpression5363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAAssignmentExpression5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAConditionalExpression_in_ruleUAAssignmentExpression5420 = new BitSet(new long[]{0x03FF000000600002L});
    public static final BitSet FOLLOW_22_in_ruleUAAssignmentExpression5443 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_21_in_ruleUAAssignmentExpression5472 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_48_in_ruleUAAssignmentExpression5501 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_49_in_ruleUAAssignmentExpression5530 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_50_in_ruleUAAssignmentExpression5559 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_51_in_ruleUAAssignmentExpression5588 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_52_in_ruleUAAssignmentExpression5617 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_53_in_ruleUAAssignmentExpression5646 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_54_in_ruleUAAssignmentExpression5675 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_55_in_ruleUAAssignmentExpression5704 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_56_in_ruleUAAssignmentExpression5733 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_57_in_ruleUAAssignmentExpression5762 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAAssignmentExpression_in_ruleUAAssignmentExpression5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAConditionalExpression_in_entryRuleUAConditionalExpression5823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAConditionalExpression5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUALogicOrExpression2_in_ruleUAConditionalExpression5880 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUAConditionalExpression5901 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUALogicOrExpression2_in_ruleUAConditionalExpression5922 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUAConditionalExpression5934 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAConditionalExpression_in_ruleUAConditionalExpression5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUALogicOrExpression2_in_entryRuleUALogicOrExpression25993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUALogicOrExpression26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression2_in_ruleUALogicOrExpression26050 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUALogicOrExpression26072 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression2_in_ruleUALogicOrExpression26094 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleUALogicAndExpression2_in_entryRuleUALogicAndExpression26132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUALogicAndExpression26142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABitOrExpression_in_ruleUALogicAndExpression26189 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUALogicAndExpression26211 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUABitOrExpression_in_ruleUALogicAndExpression26233 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleUABitOrExpression_in_entryRuleUABitOrExpression6271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABitOrExpression6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABitXORExpression_in_ruleUABitOrExpression6328 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUABitOrExpression6350 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUABitXORExpression_in_ruleUABitOrExpression6372 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleUABitXORExpression_in_entryRuleUABitXORExpression6410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABitXORExpression6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABitAndExpression_in_ruleUABitXORExpression6467 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleUABitXORExpression6489 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUABitAndExpression_in_ruleUABitXORExpression6511 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleUABitAndExpression_in_entryRuleUABitAndExpression6549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABitAndExpression6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAEqualityExpression_in_ruleUABitAndExpression6606 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleUABitAndExpression6628 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAEqualityExpression_in_ruleUABitAndExpression6650 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleUAEqualityExpression_in_entryRuleUAEqualityExpression6688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAEqualityExpression6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAInequalityExpression_in_ruleUAEqualityExpression6745 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleUAEqualityExpression6768 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_64_in_ruleUAEqualityExpression6797 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAInequalityExpression_in_ruleUAEqualityExpression6820 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUAInequalityExpression_in_entryRuleUAInequalityExpression6858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAInequalityExpression6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAMinMaxExpression_in_ruleUAInequalityExpression6915 = new BitSet(new long[]{0x0000000002000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_25_in_ruleUAInequalityExpression6938 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_65_in_ruleUAInequalityExpression6967 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_66_in_ruleUAInequalityExpression6996 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_67_in_ruleUAInequalityExpression7025 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAMinMaxExpression_in_ruleUAInequalityExpression7048 = new BitSet(new long[]{0x0000000002000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleUAMinMaxExpression_in_entryRuleUAMinMaxExpression7086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAMinMaxExpression7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABitLeftBRightExpression_in_ruleUAMinMaxExpression7143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleUAMinMaxExpression7166 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_69_in_ruleUAMinMaxExpression7195 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUABitLeftBRightExpression_in_ruleUAMinMaxExpression7218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleUABitLeftBRightExpression_in_entryRuleUABitLeftBRightExpression7256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABitLeftBRightExpression7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAAdditiveExpression_in_ruleUABitLeftBRightExpression7313 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleUABitLeftBRightExpression7336 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_71_in_ruleUABitLeftBRightExpression7365 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAAdditiveExpression_in_ruleUABitLeftBRightExpression7388 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleUAAdditiveExpression_in_entryRuleUAAdditiveExpression7426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAAdditiveExpression7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAMultiplicativeExpression_in_ruleUAAdditiveExpression7483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleUAAdditiveExpression7506 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_73_in_ruleUAAdditiveExpression7535 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAMultiplicativeExpression_in_ruleUAAdditiveExpression7558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleUAMultiplicativeExpression_in_entryRuleUAMultiplicativeExpression7596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAMultiplicativeExpression7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAPrefixExpression_in_ruleUAMultiplicativeExpression7653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_74_in_ruleUAMultiplicativeExpression7676 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_75_in_ruleUAMultiplicativeExpression7705 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_76_in_ruleUAMultiplicativeExpression7734 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAPrefixExpression_in_ruleUAMultiplicativeExpression7757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleUAPrefixExpression_in_entryRuleUAPrefixExpression7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAPrefixExpression7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAUnaryExpression_in_ruleUAPrefixExpression7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUAPrefixExpression7881 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_78_in_ruleUAPrefixExpression7910 = new BitSet(new long[]{0x0000000000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAPrefixExpression_in_ruleUAPrefixExpression7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAUnaryExpression_in_entryRuleUAUnaryExpression7970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAUnaryExpression7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAPostfixExpression_in_ruleUAUnaryExpression8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUAUnaryExpression8056 = new BitSet(new long[]{0x0000000000080030L,0x0000000000068200L});
    public static final BitSet FOLLOW_73_in_ruleUAUnaryExpression8085 = new BitSet(new long[]{0x0000000000080030L,0x0000000000068200L});
    public static final BitSet FOLLOW_ruleUAUnaryExpression_in_ruleUAUnaryExpression8108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAPostfixExpression_in_entryRuleUAPostfixExpression8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAPostfixExpression8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAStructExpression_in_ruleUAPostfixExpression8202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleUAPostfixExpression8224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_78_in_ruleUAPostfixExpression8253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleUAStructExpression_in_entryRuleUAStructExpression8292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAStructExpression8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAArrayExpression_in_ruleUAStructExpression8349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleUAStructExpression8370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAStructExpression8387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleUAArrayExpression_in_entryRuleUAArrayExpression8430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAArrayExpression8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAPrimaryExpression_in_ruleUAArrayExpression8487 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleUAArrayExpression8508 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAArrayExpression8529 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUAArrayExpression8541 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleUAPrimaryExpression_in_entryRuleUAPrimaryExpression8579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAPrimaryExpression8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAReference_in_ruleUAPrimaryExpression8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUANumberLiteral_in_ruleUAPrimaryExpression8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABooleanLiteral_in_ruleUAPrimaryExpression8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAParenthesizedExpression_in_ruleUAPrimaryExpression8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAReference_in_entryRuleUAReference8752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAReference8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUAReference8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUABooleanLiteral_in_entryRuleUABooleanLiteral8854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUABooleanLiteral8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleUABooleanLiteral8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL8956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleBOOL9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBOOL9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUANumberLiteral_in_entryRuleUANumberLiteral9064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUANumberLiteral9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUANumberLiteral9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAParenthesizedExpression_in_entryRuleUAParenthesizedExpression9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAParenthesizedExpression9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUAParenthesizedExpression9213 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAParenthesizedExpression9235 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUAParenthesizedExpression9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASelectList_in_entryRuleUASelectList9282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASelectList9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUASelect_in_ruleUASelectList9338 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUASelectList9351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUASelect_in_ruleUASelectList9372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUASelect_in_entryRuleUASelect9410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASelect9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUASelect9462 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUASelect9479 = new BitSet(new long[]{0x000001F8F0000010L});
    public static final BitSet FOLLOW_ruleUAType_in_ruleUASelect9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAUpdate_in_entryRuleUAUpdate9536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUAUpdate9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAUpdate9602 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUAUpdate9615 = new BitSet(new long[]{0x00000C0000080030L,0x000000000006E200L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUAUpdate9636 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUASynchronisation_in_entryRuleUASynchronisation9676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUASynchronisation9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUAExpression_in_ruleUASynchronisation9732 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleUASynchronisationType_in_ruleUASynchronisation9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUASynchronisationType9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUASynchronisationType9820 = new BitSet(new long[]{0x0000000000000002L});

}
