package dk.itu.ecdar.text.parser.antlr.internal; 

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
import dk.itu.ecdar.text.services.EcdarTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcdarTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'['", "']'", "';'", "'urgent'", "'meta'", "'const'", "','", "'!'", "'?'", "'='", "'{'", "'}'", "'typedef'", "'int'", "'clock'", "'action'", "'input'", "'output'", "'bool'", "'scalar'", "'struct'", "'||'", "'&&'", "'|'", "'('", "')'", "'let'", "'spec'", "'template'", "'initial'", "'universal'", "'invariant'", "'controllable'", "'foreach'", "':'", "'if'", "'goto'", "'forall'", "'exists'", "'imply'", "'or'", "'and'", "':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'^'", "'&'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'<?'", "'>?'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'true'", "'false'"
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
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
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


        public InternalEcdarTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEcdarTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEcdarTextParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g"; }



     	private EcdarTextGrammarAccess grammarAccess;
     	
        public InternalEcdarTextParser(TokenStream input, EcdarTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ETFile";	
       	}
       	
       	@Override
       	protected EcdarTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleETFile"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:68:1: entryRuleETFile returns [EObject current=null] : iv_ruleETFile= ruleETFile EOF ;
    public final EObject entryRuleETFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETFile = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:69:2: (iv_ruleETFile= ruleETFile EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:70:2: iv_ruleETFile= ruleETFile EOF
            {
             newCompositeNode(grammarAccess.getETFileRule()); 
            pushFollow(FOLLOW_ruleETFile_in_entryRuleETFile75);
            iv_ruleETFile=ruleETFile();

            state._fsp--;

             current =iv_ruleETFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETFile85); 

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
    // $ANTLR end "entryRuleETFile"


    // $ANTLR start "ruleETFile"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:77:1: ruleETFile returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleETImport ) )* ( (lv_declarations_2_0= ruleETDeclarations ) ) ( (lv_specifications_3_0= ruleETSpecification ) )* ) ;
    public final EObject ruleETFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_declarations_2_0 = null;

        EObject lv_specifications_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:80:28: ( ( () ( (lv_imports_1_0= ruleETImport ) )* ( (lv_declarations_2_0= ruleETDeclarations ) ) ( (lv_specifications_3_0= ruleETSpecification ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:81:1: ( () ( (lv_imports_1_0= ruleETImport ) )* ( (lv_declarations_2_0= ruleETDeclarations ) ) ( (lv_specifications_3_0= ruleETSpecification ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:81:1: ( () ( (lv_imports_1_0= ruleETImport ) )* ( (lv_declarations_2_0= ruleETDeclarations ) ) ( (lv_specifications_3_0= ruleETSpecification ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:81:2: () ( (lv_imports_1_0= ruleETImport ) )* ( (lv_declarations_2_0= ruleETDeclarations ) ) ( (lv_specifications_3_0= ruleETSpecification ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:81:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETFileAccess().getETFileAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:87:2: ( (lv_imports_1_0= ruleETImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:88:1: (lv_imports_1_0= ruleETImport )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:88:1: (lv_imports_1_0= ruleETImport )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:89:3: lv_imports_1_0= ruleETImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETFileAccess().getImportsETImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETImport_in_ruleETFile140);
            	    lv_imports_1_0=ruleETImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"ETImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:105:3: ( (lv_declarations_2_0= ruleETDeclarations ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:106:1: (lv_declarations_2_0= ruleETDeclarations )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:106:1: (lv_declarations_2_0= ruleETDeclarations )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:107:3: lv_declarations_2_0= ruleETDeclarations
            {
             
            	        newCompositeNode(grammarAccess.getETFileAccess().getDeclarationsETDeclarationsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETDeclarations_in_ruleETFile162);
            lv_declarations_2_0=ruleETDeclarations();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETFileRule());
            	        }
                   		set(
                   			current, 
                   			"declarations",
                    		lv_declarations_2_0, 
                    		"ETDeclarations");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:123:2: ( (lv_specifications_3_0= ruleETSpecification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=38 && LA2_0<=40)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:124:1: (lv_specifications_3_0= ruleETSpecification )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:124:1: (lv_specifications_3_0= ruleETSpecification )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:125:3: lv_specifications_3_0= ruleETSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETFileAccess().getSpecificationsETSpecificationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETSpecification_in_ruleETFile183);
            	    lv_specifications_3_0=ruleETSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"specifications",
            	            		lv_specifications_3_0, 
            	            		"ETSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleETFile"


    // $ANTLR start "entryRuleETImport"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:149:1: entryRuleETImport returns [EObject current=null] : iv_ruleETImport= ruleETImport EOF ;
    public final EObject entryRuleETImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETImport = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:150:2: (iv_ruleETImport= ruleETImport EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:151:2: iv_ruleETImport= ruleETImport EOF
            {
             newCompositeNode(grammarAccess.getETImportRule()); 
            pushFollow(FOLLOW_ruleETImport_in_entryRuleETImport220);
            iv_ruleETImport=ruleETImport();

            state._fsp--;

             current =iv_ruleETImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETImport230); 

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
    // $ANTLR end "entryRuleETImport"


    // $ANTLR start "ruleETImport"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:158:1: ruleETImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) ) ;
    public final EObject ruleETImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedNamespace_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:161:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:162:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:162:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:162:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleETImport267); 

                	newLeafNode(otherlv_0, grammarAccess.getETImportAccess().getImportKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:166:1: ( (lv_importedNamespace_1_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:167:1: (lv_importedNamespace_1_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:167:1: (lv_importedNamespace_1_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:168:3: lv_importedNamespace_1_0= RULE_ID
            {
            lv_importedNamespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETImport284); 

            			newLeafNode(lv_importedNamespace_1_0, grammarAccess.getETImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
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
    // $ANTLR end "ruleETImport"


    // $ANTLR start "entryRuleETArrayDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:192:1: entryRuleETArrayDeclaration returns [EObject current=null] : iv_ruleETArrayDeclaration= ruleETArrayDeclaration EOF ;
    public final EObject entryRuleETArrayDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETArrayDeclaration = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:193:2: (iv_ruleETArrayDeclaration= ruleETArrayDeclaration EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:194:2: iv_ruleETArrayDeclaration= ruleETArrayDeclaration EOF
            {
             newCompositeNode(grammarAccess.getETArrayDeclarationRule()); 
            pushFollow(FOLLOW_ruleETArrayDeclaration_in_entryRuleETArrayDeclaration325);
            iv_ruleETArrayDeclaration=ruleETArrayDeclaration();

            state._fsp--;

             current =iv_ruleETArrayDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETArrayDeclaration335); 

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
    // $ANTLR end "entryRuleETArrayDeclaration"


    // $ANTLR start "ruleETArrayDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:201:1: ruleETArrayDeclaration returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= ruleETExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleETArrayDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_size_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:204:28: ( (otherlv_0= '[' ( (lv_size_1_0= ruleETExpression ) ) otherlv_2= ']' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:205:1: (otherlv_0= '[' ( (lv_size_1_0= ruleETExpression ) ) otherlv_2= ']' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:205:1: (otherlv_0= '[' ( (lv_size_1_0= ruleETExpression ) ) otherlv_2= ']' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:205:3: otherlv_0= '[' ( (lv_size_1_0= ruleETExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleETArrayDeclaration372); 

                	newLeafNode(otherlv_0, grammarAccess.getETArrayDeclarationAccess().getLeftSquareBracketKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:209:1: ( (lv_size_1_0= ruleETExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:210:1: (lv_size_1_0= ruleETExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:210:1: (lv_size_1_0= ruleETExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:211:3: lv_size_1_0= ruleETExpression
            {
             
            	        newCompositeNode(grammarAccess.getETArrayDeclarationAccess().getSizeETExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETExpression_in_ruleETArrayDeclaration393);
            lv_size_1_0=ruleETExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETArrayDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_1_0, 
                    		"ETExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleETArrayDeclaration405); 

                	newLeafNode(otherlv_2, grammarAccess.getETArrayDeclarationAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleETArrayDeclaration"


    // $ANTLR start "entryRuleETDeclarations"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:239:1: entryRuleETDeclarations returns [EObject current=null] : iv_ruleETDeclarations= ruleETDeclarations EOF ;
    public final EObject entryRuleETDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDeclarations = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:240:2: (iv_ruleETDeclarations= ruleETDeclarations EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:241:2: iv_ruleETDeclarations= ruleETDeclarations EOF
            {
             newCompositeNode(grammarAccess.getETDeclarationsRule()); 
            pushFollow(FOLLOW_ruleETDeclarations_in_entryRuleETDeclarations441);
            iv_ruleETDeclarations=ruleETDeclarations();

            state._fsp--;

             current =iv_ruleETDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDeclarations451); 

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
    // $ANTLR end "entryRuleETDeclarations"


    // $ANTLR start "ruleETDeclarations"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:248:1: ruleETDeclarations returns [EObject current=null] : ( () ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )? ) ;
    public final EObject ruleETDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:251:28: ( ( () ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )? ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:252:1: ( () ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )? )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:252:1: ( () ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )? )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:252:2: () ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )?
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:252:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:253:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETDeclarationsAccess().getETDeclarationsAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:258:2: ( ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=15 && LA5_0<=17)||(LA5_0>=24 && LA5_0<=32)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:258:3: ( (lv_declarations_1_0= ruleETDeclaration ) ) (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )* (otherlv_4= ';' )?
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:258:3: ( (lv_declarations_1_0= ruleETDeclaration ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:259:1: (lv_declarations_1_0= ruleETDeclaration )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:259:1: (lv_declarations_1_0= ruleETDeclaration )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:260:3: lv_declarations_1_0= ruleETDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getETDeclarationsAccess().getDeclarationsETDeclarationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETDeclaration_in_ruleETDeclarations507);
                    lv_declarations_1_0=ruleETDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"declarations",
                            		lv_declarations_1_0, 
                            		"ETDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:276:2: (otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID||(LA3_1>=15 && LA3_1<=17)||(LA3_1>=24 && LA3_1<=32)) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:276:4: otherlv_2= ';' ( (lv_declarations_3_0= ruleETDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleETDeclarations520); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getETDeclarationsAccess().getSemicolonKeyword_1_1_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:280:1: ( (lv_declarations_3_0= ruleETDeclaration ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:281:1: (lv_declarations_3_0= ruleETDeclaration )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:281:1: (lv_declarations_3_0= ruleETDeclaration )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:282:3: lv_declarations_3_0= ruleETDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETDeclarationsAccess().getDeclarationsETDeclarationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETDeclaration_in_ruleETDeclarations541);
                    	    lv_declarations_3_0=ruleETDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETDeclarationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declarations",
                    	            		lv_declarations_3_0, 
                    	            		"ETDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:298:4: (otherlv_4= ';' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:298:6: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleETDeclarations556); 

                                	newLeafNode(otherlv_4, grammarAccess.getETDeclarationsAccess().getSemicolonKeyword_1_2());
                                

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
    // $ANTLR end "ruleETDeclarations"


    // $ANTLR start "entryRuleETDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:310:1: entryRuleETDeclaration returns [EObject current=null] : iv_ruleETDeclaration= ruleETDeclaration EOF ;
    public final EObject entryRuleETDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETDeclaration = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:311:2: (iv_ruleETDeclaration= ruleETDeclaration EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:312:2: iv_ruleETDeclaration= ruleETDeclaration EOF
            {
             newCompositeNode(grammarAccess.getETDeclarationRule()); 
            pushFollow(FOLLOW_ruleETDeclaration_in_entryRuleETDeclaration596);
            iv_ruleETDeclaration=ruleETDeclaration();

            state._fsp--;

             current =iv_ruleETDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETDeclaration606); 

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
    // $ANTLR end "entryRuleETDeclaration"


    // $ANTLR start "ruleETDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:319:1: ruleETDeclaration returns [EObject current=null] : (this_ETVariableDeclaration_0= ruleETVariableDeclaration | this_ETTypeDeclaration_1= ruleETTypeDeclaration ) ;
    public final EObject ruleETDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ETVariableDeclaration_0 = null;

        EObject this_ETTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:322:28: ( (this_ETVariableDeclaration_0= ruleETVariableDeclaration | this_ETTypeDeclaration_1= ruleETTypeDeclaration ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:323:1: (this_ETVariableDeclaration_0= ruleETVariableDeclaration | this_ETTypeDeclaration_1= ruleETTypeDeclaration )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:323:1: (this_ETVariableDeclaration_0= ruleETVariableDeclaration | this_ETTypeDeclaration_1= ruleETTypeDeclaration )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=15 && LA6_0<=17)||(LA6_0>=25 && LA6_0<=32)) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:324:5: this_ETVariableDeclaration_0= ruleETVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getETDeclarationAccess().getETVariableDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETVariableDeclaration_in_ruleETDeclaration653);
                    this_ETVariableDeclaration_0=ruleETVariableDeclaration();

                    state._fsp--;

                     
                            current = this_ETVariableDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:334:5: this_ETTypeDeclaration_1= ruleETTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getETDeclarationAccess().getETTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETTypeDeclaration_in_ruleETDeclaration680);
                    this_ETTypeDeclaration_1=ruleETTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ETTypeDeclaration_1; 
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
    // $ANTLR end "ruleETDeclaration"


    // $ANTLR start "entryRuleETType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:350:1: entryRuleETType returns [EObject current=null] : iv_ruleETType= ruleETType EOF ;
    public final EObject entryRuleETType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:351:2: (iv_ruleETType= ruleETType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:352:2: iv_ruleETType= ruleETType EOF
            {
             newCompositeNode(grammarAccess.getETTypeRule()); 
            pushFollow(FOLLOW_ruleETType_in_entryRuleETType715);
            iv_ruleETType=ruleETType();

            state._fsp--;

             current =iv_ruleETType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETType725); 

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
    // $ANTLR end "entryRuleETType"


    // $ANTLR start "ruleETType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:359:1: ruleETType returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleETTypeModifiers ) ) ( (lv_identifier_1_0= ruleETTypeIdentifier ) ) ) ;
    public final EObject ruleETType() throws RecognitionException {
        EObject current = null;

        EObject lv_modifiers_0_0 = null;

        EObject lv_identifier_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:362:28: ( ( ( (lv_modifiers_0_0= ruleETTypeModifiers ) ) ( (lv_identifier_1_0= ruleETTypeIdentifier ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:363:1: ( ( (lv_modifiers_0_0= ruleETTypeModifiers ) ) ( (lv_identifier_1_0= ruleETTypeIdentifier ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:363:1: ( ( (lv_modifiers_0_0= ruleETTypeModifiers ) ) ( (lv_identifier_1_0= ruleETTypeIdentifier ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:363:2: ( (lv_modifiers_0_0= ruleETTypeModifiers ) ) ( (lv_identifier_1_0= ruleETTypeIdentifier ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:363:2: ( (lv_modifiers_0_0= ruleETTypeModifiers ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:364:1: (lv_modifiers_0_0= ruleETTypeModifiers )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:364:1: (lv_modifiers_0_0= ruleETTypeModifiers )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:365:3: lv_modifiers_0_0= ruleETTypeModifiers
            {
             
            	        newCompositeNode(grammarAccess.getETTypeAccess().getModifiersETTypeModifiersParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETTypeModifiers_in_ruleETType771);
            lv_modifiers_0_0=ruleETTypeModifiers();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETTypeRule());
            	        }
                   		set(
                   			current, 
                   			"modifiers",
                    		lv_modifiers_0_0, 
                    		"ETTypeModifiers");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:381:2: ( (lv_identifier_1_0= ruleETTypeIdentifier ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:382:1: (lv_identifier_1_0= ruleETTypeIdentifier )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:382:1: (lv_identifier_1_0= ruleETTypeIdentifier )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:383:3: lv_identifier_1_0= ruleETTypeIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getETTypeAccess().getIdentifierETTypeIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETTypeIdentifier_in_ruleETType792);
            lv_identifier_1_0=ruleETTypeIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETTypeRule());
            	        }
                   		set(
                   			current, 
                   			"identifier",
                    		lv_identifier_1_0, 
                    		"ETTypeIdentifier");
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
    // $ANTLR end "ruleETType"


    // $ANTLR start "entryRuleETTypeModifiers"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:407:1: entryRuleETTypeModifiers returns [EObject current=null] : iv_ruleETTypeModifiers= ruleETTypeModifiers EOF ;
    public final EObject entryRuleETTypeModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETTypeModifiers = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:408:2: (iv_ruleETTypeModifiers= ruleETTypeModifiers EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:409:2: iv_ruleETTypeModifiers= ruleETTypeModifiers EOF
            {
             newCompositeNode(grammarAccess.getETTypeModifiersRule()); 
            pushFollow(FOLLOW_ruleETTypeModifiers_in_entryRuleETTypeModifiers828);
            iv_ruleETTypeModifiers=ruleETTypeModifiers();

            state._fsp--;

             current =iv_ruleETTypeModifiers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETTypeModifiers838); 

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
    // $ANTLR end "entryRuleETTypeModifiers"


    // $ANTLR start "ruleETTypeModifiers"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:416:1: ruleETTypeModifiers returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleETTypeModifiers() throws RecognitionException {
        EObject current = null;

        Token lv_urgent_2_0=null;
        Token lv_meta_3_0=null;
        Token lv_const_4_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:419:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:420:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:420:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:420:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:420:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:421:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETTypeModifiersAccess().getETTypeModifiersAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:426:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:428:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:428:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:429:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:432:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:433:3: ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:433:3: ( ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:435:4: ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:435:4: ({...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:436:5: {...}? => ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:436:112: ( ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:437:6: ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:440:6: ({...}? => ( (lv_urgent_2_0= 'urgent' ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:440:7: {...}? => ( (lv_urgent_2_0= 'urgent' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "true");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:440:16: ( (lv_urgent_2_0= 'urgent' ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:441:1: (lv_urgent_2_0= 'urgent' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:441:1: (lv_urgent_2_0= 'urgent' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:442:3: lv_urgent_2_0= 'urgent'
            	    {
            	    lv_urgent_2_0=(Token)match(input,15,FOLLOW_15_in_ruleETTypeModifiers935); 

            	            newLeafNode(lv_urgent_2_0, grammarAccess.getETTypeModifiersAccess().getUrgentUrgentKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getETTypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "urgent", true, "urgent");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:462:4: ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:462:4: ({...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:463:5: {...}? => ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:463:112: ( ({...}? => ( (lv_meta_3_0= 'meta' ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:464:6: ({...}? => ( (lv_meta_3_0= 'meta' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:467:6: ({...}? => ( (lv_meta_3_0= 'meta' ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:467:7: {...}? => ( (lv_meta_3_0= 'meta' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "true");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:467:16: ( (lv_meta_3_0= 'meta' ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:468:1: (lv_meta_3_0= 'meta' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:468:1: (lv_meta_3_0= 'meta' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:469:3: lv_meta_3_0= 'meta'
            	    {
            	    lv_meta_3_0=(Token)match(input,16,FOLLOW_16_in_ruleETTypeModifiers1020); 

            	            newLeafNode(lv_meta_3_0, grammarAccess.getETTypeModifiersAccess().getMetaMetaKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getETTypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "meta", true, "meta");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:489:4: ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:489:4: ({...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:490:5: {...}? => ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "getUnorderedGroupHelper().canSelect(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:490:112: ( ({...}? => ( (lv_const_4_0= 'const' ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:491:6: ({...}? => ( (lv_const_4_0= 'const' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:494:6: ({...}? => ( (lv_const_4_0= 'const' ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:494:7: {...}? => ( (lv_const_4_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETTypeModifiers", "true");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:494:16: ( (lv_const_4_0= 'const' ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:495:1: (lv_const_4_0= 'const' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:495:1: (lv_const_4_0= 'const' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:496:3: lv_const_4_0= 'const'
            	    {
            	    lv_const_4_0=(Token)match(input,17,FOLLOW_17_in_ruleETTypeModifiers1105); 

            	            newLeafNode(lv_const_4_0, grammarAccess.getETTypeModifiersAccess().getConstConstKeyword_1_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getETTypeModifiersRule());
            	    	        }
            	           		setWithLastConsumed(current, "const", true, "const");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getETTypeModifiersAccess().getUnorderedGroup_1());
            	

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
    // $ANTLR end "ruleETTypeModifiers"


    // $ANTLR start "entryRuleETVariableDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:531:1: entryRuleETVariableDeclaration returns [EObject current=null] : iv_ruleETVariableDeclaration= ruleETVariableDeclaration EOF ;
    public final EObject entryRuleETVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETVariableDeclaration = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:532:2: (iv_ruleETVariableDeclaration= ruleETVariableDeclaration EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:533:2: iv_ruleETVariableDeclaration= ruleETVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getETVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleETVariableDeclaration_in_entryRuleETVariableDeclaration1194);
            iv_ruleETVariableDeclaration=ruleETVariableDeclaration();

            state._fsp--;

             current =iv_ruleETVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETVariableDeclaration1204); 

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
    // $ANTLR end "entryRuleETVariableDeclaration"


    // $ANTLR start "ruleETVariableDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:540:1: ruleETVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleETType ) ) ( (lv_variables_1_0= ruleETVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )* ) ;
    public final EObject ruleETVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:543:28: ( ( ( (lv_type_0_0= ruleETType ) ) ( (lv_variables_1_0= ruleETVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:544:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_variables_1_0= ruleETVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:544:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_variables_1_0= ruleETVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:544:2: ( (lv_type_0_0= ruleETType ) ) ( (lv_variables_1_0= ruleETVariableID ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:544:2: ( (lv_type_0_0= ruleETType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:545:1: (lv_type_0_0= ruleETType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:545:1: (lv_type_0_0= ruleETType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:546:3: lv_type_0_0= ruleETType
            {
             
            	        newCompositeNode(grammarAccess.getETVariableDeclarationAccess().getTypeETTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETType_in_ruleETVariableDeclaration1250);
            lv_type_0_0=ruleETType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ETType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:562:2: ( (lv_variables_1_0= ruleETVariableID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:563:1: (lv_variables_1_0= ruleETVariableID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:563:1: (lv_variables_1_0= ruleETVariableID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:564:3: lv_variables_1_0= ruleETVariableID
            {
             
            	        newCompositeNode(grammarAccess.getETVariableDeclarationAccess().getVariablesETVariableIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETVariableID_in_ruleETVariableDeclaration1271);
            lv_variables_1_0=ruleETVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETVariableDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_1_0, 
                    		"ETVariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:580:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:580:4: otherlv_2= ',' ( (lv_variables_3_0= ruleETVariableID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleETVariableDeclaration1284); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETVariableDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:584:1: ( (lv_variables_3_0= ruleETVariableID ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:585:1: (lv_variables_3_0= ruleETVariableID )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:585:1: (lv_variables_3_0= ruleETVariableID )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:586:3: lv_variables_3_0= ruleETVariableID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETVariableDeclarationAccess().getVariablesETVariableIDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETVariableID_in_ruleETVariableDeclaration1305);
            	    lv_variables_3_0=ruleETVariableID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETVariableDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"ETVariableID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleETVariableDeclaration"


    // $ANTLR start "entryRuleETVariableID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:610:1: entryRuleETVariableID returns [EObject current=null] : iv_ruleETVariableID= ruleETVariableID EOF ;
    public final EObject entryRuleETVariableID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETVariableID = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:611:2: (iv_ruleETVariableID= ruleETVariableID EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:612:2: iv_ruleETVariableID= ruleETVariableID EOF
            {
             newCompositeNode(grammarAccess.getETVariableIDRule()); 
            pushFollow(FOLLOW_ruleETVariableID_in_entryRuleETVariableID1343);
            iv_ruleETVariableID=ruleETVariableID();

            state._fsp--;

             current =iv_ruleETVariableID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETVariableID1353); 

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
    // $ANTLR end "entryRuleETVariableID"


    // $ANTLR start "ruleETVariableID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:619:1: ruleETVariableID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )? ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )? ) ;
    public final EObject ruleETVariableID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_ioType_1_1=null;
        Token lv_ioType_1_2=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;

        EObject lv_initialiser_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:622:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )? ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )? ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:623:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )? ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )? )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:623:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )? ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )? )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:623:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )? ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )?
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:623:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:624:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:624:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:625:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETVariableID1395); 

            			newLeafNode(lv_name_0_0, grammarAccess.getETVariableIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETVariableIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:641:2: ( ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=19 && LA10_0<=20)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:642:1: ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:642:1: ( (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:643:1: (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:643:1: (lv_ioType_1_1= '!' | lv_ioType_1_2= '?' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==20) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:644:3: lv_ioType_1_1= '!'
                            {
                            lv_ioType_1_1=(Token)match(input,19,FOLLOW_19_in_ruleETVariableID1420); 

                                    newLeafNode(lv_ioType_1_1, grammarAccess.getETVariableIDAccess().getIoTypeExclamationMarkKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getETVariableIDRule());
                            	        }
                                   		setWithLastConsumed(current, "ioType", lv_ioType_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:656:8: lv_ioType_1_2= '?'
                            {
                            lv_ioType_1_2=(Token)match(input,20,FOLLOW_20_in_ruleETVariableID1449); 

                                    newLeafNode(lv_ioType_1_2, grammarAccess.getETVariableIDAccess().getIoTypeQuestionMarkKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getETVariableIDRule());
                            	        }
                                   		setWithLastConsumed(current, "ioType", lv_ioType_1_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:671:3: ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:672:1: (lv_dimensions_2_0= ruleETArrayDeclaration )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:672:1: (lv_dimensions_2_0= ruleETArrayDeclaration )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:673:3: lv_dimensions_2_0= ruleETArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETVariableIDAccess().getDimensionsETArrayDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETArrayDeclaration_in_ruleETVariableID1487);
            	    lv_dimensions_2_0=ruleETArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETVariableIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_2_0, 
            	            		"ETArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:689:3: (otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:689:5: otherlv_3= '=' ( (lv_initialiser_4_0= ruleETInitialiser ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleETVariableID1501); 

                        	newLeafNode(otherlv_3, grammarAccess.getETVariableIDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:693:1: ( (lv_initialiser_4_0= ruleETInitialiser ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:694:1: (lv_initialiser_4_0= ruleETInitialiser )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:694:1: (lv_initialiser_4_0= ruleETInitialiser )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:695:3: lv_initialiser_4_0= ruleETInitialiser
                    {
                     
                    	        newCompositeNode(grammarAccess.getETVariableIDAccess().getInitialiserETInitialiserParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETInitialiser_in_ruleETVariableID1522);
                    lv_initialiser_4_0=ruleETInitialiser();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETVariableIDRule());
                    	        }
                           		set(
                           			current, 
                           			"initialiser",
                            		lv_initialiser_4_0, 
                            		"ETInitialiser");
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
    // $ANTLR end "ruleETVariableID"


    // $ANTLR start "entryRuleETInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:719:1: entryRuleETInitialiser returns [EObject current=null] : iv_ruleETInitialiser= ruleETInitialiser EOF ;
    public final EObject entryRuleETInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETInitialiser = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:720:2: (iv_ruleETInitialiser= ruleETInitialiser EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:721:2: iv_ruleETInitialiser= ruleETInitialiser EOF
            {
             newCompositeNode(grammarAccess.getETInitialiserRule()); 
            pushFollow(FOLLOW_ruleETInitialiser_in_entryRuleETInitialiser1560);
            iv_ruleETInitialiser=ruleETInitialiser();

            state._fsp--;

             current =iv_ruleETInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETInitialiser1570); 

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
    // $ANTLR end "entryRuleETInitialiser"


    // $ANTLR start "ruleETInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:728:1: ruleETInitialiser returns [EObject current=null] : (this_ETSingleInitialiser_0= ruleETSingleInitialiser | this_ETMultiInitialiser_1= ruleETMultiInitialiser ) ;
    public final EObject ruleETInitialiser() throws RecognitionException {
        EObject current = null;

        EObject this_ETSingleInitialiser_0 = null;

        EObject this_ETMultiInitialiser_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:731:28: ( (this_ETSingleInitialiser_0= ruleETSingleInitialiser | this_ETMultiInitialiser_1= ruleETMultiInitialiser ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:732:1: (this_ETSingleInitialiser_0= ruleETSingleInitialiser | this_ETMultiInitialiser_1= ruleETMultiInitialiser )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:732:1: (this_ETSingleInitialiser_0= ruleETSingleInitialiser | this_ETMultiInitialiser_1= ruleETMultiInitialiser )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==19||LA13_0==36||(LA13_0>=49 && LA13_0<=50)||LA13_0==78||(LA13_0>=82 && LA13_0<=85)) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:733:5: this_ETSingleInitialiser_0= ruleETSingleInitialiser
                    {
                     
                            newCompositeNode(grammarAccess.getETInitialiserAccess().getETSingleInitialiserParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETSingleInitialiser_in_ruleETInitialiser1617);
                    this_ETSingleInitialiser_0=ruleETSingleInitialiser();

                    state._fsp--;

                     
                            current = this_ETSingleInitialiser_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:743:5: this_ETMultiInitialiser_1= ruleETMultiInitialiser
                    {
                     
                            newCompositeNode(grammarAccess.getETInitialiserAccess().getETMultiInitialiserParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETMultiInitialiser_in_ruleETInitialiser1644);
                    this_ETMultiInitialiser_1=ruleETMultiInitialiser();

                    state._fsp--;

                     
                            current = this_ETMultiInitialiser_1; 
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
    // $ANTLR end "ruleETInitialiser"


    // $ANTLR start "entryRuleETSingleInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:759:1: entryRuleETSingleInitialiser returns [EObject current=null] : iv_ruleETSingleInitialiser= ruleETSingleInitialiser EOF ;
    public final EObject entryRuleETSingleInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSingleInitialiser = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:760:2: (iv_ruleETSingleInitialiser= ruleETSingleInitialiser EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:761:2: iv_ruleETSingleInitialiser= ruleETSingleInitialiser EOF
            {
             newCompositeNode(grammarAccess.getETSingleInitialiserRule()); 
            pushFollow(FOLLOW_ruleETSingleInitialiser_in_entryRuleETSingleInitialiser1679);
            iv_ruleETSingleInitialiser=ruleETSingleInitialiser();

            state._fsp--;

             current =iv_ruleETSingleInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSingleInitialiser1689); 

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
    // $ANTLR end "entryRuleETSingleInitialiser"


    // $ANTLR start "ruleETSingleInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:768:1: ruleETSingleInitialiser returns [EObject current=null] : ( (lv_expression_0_0= ruleETExpression ) ) ;
    public final EObject ruleETSingleInitialiser() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:771:28: ( ( (lv_expression_0_0= ruleETExpression ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:772:1: ( (lv_expression_0_0= ruleETExpression ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:772:1: ( (lv_expression_0_0= ruleETExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:773:1: (lv_expression_0_0= ruleETExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:773:1: (lv_expression_0_0= ruleETExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:774:3: lv_expression_0_0= ruleETExpression
            {
             
            	        newCompositeNode(grammarAccess.getETSingleInitialiserAccess().getExpressionETExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleETExpression_in_ruleETSingleInitialiser1734);
            lv_expression_0_0=ruleETExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSingleInitialiserRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ETExpression");
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
    // $ANTLR end "ruleETSingleInitialiser"


    // $ANTLR start "entryRuleETMultiInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:798:1: entryRuleETMultiInitialiser returns [EObject current=null] : iv_ruleETMultiInitialiser= ruleETMultiInitialiser EOF ;
    public final EObject entryRuleETMultiInitialiser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETMultiInitialiser = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:799:2: (iv_ruleETMultiInitialiser= ruleETMultiInitialiser EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:800:2: iv_ruleETMultiInitialiser= ruleETMultiInitialiser EOF
            {
             newCompositeNode(grammarAccess.getETMultiInitialiserRule()); 
            pushFollow(FOLLOW_ruleETMultiInitialiser_in_entryRuleETMultiInitialiser1769);
            iv_ruleETMultiInitialiser=ruleETMultiInitialiser();

            state._fsp--;

             current =iv_ruleETMultiInitialiser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETMultiInitialiser1779); 

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
    // $ANTLR end "entryRuleETMultiInitialiser"


    // $ANTLR start "ruleETMultiInitialiser"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:807:1: ruleETMultiInitialiser returns [EObject current=null] : (otherlv_0= '{' ( (lv_initialisers_1_0= ruleETInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleETMultiInitialiser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initialisers_1_0 = null;

        EObject lv_initialisers_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:810:28: ( (otherlv_0= '{' ( (lv_initialisers_1_0= ruleETInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )* otherlv_4= '}' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:811:1: (otherlv_0= '{' ( (lv_initialisers_1_0= ruleETInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )* otherlv_4= '}' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:811:1: (otherlv_0= '{' ( (lv_initialisers_1_0= ruleETInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )* otherlv_4= '}' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:811:3: otherlv_0= '{' ( (lv_initialisers_1_0= ruleETInitialiser ) ) (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleETMultiInitialiser1816); 

                	newLeafNode(otherlv_0, grammarAccess.getETMultiInitialiserAccess().getLeftCurlyBracketKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:815:1: ( (lv_initialisers_1_0= ruleETInitialiser ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:816:1: (lv_initialisers_1_0= ruleETInitialiser )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:816:1: (lv_initialisers_1_0= ruleETInitialiser )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:817:3: lv_initialisers_1_0= ruleETInitialiser
            {
             
            	        newCompositeNode(grammarAccess.getETMultiInitialiserAccess().getInitialisersETInitialiserParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETInitialiser_in_ruleETMultiInitialiser1837);
            lv_initialisers_1_0=ruleETInitialiser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETMultiInitialiserRule());
            	        }
                   		add(
                   			current, 
                   			"initialisers",
                    		lv_initialisers_1_0, 
                    		"ETInitialiser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:833:2: (otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:833:4: otherlv_2= ',' ( (lv_initialisers_3_0= ruleETInitialiser ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleETMultiInitialiser1850); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETMultiInitialiserAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:837:1: ( (lv_initialisers_3_0= ruleETInitialiser ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:838:1: (lv_initialisers_3_0= ruleETInitialiser )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:838:1: (lv_initialisers_3_0= ruleETInitialiser )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:839:3: lv_initialisers_3_0= ruleETInitialiser
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETMultiInitialiserAccess().getInitialisersETInitialiserParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETInitialiser_in_ruleETMultiInitialiser1871);
            	    lv_initialisers_3_0=ruleETInitialiser();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETMultiInitialiserRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisers",
            	            		lv_initialisers_3_0, 
            	            		"ETInitialiser");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleETMultiInitialiser1885); 

                	newLeafNode(otherlv_4, grammarAccess.getETMultiInitialiserAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleETMultiInitialiser"


    // $ANTLR start "entryRuleETTypeDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:867:1: entryRuleETTypeDeclaration returns [EObject current=null] : iv_ruleETTypeDeclaration= ruleETTypeDeclaration EOF ;
    public final EObject entryRuleETTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETTypeDeclaration = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:868:2: (iv_ruleETTypeDeclaration= ruleETTypeDeclaration EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:869:2: iv_ruleETTypeDeclaration= ruleETTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getETTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleETTypeDeclaration_in_entryRuleETTypeDeclaration1921);
            iv_ruleETTypeDeclaration=ruleETTypeDeclaration();

            state._fsp--;

             current =iv_ruleETTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETTypeDeclaration1931); 

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
    // $ANTLR end "entryRuleETTypeDeclaration"


    // $ANTLR start "ruleETTypeDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:876:1: ruleETTypeDeclaration returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleETType ) ) ( (lv_types_2_0= ruleETTypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )* ) ;
    public final EObject ruleETTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_baseType_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:879:28: ( (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleETType ) ) ( (lv_types_2_0= ruleETTypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:880:1: (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleETType ) ) ( (lv_types_2_0= ruleETTypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:880:1: (otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleETType ) ) ( (lv_types_2_0= ruleETTypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:880:3: otherlv_0= 'typedef' ( (lv_baseType_1_0= ruleETType ) ) ( (lv_types_2_0= ruleETTypeID ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleETTypeDeclaration1968); 

                	newLeafNode(otherlv_0, grammarAccess.getETTypeDeclarationAccess().getTypedefKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:884:1: ( (lv_baseType_1_0= ruleETType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:885:1: (lv_baseType_1_0= ruleETType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:885:1: (lv_baseType_1_0= ruleETType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:886:3: lv_baseType_1_0= ruleETType
            {
             
            	        newCompositeNode(grammarAccess.getETTypeDeclarationAccess().getBaseTypeETTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETType_in_ruleETTypeDeclaration1989);
            lv_baseType_1_0=ruleETType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETTypeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"baseType",
                    		lv_baseType_1_0, 
                    		"ETType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:902:2: ( (lv_types_2_0= ruleETTypeID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:903:1: (lv_types_2_0= ruleETTypeID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:903:1: (lv_types_2_0= ruleETTypeID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:904:3: lv_types_2_0= ruleETTypeID
            {
             
            	        newCompositeNode(grammarAccess.getETTypeDeclarationAccess().getTypesETTypeIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETTypeID_in_ruleETTypeDeclaration2010);
            lv_types_2_0=ruleETTypeID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETTypeDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_2_0, 
                    		"ETTypeID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:920:2: (otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:920:4: otherlv_3= ',' ( (lv_types_4_0= ruleETTypeID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleETTypeDeclaration2023); 

            	        	newLeafNode(otherlv_3, grammarAccess.getETTypeDeclarationAccess().getCommaKeyword_3_0());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:924:1: ( (lv_types_4_0= ruleETTypeID ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:925:1: (lv_types_4_0= ruleETTypeID )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:925:1: (lv_types_4_0= ruleETTypeID )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:926:3: lv_types_4_0= ruleETTypeID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETTypeDeclarationAccess().getTypesETTypeIDParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETTypeID_in_ruleETTypeDeclaration2044);
            	    lv_types_4_0=ruleETTypeID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETTypeDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_4_0, 
            	            		"ETTypeID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleETTypeDeclaration"


    // $ANTLR start "entryRuleETTypeID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:950:1: entryRuleETTypeID returns [EObject current=null] : iv_ruleETTypeID= ruleETTypeID EOF ;
    public final EObject entryRuleETTypeID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETTypeID = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:951:2: (iv_ruleETTypeID= ruleETTypeID EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:952:2: iv_ruleETTypeID= ruleETTypeID EOF
            {
             newCompositeNode(grammarAccess.getETTypeIDRule()); 
            pushFollow(FOLLOW_ruleETTypeID_in_entryRuleETTypeID2082);
            iv_ruleETTypeID=ruleETTypeID();

            state._fsp--;

             current =iv_ruleETTypeID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETTypeID2092); 

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
    // $ANTLR end "entryRuleETTypeID"


    // $ANTLR start "ruleETTypeID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:959:1: ruleETTypeID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* ) ;
    public final EObject ruleETTypeID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_dimensions_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:962:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:963:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:963:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:963:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:963:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:964:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:964:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:965:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETTypeID2134); 

            			newLeafNode(lv_name_0_0, grammarAccess.getETTypeIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETTypeIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:981:2: ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:982:1: (lv_dimensions_1_0= ruleETArrayDeclaration )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:982:1: (lv_dimensions_1_0= ruleETArrayDeclaration )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:983:3: lv_dimensions_1_0= ruleETArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETTypeIDAccess().getDimensionsETArrayDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETArrayDeclaration_in_ruleETTypeID2160);
            	    lv_dimensions_1_0=ruleETArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETTypeIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"ETArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleETTypeID"


    // $ANTLR start "entryRuleETTypeIdentifier"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1007:1: entryRuleETTypeIdentifier returns [EObject current=null] : iv_ruleETTypeIdentifier= ruleETTypeIdentifier EOF ;
    public final EObject entryRuleETTypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETTypeIdentifier = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1008:2: (iv_ruleETTypeIdentifier= ruleETTypeIdentifier EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1009:2: iv_ruleETTypeIdentifier= ruleETTypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getETTypeIdentifierRule()); 
            pushFollow(FOLLOW_ruleETTypeIdentifier_in_entryRuleETTypeIdentifier2197);
            iv_ruleETTypeIdentifier=ruleETTypeIdentifier();

            state._fsp--;

             current =iv_ruleETTypeIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETTypeIdentifier2207); 

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
    // $ANTLR end "entryRuleETTypeIdentifier"


    // $ANTLR start "ruleETTypeIdentifier"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1016:1: ruleETTypeIdentifier returns [EObject current=null] : (this_ETIntegerType_0= ruleETIntegerType | this_ETClockType_1= ruleETClockType | this_ETActionType_2= ruleETActionType | this_ETBooleanType_3= ruleETBooleanType | this_ETScalarType_4= ruleETScalarType | this_ETStructType_5= ruleETStructType | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleETTypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject this_ETIntegerType_0 = null;

        EObject this_ETClockType_1 = null;

        EObject this_ETActionType_2 = null;

        EObject this_ETBooleanType_3 = null;

        EObject this_ETScalarType_4 = null;

        EObject this_ETStructType_5 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1019:28: ( (this_ETIntegerType_0= ruleETIntegerType | this_ETClockType_1= ruleETClockType | this_ETActionType_2= ruleETActionType | this_ETBooleanType_3= ruleETBooleanType | this_ETScalarType_4= ruleETScalarType | this_ETStructType_5= ruleETStructType | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1020:1: (this_ETIntegerType_0= ruleETIntegerType | this_ETClockType_1= ruleETClockType | this_ETActionType_2= ruleETActionType | this_ETBooleanType_3= ruleETBooleanType | this_ETScalarType_4= ruleETScalarType | this_ETStructType_5= ruleETStructType | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1020:1: (this_ETIntegerType_0= ruleETIntegerType | this_ETClockType_1= ruleETClockType | this_ETActionType_2= ruleETActionType | this_ETBooleanType_3= ruleETBooleanType | this_ETScalarType_4= ruleETScalarType | this_ETStructType_5= ruleETStructType | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
            case 28:
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            case 31:
                {
                alt17=5;
                }
                break;
            case 32:
                {
                alt17=6;
                }
                break;
            case RULE_ID:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1021:5: this_ETIntegerType_0= ruleETIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETIntegerType_in_ruleETTypeIdentifier2254);
                    this_ETIntegerType_0=ruleETIntegerType();

                    state._fsp--;

                     
                            current = this_ETIntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1031:5: this_ETClockType_1= ruleETClockType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETClockTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETClockType_in_ruleETTypeIdentifier2281);
                    this_ETClockType_1=ruleETClockType();

                    state._fsp--;

                     
                            current = this_ETClockType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1041:5: this_ETActionType_2= ruleETActionType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETActionTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleETActionType_in_ruleETTypeIdentifier2308);
                    this_ETActionType_2=ruleETActionType();

                    state._fsp--;

                     
                            current = this_ETActionType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1051:5: this_ETBooleanType_3= ruleETBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETBooleanTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleETBooleanType_in_ruleETTypeIdentifier2335);
                    this_ETBooleanType_3=ruleETBooleanType();

                    state._fsp--;

                     
                            current = this_ETBooleanType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1061:5: this_ETScalarType_4= ruleETScalarType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETScalarTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleETScalarType_in_ruleETTypeIdentifier2362);
                    this_ETScalarType_4=ruleETScalarType();

                    state._fsp--;

                     
                            current = this_ETScalarType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1071:5: this_ETStructType_5= ruleETStructType
                    {
                     
                            newCompositeNode(grammarAccess.getETTypeIdentifierAccess().getETStructTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleETStructType_in_ruleETTypeIdentifier2389);
                    this_ETStructType_5=ruleETStructType();

                    state._fsp--;

                     
                            current = this_ETStructType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1080:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1080:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1080:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1080:7: ()
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1081:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getETTypeIdentifierAccess().getETTypeReferenceAction_6_0(),
                                current);
                        

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1086:2: ( (otherlv_7= RULE_ID ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1087:1: (otherlv_7= RULE_ID )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1087:1: (otherlv_7= RULE_ID )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1088:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getETTypeIdentifierRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETTypeIdentifier2424); 

                    		newLeafNode(otherlv_7, grammarAccess.getETTypeIdentifierAccess().getTargetETTypeIDCrossReference_6_1_0()); 
                    	

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
    // $ANTLR end "ruleETTypeIdentifier"


    // $ANTLR start "entryRuleETIntegerType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1107:1: entryRuleETIntegerType returns [EObject current=null] : iv_ruleETIntegerType= ruleETIntegerType EOF ;
    public final EObject entryRuleETIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETIntegerType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1108:2: (iv_ruleETIntegerType= ruleETIntegerType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1109:2: iv_ruleETIntegerType= ruleETIntegerType EOF
            {
             newCompositeNode(grammarAccess.getETIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleETIntegerType_in_entryRuleETIntegerType2461);
            iv_ruleETIntegerType=ruleETIntegerType();

            state._fsp--;

             current =iv_ruleETIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETIntegerType2471); 

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
    // $ANTLR end "entryRuleETIntegerType"


    // $ANTLR start "ruleETIntegerType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1116:1: ruleETIntegerType returns [EObject current=null] : ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleETIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1119:28: ( ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )? ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1120:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )? )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1120:1: ( () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )? )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1120:2: () otherlv_1= 'int' (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )?
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1120:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1121:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETIntegerTypeAccess().getETIntegerTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleETIntegerType2517); 

                	newLeafNode(otherlv_1, grammarAccess.getETIntegerTypeAccess().getIntKeyword_1());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1130:1: (otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1130:3: otherlv_2= '[' ( (lv_min_3_0= ruleETExpression ) ) otherlv_4= ',' ( (lv_max_5_0= ruleETExpression ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleETIntegerType2530); 

                        	newLeafNode(otherlv_2, grammarAccess.getETIntegerTypeAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1134:1: ( (lv_min_3_0= ruleETExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1135:1: (lv_min_3_0= ruleETExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1135:1: (lv_min_3_0= ruleETExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1136:3: lv_min_3_0= ruleETExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETIntegerTypeAccess().getMinETExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETExpression_in_ruleETIntegerType2551);
                    lv_min_3_0=ruleETExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETIntegerTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"ETExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleETIntegerType2563); 

                        	newLeafNode(otherlv_4, grammarAccess.getETIntegerTypeAccess().getCommaKeyword_2_2());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1156:1: ( (lv_max_5_0= ruleETExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1157:1: (lv_max_5_0= ruleETExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1157:1: (lv_max_5_0= ruleETExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1158:3: lv_max_5_0= ruleETExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETIntegerTypeAccess().getMaxETExpressionParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETExpression_in_ruleETIntegerType2584);
                    lv_max_5_0=ruleETExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETIntegerTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"ETExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleETIntegerType2596); 

                        	newLeafNode(otherlv_6, grammarAccess.getETIntegerTypeAccess().getRightSquareBracketKeyword_2_4());
                        

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
    // $ANTLR end "ruleETIntegerType"


    // $ANTLR start "entryRuleETClockType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1186:1: entryRuleETClockType returns [EObject current=null] : iv_ruleETClockType= ruleETClockType EOF ;
    public final EObject entryRuleETClockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETClockType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1187:2: (iv_ruleETClockType= ruleETClockType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1188:2: iv_ruleETClockType= ruleETClockType EOF
            {
             newCompositeNode(grammarAccess.getETClockTypeRule()); 
            pushFollow(FOLLOW_ruleETClockType_in_entryRuleETClockType2634);
            iv_ruleETClockType=ruleETClockType();

            state._fsp--;

             current =iv_ruleETClockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETClockType2644); 

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
    // $ANTLR end "entryRuleETClockType"


    // $ANTLR start "ruleETClockType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1195:1: ruleETClockType returns [EObject current=null] : ( () otherlv_1= 'clock' ) ;
    public final EObject ruleETClockType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1198:28: ( ( () otherlv_1= 'clock' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1199:1: ( () otherlv_1= 'clock' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1199:1: ( () otherlv_1= 'clock' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1199:2: () otherlv_1= 'clock'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1199:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1200:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETClockTypeAccess().getETClockTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleETClockType2690); 

                	newLeafNode(otherlv_1, grammarAccess.getETClockTypeAccess().getClockKeyword_1());
                

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
    // $ANTLR end "ruleETClockType"


    // $ANTLR start "entryRuleETActionType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1217:1: entryRuleETActionType returns [EObject current=null] : iv_ruleETActionType= ruleETActionType EOF ;
    public final EObject entryRuleETActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETActionType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1218:2: (iv_ruleETActionType= ruleETActionType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1219:2: iv_ruleETActionType= ruleETActionType EOF
            {
             newCompositeNode(grammarAccess.getETActionTypeRule()); 
            pushFollow(FOLLOW_ruleETActionType_in_entryRuleETActionType2726);
            iv_ruleETActionType=ruleETActionType();

            state._fsp--;

             current =iv_ruleETActionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETActionType2736); 

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
    // $ANTLR end "entryRuleETActionType"


    // $ANTLR start "ruleETActionType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1226:1: ruleETActionType returns [EObject current=null] : (this_ETInputType_0= ruleETInputType | this_ETOutputType_1= ruleETOutputType | ( () otherlv_3= 'action' ) ) ;
    public final EObject ruleETActionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_ETInputType_0 = null;

        EObject this_ETOutputType_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1229:28: ( (this_ETInputType_0= ruleETInputType | this_ETOutputType_1= ruleETOutputType | ( () otherlv_3= 'action' ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1230:1: (this_ETInputType_0= ruleETInputType | this_ETOutputType_1= ruleETOutputType | ( () otherlv_3= 'action' ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1230:1: (this_ETInputType_0= ruleETInputType | this_ETOutputType_1= ruleETOutputType | ( () otherlv_3= 'action' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1231:5: this_ETInputType_0= ruleETInputType
                    {
                     
                            newCompositeNode(grammarAccess.getETActionTypeAccess().getETInputTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETInputType_in_ruleETActionType2783);
                    this_ETInputType_0=ruleETInputType();

                    state._fsp--;

                     
                            current = this_ETInputType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1241:5: this_ETOutputType_1= ruleETOutputType
                    {
                     
                            newCompositeNode(grammarAccess.getETActionTypeAccess().getETOutputTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETOutputType_in_ruleETActionType2810);
                    this_ETOutputType_1=ruleETOutputType();

                    state._fsp--;

                     
                            current = this_ETOutputType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1250:6: ( () otherlv_3= 'action' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1250:6: ( () otherlv_3= 'action' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1250:7: () otherlv_3= 'action'
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1250:7: ()
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1251:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getETActionTypeAccess().getETActionTypeAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleETActionType2837); 

                        	newLeafNode(otherlv_3, grammarAccess.getETActionTypeAccess().getActionKeyword_2_1());
                        

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
    // $ANTLR end "ruleETActionType"


    // $ANTLR start "entryRuleETInputType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1268:1: entryRuleETInputType returns [EObject current=null] : iv_ruleETInputType= ruleETInputType EOF ;
    public final EObject entryRuleETInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETInputType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1269:2: (iv_ruleETInputType= ruleETInputType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1270:2: iv_ruleETInputType= ruleETInputType EOF
            {
             newCompositeNode(grammarAccess.getETInputTypeRule()); 
            pushFollow(FOLLOW_ruleETInputType_in_entryRuleETInputType2874);
            iv_ruleETInputType=ruleETInputType();

            state._fsp--;

             current =iv_ruleETInputType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETInputType2884); 

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
    // $ANTLR end "entryRuleETInputType"


    // $ANTLR start "ruleETInputType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1277:1: ruleETInputType returns [EObject current=null] : ( () otherlv_1= 'input' ) ;
    public final EObject ruleETInputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1280:28: ( ( () otherlv_1= 'input' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1281:1: ( () otherlv_1= 'input' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1281:1: ( () otherlv_1= 'input' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1281:2: () otherlv_1= 'input'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1281:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1282:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETInputTypeAccess().getETInputTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleETInputType2930); 

                	newLeafNode(otherlv_1, grammarAccess.getETInputTypeAccess().getInputKeyword_1());
                

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
    // $ANTLR end "ruleETInputType"


    // $ANTLR start "entryRuleETOutputType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1299:1: entryRuleETOutputType returns [EObject current=null] : iv_ruleETOutputType= ruleETOutputType EOF ;
    public final EObject entryRuleETOutputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETOutputType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1300:2: (iv_ruleETOutputType= ruleETOutputType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1301:2: iv_ruleETOutputType= ruleETOutputType EOF
            {
             newCompositeNode(grammarAccess.getETOutputTypeRule()); 
            pushFollow(FOLLOW_ruleETOutputType_in_entryRuleETOutputType2966);
            iv_ruleETOutputType=ruleETOutputType();

            state._fsp--;

             current =iv_ruleETOutputType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETOutputType2976); 

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
    // $ANTLR end "entryRuleETOutputType"


    // $ANTLR start "ruleETOutputType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1308:1: ruleETOutputType returns [EObject current=null] : ( () otherlv_1= 'output' ) ;
    public final EObject ruleETOutputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1311:28: ( ( () otherlv_1= 'output' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1312:1: ( () otherlv_1= 'output' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1312:1: ( () otherlv_1= 'output' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1312:2: () otherlv_1= 'output'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1312:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1313:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETOutputTypeAccess().getETOutputTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleETOutputType3022); 

                	newLeafNode(otherlv_1, grammarAccess.getETOutputTypeAccess().getOutputKeyword_1());
                

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
    // $ANTLR end "ruleETOutputType"


    // $ANTLR start "entryRuleETBooleanType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1330:1: entryRuleETBooleanType returns [EObject current=null] : iv_ruleETBooleanType= ruleETBooleanType EOF ;
    public final EObject entryRuleETBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBooleanType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1331:2: (iv_ruleETBooleanType= ruleETBooleanType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1332:2: iv_ruleETBooleanType= ruleETBooleanType EOF
            {
             newCompositeNode(grammarAccess.getETBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleETBooleanType_in_entryRuleETBooleanType3058);
            iv_ruleETBooleanType=ruleETBooleanType();

            state._fsp--;

             current =iv_ruleETBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBooleanType3068); 

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
    // $ANTLR end "entryRuleETBooleanType"


    // $ANTLR start "ruleETBooleanType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1339:1: ruleETBooleanType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleETBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1342:28: ( ( () otherlv_1= 'bool' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1343:1: ( () otherlv_1= 'bool' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1343:1: ( () otherlv_1= 'bool' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1343:2: () otherlv_1= 'bool'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1343:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1344:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETBooleanTypeAccess().getETBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleETBooleanType3114); 

                	newLeafNode(otherlv_1, grammarAccess.getETBooleanTypeAccess().getBoolKeyword_1());
                

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
    // $ANTLR end "ruleETBooleanType"


    // $ANTLR start "entryRuleETScalarType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1361:1: entryRuleETScalarType returns [EObject current=null] : iv_ruleETScalarType= ruleETScalarType EOF ;
    public final EObject entryRuleETScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETScalarType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1362:2: (iv_ruleETScalarType= ruleETScalarType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1363:2: iv_ruleETScalarType= ruleETScalarType EOF
            {
             newCompositeNode(grammarAccess.getETScalarTypeRule()); 
            pushFollow(FOLLOW_ruleETScalarType_in_entryRuleETScalarType3150);
            iv_ruleETScalarType=ruleETScalarType();

            state._fsp--;

             current =iv_ruleETScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETScalarType3160); 

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
    // $ANTLR end "entryRuleETScalarType"


    // $ANTLR start "ruleETScalarType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1370:1: ruleETScalarType returns [EObject current=null] : ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleETExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleETScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_size_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1373:28: ( ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleETExpression ) ) otherlv_4= ']' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1374:1: ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleETExpression ) ) otherlv_4= ']' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1374:1: ( () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleETExpression ) ) otherlv_4= ']' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1374:2: () otherlv_1= 'scalar' otherlv_2= '[' ( (lv_size_3_0= ruleETExpression ) ) otherlv_4= ']'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1374:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1375:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETScalarTypeAccess().getETScalarTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleETScalarType3206); 

                	newLeafNode(otherlv_1, grammarAccess.getETScalarTypeAccess().getScalarKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleETScalarType3218); 

                	newLeafNode(otherlv_2, grammarAccess.getETScalarTypeAccess().getLeftSquareBracketKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1388:1: ( (lv_size_3_0= ruleETExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1389:1: (lv_size_3_0= ruleETExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1389:1: (lv_size_3_0= ruleETExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1390:3: lv_size_3_0= ruleETExpression
            {
             
            	        newCompositeNode(grammarAccess.getETScalarTypeAccess().getSizeETExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleETExpression_in_ruleETScalarType3239);
            lv_size_3_0=ruleETExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETScalarTypeRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_3_0, 
                    		"ETExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleETScalarType3251); 

                	newLeafNode(otherlv_4, grammarAccess.getETScalarTypeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleETScalarType"


    // $ANTLR start "entryRuleETStructType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1418:1: entryRuleETStructType returns [EObject current=null] : iv_ruleETStructType= ruleETStructType EOF ;
    public final EObject entryRuleETStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETStructType = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1419:2: (iv_ruleETStructType= ruleETStructType EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1420:2: iv_ruleETStructType= ruleETStructType EOF
            {
             newCompositeNode(grammarAccess.getETStructTypeRule()); 
            pushFollow(FOLLOW_ruleETStructType_in_entryRuleETStructType3287);
            iv_ruleETStructType=ruleETStructType();

            state._fsp--;

             current =iv_ruleETStructType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETStructType3297); 

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
    // $ANTLR end "entryRuleETStructType"


    // $ANTLR start "ruleETStructType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1427:1: ruleETStructType returns [EObject current=null] : ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleETFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) ;
    public final EObject ruleETStructType() throws RecognitionException {
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
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1430:28: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleETFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1431:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleETFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1431:1: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleETFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1431:2: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_declarations_3_0= ruleETFieldDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )* (otherlv_6= ';' )? otherlv_7= '}'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1431:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1432:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETStructTypeAccess().getETStructTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleETStructType3343); 

                	newLeafNode(otherlv_1, grammarAccess.getETStructTypeAccess().getStructKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleETStructType3355); 

                	newLeafNode(otherlv_2, grammarAccess.getETStructTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1445:1: ( (lv_declarations_3_0= ruleETFieldDeclaration ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1446:1: (lv_declarations_3_0= ruleETFieldDeclaration )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1446:1: (lv_declarations_3_0= ruleETFieldDeclaration )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1447:3: lv_declarations_3_0= ruleETFieldDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getETStructTypeAccess().getDeclarationsETFieldDeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleETFieldDeclaration_in_ruleETStructType3376);
            lv_declarations_3_0=ruleETFieldDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETStructTypeRule());
            	        }
                   		add(
                   			current, 
                   			"declarations",
                    		lv_declarations_3_0, 
                    		"ETFieldDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1463:2: (otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID||(LA20_1>=15 && LA20_1<=17)||(LA20_1>=25 && LA20_1<=32)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1463:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleETFieldDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleETStructType3389); 

            	        	newLeafNode(otherlv_4, grammarAccess.getETStructTypeAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1467:1: ( (lv_declarations_5_0= ruleETFieldDeclaration ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1468:1: (lv_declarations_5_0= ruleETFieldDeclaration )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1468:1: (lv_declarations_5_0= ruleETFieldDeclaration )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1469:3: lv_declarations_5_0= ruleETFieldDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETStructTypeAccess().getDeclarationsETFieldDeclarationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETFieldDeclaration_in_ruleETStructType3410);
            	    lv_declarations_5_0=ruleETFieldDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETStructTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_5_0, 
            	            		"ETFieldDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1485:4: (otherlv_6= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1485:6: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleETStructType3425); 

                        	newLeafNode(otherlv_6, grammarAccess.getETStructTypeAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleETStructType3439); 

                	newLeafNode(otherlv_7, grammarAccess.getETStructTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleETStructType"


    // $ANTLR start "entryRuleETFieldDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1501:1: entryRuleETFieldDeclaration returns [EObject current=null] : iv_ruleETFieldDeclaration= ruleETFieldDeclaration EOF ;
    public final EObject entryRuleETFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETFieldDeclaration = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1502:2: (iv_ruleETFieldDeclaration= ruleETFieldDeclaration EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1503:2: iv_ruleETFieldDeclaration= ruleETFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getETFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleETFieldDeclaration_in_entryRuleETFieldDeclaration3475);
            iv_ruleETFieldDeclaration=ruleETFieldDeclaration();

            state._fsp--;

             current =iv_ruleETFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETFieldDeclaration3485); 

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
    // $ANTLR end "entryRuleETFieldDeclaration"


    // $ANTLR start "ruleETFieldDeclaration"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1510:1: ruleETFieldDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleETType ) ) ( (lv_fields_1_0= ruleETFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )* ) ;
    public final EObject ruleETFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_fields_1_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1513:28: ( ( ( (lv_type_0_0= ruleETType ) ) ( (lv_fields_1_0= ruleETFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1514:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_fields_1_0= ruleETFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1514:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_fields_1_0= ruleETFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1514:2: ( (lv_type_0_0= ruleETType ) ) ( (lv_fields_1_0= ruleETFieldID ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1514:2: ( (lv_type_0_0= ruleETType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1515:1: (lv_type_0_0= ruleETType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1515:1: (lv_type_0_0= ruleETType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1516:3: lv_type_0_0= ruleETType
            {
             
            	        newCompositeNode(grammarAccess.getETFieldDeclarationAccess().getTypeETTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETType_in_ruleETFieldDeclaration3531);
            lv_type_0_0=ruleETType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETFieldDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ETType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1532:2: ( (lv_fields_1_0= ruleETFieldID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1533:1: (lv_fields_1_0= ruleETFieldID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1533:1: (lv_fields_1_0= ruleETFieldID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1534:3: lv_fields_1_0= ruleETFieldID
            {
             
            	        newCompositeNode(grammarAccess.getETFieldDeclarationAccess().getFieldsETFieldIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETFieldID_in_ruleETFieldDeclaration3552);
            lv_fields_1_0=ruleETFieldID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETFieldDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_1_0, 
                    		"ETFieldID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1550:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1550:4: otherlv_2= ',' ( (lv_fields_3_0= ruleETFieldID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleETFieldDeclaration3565); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETFieldDeclarationAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1554:1: ( (lv_fields_3_0= ruleETFieldID ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1555:1: (lv_fields_3_0= ruleETFieldID )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1555:1: (lv_fields_3_0= ruleETFieldID )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1556:3: lv_fields_3_0= ruleETFieldID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETFieldDeclarationAccess().getFieldsETFieldIDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETFieldID_in_ruleETFieldDeclaration3586);
            	    lv_fields_3_0=ruleETFieldID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETFieldDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"ETFieldID");
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
    // $ANTLR end "ruleETFieldDeclaration"


    // $ANTLR start "entryRuleETFieldID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1580:1: entryRuleETFieldID returns [EObject current=null] : iv_ruleETFieldID= ruleETFieldID EOF ;
    public final EObject entryRuleETFieldID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETFieldID = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1581:2: (iv_ruleETFieldID= ruleETFieldID EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1582:2: iv_ruleETFieldID= ruleETFieldID EOF
            {
             newCompositeNode(grammarAccess.getETFieldIDRule()); 
            pushFollow(FOLLOW_ruleETFieldID_in_entryRuleETFieldID3624);
            iv_ruleETFieldID=ruleETFieldID();

            state._fsp--;

             current =iv_ruleETFieldID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETFieldID3634); 

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
    // $ANTLR end "entryRuleETFieldID"


    // $ANTLR start "ruleETFieldID"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1589:1: ruleETFieldID returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* ) ;
    public final EObject ruleETFieldID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_dimensions_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1592:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1593:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1593:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1593:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1593:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1594:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1594:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1595:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETFieldID3676); 

            			newLeafNode(lv_name_0_0, grammarAccess.getETFieldIDAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETFieldIDRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1611:2: ( (lv_dimensions_1_0= ruleETArrayDeclaration ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==12) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1612:1: (lv_dimensions_1_0= ruleETArrayDeclaration )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1612:1: (lv_dimensions_1_0= ruleETArrayDeclaration )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1613:3: lv_dimensions_1_0= ruleETArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETFieldIDAccess().getDimensionsETArrayDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETArrayDeclaration_in_ruleETFieldID3702);
            	    lv_dimensions_1_0=ruleETArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETFieldIDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"ETArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleETFieldID"


    // $ANTLR start "entryRuleETSpecificationExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1637:1: entryRuleETSpecificationExpression returns [EObject current=null] : iv_ruleETSpecificationExpression= ruleETSpecificationExpression EOF ;
    public final EObject entryRuleETSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1638:2: (iv_ruleETSpecificationExpression= ruleETSpecificationExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1639:2: iv_ruleETSpecificationExpression= ruleETSpecificationExpression EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationExpressionRule()); 
            pushFollow(FOLLOW_ruleETSpecificationExpression_in_entryRuleETSpecificationExpression3739);
            iv_ruleETSpecificationExpression=ruleETSpecificationExpression();

            state._fsp--;

             current =iv_ruleETSpecificationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationExpression3749); 

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
    // $ANTLR end "entryRuleETSpecificationExpression"


    // $ANTLR start "ruleETSpecificationExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1646:1: ruleETSpecificationExpression returns [EObject current=null] : (this_ETSpecificationDisjunctionExpression_0= ruleETSpecificationDisjunctionExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )* ) ;
    public final EObject ruleETSpecificationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETSpecificationDisjunctionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1649:28: ( (this_ETSpecificationDisjunctionExpression_0= ruleETSpecificationDisjunctionExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1650:1: (this_ETSpecificationDisjunctionExpression_0= ruleETSpecificationDisjunctionExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1650:1: (this_ETSpecificationDisjunctionExpression_0= ruleETSpecificationDisjunctionExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1651:5: this_ETSpecificationDisjunctionExpression_0= ruleETSpecificationDisjunctionExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETSpecificationDisjunctionExpression_in_ruleETSpecificationExpression3796);
            this_ETSpecificationDisjunctionExpression_0=ruleETSpecificationDisjunctionExpression();

            state._fsp--;

             
                    current = this_ETSpecificationDisjunctionExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1659:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1659:2: () otherlv_2= '||' ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1659:2: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1660:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleETSpecificationExpression3817); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETSpecificationExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1669:1: ( (lv_right_3_0= ruleETSpecificationDisjunctionExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1670:1: (lv_right_3_0= ruleETSpecificationDisjunctionExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1670:1: (lv_right_3_0= ruleETSpecificationDisjunctionExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1671:3: lv_right_3_0= ruleETSpecificationDisjunctionExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETSpecificationExpressionAccess().getRightETSpecificationDisjunctionExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETSpecificationDisjunctionExpression_in_ruleETSpecificationExpression3838);
            	    lv_right_3_0=ruleETSpecificationDisjunctionExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETSpecificationExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETSpecificationDisjunctionExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleETSpecificationExpression"


    // $ANTLR start "entryRuleETSpecificationDisjunctionExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1695:1: entryRuleETSpecificationDisjunctionExpression returns [EObject current=null] : iv_ruleETSpecificationDisjunctionExpression= ruleETSpecificationDisjunctionExpression EOF ;
    public final EObject entryRuleETSpecificationDisjunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationDisjunctionExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1696:2: (iv_ruleETSpecificationDisjunctionExpression= ruleETSpecificationDisjunctionExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1697:2: iv_ruleETSpecificationDisjunctionExpression= ruleETSpecificationDisjunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationDisjunctionExpressionRule()); 
            pushFollow(FOLLOW_ruleETSpecificationDisjunctionExpression_in_entryRuleETSpecificationDisjunctionExpression3876);
            iv_ruleETSpecificationDisjunctionExpression=ruleETSpecificationDisjunctionExpression();

            state._fsp--;

             current =iv_ruleETSpecificationDisjunctionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationDisjunctionExpression3886); 

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
    // $ANTLR end "entryRuleETSpecificationDisjunctionExpression"


    // $ANTLR start "ruleETSpecificationDisjunctionExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1704:1: ruleETSpecificationDisjunctionExpression returns [EObject current=null] : (this_ETSpecificationCompositionExpression_0= ruleETSpecificationCompositionExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )* ) ;
    public final EObject ruleETSpecificationDisjunctionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETSpecificationCompositionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1707:28: ( (this_ETSpecificationCompositionExpression_0= ruleETSpecificationCompositionExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1708:1: (this_ETSpecificationCompositionExpression_0= ruleETSpecificationCompositionExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1708:1: (this_ETSpecificationCompositionExpression_0= ruleETSpecificationCompositionExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1709:5: this_ETSpecificationCompositionExpression_0= ruleETSpecificationCompositionExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationCompositionExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETSpecificationCompositionExpression_in_ruleETSpecificationDisjunctionExpression3933);
            this_ETSpecificationCompositionExpression_0=ruleETSpecificationCompositionExpression();

            state._fsp--;

             
                    current = this_ETSpecificationCompositionExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1717:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1717:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1717:2: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1718:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleETSpecificationDisjunctionExpression3954); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETSpecificationDisjunctionExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1727:1: ( (lv_right_3_0= ruleETSpecificationCompositionExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1728:1: (lv_right_3_0= ruleETSpecificationCompositionExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1728:1: (lv_right_3_0= ruleETSpecificationCompositionExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1729:3: lv_right_3_0= ruleETSpecificationCompositionExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETSpecificationDisjunctionExpressionAccess().getRightETSpecificationCompositionExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETSpecificationCompositionExpression_in_ruleETSpecificationDisjunctionExpression3975);
            	    lv_right_3_0=ruleETSpecificationCompositionExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETSpecificationDisjunctionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETSpecificationCompositionExpression");
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
    // $ANTLR end "ruleETSpecificationDisjunctionExpression"


    // $ANTLR start "entryRuleETSpecificationCompositionExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1753:1: entryRuleETSpecificationCompositionExpression returns [EObject current=null] : iv_ruleETSpecificationCompositionExpression= ruleETSpecificationCompositionExpression EOF ;
    public final EObject entryRuleETSpecificationCompositionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationCompositionExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1754:2: (iv_ruleETSpecificationCompositionExpression= ruleETSpecificationCompositionExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1755:2: iv_ruleETSpecificationCompositionExpression= ruleETSpecificationCompositionExpression EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationCompositionExpressionRule()); 
            pushFollow(FOLLOW_ruleETSpecificationCompositionExpression_in_entryRuleETSpecificationCompositionExpression4013);
            iv_ruleETSpecificationCompositionExpression=ruleETSpecificationCompositionExpression();

            state._fsp--;

             current =iv_ruleETSpecificationCompositionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationCompositionExpression4023); 

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
    // $ANTLR end "entryRuleETSpecificationCompositionExpression"


    // $ANTLR start "ruleETSpecificationCompositionExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1762:1: ruleETSpecificationCompositionExpression returns [EObject current=null] : (this_ETPrimarySpecificationExpression_0= ruleETPrimarySpecificationExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )* ) ;
    public final EObject ruleETSpecificationCompositionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETPrimarySpecificationExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1765:28: ( (this_ETPrimarySpecificationExpression_0= ruleETPrimarySpecificationExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1766:1: (this_ETPrimarySpecificationExpression_0= ruleETPrimarySpecificationExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1766:1: (this_ETPrimarySpecificationExpression_0= ruleETPrimarySpecificationExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1767:5: this_ETPrimarySpecificationExpression_0= ruleETPrimarySpecificationExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETSpecificationCompositionExpressionAccess().getETPrimarySpecificationExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETPrimarySpecificationExpression_in_ruleETSpecificationCompositionExpression4070);
            this_ETPrimarySpecificationExpression_0=ruleETPrimarySpecificationExpression();

            state._fsp--;

             
                    current = this_ETPrimarySpecificationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1775:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1775:2: () otherlv_2= '|' ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1775:2: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1776:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleETSpecificationCompositionExpression4091); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETSpecificationCompositionExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1785:1: ( (lv_right_3_0= ruleETPrimarySpecificationExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1786:1: (lv_right_3_0= ruleETPrimarySpecificationExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1786:1: (lv_right_3_0= ruleETPrimarySpecificationExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1787:3: lv_right_3_0= ruleETPrimarySpecificationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETSpecificationCompositionExpressionAccess().getRightETPrimarySpecificationExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETPrimarySpecificationExpression_in_ruleETSpecificationCompositionExpression4112);
            	    lv_right_3_0=ruleETPrimarySpecificationExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETSpecificationCompositionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETPrimarySpecificationExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleETSpecificationCompositionExpression"


    // $ANTLR start "entryRuleETPrimarySpecificationExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1811:1: entryRuleETPrimarySpecificationExpression returns [EObject current=null] : iv_ruleETPrimarySpecificationExpression= ruleETPrimarySpecificationExpression EOF ;
    public final EObject entryRuleETPrimarySpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETPrimarySpecificationExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1812:2: (iv_ruleETPrimarySpecificationExpression= ruleETPrimarySpecificationExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1813:2: iv_ruleETPrimarySpecificationExpression= ruleETPrimarySpecificationExpression EOF
            {
             newCompositeNode(grammarAccess.getETPrimarySpecificationExpressionRule()); 
            pushFollow(FOLLOW_ruleETPrimarySpecificationExpression_in_entryRuleETPrimarySpecificationExpression4150);
            iv_ruleETPrimarySpecificationExpression=ruleETPrimarySpecificationExpression();

            state._fsp--;

             current =iv_ruleETPrimarySpecificationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETPrimarySpecificationExpression4160); 

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
    // $ANTLR end "entryRuleETPrimarySpecificationExpression"


    // $ANTLR start "ruleETPrimarySpecificationExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1820:1: ruleETPrimarySpecificationExpression returns [EObject current=null] : (this_ETSpecificationReference_0= ruleETSpecificationReference | this_ETSpecificationInstantiation_1= ruleETSpecificationInstantiation | (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' ) ) ;
    public final EObject ruleETPrimarySpecificationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETSpecificationReference_0 = null;

        EObject this_ETSpecificationInstantiation_1 = null;

        EObject this_ETSpecificationExpression_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1823:28: ( (this_ETSpecificationReference_0= ruleETSpecificationReference | this_ETSpecificationInstantiation_1= ruleETSpecificationInstantiation | (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1824:1: (this_ETSpecificationReference_0= ruleETSpecificationReference | this_ETSpecificationInstantiation_1= ruleETSpecificationInstantiation | (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1824:1: (this_ETSpecificationReference_0= ruleETSpecificationReference | this_ETSpecificationInstantiation_1= ruleETSpecificationInstantiation | (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==36) ) {
                    alt27=2;
                }
                else if ( (LA27_1==EOF||(LA27_1>=33 && LA27_1<=35)||(LA27_1>=37 && LA27_1<=40)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==36) ) {
                alt27=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1825:5: this_ETSpecificationReference_0= ruleETSpecificationReference
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimarySpecificationExpressionAccess().getETSpecificationReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationReference_in_ruleETPrimarySpecificationExpression4207);
                    this_ETSpecificationReference_0=ruleETSpecificationReference();

                    state._fsp--;

                     
                            current = this_ETSpecificationReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1835:5: this_ETSpecificationInstantiation_1= ruleETSpecificationInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimarySpecificationExpressionAccess().getETSpecificationInstantiationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationInstantiation_in_ruleETPrimarySpecificationExpression4234);
                    this_ETSpecificationInstantiation_1=ruleETSpecificationInstantiation();

                    state._fsp--;

                     
                            current = this_ETSpecificationInstantiation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1844:6: (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1844:6: (otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1844:8: otherlv_2= '(' this_ETSpecificationExpression_3= ruleETSpecificationExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleETPrimarySpecificationExpression4252); 

                        	newLeafNode(otherlv_2, grammarAccess.getETPrimarySpecificationExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getETPrimarySpecificationExpressionAccess().getETSpecificationExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationExpression_in_ruleETPrimarySpecificationExpression4274);
                    this_ETSpecificationExpression_3=ruleETSpecificationExpression();

                    state._fsp--;

                     
                            current = this_ETSpecificationExpression_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleETPrimarySpecificationExpression4285); 

                        	newLeafNode(otherlv_4, grammarAccess.getETPrimarySpecificationExpressionAccess().getRightParenthesisKeyword_2_2());
                        

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
    // $ANTLR end "ruleETPrimarySpecificationExpression"


    // $ANTLR start "entryRuleETSpecificationReference"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1869:1: entryRuleETSpecificationReference returns [EObject current=null] : iv_ruleETSpecificationReference= ruleETSpecificationReference EOF ;
    public final EObject entryRuleETSpecificationReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationReference = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1870:2: (iv_ruleETSpecificationReference= ruleETSpecificationReference EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1871:2: iv_ruleETSpecificationReference= ruleETSpecificationReference EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationReferenceRule()); 
            pushFollow(FOLLOW_ruleETSpecificationReference_in_entryRuleETSpecificationReference4322);
            iv_ruleETSpecificationReference=ruleETSpecificationReference();

            state._fsp--;

             current =iv_ruleETSpecificationReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationReference4332); 

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
    // $ANTLR end "entryRuleETSpecificationReference"


    // $ANTLR start "ruleETSpecificationReference"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1878:1: ruleETSpecificationReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleETSpecificationReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1881:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1882:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1882:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1882:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1882:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1883:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETSpecificationReferenceAccess().getETSpecificationReferenceAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1888:2: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1889:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1889:1: (otherlv_1= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1890:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETSpecificationReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSpecificationReference4386); 

            		newLeafNode(otherlv_1, grammarAccess.getETSpecificationReferenceAccess().getSpecificationETSpecificationCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleETSpecificationReference"


    // $ANTLR start "entryRuleETSpecificationInstantiation"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1909:1: entryRuleETSpecificationInstantiation returns [EObject current=null] : iv_ruleETSpecificationInstantiation= ruleETSpecificationInstantiation EOF ;
    public final EObject entryRuleETSpecificationInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationInstantiation = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1910:2: (iv_ruleETSpecificationInstantiation= ruleETSpecificationInstantiation EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1911:2: iv_ruleETSpecificationInstantiation= ruleETSpecificationInstantiation EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationInstantiationRule()); 
            pushFollow(FOLLOW_ruleETSpecificationInstantiation_in_entryRuleETSpecificationInstantiation4422);
            iv_ruleETSpecificationInstantiation=ruleETSpecificationInstantiation();

            state._fsp--;

             current =iv_ruleETSpecificationInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationInstantiation4432); 

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
    // $ANTLR end "entryRuleETSpecificationInstantiation"


    // $ANTLR start "ruleETSpecificationInstantiation"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1918:1: ruleETSpecificationInstantiation returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleETSpecificationInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1921:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )? otherlv_6= ')' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1922:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1922:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )? otherlv_6= ')' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1922:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )? otherlv_6= ')'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1922:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETSpecificationInstantiationAccess().getETSpecificationInstantiationAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1928:2: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1929:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1929:1: (otherlv_1= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1930:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETSpecificationInstantiationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSpecificationInstantiation4486); 

            		newLeafNode(otherlv_1, grammarAccess.getETSpecificationInstantiationAccess().getTemplateETSpecificationTemplateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleETSpecificationInstantiation4498); 

                	newLeafNode(otherlv_2, grammarAccess.getETSpecificationInstantiationAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1945:1: ( ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==19||LA29_0==36||(LA29_0>=49 && LA29_0<=50)||LA29_0==78||(LA29_0>=82 && LA29_0<=85)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1945:2: ( (lv_arguments_3_0= ruleETExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )*
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1945:2: ( (lv_arguments_3_0= ruleETExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1946:1: (lv_arguments_3_0= ruleETExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1946:1: (lv_arguments_3_0= ruleETExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1947:3: lv_arguments_3_0= ruleETExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETSpecificationInstantiationAccess().getArgumentsETExpressionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETExpression_in_ruleETSpecificationInstantiation4520);
                    lv_arguments_3_0=ruleETExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETSpecificationInstantiationRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_3_0, 
                            		"ETExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1963:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1963:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleETExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleETSpecificationInstantiation4533); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getETSpecificationInstantiationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1967:1: ( (lv_arguments_5_0= ruleETExpression ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1968:1: (lv_arguments_5_0= ruleETExpression )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1968:1: (lv_arguments_5_0= ruleETExpression )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1969:3: lv_arguments_5_0= ruleETExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETSpecificationInstantiationAccess().getArgumentsETExpressionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETExpression_in_ruleETSpecificationInstantiation4554);
                    	    lv_arguments_5_0=ruleETExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETSpecificationInstantiationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_5_0, 
                    	            		"ETExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleETSpecificationInstantiation4570); 

                	newLeafNode(otherlv_6, grammarAccess.getETSpecificationInstantiationAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleETSpecificationInstantiation"


    // $ANTLR start "entryRuleETSpecification"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1997:1: entryRuleETSpecification returns [EObject current=null] : iv_ruleETSpecification= ruleETSpecification EOF ;
    public final EObject entryRuleETSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecification = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1998:2: (iv_ruleETSpecification= ruleETSpecification EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:1999:2: iv_ruleETSpecification= ruleETSpecification EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationRule()); 
            pushFollow(FOLLOW_ruleETSpecification_in_entryRuleETSpecification4606);
            iv_ruleETSpecification=ruleETSpecification();

            state._fsp--;

             current =iv_ruleETSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecification4616); 

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
    // $ANTLR end "entryRuleETSpecification"


    // $ANTLR start "ruleETSpecification"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2006:1: ruleETSpecification returns [EObject current=null] : (this_ETSpecificationBinding_0= ruleETSpecificationBinding | this_ETSpecificationDefinition_1= ruleETSpecificationDefinition ) ;
    public final EObject ruleETSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_ETSpecificationBinding_0 = null;

        EObject this_ETSpecificationDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2009:28: ( (this_ETSpecificationBinding_0= ruleETSpecificationBinding | this_ETSpecificationDefinition_1= ruleETSpecificationDefinition ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2010:1: (this_ETSpecificationBinding_0= ruleETSpecificationBinding | this_ETSpecificationDefinition_1= ruleETSpecificationDefinition )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2010:1: (this_ETSpecificationBinding_0= ruleETSpecificationBinding | this_ETSpecificationDefinition_1= ruleETSpecificationDefinition )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=39 && LA30_0<=40)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2011:5: this_ETSpecificationBinding_0= ruleETSpecificationBinding
                    {
                     
                            newCompositeNode(grammarAccess.getETSpecificationAccess().getETSpecificationBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationBinding_in_ruleETSpecification4663);
                    this_ETSpecificationBinding_0=ruleETSpecificationBinding();

                    state._fsp--;

                     
                            current = this_ETSpecificationBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2021:5: this_ETSpecificationDefinition_1= ruleETSpecificationDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getETSpecificationAccess().getETSpecificationDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationDefinition_in_ruleETSpecification4690);
                    this_ETSpecificationDefinition_1=ruleETSpecificationDefinition();

                    state._fsp--;

                     
                            current = this_ETSpecificationDefinition_1; 
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
    // $ANTLR end "ruleETSpecification"


    // $ANTLR start "entryRuleETSpecificationBinding"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2037:1: entryRuleETSpecificationBinding returns [EObject current=null] : iv_ruleETSpecificationBinding= ruleETSpecificationBinding EOF ;
    public final EObject entryRuleETSpecificationBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationBinding = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2038:2: (iv_ruleETSpecificationBinding= ruleETSpecificationBinding EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2039:2: iv_ruleETSpecificationBinding= ruleETSpecificationBinding EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationBindingRule()); 
            pushFollow(FOLLOW_ruleETSpecificationBinding_in_entryRuleETSpecificationBinding4725);
            iv_ruleETSpecificationBinding=ruleETSpecificationBinding();

            state._fsp--;

             current =iv_ruleETSpecificationBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationBinding4735); 

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
    // $ANTLR end "entryRuleETSpecificationBinding"


    // $ANTLR start "ruleETSpecificationBinding"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2046:1: ruleETSpecificationBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleETSpecificationExpression ) ) ) ;
    public final EObject ruleETSpecificationBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2049:28: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleETSpecificationExpression ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2050:1: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleETSpecificationExpression ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2050:1: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleETSpecificationExpression ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2050:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleETSpecificationExpression ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleETSpecificationBinding4772); 

                	newLeafNode(otherlv_0, grammarAccess.getETSpecificationBindingAccess().getLetKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2054:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2055:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2055:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2056:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSpecificationBinding4789); 

            			newLeafNode(lv_name_1_0, grammarAccess.getETSpecificationBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETSpecificationBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleETSpecificationBinding4806); 

                	newLeafNode(otherlv_2, grammarAccess.getETSpecificationBindingAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2076:1: ( (lv_expression_3_0= ruleETSpecificationExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2077:1: (lv_expression_3_0= ruleETSpecificationExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2077:1: (lv_expression_3_0= ruleETSpecificationExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2078:3: lv_expression_3_0= ruleETSpecificationExpression
            {
             
            	        newCompositeNode(grammarAccess.getETSpecificationBindingAccess().getExpressionETSpecificationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleETSpecificationExpression_in_ruleETSpecificationBinding4827);
            lv_expression_3_0=ruleETSpecificationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSpecificationBindingRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"ETSpecificationExpression");
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
    // $ANTLR end "ruleETSpecificationBinding"


    // $ANTLR start "entryRuleETSpecificationDefinition"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2102:1: entryRuleETSpecificationDefinition returns [EObject current=null] : iv_ruleETSpecificationDefinition= ruleETSpecificationDefinition EOF ;
    public final EObject entryRuleETSpecificationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationDefinition = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2103:2: (iv_ruleETSpecificationDefinition= ruleETSpecificationDefinition EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2104:2: iv_ruleETSpecificationDefinition= ruleETSpecificationDefinition EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationDefinitionRule()); 
            pushFollow(FOLLOW_ruleETSpecificationDefinition_in_entryRuleETSpecificationDefinition4863);
            iv_ruleETSpecificationDefinition=ruleETSpecificationDefinition();

            state._fsp--;

             current =iv_ruleETSpecificationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationDefinition4873); 

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
    // $ANTLR end "entryRuleETSpecificationDefinition"


    // $ANTLR start "ruleETSpecificationDefinition"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2111:1: ruleETSpecificationDefinition returns [EObject current=null] : (this_ETSpecificationTemplate_0= ruleETSpecificationTemplate | ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) ) ) ;
    public final EObject ruleETSpecificationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject this_ETSpecificationTemplate_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2114:28: ( (this_ETSpecificationTemplate_0= ruleETSpecificationTemplate | ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2115:1: (this_ETSpecificationTemplate_0= ruleETSpecificationTemplate | ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2115:1: (this_ETSpecificationTemplate_0= ruleETSpecificationTemplate | ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            else if ( (LA31_0==39) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2116:5: this_ETSpecificationTemplate_0= ruleETSpecificationTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getETSpecificationDefinitionAccess().getETSpecificationTemplateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETSpecificationTemplate_in_ruleETSpecificationDefinition4920);
                    this_ETSpecificationTemplate_0=ruleETSpecificationTemplate();

                    state._fsp--;

                     
                            current = this_ETSpecificationTemplate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2125:6: ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2125:6: ( () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2125:7: () otherlv_2= 'spec' ( (lv_name_3_0= RULE_ID ) ) ( (lv_body_4_0= ruleETSpecificationBody ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2125:7: ()
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2126:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getETSpecificationDefinitionAccess().getETSpecificationDefinitionAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleETSpecificationDefinition4947); 

                        	newLeafNode(otherlv_2, grammarAccess.getETSpecificationDefinitionAccess().getSpecKeyword_1_1());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2135:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2136:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2136:1: (lv_name_3_0= RULE_ID )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2137:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSpecificationDefinition4964); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getETSpecificationDefinitionAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getETSpecificationDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2153:2: ( (lv_body_4_0= ruleETSpecificationBody ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2154:1: (lv_body_4_0= ruleETSpecificationBody )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2154:1: (lv_body_4_0= ruleETSpecificationBody )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2155:3: lv_body_4_0= ruleETSpecificationBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getETSpecificationDefinitionAccess().getBodyETSpecificationBodyParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETSpecificationBody_in_ruleETSpecificationDefinition4990);
                    lv_body_4_0=ruleETSpecificationBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETSpecificationDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_4_0, 
                            		"ETSpecificationBody");
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
    // $ANTLR end "ruleETSpecificationDefinition"


    // $ANTLR start "entryRuleETSpecificationTemplate"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2179:1: entryRuleETSpecificationTemplate returns [EObject current=null] : iv_ruleETSpecificationTemplate= ruleETSpecificationTemplate EOF ;
    public final EObject entryRuleETSpecificationTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationTemplate = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2180:2: (iv_ruleETSpecificationTemplate= ruleETSpecificationTemplate EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2181:2: iv_ruleETSpecificationTemplate= ruleETSpecificationTemplate EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationTemplateRule()); 
            pushFollow(FOLLOW_ruleETSpecificationTemplate_in_entryRuleETSpecificationTemplate5027);
            iv_ruleETSpecificationTemplate=ruleETSpecificationTemplate();

            state._fsp--;

             current =iv_ruleETSpecificationTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationTemplate5037); 

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
    // $ANTLR end "entryRuleETSpecificationTemplate"


    // $ANTLR start "ruleETSpecificationTemplate"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2188:1: ruleETSpecificationTemplate returns [EObject current=null] : ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleETSpecificationBody ) ) ) ;
    public final EObject ruleETSpecificationTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2191:28: ( ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleETSpecificationBody ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2192:1: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleETSpecificationBody ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2192:1: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleETSpecificationBody ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2192:2: () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleETSpecificationBody ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2192:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2193:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETSpecificationTemplateAccess().getETSpecificationTemplateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleETSpecificationTemplate5083); 

                	newLeafNode(otherlv_1, grammarAccess.getETSpecificationTemplateAccess().getTemplateKeyword_1());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2202:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2203:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2203:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2204:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSpecificationTemplate5100); 

            			newLeafNode(lv_name_2_0, grammarAccess.getETSpecificationTemplateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETSpecificationTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleETSpecificationTemplate5117); 

                	newLeafNode(otherlv_3, grammarAccess.getETSpecificationTemplateAccess().getLeftParenthesisKeyword_3());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2224:1: ( ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||(LA33_0>=15 && LA33_0<=17)||(LA33_0>=25 && LA33_0<=32)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2224:2: ( (lv_parameters_4_0= ruleETParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )*
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2224:2: ( (lv_parameters_4_0= ruleETParameter ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2225:1: (lv_parameters_4_0= ruleETParameter )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2225:1: (lv_parameters_4_0= ruleETParameter )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2226:3: lv_parameters_4_0= ruleETParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getETSpecificationTemplateAccess().getParametersETParameterParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETParameter_in_ruleETSpecificationTemplate5139);
                    lv_parameters_4_0=ruleETParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETSpecificationTemplateRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"ETParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2242:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2242:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleETParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleETSpecificationTemplate5152); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getETSpecificationTemplateAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2246:1: ( (lv_parameters_6_0= ruleETParameter ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2247:1: (lv_parameters_6_0= ruleETParameter )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2247:1: (lv_parameters_6_0= ruleETParameter )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2248:3: lv_parameters_6_0= ruleETParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETSpecificationTemplateAccess().getParametersETParameterParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETParameter_in_ruleETSpecificationTemplate5173);
                    	    lv_parameters_6_0=ruleETParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETSpecificationTemplateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_6_0, 
                    	            		"ETParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleETSpecificationTemplate5189); 

                	newLeafNode(otherlv_7, grammarAccess.getETSpecificationTemplateAccess().getRightParenthesisKeyword_5());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2268:1: ( (lv_body_8_0= ruleETSpecificationBody ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2269:1: (lv_body_8_0= ruleETSpecificationBody )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2269:1: (lv_body_8_0= ruleETSpecificationBody )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2270:3: lv_body_8_0= ruleETSpecificationBody
            {
             
            	        newCompositeNode(grammarAccess.getETSpecificationTemplateAccess().getBodyETSpecificationBodyParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleETSpecificationBody_in_ruleETSpecificationTemplate5210);
            lv_body_8_0=ruleETSpecificationBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSpecificationTemplateRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_8_0, 
                    		"ETSpecificationBody");
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
    // $ANTLR end "ruleETSpecificationTemplate"


    // $ANTLR start "entryRuleETSpecificationBody"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2294:1: entryRuleETSpecificationBody returns [EObject current=null] : iv_ruleETSpecificationBody= ruleETSpecificationBody EOF ;
    public final EObject entryRuleETSpecificationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSpecificationBody = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2295:2: (iv_ruleETSpecificationBody= ruleETSpecificationBody EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2296:2: iv_ruleETSpecificationBody= ruleETSpecificationBody EOF
            {
             newCompositeNode(grammarAccess.getETSpecificationBodyRule()); 
            pushFollow(FOLLOW_ruleETSpecificationBody_in_entryRuleETSpecificationBody5246);
            iv_ruleETSpecificationBody=ruleETSpecificationBody();

            state._fsp--;

             current =iv_ruleETSpecificationBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSpecificationBody5256); 

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
    // $ANTLR end "entryRuleETSpecificationBody"


    // $ANTLR start "ruleETSpecificationBody"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2303:1: ruleETSpecificationBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_declarations_1_0= ruleETDeclarations ) ) otherlv_2= 'initial' ( (lv_initialLocation_3_0= ruleETLocation ) ) ( (lv_locations_4_0= ruleETLocation ) )* otherlv_5= '}' ) ;
    public final EObject ruleETSpecificationBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_initialLocation_3_0 = null;

        EObject lv_locations_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2306:28: ( (otherlv_0= '{' ( (lv_declarations_1_0= ruleETDeclarations ) ) otherlv_2= 'initial' ( (lv_initialLocation_3_0= ruleETLocation ) ) ( (lv_locations_4_0= ruleETLocation ) )* otherlv_5= '}' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2307:1: (otherlv_0= '{' ( (lv_declarations_1_0= ruleETDeclarations ) ) otherlv_2= 'initial' ( (lv_initialLocation_3_0= ruleETLocation ) ) ( (lv_locations_4_0= ruleETLocation ) )* otherlv_5= '}' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2307:1: (otherlv_0= '{' ( (lv_declarations_1_0= ruleETDeclarations ) ) otherlv_2= 'initial' ( (lv_initialLocation_3_0= ruleETLocation ) ) ( (lv_locations_4_0= ruleETLocation ) )* otherlv_5= '}' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2307:3: otherlv_0= '{' ( (lv_declarations_1_0= ruleETDeclarations ) ) otherlv_2= 'initial' ( (lv_initialLocation_3_0= ruleETLocation ) ) ( (lv_locations_4_0= ruleETLocation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleETSpecificationBody5293); 

                	newLeafNode(otherlv_0, grammarAccess.getETSpecificationBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2311:1: ( (lv_declarations_1_0= ruleETDeclarations ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2312:1: (lv_declarations_1_0= ruleETDeclarations )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2312:1: (lv_declarations_1_0= ruleETDeclarations )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2313:3: lv_declarations_1_0= ruleETDeclarations
            {
             
            	        newCompositeNode(grammarAccess.getETSpecificationBodyAccess().getDeclarationsETDeclarationsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETDeclarations_in_ruleETSpecificationBody5314);
            lv_declarations_1_0=ruleETDeclarations();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSpecificationBodyRule());
            	        }
                   		set(
                   			current, 
                   			"declarations",
                    		lv_declarations_1_0, 
                    		"ETDeclarations");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleETSpecificationBody5326); 

                	newLeafNode(otherlv_2, grammarAccess.getETSpecificationBodyAccess().getInitialKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2333:1: ( (lv_initialLocation_3_0= ruleETLocation ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2334:1: (lv_initialLocation_3_0= ruleETLocation )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2334:1: (lv_initialLocation_3_0= ruleETLocation )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2335:3: lv_initialLocation_3_0= ruleETLocation
            {
             
            	        newCompositeNode(grammarAccess.getETSpecificationBodyAccess().getInitialLocationETLocationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleETLocation_in_ruleETSpecificationBody5347);
            lv_initialLocation_3_0=ruleETLocation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSpecificationBodyRule());
            	        }
                   		set(
                   			current, 
                   			"initialLocation",
                    		lv_initialLocation_3_0, 
                    		"ETLocation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2351:2: ( (lv_locations_4_0= ruleETLocation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==15||LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2352:1: (lv_locations_4_0= ruleETLocation )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2352:1: (lv_locations_4_0= ruleETLocation )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2353:3: lv_locations_4_0= ruleETLocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETSpecificationBodyAccess().getLocationsETLocationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETLocation_in_ruleETSpecificationBody5368);
            	    lv_locations_4_0=ruleETLocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETSpecificationBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"locations",
            	            		lv_locations_4_0, 
            	            		"ETLocation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleETSpecificationBody5381); 

                	newLeafNode(otherlv_5, grammarAccess.getETSpecificationBodyAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleETSpecificationBody"


    // $ANTLR start "entryRuleETParameter"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2381:1: entryRuleETParameter returns [EObject current=null] : iv_ruleETParameter= ruleETParameter EOF ;
    public final EObject entryRuleETParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETParameter = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2382:2: (iv_ruleETParameter= ruleETParameter EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2383:2: iv_ruleETParameter= ruleETParameter EOF
            {
             newCompositeNode(grammarAccess.getETParameterRule()); 
            pushFollow(FOLLOW_ruleETParameter_in_entryRuleETParameter5417);
            iv_ruleETParameter=ruleETParameter();

            state._fsp--;

             current =iv_ruleETParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETParameter5427); 

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
    // $ANTLR end "entryRuleETParameter"


    // $ANTLR start "ruleETParameter"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2390:1: ruleETParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleETType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* ) ;
    public final EObject ruleETParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2393:28: ( ( ( (lv_type_0_0= ruleETType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2394:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2394:1: ( ( (lv_type_0_0= ruleETType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2394:2: ( (lv_type_0_0= ruleETType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2394:2: ( (lv_type_0_0= ruleETType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2395:1: (lv_type_0_0= ruleETType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2395:1: (lv_type_0_0= ruleETType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2396:3: lv_type_0_0= ruleETType
            {
             
            	        newCompositeNode(grammarAccess.getETParameterAccess().getTypeETTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETType_in_ruleETParameter5473);
            lv_type_0_0=ruleETType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ETType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2412:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2413:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2413:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETParameter5490); 

            			newLeafNode(lv_name_1_0, grammarAccess.getETParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2430:2: ( (lv_dimensions_2_0= ruleETArrayDeclaration ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==12) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2431:1: (lv_dimensions_2_0= ruleETArrayDeclaration )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2431:1: (lv_dimensions_2_0= ruleETArrayDeclaration )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2432:3: lv_dimensions_2_0= ruleETArrayDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETParameterAccess().getDimensionsETArrayDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETArrayDeclaration_in_ruleETParameter5516);
            	    lv_dimensions_2_0=ruleETArrayDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_2_0, 
            	            		"ETArrayDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleETParameter"


    // $ANTLR start "entryRuleETLocation"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2456:1: entryRuleETLocation returns [EObject current=null] : iv_ruleETLocation= ruleETLocation EOF ;
    public final EObject entryRuleETLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETLocation = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2457:2: (iv_ruleETLocation= ruleETLocation EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2458:2: iv_ruleETLocation= ruleETLocation EOF
            {
             newCompositeNode(grammarAccess.getETLocationRule()); 
            pushFollow(FOLLOW_ruleETLocation_in_entryRuleETLocation5553);
            iv_ruleETLocation=ruleETLocation();

            state._fsp--;

             current =iv_ruleETLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETLocation5563); 

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
    // $ANTLR end "entryRuleETLocation"


    // $ANTLR start "ruleETLocation"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2465:1: ruleETLocation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )? ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleETLocation() throws RecognitionException {
        EObject current = null;

        Token lv_urgent_1_0=null;
        Token lv_universal_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_invariants_6_0 = null;

        EObject lv_invariants_8_0 = null;

        EObject lv_edges_10_0 = null;

        EObject lv_edges_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2468:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )? ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )? otherlv_13= '}' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2469:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )? ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )? otherlv_13= '}' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2469:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )? ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )? otherlv_13= '}' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2469:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )? ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )? otherlv_13= '}'
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2469:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2471:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2471:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2472:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getETLocationAccess().getUnorderedGroup_0());
            	
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2475:2: ( ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2476:3: ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )*
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2476:3: ( ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( LA36_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2478:4: ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2478:4: ({...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2479:5: {...}? => ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETLocation", "getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2479:107: ( ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2480:6: ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2483:6: ({...}? => ( (lv_urgent_1_0= 'urgent' ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2483:7: {...}? => ( (lv_urgent_1_0= 'urgent' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETLocation", "true");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2483:16: ( (lv_urgent_1_0= 'urgent' ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2484:1: (lv_urgent_1_0= 'urgent' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2484:1: (lv_urgent_1_0= 'urgent' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2485:3: lv_urgent_1_0= 'urgent'
            	    {
            	    lv_urgent_1_0=(Token)match(input,15,FOLLOW_15_in_ruleETLocation5651); 

            	            newLeafNode(lv_urgent_1_0, grammarAccess.getETLocationAccess().getUrgentUrgentKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getETLocationRule());
            	    	        }
            	           		setWithLastConsumed(current, "urgent", true, "urgent");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETLocationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2505:4: ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2505:4: ({...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2506:5: {...}? => ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETLocation", "getUnorderedGroupHelper().canSelect(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2506:107: ( ({...}? => ( (lv_universal_2_0= 'universal' ) ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2507:6: ({...}? => ( (lv_universal_2_0= 'universal' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getETLocationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2510:6: ({...}? => ( (lv_universal_2_0= 'universal' ) ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2510:7: {...}? => ( (lv_universal_2_0= 'universal' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETLocation", "true");
            	    }
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2510:16: ( (lv_universal_2_0= 'universal' ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2511:1: (lv_universal_2_0= 'universal' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2511:1: (lv_universal_2_0= 'universal' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2512:3: lv_universal_2_0= 'universal'
            	    {
            	    lv_universal_2_0=(Token)match(input,42,FOLLOW_42_in_ruleETLocation5736); 

            	            newLeafNode(lv_universal_2_0, grammarAccess.getETLocationAccess().getUniversalUniversalKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getETLocationRule());
            	    	        }
            	           		setWithLastConsumed(current, "universal", true, "universal");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETLocationAccess().getUnorderedGroup_0());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getETLocationAccess().getUnorderedGroup_0());
            	

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2539:2: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2540:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2540:1: (lv_name_3_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2541:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETLocation5806); 

            			newLeafNode(lv_name_3_0, grammarAccess.getETLocationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleETLocation5823); 

                	newLeafNode(otherlv_4, grammarAccess.getETLocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2561:1: (otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2561:3: otherlv_5= 'invariant' ( (lv_invariants_6_0= ruleETExpression ) ) (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )* otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleETLocation5836); 

                        	newLeafNode(otherlv_5, grammarAccess.getETLocationAccess().getInvariantKeyword_3_0());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2565:1: ( (lv_invariants_6_0= ruleETExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2566:1: (lv_invariants_6_0= ruleETExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2566:1: (lv_invariants_6_0= ruleETExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2567:3: lv_invariants_6_0= ruleETExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETLocationAccess().getInvariantsETExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETExpression_in_ruleETLocation5857);
                    lv_invariants_6_0=ruleETExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETLocationRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_6_0, 
                            		"ETExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2583:2: (otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==18) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2583:4: otherlv_7= ',' ( (lv_invariants_8_0= ruleETExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleETLocation5870); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getETLocationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2587:1: ( (lv_invariants_8_0= ruleETExpression ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2588:1: (lv_invariants_8_0= ruleETExpression )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2588:1: (lv_invariants_8_0= ruleETExpression )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2589:3: lv_invariants_8_0= ruleETExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETLocationAccess().getInvariantsETExpressionParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETExpression_in_ruleETLocation5891);
                    	    lv_invariants_8_0=ruleETExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETLocationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_8_0, 
                    	            		"ETExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleETLocation5905); 

                        	newLeafNode(otherlv_9, grammarAccess.getETLocationAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2609:3: ( ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INT)||LA40_0==19||LA40_0==36||(LA40_0>=44 && LA40_0<=45)||(LA40_0>=49 && LA40_0<=50)||LA40_0==78||(LA40_0>=82 && LA40_0<=85)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2609:4: ( (lv_edges_10_0= ruleETEdge ) ) (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )*
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2609:4: ( (lv_edges_10_0= ruleETEdge ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2610:1: (lv_edges_10_0= ruleETEdge )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2610:1: (lv_edges_10_0= ruleETEdge )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2611:3: lv_edges_10_0= ruleETEdge
                    {
                     
                    	        newCompositeNode(grammarAccess.getETLocationAccess().getEdgesETEdgeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETEdge_in_ruleETLocation5929);
                    lv_edges_10_0=ruleETEdge();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETLocationRule());
                    	        }
                           		add(
                           			current, 
                           			"edges",
                            		lv_edges_10_0, 
                            		"ETEdge");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2627:2: (otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2627:4: otherlv_11= ';' ( (lv_edges_12_0= ruleETEdge ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleETLocation5942); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getETLocationAccess().getSemicolonKeyword_4_1_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2631:1: ( (lv_edges_12_0= ruleETEdge ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2632:1: (lv_edges_12_0= ruleETEdge )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2632:1: (lv_edges_12_0= ruleETEdge )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2633:3: lv_edges_12_0= ruleETEdge
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETLocationAccess().getEdgesETEdgeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETEdge_in_ruleETLocation5963);
                    	    lv_edges_12_0=ruleETEdge();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETLocationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"edges",
                    	            		lv_edges_12_0, 
                    	            		"ETEdge");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleETLocation5979); 

                	newLeafNode(otherlv_13, grammarAccess.getETLocationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleETLocation"


    // $ANTLR start "entryRuleETEdge"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2661:1: entryRuleETEdge returns [EObject current=null] : iv_ruleETEdge= ruleETEdge EOF ;
    public final EObject entryRuleETEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETEdge = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2662:2: (iv_ruleETEdge= ruleETEdge EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2663:2: iv_ruleETEdge= ruleETEdge EOF
            {
             newCompositeNode(grammarAccess.getETEdgeRule()); 
            pushFollow(FOLLOW_ruleETEdge_in_entryRuleETEdge6015);
            iv_ruleETEdge=ruleETEdge();

            state._fsp--;

             current =iv_ruleETEdge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETEdge6025); 

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
    // $ANTLR end "entryRuleETEdge"


    // $ANTLR start "ruleETEdge"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2670:1: ruleETEdge returns [EObject current=null] : ( ( (lv_controllable_0_0= 'controllable' ) )? ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) ) ) ;
    public final EObject ruleETEdge() throws RecognitionException {
        EObject current = null;

        Token lv_controllable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        EObject lv_selects_3_0 = null;

        EObject lv_selects_5_0 = null;

        EObject lv_io_8_0 = null;

        EObject lv_guard_12_0 = null;

        EObject lv_updates_17_0 = null;

        EObject lv_io_23_0 = null;

        EObject lv_guard_27_0 = null;

        EObject lv_updates_32_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2673:28: ( ( ( (lv_controllable_0_0= 'controllable' ) )? ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2674:1: ( ( (lv_controllable_0_0= 'controllable' ) )? ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2674:1: ( ( (lv_controllable_0_0= 'controllable' ) )? ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2674:2: ( (lv_controllable_0_0= 'controllable' ) )? ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2674:2: ( (lv_controllable_0_0= 'controllable' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2675:1: (lv_controllable_0_0= 'controllable' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2675:1: (lv_controllable_0_0= 'controllable' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2676:3: lv_controllable_0_0= 'controllable'
                    {
                    lv_controllable_0_0=(Token)match(input,44,FOLLOW_44_in_ruleETEdge6068); 

                            newLeafNode(lv_controllable_0_0, grammarAccess.getETEdgeAccess().getControllableControllableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getETEdgeRule());
                    	        }
                           		setWithLastConsumed(current, "controllable", true, "controllable");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2689:3: ( (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' ) | ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==19||LA49_0==36||(LA49_0>=49 && LA49_0<=50)||LA49_0==78||(LA49_0>=82 && LA49_0<=85)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2689:4: (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2689:4: (otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2689:6: otherlv_1= 'foreach' otherlv_2= '(' ( (lv_selects_3_0= ruleETSelect ) ) (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_io_8_0= ruleETIO ) ) otherlv_9= ':' (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )? ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ) otherlv_22= '}'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleETEdge6096); 

                        	newLeafNode(otherlv_1, grammarAccess.getETEdgeAccess().getForeachKeyword_1_0_0());
                        
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleETEdge6108); 

                        	newLeafNode(otherlv_2, grammarAccess.getETEdgeAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2697:1: ( (lv_selects_3_0= ruleETSelect ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2698:1: (lv_selects_3_0= ruleETSelect )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2698:1: (lv_selects_3_0= ruleETSelect )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2699:3: lv_selects_3_0= ruleETSelect
                    {
                     
                    	        newCompositeNode(grammarAccess.getETEdgeAccess().getSelectsETSelectParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETSelect_in_ruleETEdge6129);
                    lv_selects_3_0=ruleETSelect();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                    	        }
                           		add(
                           			current, 
                           			"selects",
                            		lv_selects_3_0, 
                            		"ETSelect");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2715:2: (otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2715:4: otherlv_4= ',' ( (lv_selects_5_0= ruleETSelect ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleETEdge6142); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getETEdgeAccess().getCommaKeyword_1_0_3_0());
                    	        
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2719:1: ( (lv_selects_5_0= ruleETSelect ) )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2720:1: (lv_selects_5_0= ruleETSelect )
                    	    {
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2720:1: (lv_selects_5_0= ruleETSelect )
                    	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2721:3: lv_selects_5_0= ruleETSelect
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getETEdgeAccess().getSelectsETSelectParserRuleCall_1_0_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETSelect_in_ruleETEdge6163);
                    	    lv_selects_5_0=ruleETSelect();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"selects",
                    	            		lv_selects_5_0, 
                    	            		"ETSelect");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleETEdge6177); 

                        	newLeafNode(otherlv_6, grammarAccess.getETEdgeAccess().getRightParenthesisKeyword_1_0_4());
                        
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleETEdge6189); 

                        	newLeafNode(otherlv_7, grammarAccess.getETEdgeAccess().getLeftCurlyBracketKeyword_1_0_5());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2745:1: ( (lv_io_8_0= ruleETIO ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2746:1: (lv_io_8_0= ruleETIO )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2746:1: (lv_io_8_0= ruleETIO )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2747:3: lv_io_8_0= ruleETIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getETEdgeAccess().getIoETIOParserRuleCall_1_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETIO_in_ruleETEdge6210);
                    lv_io_8_0=ruleETIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_8_0, 
                            		"ETIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleETEdge6222); 

                        	newLeafNode(otherlv_9, grammarAccess.getETEdgeAccess().getColonKeyword_1_0_7());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2767:1: (otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==47) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2767:3: otherlv_10= 'if' otherlv_11= '(' ( (lv_guard_12_0= ruleETExpression ) ) otherlv_13= ')'
                            {
                            otherlv_10=(Token)match(input,47,FOLLOW_47_in_ruleETEdge6235); 

                                	newLeafNode(otherlv_10, grammarAccess.getETEdgeAccess().getIfKeyword_1_0_8_0());
                                
                            otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleETEdge6247); 

                                	newLeafNode(otherlv_11, grammarAccess.getETEdgeAccess().getLeftParenthesisKeyword_1_0_8_1());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2775:1: ( (lv_guard_12_0= ruleETExpression ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2776:1: (lv_guard_12_0= ruleETExpression )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2776:1: (lv_guard_12_0= ruleETExpression )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2777:3: lv_guard_12_0= ruleETExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getETEdgeAccess().getGuardETExpressionParserRuleCall_1_0_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleETExpression_in_ruleETEdge6268);
                            lv_guard_12_0=ruleETExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"guard",
                                    		lv_guard_12_0, 
                                    		"ETExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleETEdge6280); 

                                	newLeafNode(otherlv_13, grammarAccess.getETEdgeAccess().getRightParenthesisKeyword_1_0_8_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2797:3: ( (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) ) | (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==48) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==22) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2797:4: (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2797:4: (otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2797:6: otherlv_14= 'goto' ( (otherlv_15= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleETEdge6296); 

                                	newLeafNode(otherlv_14, grammarAccess.getETEdgeAccess().getGotoKeyword_1_0_9_0_0());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2801:1: ( (otherlv_15= RULE_ID ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2802:1: (otherlv_15= RULE_ID )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2802:1: (otherlv_15= RULE_ID )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2803:3: otherlv_15= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getETEdgeRule());
                            	        }
                                    
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETEdge6316); 

                            		newLeafNode(otherlv_15, grammarAccess.getETEdgeAccess().getTargetETLocationCrossReference_1_0_9_0_1_0()); 
                            	

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2815:6: (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2815:6: (otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2815:8: otherlv_16= '{' ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )* otherlv_19= 'goto' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}'
                            {
                            otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleETEdge6336); 

                                	newLeafNode(otherlv_16, grammarAccess.getETEdgeAccess().getLeftCurlyBracketKeyword_1_0_9_1_0());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2819:1: ( ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';' )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==19||LA44_0==36||(LA44_0>=49 && LA44_0<=50)||LA44_0==78||(LA44_0>=82 && LA44_0<=85)) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2819:2: ( (lv_updates_17_0= ruleETExpression ) ) otherlv_18= ';'
                            	    {
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2819:2: ( (lv_updates_17_0= ruleETExpression ) )
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2820:1: (lv_updates_17_0= ruleETExpression )
                            	    {
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2820:1: (lv_updates_17_0= ruleETExpression )
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2821:3: lv_updates_17_0= ruleETExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getETEdgeAccess().getUpdatesETExpressionParserRuleCall_1_0_9_1_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleETExpression_in_ruleETEdge6358);
                            	    lv_updates_17_0=ruleETExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"updates",
                            	            		lv_updates_17_0, 
                            	            		"ETExpression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleETEdge6370); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getETEdgeAccess().getSemicolonKeyword_1_0_9_1_1_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);

                            otherlv_19=(Token)match(input,48,FOLLOW_48_in_ruleETEdge6384); 

                                	newLeafNode(otherlv_19, grammarAccess.getETEdgeAccess().getGotoKeyword_1_0_9_1_2());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2845:1: ( (otherlv_20= RULE_ID ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2846:1: (otherlv_20= RULE_ID )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2846:1: (otherlv_20= RULE_ID )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2847:3: otherlv_20= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getETEdgeRule());
                            	        }
                                    
                            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETEdge6404); 

                            		newLeafNode(otherlv_20, grammarAccess.getETEdgeAccess().getTargetETLocationCrossReference_1_0_9_1_3_0()); 
                            	

                            }


                            }

                            otherlv_21=(Token)match(input,23,FOLLOW_23_in_ruleETEdge6416); 

                                	newLeafNode(otherlv_21, grammarAccess.getETEdgeAccess().getRightCurlyBracketKeyword_1_0_9_1_4());
                                

                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleETEdge6430); 

                        	newLeafNode(otherlv_22, grammarAccess.getETEdgeAccess().getRightCurlyBracketKeyword_1_0_10());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2867:6: ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2867:6: ( ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2867:7: ( (lv_io_23_0= ruleETIO ) ) otherlv_24= ':' (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )? ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2867:7: ( (lv_io_23_0= ruleETIO ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2868:1: (lv_io_23_0= ruleETIO )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2868:1: (lv_io_23_0= ruleETIO )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2869:3: lv_io_23_0= ruleETIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getETEdgeAccess().getIoETIOParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETIO_in_ruleETEdge6459);
                    lv_io_23_0=ruleETIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_23_0, 
                            		"ETIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_24=(Token)match(input,46,FOLLOW_46_in_ruleETEdge6471); 

                        	newLeafNode(otherlv_24, grammarAccess.getETEdgeAccess().getColonKeyword_1_1_1());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2889:1: (otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==47) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2889:3: otherlv_25= 'if' otherlv_26= '(' ( (lv_guard_27_0= ruleETExpression ) ) otherlv_28= ')'
                            {
                            otherlv_25=(Token)match(input,47,FOLLOW_47_in_ruleETEdge6484); 

                                	newLeafNode(otherlv_25, grammarAccess.getETEdgeAccess().getIfKeyword_1_1_2_0());
                                
                            otherlv_26=(Token)match(input,36,FOLLOW_36_in_ruleETEdge6496); 

                                	newLeafNode(otherlv_26, grammarAccess.getETEdgeAccess().getLeftParenthesisKeyword_1_1_2_1());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2897:1: ( (lv_guard_27_0= ruleETExpression ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2898:1: (lv_guard_27_0= ruleETExpression )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2898:1: (lv_guard_27_0= ruleETExpression )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2899:3: lv_guard_27_0= ruleETExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getETEdgeAccess().getGuardETExpressionParserRuleCall_1_1_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleETExpression_in_ruleETEdge6517);
                            lv_guard_27_0=ruleETExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"guard",
                                    		lv_guard_27_0, 
                                    		"ETExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_28=(Token)match(input,37,FOLLOW_37_in_ruleETEdge6529); 

                                	newLeafNode(otherlv_28, grammarAccess.getETEdgeAccess().getRightParenthesisKeyword_1_1_2_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2919:3: ( (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) ) | (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==48) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==22) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2919:4: (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2919:4: (otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2919:6: otherlv_29= 'goto' ( (otherlv_30= RULE_ID ) )
                            {
                            otherlv_29=(Token)match(input,48,FOLLOW_48_in_ruleETEdge6545); 

                                	newLeafNode(otherlv_29, grammarAccess.getETEdgeAccess().getGotoKeyword_1_1_3_0_0());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2923:1: ( (otherlv_30= RULE_ID ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2924:1: (otherlv_30= RULE_ID )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2924:1: (otherlv_30= RULE_ID )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2925:3: otherlv_30= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getETEdgeRule());
                            	        }
                                    
                            otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETEdge6565); 

                            		newLeafNode(otherlv_30, grammarAccess.getETEdgeAccess().getTargetETLocationCrossReference_1_1_3_0_1_0()); 
                            	

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2937:6: (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2937:6: (otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2937:8: otherlv_31= '{' ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )* otherlv_34= 'goto' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}'
                            {
                            otherlv_31=(Token)match(input,22,FOLLOW_22_in_ruleETEdge6585); 

                                	newLeafNode(otherlv_31, grammarAccess.getETEdgeAccess().getLeftCurlyBracketKeyword_1_1_3_1_0());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2941:1: ( ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';' )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==19||LA47_0==36||(LA47_0>=49 && LA47_0<=50)||LA47_0==78||(LA47_0>=82 && LA47_0<=85)) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2941:2: ( (lv_updates_32_0= ruleETExpression ) ) otherlv_33= ';'
                            	    {
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2941:2: ( (lv_updates_32_0= ruleETExpression ) )
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2942:1: (lv_updates_32_0= ruleETExpression )
                            	    {
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2942:1: (lv_updates_32_0= ruleETExpression )
                            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2943:3: lv_updates_32_0= ruleETExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getETEdgeAccess().getUpdatesETExpressionParserRuleCall_1_1_3_1_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleETExpression_in_ruleETEdge6607);
                            	    lv_updates_32_0=ruleETExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getETEdgeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"updates",
                            	            		lv_updates_32_0, 
                            	            		"ETExpression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleETEdge6619); 

                            	        	newLeafNode(otherlv_33, grammarAccess.getETEdgeAccess().getSemicolonKeyword_1_1_3_1_1_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);

                            otherlv_34=(Token)match(input,48,FOLLOW_48_in_ruleETEdge6633); 

                                	newLeafNode(otherlv_34, grammarAccess.getETEdgeAccess().getGotoKeyword_1_1_3_1_2());
                                
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2967:1: ( (otherlv_35= RULE_ID ) )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2968:1: (otherlv_35= RULE_ID )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2968:1: (otherlv_35= RULE_ID )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2969:3: otherlv_35= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getETEdgeRule());
                            	        }
                                    
                            otherlv_35=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETEdge6653); 

                            		newLeafNode(otherlv_35, grammarAccess.getETEdgeAccess().getTargetETLocationCrossReference_1_1_3_1_3_0()); 
                            	

                            }


                            }

                            otherlv_36=(Token)match(input,23,FOLLOW_23_in_ruleETEdge6665); 

                                	newLeafNode(otherlv_36, grammarAccess.getETEdgeAccess().getRightCurlyBracketKeyword_1_1_3_1_4());
                                

                            }


                            }
                            break;

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
    // $ANTLR end "ruleETEdge"


    // $ANTLR start "entryRuleETIO"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2992:1: entryRuleETIO returns [EObject current=null] : iv_ruleETIO= ruleETIO EOF ;
    public final EObject entryRuleETIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETIO = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2993:2: (iv_ruleETIO= ruleETIO EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:2994:2: iv_ruleETIO= ruleETIO EOF
            {
             newCompositeNode(grammarAccess.getETIORule()); 
            pushFollow(FOLLOW_ruleETIO_in_entryRuleETIO6705);
            iv_ruleETIO=ruleETIO();

            state._fsp--;

             current =iv_ruleETIO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETIO6715); 

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
    // $ANTLR end "entryRuleETIO"


    // $ANTLR start "ruleETIO"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3001:1: ruleETIO returns [EObject current=null] : ( ( (lv_expression_0_0= ruleETExpression ) ) ( (lv_type_1_0= ruleETIOType ) ) ) ;
    public final EObject ruleETIO() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3004:28: ( ( ( (lv_expression_0_0= ruleETExpression ) ) ( (lv_type_1_0= ruleETIOType ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3005:1: ( ( (lv_expression_0_0= ruleETExpression ) ) ( (lv_type_1_0= ruleETIOType ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3005:1: ( ( (lv_expression_0_0= ruleETExpression ) ) ( (lv_type_1_0= ruleETIOType ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3005:2: ( (lv_expression_0_0= ruleETExpression ) ) ( (lv_type_1_0= ruleETIOType ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3005:2: ( (lv_expression_0_0= ruleETExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3006:1: (lv_expression_0_0= ruleETExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3006:1: (lv_expression_0_0= ruleETExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3007:3: lv_expression_0_0= ruleETExpression
            {
             
            	        newCompositeNode(grammarAccess.getETIOAccess().getExpressionETExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETExpression_in_ruleETIO6761);
            lv_expression_0_0=ruleETExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETIORule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"ETExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3023:2: ( (lv_type_1_0= ruleETIOType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3024:1: (lv_type_1_0= ruleETIOType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3024:1: (lv_type_1_0= ruleETIOType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3025:3: lv_type_1_0= ruleETIOType
            {
             
            	        newCompositeNode(grammarAccess.getETIOAccess().getTypeETIOTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETIOType_in_ruleETIO6782);
            lv_type_1_0=ruleETIOType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETIORule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ETIOType");
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
    // $ANTLR end "ruleETIO"


    // $ANTLR start "entryRuleETSelect"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3049:1: entryRuleETSelect returns [EObject current=null] : iv_ruleETSelect= ruleETSelect EOF ;
    public final EObject entryRuleETSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETSelect = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3050:2: (iv_ruleETSelect= ruleETSelect EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3051:2: iv_ruleETSelect= ruleETSelect EOF
            {
             newCompositeNode(grammarAccess.getETSelectRule()); 
            pushFollow(FOLLOW_ruleETSelect_in_entryRuleETSelect6818);
            iv_ruleETSelect=ruleETSelect();

            state._fsp--;

             current =iv_ruleETSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETSelect6828); 

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
    // $ANTLR end "entryRuleETSelect"


    // $ANTLR start "ruleETSelect"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3058:1: ruleETSelect returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETType ) ) ) ;
    public final EObject ruleETSelect() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3061:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETType ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3062:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETType ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3062:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETType ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3062:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleETType ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3062:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3063:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3063:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3064:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETSelect6870); 

            			newLeafNode(lv_name_0_0, grammarAccess.getETSelectAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETSelectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleETSelect6887); 

                	newLeafNode(otherlv_1, grammarAccess.getETSelectAccess().getColonKeyword_1());
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3084:1: ( (lv_type_2_0= ruleETType ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3085:1: (lv_type_2_0= ruleETType )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3085:1: (lv_type_2_0= ruleETType )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3086:3: lv_type_2_0= ruleETType
            {
             
            	        newCompositeNode(grammarAccess.getETSelectAccess().getTypeETTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETType_in_ruleETSelect6908);
            lv_type_2_0=ruleETType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETSelectRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ETType");
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
    // $ANTLR end "ruleETSelect"


    // $ANTLR start "entryRuleETExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3110:1: entryRuleETExpression returns [EObject current=null] : iv_ruleETExpression= ruleETExpression EOF ;
    public final EObject entryRuleETExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3111:2: (iv_ruleETExpression= ruleETExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3112:2: iv_ruleETExpression= ruleETExpression EOF
            {
             newCompositeNode(grammarAccess.getETExpressionRule()); 
            pushFollow(FOLLOW_ruleETExpression_in_entryRuleETExpression6944);
            iv_ruleETExpression=ruleETExpression();

            state._fsp--;

             current =iv_ruleETExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETExpression6954); 

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
    // $ANTLR end "entryRuleETExpression"


    // $ANTLR start "ruleETExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3119:1: ruleETExpression returns [EObject current=null] : (this_ETImplyLogicOrExpression_0= ruleETImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) ) ) ;
    public final EObject ruleETExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_ETImplyLogicOrExpression_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_expression_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3122:28: ( (this_ETImplyLogicOrExpression_0= ruleETImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3123:1: (this_ETImplyLogicOrExpression_0= ruleETImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3123:1: (this_ETImplyLogicOrExpression_0= ruleETImplyLogicOrExpression | ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_INT)||LA51_0==19||LA51_0==36||LA51_0==78||(LA51_0>=82 && LA51_0<=85)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=49 && LA51_0<=50)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3124:5: this_ETImplyLogicOrExpression_0= ruleETImplyLogicOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getETExpressionAccess().getETImplyLogicOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETImplyLogicOrExpression_in_ruleETExpression7001);
                    this_ETImplyLogicOrExpression_0=ruleETImplyLogicOrExpression();

                    state._fsp--;

                     
                            current = this_ETImplyLogicOrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:6: ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:6: ( ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:7: ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) ) otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_type_8_0= ruleETType ) ) otherlv_9= ')' ( (lv_expression_10_0= ruleETExpression ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:7: ( ( () otherlv_2= 'forall' ) | ( () otherlv_4= 'exists' ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==49) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==50) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:8: ( () otherlv_2= 'forall' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:8: ( () otherlv_2= 'forall' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:9: () otherlv_2= 'forall'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3133:9: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3134:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETExpressionAccess().getETForallExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleETExpression7030); 

                                	newLeafNode(otherlv_2, grammarAccess.getETExpressionAccess().getForallKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3144:6: ( () otherlv_4= 'exists' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3144:6: ( () otherlv_4= 'exists' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3144:7: () otherlv_4= 'exists'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3144:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3145:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETExpressionAccess().getETExistsExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleETExpression7059); 

                                	newLeafNode(otherlv_4, grammarAccess.getETExpressionAccess().getExistsKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleETExpression7073); 

                        	newLeafNode(otherlv_5, grammarAccess.getETExpressionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3158:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3159:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3159:1: (lv_name_6_0= RULE_ID )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3160:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETExpression7090); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getETExpressionAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getETExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleETExpression7107); 

                        	newLeafNode(otherlv_7, grammarAccess.getETExpressionAccess().getColonKeyword_1_3());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3180:1: ( (lv_type_8_0= ruleETType ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3181:1: (lv_type_8_0= ruleETType )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3181:1: (lv_type_8_0= ruleETType )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3182:3: lv_type_8_0= ruleETType
                    {
                     
                    	        newCompositeNode(grammarAccess.getETExpressionAccess().getTypeETTypeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETType_in_ruleETExpression7128);
                    lv_type_8_0=ruleETType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_8_0, 
                            		"ETType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleETExpression7140); 

                        	newLeafNode(otherlv_9, grammarAccess.getETExpressionAccess().getRightParenthesisKeyword_1_5());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3202:1: ( (lv_expression_10_0= ruleETExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3203:1: (lv_expression_10_0= ruleETExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3203:1: (lv_expression_10_0= ruleETExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3204:3: lv_expression_10_0= ruleETExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETExpressionAccess().getExpressionETExpressionParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETExpression_in_ruleETExpression7161);
                    lv_expression_10_0=ruleETExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_10_0, 
                            		"ETExpression");
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
    // $ANTLR end "ruleETExpression"


    // $ANTLR start "entryRuleETImplyLogicOrExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3228:1: entryRuleETImplyLogicOrExpression returns [EObject current=null] : iv_ruleETImplyLogicOrExpression= ruleETImplyLogicOrExpression EOF ;
    public final EObject entryRuleETImplyLogicOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETImplyLogicOrExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3229:2: (iv_ruleETImplyLogicOrExpression= ruleETImplyLogicOrExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3230:2: iv_ruleETImplyLogicOrExpression= ruleETImplyLogicOrExpression EOF
            {
             newCompositeNode(grammarAccess.getETImplyLogicOrExpressionRule()); 
            pushFollow(FOLLOW_ruleETImplyLogicOrExpression_in_entryRuleETImplyLogicOrExpression7198);
            iv_ruleETImplyLogicOrExpression=ruleETImplyLogicOrExpression();

            state._fsp--;

             current =iv_ruleETImplyLogicOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETImplyLogicOrExpression7208); 

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
    // $ANTLR end "entryRuleETImplyLogicOrExpression"


    // $ANTLR start "ruleETImplyLogicOrExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3237:1: ruleETImplyLogicOrExpression returns [EObject current=null] : (this_ETLogicAndExpression1_0= ruleETLogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )* ) ;
    public final EObject ruleETImplyLogicOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETLogicAndExpression1_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3240:28: ( (this_ETLogicAndExpression1_0= ruleETLogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3241:1: (this_ETLogicAndExpression1_0= ruleETLogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3241:1: (this_ETLogicAndExpression1_0= ruleETLogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3242:5: this_ETLogicAndExpression1_0= ruleETLogicAndExpression1 ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicAndExpression1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETLogicAndExpression1_in_ruleETImplyLogicOrExpression7255);
            this_ETLogicAndExpression1_0=ruleETLogicAndExpression1();

            state._fsp--;

             
                    current = this_ETLogicAndExpression1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:1: ( ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=51 && LA53_0<=52)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:2: ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= ruleETLogicAndExpression1 ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:2: ( ( () otherlv_2= 'imply' ) | ( () otherlv_4= 'or' ) )
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==51) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==52) ) {
            	        alt52=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:3: ( () otherlv_2= 'imply' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:3: ( () otherlv_2= 'imply' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:4: () otherlv_2= 'imply'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3250:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3251:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleETImplyLogicOrExpression7278); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETImplyLogicOrExpressionAccess().getImplyKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3261:6: ( () otherlv_4= 'or' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3261:6: ( () otherlv_4= 'or' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3261:7: () otherlv_4= 'or'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3261:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3262:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleETImplyLogicOrExpression7307); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETImplyLogicOrExpressionAccess().getOrKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3271:3: ( (lv_right_5_0= ruleETLogicAndExpression1 ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3272:1: (lv_right_5_0= ruleETLogicAndExpression1 )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3272:1: (lv_right_5_0= ruleETLogicAndExpression1 )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3273:3: lv_right_5_0= ruleETLogicAndExpression1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETImplyLogicOrExpressionAccess().getRightETLogicAndExpression1ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETLogicAndExpression1_in_ruleETImplyLogicOrExpression7330);
            	    lv_right_5_0=ruleETLogicAndExpression1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETImplyLogicOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"ETLogicAndExpression1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleETImplyLogicOrExpression"


    // $ANTLR start "entryRuleETLogicAndExpression1"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3297:1: entryRuleETLogicAndExpression1 returns [EObject current=null] : iv_ruleETLogicAndExpression1= ruleETLogicAndExpression1 EOF ;
    public final EObject entryRuleETLogicAndExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETLogicAndExpression1 = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3298:2: (iv_ruleETLogicAndExpression1= ruleETLogicAndExpression1 EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3299:2: iv_ruleETLogicAndExpression1= ruleETLogicAndExpression1 EOF
            {
             newCompositeNode(grammarAccess.getETLogicAndExpression1Rule()); 
            pushFollow(FOLLOW_ruleETLogicAndExpression1_in_entryRuleETLogicAndExpression17368);
            iv_ruleETLogicAndExpression1=ruleETLogicAndExpression1();

            state._fsp--;

             current =iv_ruleETLogicAndExpression1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETLogicAndExpression17378); 

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
    // $ANTLR end "entryRuleETLogicAndExpression1"


    // $ANTLR start "ruleETLogicAndExpression1"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3306:1: ruleETLogicAndExpression1 returns [EObject current=null] : (this_ETLogicNotExpression1_0= ruleETLogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )* ) ;
    public final EObject ruleETLogicAndExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETLogicNotExpression1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3309:28: ( (this_ETLogicNotExpression1_0= ruleETLogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3310:1: (this_ETLogicNotExpression1_0= ruleETLogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3310:1: (this_ETLogicNotExpression1_0= ruleETLogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3311:5: this_ETLogicNotExpression1_0= ruleETLogicNotExpression1 ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETLogicAndExpression1Access().getETLogicNotExpression1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETLogicNotExpression1_in_ruleETLogicAndExpression17425);
            this_ETLogicNotExpression1_0=ruleETLogicNotExpression1();

            state._fsp--;

             
                    current = this_ETLogicNotExpression1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3319:1: ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==53) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3319:2: ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleETLogicNotExpression1 ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3319:2: ( () otherlv_2= 'and' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3319:3: () otherlv_2= 'and'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3319:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3320:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleETLogicAndExpression17447); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETLogicAndExpression1Access().getAndKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3329:2: ( (lv_right_3_0= ruleETLogicNotExpression1 ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3330:1: (lv_right_3_0= ruleETLogicNotExpression1 )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3330:1: (lv_right_3_0= ruleETLogicNotExpression1 )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3331:3: lv_right_3_0= ruleETLogicNotExpression1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETLogicAndExpression1Access().getRightETLogicNotExpression1ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETLogicNotExpression1_in_ruleETLogicAndExpression17469);
            	    lv_right_3_0=ruleETLogicNotExpression1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETLogicAndExpression1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETLogicNotExpression1");
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
    // $ANTLR end "ruleETLogicAndExpression1"


    // $ANTLR start "entryRuleETLogicNotExpression1"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3355:1: entryRuleETLogicNotExpression1 returns [EObject current=null] : iv_ruleETLogicNotExpression1= ruleETLogicNotExpression1 EOF ;
    public final EObject entryRuleETLogicNotExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETLogicNotExpression1 = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3356:2: (iv_ruleETLogicNotExpression1= ruleETLogicNotExpression1 EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3357:2: iv_ruleETLogicNotExpression1= ruleETLogicNotExpression1 EOF
            {
             newCompositeNode(grammarAccess.getETLogicNotExpression1Rule()); 
            pushFollow(FOLLOW_ruleETLogicNotExpression1_in_entryRuleETLogicNotExpression17507);
            iv_ruleETLogicNotExpression1=ruleETLogicNotExpression1();

            state._fsp--;

             current =iv_ruleETLogicNotExpression1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETLogicNotExpression17517); 

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
    // $ANTLR end "entryRuleETLogicNotExpression1"


    // $ANTLR start "ruleETLogicNotExpression1"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3364:1: ruleETLogicNotExpression1 returns [EObject current=null] : this_ETAssignmentExpression_0= ruleETAssignmentExpression ;
    public final EObject ruleETLogicNotExpression1() throws RecognitionException {
        EObject current = null;

        EObject this_ETAssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3367:28: (this_ETAssignmentExpression_0= ruleETAssignmentExpression )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3369:5: this_ETAssignmentExpression_0= ruleETAssignmentExpression
            {
             
                    newCompositeNode(grammarAccess.getETLogicNotExpression1Access().getETAssignmentExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleETAssignmentExpression_in_ruleETLogicNotExpression17563);
            this_ETAssignmentExpression_0=ruleETAssignmentExpression();

            state._fsp--;

             
                    current = this_ETAssignmentExpression_0; 
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
    // $ANTLR end "ruleETLogicNotExpression1"


    // $ANTLR start "entryRuleETAssignmentExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3385:1: entryRuleETAssignmentExpression returns [EObject current=null] : iv_ruleETAssignmentExpression= ruleETAssignmentExpression EOF ;
    public final EObject entryRuleETAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETAssignmentExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3386:2: (iv_ruleETAssignmentExpression= ruleETAssignmentExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3387:2: iv_ruleETAssignmentExpression= ruleETAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getETAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleETAssignmentExpression_in_entryRuleETAssignmentExpression7597);
            iv_ruleETAssignmentExpression=ruleETAssignmentExpression();

            state._fsp--;

             current =iv_ruleETAssignmentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETAssignmentExpression7607); 

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
    // $ANTLR end "entryRuleETAssignmentExpression"


    // $ANTLR start "ruleETAssignmentExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3394:1: ruleETAssignmentExpression returns [EObject current=null] : (this_ETConditionalExpression_0= ruleETConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )? ) ;
    public final EObject ruleETAssignmentExpression() throws RecognitionException {
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
        EObject this_ETConditionalExpression_0 = null;

        EObject lv_right_25_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3397:28: ( (this_ETConditionalExpression_0= ruleETConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )? ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3398:1: (this_ETConditionalExpression_0= ruleETConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )? )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3398:1: (this_ETConditionalExpression_0= ruleETConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )? )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3399:5: this_ETConditionalExpression_0= ruleETConditionalExpression ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getETAssignmentExpressionAccess().getETConditionalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETConditionalExpression_in_ruleETAssignmentExpression7654);
            this_ETConditionalExpression_0=ruleETConditionalExpression();

            state._fsp--;

             
                    current = this_ETConditionalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:1: ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21||(LA56_0>=54 && LA56_0<=64)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) ) ( (lv_right_25_0= ruleETAssignmentExpression ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= ':=' ) | ( () otherlv_6= '+=' ) | ( () otherlv_8= '-=' ) | ( () otherlv_10= '*=' ) | ( () otherlv_12= '/=' ) | ( () otherlv_14= '%=' ) | ( () otherlv_16= '|=' ) | ( () otherlv_18= '&=' ) | ( () otherlv_20= '^=' ) | ( () otherlv_22= '<<=' ) | ( () otherlv_24= '>>=' ) )
                    int alt55=12;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt55=1;
                        }
                        break;
                    case 54:
                        {
                        alt55=2;
                        }
                        break;
                    case 55:
                        {
                        alt55=3;
                        }
                        break;
                    case 56:
                        {
                        alt55=4;
                        }
                        break;
                    case 57:
                        {
                        alt55=5;
                        }
                        break;
                    case 58:
                        {
                        alt55=6;
                        }
                        break;
                    case 59:
                        {
                        alt55=7;
                        }
                        break;
                    case 60:
                        {
                        alt55=8;
                        }
                        break;
                    case 61:
                        {
                        alt55=9;
                        }
                        break;
                    case 62:
                        {
                        alt55=10;
                        }
                        break;
                    case 63:
                        {
                        alt55=11;
                        }
                        break;
                    case 64:
                        {
                        alt55=12;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:3: ( () otherlv_2= '=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:3: ( () otherlv_2= '=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:4: () otherlv_2= '='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3407:4: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3408:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleETAssignmentExpression7677); 

                                	newLeafNode(otherlv_2, grammarAccess.getETAssignmentExpressionAccess().getEqualsSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3418:6: ( () otherlv_4= ':=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3418:6: ( () otherlv_4= ':=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3418:7: () otherlv_4= ':='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3418:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3419:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleETAssignmentExpression7706); 

                                	newLeafNode(otherlv_4, grammarAccess.getETAssignmentExpressionAccess().getColonEqualsSignKeyword_1_0_1_1());
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3429:6: ( () otherlv_6= '+=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3429:6: ( () otherlv_6= '+=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3429:7: () otherlv_6= '+='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3429:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3430:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0(),
                                        current);
                                

                            }

                            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleETAssignmentExpression7735); 

                                	newLeafNode(otherlv_6, grammarAccess.getETAssignmentExpressionAccess().getPlusSignEqualsSignKeyword_1_0_2_1());
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3440:6: ( () otherlv_8= '-=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3440:6: ( () otherlv_8= '-=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3440:7: () otherlv_8= '-='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3440:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3441:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,56,FOLLOW_56_in_ruleETAssignmentExpression7764); 

                                	newLeafNode(otherlv_8, grammarAccess.getETAssignmentExpressionAccess().getHyphenMinusEqualsSignKeyword_1_0_3_1());
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3451:6: ( () otherlv_10= '*=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3451:6: ( () otherlv_10= '*=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3451:7: () otherlv_10= '*='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3451:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3452:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0(),
                                        current);
                                

                            }

                            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleETAssignmentExpression7793); 

                                	newLeafNode(otherlv_10, grammarAccess.getETAssignmentExpressionAccess().getAsteriskEqualsSignKeyword_1_0_4_1());
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3462:6: ( () otherlv_12= '/=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3462:6: ( () otherlv_12= '/=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3462:7: () otherlv_12= '/='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3462:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3463:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0(),
                                        current);
                                

                            }

                            otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleETAssignmentExpression7822); 

                                	newLeafNode(otherlv_12, grammarAccess.getETAssignmentExpressionAccess().getSolidusEqualsSignKeyword_1_0_5_1());
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3473:6: ( () otherlv_14= '%=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3473:6: ( () otherlv_14= '%=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3473:7: () otherlv_14= '%='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3473:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3474:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0(),
                                        current);
                                

                            }

                            otherlv_14=(Token)match(input,59,FOLLOW_59_in_ruleETAssignmentExpression7851); 

                                	newLeafNode(otherlv_14, grammarAccess.getETAssignmentExpressionAccess().getPercentSignEqualsSignKeyword_1_0_6_1());
                                

                            }


                            }
                            break;
                        case 8 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3484:6: ( () otherlv_16= '|=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3484:6: ( () otherlv_16= '|=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3484:7: () otherlv_16= '|='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3484:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3485:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0(),
                                        current);
                                

                            }

                            otherlv_16=(Token)match(input,60,FOLLOW_60_in_ruleETAssignmentExpression7880); 

                                	newLeafNode(otherlv_16, grammarAccess.getETAssignmentExpressionAccess().getVerticalLineEqualsSignKeyword_1_0_7_1());
                                

                            }


                            }
                            break;
                        case 9 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3495:6: ( () otherlv_18= '&=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3495:6: ( () otherlv_18= '&=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3495:7: () otherlv_18= '&='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3495:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3496:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0(),
                                        current);
                                

                            }

                            otherlv_18=(Token)match(input,61,FOLLOW_61_in_ruleETAssignmentExpression7909); 

                                	newLeafNode(otherlv_18, grammarAccess.getETAssignmentExpressionAccess().getAmpersandEqualsSignKeyword_1_0_8_1());
                                

                            }


                            }
                            break;
                        case 10 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3506:6: ( () otherlv_20= '^=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3506:6: ( () otherlv_20= '^=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3506:7: () otherlv_20= '^='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3506:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3507:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0(),
                                        current);
                                

                            }

                            otherlv_20=(Token)match(input,62,FOLLOW_62_in_ruleETAssignmentExpression7938); 

                                	newLeafNode(otherlv_20, grammarAccess.getETAssignmentExpressionAccess().getCircumflexAccentEqualsSignKeyword_1_0_9_1());
                                

                            }


                            }
                            break;
                        case 11 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3517:6: ( () otherlv_22= '<<=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3517:6: ( () otherlv_22= '<<=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3517:7: () otherlv_22= '<<='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3517:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3518:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0(),
                                        current);
                                

                            }

                            otherlv_22=(Token)match(input,63,FOLLOW_63_in_ruleETAssignmentExpression7967); 

                                	newLeafNode(otherlv_22, grammarAccess.getETAssignmentExpressionAccess().getLessThanSignLessThanSignEqualsSignKeyword_1_0_10_1());
                                

                            }


                            }
                            break;
                        case 12 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3528:6: ( () otherlv_24= '>>=' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3528:6: ( () otherlv_24= '>>=' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3528:7: () otherlv_24= '>>='
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3528:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3529:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0(),
                                        current);
                                

                            }

                            otherlv_24=(Token)match(input,64,FOLLOW_64_in_ruleETAssignmentExpression7996); 

                                	newLeafNode(otherlv_24, grammarAccess.getETAssignmentExpressionAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0_11_1());
                                

                            }


                            }
                            break;

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3538:3: ( (lv_right_25_0= ruleETAssignmentExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3539:1: (lv_right_25_0= ruleETAssignmentExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3539:1: (lv_right_25_0= ruleETAssignmentExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3540:3: lv_right_25_0= ruleETAssignmentExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETAssignmentExpression_in_ruleETAssignmentExpression8019);
                    lv_right_25_0=ruleETAssignmentExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETAssignmentExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_25_0, 
                            		"ETAssignmentExpression");
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
    // $ANTLR end "ruleETAssignmentExpression"


    // $ANTLR start "entryRuleETConditionalExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3564:1: entryRuleETConditionalExpression returns [EObject current=null] : iv_ruleETConditionalExpression= ruleETConditionalExpression EOF ;
    public final EObject entryRuleETConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETConditionalExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3565:2: (iv_ruleETConditionalExpression= ruleETConditionalExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3566:2: iv_ruleETConditionalExpression= ruleETConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getETConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleETConditionalExpression_in_entryRuleETConditionalExpression8057);
            iv_ruleETConditionalExpression=ruleETConditionalExpression();

            state._fsp--;

             current =iv_ruleETConditionalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETConditionalExpression8067); 

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
    // $ANTLR end "entryRuleETConditionalExpression"


    // $ANTLR start "ruleETConditionalExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3573:1: ruleETConditionalExpression returns [EObject current=null] : (this_ETLogicOrExpression2_0= ruleETLogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )? ) ;
    public final EObject ruleETConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETLogicOrExpression2_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3576:28: ( (this_ETLogicOrExpression2_0= ruleETLogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )? ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3577:1: (this_ETLogicOrExpression2_0= ruleETLogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )? )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3577:1: (this_ETLogicOrExpression2_0= ruleETLogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )? )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3578:5: this_ETLogicOrExpression2_0= ruleETLogicOrExpression2 ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getETConditionalExpressionAccess().getETLogicOrExpression2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETLogicOrExpression2_in_ruleETConditionalExpression8114);
            this_ETLogicOrExpression2_0=ruleETLogicOrExpression2();

            state._fsp--;

             
                    current = this_ETLogicOrExpression2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3586:1: ( () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==20) ) {
                int LA57_1 = input.LA(2);

                if ( ((LA57_1>=RULE_ID && LA57_1<=RULE_INT)||LA57_1==19||LA57_1==36||LA57_1==78||(LA57_1>=82 && LA57_1<=85)) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3586:2: () otherlv_2= '?' ( (lv_then_3_0= ruleETLogicOrExpression2 ) ) otherlv_4= ':' ( (lv_else_5_0= ruleETConditionalExpression ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3586:2: ()
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3587:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleETConditionalExpression8135); 

                        	newLeafNode(otherlv_2, grammarAccess.getETConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3596:1: ( (lv_then_3_0= ruleETLogicOrExpression2 ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3597:1: (lv_then_3_0= ruleETLogicOrExpression2 )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3597:1: (lv_then_3_0= ruleETLogicOrExpression2 )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3598:3: lv_then_3_0= ruleETLogicOrExpression2
                    {
                     
                    	        newCompositeNode(grammarAccess.getETConditionalExpressionAccess().getThenETLogicOrExpression2ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETLogicOrExpression2_in_ruleETConditionalExpression8156);
                    lv_then_3_0=ruleETLogicOrExpression2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"then",
                            		lv_then_3_0, 
                            		"ETLogicOrExpression2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleETConditionalExpression8168); 

                        	newLeafNode(otherlv_4, grammarAccess.getETConditionalExpressionAccess().getColonKeyword_1_3());
                        
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3618:1: ( (lv_else_5_0= ruleETConditionalExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3619:1: (lv_else_5_0= ruleETConditionalExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3619:1: (lv_else_5_0= ruleETConditionalExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3620:3: lv_else_5_0= ruleETConditionalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETConditionalExpressionAccess().getElseETConditionalExpressionParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETConditionalExpression_in_ruleETConditionalExpression8189);
                    lv_else_5_0=ruleETConditionalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_5_0, 
                            		"ETConditionalExpression");
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
    // $ANTLR end "ruleETConditionalExpression"


    // $ANTLR start "entryRuleETLogicOrExpression2"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3644:1: entryRuleETLogicOrExpression2 returns [EObject current=null] : iv_ruleETLogicOrExpression2= ruleETLogicOrExpression2 EOF ;
    public final EObject entryRuleETLogicOrExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETLogicOrExpression2 = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3645:2: (iv_ruleETLogicOrExpression2= ruleETLogicOrExpression2 EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3646:2: iv_ruleETLogicOrExpression2= ruleETLogicOrExpression2 EOF
            {
             newCompositeNode(grammarAccess.getETLogicOrExpression2Rule()); 
            pushFollow(FOLLOW_ruleETLogicOrExpression2_in_entryRuleETLogicOrExpression28227);
            iv_ruleETLogicOrExpression2=ruleETLogicOrExpression2();

            state._fsp--;

             current =iv_ruleETLogicOrExpression2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETLogicOrExpression28237); 

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
    // $ANTLR end "entryRuleETLogicOrExpression2"


    // $ANTLR start "ruleETLogicOrExpression2"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3653:1: ruleETLogicOrExpression2 returns [EObject current=null] : (this_ETLogicAndExpression2_0= ruleETLogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )* ) ;
    public final EObject ruleETLogicOrExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETLogicAndExpression2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3656:28: ( (this_ETLogicAndExpression2_0= ruleETLogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3657:1: (this_ETLogicAndExpression2_0= ruleETLogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3657:1: (this_ETLogicAndExpression2_0= ruleETLogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3658:5: this_ETLogicAndExpression2_0= ruleETLogicAndExpression2 ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETLogicOrExpression2Access().getETLogicAndExpression2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETLogicAndExpression2_in_ruleETLogicOrExpression28284);
            this_ETLogicAndExpression2_0=ruleETLogicAndExpression2();

            state._fsp--;

             
                    current = this_ETLogicAndExpression2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3666:1: ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==33) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3666:2: ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleETLogicAndExpression2 ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3666:2: ( () otherlv_2= '||' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3666:3: () otherlv_2= '||'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3666:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3667:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleETLogicOrExpression28306); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETLogicOrExpression2Access().getVerticalLineVerticalLineKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3676:2: ( (lv_right_3_0= ruleETLogicAndExpression2 ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3677:1: (lv_right_3_0= ruleETLogicAndExpression2 )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3677:1: (lv_right_3_0= ruleETLogicAndExpression2 )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3678:3: lv_right_3_0= ruleETLogicAndExpression2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETLogicOrExpression2Access().getRightETLogicAndExpression2ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETLogicAndExpression2_in_ruleETLogicOrExpression28328);
            	    lv_right_3_0=ruleETLogicAndExpression2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETLogicOrExpression2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETLogicAndExpression2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleETLogicOrExpression2"


    // $ANTLR start "entryRuleETLogicAndExpression2"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3702:1: entryRuleETLogicAndExpression2 returns [EObject current=null] : iv_ruleETLogicAndExpression2= ruleETLogicAndExpression2 EOF ;
    public final EObject entryRuleETLogicAndExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETLogicAndExpression2 = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3703:2: (iv_ruleETLogicAndExpression2= ruleETLogicAndExpression2 EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3704:2: iv_ruleETLogicAndExpression2= ruleETLogicAndExpression2 EOF
            {
             newCompositeNode(grammarAccess.getETLogicAndExpression2Rule()); 
            pushFollow(FOLLOW_ruleETLogicAndExpression2_in_entryRuleETLogicAndExpression28366);
            iv_ruleETLogicAndExpression2=ruleETLogicAndExpression2();

            state._fsp--;

             current =iv_ruleETLogicAndExpression2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETLogicAndExpression28376); 

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
    // $ANTLR end "entryRuleETLogicAndExpression2"


    // $ANTLR start "ruleETLogicAndExpression2"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3711:1: ruleETLogicAndExpression2 returns [EObject current=null] : (this_ETBitOrExpression_0= ruleETBitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )* ) ;
    public final EObject ruleETLogicAndExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETBitOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3714:28: ( (this_ETBitOrExpression_0= ruleETBitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3715:1: (this_ETBitOrExpression_0= ruleETBitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3715:1: (this_ETBitOrExpression_0= ruleETBitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3716:5: this_ETBitOrExpression_0= ruleETBitOrExpression ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETLogicAndExpression2Access().getETBitOrExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETBitOrExpression_in_ruleETLogicAndExpression28423);
            this_ETBitOrExpression_0=ruleETBitOrExpression();

            state._fsp--;

             
                    current = this_ETBitOrExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3724:1: ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==34) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3724:2: ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleETBitOrExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3724:2: ( () otherlv_2= '&&' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3724:3: () otherlv_2= '&&'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3724:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3725:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleETLogicAndExpression28445); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETLogicAndExpression2Access().getAmpersandAmpersandKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3734:2: ( (lv_right_3_0= ruleETBitOrExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3735:1: (lv_right_3_0= ruleETBitOrExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3735:1: (lv_right_3_0= ruleETBitOrExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3736:3: lv_right_3_0= ruleETBitOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETLogicAndExpression2Access().getRightETBitOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETBitOrExpression_in_ruleETLogicAndExpression28467);
            	    lv_right_3_0=ruleETBitOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETLogicAndExpression2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETBitOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleETLogicAndExpression2"


    // $ANTLR start "entryRuleETBitOrExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3760:1: entryRuleETBitOrExpression returns [EObject current=null] : iv_ruleETBitOrExpression= ruleETBitOrExpression EOF ;
    public final EObject entryRuleETBitOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBitOrExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3761:2: (iv_ruleETBitOrExpression= ruleETBitOrExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3762:2: iv_ruleETBitOrExpression= ruleETBitOrExpression EOF
            {
             newCompositeNode(grammarAccess.getETBitOrExpressionRule()); 
            pushFollow(FOLLOW_ruleETBitOrExpression_in_entryRuleETBitOrExpression8505);
            iv_ruleETBitOrExpression=ruleETBitOrExpression();

            state._fsp--;

             current =iv_ruleETBitOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBitOrExpression8515); 

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
    // $ANTLR end "entryRuleETBitOrExpression"


    // $ANTLR start "ruleETBitOrExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3769:1: ruleETBitOrExpression returns [EObject current=null] : (this_ETBitXORExpression_0= ruleETBitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )* ) ;
    public final EObject ruleETBitOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETBitXORExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3772:28: ( (this_ETBitXORExpression_0= ruleETBitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3773:1: (this_ETBitXORExpression_0= ruleETBitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3773:1: (this_ETBitXORExpression_0= ruleETBitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3774:5: this_ETBitXORExpression_0= ruleETBitXORExpression ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETBitOrExpressionAccess().getETBitXORExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETBitXORExpression_in_ruleETBitOrExpression8562);
            this_ETBitXORExpression_0=ruleETBitXORExpression();

            state._fsp--;

             
                    current = this_ETBitXORExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3782:1: ( ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==35) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3782:2: ( () otherlv_2= '|' ) ( (lv_right_3_0= ruleETBitXORExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3782:2: ( () otherlv_2= '|' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3782:3: () otherlv_2= '|'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3782:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3783:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleETBitOrExpression8584); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETBitOrExpressionAccess().getVerticalLineKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3792:2: ( (lv_right_3_0= ruleETBitXORExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3793:1: (lv_right_3_0= ruleETBitXORExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3793:1: (lv_right_3_0= ruleETBitXORExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3794:3: lv_right_3_0= ruleETBitXORExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETBitOrExpressionAccess().getRightETBitXORExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETBitXORExpression_in_ruleETBitOrExpression8606);
            	    lv_right_3_0=ruleETBitXORExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETBitOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETBitXORExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleETBitOrExpression"


    // $ANTLR start "entryRuleETBitXORExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3818:1: entryRuleETBitXORExpression returns [EObject current=null] : iv_ruleETBitXORExpression= ruleETBitXORExpression EOF ;
    public final EObject entryRuleETBitXORExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBitXORExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3819:2: (iv_ruleETBitXORExpression= ruleETBitXORExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3820:2: iv_ruleETBitXORExpression= ruleETBitXORExpression EOF
            {
             newCompositeNode(grammarAccess.getETBitXORExpressionRule()); 
            pushFollow(FOLLOW_ruleETBitXORExpression_in_entryRuleETBitXORExpression8644);
            iv_ruleETBitXORExpression=ruleETBitXORExpression();

            state._fsp--;

             current =iv_ruleETBitXORExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBitXORExpression8654); 

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
    // $ANTLR end "entryRuleETBitXORExpression"


    // $ANTLR start "ruleETBitXORExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3827:1: ruleETBitXORExpression returns [EObject current=null] : (this_ETBitAndExpression_0= ruleETBitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )* ) ;
    public final EObject ruleETBitXORExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETBitAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3830:28: ( (this_ETBitAndExpression_0= ruleETBitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3831:1: (this_ETBitAndExpression_0= ruleETBitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3831:1: (this_ETBitAndExpression_0= ruleETBitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3832:5: this_ETBitAndExpression_0= ruleETBitAndExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETBitXORExpressionAccess().getETBitAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETBitAndExpression_in_ruleETBitXORExpression8701);
            this_ETBitAndExpression_0=ruleETBitAndExpression();

            state._fsp--;

             
                    current = this_ETBitAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3840:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==65) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3840:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleETBitAndExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3840:2: ( () otherlv_2= '^' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3840:3: () otherlv_2= '^'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3840:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3841:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleETBitXORExpression8723); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETBitXORExpressionAccess().getCircumflexAccentKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3850:2: ( (lv_right_3_0= ruleETBitAndExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3851:1: (lv_right_3_0= ruleETBitAndExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3851:1: (lv_right_3_0= ruleETBitAndExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3852:3: lv_right_3_0= ruleETBitAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETBitXORExpressionAccess().getRightETBitAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETBitAndExpression_in_ruleETBitXORExpression8745);
            	    lv_right_3_0=ruleETBitAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETBitXORExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETBitAndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleETBitXORExpression"


    // $ANTLR start "entryRuleETBitAndExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3876:1: entryRuleETBitAndExpression returns [EObject current=null] : iv_ruleETBitAndExpression= ruleETBitAndExpression EOF ;
    public final EObject entryRuleETBitAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBitAndExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3877:2: (iv_ruleETBitAndExpression= ruleETBitAndExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3878:2: iv_ruleETBitAndExpression= ruleETBitAndExpression EOF
            {
             newCompositeNode(grammarAccess.getETBitAndExpressionRule()); 
            pushFollow(FOLLOW_ruleETBitAndExpression_in_entryRuleETBitAndExpression8783);
            iv_ruleETBitAndExpression=ruleETBitAndExpression();

            state._fsp--;

             current =iv_ruleETBitAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBitAndExpression8793); 

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
    // $ANTLR end "entryRuleETBitAndExpression"


    // $ANTLR start "ruleETBitAndExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3885:1: ruleETBitAndExpression returns [EObject current=null] : (this_ETEqualityExpression_0= ruleETEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )* ) ;
    public final EObject ruleETBitAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ETEqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3888:28: ( (this_ETEqualityExpression_0= ruleETEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3889:1: (this_ETEqualityExpression_0= ruleETEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3889:1: (this_ETEqualityExpression_0= ruleETEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3890:5: this_ETEqualityExpression_0= ruleETEqualityExpression ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETBitAndExpressionAccess().getETEqualityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETEqualityExpression_in_ruleETBitAndExpression8840);
            this_ETEqualityExpression_0=ruleETEqualityExpression();

            state._fsp--;

             
                    current = this_ETEqualityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3898:1: ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==66) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3898:2: ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleETEqualityExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3898:2: ( () otherlv_2= '&' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3898:3: () otherlv_2= '&'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3898:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3899:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleETBitAndExpression8862); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETBitAndExpressionAccess().getAmpersandKeyword_1_0_1());
            	        

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3908:2: ( (lv_right_3_0= ruleETEqualityExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3909:1: (lv_right_3_0= ruleETEqualityExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3909:1: (lv_right_3_0= ruleETEqualityExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3910:3: lv_right_3_0= ruleETEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETBitAndExpressionAccess().getRightETEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETEqualityExpression_in_ruleETBitAndExpression8884);
            	    lv_right_3_0=ruleETEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETBitAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETEqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleETBitAndExpression"


    // $ANTLR start "entryRuleETEqualityExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3934:1: entryRuleETEqualityExpression returns [EObject current=null] : iv_ruleETEqualityExpression= ruleETEqualityExpression EOF ;
    public final EObject entryRuleETEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETEqualityExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3935:2: (iv_ruleETEqualityExpression= ruleETEqualityExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3936:2: iv_ruleETEqualityExpression= ruleETEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getETEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleETEqualityExpression_in_entryRuleETEqualityExpression8922);
            iv_ruleETEqualityExpression=ruleETEqualityExpression();

            state._fsp--;

             current =iv_ruleETEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETEqualityExpression8932); 

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
    // $ANTLR end "entryRuleETEqualityExpression"


    // $ANTLR start "ruleETEqualityExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3943:1: ruleETEqualityExpression returns [EObject current=null] : (this_ETInequalityExpression_0= ruleETInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )* ) ;
    public final EObject ruleETEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETInequalityExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3946:28: ( (this_ETInequalityExpression_0= ruleETInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3947:1: (this_ETInequalityExpression_0= ruleETInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3947:1: (this_ETInequalityExpression_0= ruleETInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3948:5: this_ETInequalityExpression_0= ruleETInequalityExpression ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETEqualityExpressionAccess().getETInequalityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETInequalityExpression_in_ruleETEqualityExpression8979);
            this_ETInequalityExpression_0=ruleETInequalityExpression();

            state._fsp--;

             
                    current = this_ETInequalityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:1: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=67 && LA64_0<=68)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleETInequalityExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:2: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==67) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==68) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:3: ( () otherlv_2= '==' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:3: ( () otherlv_2= '==' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:4: () otherlv_2= '=='
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3956:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3957:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleETEqualityExpression9002); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3967:6: ( () otherlv_4= '!=' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3967:6: ( () otherlv_4= '!=' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3967:7: () otherlv_4= '!='
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3967:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3968:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleETEqualityExpression9031); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3977:3: ( (lv_right_5_0= ruleETInequalityExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3978:1: (lv_right_5_0= ruleETInequalityExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3978:1: (lv_right_5_0= ruleETInequalityExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:3979:3: lv_right_5_0= ruleETInequalityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETEqualityExpressionAccess().getRightETInequalityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETInequalityExpression_in_ruleETEqualityExpression9054);
            	    lv_right_5_0=ruleETInequalityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETEqualityExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"ETInequalityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // $ANTLR end "ruleETEqualityExpression"


    // $ANTLR start "entryRuleETInequalityExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4003:1: entryRuleETInequalityExpression returns [EObject current=null] : iv_ruleETInequalityExpression= ruleETInequalityExpression EOF ;
    public final EObject entryRuleETInequalityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETInequalityExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4004:2: (iv_ruleETInequalityExpression= ruleETInequalityExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4005:2: iv_ruleETInequalityExpression= ruleETInequalityExpression EOF
            {
             newCompositeNode(grammarAccess.getETInequalityExpressionRule()); 
            pushFollow(FOLLOW_ruleETInequalityExpression_in_entryRuleETInequalityExpression9092);
            iv_ruleETInequalityExpression=ruleETInequalityExpression();

            state._fsp--;

             current =iv_ruleETInequalityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETInequalityExpression9102); 

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
    // $ANTLR end "entryRuleETInequalityExpression"


    // $ANTLR start "ruleETInequalityExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4012:1: ruleETInequalityExpression returns [EObject current=null] : (this_ETMinMaxExpression_0= ruleETMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )* ) ;
    public final EObject ruleETInequalityExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_ETMinMaxExpression_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4015:28: ( (this_ETMinMaxExpression_0= ruleETMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4016:1: (this_ETMinMaxExpression_0= ruleETMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4016:1: (this_ETMinMaxExpression_0= ruleETMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4017:5: this_ETMinMaxExpression_0= ruleETMinMaxExpression ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETInequalityExpressionAccess().getETMinMaxExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETMinMaxExpression_in_ruleETInequalityExpression9149);
            this_ETMinMaxExpression_0=ruleETMinMaxExpression();

            state._fsp--;

             
                    current = this_ETMinMaxExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:1: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=69 && LA66_0<=72)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:2: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) ) ( (lv_right_9_0= ruleETMinMaxExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:2: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) )
            	    int alt65=4;
            	    switch ( input.LA(1) ) {
            	    case 69:
            	        {
            	        alt65=1;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt65=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt65=3;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt65=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt65) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:3: ( () otherlv_2= '<' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:3: ( () otherlv_2= '<' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:4: () otherlv_2= '<'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4025:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4026:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleETInequalityExpression9172); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETInequalityExpressionAccess().getLessThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4036:6: ( () otherlv_4= '<=' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4036:6: ( () otherlv_4= '<=' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4036:7: () otherlv_4= '<='
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4036:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4037:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleETInequalityExpression9201); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETInequalityExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4047:6: ( () otherlv_6= '>=' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4047:6: ( () otherlv_6= '>=' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4047:7: () otherlv_6= '>='
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4047:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4048:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleETInequalityExpression9230); 

            	                	newLeafNode(otherlv_6, grammarAccess.getETInequalityExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4058:6: ( () otherlv_8= '>' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4058:6: ( () otherlv_8= '>' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4058:7: () otherlv_8= '>'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4058:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4059:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0(),
            	                        current);
            	                

            	            }

            	            otherlv_8=(Token)match(input,72,FOLLOW_72_in_ruleETInequalityExpression9259); 

            	                	newLeafNode(otherlv_8, grammarAccess.getETInequalityExpressionAccess().getGreaterThanSignKeyword_1_0_3_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4068:3: ( (lv_right_9_0= ruleETMinMaxExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4069:1: (lv_right_9_0= ruleETMinMaxExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4069:1: (lv_right_9_0= ruleETMinMaxExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4070:3: lv_right_9_0= ruleETMinMaxExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETInequalityExpressionAccess().getRightETMinMaxExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETMinMaxExpression_in_ruleETInequalityExpression9282);
            	    lv_right_9_0=ruleETMinMaxExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETInequalityExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"ETMinMaxExpression");
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
    // $ANTLR end "ruleETInequalityExpression"


    // $ANTLR start "entryRuleETMinMaxExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4094:1: entryRuleETMinMaxExpression returns [EObject current=null] : iv_ruleETMinMaxExpression= ruleETMinMaxExpression EOF ;
    public final EObject entryRuleETMinMaxExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETMinMaxExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4095:2: (iv_ruleETMinMaxExpression= ruleETMinMaxExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4096:2: iv_ruleETMinMaxExpression= ruleETMinMaxExpression EOF
            {
             newCompositeNode(grammarAccess.getETMinMaxExpressionRule()); 
            pushFollow(FOLLOW_ruleETMinMaxExpression_in_entryRuleETMinMaxExpression9320);
            iv_ruleETMinMaxExpression=ruleETMinMaxExpression();

            state._fsp--;

             current =iv_ruleETMinMaxExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETMinMaxExpression9330); 

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
    // $ANTLR end "entryRuleETMinMaxExpression"


    // $ANTLR start "ruleETMinMaxExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4103:1: ruleETMinMaxExpression returns [EObject current=null] : (this_ETBitLeftBRightExpression_0= ruleETBitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )* ) ;
    public final EObject ruleETMinMaxExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETBitLeftBRightExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4106:28: ( (this_ETBitLeftBRightExpression_0= ruleETBitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4107:1: (this_ETBitLeftBRightExpression_0= ruleETBitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4107:1: (this_ETBitLeftBRightExpression_0= ruleETBitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4108:5: this_ETBitLeftBRightExpression_0= ruleETBitLeftBRightExpression ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETMinMaxExpressionAccess().getETBitLeftBRightExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETBitLeftBRightExpression_in_ruleETMinMaxExpression9377);
            this_ETBitLeftBRightExpression_0=ruleETBitLeftBRightExpression();

            state._fsp--;

             
                    current = this_ETBitLeftBRightExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:1: ( ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=73 && LA68_0<=74)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:2: ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) ) ( (lv_right_5_0= ruleETBitLeftBRightExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:2: ( ( () otherlv_2= '<?' ) | ( () otherlv_4= '>?' ) )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==73) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==74) ) {
            	        alt67=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:3: ( () otherlv_2= '<?' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:3: ( () otherlv_2= '<?' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:4: () otherlv_2= '<?'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4116:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4117:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleETMinMaxExpression9400); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETMinMaxExpressionAccess().getLessThanSignQuestionMarkKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4127:6: ( () otherlv_4= '>?' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4127:6: ( () otherlv_4= '>?' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4127:7: () otherlv_4= '>?'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4127:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4128:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleETMinMaxExpression9429); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETMinMaxExpressionAccess().getGreaterThanSignQuestionMarkKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4137:3: ( (lv_right_5_0= ruleETBitLeftBRightExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4138:1: (lv_right_5_0= ruleETBitLeftBRightExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4138:1: (lv_right_5_0= ruleETBitLeftBRightExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4139:3: lv_right_5_0= ruleETBitLeftBRightExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETMinMaxExpressionAccess().getRightETBitLeftBRightExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETBitLeftBRightExpression_in_ruleETMinMaxExpression9452);
            	    lv_right_5_0=ruleETBitLeftBRightExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETMinMaxExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"ETBitLeftBRightExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // $ANTLR end "ruleETMinMaxExpression"


    // $ANTLR start "entryRuleETBitLeftBRightExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4163:1: entryRuleETBitLeftBRightExpression returns [EObject current=null] : iv_ruleETBitLeftBRightExpression= ruleETBitLeftBRightExpression EOF ;
    public final EObject entryRuleETBitLeftBRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBitLeftBRightExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4164:2: (iv_ruleETBitLeftBRightExpression= ruleETBitLeftBRightExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4165:2: iv_ruleETBitLeftBRightExpression= ruleETBitLeftBRightExpression EOF
            {
             newCompositeNode(grammarAccess.getETBitLeftBRightExpressionRule()); 
            pushFollow(FOLLOW_ruleETBitLeftBRightExpression_in_entryRuleETBitLeftBRightExpression9490);
            iv_ruleETBitLeftBRightExpression=ruleETBitLeftBRightExpression();

            state._fsp--;

             current =iv_ruleETBitLeftBRightExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBitLeftBRightExpression9500); 

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
    // $ANTLR end "entryRuleETBitLeftBRightExpression"


    // $ANTLR start "ruleETBitLeftBRightExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4172:1: ruleETBitLeftBRightExpression returns [EObject current=null] : (this_ETAdditiveExpression_0= ruleETAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )* ) ;
    public final EObject ruleETBitLeftBRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETAdditiveExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4175:28: ( (this_ETAdditiveExpression_0= ruleETAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4176:1: (this_ETAdditiveExpression_0= ruleETAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4176:1: (this_ETAdditiveExpression_0= ruleETAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4177:5: this_ETAdditiveExpression_0= ruleETAdditiveExpression ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETBitLeftBRightExpressionAccess().getETAdditiveExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETAdditiveExpression_in_ruleETBitLeftBRightExpression9547);
            this_ETAdditiveExpression_0=ruleETAdditiveExpression();

            state._fsp--;

             
                    current = this_ETAdditiveExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:1: ( ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=75 && LA70_0<=76)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:2: ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) ) ( (lv_right_5_0= ruleETAdditiveExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:2: ( ( () otherlv_2= '<<' ) | ( () otherlv_4= '>>' ) )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==75) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==76) ) {
            	        alt69=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:3: ( () otherlv_2= '<<' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:3: ( () otherlv_2= '<<' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:4: () otherlv_2= '<<'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4185:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4186:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleETBitLeftBRightExpression9570); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETBitLeftBRightExpressionAccess().getLessThanSignLessThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4196:6: ( () otherlv_4= '>>' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4196:6: ( () otherlv_4= '>>' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4196:7: () otherlv_4= '>>'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4196:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4197:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleETBitLeftBRightExpression9599); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETBitLeftBRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4206:3: ( (lv_right_5_0= ruleETAdditiveExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4207:1: (lv_right_5_0= ruleETAdditiveExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4207:1: (lv_right_5_0= ruleETAdditiveExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4208:3: lv_right_5_0= ruleETAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETBitLeftBRightExpressionAccess().getRightETAdditiveExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETAdditiveExpression_in_ruleETBitLeftBRightExpression9622);
            	    lv_right_5_0=ruleETAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETBitLeftBRightExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"ETAdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // $ANTLR end "ruleETBitLeftBRightExpression"


    // $ANTLR start "entryRuleETAdditiveExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4232:1: entryRuleETAdditiveExpression returns [EObject current=null] : iv_ruleETAdditiveExpression= ruleETAdditiveExpression EOF ;
    public final EObject entryRuleETAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETAdditiveExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4233:2: (iv_ruleETAdditiveExpression= ruleETAdditiveExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4234:2: iv_ruleETAdditiveExpression= ruleETAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getETAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleETAdditiveExpression_in_entryRuleETAdditiveExpression9660);
            iv_ruleETAdditiveExpression=ruleETAdditiveExpression();

            state._fsp--;

             current =iv_ruleETAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETAdditiveExpression9670); 

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
    // $ANTLR end "entryRuleETAdditiveExpression"


    // $ANTLR start "ruleETAdditiveExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4241:1: ruleETAdditiveExpression returns [EObject current=null] : (this_ETMultiplicativeExpression_0= ruleETMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleETAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETMultiplicativeExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4244:28: ( (this_ETMultiplicativeExpression_0= ruleETMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4245:1: (this_ETMultiplicativeExpression_0= ruleETMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4245:1: (this_ETMultiplicativeExpression_0= ruleETMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4246:5: this_ETMultiplicativeExpression_0= ruleETMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETAdditiveExpressionAccess().getETMultiplicativeExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETMultiplicativeExpression_in_ruleETAdditiveExpression9717);
            this_ETMultiplicativeExpression_0=ruleETMultiplicativeExpression();

            state._fsp--;

             
                    current = this_ETMultiplicativeExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=77 && LA72_0<=78)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleETMultiplicativeExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==77) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==78) ) {
            	        alt71=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:3: ( () otherlv_2= '+' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:3: ( () otherlv_2= '+' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:4: () otherlv_2= '+'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4254:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4255:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleETAdditiveExpression9740); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETAdditiveExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4265:6: ( () otherlv_4= '-' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4265:6: ( () otherlv_4= '-' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4265:7: () otherlv_4= '-'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4265:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4266:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleETAdditiveExpression9769); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4275:3: ( (lv_right_5_0= ruleETMultiplicativeExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4276:1: (lv_right_5_0= ruleETMultiplicativeExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4276:1: (lv_right_5_0= ruleETMultiplicativeExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4277:3: lv_right_5_0= ruleETMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETAdditiveExpressionAccess().getRightETMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETMultiplicativeExpression_in_ruleETAdditiveExpression9792);
            	    lv_right_5_0=ruleETMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETAdditiveExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"ETMultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // $ANTLR end "ruleETAdditiveExpression"


    // $ANTLR start "entryRuleETMultiplicativeExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4301:1: entryRuleETMultiplicativeExpression returns [EObject current=null] : iv_ruleETMultiplicativeExpression= ruleETMultiplicativeExpression EOF ;
    public final EObject entryRuleETMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETMultiplicativeExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4302:2: (iv_ruleETMultiplicativeExpression= ruleETMultiplicativeExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4303:2: iv_ruleETMultiplicativeExpression= ruleETMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getETMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleETMultiplicativeExpression_in_entryRuleETMultiplicativeExpression9830);
            iv_ruleETMultiplicativeExpression=ruleETMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleETMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETMultiplicativeExpression9840); 

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
    // $ANTLR end "entryRuleETMultiplicativeExpression"


    // $ANTLR start "ruleETMultiplicativeExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4310:1: ruleETMultiplicativeExpression returns [EObject current=null] : (this_ETPrefixExpression_0= ruleETPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )* ) ;
    public final EObject ruleETMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ETPrefixExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4313:28: ( (this_ETPrefixExpression_0= ruleETPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4314:1: (this_ETPrefixExpression_0= ruleETPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4314:1: (this_ETPrefixExpression_0= ruleETPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4315:5: this_ETPrefixExpression_0= ruleETPrefixExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getETMultiplicativeExpressionAccess().getETPrefixExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETPrefixExpression_in_ruleETMultiplicativeExpression9887);
            this_ETPrefixExpression_0=ruleETPrefixExpression();

            state._fsp--;

             
                    current = this_ETPrefixExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=79 && LA74_0<=81)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleETPrefixExpression ) )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt73=3;
            	    switch ( input.LA(1) ) {
            	    case 79:
            	        {
            	        alt73=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt73=2;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt73=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt73) {
            	        case 1 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:3: ( () otherlv_2= '*' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:3: ( () otherlv_2= '*' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:4: () otherlv_2= '*'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4323:4: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4324:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleETMultiplicativeExpression9910); 

            	                	newLeafNode(otherlv_2, grammarAccess.getETMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4334:6: ( () otherlv_4= '/' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4334:6: ( () otherlv_4= '/' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4334:7: () otherlv_4= '/'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4334:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4335:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleETMultiplicativeExpression9939); 

            	                	newLeafNode(otherlv_4, grammarAccess.getETMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4345:6: ( () otherlv_6= '%' )
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4345:6: ( () otherlv_6= '%' )
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4345:7: () otherlv_6= '%'
            	            {
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4345:7: ()
            	            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4346:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,81,FOLLOW_81_in_ruleETMultiplicativeExpression9968); 

            	                	newLeafNode(otherlv_6, grammarAccess.getETMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4355:3: ( (lv_right_7_0= ruleETPrefixExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4356:1: (lv_right_7_0= ruleETPrefixExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4356:1: (lv_right_7_0= ruleETPrefixExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4357:3: lv_right_7_0= ruleETPrefixExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETMultiplicativeExpressionAccess().getRightETPrefixExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETPrefixExpression_in_ruleETMultiplicativeExpression9991);
            	    lv_right_7_0=ruleETPrefixExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETMultiplicativeExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"ETPrefixExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "ruleETMultiplicativeExpression"


    // $ANTLR start "entryRuleETPrefixExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4381:1: entryRuleETPrefixExpression returns [EObject current=null] : iv_ruleETPrefixExpression= ruleETPrefixExpression EOF ;
    public final EObject entryRuleETPrefixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETPrefixExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4382:2: (iv_ruleETPrefixExpression= ruleETPrefixExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4383:2: iv_ruleETPrefixExpression= ruleETPrefixExpression EOF
            {
             newCompositeNode(grammarAccess.getETPrefixExpressionRule()); 
            pushFollow(FOLLOW_ruleETPrefixExpression_in_entryRuleETPrefixExpression10029);
            iv_ruleETPrefixExpression=ruleETPrefixExpression();

            state._fsp--;

             current =iv_ruleETPrefixExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETPrefixExpression10039); 

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
    // $ANTLR end "entryRuleETPrefixExpression"


    // $ANTLR start "ruleETPrefixExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4390:1: ruleETPrefixExpression returns [EObject current=null] : (this_ETUnaryExpression_0= ruleETUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) ) ) ;
    public final EObject ruleETPrefixExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETUnaryExpression_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4393:28: ( (this_ETUnaryExpression_0= ruleETUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4394:1: (this_ETUnaryExpression_0= ruleETUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4394:1: (this_ETUnaryExpression_0= ruleETUnaryExpression | ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_ID && LA76_0<=RULE_INT)||LA76_0==19||LA76_0==36||LA76_0==78||(LA76_0>=84 && LA76_0<=85)) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=82 && LA76_0<=83)) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4395:5: this_ETUnaryExpression_0= ruleETUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getETPrefixExpressionAccess().getETUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETUnaryExpression_in_ruleETPrefixExpression10086);
                    this_ETUnaryExpression_0=ruleETUnaryExpression();

                    state._fsp--;

                     
                            current = this_ETUnaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:6: ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:6: ( ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:7: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) ) ( (lv_expression_5_0= ruleETPrefixExpression ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:7: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==82) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==83) ) {
                        alt75=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:8: ( () otherlv_2= '++' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:8: ( () otherlv_2= '++' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:9: () otherlv_2= '++'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4404:9: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4405:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETPrefixExpressionAccess().getETPreIncrementExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleETPrefixExpression10115); 

                                	newLeafNode(otherlv_2, grammarAccess.getETPrefixExpressionAccess().getPlusSignPlusSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4415:6: ( () otherlv_4= '--' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4415:6: ( () otherlv_4= '--' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4415:7: () otherlv_4= '--'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4415:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4416:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETPrefixExpressionAccess().getETPreDecrementExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,83,FOLLOW_83_in_ruleETPrefixExpression10144); 

                                	newLeafNode(otherlv_4, grammarAccess.getETPrefixExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4425:3: ( (lv_expression_5_0= ruleETPrefixExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4426:1: (lv_expression_5_0= ruleETPrefixExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4426:1: (lv_expression_5_0= ruleETPrefixExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4427:3: lv_expression_5_0= ruleETPrefixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETPrefixExpressionAccess().getExpressionETPrefixExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETPrefixExpression_in_ruleETPrefixExpression10167);
                    lv_expression_5_0=ruleETPrefixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETPrefixExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"ETPrefixExpression");
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
    // $ANTLR end "ruleETPrefixExpression"


    // $ANTLR start "entryRuleETUnaryExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4451:1: entryRuleETUnaryExpression returns [EObject current=null] : iv_ruleETUnaryExpression= ruleETUnaryExpression EOF ;
    public final EObject entryRuleETUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETUnaryExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4452:2: (iv_ruleETUnaryExpression= ruleETUnaryExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4453:2: iv_ruleETUnaryExpression= ruleETUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getETUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleETUnaryExpression_in_entryRuleETUnaryExpression10204);
            iv_ruleETUnaryExpression=ruleETUnaryExpression();

            state._fsp--;

             current =iv_ruleETUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETUnaryExpression10214); 

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
    // $ANTLR end "entryRuleETUnaryExpression"


    // $ANTLR start "ruleETUnaryExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4460:1: ruleETUnaryExpression returns [EObject current=null] : (this_ETPostfixExpression_0= ruleETPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) ) ) ;
    public final EObject ruleETUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETPostfixExpression_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4463:28: ( (this_ETPostfixExpression_0= ruleETPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4464:1: (this_ETPostfixExpression_0= ruleETPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4464:1: (this_ETPostfixExpression_0= ruleETPostfixExpression | ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_ID && LA78_0<=RULE_INT)||LA78_0==36||(LA78_0>=84 && LA78_0<=85)) ) {
                alt78=1;
            }
            else if ( (LA78_0==19||LA78_0==78) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4465:5: this_ETPostfixExpression_0= ruleETPostfixExpression
                    {
                     
                            newCompositeNode(grammarAccess.getETUnaryExpressionAccess().getETPostfixExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETPostfixExpression_in_ruleETUnaryExpression10261);
                    this_ETPostfixExpression_0=ruleETPostfixExpression();

                    state._fsp--;

                     
                            current = this_ETPostfixExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:6: ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:6: ( ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:7: ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) ) ( (lv_expression_5_0= ruleETUnaryExpression ) )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:7: ( ( () otherlv_2= '!' ) | ( () otherlv_4= '-' ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==19) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==78) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:8: ( () otherlv_2= '!' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:8: ( () otherlv_2= '!' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:9: () otherlv_2= '!'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4474:9: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4475:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETUnaryExpressionAccess().getETLogicNotExpressionAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleETUnaryExpression10290); 

                                	newLeafNode(otherlv_2, grammarAccess.getETUnaryExpressionAccess().getExclamationMarkKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4485:6: ( () otherlv_4= '-' )
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4485:6: ( () otherlv_4= '-' )
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4485:7: () otherlv_4= '-'
                            {
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4485:7: ()
                            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4486:5: 
                            {

                                    current = forceCreateModelElement(
                                        grammarAccess.getETUnaryExpressionAccess().getETMinusExpressionAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleETUnaryExpression10319); 

                                	newLeafNode(otherlv_4, grammarAccess.getETUnaryExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4495:3: ( (lv_expression_5_0= ruleETUnaryExpression ) )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4496:1: (lv_expression_5_0= ruleETUnaryExpression )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4496:1: (lv_expression_5_0= ruleETUnaryExpression )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4497:3: lv_expression_5_0= ruleETUnaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getETUnaryExpressionAccess().getExpressionETUnaryExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETUnaryExpression_in_ruleETUnaryExpression10342);
                    lv_expression_5_0=ruleETUnaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getETUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"ETUnaryExpression");
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
    // $ANTLR end "ruleETUnaryExpression"


    // $ANTLR start "entryRuleETPostfixExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4521:1: entryRuleETPostfixExpression returns [EObject current=null] : iv_ruleETPostfixExpression= ruleETPostfixExpression EOF ;
    public final EObject entryRuleETPostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETPostfixExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4522:2: (iv_ruleETPostfixExpression= ruleETPostfixExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4523:2: iv_ruleETPostfixExpression= ruleETPostfixExpression EOF
            {
             newCompositeNode(grammarAccess.getETPostfixExpressionRule()); 
            pushFollow(FOLLOW_ruleETPostfixExpression_in_entryRuleETPostfixExpression10379);
            iv_ruleETPostfixExpression=ruleETPostfixExpression();

            state._fsp--;

             current =iv_ruleETPostfixExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETPostfixExpression10389); 

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
    // $ANTLR end "entryRuleETPostfixExpression"


    // $ANTLR start "ruleETPostfixExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4530:1: ruleETPostfixExpression returns [EObject current=null] : (this_ETArrayExpression_0= ruleETArrayExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* ) ;
    public final EObject ruleETPostfixExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETArrayExpression_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4533:28: ( (this_ETArrayExpression_0= ruleETArrayExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4534:1: (this_ETArrayExpression_0= ruleETArrayExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4534:1: (this_ETArrayExpression_0= ruleETArrayExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4535:5: this_ETArrayExpression_0= ruleETArrayExpression ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )*
            {
             
                    newCompositeNode(grammarAccess.getETPostfixExpressionAccess().getETArrayExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETArrayExpression_in_ruleETPostfixExpression10436);
            this_ETArrayExpression_0=ruleETArrayExpression();

            state._fsp--;

             
                    current = this_ETArrayExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4543:1: ( ( () otherlv_2= '++' ) | ( () otherlv_4= '--' ) )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==82) ) {
                    alt79=1;
                }
                else if ( (LA79_0==83) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4543:2: ( () otherlv_2= '++' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4543:2: ( () otherlv_2= '++' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4543:3: () otherlv_2= '++'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4543:3: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4544:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleETPostfixExpression10458); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETPostfixExpressionAccess().getPlusSignPlusSignKeyword_1_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4554:6: ( () otherlv_4= '--' )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4554:6: ( () otherlv_4= '--' )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4554:7: () otherlv_4= '--'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4554:7: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4555:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_4=(Token)match(input,83,FOLLOW_83_in_ruleETPostfixExpression10487); 

            	        	newLeafNode(otherlv_4, grammarAccess.getETPostfixExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "ruleETPostfixExpression"


    // $ANTLR start "entryRuleETArrayExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4572:1: entryRuleETArrayExpression returns [EObject current=null] : iv_ruleETArrayExpression= ruleETArrayExpression EOF ;
    public final EObject entryRuleETArrayExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETArrayExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4573:2: (iv_ruleETArrayExpression= ruleETArrayExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4574:2: iv_ruleETArrayExpression= ruleETArrayExpression EOF
            {
             newCompositeNode(grammarAccess.getETArrayExpressionRule()); 
            pushFollow(FOLLOW_ruleETArrayExpression_in_entryRuleETArrayExpression10526);
            iv_ruleETArrayExpression=ruleETArrayExpression();

            state._fsp--;

             current =iv_ruleETArrayExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETArrayExpression10536); 

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
    // $ANTLR end "entryRuleETArrayExpression"


    // $ANTLR start "ruleETArrayExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4581:1: ruleETArrayExpression returns [EObject current=null] : (this_ETPrimaryExpression_0= ruleETPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleETArrayExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ETPrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4584:28: ( (this_ETPrimaryExpression_0= ruleETPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )* ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4585:1: (this_ETPrimaryExpression_0= ruleETPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )* )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4585:1: (this_ETPrimaryExpression_0= ruleETPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )* )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4586:5: this_ETPrimaryExpression_0= ruleETPrimaryExpression ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )*
            {
             
                    newCompositeNode(grammarAccess.getETArrayExpressionAccess().getETPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleETPrimaryExpression_in_ruleETArrayExpression10583);
            this_ETPrimaryExpression_0=ruleETPrimaryExpression();

            state._fsp--;

             
                    current = this_ETPrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4594:1: ( () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']' )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==12) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4594:2: () otherlv_2= '[' ( (lv_right_3_0= ruleETExpression ) ) otherlv_4= ']'
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4594:2: ()
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4595:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleETArrayExpression10604); 

            	        	newLeafNode(otherlv_2, grammarAccess.getETArrayExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	        
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4604:1: ( (lv_right_3_0= ruleETExpression ) )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4605:1: (lv_right_3_0= ruleETExpression )
            	    {
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4605:1: (lv_right_3_0= ruleETExpression )
            	    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4606:3: lv_right_3_0= ruleETExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getETArrayExpressionAccess().getRightETExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETExpression_in_ruleETArrayExpression10625);
            	    lv_right_3_0=ruleETExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getETArrayExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ETExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleETArrayExpression10637); 

            	        	newLeafNode(otherlv_4, grammarAccess.getETArrayExpressionAccess().getRightSquareBracketKeyword_1_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleETArrayExpression"


    // $ANTLR start "entryRuleETPrimaryExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4634:1: entryRuleETPrimaryExpression returns [EObject current=null] : iv_ruleETPrimaryExpression= ruleETPrimaryExpression EOF ;
    public final EObject entryRuleETPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETPrimaryExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4635:2: (iv_ruleETPrimaryExpression= ruleETPrimaryExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4636:2: iv_ruleETPrimaryExpression= ruleETPrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getETPrimaryExpressionRule()); 
            pushFollow(FOLLOW_ruleETPrimaryExpression_in_entryRuleETPrimaryExpression10675);
            iv_ruleETPrimaryExpression=ruleETPrimaryExpression();

            state._fsp--;

             current =iv_ruleETPrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETPrimaryExpression10685); 

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
    // $ANTLR end "entryRuleETPrimaryExpression"


    // $ANTLR start "ruleETPrimaryExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4643:1: ruleETPrimaryExpression returns [EObject current=null] : (this_ETReference_0= ruleETReference | this_ETNumberLiteral_1= ruleETNumberLiteral | this_ETBooleanLiteral_2= ruleETBooleanLiteral | this_ETParenthesizedExpression_3= ruleETParenthesizedExpression ) ;
    public final EObject ruleETPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ETReference_0 = null;

        EObject this_ETNumberLiteral_1 = null;

        EObject this_ETBooleanLiteral_2 = null;

        EObject this_ETParenthesizedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4646:28: ( (this_ETReference_0= ruleETReference | this_ETNumberLiteral_1= ruleETNumberLiteral | this_ETBooleanLiteral_2= ruleETBooleanLiteral | this_ETParenthesizedExpression_3= ruleETParenthesizedExpression ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4647:1: (this_ETReference_0= ruleETReference | this_ETNumberLiteral_1= ruleETNumberLiteral | this_ETBooleanLiteral_2= ruleETBooleanLiteral | this_ETParenthesizedExpression_3= ruleETParenthesizedExpression )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4647:1: (this_ETReference_0= ruleETReference | this_ETNumberLiteral_1= ruleETNumberLiteral | this_ETBooleanLiteral_2= ruleETBooleanLiteral | this_ETParenthesizedExpression_3= ruleETParenthesizedExpression )
            int alt81=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt81=1;
                }
                break;
            case RULE_INT:
                {
                alt81=2;
                }
                break;
            case 84:
            case 85:
                {
                alt81=3;
                }
                break;
            case 36:
                {
                alt81=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4648:5: this_ETReference_0= ruleETReference
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimaryExpressionAccess().getETReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETReference_in_ruleETPrimaryExpression10732);
                    this_ETReference_0=ruleETReference();

                    state._fsp--;

                     
                            current = this_ETReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4658:5: this_ETNumberLiteral_1= ruleETNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimaryExpressionAccess().getETNumberLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleETNumberLiteral_in_ruleETPrimaryExpression10759);
                    this_ETNumberLiteral_1=ruleETNumberLiteral();

                    state._fsp--;

                     
                            current = this_ETNumberLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4668:5: this_ETBooleanLiteral_2= ruleETBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimaryExpressionAccess().getETBooleanLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleETBooleanLiteral_in_ruleETPrimaryExpression10786);
                    this_ETBooleanLiteral_2=ruleETBooleanLiteral();

                    state._fsp--;

                     
                            current = this_ETBooleanLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4678:5: this_ETParenthesizedExpression_3= ruleETParenthesizedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getETPrimaryExpressionAccess().getETParenthesizedExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleETParenthesizedExpression_in_ruleETPrimaryExpression10813);
                    this_ETParenthesizedExpression_3=ruleETParenthesizedExpression();

                    state._fsp--;

                     
                            current = this_ETParenthesizedExpression_3; 
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
    // $ANTLR end "ruleETPrimaryExpression"


    // $ANTLR start "entryRuleETReference"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4694:1: entryRuleETReference returns [EObject current=null] : iv_ruleETReference= ruleETReference EOF ;
    public final EObject entryRuleETReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETReference = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4695:2: (iv_ruleETReference= ruleETReference EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4696:2: iv_ruleETReference= ruleETReference EOF
            {
             newCompositeNode(grammarAccess.getETReferenceRule()); 
            pushFollow(FOLLOW_ruleETReference_in_entryRuleETReference10848);
            iv_ruleETReference=ruleETReference();

            state._fsp--;

             current =iv_ruleETReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETReference10858); 

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
    // $ANTLR end "entryRuleETReference"


    // $ANTLR start "ruleETReference"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4703:1: ruleETReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleETReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4706:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4707:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4707:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4707:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4707:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4708:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETReferenceAccess().getETReferenceAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4713:2: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4714:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4714:1: (otherlv_1= RULE_ID )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4715:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getETReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETReference10912); 

            		newLeafNode(otherlv_1, grammarAccess.getETReferenceAccess().getTargetEObjectCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleETReference"


    // $ANTLR start "entryRuleETBooleanLiteral"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4734:1: entryRuleETBooleanLiteral returns [EObject current=null] : iv_ruleETBooleanLiteral= ruleETBooleanLiteral EOF ;
    public final EObject entryRuleETBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETBooleanLiteral = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4735:2: (iv_ruleETBooleanLiteral= ruleETBooleanLiteral EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4736:2: iv_ruleETBooleanLiteral= ruleETBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getETBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleETBooleanLiteral_in_entryRuleETBooleanLiteral10948);
            iv_ruleETBooleanLiteral=ruleETBooleanLiteral();

            state._fsp--;

             current =iv_ruleETBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETBooleanLiteral10958); 

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
    // $ANTLR end "entryRuleETBooleanLiteral"


    // $ANTLR start "ruleETBooleanLiteral"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4743:1: ruleETBooleanLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleBOOL ) ) ) ;
    public final EObject ruleETBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4746:28: ( ( () ( (lv_value_1_0= ruleBOOL ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4747:1: ( () ( (lv_value_1_0= ruleBOOL ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4747:1: ( () ( (lv_value_1_0= ruleBOOL ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4747:2: () ( (lv_value_1_0= ruleBOOL ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4747:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4748:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETBooleanLiteralAccess().getETBooleanLiteralAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4753:2: ( (lv_value_1_0= ruleBOOL ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4754:1: (lv_value_1_0= ruleBOOL )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4754:1: (lv_value_1_0= ruleBOOL )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4755:3: lv_value_1_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getETBooleanLiteralAccess().getValueBOOLParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleETBooleanLiteral11013);
            lv_value_1_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETBooleanLiteralRule());
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
    // $ANTLR end "ruleETBooleanLiteral"


    // $ANTLR start "entryRuleBOOL"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4779:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4780:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4781:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL11050);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL11061); 

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
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4788:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4791:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4792:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4792:1: (kw= 'true' | kw= 'false' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==84) ) {
                alt82=1;
            }
            else if ( (LA82_0==85) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4793:2: kw= 'true'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleBOOL11099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4800:2: kw= 'false'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleBOOL11118); 

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


    // $ANTLR start "entryRuleETNumberLiteral"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4813:1: entryRuleETNumberLiteral returns [EObject current=null] : iv_ruleETNumberLiteral= ruleETNumberLiteral EOF ;
    public final EObject entryRuleETNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETNumberLiteral = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4814:2: (iv_ruleETNumberLiteral= ruleETNumberLiteral EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4815:2: iv_ruleETNumberLiteral= ruleETNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getETNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleETNumberLiteral_in_entryRuleETNumberLiteral11158);
            iv_ruleETNumberLiteral=ruleETNumberLiteral();

            state._fsp--;

             current =iv_ruleETNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETNumberLiteral11168); 

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
    // $ANTLR end "entryRuleETNumberLiteral"


    // $ANTLR start "ruleETNumberLiteral"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4822:1: ruleETNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleETNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4825:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4826:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4826:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4826:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4826:2: ()
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4827:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getETNumberLiteralAccess().getETNumberLiteralAction_0(),
                        current);
                

            }

            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4832:2: ( (lv_value_1_0= RULE_INT ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4833:1: (lv_value_1_0= RULE_INT )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4833:1: (lv_value_1_0= RULE_INT )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4834:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleETNumberLiteral11219); 

            			newLeafNode(lv_value_1_0, grammarAccess.getETNumberLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getETNumberLiteralRule());
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
    // $ANTLR end "ruleETNumberLiteral"


    // $ANTLR start "entryRuleETParenthesizedExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4858:1: entryRuleETParenthesizedExpression returns [EObject current=null] : iv_ruleETParenthesizedExpression= ruleETParenthesizedExpression EOF ;
    public final EObject entryRuleETParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETParenthesizedExpression = null;


        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4859:2: (iv_ruleETParenthesizedExpression= ruleETParenthesizedExpression EOF )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4860:2: iv_ruleETParenthesizedExpression= ruleETParenthesizedExpression EOF
            {
             newCompositeNode(grammarAccess.getETParenthesizedExpressionRule()); 
            pushFollow(FOLLOW_ruleETParenthesizedExpression_in_entryRuleETParenthesizedExpression11260);
            iv_ruleETParenthesizedExpression=ruleETParenthesizedExpression();

            state._fsp--;

             current =iv_ruleETParenthesizedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETParenthesizedExpression11270); 

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
    // $ANTLR end "entryRuleETParenthesizedExpression"


    // $ANTLR start "ruleETParenthesizedExpression"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4867:1: ruleETParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_ETExpression_1= ruleETExpression otherlv_2= ')' ) ;
    public final EObject ruleETParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ETExpression_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4870:28: ( (otherlv_0= '(' this_ETExpression_1= ruleETExpression otherlv_2= ')' ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4871:1: (otherlv_0= '(' this_ETExpression_1= ruleETExpression otherlv_2= ')' )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4871:1: (otherlv_0= '(' this_ETExpression_1= ruleETExpression otherlv_2= ')' )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4871:3: otherlv_0= '(' this_ETExpression_1= ruleETExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleETParenthesizedExpression11307); 

                	newLeafNode(otherlv_0, grammarAccess.getETParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getETParenthesizedExpressionAccess().getETExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleETExpression_in_ruleETParenthesizedExpression11329);
            this_ETExpression_1=ruleETExpression();

            state._fsp--;

             
                    current = this_ETExpression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleETParenthesizedExpression11340); 

                	newLeafNode(otherlv_2, grammarAccess.getETParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleETParenthesizedExpression"


    // $ANTLR start "ruleETIOType"
    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4896:1: ruleETIOType returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleETIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4898:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) )
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4899:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            {
            // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4899:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==20) ) {
                alt83=1;
            }
            else if ( (LA83_0==19) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4899:2: (enumLiteral_0= '?' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4899:2: (enumLiteral_0= '?' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4899:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleETIOType11390); 

                            current = grammarAccess.getETIOTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getETIOTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4905:6: (enumLiteral_1= '!' )
                    {
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4905:6: (enumLiteral_1= '!' )
                    // ../dk.itu.ecdar.text/src-gen/dk/itu/ecdar/text/parser/antlr/internal/InternalEcdarText.g:4905:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleETIOType11407); 

                            current = grammarAccess.getETIOTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getETIOTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleETIOType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleETFile_in_entryRuleETFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETImport_in_ruleETFile140 = new BitSet(new long[]{0x000001C1FF038810L});
    public static final BitSet FOLLOW_ruleETDeclarations_in_ruleETFile162 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleETSpecification_in_ruleETFile183 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleETImport_in_entryRuleETImport220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETImport230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleETImport267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETImport284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETArrayDeclaration_in_entryRuleETArrayDeclaration325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETArrayDeclaration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleETArrayDeclaration372 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETArrayDeclaration393 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleETArrayDeclaration405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDeclarations_in_entryRuleETDeclarations441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDeclarations451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDeclaration_in_ruleETDeclarations507 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleETDeclarations520 = new BitSet(new long[]{0x00000001FF038010L});
    public static final BitSet FOLLOW_ruleETDeclaration_in_ruleETDeclarations541 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleETDeclarations556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETDeclaration_in_entryRuleETDeclaration596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETDeclaration606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETVariableDeclaration_in_ruleETDeclaration653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETTypeDeclaration_in_ruleETDeclaration680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETType_in_entryRuleETType715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETType725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETTypeModifiers_in_ruleETType771 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETTypeIdentifier_in_ruleETType792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETTypeModifiers_in_entryRuleETTypeModifiers828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETTypeModifiers838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleETTypeModifiers935 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_16_in_ruleETTypeModifiers1020 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_17_in_ruleETTypeModifiers1105 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_ruleETVariableDeclaration_in_entryRuleETVariableDeclaration1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETVariableDeclaration1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETVariableDeclaration1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETVariableID_in_ruleETVariableDeclaration1271 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleETVariableDeclaration1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETVariableID_in_ruleETVariableDeclaration1305 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleETVariableID_in_entryRuleETVariableID1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETVariableID1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETVariableID1395 = new BitSet(new long[]{0x0000000000381002L});
    public static final BitSet FOLLOW_19_in_ruleETVariableID1420 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_20_in_ruleETVariableID1449 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_ruleETArrayDeclaration_in_ruleETVariableID1487 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_21_in_ruleETVariableID1501 = new BitSet(new long[]{0x0006001000480030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETInitialiser_in_ruleETVariableID1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETInitialiser_in_entryRuleETInitialiser1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETInitialiser1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSingleInitialiser_in_ruleETInitialiser1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETMultiInitialiser_in_ruleETInitialiser1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSingleInitialiser_in_entryRuleETSingleInitialiser1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSingleInitialiser1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETSingleInitialiser1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETMultiInitialiser_in_entryRuleETMultiInitialiser1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETMultiInitialiser1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleETMultiInitialiser1816 = new BitSet(new long[]{0x0006001000480030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETInitialiser_in_ruleETMultiInitialiser1837 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleETMultiInitialiser1850 = new BitSet(new long[]{0x0006001000480030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETInitialiser_in_ruleETMultiInitialiser1871 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleETMultiInitialiser1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETTypeDeclaration_in_entryRuleETTypeDeclaration1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETTypeDeclaration1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleETTypeDeclaration1968 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETTypeDeclaration1989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETTypeID_in_ruleETTypeDeclaration2010 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleETTypeDeclaration2023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETTypeID_in_ruleETTypeDeclaration2044 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleETTypeID_in_entryRuleETTypeID2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETTypeID2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETTypeID2134 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETArrayDeclaration_in_ruleETTypeID2160 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETTypeIdentifier_in_entryRuleETTypeIdentifier2197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETTypeIdentifier2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETIntegerType_in_ruleETTypeIdentifier2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETClockType_in_ruleETTypeIdentifier2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETActionType_in_ruleETTypeIdentifier2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBooleanType_in_ruleETTypeIdentifier2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETScalarType_in_ruleETTypeIdentifier2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETStructType_in_ruleETTypeIdentifier2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETTypeIdentifier2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETIntegerType_in_entryRuleETIntegerType2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETIntegerType2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleETIntegerType2517 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleETIntegerType2530 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETIntegerType2551 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleETIntegerType2563 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETIntegerType2584 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleETIntegerType2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETClockType_in_entryRuleETClockType2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETClockType2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleETClockType2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETActionType_in_entryRuleETActionType2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETActionType2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETInputType_in_ruleETActionType2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETOutputType_in_ruleETActionType2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleETActionType2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETInputType_in_entryRuleETInputType2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETInputType2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleETInputType2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETOutputType_in_entryRuleETOutputType2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETOutputType2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleETOutputType3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBooleanType_in_entryRuleETBooleanType3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBooleanType3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleETBooleanType3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETScalarType_in_entryRuleETScalarType3150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETScalarType3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleETScalarType3206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleETScalarType3218 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETScalarType3239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleETScalarType3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETStructType_in_entryRuleETStructType3287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETStructType3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleETStructType3343 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleETStructType3355 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETFieldDeclaration_in_ruleETStructType3376 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleETStructType3389 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETFieldDeclaration_in_ruleETStructType3410 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleETStructType3425 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleETStructType3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETFieldDeclaration_in_entryRuleETFieldDeclaration3475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETFieldDeclaration3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETFieldDeclaration3531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETFieldID_in_ruleETFieldDeclaration3552 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleETFieldDeclaration3565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETFieldID_in_ruleETFieldDeclaration3586 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleETFieldID_in_entryRuleETFieldID3624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETFieldID3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETFieldID3676 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETArrayDeclaration_in_ruleETFieldID3702 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETSpecificationExpression_in_entryRuleETSpecificationExpression3739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationExpression3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationDisjunctionExpression_in_ruleETSpecificationExpression3796 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleETSpecificationExpression3817 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleETSpecificationDisjunctionExpression_in_ruleETSpecificationExpression3838 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleETSpecificationDisjunctionExpression_in_entryRuleETSpecificationDisjunctionExpression3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationDisjunctionExpression3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationCompositionExpression_in_ruleETSpecificationDisjunctionExpression3933 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleETSpecificationDisjunctionExpression3954 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleETSpecificationCompositionExpression_in_ruleETSpecificationDisjunctionExpression3975 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleETSpecificationCompositionExpression_in_entryRuleETSpecificationCompositionExpression4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationCompositionExpression4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETPrimarySpecificationExpression_in_ruleETSpecificationCompositionExpression4070 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleETSpecificationCompositionExpression4091 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleETPrimarySpecificationExpression_in_ruleETSpecificationCompositionExpression4112 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleETPrimarySpecificationExpression_in_entryRuleETPrimarySpecificationExpression4150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETPrimarySpecificationExpression4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationReference_in_ruleETPrimarySpecificationExpression4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationInstantiation_in_ruleETPrimarySpecificationExpression4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleETPrimarySpecificationExpression4252 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleETSpecificationExpression_in_ruleETPrimarySpecificationExpression4274 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleETPrimarySpecificationExpression4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationReference_in_entryRuleETSpecificationReference4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationReference4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSpecificationReference4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationInstantiation_in_entryRuleETSpecificationInstantiation4422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationInstantiation4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSpecificationInstantiation4486 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETSpecificationInstantiation4498 = new BitSet(new long[]{0x0006003000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETSpecificationInstantiation4520 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_18_in_ruleETSpecificationInstantiation4533 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETSpecificationInstantiation4554 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleETSpecificationInstantiation4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecification_in_entryRuleETSpecification4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecification4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationBinding_in_ruleETSpecification4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationDefinition_in_ruleETSpecification4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationBinding_in_entryRuleETSpecificationBinding4725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationBinding4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleETSpecificationBinding4772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSpecificationBinding4789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleETSpecificationBinding4806 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleETSpecificationExpression_in_ruleETSpecificationBinding4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationDefinition_in_entryRuleETSpecificationDefinition4863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationDefinition4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationTemplate_in_ruleETSpecificationDefinition4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleETSpecificationDefinition4947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSpecificationDefinition4964 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleETSpecificationBody_in_ruleETSpecificationDefinition4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationTemplate_in_entryRuleETSpecificationTemplate5027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationTemplate5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleETSpecificationTemplate5083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSpecificationTemplate5100 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETSpecificationTemplate5117 = new BitSet(new long[]{0x00000021FE038010L});
    public static final BitSet FOLLOW_ruleETParameter_in_ruleETSpecificationTemplate5139 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_18_in_ruleETSpecificationTemplate5152 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETParameter_in_ruleETSpecificationTemplate5173 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleETSpecificationTemplate5189 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleETSpecificationBody_in_ruleETSpecificationTemplate5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSpecificationBody_in_entryRuleETSpecificationBody5246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSpecificationBody5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleETSpecificationBody5293 = new BitSet(new long[]{0x00000201FF038010L});
    public static final BitSet FOLLOW_ruleETDeclarations_in_ruleETSpecificationBody5314 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleETSpecificationBody5326 = new BitSet(new long[]{0x0000040000008010L});
    public static final BitSet FOLLOW_ruleETLocation_in_ruleETSpecificationBody5347 = new BitSet(new long[]{0x0000040000808010L});
    public static final BitSet FOLLOW_ruleETLocation_in_ruleETSpecificationBody5368 = new BitSet(new long[]{0x0000040000808010L});
    public static final BitSet FOLLOW_23_in_ruleETSpecificationBody5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETParameter_in_entryRuleETParameter5417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETParameter5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETParameter5473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETParameter5490 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETArrayDeclaration_in_ruleETParameter5516 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETLocation_in_entryRuleETLocation5553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETLocation5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleETLocation5651 = new BitSet(new long[]{0x0000040000008010L});
    public static final BitSet FOLLOW_42_in_ruleETLocation5736 = new BitSet(new long[]{0x0000040000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETLocation5806 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleETLocation5823 = new BitSet(new long[]{0x0006381000880030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_43_in_ruleETLocation5836 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETLocation5857 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleETLocation5870 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETLocation5891 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleETLocation5905 = new BitSet(new long[]{0x0006301000880030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETEdge_in_ruleETLocation5929 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleETLocation5942 = new BitSet(new long[]{0x0006301000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETEdge_in_ruleETLocation5963 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23_in_ruleETLocation5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETEdge_in_entryRuleETEdge6015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETEdge6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleETEdge6068 = new BitSet(new long[]{0x0006301000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_45_in_ruleETEdge6096 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETEdge6108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETSelect_in_ruleETEdge6129 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_18_in_ruleETEdge6142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleETSelect_in_ruleETEdge6163 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleETEdge6177 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleETEdge6189 = new BitSet(new long[]{0x0006301000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETIO_in_ruleETEdge6210 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleETEdge6222 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_47_in_ruleETEdge6235 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETEdge6247 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETEdge6268 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleETEdge6280 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_ruleETEdge6296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETEdge6316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleETEdge6336 = new BitSet(new long[]{0x0007001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETEdge6358 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleETEdge6370 = new BitSet(new long[]{0x0007001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_48_in_ruleETEdge6384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETEdge6404 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleETEdge6416 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleETEdge6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETIO_in_ruleETEdge6459 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleETEdge6471 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_47_in_ruleETEdge6484 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETEdge6496 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETEdge6517 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleETEdge6529 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_ruleETEdge6545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETEdge6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleETEdge6585 = new BitSet(new long[]{0x0007001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETEdge6607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleETEdge6619 = new BitSet(new long[]{0x0007001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_48_in_ruleETEdge6633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETEdge6653 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleETEdge6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETIO_in_entryRuleETIO6705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETIO6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETIO6761 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleETIOType_in_ruleETIO6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETSelect_in_entryRuleETSelect6818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETSelect6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETSelect6870 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleETSelect6887 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETSelect6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETExpression_in_entryRuleETExpression6944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETExpression6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETImplyLogicOrExpression_in_ruleETExpression7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleETExpression7030 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_50_in_ruleETExpression7059 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleETExpression7073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETExpression7090 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleETExpression7107 = new BitSet(new long[]{0x00000001FE038010L});
    public static final BitSet FOLLOW_ruleETType_in_ruleETExpression7128 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleETExpression7140 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETExpression7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETImplyLogicOrExpression_in_entryRuleETImplyLogicOrExpression7198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETImplyLogicOrExpression7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression1_in_ruleETImplyLogicOrExpression7255 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_ruleETImplyLogicOrExpression7278 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_52_in_ruleETImplyLogicOrExpression7307 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression1_in_ruleETImplyLogicOrExpression7330 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression1_in_entryRuleETLogicAndExpression17368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETLogicAndExpression17378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETLogicNotExpression1_in_ruleETLogicAndExpression17425 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleETLogicAndExpression17447 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETLogicNotExpression1_in_ruleETLogicAndExpression17469 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleETLogicNotExpression1_in_entryRuleETLogicNotExpression17507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETLogicNotExpression17517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETAssignmentExpression_in_ruleETLogicNotExpression17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETAssignmentExpression_in_entryRuleETAssignmentExpression7597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETAssignmentExpression7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETConditionalExpression_in_ruleETAssignmentExpression7654 = new BitSet(new long[]{0xFFC0000000200002L,0x0000000000000001L});
    public static final BitSet FOLLOW_21_in_ruleETAssignmentExpression7677 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_54_in_ruleETAssignmentExpression7706 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_55_in_ruleETAssignmentExpression7735 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_56_in_ruleETAssignmentExpression7764 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_57_in_ruleETAssignmentExpression7793 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_58_in_ruleETAssignmentExpression7822 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_59_in_ruleETAssignmentExpression7851 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_60_in_ruleETAssignmentExpression7880 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_61_in_ruleETAssignmentExpression7909 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_62_in_ruleETAssignmentExpression7938 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_63_in_ruleETAssignmentExpression7967 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_64_in_ruleETAssignmentExpression7996 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETAssignmentExpression_in_ruleETAssignmentExpression8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETConditionalExpression_in_entryRuleETConditionalExpression8057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETConditionalExpression8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETLogicOrExpression2_in_ruleETConditionalExpression8114 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleETConditionalExpression8135 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETLogicOrExpression2_in_ruleETConditionalExpression8156 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleETConditionalExpression8168 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETConditionalExpression_in_ruleETConditionalExpression8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETLogicOrExpression2_in_entryRuleETLogicOrExpression28227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETLogicOrExpression28237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression2_in_ruleETLogicOrExpression28284 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleETLogicOrExpression28306 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression2_in_ruleETLogicOrExpression28328 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleETLogicAndExpression2_in_entryRuleETLogicAndExpression28366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETLogicAndExpression28376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBitOrExpression_in_ruleETLogicAndExpression28423 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleETLogicAndExpression28445 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETBitOrExpression_in_ruleETLogicAndExpression28467 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleETBitOrExpression_in_entryRuleETBitOrExpression8505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBitOrExpression8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBitXORExpression_in_ruleETBitOrExpression8562 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleETBitOrExpression8584 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETBitXORExpression_in_ruleETBitOrExpression8606 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleETBitXORExpression_in_entryRuleETBitXORExpression8644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBitXORExpression8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBitAndExpression_in_ruleETBitXORExpression8701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleETBitXORExpression8723 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETBitAndExpression_in_ruleETBitXORExpression8745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBitAndExpression_in_entryRuleETBitAndExpression8783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBitAndExpression8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETEqualityExpression_in_ruleETBitAndExpression8840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleETBitAndExpression8862 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETEqualityExpression_in_ruleETBitAndExpression8884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleETEqualityExpression_in_entryRuleETEqualityExpression8922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETEqualityExpression8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETInequalityExpression_in_ruleETEqualityExpression8979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleETEqualityExpression9002 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_68_in_ruleETEqualityExpression9031 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETInequalityExpression_in_ruleETEqualityExpression9054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleETInequalityExpression_in_entryRuleETInequalityExpression9092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETInequalityExpression9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETMinMaxExpression_in_ruleETInequalityExpression9149 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_69_in_ruleETInequalityExpression9172 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_70_in_ruleETInequalityExpression9201 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_71_in_ruleETInequalityExpression9230 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_72_in_ruleETInequalityExpression9259 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETMinMaxExpression_in_ruleETInequalityExpression9282 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleETMinMaxExpression_in_entryRuleETMinMaxExpression9320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETMinMaxExpression9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBitLeftBRightExpression_in_ruleETMinMaxExpression9377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleETMinMaxExpression9400 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_74_in_ruleETMinMaxExpression9429 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETBitLeftBRightExpression_in_ruleETMinMaxExpression9452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleETBitLeftBRightExpression_in_entryRuleETBitLeftBRightExpression9490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBitLeftBRightExpression9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETAdditiveExpression_in_ruleETBitLeftBRightExpression9547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleETBitLeftBRightExpression9570 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_76_in_ruleETBitLeftBRightExpression9599 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETAdditiveExpression_in_ruleETBitLeftBRightExpression9622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleETAdditiveExpression_in_entryRuleETAdditiveExpression9660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETAdditiveExpression9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETMultiplicativeExpression_in_ruleETAdditiveExpression9717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleETAdditiveExpression9740 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_78_in_ruleETAdditiveExpression9769 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETMultiplicativeExpression_in_ruleETAdditiveExpression9792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleETMultiplicativeExpression_in_entryRuleETMultiplicativeExpression9830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETMultiplicativeExpression9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETPrefixExpression_in_ruleETMultiplicativeExpression9887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_79_in_ruleETMultiplicativeExpression9910 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_80_in_ruleETMultiplicativeExpression9939 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_81_in_ruleETMultiplicativeExpression9968 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETPrefixExpression_in_ruleETMultiplicativeExpression9991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleETPrefixExpression_in_entryRuleETPrefixExpression10029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETPrefixExpression10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETUnaryExpression_in_ruleETPrefixExpression10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleETPrefixExpression10115 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_83_in_ruleETPrefixExpression10144 = new BitSet(new long[]{0x0000001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETPrefixExpression_in_ruleETPrefixExpression10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETUnaryExpression_in_entryRuleETUnaryExpression10204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETUnaryExpression10214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETPostfixExpression_in_ruleETUnaryExpression10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleETUnaryExpression10290 = new BitSet(new long[]{0x0000001000080030L,0x0000000000304000L});
    public static final BitSet FOLLOW_78_in_ruleETUnaryExpression10319 = new BitSet(new long[]{0x0000001000080030L,0x0000000000304000L});
    public static final BitSet FOLLOW_ruleETUnaryExpression_in_ruleETUnaryExpression10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETPostfixExpression_in_entryRuleETPostfixExpression10379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETPostfixExpression10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETArrayExpression_in_ruleETPostfixExpression10436 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleETPostfixExpression10458 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_83_in_ruleETPostfixExpression10487 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleETArrayExpression_in_entryRuleETArrayExpression10526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETArrayExpression10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETPrimaryExpression_in_ruleETArrayExpression10583 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleETArrayExpression10604 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETArrayExpression10625 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleETArrayExpression10637 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleETPrimaryExpression_in_entryRuleETPrimaryExpression10675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETPrimaryExpression10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETReference_in_ruleETPrimaryExpression10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETNumberLiteral_in_ruleETPrimaryExpression10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBooleanLiteral_in_ruleETPrimaryExpression10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETParenthesizedExpression_in_ruleETPrimaryExpression10813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETReference_in_entryRuleETReference10848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETReference10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETReference10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETBooleanLiteral_in_entryRuleETBooleanLiteral10948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETBooleanLiteral10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleETBooleanLiteral11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL11050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleBOOL11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleBOOL11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETNumberLiteral_in_entryRuleETNumberLiteral11158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETNumberLiteral11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleETNumberLiteral11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETParenthesizedExpression_in_entryRuleETParenthesizedExpression11260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETParenthesizedExpression11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleETParenthesizedExpression11307 = new BitSet(new long[]{0x0006001000080030L,0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleETExpression_in_ruleETParenthesizedExpression11329 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleETParenthesizedExpression11340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleETIOType11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleETIOType11407 = new BitSet(new long[]{0x0000000000000002L});

}
