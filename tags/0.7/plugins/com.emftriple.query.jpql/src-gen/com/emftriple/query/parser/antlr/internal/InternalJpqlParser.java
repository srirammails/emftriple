package com.emftriple.query.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import com.emftriple.query.services.JpqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJpqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_66", "KEYWORD_64", "KEYWORD_65", "KEYWORD_63", "KEYWORD_62", "KEYWORD_61", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_DATE_LITERAL", "RULE_TIME_LITERAL", "RULE_TIMESTAMP_LITERAL", "RULE_LITERALTEMPORAL", "RULE_DATE_STRING", "RULE_TIME_STRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=76;
    public static final int RULE_ANY_OTHER=82;
    public static final int KEYWORD_56=15;
    public static final int KEYWORD_19=41;
    public static final int KEYWORD_55=14;
    public static final int KEYWORD_54=13;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_18=40;
    public static final int KEYWORD_53=12;
    public static final int KEYWORD_52=11;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_51=10;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_50=29;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int EOF=-1;
    public static final int KEYWORD_12=56;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_59=18;
    public static final int KEYWORD_58=17;
    public static final int KEYWORD_57=16;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_28=50;
    public static final int KEYWORD_65=6;
    public static final int KEYWORD_29=51;
    public static final int KEYWORD_64=5;
    public static final int RULE_INT=77;
    public static final int KEYWORD_66=4;
    public static final int KEYWORD_24=46;
    public static final int KEYWORD_61=9;
    public static final int KEYWORD_25=47;
    public static final int KEYWORD_60=19;
    public static final int RULE_DATE_STRING=74;
    public static final int RULE_TIME_LITERAL=71;
    public static final int KEYWORD_26=48;
    public static final int KEYWORD_63=7;
    public static final int KEYWORD_62=8;
    public static final int KEYWORD_27=49;
    public static final int KEYWORD_20=42;
    public static final int KEYWORD_21=43;
    public static final int KEYWORD_22=44;
    public static final int KEYWORD_23=45;
    public static final int RULE_DATE_LITERAL=70;
    public static final int RULE_TIMESTAMP_LITERAL=72;
    public static final int RULE_LITERALTEMPORAL=73;
    public static final int KEYWORD_30=52;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_34=33;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_33=32;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_32=31;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_31=30;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_38=37;
    public static final int KEYWORD_37=36;
    public static final int RULE_SL_COMMENT=80;
    public static final int Tokens=83;
    public static final int KEYWORD_36=35;
    public static final int KEYWORD_35=34;
    public static final int RULE_ML_COMMENT=79;
    public static final int KEYWORD_39=38;
    public static final int RULE_STRING=78;
    public static final int RULE_TIME_STRING=75;
    public static final int KEYWORD_41=20;
    public static final int KEYWORD_40=39;
    public static final int KEYWORD_43=22;
    public static final int KEYWORD_42=21;
    public static final int KEYWORD_45=24;
    public static final int KEYWORD_44=23;
    public static final int KEYWORD_47=26;
    public static final int RULE_WS=81;
    public static final int KEYWORD_46=25;
    public static final int KEYWORD_49=28;
    public static final int KEYWORD_48=27;

        public InternalJpqlParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[226+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

     	private JpqlGrammarAccess grammarAccess;
     	
        public InternalJpqlParser(TokenStream input, IAstFactory factory, JpqlGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("com/emftriple/query/parser/antlr/internal/InternalJpql.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QueryModule";	
       	} 
       	   	
       	@Override
       	protected JpqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleQueryModule
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:78:1: entryRuleQueryModule returns [EObject current=null] : iv_ruleQueryModule= ruleQueryModule EOF ;
    public final EObject entryRuleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryModule = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:79:2: (iv_ruleQueryModule= ruleQueryModule EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:80:2: iv_ruleQueryModule= ruleQueryModule EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQueryModuleRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQueryModule_in_entryRuleQueryModule73);
            iv_ruleQueryModule=ruleQueryModule();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQueryModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryModule83); if (failed) return current;

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
    // $ANTLR end entryRuleQueryModule


    // $ANTLR start ruleQueryModule
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:87:1: ruleQueryModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) ;
    public final EObject ruleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_defaultQuery_1_0 = null;

        EObject lv_namedQueries_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:92:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:93:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:93:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:94:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:94:1: (lv_imports_0_0= ruleImport )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:95:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQueryModuleAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleQueryModule129);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getQueryModuleRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:117:3: ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_52||(LA2_0>=KEYWORD_59 && LA2_0<=KEYWORD_60)||LA2_0==KEYWORD_32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:118:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:118:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:119:3: lv_defaultQuery_1_0= ruleJPQLQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getQueryModuleAccess().getDefaultQueryJPQLQueryParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJPQLQuery_in_ruleQueryModule151);
                    lv_defaultQuery_1_0=ruleJPQLQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getQueryModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"defaultQuery",
                      	        		lv_defaultQuery_1_0, 
                      	        		"JPQLQuery", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:141:3: ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:142:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:142:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:143:3: lv_namedQueries_2_0= ruleNamedQuery
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQueryModuleAccess().getNamedQueriesNamedQueryParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNamedQuery_in_ruleQueryModule173);
            	    lv_namedQueries_2_0=ruleNamedQuery();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getQueryModuleRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"namedQueries",
            	      	        		lv_namedQueries_2_0, 
            	      	        		"NamedQuery", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleQueryModule


    // $ANTLR start entryRuleImport
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:173:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:174:2: (iv_ruleImport= ruleImport EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:175:2: iv_ruleImport= ruleImport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport209);
            iv_ruleImport=ruleImport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport219); if (failed) return current;

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:182:1: ruleImport returns [EObject current=null] : ( KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:187:6: ( ( KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:188:1: ( KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:188:1: ( KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:189:2: KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleImport255); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getIMPORTKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:193:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:194:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:194:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:195:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport272); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleNamedQuery
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:225:1: entryRuleNamedQuery returns [EObject current=null] : iv_ruleNamedQuery= ruleNamedQuery EOF ;
    public final EObject entryRuleNamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedQuery = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:226:2: (iv_ruleNamedQuery= ruleNamedQuery EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:227:2: iv_ruleNamedQuery= ruleNamedQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery312);
            iv_ruleNamedQuery=ruleNamedQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedQuery322); if (failed) return current;

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
    // $ANTLR end entryRuleNamedQuery


    // $ANTLR start ruleNamedQuery
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:234:1: ruleNamedQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) ) ;
    public final EObject ruleNamedQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_query_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:239:6: ( ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:240:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:240:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:240:2: ( (lv_name_0_0= RULE_ID ) ) KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:240:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:241:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:241:1: (lv_name_0_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:242:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedQuery364); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNamedQueryAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNamedQuery380); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedQueryAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:269:1: ( (lv_query_2_0= ruleJPQLQuery ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:270:1: (lv_query_2_0= ruleJPQLQuery )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:270:1: (lv_query_2_0= ruleJPQLQuery )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:271:3: lv_query_2_0= ruleJPQLQuery
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNamedQueryAccess().getQueryJPQLQueryParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_ruleNamedQuery401);
            lv_query_2_0=ruleJPQLQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_2_0, 
              	        		"JPQLQuery", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNamedQuery


    // $ANTLR start entryRuleJPQLQuery
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:301:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:302:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:303:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getJPQLQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery436);
            iv_ruleJPQLQuery=ruleJPQLQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleJPQLQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPQLQuery446); if (failed) return current;

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
    // $ANTLR end entryRuleJPQLQuery


    // $ANTLR start ruleJPQLQuery
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:310:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:315:6: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:316:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:316:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
            case KEYWORD_32:
                {
                alt4=1;
                }
                break;
            case KEYWORD_60:
                {
                alt4=2;
                }
                break;
            case KEYWORD_52:
                {
                alt4=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("316:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:317:2: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getJPQLQueryAccess().getSelectStatementParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleJPQLQuery496);
                    this_SelectStatement_0=ruleSelectStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectStatement_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:330:2: this_UpdateStatement_1= ruleUpdateStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getJPQLQueryAccess().getUpdateStatementParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery526);
                    this_UpdateStatement_1=ruleUpdateStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UpdateStatement_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:343:2: this_DeleteStatement_2= ruleDeleteStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getJPQLQueryAccess().getDeleteStatementParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery556);
                    this_DeleteStatement_2=ruleDeleteStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DeleteStatement_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleJPQLQuery


    // $ANTLR start entryRuleSelectStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:362:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:363:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:364:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement590);
            iv_ruleSelectStatement=ruleSelectStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement600); if (failed) return current;

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
    // $ANTLR end entryRuleSelectStatement


    // $ANTLR start ruleSelectStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:371:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_having_2_0 = null;

        EObject lv_order_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:376:6: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:377:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:377:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:377:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )?
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:377:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:378:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:378:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:379:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement646);
            lv_selectFromClause_0_0=ruleSelectFromClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"selectFromClause",
              	        		lv_selectFromClause_0_0, 
              	        		"SelectFromClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:401:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_50) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:402:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:402:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:403:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement667);
                    lv_whereClause_1_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_1_0, 
                      	        		"WhereClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:425:3: ( (lv_having_2_0= ruleHavingClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_54) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:426:1: (lv_having_2_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:426:1: (lv_having_2_0= ruleHavingClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:427:3: lv_having_2_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement689);
                    lv_having_2_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"having",
                      	        		lv_having_2_0, 
                      	        		"HavingClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:449:3: ( (lv_order_3_0= ruleOrderClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_47) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:450:1: (lv_order_3_0= ruleOrderClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:450:1: (lv_order_3_0= ruleOrderClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:451:3: lv_order_3_0= ruleOrderClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement711);
                    lv_order_3_0=ruleOrderClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"order",
                      	        		lv_order_3_0, 
                      	        		"OrderClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectStatement


    // $ANTLR start entryRuleHavingClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:481:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:482:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:483:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHavingClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause747);
            iv_ruleHavingClause=ruleHavingClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause757); if (failed) return current;

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
    // $ANTLR end entryRuleHavingClause


    // $ANTLR start ruleHavingClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:490:1: ruleHavingClause returns [EObject current=null] : ( KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject lv_having_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:495:6: ( ( KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:496:1: ( KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:496:1: ( KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:497:2: KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) )
            {
            match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleHavingClause793); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:501:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:502:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:502:1: (lv_having_1_0= ruleOrExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:503:3: lv_having_1_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause814);
            lv_having_1_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHavingClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"having",
              	        		lv_having_1_0, 
              	        		"OrExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleHavingClause


    // $ANTLR start entryRuleOrderClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:533:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:534:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:535:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrderClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause849);
            iv_ruleOrderClause=ruleOrderClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrderClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause859); if (failed) return current;

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
    // $ANTLR end entryRuleOrderClause


    // $ANTLR start ruleOrderClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:542:1: ruleOrderClause returns [EObject current=null] : ( KEYWORD_47 KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) ;
    public final EObject ruleOrderClause() throws RecognitionException {
        EObject current = null;

        Token lv_isAsc_5_0=null;
        Token lv_isDesc_6_0=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:547:6: ( ( KEYWORD_47 KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:548:1: ( KEYWORD_47 KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:548:1: ( KEYWORD_47 KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:549:2: KEYWORD_47 KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            {
            match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleOrderClause895); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOrderClauseAccess().getORDERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOrderClause906); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOrderClauseAccess().getBYKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:558:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:559:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:559:1: (lv_ordering_2_0= ruleOrderItem )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:560:3: lv_ordering_2_0= ruleOrderItem
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause927);
            lv_ordering_2_0=ruleOrderItem();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOrderClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"ordering",
              	        		lv_ordering_2_0, 
              	        		"OrderItem", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:582:2: ( KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_3) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:583:2: KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOrderClause939); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:587:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:588:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:588:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:589:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause960);
            	    lv_ordering_4_0=ruleOrderItem();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrderClauseRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"ordering",
            	      	        		lv_ordering_4_0, 
            	      	        		"OrderItem", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:611:4: ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_22) ) {
                alt9=1;
            }
            else if ( (LA9_0==KEYWORD_31) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:611:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:611:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:612:1: (lv_isAsc_5_0= KEYWORD_22 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:612:1: (lv_isAsc_5_0= KEYWORD_22 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:613:3: lv_isAsc_5_0= KEYWORD_22
                    {
                    lv_isAsc_5_0=(Token)input.LT(1);
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrderClause982); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrderClauseAccess().getIsAscASCKeyword_4_0_0(), "isAsc"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOrderClauseRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isAsc", true, "ASC", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:634:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:634:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:635:1: (lv_isDesc_6_0= KEYWORD_31 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:635:1: (lv_isDesc_6_0= KEYWORD_31 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:636:3: lv_isDesc_6_0= KEYWORD_31
                    {
                    lv_isDesc_6_0=(Token)input.LT(1);
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOrderClause1020); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrderClauseAccess().getIsDescDESCKeyword_4_1_0(), "isDesc"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOrderClauseRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDesc", true, "DESC", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOrderClause


    // $ANTLR start entryRuleOrderItem
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:664:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:665:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:666:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrderItemRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem1070);
            iv_ruleOrderItem=ruleOrderItem();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrderItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem1080); if (failed) return current;

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
    // $ANTLR end entryRuleOrderItem


    // $ANTLR start ruleOrderItem
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:673:1: ruleOrderItem returns [EObject current=null] : ( ( ( RULE_ID ) ) KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:678:6: ( ( ( ( RULE_ID ) ) KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:679:1: ( ( ( RULE_ID ) ) KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:679:1: ( ( ( RULE_ID ) ) KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:679:2: ( ( RULE_ID ) ) KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:679:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:680:1: ( RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:680:1: ( RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:681:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getOrderItemRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1127); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getOrderItemAccess().getVarFromEntryCrossReference_0_0(), "var"); 
              	
            }

            }


            }

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOrderItem1138); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOrderItemAccess().getFullStopKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:701:1: ( (lv_feature_2_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:702:1: (lv_feature_2_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:702:1: (lv_feature_2_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:703:3: lv_feature_2_0= RULE_ID
            {
            lv_feature_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1155); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOrderItemAccess().getFeatureIDTerminalRuleCall_2_0(), "feature"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOrderItemRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"feature",
              	        		lv_feature_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOrderItem


    // $ANTLR start entryRuleUpdateStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:733:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:734:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:735:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUpdateStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1195);
            iv_ruleUpdateStatement=ruleUpdateStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1205); if (failed) return current;

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
    // $ANTLR end entryRuleUpdateStatement


    // $ANTLR start ruleUpdateStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:742:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:747:6: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:748:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:748:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:748:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:748:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:749:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:749:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:750:3: lv_updateClause_0_0= ruleUpdateClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1251);
            lv_updateClause_0_0=ruleUpdateClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"updateClause",
              	        		lv_updateClause_0_0, 
              	        		"UpdateClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:772:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:773:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:773:1: (lv_setClause_1_0= ruleSetClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:774:3: lv_setClause_1_0= ruleSetClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1272);
            lv_setClause_1_0=ruleSetClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"setClause",
              	        		lv_setClause_1_0, 
              	        		"SetClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:796:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_50) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:797:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:797:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:798:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1293);
                    lv_whereClause_2_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUpdateStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_2_0, 
                      	        		"WhereClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUpdateStatement


    // $ANTLR start entryRuleUpdateClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:828:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:829:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:830:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUpdateClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1329);
            iv_ruleUpdateClause=ruleUpdateClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUpdateClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1339); if (failed) return current;

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
    // $ANTLR end entryRuleUpdateClause


    // $ANTLR start ruleUpdateClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:837:1: ruleUpdateClause returns [EObject current=null] : ( KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:842:6: ( ( KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:843:1: ( KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:843:1: ( KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:844:2: KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleUpdateClause1375); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:848:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:849:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:849:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:850:3: lv_fromEntries_1_0= ruleFromEntry
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1396);
            lv_fromEntries_1_0=ruleFromEntry();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUpdateClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"fromEntries",
              	        		lv_fromEntries_1_0, 
              	        		"FromEntry", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:872:2: ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_3) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:873:2: KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleUpdateClause1408); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:877:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:878:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:878:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:879:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1429);
            	    lv_fromEntries_3_0=ruleFromEntry();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getUpdateClauseRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"fromEntries",
            	      	        		lv_fromEntries_3_0, 
            	      	        		"FromEntry", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUpdateClause


    // $ANTLR start entryRuleSetClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:909:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:910:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:911:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSetClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1466);
            iv_ruleSetClause=ruleSetClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1476); if (failed) return current;

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
    // $ANTLR end entryRuleSetClause


    // $ANTLR start ruleSetClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:918:1: ruleSetClause returns [EObject current=null] : ( KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:923:6: ( ( KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:924:1: ( KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:924:1: ( KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:925:2: KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSetClause1512); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSetClauseAccess().getSETKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:929:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:930:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:930:1: (lv_items_1_0= ruleUpdateItem )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:931:3: lv_items_1_0= ruleUpdateItem
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1533);
            lv_items_1_0=ruleUpdateItem();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSetClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"items",
              	        		lv_items_1_0, 
              	        		"UpdateItem", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:953:2: ( KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KEYWORD_3) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:954:2: KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSetClause1545); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSetClauseAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:958:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:959:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:959:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:960:3: lv_items_3_0= ruleUpdateItem
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1566);
            	    lv_items_3_0=ruleUpdateItem();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSetClauseRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"items",
            	      	        		lv_items_3_0, 
            	      	        		"UpdateItem", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSetClause


    // $ANTLR start entryRuleUpdateItem
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:990:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:991:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:992:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUpdateItemRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1603);
            iv_ruleUpdateItem=ruleUpdateItem();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUpdateItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1613); if (failed) return current;

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
    // $ANTLR end entryRuleUpdateItem


    // $ANTLR start ruleUpdateItem
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:999:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1004:6: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1005:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1005:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1005:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) KEYWORD_7 ( (lv_value_2_0= ruleValue ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1005:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1006:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1006:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1007:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1659);
            lv_alias_0_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUpdateItemRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"alias",
              	        		lv_alias_0_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUpdateItem1670); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1034:1: ( (lv_value_2_0= ruleValue ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1035:1: (lv_value_2_0= ruleValue )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1035:1: (lv_value_2_0= ruleValue )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1036:3: lv_value_2_0= ruleValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1691);
            lv_value_2_0=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUpdateItemRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Value", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUpdateItem


    // $ANTLR start entryRuleDeleteStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1066:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1067:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1068:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1726);
            iv_ruleDeleteStatement=ruleDeleteStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1736); if (failed) return current;

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
    // $ANTLR end entryRuleDeleteStatement


    // $ANTLR start ruleDeleteStatement
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1075:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1080:6: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1081:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1081:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1081:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1081:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1082:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1082:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1083:3: lv_deleteClause_0_0= ruleDeleteClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1782);
            lv_deleteClause_0_0=ruleDeleteClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeleteStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"deleteClause",
              	        		lv_deleteClause_0_0, 
              	        		"DeleteClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1105:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1106:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1106:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1107:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1803);
                    lv_whereClause_1_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_1_0, 
                      	        		"WhereClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDeleteStatement


    // $ANTLR start entryRuleDeleteClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1137:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1138:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1139:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1839);
            iv_ruleDeleteClause=ruleDeleteClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1849); if (failed) return current;

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
    // $ANTLR end entryRuleDeleteClause


    // $ANTLR start ruleDeleteClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1146:1: ruleDeleteClause returns [EObject current=null] : ( KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fromClause_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1151:6: ( ( KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1152:1: ( KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1152:1: ( KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1153:2: KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleDeleteClause1885); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1157:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1158:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1158:1: (lv_fromClause_1_0= ruleFromClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1159:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1906);
            lv_fromClause_1_0=ruleFromClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeleteClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fromClause",
              	        		lv_fromClause_1_0, 
              	        		"FromClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDeleteClause


    // $ANTLR start entryRuleSelectFromClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1189:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1190:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1191:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectFromClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1941);
            iv_ruleSelectFromClause=ruleSelectFromClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause1951); if (failed) return current;

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
    // $ANTLR end entryRuleSelectFromClause


    // $ANTLR start ruleSelectFromClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1198:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1203:6: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1204:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1204:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1204:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1204:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_59) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1205:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1205:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1206:3: lv_selectClause_0_0= ruleSelectClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause1997);
                    lv_selectClause_0_0=ruleSelectClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectFromClauseRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"selectClause",
                      	        		lv_selectClause_0_0, 
                      	        		"SelectClause", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1228:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1229:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1229:1: (lv_fromClause_1_0= ruleFromClause )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1230:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause2019);
            lv_fromClause_1_0=ruleFromClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectFromClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fromClause",
              	        		lv_fromClause_1_0, 
              	        		"FromClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectFromClause


    // $ANTLR start entryRuleSelectClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1260:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1261:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1262:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause2054);
            iv_ruleSelectClause=ruleSelectClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause2064); if (failed) return current;

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
    // $ANTLR end entryRuleSelectClause


    // $ANTLR start ruleSelectClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1269:1: ruleSelectClause returns [EObject current=null] : ( KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_1_0=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1274:6: ( ( KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1275:1: ( KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1275:1: ( KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1276:2: KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleSelectClause2100); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectClauseAccess().getSELECTKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1280:1: ( (lv_isDistinct_1_0= KEYWORD_62 ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_62) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1281:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1281:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1282:3: lv_isDistinct_1_0= KEYWORD_62
                    {
                    lv_isDistinct_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSelectClause2119); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSelectClauseAccess().getIsDistinctDISTINCTKeyword_1_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectClauseRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1302:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1303:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1303:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1304:3: lv_expressions_2_0= ruleSelectExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2154);
            lv_expressions_2_0=ruleSelectExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"expressions",
              	        		lv_expressions_2_0, 
              	        		"SelectExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1326:2: ( KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_3) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1327:2: KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectClause2166); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1331:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1332:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1332:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1333:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2187);
            	    lv_expressions_4_0=ruleSelectExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectClauseRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_4_0, 
            	      	        		"SelectExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectClause


    // $ANTLR start entryRuleSelectExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1363:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1364:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1365:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2224);
            iv_ruleSelectExpression=ruleSelectExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression2234); if (failed) return current;

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
    // $ANTLR end entryRuleSelectExpression


    // $ANTLR start ruleSelectExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1372:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1377:6: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1378:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1378:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_30:
                {
                alt17=2;
                }
                break;
            case KEYWORD_27:
                {
                alt17=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1378:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1379:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2284);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AliasAttributeExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1392:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2314);
                    this_SelectAggregateExpression_1=ruleSelectAggregateExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectAggregateExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1405:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2344);
                    this_SelectConstructorExpression_2=ruleSelectConstructorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectConstructorExpression_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectExpression


    // $ANTLR start entryRuleSelectAggregateExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1424:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1425:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1426:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectAggregateExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2378);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectAggregateExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2388); if (failed) return current;

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
    // $ANTLR end entryRuleSelectAggregateExpression


    // $ANTLR start ruleSelectAggregateExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1433:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1438:6: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1439:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1439:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt18=5;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt18=1;
                }
                break;
            case KEYWORD_24:
                {
                alt18=2;
                }
                break;
            case KEYWORD_25:
                {
                alt18=3;
                }
                break;
            case KEYWORD_30:
                {
                alt18=4;
                }
                break;
            case KEYWORD_41:
                {
                alt18=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1439:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1440:2: this_AvgAggregate_0= ruleAvgAggregate
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2438);
                    this_AvgAggregate_0=ruleAvgAggregate();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AvgAggregate_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1453:2: this_MaxAggregate_1= ruleMaxAggregate
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2468);
                    this_MaxAggregate_1=ruleMaxAggregate();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MaxAggregate_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1466:2: this_MinAggregate_2= ruleMinAggregate
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2498);
                    this_MinAggregate_2=ruleMinAggregate();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MinAggregate_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1479:2: this_SumAggregate_3= ruleSumAggregate
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2528);
                    this_SumAggregate_3=ruleSumAggregate();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SumAggregate_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1492:2: this_CountAggregate_4= ruleCountAggregate
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2558);
                    this_CountAggregate_4=ruleCountAggregate();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CountAggregate_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectAggregateExpression


    // $ANTLR start entryRuleAvgAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1511:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1512:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1513:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAvgAggregateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2592);
            iv_ruleAvgAggregate=ruleAvgAggregate();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAvgAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2602); if (failed) return current;

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
    // $ANTLR end entryRuleAvgAggregate


    // $ANTLR start ruleAvgAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1520:1: ruleAvgAggregate returns [EObject current=null] : ( KEYWORD_23 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_2_0=null;
        EObject lv_item_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1525:6: ( ( KEYWORD_23 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1526:1: ( KEYWORD_23 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1526:1: ( KEYWORD_23 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1527:2: KEYWORD_23 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAvgAggregate2638); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAvgAggregateAccess().getAVGKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2649); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1536:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1537:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1537:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1538:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleAvgAggregate2668); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAvgAggregateAccess().getIsDistinctDISTINCTKeyword_2_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAvgAggregateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1558:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1559:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1559:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1560:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2703);
            lv_item_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAvgAggregateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"item",
              	        		lv_item_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleAvgAggregate2714); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAvgAggregateAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAvgAggregate


    // $ANTLR start entryRuleMaxAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1595:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1596:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1597:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMaxAggregateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2749);
            iv_ruleMaxAggregate=ruleMaxAggregate();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2759); if (failed) return current;

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
    // $ANTLR end entryRuleMaxAggregate


    // $ANTLR start ruleMaxAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1604:1: ruleMaxAggregate returns [EObject current=null] : ( KEYWORD_24 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_2_0=null;
        EObject lv_item_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1609:6: ( ( KEYWORD_24 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1610:1: ( KEYWORD_24 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1610:1: ( KEYWORD_24 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1611:2: KEYWORD_24 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMaxAggregate2795); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMaxAggregateAccess().getMAXKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2806); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1620:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1621:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1621:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1622:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMaxAggregate2825); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMaxAggregateAccess().getIsDistinctDISTINCTKeyword_2_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMaxAggregateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1642:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1643:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1643:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1644:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2860);
            lv_item_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMaxAggregateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"item",
              	        		lv_item_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2871); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMaxAggregateAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMaxAggregate


    // $ANTLR start entryRuleMinAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1679:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1680:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1681:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMinAggregateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2906);
            iv_ruleMinAggregate=ruleMinAggregate();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2916); if (failed) return current;

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
    // $ANTLR end entryRuleMinAggregate


    // $ANTLR start ruleMinAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1688:1: ruleMinAggregate returns [EObject current=null] : ( KEYWORD_25 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_2_0=null;
        EObject lv_item_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1693:6: ( ( KEYWORD_25 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1694:1: ( KEYWORD_25 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1694:1: ( KEYWORD_25 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1695:2: KEYWORD_25 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMinAggregate2952); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMinAggregateAccess().getMINKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2963); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1704:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1705:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1705:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1706:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMinAggregate2982); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMinAggregateAccess().getIsDistinctDISTINCTKeyword_2_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMinAggregateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1726:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1727:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1727:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1728:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3017);
            lv_item_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMinAggregateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"item",
              	        		lv_item_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate3028); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMinAggregateAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMinAggregate


    // $ANTLR start entryRuleSumAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1763:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1764:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1765:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSumAggregateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3063);
            iv_ruleSumAggregate=ruleSumAggregate();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate3073); if (failed) return current;

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
    // $ANTLR end entryRuleSumAggregate


    // $ANTLR start ruleSumAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1772:1: ruleSumAggregate returns [EObject current=null] : ( KEYWORD_30 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_2_0=null;
        EObject lv_item_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1777:6: ( ( KEYWORD_30 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1778:1: ( KEYWORD_30 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1778:1: ( KEYWORD_30 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1779:2: KEYWORD_30 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSumAggregate3109); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSumAggregateAccess().getSUMKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate3120); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1788:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1789:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1789:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1790:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSumAggregate3139); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSumAggregateAccess().getIsDistinctDISTINCTKeyword_2_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSumAggregateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1810:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1811:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1811:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1812:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3174);
            lv_item_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSumAggregateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"item",
              	        		lv_item_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate3185); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSumAggregateAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSumAggregate


    // $ANTLR start entryRuleCountAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1847:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1848:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1849:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCountAggregateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3220);
            iv_ruleCountAggregate=ruleCountAggregate();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate3230); if (failed) return current;

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
    // $ANTLR end entryRuleCountAggregate


    // $ANTLR start ruleCountAggregate
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1856:1: ruleCountAggregate returns [EObject current=null] : ( KEYWORD_41 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_2_0=null;
        EObject lv_item_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1861:6: ( ( KEYWORD_41 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1862:1: ( KEYWORD_41 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1862:1: ( KEYWORD_41 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1863:2: KEYWORD_41 KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleCountAggregate3266); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate3277); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1872:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_62) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1873:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1873:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1874:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleCountAggregate3296); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCountAggregateAccess().getIsDistinctDISTINCTKeyword_2_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCountAggregateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDistinct", true, "DISTINCT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1894:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1895:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1895:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1896:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3331);
            lv_item_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCountAggregateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"item",
              	        		lv_item_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate3342); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCountAggregateAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCountAggregate


    // $ANTLR start entryRuleSelectConstructorExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1931:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1932:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1933:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectConstructorExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3377);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectConstructorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3387); if (failed) return current;

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
    // $ANTLR end entryRuleSelectConstructorExpression


    // $ANTLR start ruleSelectConstructorExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1940:1: ruleSelectConstructorExpression returns [EObject current=null] : ( KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* KEYWORD_2 ) ;
    public final EObject ruleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1945:6: ( ( KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1946:1: ( KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1946:1: ( KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1947:2: KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* KEYWORD_2
            {
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3423); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1951:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1952:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1952:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1953:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3440); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSelectConstructorExpressionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectConstructorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3456); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1980:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1981:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1981:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:1982:3: lv_items_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3477);
            lv_items_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectConstructorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"items",
              	        		lv_items_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2004:2: ( KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KEYWORD_3) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2005:2: KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3489); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2009:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2010:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2010:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2011:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3510);
            	    lv_items_5_0=ruleAliasAttributeExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectConstructorExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"items",
            	      	        		lv_items_5_0, 
            	      	        		"AliasAttributeExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3523); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectConstructorExpressionAccess().getRightParenthesisKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSelectConstructorExpression


    // $ANTLR start entryRuleFromClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2046:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2047:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2048:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3558);
            iv_ruleFromClause=ruleFromClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3568); if (failed) return current;

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
    // $ANTLR end entryRuleFromClause


    // $ANTLR start ruleFromClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2055:1: ruleFromClause returns [EObject current=null] : ( KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2060:6: ( ( KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2061:1: ( KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2061:1: ( KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2062:2: KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleFromClause3604); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFromClauseAccess().getFROMKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2066:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2067:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2067:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2068:3: lv_fromEntries_1_0= ruleFromClass
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3625);
            lv_fromEntries_1_0=ruleFromClass();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"fromEntries",
              	        		lv_fromEntries_1_0, 
              	        		"FromClass", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2090:2: ( KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_3) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2091:2: KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFromClause3637); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFromClauseAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2095:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2096:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2096:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2097:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3658);
            	    lv_fromEntries_3_0=ruleFromEntry();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFromClauseRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"fromEntries",
            	      	        		lv_fromEntries_3_0, 
            	      	        		"FromEntry", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromClause


    // $ANTLR start entryRuleFromEntry
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2127:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2128:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2129:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromEntryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3695);
            iv_ruleFromEntry=ruleFromEntry();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3705); if (failed) return current;

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
    // $ANTLR end entryRuleFromEntry


    // $ANTLR start ruleFromEntry
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2136:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2141:6: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2142:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2142:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_14) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2142:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2143:2: this_FromClass_0= ruleFromClass
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3755);
                    this_FromClass_0=ruleFromClass();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_FromClass_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2156:2: this_FromCollection_1= ruleFromCollection
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3785);
                    this_FromCollection_1=ruleFromCollection();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_FromCollection_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromEntry


    // $ANTLR start entryRuleVariableDeclaration
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2175:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2176:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2177:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3819);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3829); if (failed) return current;

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
    // $ANTLR end entryRuleVariableDeclaration


    // $ANTLR start ruleVariableDeclaration
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2184:1: ruleVariableDeclaration returns [EObject current=null] : ( ( KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2189:6: ( ( ( KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2190:1: ( ( KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2190:1: ( ( KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2190:2: ( KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2190:2: ( KEYWORD_12 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2191:2: KEYWORD_12
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3866); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableDeclarationAccess().getASKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2195:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2196:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2196:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2197:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3885); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVariableDeclaration


    // $ANTLR start entryRuleFromClass
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2227:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2228:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2229:2: iv_ruleFromClass= ruleFromClass EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromClassRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3925);
            iv_ruleFromClass=ruleFromClass();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3935); if (failed) return current;

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
    // $ANTLR end entryRuleFromClass


    // $ANTLR start ruleFromClass
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2236:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2241:6: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2242:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2242:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case KEYWORD_54:
                case KEYWORD_47:
                case KEYWORD_50:
                case KEYWORD_29:
                case KEYWORD_2:
                case KEYWORD_3:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==KEYWORD_5) ) {
                        alt28=1;
                    }
                    else if ( (LA28_3==EOF||LA28_3==KEYWORD_54||LA28_3==KEYWORD_45||LA28_3==KEYWORD_47||LA28_3==KEYWORD_50||(LA28_3>=KEYWORD_33 && LA28_3<=KEYWORD_34)||LA28_3==KEYWORD_29||(LA28_3>=KEYWORD_2 && LA28_3<=KEYWORD_3)||LA28_3==RULE_ID) ) {
                        alt28=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2242:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )", 28, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case KEYWORD_12:
                    {
                    alt28=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2242:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2242:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2243:2: this_FromClassId_0= ruleFromClassId
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass3985);
                    this_FromClassId_0=ruleFromClassId();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_FromClassId_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2256:2: this_FromClassVar_1= ruleFromClassVar
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass4015);
                    this_FromClassVar_1=ruleFromClassVar();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_FromClassVar_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromClass


    // $ANTLR start entryRuleFromClassId
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2275:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2276:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2277:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromClassIdRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId4049);
            iv_ruleFromClassId=ruleFromClassId();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromClassId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId4059); if (failed) return current;

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
    // $ANTLR end entryRuleFromClassId


    // $ANTLR start ruleFromClassId
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2284:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2289:6: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2290:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2290:1: ( (lv_type_0_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2291:1: (lv_type_0_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2291:1: (lv_type_0_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2292:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFromClassId4100); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFromClassIdAccess().getTypeIDTerminalRuleCall_0(), "type"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromClassIdRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromClassId


    // $ANTLR start entryRuleFromClassVar
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2322:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2323:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2324:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromClassVarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4139);
            iv_ruleFromClassVar=ruleFromClassVar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromClassVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar4149); if (failed) return current;

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
    // $ANTLR end entryRuleFromClassVar


    // $ANTLR start ruleFromClassVar
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2331:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2336:6: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2337:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2337:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2337:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2337:2: ( (lv_type_0_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2338:1: (lv_type_0_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2338:1: (lv_type_0_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2339:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFromClassVar4191); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFromClassVarAccess().getTypeIDTerminalRuleCall_0_0(), "type"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromClassVarRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2361:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2362:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2362:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2363:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4217);
            lv_variable_1_0=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromClassVarRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"variable",
              	        		lv_variable_1_0, 
              	        		"VariableDeclaration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2385:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_45||(LA29_0>=KEYWORD_33 && LA29_0<=KEYWORD_34)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2386:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2386:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2387:3: lv_joins_2_0= ruleFromJoin
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4238);
            	    lv_joins_2_0=ruleFromJoin();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFromClassVarRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"joins",
            	      	        		lv_joins_2_0, 
            	      	        		"FromJoin", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromClassVar


    // $ANTLR start entryRuleFromCollection
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2417:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2418:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2419:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromCollectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4274);
            iv_ruleFromCollection=ruleFromCollection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4284); if (failed) return current;

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
    // $ANTLR end entryRuleFromCollection


    // $ANTLR start ruleFromCollection
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2426:1: ruleFromCollection returns [EObject current=null] : ( KEYWORD_14 KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2431:6: ( ( KEYWORD_14 KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2432:1: ( KEYWORD_14 KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2432:1: ( KEYWORD_14 KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2433:2: KEYWORD_14 KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFromCollection4320); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFromCollectionAccess().getINKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4331); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2442:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2443:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2443:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2444:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4352);
            lv_path_2_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromCollectionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFromCollection4363); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2471:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2472:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2472:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2473:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4384);
            lv_variable_4_0=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFromCollectionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"variable",
              	        		lv_variable_4_0, 
              	        		"VariableDeclaration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromCollection


    // $ANTLR start entryRuleFromJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2503:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2504:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2505:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFromJoinRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4419);
            iv_ruleFromJoin=ruleFromJoin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFromJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4429); if (failed) return current;

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
    // $ANTLR end entryRuleFromJoin


    // $ANTLR start ruleFromJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2512:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2517:6: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2518:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2518:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt30=3;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt30=1;
                }
                break;
            case KEYWORD_34:
                {
                alt30=2;
                }
                break;
            case KEYWORD_45:
                {
                alt30=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2518:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2519:2: this_Join_0= ruleJoin
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4479);
                    this_Join_0=ruleJoin();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Join_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2532:2: this_LeftJoin_1= ruleLeftJoin
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4509);
                    this_LeftJoin_1=ruleLeftJoin();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_LeftJoin_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2545:2: this_InnerJoin_2= ruleInnerJoin
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4539);
                    this_InnerJoin_2=ruleInnerJoin();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InnerJoin_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFromJoin


    // $ANTLR start entryRuleJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2564:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2565:2: (iv_ruleJoin= ruleJoin EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2566:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getJoinRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4573);
            iv_ruleJoin=ruleJoin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4583); if (failed) return current;

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
    // $ANTLR end entryRuleJoin


    // $ANTLR start ruleJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2573:1: ruleJoin returns [EObject current=null] : ( KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2578:6: ( ( KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2579:1: ( KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2579:1: ( KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2580:2: KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleJoin4619); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getJoinAccess().getJOINKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2584:1: ( (lv_isFetch_1_0= KEYWORD_44 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2585:1: (lv_isFetch_1_0= KEYWORD_44 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2585:1: (lv_isFetch_1_0= KEYWORD_44 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2586:3: lv_isFetch_1_0= KEYWORD_44
                    {
                    lv_isFetch_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleJoin4638); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getJoinAccess().getIsFetchFETCHKeyword_1_0(), "isFetch"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getJoinRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFetch", true, "FETCH", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2606:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2607:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2607:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2608:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4673);
            lv_path_2_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_2_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2630:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2631:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2631:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2632:3: lv_variable_3_0= ruleVariableDeclaration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4694);
            lv_variable_3_0=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"variable",
              	        		lv_variable_3_0, 
              	        		"VariableDeclaration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleJoin


    // $ANTLR start entryRuleLeftJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2662:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2663:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2664:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftJoinRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4729);
            iv_ruleLeftJoin=ruleLeftJoin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4739); if (failed) return current;

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
    // $ANTLR end entryRuleLeftJoin


    // $ANTLR start ruleLeftJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2671:1: ruleLeftJoin returns [EObject current=null] : ( KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleLeftJoin() throws RecognitionException {
        EObject current = null;

        Token lv_isOuter_1_0=null;
        Token lv_isFetch_3_0=null;
        EObject lv_path_4_0 = null;

        EObject lv_variable_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2676:6: ( ( KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2677:1: ( KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2677:1: ( KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2678:2: KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLeftJoin4775); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLeftJoinAccess().getLEFTKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2682:1: ( (lv_isOuter_1_0= KEYWORD_48 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2683:1: (lv_isOuter_1_0= KEYWORD_48 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2683:1: (lv_isOuter_1_0= KEYWORD_48 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2684:3: lv_isOuter_1_0= KEYWORD_48
                    {
                    lv_isOuter_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleLeftJoin4794); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLeftJoinAccess().getIsOuterOUTERKeyword_1_0(), "isOuter"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLeftJoinRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isOuter", true, "OUTER", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLeftJoin4819); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLeftJoinAccess().getJOINKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2709:1: ( (lv_isFetch_3_0= KEYWORD_44 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2710:1: (lv_isFetch_3_0= KEYWORD_44 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2710:1: (lv_isFetch_3_0= KEYWORD_44 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2711:3: lv_isFetch_3_0= KEYWORD_44
                    {
                    lv_isFetch_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleLeftJoin4838); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLeftJoinAccess().getIsFetchFETCHKeyword_3_0(), "isFetch"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLeftJoinRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFetch", true, "FETCH", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2731:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2732:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2732:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2733:3: lv_path_4_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4873);
            lv_path_4_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLeftJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_4_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2755:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2756:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2756:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2757:3: lv_variable_5_0= ruleVariableDeclaration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4894);
            lv_variable_5_0=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLeftJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"variable",
              	        		lv_variable_5_0, 
              	        		"VariableDeclaration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLeftJoin


    // $ANTLR start entryRuleInnerJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2787:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2788:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2789:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInnerJoinRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4929);
            iv_ruleInnerJoin=ruleInnerJoin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInnerJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin4939); if (failed) return current;

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
    // $ANTLR end entryRuleInnerJoin


    // $ANTLR start ruleInnerJoin
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2796:1: ruleInnerJoin returns [EObject current=null] : ( KEYWORD_45 KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2801:6: ( ( KEYWORD_45 KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2802:1: ( KEYWORD_45 KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2802:1: ( KEYWORD_45 KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2803:2: KEYWORD_45 KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleInnerJoin4975); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInnerJoinAccess().getINNERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleInnerJoin4986); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInnerJoinAccess().getJOINKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2812:1: ( (lv_isFetch_2_0= KEYWORD_44 ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2813:1: (lv_isFetch_2_0= KEYWORD_44 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2813:1: (lv_isFetch_2_0= KEYWORD_44 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2814:3: lv_isFetch_2_0= KEYWORD_44
                    {
                    lv_isFetch_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInnerJoin5005); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInnerJoinAccess().getIsFetchFETCHKeyword_2_0(), "isFetch"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInnerJoinRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFetch", true, "FETCH", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2834:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2835:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2835:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2836:3: lv_path_3_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5040);
            lv_path_3_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInnerJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"path",
              	        		lv_path_3_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2858:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2859:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2859:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2860:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5061);
            lv_variable_4_0=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInnerJoinRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"variable",
              	        		lv_variable_4_0, 
              	        		"VariableDeclaration", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInnerJoin


    // $ANTLR start entryRuleWhereClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2890:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2891:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2892:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWhereClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause5096);
            iv_ruleWhereClause=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause5106); if (failed) return current;

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
    // $ANTLR end entryRuleWhereClause


    // $ANTLR start ruleWhereClause
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2899:1: ruleWhereClause returns [EObject current=null] : ( KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject lv_whereEntry_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2904:6: ( ( KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2905:1: ( KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2905:1: ( KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2906:2: KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleWhereClause5142); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2910:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2911:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2911:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2912:3: lv_whereEntry_1_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause5163);
            lv_whereEntry_1_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWhereClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereEntry",
              	        		lv_whereEntry_1_0, 
              	        		"OrExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleWhereClause


    // $ANTLR start entryRuleOrExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2942:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2943:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2944:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5198);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5208); if (failed) return current;

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
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2951:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2956:6: ( (this_AndExpression_0= ruleAndExpression ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2957:1: (this_AndExpression_0= ruleAndExpression ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2957:1: (this_AndExpression_0= ruleAndExpression ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2958:2: this_AndExpression_0= ruleAndExpression ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5258);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_AndExpression_0;
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2969:1: ( () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2969:2: () ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2969:2: ()
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2970:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "entries", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2988:2: ( KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==KEYWORD_17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2989:2: KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrExpression5282); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2993:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2994:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2994:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:2995:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5303);
                    	    lv_entries_3_0=ruleAndExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"entries",
                    	      	        		lv_entries_3_0, 
                    	      	        		"AndExpression", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3025:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3026:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3027:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5342);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5352); if (failed) return current;

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
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3034:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3039:6: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3040:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3040:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3041:2: this_ConcreteExpression_0= ruleConcreteExpression ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5402);
            this_ConcreteExpression_0=ruleConcreteExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_ConcreteExpression_0;
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3052:1: ( () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3052:2: () ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3052:2: ()
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3053:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "entries", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3071:2: ( KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==KEYWORD_20) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3072:2: KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAndExpression5426); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3076:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3077:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3077:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3078:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5447);
                    	    lv_entries_3_0=ruleConcreteExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"entries",
                    	      	        		lv_entries_3_0, 
                    	      	        		"ConcreteExpression", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleConcreteExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3108:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3109:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3110:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConcreteExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5486);
            iv_ruleConcreteExpression=ruleConcreteExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5496); if (failed) return current;

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
    // $ANTLR end entryRuleConcreteExpression


    // $ANTLR start ruleConcreteExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3117:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
    public final EObject ruleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParExpression_0 = null;

        EObject this_OperatorExpression_1 = null;

        EObject this_ExistsExpression_2 = null;

        EObject this_AllExpression_3 = null;

        EObject this_AnyExpression_4 = null;

        EObject this_SomeExpression_5 = null;

        EObject this_CollectionExpression_6 = null;

        EObject this_NullComparisonExpression_7 = null;

        EObject this_EmptyComparisonExpression_8 = null;

        EObject this_LikeExpression_9 = null;

        EObject this_InExpression_10 = null;

        EObject this_BetweenExpression_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3122:6: ( (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3123:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3123:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt39=12;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3124:2: this_ParExpression_0= ruleParExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5546);
                    this_ParExpression_0=ruleParExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ParExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3137:2: this_OperatorExpression_1= ruleOperatorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getOperatorExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5576);
                    this_OperatorExpression_1=ruleOperatorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OperatorExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3150:2: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5606);
                    this_ExistsExpression_2=ruleExistsExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ExistsExpression_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3163:2: this_AllExpression_3= ruleAllExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5636);
                    this_AllExpression_3=ruleAllExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AllExpression_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3176:2: this_AnyExpression_4= ruleAnyExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5666);
                    this_AnyExpression_4=ruleAnyExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AnyExpression_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3189:2: this_SomeExpression_5= ruleSomeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5696);
                    this_SomeExpression_5=ruleSomeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SomeExpression_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3202:2: this_CollectionExpression_6= ruleCollectionExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5726);
                    this_CollectionExpression_6=ruleCollectionExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CollectionExpression_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3215:2: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5756);
                    this_NullComparisonExpression_7=ruleNullComparisonExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NullComparisonExpression_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3228:2: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5786);
                    this_EmptyComparisonExpression_8=ruleEmptyComparisonExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_EmptyComparisonExpression_8;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3241:2: this_LikeExpression_9= ruleLikeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5816);
                    this_LikeExpression_9=ruleLikeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_LikeExpression_9;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3254:2: this_InExpression_10= ruleInExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression5846);
                    this_InExpression_10=ruleInExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InExpression_10;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3267:2: this_BetweenExpression_11= ruleBetweenExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5876);
                    this_BetweenExpression_11=ruleBetweenExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BetweenExpression_11;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConcreteExpression


    // $ANTLR start entryRuleParExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3286:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3287:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3288:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression5910);
            iv_ruleParExpression=ruleParExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression5920); if (failed) return current;

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
    // $ANTLR end entryRuleParExpression


    // $ANTLR start ruleParExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3295:1: ruleParExpression returns [EObject current=null] : ( KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm KEYWORD_2 ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionTerm_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3300:6: ( ( KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3301:1: ( KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3301:1: ( KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3302:2: KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParExpression5956); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression5981);
            this_ExpressionTerm_1=ruleExpressionTerm();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      currentNode = currentNode.getParent();
                  
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParExpression5991); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParExpression


    // $ANTLR start entryRuleOperatorExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3331:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3332:2: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3333:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperatorExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6026);
            iv_ruleOperatorExpression=ruleOperatorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpression6036); if (failed) return current;

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
    // $ANTLR end entryRuleOperatorExpression


    // $ANTLR start ruleOperatorExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3340:1: ruleOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3345:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3346:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3346:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3346:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3346:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3347:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3347:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3348:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleOperatorExpression6082);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperatorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3370:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3371:1: (lv_operator_1_0= ruleOperator )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3371:1: (lv_operator_1_0= ruleOperator )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3372:3: lv_operator_1_0= ruleOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleOperatorExpression6103);
            lv_operator_1_0=ruleOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperatorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_1_0, 
              	        		"Operator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3394:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3395:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3395:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3396:3: lv_rhs_2_0= ruleExpressionTerm
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6124);
            lv_rhs_2_0=ruleExpressionTerm();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperatorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rhs",
              	        		lv_rhs_2_0, 
              	        		"ExpressionTerm", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperatorExpression


    // $ANTLR start entryRuleExistsExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3426:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3427:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3428:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExistsExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6159);
            iv_ruleExistsExpression=ruleExistsExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6169); if (failed) return current;

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
    // $ANTLR end entryRuleExistsExpression


    // $ANTLR start ruleExistsExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3435:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= KEYWORD_28 ) )? KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        EObject lv_query_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3440:6: ( ( ( (lv_isNot_0_0= KEYWORD_28 ) )? KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3441:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3441:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3441:2: ( (lv_isNot_0_0= KEYWORD_28 ) )? KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3441:2: ( (lv_isNot_0_0= KEYWORD_28 ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3442:1: (lv_isNot_0_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3442:1: (lv_isNot_0_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3443:3: lv_isNot_0_0= KEYWORD_28
                    {
                    lv_isNot_0_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleExistsExpression6213); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExistsExpressionAccess().getIsNotNOTKeyword_0_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExistsExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleExistsExpression6238); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3468:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3469:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3469:1: (lv_query_2_0= ruleQueryExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3470:3: lv_query_2_0= ruleQueryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6259);
            lv_query_2_0=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExistsExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_2_0, 
              	        		"QueryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExistsExpression


    // $ANTLR start entryRuleAllExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3500:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3501:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3502:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAllExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6294);
            iv_ruleAllExpression=ruleAllExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6304); if (failed) return current;

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
    // $ANTLR end entryRuleAllExpression


    // $ANTLR start ruleAllExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3509:1: ruleAllExpression returns [EObject current=null] : ( KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_query_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3514:6: ( ( KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3515:1: ( KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3515:1: ( KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3516:2: KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAllExpression6340); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAllExpressionAccess().getALLKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3520:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3521:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3521:1: (lv_query_1_0= ruleQueryExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3522:3: lv_query_1_0= ruleQueryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6361);
            lv_query_1_0=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAllExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_1_0, 
              	        		"QueryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAllExpression


    // $ANTLR start entryRuleAnyExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3552:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3553:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3554:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnyExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6396);
            iv_ruleAnyExpression=ruleAnyExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6406); if (failed) return current;

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
    // $ANTLR end entryRuleAnyExpression


    // $ANTLR start ruleAnyExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3561:1: ruleAnyExpression returns [EObject current=null] : ( KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_query_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3566:6: ( ( KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3567:1: ( KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3567:1: ( KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3568:2: KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAnyExpression6442); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnyExpressionAccess().getANYKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3572:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3573:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3573:1: (lv_query_1_0= ruleQueryExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3574:3: lv_query_1_0= ruleQueryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6463);
            lv_query_1_0=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnyExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_1_0, 
              	        		"QueryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnyExpression


    // $ANTLR start entryRuleSomeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3604:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3605:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3606:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSomeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6498);
            iv_ruleSomeExpression=ruleSomeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6508); if (failed) return current;

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
    // $ANTLR end entryRuleSomeExpression


    // $ANTLR start ruleSomeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3613:1: ruleSomeExpression returns [EObject current=null] : ( KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_query_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3618:6: ( ( KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3619:1: ( KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3619:1: ( KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3620:2: KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSomeExpression6544); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3624:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3625:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3625:1: (lv_query_1_0= ruleQueryExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3626:3: lv_query_1_0= ruleQueryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6565);
            lv_query_1_0=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSomeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_1_0, 
              	        		"QueryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSomeExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3656:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3657:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3658:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6600);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6610); if (failed) return current;

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
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3665:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_58 ( KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3670:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_58 ( KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3671:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_58 ( KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3671:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_58 ( KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3671:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_58 ( KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3671:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3672:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3672:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3673:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6656);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCollectionExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3695:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3696:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3696:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3697:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleCollectionExpression6675); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionExpressionAccess().getIsNotNOTKeyword_1_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCollectionExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleCollectionExpression6700); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3722:1: ( KEYWORD_16 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3723:2: KEYWORD_16
                    {
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCollectionExpression6712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCollectionExpressionAccess().getOFKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3727:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3728:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3728:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3729:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6735);
            lv_rhs_4_0=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCollectionExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rhs",
              	        		lv_rhs_4_0, 
              	        		"AliasAttributeExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleNullComparisonExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3759:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3760:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3761:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullComparisonExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6770);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6780); if (failed) return current;

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
    // $ANTLR end entryRuleNullComparisonExpression


    // $ANTLR start ruleNullComparisonExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3768:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_36 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_2_0=null;
        EObject lv_lhs_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3773:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_36 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3774:1: ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_36 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3774:1: ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_36 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3774:2: ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_36
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3774:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3775:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3775:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3776:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6826);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNullComparisonExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6837); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3803:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3804:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3804:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3805:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6856); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNullComparisonExpressionAccess().getIsNotNOTKeyword_2_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNullComparisonExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6881); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNullComparisonExpressionAccess().getNULLKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNullComparisonExpression


    // $ANTLR start entryRuleEmptyComparisonExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3838:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3839:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3840:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmptyComparisonExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6916);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6926); if (failed) return current;

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
    // $ANTLR end entryRuleEmptyComparisonExpression


    // $ANTLR start ruleEmptyComparisonExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3847:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_42 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_2_0=null;
        EObject lv_lhs_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3852:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_42 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3853:1: ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_42 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3853:1: ( ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_42 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3853:2: ( (lv_lhs_0_0= ruleVariable ) ) KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? KEYWORD_42
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3853:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3854:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3854:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3855:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6972);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEmptyComparisonExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression6983); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3882:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3883:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3883:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3884:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7002); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmptyComparisonExpressionAccess().getIsNotNOTKeyword_2_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmptyComparisonExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7027); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEmptyComparisonExpressionAccess().getEMPTYKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEmptyComparisonExpression


    // $ANTLR start entryRuleLikeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3917:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3918:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3919:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLikeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7062);
            iv_ruleLikeExpression=ruleLikeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7072); if (failed) return current;

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
    // $ANTLR end entryRuleLikeExpression


    // $ANTLR start ruleLikeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3926:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3931:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3932:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3932:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3932:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3932:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3933:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3933:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3934:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7118);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLikeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3956:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3957:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3957:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3958:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleLikeExpression7137); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLikeExpressionAccess().getIsNotNOTKeyword_1_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLikeExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLikeExpression7162); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3983:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3984:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3984:1: (lv_pattern_3_0= RULE_STRING )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:3985:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression7179); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLikeExpressionAccess().getPatternSTRINGTerminalRuleCall_3_0(), "pattern"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLikeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_3_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLikeExpression


    // $ANTLR start entryRuleInExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4015:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4016:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4017:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7219);
            iv_ruleInExpression=ruleInExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7229); if (failed) return current;

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
    // $ANTLR end entryRuleInExpression


    // $ANTLR start ruleInExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4024:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4029:6: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4030:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4030:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4031:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7279);
                    this_InSeqExpression_0=ruleInSeqExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InSeqExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4044:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7309);
                    this_InQueryExpression_1=ruleInQueryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InQueryExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInExpression


    // $ANTLR start entryRuleInSeqExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4063:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4064:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4065:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInSeqExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7343);
            iv_ruleInSeqExpression=ruleInSeqExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7353); if (failed) return current;

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
    // $ANTLR end entryRuleInSeqExpression


    // $ANTLR start ruleInSeqExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4072:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* KEYWORD_2 ) ;
    public final EObject ruleInSeqExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_items_4_0 = null;

        EObject lv_items_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4077:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4078:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4078:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4078:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* KEYWORD_2
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4078:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4079:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4079:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4080:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7399);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInSeqExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4102:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4103:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4103:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4104:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInSeqExpression7418); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInSeqExpressionAccess().getIsNotNOTKeyword_1_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInSeqExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInSeqExpression7443); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInSeqExpressionAccess().getINKeyword_2(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7454); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4134:1: ( (lv_items_4_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4135:1: (lv_items_4_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4135:1: (lv_items_4_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4136:3: lv_items_4_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7475);
            lv_items_4_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInSeqExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"items",
              	        		lv_items_4_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4158:2: ( KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==KEYWORD_3) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4159:2: KEYWORD_3 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleInSeqExpression7487); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4163:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4164:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4164:1: (lv_items_6_0= ruleVariable )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4165:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7508);
            	    lv_items_6_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInSeqExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"items",
            	      	        		lv_items_6_0, 
            	      	        		"Variable", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7521); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInSeqExpressionAccess().getRightParenthesisKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInSeqExpression


    // $ANTLR start entryRuleInQueryExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4200:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4201:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4202:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInQueryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7556);
            iv_ruleInQueryExpression=ruleInQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7566); if (failed) return current;

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
    // $ANTLR end entryRuleInQueryExpression


    // $ANTLR start ruleInQueryExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4209:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4214:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4215:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4215:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4215:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4215:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4216:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4216:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4217:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7612);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInQueryExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4239:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4240:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4240:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4241:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInQueryExpression7631); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInQueryExpressionAccess().getIsNotNOTKeyword_1_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInQueryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInQueryExpression7656); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInQueryExpressionAccess().getINKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4266:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4267:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4267:1: (lv_query_3_0= ruleQueryExpression )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4268:3: lv_query_3_0= ruleQueryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7677);
            lv_query_3_0=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInQueryExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"query",
              	        		lv_query_3_0, 
              	        		"QueryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInQueryExpression


    // $ANTLR start entryRuleBetweenExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4298:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4299:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4300:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBetweenExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7712);
            iv_ruleBetweenExpression=ruleBetweenExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7722); if (failed) return current;

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
    // $ANTLR end entryRuleBetweenExpression


    // $ANTLR start ruleBetweenExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4307:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) ;
    public final EObject ruleBetweenExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4312:6: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4313:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4313:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4313:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) KEYWORD_20 ( (lv_max_5_0= ruleValue ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4313:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4314:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4314:1: (lv_lhs_0_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4315:3: lv_lhs_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7768);
            lv_lhs_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBetweenExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lhs",
              	        		lv_lhs_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4337:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4338:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4338:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4339:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBetweenExpression7787); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBetweenExpressionAccess().getIsNotNOTKeyword_1_0(), "isNot"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBetweenExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isNot", true, "NOT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleBetweenExpression7812); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4364:1: ( (lv_min_3_0= ruleValue ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4365:1: (lv_min_3_0= ruleValue )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4365:1: (lv_min_3_0= ruleValue )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4366:3: lv_min_3_0= ruleValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7833);
            lv_min_3_0=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBetweenExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"min",
              	        		lv_min_3_0, 
              	        		"Value", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleBetweenExpression7844); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBetweenExpressionAccess().getANDKeyword_4(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4393:1: ( (lv_max_5_0= ruleValue ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4394:1: (lv_max_5_0= ruleValue )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4394:1: (lv_max_5_0= ruleValue )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4395:3: lv_max_5_0= ruleValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7865);
            lv_max_5_0=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBetweenExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"max",
              	        		lv_max_5_0, 
              	        		"Value", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBetweenExpression


    // $ANTLR start entryRuleVariable
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4425:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4426:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4427:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable7900);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable7910); if (failed) return current;

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4434:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4439:6: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4440:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4440:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case KEYWORD_5:
                {
                alt51=2;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_36:
            case KEYWORD_40:
            case RULE_LITERALTEMPORAL:
            case RULE_INT:
            case RULE_STRING:
                {
                alt51=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4440:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4441:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7960);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AliasAttributeExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4454:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable7990);
                    this_ParameterExpression_1=ruleParameterExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ParameterExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4467:2: this_Value_2= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8020);
                    this_Value_2=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Value_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleExpressionTerm
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4486:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4487:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4488:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionTermRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8054);
            iv_ruleExpressionTerm=ruleExpressionTerm();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8064); if (failed) return current;

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
    // $ANTLR end entryRuleExpressionTerm


    // $ANTLR start ruleExpressionTerm
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4495:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4500:6: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4501:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4501:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_43||LA52_0==KEYWORD_36||LA52_0==KEYWORD_40||LA52_0==KEYWORD_5||LA52_0==RULE_LITERALTEMPORAL||(LA52_0>=RULE_ID && LA52_0<=RULE_STRING)) ) {
                alt52=1;
            }
            else if ( (LA52_0==KEYWORD_1) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4501:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4502:2: this_Variable_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8114);
                    this_Variable_0=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Variable_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4515:2: this_QueryExpression_1= ruleQueryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8144);
                    this_QueryExpression_1=ruleQueryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_QueryExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpressionTerm


    // $ANTLR start entryRuleAliasAttributeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4534:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4535:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4536:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAliasAttributeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8178);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8188); if (failed) return current;

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
    // $ANTLR end entryRuleAliasAttributeExpression


    // $ANTLR start ruleAliasAttributeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4543:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( ( RULE_ID ) ) ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_attributes_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4548:6: ( ( ( ( RULE_ID ) ) ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4549:1: ( ( ( RULE_ID ) ) ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4549:1: ( ( ( RULE_ID ) ) ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4549:2: ( ( RULE_ID ) ) ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4549:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4550:1: ( RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4550:1: ( RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4551:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAliasAttributeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8235); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0(), "alias"); 
              	
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4566:2: ( KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==KEYWORD_4) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4567:2: KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8247); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4571:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4572:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4572:1: (lv_attributes_2_0= RULE_ID )
            	    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4573:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8264); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getAliasAttributeExpressionAccess().getAttributesIDTerminalRuleCall_1_1_0(), "attributes"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAliasAttributeExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_2_0, 
            	      	        		"ID", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAliasAttributeExpression


    // $ANTLR start entryRuleParameterExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4603:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4604:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4605:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8306);
            iv_ruleParameterExpression=ruleParameterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8316); if (failed) return current;

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
    // $ANTLR end entryRuleParameterExpression


    // $ANTLR start ruleParameterExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4612:1: ruleParameterExpression returns [EObject current=null] : ( KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4617:6: ( ( KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4618:1: ( KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4618:1: ( KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4619:2: KEYWORD_5 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParameterExpression8352); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParameterExpressionAccess().getColonKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4623:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4624:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4624:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4625:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8369); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParameterExpression


    // $ANTLR start entryRuleStringFunction
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4657:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4658:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4659:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8411);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8421); if (failed) return current;

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
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4666:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4671:6: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4672:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4672:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4672:2: ( (lv_name_0_0= ruleStringFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4672:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4673:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4673:1: (lv_name_0_0= ruleStringFunctionName )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4674:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8467);
            lv_name_0_0=ruleStringFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"StringFunctionName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8478); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4701:1: ( (lv_params_2_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4702:1: (lv_params_2_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4702:1: (lv_params_2_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4703:3: lv_params_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8499);
            lv_params_2_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_2_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4725:2: ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4726:2: KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleStringFunction8511); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4730:1: ( (lv_params_4_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4731:1: (lv_params_4_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4731:1: (lv_params_4_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4732:3: lv_params_4_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8532);
            lv_params_4_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_4_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8544); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleStringFunctionName
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4767:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4768:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4769:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8580);
            iv_ruleStringFunctionName=ruleStringFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8591); if (failed) return current;

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
    // $ANTLR end entryRuleStringFunctionName


    // $ANTLR start ruleStringFunctionName
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4776:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4781:6: ( (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4782:1: (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4782:1: (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            int alt54=6;
            switch ( input.LA(1) ) {
            case KEYWORD_51:
                {
                alt54=1;
                }
                break;
            case KEYWORD_63:
                {
                alt54=2;
                }
                break;
            case KEYWORD_46:
                {
                alt54=3;
                }
                break;
            case KEYWORD_49:
                {
                alt54=4;
                }
                break;
            case KEYWORD_56:
                {
                alt54=5;
                }
                break;
            case KEYWORD_57:
                {
                alt54=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4782:1: (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 )", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4783:2: kw= KEYWORD_51
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleStringFunctionName8629); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4790:2: kw= KEYWORD_63
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStringFunctionName8648); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4797:2: kw= KEYWORD_46
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleStringFunctionName8667); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4804:2: kw= KEYWORD_49
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleStringFunctionName8686); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4811:2: kw= KEYWORD_56
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleStringFunctionName8705); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4818:2: kw= KEYWORD_57
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStringFunctionName8724); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStringFunctionNameAccess().getLOCATEKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStringFunctionName


    // $ANTLR start entryRuleNumericFunction
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4831:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4832:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4833:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumericFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8763);
            iv_ruleNumericFunction=ruleNumericFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8773); if (failed) return current;

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
    // $ANTLR end entryRuleNumericFunction


    // $ANTLR start ruleNumericFunction
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4840:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 ) ;
    public final EObject ruleNumericFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4845:6: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4846:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4846:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4846:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) KEYWORD_2
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4846:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4847:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4847:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4848:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8819);
            lv_name_0_0=ruleNumericFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumericFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"NumericFunctionName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction8830); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4875:1: ( (lv_params_2_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4876:1: (lv_params_2_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4876:1: (lv_params_2_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4877:3: lv_params_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8851);
            lv_params_2_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumericFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_2_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4899:2: ( KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4900:2: KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNumericFunction8863); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0(), null); 
                  
            }
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4904:1: ( (lv_params_4_0= ruleVariable ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4905:1: (lv_params_4_0= ruleVariable )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4905:1: (lv_params_4_0= ruleVariable )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4906:3: lv_params_4_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8884);
            lv_params_4_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumericFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_4_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction8896); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNumericFunctionAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNumericFunction


    // $ANTLR start entryRuleNumericFunctionName
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4941:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4942:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4943:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumericFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8932);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName8943); if (failed) return current;

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
    // $ANTLR end entryRuleNumericFunctionName


    // $ANTLR start ruleNumericFunctionName
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4950:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4955:6: ( (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4956:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4956:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            int alt55=4;
            switch ( input.LA(1) ) {
            case KEYWORD_18:
                {
                alt55=1;
                }
                break;
            case KEYWORD_39:
                {
                alt55=2;
                }
                break;
            case KEYWORD_26:
                {
                alt55=3;
                }
                break;
            case KEYWORD_37:
                {
                alt55=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4956:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4957:2: kw= KEYWORD_18
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNumericFunctionName8981); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4964:2: kw= KEYWORD_39
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9000); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4971:2: kw= KEYWORD_26
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9019); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4978:2: kw= KEYWORD_37
                    {
                    kw=(Token)input.LT(1);
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9038); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNumericFunctionNameAccess().getSIZEKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNumericFunctionName


    // $ANTLR start entryRuleValue
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4993:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4994:2: (iv_ruleValue= ruleValue EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:4995:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9079);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9089); if (failed) return current;

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
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5002:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_DateTimeExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5007:6: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5008:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5008:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            int alt56=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt56=1;
                }
                break;
            case RULE_STRING:
                {
                alt56=2;
                }
                break;
            case KEYWORD_36:
                {
                alt56=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_40:
                {
                alt56=4;
                }
                break;
            case RULE_LITERALTEMPORAL:
                {
                alt56=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5008:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5009:2: this_IntegerExpression_0= ruleIntegerExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue9139);
                    this_IntegerExpression_0=ruleIntegerExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_IntegerExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5022:2: this_StringExpression_1= ruleStringExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue9169);
                    this_StringExpression_1=ruleStringExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_StringExpression_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5035:2: this_NullExpression_2= ruleNullExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9199);
                    this_NullExpression_2=ruleNullExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NullExpression_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5048:2: this_BooleanExpression_3= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9229);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BooleanExpression_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5061:2: this_DateTimeExpression_4= ruleDateTimeExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getDateTimeExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateTimeExpression_in_ruleValue9259);
                    this_DateTimeExpression_4=ruleDateTimeExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DateTimeExpression_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleIntegerExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5080:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5081:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5082:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntegerExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9293);
            iv_ruleIntegerExpression=ruleIntegerExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9303); if (failed) return current;

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
    // $ANTLR end entryRuleIntegerExpression


    // $ANTLR start ruleIntegerExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5089:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5094:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5095:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5095:1: ( (lv_value_0_0= RULE_INT ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5096:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5096:1: (lv_value_0_0= RULE_INT )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5097:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9344); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntegerExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleIntegerExpression


    // $ANTLR start entryRuleStringExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5127:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5128:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5129:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9383);
            iv_ruleStringExpression=ruleStringExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9393); if (failed) return current;

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
    // $ANTLR end entryRuleStringExpression


    // $ANTLR start ruleStringExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5136:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5141:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5142:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5142:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5143:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5143:1: (lv_value_0_0= RULE_STRING )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5144:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9434); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStringExpression


    // $ANTLR start entryRuleNullExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5174:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5175:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5176:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9473);
            iv_ruleNullExpression=ruleNullExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9483); if (failed) return current;

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
    // $ANTLR end entryRuleNullExpression


    // $ANTLR start ruleNullExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5183:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_36 ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5188:6: ( ( (lv_value_0_0= KEYWORD_36 ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5189:1: ( (lv_value_0_0= KEYWORD_36 ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5189:1: ( (lv_value_0_0= KEYWORD_36 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5190:1: (lv_value_0_0= KEYWORD_36 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5190:1: (lv_value_0_0= KEYWORD_36 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5191:3: lv_value_0_0= KEYWORD_36
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullExpression9526); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNullExpressionAccess().getValueNULLKeyword_0(), "value"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNullExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "value", lv_value_0_0, "NULL", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNullExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5219:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5220:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5221:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9573);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9583); if (failed) return current;

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
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5228:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5233:6: ( ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5234:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5234:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5235:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5235:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5236:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5236:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_40) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_43) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5236:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5237:3: lv_value_0_1= KEYWORD_40
                    {
                    lv_value_0_1=(Token)input.LT(1);
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBooleanExpression9628); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_0_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", true, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5256:8: lv_value_0_2= KEYWORD_43
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanExpression9658); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanExpressionAccess().getValueFALSEKeyword_0_1(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", true, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleDateTimeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5286:1: entryRuleDateTimeExpression returns [EObject current=null] : iv_ruleDateTimeExpression= ruleDateTimeExpression EOF ;
    public final EObject entryRuleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5287:2: (iv_ruleDateTimeExpression= ruleDateTimeExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5288:2: iv_ruleDateTimeExpression= ruleDateTimeExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDateTimeExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9708);
            iv_ruleDateTimeExpression=ruleDateTimeExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDateTimeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeExpression9718); if (failed) return current;

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
    // $ANTLR end entryRuleDateTimeExpression


    // $ANTLR start ruleDateTimeExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5295:1: ruleDateTimeExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) ;
    public final EObject ruleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5300:6: ( ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5301:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5301:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5302:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5302:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5303:3: lv_value_0_0= RULE_LITERALTEMPORAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_LITERALTEMPORAL,FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9759); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDateTimeExpressionAccess().getValueLiteralTemporalTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDateTimeExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"LiteralTemporal", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDateTimeExpression


    // $ANTLR start entryRuleQueryExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5333:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5334:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5335:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQueryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9798);
            iv_ruleQueryExpression=ruleQueryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9808); if (failed) return current;

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
    // $ANTLR end entryRuleQueryExpression


    // $ANTLR start ruleQueryExpression
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5342:1: ruleQueryExpression returns [EObject current=null] : ( KEYWORD_1 this_SelectStatement_1= ruleSelectStatement KEYWORD_2 ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5347:6: ( ( KEYWORD_1 this_SelectStatement_1= ruleSelectStatement KEYWORD_2 ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5348:1: ( KEYWORD_1 this_SelectStatement_1= ruleSelectStatement KEYWORD_2 )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5348:1: ( KEYWORD_1 this_SelectStatement_1= ruleSelectStatement KEYWORD_2 )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5349:2: KEYWORD_1 this_SelectStatement_1= ruleSelectStatement KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQueryExpression9844); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9869);
            this_SelectStatement_1=ruleSelectStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_SelectStatement_1;
                      currentNode = currentNode.getParent();
                  
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleQueryExpression9879); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleQueryExpression


    // $ANTLR start ruleOperator
    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5378:1: ruleOperator returns [Enumerator current=null] : ( ( KEYWORD_6 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) | ( KEYWORD_11 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5382:6: ( ( ( KEYWORD_6 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) | ( KEYWORD_11 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) ) )
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5383:1: ( ( KEYWORD_6 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) | ( KEYWORD_11 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) )
            {
            // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5383:1: ( ( KEYWORD_6 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) | ( KEYWORD_11 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt58=1;
                }
                break;
            case KEYWORD_8:
                {
                alt58=2;
                }
                break;
            case KEYWORD_10:
                {
                alt58=3;
                }
                break;
            case KEYWORD_11:
                {
                alt58=4;
                }
                break;
            case KEYWORD_7:
                {
                alt58=5;
                }
                break;
            case KEYWORD_9:
                {
                alt58=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5383:1: ( ( KEYWORD_6 ) | ( KEYWORD_8 ) | ( KEYWORD_10 ) | ( KEYWORD_11 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5383:2: ( KEYWORD_6 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5383:2: ( KEYWORD_6 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5383:7: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOperator9930); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5389:6: ( KEYWORD_8 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5389:6: ( KEYWORD_8 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5389:11: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOperator9947); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5395:6: ( KEYWORD_10 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5395:6: ( KEYWORD_10 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5395:11: KEYWORD_10
                    {
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleOperator9964); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5401:6: ( KEYWORD_11 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5401:6: ( KEYWORD_11 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5401:11: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOperator9981); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5407:6: ( KEYWORD_7 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5407:6: ( KEYWORD_7 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5407:11: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleOperator9998); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5413:6: ( KEYWORD_9 )
                    {
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5413:6: ( KEYWORD_9 )
                    // ../com.emftriple.query.jpql/src-gen/com/emftriple/query/parser/antlr/internal/InternalJpql.g:5413:11: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleOperator10015); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperator


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA39_eotS =
        "\33\uffff";
    static final String DFA39_eofS =
        "\33\uffff";
    static final String DFA39_minS =
        "\1\14\1\uffff\1\11\1\114\6\11\4\uffff\1\114\1\uffff\1\11\2\uffff"+
        "\1\25\2\uffff\2\11\1\25\2\uffff";
    static final String DFA39_maxS =
        "\1\116\1\uffff\1\105\1\114\6\105\4\uffff\1\114\1\uffff\1\72\2\uffff"+
        "\1\62\2\uffff\2\105\1\43\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\1\4\1\5\1\6\1\uffff\1\2\1\uffff\1\14\1"+
        "\12\1\uffff\1\13\1\7\3\uffff\1\10\1\11";
    static final String DFA39_specialS =
        "\33\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\12\11\uffff\1\10\14\uffff\1\6\1\uffff\1\15\1\uffff\1\7\1"+
            "\uffff\1\13\1\uffff\1\14\6\uffff\1\12\13\uffff\1\1\3\uffff\1"+
            "\3\6\uffff\1\11\2\uffff\1\2\1\4\1\5",
            "",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\5\uffff\1\16\1\uffff\3\17",
            "\1\26",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "",
            "",
            "",
            "",
            "\1\27",
            "",
            "\1\21\7\uffff\1\25\20\uffff\1\22\27\uffff\1\24",
            "",
            "",
            "\1\32\15\uffff\1\31\16\uffff\1\30",
            "",
            "",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\7\uffff\3\17",
            "\1\21\7\uffff\1\25\20\uffff\1\22\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\24\1\23\5\uffff\1\16\1\uffff\3\17",
            "\1\32\15\uffff\1\31",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "3123:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA46_eotS =
        "\21\uffff";
    static final String DFA46_eofS =
        "\21\uffff";
    static final String DFA46_minS =
        "\1\26\1\62\1\114\6\62\1\114\1\72\1\76\2\62\1\22\2\uffff";
    static final String DFA46_maxS =
        "\1\116\1\101\1\114\6\72\1\114\1\72\1\76\1\72\1\101\1\116\2\uffff";
    static final String DFA46_acceptS =
        "\17\uffff\1\2\1\1";
    static final String DFA46_specialS =
        "\21\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\7\14\uffff\1\5\3\uffff\1\6\32\uffff\1\2\6\uffff\1\10\2\uffff"+
            "\1\1\1\3\1\4",
            "\1\12\7\uffff\1\13\6\uffff\1\11",
            "\1\14",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\15",
            "\1\13",
            "\1\16",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13\6\uffff\1\11",
            "\1\17\3\uffff\1\20\10\uffff\1\17\3\uffff\1\20\3\uffff\1\20\32"+
            "\uffff\1\20\6\uffff\1\20\2\uffff\3\20",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "4030:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQueryModule_in_entryRuleQueryModule73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryModule83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleQueryModule129 = new BitSet(new long[]{0x00000000800C4802L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleQueryModule151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_ruleQueryModule173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleImport255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedQuery322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedQuery364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNamedQuery380 = new BitSet(new long[]{0x00000000800C0800L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleNamedQuery401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement646 = new BitSet(new long[]{0x0000000024002002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement667 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement689 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleHavingClause793 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleOrderClause895 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOrderClause906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause927 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOrderClause939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause960 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrderClause982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOrderClause1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOrderItem1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1251 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1272 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleUpdateClause1375 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleUpdateClause1408 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1429 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSetClause1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSetClause1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUpdateItem1670 = new BitSet(new long[]{0x0000008800400000L,0x0000000000006200L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1782 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleDeleteClause1885 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause1997 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleSelectClause2100 = new BitSet(new long[]{0x0012E00000100100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSelectClause2119 = new BitSet(new long[]{0x0012E00000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectClause2166 = new BitSet(new long[]{0x0012E00000100000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2187 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAvgAggregate2638 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2649 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleAvgAggregate2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2703 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMaxAggregate2795 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2806 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMaxAggregate2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2860 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMinAggregate2952 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2963 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMinAggregate2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3017 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSumAggregate3109 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate3120 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSumAggregate3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3174 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleCountAggregate3266 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate3277 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleCountAggregate3296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3331 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3440 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3477 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3510 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleFromClause3604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFromClause3637 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFromClassId4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFromClassVar4191 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4217 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4238 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFromCollection4320 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4352 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4363 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleJoin4619 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleJoin4638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4673 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLeftJoin4775 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleLeftJoin4794 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLeftJoin4819 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleLeftJoin4838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4873 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleInnerJoin4975 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleInnerJoin4986 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInnerJoin5005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5040 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause5096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleWhereClause5142 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5258 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrExpression5282 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5303 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5402 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAndExpression5426 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5447 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression5910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParExpression5956 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression5981 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParExpression5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpression6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperatorExpression6082 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOperatorExpression6103 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleExistsExpression6213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleExistsExpression6238 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAllExpression6340 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAnyExpression6442 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSomeExpression6544 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6656 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleCollectionExpression6675 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleCollectionExpression6700 = new BitSet(new long[]{0x1000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCollectionExpression6712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6826 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6837 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6856 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6972 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression6983 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7002 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7118 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleLikeExpression7137 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLikeExpression7162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7399 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInSeqExpression7418 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInSeqExpression7443 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7454 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7475 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleInSeqExpression7487 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7508 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7612 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInQueryExpression7631 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInQueryExpression7656 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7768 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBetweenExpression7787 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleBetweenExpression7812 = new BitSet(new long[]{0x0000008800400000L,0x0000000000006200L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7833 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleBetweenExpression7844 = new BitSet(new long[]{0x0000008800400000L,0x0000000000006200L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParameterExpression8352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8467 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8478 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleStringFunction8511 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8532 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleStringFunctionName8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStringFunctionName8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleStringFunctionName8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleStringFunctionName8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleStringFunctionName8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStringFunctionName8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8819 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction8830 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNumericFunction8863 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8884 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNumericFunctionName8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_ruleValue9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullExpression9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBooleanExpression9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanExpression9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeExpression9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQueryExpression9844 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9869 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleQueryExpression9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOperator9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOperator9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleOperator9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOperator9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleOperator9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleOperator10015 = new BitSet(new long[]{0x0000000000000002L});

}