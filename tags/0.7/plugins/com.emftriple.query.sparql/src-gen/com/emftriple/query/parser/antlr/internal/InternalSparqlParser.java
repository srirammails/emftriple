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
import com.emftriple.query.services.SparqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSparqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_84", "KEYWORD_83", "KEYWORD_80", "KEYWORD_81", "KEYWORD_82", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_IRI_TERMINAL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=90;
    public static final int RULE_ANY_OTHER=95;
    public static final int KEYWORD_56=40;
    public static final int KEYWORD_55=39;
    public static final int KEYWORD_54=38;
    public static final int KEYWORD_53=37;
    public static final int KEYWORD_52=36;
    public static final int KEYWORD_51=35;
    public static final int KEYWORD_50=34;
    public static final int EOF=-1;
    public static final int KEYWORD_59=43;
    public static final int KEYWORD_58=42;
    public static final int KEYWORD_57=41;
    public static final int KEYWORD_65=24;
    public static final int KEYWORD_64=23;
    public static final int KEYWORD_67=26;
    public static final int KEYWORD_66=25;
    public static final int KEYWORD_61=20;
    public static final int KEYWORD_60=19;
    public static final int KEYWORD_63=22;
    public static final int KEYWORD_62=21;
    public static final int KEYWORD_69=28;
    public static final int KEYWORD_68=27;
    public static final int KEYWORD_30=54;
    public static final int KEYWORD_34=58;
    public static final int KEYWORD_33=57;
    public static final int KEYWORD_32=56;
    public static final int KEYWORD_31=55;
    public static final int KEYWORD_38=45;
    public static final int KEYWORD_37=44;
    public static final int KEYWORD_36=60;
    public static final int KEYWORD_35=59;
    public static final int RULE_ML_COMMENT=92;
    public static final int KEYWORD_39=46;
    public static final int RULE_STRING=89;
    public static final int KEYWORD_41=48;
    public static final int KEYWORD_40=47;
    public static final int KEYWORD_43=50;
    public static final int KEYWORD_42=49;
    public static final int KEYWORD_45=29;
    public static final int KEYWORD_44=51;
    public static final int KEYWORD_47=31;
    public static final int KEYWORD_46=30;
    public static final int KEYWORD_49=33;
    public static final int KEYWORD_48=32;
    public static final int KEYWORD_19=62;
    public static final int KEYWORD_17=87;
    public static final int KEYWORD_18=61;
    public static final int KEYWORD_15=85;
    public static final int KEYWORD_16=86;
    public static final int KEYWORD_13=83;
    public static final int KEYWORD_14=84;
    public static final int KEYWORD_11=81;
    public static final int KEYWORD_12=82;
    public static final int KEYWORD_10=80;
    public static final int RULE_IRI_TERMINAL=88;
    public static final int KEYWORD_6=76;
    public static final int KEYWORD_7=77;
    public static final int KEYWORD_8=78;
    public static final int KEYWORD_9=79;
    public static final int KEYWORD_28=52;
    public static final int KEYWORD_29=53;
    public static final int RULE_INT=91;
    public static final int KEYWORD_24=67;
    public static final int KEYWORD_25=68;
    public static final int KEYWORD_26=69;
    public static final int KEYWORD_27=70;
    public static final int KEYWORD_20=63;
    public static final int KEYWORD_21=64;
    public static final int KEYWORD_22=65;
    public static final int KEYWORD_23=66;
    public static final int KEYWORD_79=13;
    public static final int KEYWORD_71=15;
    public static final int KEYWORD_72=16;
    public static final int KEYWORD_73=17;
    public static final int KEYWORD_74=18;
    public static final int KEYWORD_75=9;
    public static final int KEYWORD_76=10;
    public static final int KEYWORD_77=11;
    public static final int KEYWORD_78=12;
    public static final int KEYWORD_1=71;
    public static final int KEYWORD_5=75;
    public static final int KEYWORD_4=74;
    public static final int KEYWORD_70=14;
    public static final int KEYWORD_3=73;
    public static final int KEYWORD_2=72;
    public static final int Tokens=96;
    public static final int RULE_SL_COMMENT=93;
    public static final int KEYWORD_84=4;
    public static final int KEYWORD_82=8;
    public static final int KEYWORD_83=5;
    public static final int KEYWORD_81=7;
    public static final int KEYWORD_80=6;
    public static final int RULE_WS=94;

        public InternalSparqlParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[277+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

     	private SparqlGrammarAccess grammarAccess;
     	
        public InternalSparqlParser(TokenStream input, IAstFactory factory, SparqlGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("com/emftriple/query/parser/antlr/internal/InternalSparql.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SPARQLQuery";	
       	} 
       	   	
       	@Override
       	protected SparqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSPARQLQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:78:1: entryRuleSPARQLQuery returns [EObject current=null] : iv_ruleSPARQLQuery= ruleSPARQLQuery EOF ;
    public final EObject entryRuleSPARQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPARQLQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:79:2: (iv_ruleSPARQLQuery= ruleSPARQLQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:80:2: iv_ruleSPARQLQuery= ruleSPARQLQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSPARQLQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSPARQLQuery_in_entryRuleSPARQLQuery73);
            iv_ruleSPARQLQuery=ruleSPARQLQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSPARQLQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPARQLQuery83); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSPARQLQuery


    // $ANTLR start ruleSPARQLQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:87:1: ruleSPARQLQuery returns [EObject current=null] : (this_SelectionQuery_0= ruleSelectionQuery | this_UpdateQuery_1= ruleUpdateQuery ) ;
    public final EObject ruleSPARQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectionQuery_0 = null;

        EObject this_UpdateQuery_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:92:6: ( (this_SelectionQuery_0= ruleSelectionQuery | this_UpdateQuery_1= ruleUpdateQuery ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:93:1: (this_SelectionQuery_0= ruleSelectionQuery | this_UpdateQuery_1= ruleUpdateQuery )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:93:1: (this_SelectionQuery_0= ruleSelectionQuery | this_UpdateQuery_1= ruleUpdateQuery )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:94:2: this_SelectionQuery_0= ruleSelectionQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSPARQLQueryAccess().getSelectionQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectionQuery_in_ruleSPARQLQuery133);
                    this_SelectionQuery_0=ruleSelectionQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectionQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:107:2: this_UpdateQuery_1= ruleUpdateQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSPARQLQueryAccess().getUpdateQueryParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateQuery_in_ruleSPARQLQuery163);
                    this_UpdateQuery_1=ruleUpdateQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UpdateQuery_1;
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
    // $ANTLR end ruleSPARQLQuery


    // $ANTLR start entryRulePrefix
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:126:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:127:2: (iv_rulePrefix= rulePrefix EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:128:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix197);
            iv_rulePrefix=rulePrefix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix207); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:135:1: rulePrefix returns [EObject current=null] : ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_iref_3_0=null;
        EObject this_UnNamedPrefix_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:140:6: ( ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:141:1: ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:141:1: ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_66) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==KEYWORD_9) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("141:1: ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix )", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("141:1: ( ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) ) | this_UnNamedPrefix_4= ruleUnNamedPrefix )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:141:2: ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:141:2: ( KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:142:2: KEYWORD_66 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_9 ( (lv_iref_3_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rulePrefix244); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrefixAccess().getPREFIXKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:146:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:147:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:147:1: (lv_name_1_0= RULE_ID )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:148:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix261); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
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

                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePrefix277); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrefixAccess().getColonKeyword_0_2(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:175:1: ( (lv_iref_3_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:176:1: (lv_iref_3_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:176:1: (lv_iref_3_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:177:3: lv_iref_3_0= RULE_IRI_TERMINAL
                    {
                    lv_iref_3_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix294); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getPrefixAccess().getIrefIRI_TERMINALTerminalRuleCall_0_3_0(), "iref"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"iref",
                      	        		lv_iref_3_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:201:2: this_UnNamedPrefix_4= ruleUnNamedPrefix
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrefixAccess().getUnNamedPrefixParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnNamedPrefix_in_rulePrefix331);
                    this_UnNamedPrefix_4=ruleUnNamedPrefix();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnNamedPrefix_4;
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
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleUnNamedPrefix
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:220:1: entryRuleUnNamedPrefix returns [EObject current=null] : iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF ;
    public final EObject entryRuleUnNamedPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNamedPrefix = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:221:2: (iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:222:2: iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnNamedPrefixRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix365);
            iv_ruleUnNamedPrefix=ruleUnNamedPrefix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnNamedPrefix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNamedPrefix375); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnNamedPrefix


    // $ANTLR start ruleUnNamedPrefix
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:229:1: ruleUnNamedPrefix returns [EObject current=null] : ( KEYWORD_66 KEYWORD_9 ( (lv_iref_2_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleUnNamedPrefix() throws RecognitionException {
        EObject current = null;

        Token lv_iref_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:234:6: ( ( KEYWORD_66 KEYWORD_9 ( (lv_iref_2_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:235:1: ( KEYWORD_66 KEYWORD_9 ( (lv_iref_2_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:235:1: ( KEYWORD_66 KEYWORD_9 ( (lv_iref_2_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:236:2: KEYWORD_66 KEYWORD_9 ( (lv_iref_2_0= RULE_IRI_TERMINAL ) )
            {
            match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleUnNamedPrefix411); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnNamedPrefixAccess().getPREFIXKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnNamedPrefix422); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnNamedPrefixAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:245:1: ( (lv_iref_2_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:246:1: (lv_iref_2_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:246:1: (lv_iref_2_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:247:3: lv_iref_2_0= RULE_IRI_TERMINAL
            {
            lv_iref_2_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleUnNamedPrefix439); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getUnNamedPrefixAccess().getIrefIRI_TERMINALTerminalRuleCall_2_0(), "iref"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnNamedPrefixRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"iref",
              	        		lv_iref_2_0, 
              	        		"IRI_TERMINAL", 
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
    // $ANTLR end ruleUnNamedPrefix


    // $ANTLR start entryRuleBase
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:277:1: entryRuleBase returns [EObject current=null] : iv_ruleBase= ruleBase EOF ;
    public final EObject entryRuleBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:278:2: (iv_ruleBase= ruleBase EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:279:2: iv_ruleBase= ruleBase EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBaseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBase_in_entryRuleBase479);
            iv_ruleBase=ruleBase();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBase489); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBase


    // $ANTLR start ruleBase
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:286:1: ruleBase returns [EObject current=null] : ( KEYWORD_37 ( (lv_iref_1_0= ruleIRI ) ) ) ;
    public final EObject ruleBase() throws RecognitionException {
        EObject current = null;

        EObject lv_iref_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:291:6: ( ( KEYWORD_37 ( (lv_iref_1_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:292:1: ( KEYWORD_37 ( (lv_iref_1_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:292:1: ( KEYWORD_37 ( (lv_iref_1_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:293:2: KEYWORD_37 ( (lv_iref_1_0= ruleIRI ) )
            {
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleBase525); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBaseAccess().getBASEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:297:1: ( (lv_iref_1_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:298:1: (lv_iref_1_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:298:1: (lv_iref_1_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:299:3: lv_iref_1_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBaseAccess().getIrefIRIParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleBase546);
            lv_iref_1_0=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBaseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"iref",
              	        		lv_iref_1_0, 
              	        		"IRI", 
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
    // $ANTLR end ruleBase


    // $ANTLR start entryRuleSelectionQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:329:1: entryRuleSelectionQuery returns [EObject current=null] : iv_ruleSelectionQuery= ruleSelectionQuery EOF ;
    public final EObject entryRuleSelectionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:330:2: (iv_ruleSelectionQuery= ruleSelectionQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:331:2: iv_ruleSelectionQuery= ruleSelectionQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectionQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectionQuery_in_entryRuleSelectionQuery581);
            iv_ruleSelectionQuery=ruleSelectionQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectionQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionQuery591); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelectionQuery


    // $ANTLR start ruleSelectionQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:338:1: ruleSelectionQuery returns [EObject current=null] : (this_ConstructQuery_0= ruleConstructQuery | this_SelectQuery_1= ruleSelectQuery | this_AskQuery_2= ruleAskQuery | this_DescribeQuery_3= ruleDescribeQuery ) ;
    public final EObject ruleSelectionQuery() throws RecognitionException {
        EObject current = null;

        EObject this_ConstructQuery_0 = null;

        EObject this_SelectQuery_1 = null;

        EObject this_AskQuery_2 = null;

        EObject this_DescribeQuery_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:343:6: ( (this_ConstructQuery_0= ruleConstructQuery | this_SelectQuery_1= ruleSelectQuery | this_AskQuery_2= ruleAskQuery | this_DescribeQuery_3= ruleDescribeQuery ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:344:1: (this_ConstructQuery_0= ruleConstructQuery | this_SelectQuery_1= ruleSelectQuery | this_AskQuery_2= ruleAskQuery | this_DescribeQuery_3= ruleDescribeQuery )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:344:1: (this_ConstructQuery_0= ruleConstructQuery | this_SelectQuery_1= ruleSelectQuery | this_AskQuery_2= ruleAskQuery | this_DescribeQuery_3= ruleDescribeQuery )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:345:2: this_ConstructQuery_0= ruleConstructQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectionQueryAccess().getConstructQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructQuery_in_ruleSelectionQuery641);
                    this_ConstructQuery_0=ruleConstructQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ConstructQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:358:2: this_SelectQuery_1= ruleSelectQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectionQueryAccess().getSelectQueryParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectQuery_in_ruleSelectionQuery671);
                    this_SelectQuery_1=ruleSelectQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectQuery_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:371:2: this_AskQuery_2= ruleAskQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectionQueryAccess().getAskQueryParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAskQuery_in_ruleSelectionQuery701);
                    this_AskQuery_2=ruleAskQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_AskQuery_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:384:2: this_DescribeQuery_3= ruleDescribeQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectionQueryAccess().getDescribeQueryParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDescribeQuery_in_ruleSelectionQuery731);
                    this_DescribeQuery_3=ruleDescribeQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DescribeQuery_3;
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
    // $ANTLR end ruleSelectionQuery


    // $ANTLR start entryRuleSelectQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:403:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:404:2: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:405:2: iv_ruleSelectQuery= ruleSelectQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectQuery_in_entryRuleSelectQuery765);
            iv_ruleSelectQuery=ruleSelectQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectQuery775); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelectQuery


    // $ANTLR start ruleSelectQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:412:1: ruleSelectQuery returns [EObject current=null] : (this_SelectAllQuery_0= ruleSelectAllQuery | this_SelectVariablesQuery_1= ruleSelectVariablesQuery ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectAllQuery_0 = null;

        EObject this_SelectVariablesQuery_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:417:6: ( (this_SelectAllQuery_0= ruleSelectAllQuery | this_SelectVariablesQuery_1= ruleSelectVariablesQuery ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:418:1: (this_SelectAllQuery_0= ruleSelectAllQuery | this_SelectVariablesQuery_1= ruleSelectVariablesQuery )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:418:1: (this_SelectAllQuery_0= ruleSelectAllQuery | this_SelectVariablesQuery_1= ruleSelectVariablesQuery )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:419:2: this_SelectAllQuery_0= ruleSelectAllQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectQueryAccess().getSelectAllQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAllQuery_in_ruleSelectQuery825);
                    this_SelectAllQuery_0=ruleSelectAllQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectAllQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:432:2: this_SelectVariablesQuery_1= ruleSelectVariablesQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSelectQueryAccess().getSelectVariablesQueryParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectVariablesQuery_in_ruleSelectQuery855);
                    this_SelectVariablesQuery_1=ruleSelectVariablesQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SelectVariablesQuery_1;
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
    // $ANTLR end ruleSelectQuery


    // $ANTLR start entryRuleSelectAllQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:451:1: entryRuleSelectAllQuery returns [EObject current=null] : iv_ruleSelectAllQuery= ruleSelectAllQuery EOF ;
    public final EObject entryRuleSelectAllQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAllQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:452:2: (iv_ruleSelectAllQuery= ruleSelectAllQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:453:2: iv_ruleSelectAllQuery= ruleSelectAllQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectAllQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectAllQuery_in_entryRuleSelectAllQuery889);
            iv_ruleSelectAllQuery=ruleSelectAllQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectAllQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAllQuery899); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelectAllQuery


    // $ANTLR start ruleSelectAllQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:460:1: ruleSelectAllQuery returns [EObject current=null] : ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_all_5_0= KEYWORD_3 ) ) ( (lv_datasetClause_6_0= ruleDatasetClause ) )* ( (lv_whereClause_7_0= ruleWhereClause ) ) ( (lv_groupClause_8_0= ruleGroupClause ) )? ( (lv_havingClause_9_0= ruleHavingClause ) )? ( (lv_limitClause_10_0= ruleLimitClause ) )? ) ;
    public final EObject ruleSelectAllQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_3_0=null;
        Token lv_isReduced_4_0=null;
        Token lv_all_5_0=null;
        EObject lv_base_0_0 = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_datasetClause_6_0 = null;

        EObject lv_whereClause_7_0 = null;

        EObject lv_groupClause_8_0 = null;

        EObject lv_havingClause_9_0 = null;

        EObject lv_limitClause_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:465:6: ( ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_all_5_0= KEYWORD_3 ) ) ( (lv_datasetClause_6_0= ruleDatasetClause ) )* ( (lv_whereClause_7_0= ruleWhereClause ) ) ( (lv_groupClause_8_0= ruleGroupClause ) )? ( (lv_havingClause_9_0= ruleHavingClause ) )? ( (lv_limitClause_10_0= ruleLimitClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:466:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_all_5_0= KEYWORD_3 ) ) ( (lv_datasetClause_6_0= ruleDatasetClause ) )* ( (lv_whereClause_7_0= ruleWhereClause ) ) ( (lv_groupClause_8_0= ruleGroupClause ) )? ( (lv_havingClause_9_0= ruleHavingClause ) )? ( (lv_limitClause_10_0= ruleLimitClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:466:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_all_5_0= KEYWORD_3 ) ) ( (lv_datasetClause_6_0= ruleDatasetClause ) )* ( (lv_whereClause_7_0= ruleWhereClause ) ) ( (lv_groupClause_8_0= ruleGroupClause ) )? ( (lv_havingClause_9_0= ruleHavingClause ) )? ( (lv_limitClause_10_0= ruleLimitClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:466:2: ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_all_5_0= KEYWORD_3 ) ) ( (lv_datasetClause_6_0= ruleDatasetClause ) )* ( (lv_whereClause_7_0= ruleWhereClause ) ) ( (lv_groupClause_8_0= ruleGroupClause ) )? ( (lv_havingClause_9_0= ruleHavingClause ) )? ( (lv_limitClause_10_0= ruleLimitClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:466:2: ( (lv_base_0_0= ruleBase ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_37) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:467:1: (lv_base_0_0= ruleBase )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:467:1: (lv_base_0_0= ruleBase )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:468:3: lv_base_0_0= ruleBase
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getBaseBaseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBase_in_ruleSelectAllQuery945);
                    lv_base_0_0=ruleBase();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"base",
                      	        		lv_base_0_0, 
                      	        		"Base", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:490:3: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_66) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:491:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:491:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:492:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleSelectAllQuery967);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop6;
                }
            } while (true);

            match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleSelectAllQuery979); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectAllQueryAccess().getSELECTKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:519:1: ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_77) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_71) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:519:2: ( (lv_isDistinct_3_0= KEYWORD_77 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:519:2: ( (lv_isDistinct_3_0= KEYWORD_77 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:520:1: (lv_isDistinct_3_0= KEYWORD_77 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:520:1: (lv_isDistinct_3_0= KEYWORD_77 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:521:3: lv_isDistinct_3_0= KEYWORD_77
                    {
                    lv_isDistinct_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleSelectAllQuery999); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSelectAllQueryAccess().getIsDistinctDISTINCTKeyword_3_0_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
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


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:542:6: ( (lv_isReduced_4_0= KEYWORD_71 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:542:6: ( (lv_isReduced_4_0= KEYWORD_71 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:543:1: (lv_isReduced_4_0= KEYWORD_71 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:543:1: (lv_isReduced_4_0= KEYWORD_71 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:544:3: lv_isReduced_4_0= KEYWORD_71
                    {
                    lv_isReduced_4_0=(Token)input.LT(1);
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleSelectAllQuery1037); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSelectAllQueryAccess().getIsReducedREDUCEDKeyword_3_1_0(), "isReduced"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isReduced", true, "REDUCED", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:564:4: ( (lv_all_5_0= KEYWORD_3 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:565:1: (lv_all_5_0= KEYWORD_3 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:565:1: (lv_all_5_0= KEYWORD_3 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:566:3: lv_all_5_0= KEYWORD_3
            {
            lv_all_5_0=(Token)input.LT(1);
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectAllQuery1071); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectAllQueryAccess().getAllAsteriskKeyword_4_0(), "all"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "all", true, "*", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:586:2: ( (lv_datasetClause_6_0= ruleDatasetClause ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:587:1: (lv_datasetClause_6_0= ruleDatasetClause )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:587:1: (lv_datasetClause_6_0= ruleDatasetClause )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:588:3: lv_datasetClause_6_0= ruleDatasetClause
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getDatasetClauseDatasetClauseParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDatasetClause_in_ruleSelectAllQuery1105);
            	    lv_datasetClause_6_0=ruleDatasetClause();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"datasetClause",
            	      	        		lv_datasetClause_6_0, 
            	      	        		"DatasetClause", 
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
            	    break loop8;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:610:3: ( (lv_whereClause_7_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:611:1: (lv_whereClause_7_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:611:1: (lv_whereClause_7_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:612:3: lv_whereClause_7_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getWhereClauseWhereClauseParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectAllQuery1127);
            lv_whereClause_7_0=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereClause",
              	        		lv_whereClause_7_0, 
              	        		"WhereClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:634:2: ( (lv_groupClause_8_0= ruleGroupClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_50) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:635:1: (lv_groupClause_8_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:635:1: (lv_groupClause_8_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:636:3: lv_groupClause_8_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getGroupClauseGroupClauseParserRuleCall_7_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSelectAllQuery1148);
                    lv_groupClause_8_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_8_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:658:3: ( (lv_havingClause_9_0= ruleHavingClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_64) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:659:1: (lv_havingClause_9_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:659:1: (lv_havingClause_9_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:660:3: lv_havingClause_9_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getHavingClauseHavingClauseParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectAllQuery1170);
                    lv_havingClause_9_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_9_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:682:3: ( (lv_limitClause_10_0= ruleLimitClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_51) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:683:1: (lv_limitClause_10_0= ruleLimitClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:683:1: (lv_limitClause_10_0= ruleLimitClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:684:3: lv_limitClause_10_0= ruleLimitClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectAllQueryAccess().getLimitClauseLimitClauseParserRuleCall_9_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLimitClause_in_ruleSelectAllQuery1192);
                    lv_limitClause_10_0=ruleLimitClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectAllQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"limitClause",
                      	        		lv_limitClause_10_0, 
                      	        		"LimitClause", 
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
    // $ANTLR end ruleSelectAllQuery


    // $ANTLR start entryRuleSelectVariablesQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:714:1: entryRuleSelectVariablesQuery returns [EObject current=null] : iv_ruleSelectVariablesQuery= ruleSelectVariablesQuery EOF ;
    public final EObject entryRuleSelectVariablesQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectVariablesQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:715:2: (iv_ruleSelectVariablesQuery= ruleSelectVariablesQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:716:2: iv_ruleSelectVariablesQuery= ruleSelectVariablesQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSelectVariablesQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSelectVariablesQuery_in_entryRuleSelectVariablesQuery1228);
            iv_ruleSelectVariablesQuery=ruleSelectVariablesQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSelectVariablesQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectVariablesQuery1238); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSelectVariablesQuery


    // $ANTLR start ruleSelectVariablesQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:723:1: ruleSelectVariablesQuery returns [EObject current=null] : ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_variables_5_0= ruleVariable ) ) ( (lv_variables_6_0= ruleVariable ) )* ( (lv_datasetClause_7_0= ruleDatasetClause ) )* ( (lv_whereClause_8_0= ruleWhereClause ) ) ( (lv_groupClause_9_0= ruleGroupClause ) )? ( (lv_havingClause_10_0= ruleHavingClause ) )? ( (lv_limitClause_11_0= ruleLimitClause ) )? ) ;
    public final EObject ruleSelectVariablesQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_3_0=null;
        Token lv_isReduced_4_0=null;
        EObject lv_base_0_0 = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_datasetClause_7_0 = null;

        EObject lv_whereClause_8_0 = null;

        EObject lv_groupClause_9_0 = null;

        EObject lv_havingClause_10_0 = null;

        EObject lv_limitClause_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:728:6: ( ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_variables_5_0= ruleVariable ) ) ( (lv_variables_6_0= ruleVariable ) )* ( (lv_datasetClause_7_0= ruleDatasetClause ) )* ( (lv_whereClause_8_0= ruleWhereClause ) ) ( (lv_groupClause_9_0= ruleGroupClause ) )? ( (lv_havingClause_10_0= ruleHavingClause ) )? ( (lv_limitClause_11_0= ruleLimitClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:729:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_variables_5_0= ruleVariable ) ) ( (lv_variables_6_0= ruleVariable ) )* ( (lv_datasetClause_7_0= ruleDatasetClause ) )* ( (lv_whereClause_8_0= ruleWhereClause ) ) ( (lv_groupClause_9_0= ruleGroupClause ) )? ( (lv_havingClause_10_0= ruleHavingClause ) )? ( (lv_limitClause_11_0= ruleLimitClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:729:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_variables_5_0= ruleVariable ) ) ( (lv_variables_6_0= ruleVariable ) )* ( (lv_datasetClause_7_0= ruleDatasetClause ) )* ( (lv_whereClause_8_0= ruleWhereClause ) ) ( (lv_groupClause_9_0= ruleGroupClause ) )? ( (lv_havingClause_10_0= ruleHavingClause ) )? ( (lv_limitClause_11_0= ruleLimitClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:729:2: ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_68 ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )? ( (lv_variables_5_0= ruleVariable ) ) ( (lv_variables_6_0= ruleVariable ) )* ( (lv_datasetClause_7_0= ruleDatasetClause ) )* ( (lv_whereClause_8_0= ruleWhereClause ) ) ( (lv_groupClause_9_0= ruleGroupClause ) )? ( (lv_havingClause_10_0= ruleHavingClause ) )? ( (lv_limitClause_11_0= ruleLimitClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:729:2: ( (lv_base_0_0= ruleBase ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:730:1: (lv_base_0_0= ruleBase )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:730:1: (lv_base_0_0= ruleBase )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:731:3: lv_base_0_0= ruleBase
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getBaseBaseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBase_in_ruleSelectVariablesQuery1284);
                    lv_base_0_0=ruleBase();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"base",
                      	        		lv_base_0_0, 
                      	        		"Base", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:753:3: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_66) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:754:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:754:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:755:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleSelectVariablesQuery1306);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop13;
                }
            } while (true);

            match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleSelectVariablesQuery1318); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSelectVariablesQueryAccess().getSELECTKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:782:1: ( ( (lv_isDistinct_3_0= KEYWORD_77 ) ) | ( (lv_isReduced_4_0= KEYWORD_71 ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_77) ) {
                alt14=1;
            }
            else if ( (LA14_0==KEYWORD_71) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:782:2: ( (lv_isDistinct_3_0= KEYWORD_77 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:782:2: ( (lv_isDistinct_3_0= KEYWORD_77 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:783:1: (lv_isDistinct_3_0= KEYWORD_77 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:783:1: (lv_isDistinct_3_0= KEYWORD_77 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:784:3: lv_isDistinct_3_0= KEYWORD_77
                    {
                    lv_isDistinct_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleSelectVariablesQuery1338); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSelectVariablesQueryAccess().getIsDistinctDISTINCTKeyword_3_0_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
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


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:805:6: ( (lv_isReduced_4_0= KEYWORD_71 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:805:6: ( (lv_isReduced_4_0= KEYWORD_71 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:806:1: (lv_isReduced_4_0= KEYWORD_71 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:806:1: (lv_isReduced_4_0= KEYWORD_71 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:807:3: lv_isReduced_4_0= KEYWORD_71
                    {
                    lv_isReduced_4_0=(Token)input.LT(1);
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleSelectVariablesQuery1376); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSelectVariablesQueryAccess().getIsReducedREDUCEDKeyword_3_1_0(), "isReduced"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isReduced", true, "REDUCED", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:827:4: ( (lv_variables_5_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:828:1: (lv_variables_5_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:828:1: (lv_variables_5_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:829:3: lv_variables_5_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getVariablesVariableParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleSelectVariablesQuery1412);
            lv_variables_5_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variables",
              	        		lv_variables_5_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:851:2: ( (lv_variables_6_0= ruleVariable ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KEYWORD_14||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:852:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:852:1: (lv_variables_6_0= ruleVariable )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:853:3: lv_variables_6_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getVariablesVariableParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleSelectVariablesQuery1433);
            	    lv_variables_6_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_6_0, 
            	      	        		"Variable", 
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
            	    break loop15;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:875:3: ( (lv_datasetClause_7_0= ruleDatasetClause ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:876:1: (lv_datasetClause_7_0= ruleDatasetClause )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:876:1: (lv_datasetClause_7_0= ruleDatasetClause )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:877:3: lv_datasetClause_7_0= ruleDatasetClause
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getDatasetClauseDatasetClauseParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDatasetClause_in_ruleSelectVariablesQuery1455);
            	    lv_datasetClause_7_0=ruleDatasetClause();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"datasetClause",
            	      	        		lv_datasetClause_7_0, 
            	      	        		"DatasetClause", 
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
            	    break loop16;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:899:3: ( (lv_whereClause_8_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:900:1: (lv_whereClause_8_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:900:1: (lv_whereClause_8_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:901:3: lv_whereClause_8_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getWhereClauseWhereClauseParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectVariablesQuery1477);
            lv_whereClause_8_0=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereClause",
              	        		lv_whereClause_8_0, 
              	        		"WhereClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:923:2: ( (lv_groupClause_9_0= ruleGroupClause ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:924:1: (lv_groupClause_9_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:924:1: (lv_groupClause_9_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:925:3: lv_groupClause_9_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getGroupClauseGroupClauseParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSelectVariablesQuery1498);
                    lv_groupClause_9_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_9_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:947:3: ( (lv_havingClause_10_0= ruleHavingClause ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_64) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:948:1: (lv_havingClause_10_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:948:1: (lv_havingClause_10_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:949:3: lv_havingClause_10_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getHavingClauseHavingClauseParserRuleCall_9_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectVariablesQuery1520);
                    lv_havingClause_10_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_10_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:971:3: ( (lv_limitClause_11_0= ruleLimitClause ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:972:1: (lv_limitClause_11_0= ruleLimitClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:972:1: (lv_limitClause_11_0= ruleLimitClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:973:3: lv_limitClause_11_0= ruleLimitClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSelectVariablesQueryAccess().getLimitClauseLimitClauseParserRuleCall_10_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLimitClause_in_ruleSelectVariablesQuery1542);
                    lv_limitClause_11_0=ruleLimitClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSelectVariablesQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"limitClause",
                      	        		lv_limitClause_11_0, 
                      	        		"LimitClause", 
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
    // $ANTLR end ruleSelectVariablesQuery


    // $ANTLR start entryRuleAskQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1003:1: entryRuleAskQuery returns [EObject current=null] : iv_ruleAskQuery= ruleAskQuery EOF ;
    public final EObject entryRuleAskQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAskQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1004:2: (iv_ruleAskQuery= ruleAskQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1005:2: iv_ruleAskQuery= ruleAskQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAskQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAskQuery_in_entryRuleAskQuery1578);
            iv_ruleAskQuery=ruleAskQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAskQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAskQuery1588); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAskQuery


    // $ANTLR start ruleAskQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1012:1: ruleAskQuery returns [EObject current=null] : ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_28 ( (lv_datasetClause_3_0= ruleDatasetClause ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ( (lv_limitClause_7_0= ruleLimitClause ) )? ) ;
    public final EObject ruleAskQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_base_0_0 = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_datasetClause_3_0 = null;

        EObject lv_whereClause_4_0 = null;

        EObject lv_groupClause_5_0 = null;

        EObject lv_havingClause_6_0 = null;

        EObject lv_limitClause_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1017:6: ( ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_28 ( (lv_datasetClause_3_0= ruleDatasetClause ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ( (lv_limitClause_7_0= ruleLimitClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1018:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_28 ( (lv_datasetClause_3_0= ruleDatasetClause ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ( (lv_limitClause_7_0= ruleLimitClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1018:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_28 ( (lv_datasetClause_3_0= ruleDatasetClause ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ( (lv_limitClause_7_0= ruleLimitClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1018:2: ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_28 ( (lv_datasetClause_3_0= ruleDatasetClause ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ( (lv_limitClause_7_0= ruleLimitClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1018:2: ( (lv_base_0_0= ruleBase ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1019:1: (lv_base_0_0= ruleBase )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1019:1: (lv_base_0_0= ruleBase )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1020:3: lv_base_0_0= ruleBase
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getBaseBaseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBase_in_ruleAskQuery1634);
                    lv_base_0_0=ruleBase();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"base",
                      	        		lv_base_0_0, 
                      	        		"Base", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1042:3: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KEYWORD_66) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1043:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1043:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1044:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleAskQuery1656);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop21;
                }
            } while (true);

            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleAskQuery1668); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAskQueryAccess().getASKKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1071:1: ( (lv_datasetClause_3_0= ruleDatasetClause ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_40) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1072:1: (lv_datasetClause_3_0= ruleDatasetClause )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1072:1: (lv_datasetClause_3_0= ruleDatasetClause )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1073:3: lv_datasetClause_3_0= ruleDatasetClause
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getDatasetClauseDatasetClauseParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDatasetClause_in_ruleAskQuery1689);
            	    lv_datasetClause_3_0=ruleDatasetClause();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"datasetClause",
            	      	        		lv_datasetClause_3_0, 
            	      	        		"DatasetClause", 
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
            	    break loop22;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1095:3: ( (lv_whereClause_4_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1096:1: (lv_whereClause_4_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1096:1: (lv_whereClause_4_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1097:3: lv_whereClause_4_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getWhereClauseWhereClauseParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleAskQuery1711);
            lv_whereClause_4_0=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereClause",
              	        		lv_whereClause_4_0, 
              	        		"WhereClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1119:2: ( (lv_groupClause_5_0= ruleGroupClause ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1120:1: (lv_groupClause_5_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1120:1: (lv_groupClause_5_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1121:3: lv_groupClause_5_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getGroupClauseGroupClauseParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleAskQuery1732);
                    lv_groupClause_5_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_5_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1143:3: ( (lv_havingClause_6_0= ruleHavingClause ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_64) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1144:1: (lv_havingClause_6_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1144:1: (lv_havingClause_6_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1145:3: lv_havingClause_6_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getHavingClauseHavingClauseParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleAskQuery1754);
                    lv_havingClause_6_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_6_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1167:3: ( (lv_limitClause_7_0= ruleLimitClause ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1168:1: (lv_limitClause_7_0= ruleLimitClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1168:1: (lv_limitClause_7_0= ruleLimitClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1169:3: lv_limitClause_7_0= ruleLimitClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAskQueryAccess().getLimitClauseLimitClauseParserRuleCall_7_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLimitClause_in_ruleAskQuery1776);
                    lv_limitClause_7_0=ruleLimitClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAskQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"limitClause",
                      	        		lv_limitClause_7_0, 
                      	        		"LimitClause", 
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
    // $ANTLR end ruleAskQuery


    // $ANTLR start entryRuleDescribeQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1199:1: entryRuleDescribeQuery returns [EObject current=null] : iv_ruleDescribeQuery= ruleDescribeQuery EOF ;
    public final EObject entryRuleDescribeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescribeQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1200:2: (iv_ruleDescribeQuery= ruleDescribeQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1201:2: iv_ruleDescribeQuery= ruleDescribeQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDescribeQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDescribeQuery_in_entryRuleDescribeQuery1812);
            iv_ruleDescribeQuery=ruleDescribeQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDescribeQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescribeQuery1822); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDescribeQuery


    // $ANTLR start ruleDescribeQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1208:1: ruleDescribeQuery returns [EObject current=null] : ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_76 ( (lv_variables_3_0= ruleGraphNode ) ) ( (lv_variables_4_0= ruleGraphNode ) )* ( (lv_datasetClause_5_0= ruleDatasetClause ) )* ( (lv_whereClause_6_0= ruleWhereClause ) )? ( (lv_groupClause_7_0= ruleGroupClause ) )? ( (lv_havingClause_8_0= ruleHavingClause ) )? ( (lv_limitClause_9_0= ruleLimitClause ) )? ) ;
    public final EObject ruleDescribeQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_base_0_0 = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_datasetClause_5_0 = null;

        EObject lv_whereClause_6_0 = null;

        EObject lv_groupClause_7_0 = null;

        EObject lv_havingClause_8_0 = null;

        EObject lv_limitClause_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1213:6: ( ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_76 ( (lv_variables_3_0= ruleGraphNode ) ) ( (lv_variables_4_0= ruleGraphNode ) )* ( (lv_datasetClause_5_0= ruleDatasetClause ) )* ( (lv_whereClause_6_0= ruleWhereClause ) )? ( (lv_groupClause_7_0= ruleGroupClause ) )? ( (lv_havingClause_8_0= ruleHavingClause ) )? ( (lv_limitClause_9_0= ruleLimitClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1214:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_76 ( (lv_variables_3_0= ruleGraphNode ) ) ( (lv_variables_4_0= ruleGraphNode ) )* ( (lv_datasetClause_5_0= ruleDatasetClause ) )* ( (lv_whereClause_6_0= ruleWhereClause ) )? ( (lv_groupClause_7_0= ruleGroupClause ) )? ( (lv_havingClause_8_0= ruleHavingClause ) )? ( (lv_limitClause_9_0= ruleLimitClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1214:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_76 ( (lv_variables_3_0= ruleGraphNode ) ) ( (lv_variables_4_0= ruleGraphNode ) )* ( (lv_datasetClause_5_0= ruleDatasetClause ) )* ( (lv_whereClause_6_0= ruleWhereClause ) )? ( (lv_groupClause_7_0= ruleGroupClause ) )? ( (lv_havingClause_8_0= ruleHavingClause ) )? ( (lv_limitClause_9_0= ruleLimitClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1214:2: ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_76 ( (lv_variables_3_0= ruleGraphNode ) ) ( (lv_variables_4_0= ruleGraphNode ) )* ( (lv_datasetClause_5_0= ruleDatasetClause ) )* ( (lv_whereClause_6_0= ruleWhereClause ) )? ( (lv_groupClause_7_0= ruleGroupClause ) )? ( (lv_havingClause_8_0= ruleHavingClause ) )? ( (lv_limitClause_9_0= ruleLimitClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1214:2: ( (lv_base_0_0= ruleBase ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1215:1: (lv_base_0_0= ruleBase )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1215:1: (lv_base_0_0= ruleBase )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1216:3: lv_base_0_0= ruleBase
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getBaseBaseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBase_in_ruleDescribeQuery1868);
                    lv_base_0_0=ruleBase();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"base",
                      	        		lv_base_0_0, 
                      	        		"Base", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1238:3: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_66) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1239:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1239:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1240:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleDescribeQuery1890);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop27;
                }
            } while (true);

            match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleDescribeQuery1902); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDescribeQueryAccess().getDESCRIBEKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1267:1: ( (lv_variables_3_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1268:1: (lv_variables_3_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1268:1: (lv_variables_3_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1269:3: lv_variables_3_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getVariablesGraphNodeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleDescribeQuery1923);
            lv_variables_3_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variables",
              	        		lv_variables_3_0, 
              	        		"GraphNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1291:2: ( (lv_variables_4_0= ruleGraphNode ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_22||LA28_0==KEYWORD_26||LA28_0==KEYWORD_14||(LA28_0>=RULE_IRI_TERMINAL && LA28_0<=RULE_INT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1292:1: (lv_variables_4_0= ruleGraphNode )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1292:1: (lv_variables_4_0= ruleGraphNode )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1293:3: lv_variables_4_0= ruleGraphNode
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getVariablesGraphNodeParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGraphNode_in_ruleDescribeQuery1944);
            	    lv_variables_4_0=ruleGraphNode();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_4_0, 
            	      	        		"GraphNode", 
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
            	    break loop28;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1315:3: ( (lv_datasetClause_5_0= ruleDatasetClause ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1316:1: (lv_datasetClause_5_0= ruleDatasetClause )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1316:1: (lv_datasetClause_5_0= ruleDatasetClause )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1317:3: lv_datasetClause_5_0= ruleDatasetClause
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getDatasetClauseDatasetClauseParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDatasetClause_in_ruleDescribeQuery1966);
            	    lv_datasetClause_5_0=ruleDatasetClause();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"datasetClause",
            	      	        		lv_datasetClause_5_0, 
            	      	        		"DatasetClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1339:3: ( (lv_whereClause_6_0= ruleWhereClause ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1340:1: (lv_whereClause_6_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1340:1: (lv_whereClause_6_0= ruleWhereClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1341:3: lv_whereClause_6_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getWhereClauseWhereClauseParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDescribeQuery1988);
                    lv_whereClause_6_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_6_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1363:3: ( (lv_groupClause_7_0= ruleGroupClause ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1364:1: (lv_groupClause_7_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1364:1: (lv_groupClause_7_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1365:3: lv_groupClause_7_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getGroupClauseGroupClauseParserRuleCall_7_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleDescribeQuery2010);
                    lv_groupClause_7_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_7_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1387:3: ( (lv_havingClause_8_0= ruleHavingClause ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_64) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1388:1: (lv_havingClause_8_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1388:1: (lv_havingClause_8_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1389:3: lv_havingClause_8_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getHavingClauseHavingClauseParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleDescribeQuery2032);
                    lv_havingClause_8_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_8_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1411:3: ( (lv_limitClause_9_0= ruleLimitClause ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1412:1: (lv_limitClause_9_0= ruleLimitClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1412:1: (lv_limitClause_9_0= ruleLimitClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1413:3: lv_limitClause_9_0= ruleLimitClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDescribeQueryAccess().getLimitClauseLimitClauseParserRuleCall_9_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLimitClause_in_ruleDescribeQuery2054);
                    lv_limitClause_9_0=ruleLimitClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDescribeQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"limitClause",
                      	        		lv_limitClause_9_0, 
                      	        		"LimitClause", 
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
    // $ANTLR end ruleDescribeQuery


    // $ANTLR start entryRuleConstructQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1443:1: entryRuleConstructQuery returns [EObject current=null] : iv_ruleConstructQuery= ruleConstructQuery EOF ;
    public final EObject entryRuleConstructQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1444:2: (iv_ruleConstructQuery= ruleConstructQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1445:2: iv_ruleConstructQuery= ruleConstructQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstructQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstructQuery_in_entryRuleConstructQuery2090);
            iv_ruleConstructQuery=ruleConstructQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstructQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructQuery2100); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstructQuery


    // $ANTLR start ruleConstructQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1452:1: ruleConstructQuery returns [EObject current=null] : ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_80 ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) ) ( (lv_datasetClause_4_0= ruleDatasetClause ) )* ( (lv_whereClause_5_0= ruleWhereClause ) ) ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ( (lv_limitClause_8_0= ruleLimitClause ) )? ) ;
    public final EObject ruleConstructQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_base_0_0 = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_constructTemplate_3_0 = null;

        EObject lv_datasetClause_4_0 = null;

        EObject lv_whereClause_5_0 = null;

        EObject lv_groupClause_6_0 = null;

        EObject lv_havingClause_7_0 = null;

        EObject lv_limitClause_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1457:6: ( ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_80 ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) ) ( (lv_datasetClause_4_0= ruleDatasetClause ) )* ( (lv_whereClause_5_0= ruleWhereClause ) ) ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ( (lv_limitClause_8_0= ruleLimitClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1458:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_80 ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) ) ( (lv_datasetClause_4_0= ruleDatasetClause ) )* ( (lv_whereClause_5_0= ruleWhereClause ) ) ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ( (lv_limitClause_8_0= ruleLimitClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1458:1: ( ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_80 ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) ) ( (lv_datasetClause_4_0= ruleDatasetClause ) )* ( (lv_whereClause_5_0= ruleWhereClause ) ) ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ( (lv_limitClause_8_0= ruleLimitClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1458:2: ( (lv_base_0_0= ruleBase ) )? ( (lv_prefixes_1_0= rulePrefix ) )* KEYWORD_80 ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) ) ( (lv_datasetClause_4_0= ruleDatasetClause ) )* ( (lv_whereClause_5_0= ruleWhereClause ) ) ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ( (lv_limitClause_8_0= ruleLimitClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1458:2: ( (lv_base_0_0= ruleBase ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1459:1: (lv_base_0_0= ruleBase )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1459:1: (lv_base_0_0= ruleBase )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1460:3: lv_base_0_0= ruleBase
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getBaseBaseParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBase_in_ruleConstructQuery2146);
                    lv_base_0_0=ruleBase();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"base",
                      	        		lv_base_0_0, 
                      	        		"Base", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1482:3: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_66) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1483:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1483:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1484:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleConstructQuery2168);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop35;
                }
            } while (true);

            match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleConstructQuery2180); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructQueryAccess().getCONSTRUCTKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1511:1: ( (lv_constructTemplate_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1512:1: (lv_constructTemplate_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1512:1: (lv_constructTemplate_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1513:3: lv_constructTemplate_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getConstructTemplateGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleConstructQuery2201);
            lv_constructTemplate_3_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"constructTemplate",
              	        		lv_constructTemplate_3_0, 
              	        		"GroupGraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1535:2: ( (lv_datasetClause_4_0= ruleDatasetClause ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_40) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1536:1: (lv_datasetClause_4_0= ruleDatasetClause )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1536:1: (lv_datasetClause_4_0= ruleDatasetClause )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1537:3: lv_datasetClause_4_0= ruleDatasetClause
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getDatasetClauseDatasetClauseParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDatasetClause_in_ruleConstructQuery2222);
            	    lv_datasetClause_4_0=ruleDatasetClause();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"datasetClause",
            	      	        		lv_datasetClause_4_0, 
            	      	        		"DatasetClause", 
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
            	    break loop36;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1559:3: ( (lv_whereClause_5_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1560:1: (lv_whereClause_5_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1560:1: (lv_whereClause_5_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1561:3: lv_whereClause_5_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getWhereClauseWhereClauseParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleConstructQuery2244);
            lv_whereClause_5_0=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereClause",
              	        		lv_whereClause_5_0, 
              	        		"WhereClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1583:2: ( (lv_groupClause_6_0= ruleGroupClause ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1584:1: (lv_groupClause_6_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1584:1: (lv_groupClause_6_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1585:3: lv_groupClause_6_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getGroupClauseGroupClauseParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleConstructQuery2265);
                    lv_groupClause_6_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_6_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1607:3: ( (lv_havingClause_7_0= ruleHavingClause ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1608:1: (lv_havingClause_7_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1608:1: (lv_havingClause_7_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1609:3: lv_havingClause_7_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getHavingClauseHavingClauseParserRuleCall_7_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleConstructQuery2287);
                    lv_havingClause_7_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_7_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1631:3: ( (lv_limitClause_8_0= ruleLimitClause ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1632:1: (lv_limitClause_8_0= ruleLimitClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1632:1: (lv_limitClause_8_0= ruleLimitClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1633:3: lv_limitClause_8_0= ruleLimitClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructQueryAccess().getLimitClauseLimitClauseParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLimitClause_in_ruleConstructQuery2309);
                    lv_limitClause_8_0=ruleLimitClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"limitClause",
                      	        		lv_limitClause_8_0, 
                      	        		"LimitClause", 
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
    // $ANTLR end ruleConstructQuery


    // $ANTLR start entryRuleUpdateQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1663:1: entryRuleUpdateQuery returns [EObject current=null] : iv_ruleUpdateQuery= ruleUpdateQuery EOF ;
    public final EObject entryRuleUpdateQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1664:2: (iv_ruleUpdateQuery= ruleUpdateQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1665:2: iv_ruleUpdateQuery= ruleUpdateQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUpdateQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUpdateQuery_in_entryRuleUpdateQuery2345);
            iv_ruleUpdateQuery=ruleUpdateQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUpdateQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateQuery2355); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUpdateQuery


    // $ANTLR start ruleUpdateQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1672:1: ruleUpdateQuery returns [EObject current=null] : ( () ( (lv_prefixes_1_0= rulePrefix ) )* ( (lv_operations_2_0= ruleUpdateOperation ) )+ ) ;
    public final EObject ruleUpdateQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_prefixes_1_0 = null;

        EObject lv_operations_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1677:6: ( ( () ( (lv_prefixes_1_0= rulePrefix ) )* ( (lv_operations_2_0= ruleUpdateOperation ) )+ ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1678:1: ( () ( (lv_prefixes_1_0= rulePrefix ) )* ( (lv_operations_2_0= ruleUpdateOperation ) )+ )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1678:1: ( () ( (lv_prefixes_1_0= rulePrefix ) )* ( (lv_operations_2_0= ruleUpdateOperation ) )+ )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1678:2: () ( (lv_prefixes_1_0= rulePrefix ) )* ( (lv_operations_2_0= ruleUpdateOperation ) )+
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1678:2: ()
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1679:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getUpdateQueryAccess().getUpdateQueryAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getUpdateQueryAccess().getUpdateQueryAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1692:2: ( (lv_prefixes_1_0= rulePrefix ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_66) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1693:1: (lv_prefixes_1_0= rulePrefix )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1693:1: (lv_prefixes_1_0= rulePrefix )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1694:3: lv_prefixes_1_0= rulePrefix
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUpdateQueryAccess().getPrefixesPrefixParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefix_in_ruleUpdateQuery2413);
            	    lv_prefixes_1_0=rulePrefix();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getUpdateQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"prefixes",
            	      	        		lv_prefixes_1_0, 
            	      	        		"Prefix", 
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
            	    break loop40;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1716:3: ( (lv_operations_2_0= ruleUpdateOperation ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=KEYWORD_60 && LA41_0<=KEYWORD_61)||LA41_0==KEYWORD_65||LA41_0==KEYWORD_47||LA41_0==KEYWORD_39||(LA41_0>=KEYWORD_43 && LA41_0<=KEYWORD_44)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1717:1: (lv_operations_2_0= ruleUpdateOperation )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1717:1: (lv_operations_2_0= ruleUpdateOperation )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1718:3: lv_operations_2_0= ruleUpdateOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUpdateQueryAccess().getOperationsUpdateOperationParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateOperation_in_ruleUpdateQuery2435);
            	    lv_operations_2_0=ruleUpdateOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getUpdateQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"operations",
            	      	        		lv_operations_2_0, 
            	      	        		"UpdateOperation", 
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
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // $ANTLR end ruleUpdateQuery


    // $ANTLR start entryRuleUpdateOperation
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1748:1: entryRuleUpdateOperation returns [EObject current=null] : iv_ruleUpdateOperation= ruleUpdateOperation EOF ;
    public final EObject entryRuleUpdateOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateOperation = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1749:2: (iv_ruleUpdateOperation= ruleUpdateOperation EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1750:2: iv_ruleUpdateOperation= ruleUpdateOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUpdateOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUpdateOperation_in_entryRuleUpdateOperation2471);
            iv_ruleUpdateOperation=ruleUpdateOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUpdateOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateOperation2481); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUpdateOperation


    // $ANTLR start ruleUpdateOperation
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1757:1: ruleUpdateOperation returns [EObject current=null] : (this_ModifyQuery_0= ruleModifyQuery | this_CreateGraphQuery_1= ruleCreateGraphQuery | this_DropGraphQuery_2= ruleDropGraphQuery | this_LoadGraphQuery_3= ruleLoadGraphQuery | this_ClearGraphQuery_4= ruleClearGraphQuery ) ;
    public final EObject ruleUpdateOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ModifyQuery_0 = null;

        EObject this_CreateGraphQuery_1 = null;

        EObject this_DropGraphQuery_2 = null;

        EObject this_LoadGraphQuery_3 = null;

        EObject this_ClearGraphQuery_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1762:6: ( (this_ModifyQuery_0= ruleModifyQuery | this_CreateGraphQuery_1= ruleCreateGraphQuery | this_DropGraphQuery_2= ruleDropGraphQuery | this_LoadGraphQuery_3= ruleLoadGraphQuery | this_ClearGraphQuery_4= ruleClearGraphQuery ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1763:1: (this_ModifyQuery_0= ruleModifyQuery | this_CreateGraphQuery_1= ruleCreateGraphQuery | this_DropGraphQuery_2= ruleDropGraphQuery | this_LoadGraphQuery_3= ruleLoadGraphQuery | this_ClearGraphQuery_4= ruleClearGraphQuery )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1763:1: (this_ModifyQuery_0= ruleModifyQuery | this_CreateGraphQuery_1= ruleCreateGraphQuery | this_DropGraphQuery_2= ruleDropGraphQuery | this_LoadGraphQuery_3= ruleLoadGraphQuery | this_ClearGraphQuery_4= ruleClearGraphQuery )
            int alt42=5;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
            case KEYWORD_65:
            case KEYWORD_44:
                {
                alt42=1;
                }
                break;
            case KEYWORD_60:
                {
                alt42=2;
                }
                break;
            case KEYWORD_39:
                {
                alt42=3;
                }
                break;
            case KEYWORD_43:
                {
                alt42=4;
                }
                break;
            case KEYWORD_47:
                {
                alt42=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1763:1: (this_ModifyQuery_0= ruleModifyQuery | this_CreateGraphQuery_1= ruleCreateGraphQuery | this_DropGraphQuery_2= ruleDropGraphQuery | this_LoadGraphQuery_3= ruleLoadGraphQuery | this_ClearGraphQuery_4= ruleClearGraphQuery )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1764:2: this_ModifyQuery_0= ruleModifyQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUpdateOperationAccess().getModifyQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleModifyQuery_in_ruleUpdateOperation2531);
                    this_ModifyQuery_0=ruleModifyQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ModifyQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1777:2: this_CreateGraphQuery_1= ruleCreateGraphQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUpdateOperationAccess().getCreateGraphQueryParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateGraphQuery_in_ruleUpdateOperation2561);
                    this_CreateGraphQuery_1=ruleCreateGraphQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_CreateGraphQuery_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1790:2: this_DropGraphQuery_2= ruleDropGraphQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUpdateOperationAccess().getDropGraphQueryParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropGraphQuery_in_ruleUpdateOperation2591);
                    this_DropGraphQuery_2=ruleDropGraphQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DropGraphQuery_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1803:2: this_LoadGraphQuery_3= ruleLoadGraphQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUpdateOperationAccess().getLoadGraphQueryParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoadGraphQuery_in_ruleUpdateOperation2621);
                    this_LoadGraphQuery_3=ruleLoadGraphQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_LoadGraphQuery_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1816:2: this_ClearGraphQuery_4= ruleClearGraphQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUpdateOperationAccess().getClearGraphQueryParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleClearGraphQuery_in_ruleUpdateOperation2651);
                    this_ClearGraphQuery_4=ruleClearGraphQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ClearGraphQuery_4;
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
    // $ANTLR end ruleUpdateOperation


    // $ANTLR start entryRuleModifyQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1835:1: entryRuleModifyQuery returns [EObject current=null] : iv_ruleModifyQuery= ruleModifyQuery EOF ;
    public final EObject entryRuleModifyQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1836:2: (iv_ruleModifyQuery= ruleModifyQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1837:2: iv_ruleModifyQuery= ruleModifyQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModifyQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModifyQuery_in_entryRuleModifyQuery2685);
            iv_ruleModifyQuery=ruleModifyQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModifyQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyQuery2695); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModifyQuery


    // $ANTLR start ruleModifyQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1844:1: ruleModifyQuery returns [EObject current=null] : (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery ) ;
    public final EObject ruleModifyQuery() throws RecognitionException {
        EObject current = null;

        EObject this_InsertQuery_0 = null;

        EObject this_InsertDataQuery_1 = null;

        EObject this_DeleteQuery_2 = null;

        EObject this_DeleteDataQuery_3 = null;

        EObject this_DeleteWhereQuery_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1849:6: ( (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )
            int alt43=5;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_IRI_TERMINAL) ) {
                    int LA43_4 = input.LA(3);

                    if ( (LA43_4==KEYWORD_61) ) {
                        switch ( input.LA(4) ) {
                        case KEYWORD_38:
                            {
                            alt43=4;
                            }
                            break;
                        case KEYWORD_57:
                            {
                            alt43=5;
                            }
                            break;
                        case KEYWORD_40:
                        case KEYWORD_16:
                            {
                            alt43=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA43_4==KEYWORD_65) ) {
                        int LA43_2 = input.LA(4);

                        if ( (LA43_2==KEYWORD_38) ) {
                            alt43=2;
                        }
                        else if ( (LA43_2==KEYWORD_41||LA43_2==KEYWORD_16) ) {
                            alt43=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_65:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==KEYWORD_38) ) {
                    alt43=2;
                }
                else if ( (LA43_2==KEYWORD_41||LA43_2==KEYWORD_16) ) {
                    alt43=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_61:
                {
                switch ( input.LA(2) ) {
                case KEYWORD_38:
                    {
                    alt43=4;
                    }
                    break;
                case KEYWORD_57:
                    {
                    alt43=5;
                    }
                    break;
                case KEYWORD_40:
                case KEYWORD_16:
                    {
                    alt43=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1850:1: (this_InsertQuery_0= ruleInsertQuery | this_InsertDataQuery_1= ruleInsertDataQuery | this_DeleteQuery_2= ruleDeleteQuery | this_DeleteDataQuery_3= ruleDeleteDataQuery | this_DeleteWhereQuery_4= ruleDeleteWhereQuery )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1851:2: this_InsertQuery_0= ruleInsertQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getInsertQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertQuery_in_ruleModifyQuery2745);
                    this_InsertQuery_0=ruleInsertQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InsertQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1864:2: this_InsertDataQuery_1= ruleInsertDataQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getInsertDataQueryParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertDataQuery_in_ruleModifyQuery2775);
                    this_InsertDataQuery_1=ruleInsertDataQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_InsertDataQuery_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1877:2: this_DeleteQuery_2= ruleDeleteQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getDeleteQueryParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteQuery_in_ruleModifyQuery2805);
                    this_DeleteQuery_2=ruleDeleteQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DeleteQuery_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1890:2: this_DeleteDataQuery_3= ruleDeleteDataQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getDeleteDataQueryParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteDataQuery_in_ruleModifyQuery2835);
                    this_DeleteDataQuery_3=ruleDeleteDataQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DeleteDataQuery_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1903:2: this_DeleteWhereQuery_4= ruleDeleteWhereQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getDeleteWhereQueryParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteWhereQuery_in_ruleModifyQuery2865);
                    this_DeleteWhereQuery_4=ruleDeleteWhereQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DeleteWhereQuery_4;
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
    // $ANTLR end ruleModifyQuery


    // $ANTLR start entryRuleCreateGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1922:1: entryRuleCreateGraphQuery returns [EObject current=null] : iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF ;
    public final EObject entryRuleCreateGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1923:2: (iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1924:2: iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCreateGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCreateGraphQuery_in_entryRuleCreateGraphQuery2899);
            iv_ruleCreateGraphQuery=ruleCreateGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCreateGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateGraphQuery2909); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCreateGraphQuery


    // $ANTLR start ruleCreateGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1931:1: ruleCreateGraphQuery returns [EObject current=null] : ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleCreateGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isSilent_1_0=null;
        Token lv_graph_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1936:6: ( ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1937:1: ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1937:1: ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1938:2: KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleCreateGraphQuery2945); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCreateGraphQueryAccess().getCREATEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1942:1: ( (lv_isSilent_1_0= KEYWORD_69 ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1943:1: (lv_isSilent_1_0= KEYWORD_69 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1943:1: (lv_isSilent_1_0= KEYWORD_69 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1944:3: lv_isSilent_1_0= KEYWORD_69
                    {
                    lv_isSilent_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleCreateGraphQuery2964); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCreateGraphQueryAccess().getIsSilentSILENTKeyword_1_0(), "isSilent"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCreateGraphQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isSilent", lv_isSilent_1_0, "SILENT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleCreateGraphQuery2989); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCreateGraphQueryAccess().getGRAPHKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1969:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1970:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1970:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1971:3: lv_graph_3_0= RULE_IRI_TERMINAL
            {
            lv_graph_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleCreateGraphQuery3006); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCreateGraphQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_3_0(), "graph"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCreateGraphQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"graph",
              	        		lv_graph_3_0, 
              	        		"IRI_TERMINAL", 
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
    // $ANTLR end ruleCreateGraphQuery


    // $ANTLR start entryRuleDropGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2001:1: entryRuleDropGraphQuery returns [EObject current=null] : iv_ruleDropGraphQuery= ruleDropGraphQuery EOF ;
    public final EObject entryRuleDropGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2002:2: (iv_ruleDropGraphQuery= ruleDropGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2003:2: iv_ruleDropGraphQuery= ruleDropGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDropGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDropGraphQuery_in_entryRuleDropGraphQuery3046);
            iv_ruleDropGraphQuery=ruleDropGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDropGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropGraphQuery3056); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDropGraphQuery


    // $ANTLR start ruleDropGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2010:1: ruleDropGraphQuery returns [EObject current=null] : ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleDropGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isSilent_1_0=null;
        Token lv_graph_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2015:6: ( ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2016:1: ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2016:1: ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2017:2: KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            {
            match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleDropGraphQuery3092); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDropGraphQueryAccess().getDROPKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2021:1: ( (lv_isSilent_1_0= KEYWORD_69 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2022:1: (lv_isSilent_1_0= KEYWORD_69 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2022:1: (lv_isSilent_1_0= KEYWORD_69 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2023:3: lv_isSilent_1_0= KEYWORD_69
                    {
                    lv_isSilent_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleDropGraphQuery3111); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDropGraphQueryAccess().getIsSilentSILENTKeyword_1_0(), "isSilent"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDropGraphQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isSilent", lv_isSilent_1_0, "SILENT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleDropGraphQuery3136); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDropGraphQueryAccess().getGRAPHKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2048:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2049:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2049:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2050:3: lv_graph_3_0= RULE_IRI_TERMINAL
            {
            lv_graph_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDropGraphQuery3153); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDropGraphQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_3_0(), "graph"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDropGraphQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"graph",
              	        		lv_graph_3_0, 
              	        		"IRI_TERMINAL", 
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
    // $ANTLR end ruleDropGraphQuery


    // $ANTLR start entryRuleLoadGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2080:1: entryRuleLoadGraphQuery returns [EObject current=null] : iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF ;
    public final EObject entryRuleLoadGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2081:2: (iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2082:2: iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLoadGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLoadGraphQuery_in_entryRuleLoadGraphQuery3193);
            iv_ruleLoadGraphQuery=ruleLoadGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLoadGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadGraphQuery3203); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoadGraphQuery


    // $ANTLR start ruleLoadGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2089:1: ruleLoadGraphQuery returns [EObject current=null] : ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? ) ;
    public final EObject ruleLoadGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_1_0=null;
        Token lv_intoGraph_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2094:6: ( ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2095:1: ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2095:1: ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2096:2: KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )?
            {
            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleLoadGraphQuery3239); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLoadGraphQueryAccess().getLOADKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2100:1: ( (lv_graph_1_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2101:1: (lv_graph_1_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2101:1: (lv_graph_1_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2102:3: lv_graph_1_0= RULE_IRI_TERMINAL
            {
            lv_graph_1_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3256); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLoadGraphQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_1_0(), "graph"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLoadGraphQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"graph",
              	        		lv_graph_1_0, 
              	        		"IRI_TERMINAL", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2124:2: ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2125:2: KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleLoadGraphQuery3273); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLoadGraphQueryAccess().getINTOKeyword_2_0(), null); 
                          
                    }
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleLoadGraphQuery3284); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLoadGraphQueryAccess().getGRAPHKeyword_2_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2134:1: ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2135:1: (lv_intoGraph_4_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2135:1: (lv_intoGraph_4_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2136:3: lv_intoGraph_4_0= RULE_IRI_TERMINAL
                    {
                    lv_intoGraph_4_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3301); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getLoadGraphQueryAccess().getIntoGraphIRI_TERMINALTerminalRuleCall_2_2_0(), "intoGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLoadGraphQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"intoGraph",
                      	        		lv_intoGraph_4_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
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
    // $ANTLR end ruleLoadGraphQuery


    // $ANTLR start entryRuleClearGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2166:1: entryRuleClearGraphQuery returns [EObject current=null] : iv_ruleClearGraphQuery= ruleClearGraphQuery EOF ;
    public final EObject entryRuleClearGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2167:2: (iv_ruleClearGraphQuery= ruleClearGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2168:2: iv_ruleClearGraphQuery= ruleClearGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClearGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClearGraphQuery_in_entryRuleClearGraphQuery3343);
            iv_ruleClearGraphQuery=ruleClearGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClearGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClearGraphQuery3353); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClearGraphQuery


    // $ANTLR start ruleClearGraphQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2175:1: ruleClearGraphQuery returns [EObject current=null] : ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) ) ;
    public final EObject ruleClearGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_uri_2_0=null;
        Token lv_isDefault_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2180:6: ( ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2181:1: ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2181:1: ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2182:2: KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )
            {
            match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleClearGraphQuery3389); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClearGraphQueryAccess().getCLEARKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleClearGraphQuery3400); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClearGraphQueryAccess().getGRAPHKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2191:1: ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_IRI_TERMINAL) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_70) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2191:1: ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2191:2: ( (lv_uri_2_0= RULE_IRI_TERMINAL ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2191:2: ( (lv_uri_2_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2192:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2192:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2193:3: lv_uri_2_0= RULE_IRI_TERMINAL
                    {
                    lv_uri_2_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleClearGraphQuery3418); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getClearGraphQueryAccess().getUriIRI_TERMINALTerminalRuleCall_2_0_0(), "uri"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClearGraphQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"uri",
                      	        		lv_uri_2_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2216:6: ( (lv_isDefault_3_0= KEYWORD_70 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2216:6: ( (lv_isDefault_3_0= KEYWORD_70 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2217:1: (lv_isDefault_3_0= KEYWORD_70 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2217:1: (lv_isDefault_3_0= KEYWORD_70 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2218:3: lv_isDefault_3_0= KEYWORD_70
                    {
                    lv_isDefault_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleClearGraphQuery3448); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getClearGraphQueryAccess().getIsDefaultDEFAULTKeyword_2_1_0(), "isDefault"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getClearGraphQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isDefault", true, "DEFAULT", lastConsumedNode);
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
    // $ANTLR end ruleClearGraphQuery


    // $ANTLR start entryRuleInsertQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2248:1: entryRuleInsertQuery returns [EObject current=null] : iv_ruleInsertQuery= ruleInsertQuery EOF ;
    public final EObject entryRuleInsertQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2249:2: (iv_ruleInsertQuery= ruleInsertQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2250:2: iv_ruleInsertQuery= ruleInsertQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInsertQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInsertQuery_in_entryRuleInsertQuery3499);
            iv_ruleInsertQuery=ruleInsertQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInsertQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertQuery3509); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInsertQuery


    // $ANTLR start ruleInsertQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2257:1: ruleInsertQuery returns [EObject current=null] : ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_6_0= ruleWhereClause ) )? ) ;
    public final EObject ruleInsertQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        Token lv_graph_4_0=null;
        EObject lv_pattern_5_0 = null;

        EObject lv_whereClause_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2262:6: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_6_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2263:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_6_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2263:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_6_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2263:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_6_0= ruleWhereClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2263:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2264:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInsertQuery3546); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertQueryAccess().getWITHKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2268:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2269:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2269:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2270:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                    {
                    lv_withGraph_1_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3563); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_1_0(), "withGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInsertQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"withGraph",
                      	        		lv_withGraph_1_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleInsertQuery3581); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertQueryAccess().getINSERTKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2297:1: ( KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2298:2: KEYWORD_41 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleInsertQuery3593); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertQueryAccess().getINTOKeyword_2_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2302:1: ( (lv_graph_4_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2303:1: (lv_graph_4_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2303:1: (lv_graph_4_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2304:3: lv_graph_4_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_4_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3610); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_2_1_0(), "graph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInsertQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"graph",
                      	        		lv_graph_4_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2326:4: ( (lv_pattern_5_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2327:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2327:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2328:3: lv_pattern_5_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInsertQueryAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleInsertQuery3638);
            lv_pattern_5_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInsertQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_5_0, 
              	        		"GroupGraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2350:2: ( (lv_whereClause_6_0= ruleWhereClause ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_57) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2351:1: (lv_whereClause_6_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2351:1: (lv_whereClause_6_0= ruleWhereClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2352:3: lv_whereClause_6_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInsertQueryAccess().getWhereClauseWhereClauseParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleInsertQuery3659);
                    lv_whereClause_6_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInsertQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_6_0, 
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
    // $ANTLR end ruleInsertQuery


    // $ANTLR start entryRuleInsertDataQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2382:1: entryRuleInsertDataQuery returns [EObject current=null] : iv_ruleInsertDataQuery= ruleInsertDataQuery EOF ;
    public final EObject entryRuleInsertDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertDataQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2383:2: (iv_ruleInsertDataQuery= ruleInsertDataQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2384:2: iv_ruleInsertDataQuery= ruleInsertDataQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInsertDataQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInsertDataQuery_in_entryRuleInsertDataQuery3695);
            iv_ruleInsertDataQuery=ruleInsertDataQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInsertDataQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertDataQuery3705); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInsertDataQuery


    // $ANTLR start ruleInsertDataQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2391:1: ruleInsertDataQuery returns [EObject current=null] : ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleInsertDataQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        Token lv_graph_5_0=null;
        EObject lv_pattern_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2396:6: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_44) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2398:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInsertDataQuery3742); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertDataQueryAccess().getWITHKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2402:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2403:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2403:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2404:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                    {
                    lv_withGraph_1_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3759); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertDataQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_1_0(), "withGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInsertDataQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"withGraph",
                      	        		lv_withGraph_1_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleInsertDataQuery3777); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertDataQueryAccess().getINSERTKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleInsertDataQuery3788); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertDataQueryAccess().getDATAKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2436:1: ( KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2437:2: KEYWORD_41 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleInsertDataQuery3800); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertDataQueryAccess().getINTOKeyword_3_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2441:1: ( (lv_graph_5_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2442:1: (lv_graph_5_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2442:1: (lv_graph_5_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2443:3: lv_graph_5_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_5_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3817); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertDataQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_3_1_0(), "graph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInsertDataQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"graph",
                      	        		lv_graph_5_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2465:4: ( (lv_pattern_6_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2466:1: (lv_pattern_6_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2466:1: (lv_pattern_6_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2467:3: lv_pattern_6_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInsertDataQueryAccess().getPatternGroupGraphPatternParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleInsertDataQuery3845);
            lv_pattern_6_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInsertDataQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_6_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleInsertDataQuery


    // $ANTLR start entryRuleDeleteQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2497:1: entryRuleDeleteQuery returns [EObject current=null] : iv_ruleDeleteQuery= ruleDeleteQuery EOF ;
    public final EObject entryRuleDeleteQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2498:2: (iv_ruleDeleteQuery= ruleDeleteQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2499:2: iv_ruleDeleteQuery= ruleDeleteQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteQuery_in_entryRuleDeleteQuery3880);
            iv_ruleDeleteQuery=ruleDeleteQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteQuery3890); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeleteQuery


    // $ANTLR start ruleDeleteQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2506:1: ruleDeleteQuery returns [EObject current=null] : ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_8_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        Token lv_graph_4_0=null;
        EObject lv_pattern_5_0 = null;

        EObject lv_insertPattern_7_0 = null;

        EObject lv_whereClause_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2511:6: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_8_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2512:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_8_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2512:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_8_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2512:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_8_0= ruleWhereClause ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2512:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KEYWORD_44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2513:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleDeleteQuery3927); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteQueryAccess().getWITHKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2517:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2518:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2518:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2519:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                    {
                    lv_withGraph_1_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery3944); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_1_0(), "withGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"withGraph",
                      	        		lv_withGraph_1_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteQuery3962); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteQueryAccess().getDELETEKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2546:1: ( KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2547:2: KEYWORD_40 ( (lv_graph_4_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDeleteQuery3974); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteQueryAccess().getFROMKeyword_2_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2551:1: ( (lv_graph_4_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2552:1: (lv_graph_4_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2552:1: (lv_graph_4_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2553:3: lv_graph_4_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_4_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery3991); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_2_1_0(), "graph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"graph",
                      	        		lv_graph_4_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2575:4: ( (lv_pattern_5_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2576:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2576:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2577:3: lv_pattern_5_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4019);
            lv_pattern_5_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeleteQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_5_0, 
              	        		"GroupGraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2599:2: ( KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KEYWORD_65) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==KEYWORD_16) ) {
                    int LA55_3 = input.LA(3);

                    if ( (synpred65()) ) {
                        alt55=1;
                    }
                }
            }
            switch (alt55) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2600:2: KEYWORD_65 ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) )
                    {
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleDeleteQuery4031); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteQueryAccess().getINSERTKeyword_4_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2604:1: ( (lv_insertPattern_7_0= ruleGroupGraphPattern ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2605:1: (lv_insertPattern_7_0= ruleGroupGraphPattern )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2605:1: (lv_insertPattern_7_0= ruleGroupGraphPattern )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2606:3: lv_insertPattern_7_0= ruleGroupGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getInsertPatternGroupGraphPatternParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4052);
                    lv_insertPattern_7_0=ruleGroupGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"insertPattern",
                      	        		lv_insertPattern_7_0, 
                      	        		"GroupGraphPattern", 
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

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2628:4: ( (lv_whereClause_8_0= ruleWhereClause ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_57) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2629:1: (lv_whereClause_8_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2629:1: (lv_whereClause_8_0= ruleWhereClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2630:3: lv_whereClause_8_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getWhereClauseWhereClauseParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteQuery4075);
                    lv_whereClause_8_0=ruleWhereClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"whereClause",
                      	        		lv_whereClause_8_0, 
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
    // $ANTLR end ruleDeleteQuery


    // $ANTLR start entryRuleDeleteDataQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2660:1: entryRuleDeleteDataQuery returns [EObject current=null] : iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF ;
    public final EObject entryRuleDeleteDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteDataQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2661:2: (iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2662:2: iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteDataQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteDataQuery_in_entryRuleDeleteDataQuery4111);
            iv_ruleDeleteDataQuery=ruleDeleteDataQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteDataQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteDataQuery4121); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeleteDataQuery


    // $ANTLR start ruleDeleteDataQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2669:1: ruleDeleteDataQuery returns [EObject current=null] : ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleDeleteDataQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        Token lv_graph_5_0=null;
        EObject lv_pattern_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2674:6: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2675:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2675:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2675:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_6_0= ruleGroupGraphPattern ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2675:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2676:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleDeleteDataQuery4158); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteDataQueryAccess().getWITHKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2680:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2681:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2681:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2682:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                    {
                    lv_withGraph_1_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4175); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteDataQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_1_0(), "withGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteDataQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"withGraph",
                      	        		lv_withGraph_1_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteDataQuery4193); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteDataQueryAccess().getDELETEKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleDeleteDataQuery4204); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteDataQueryAccess().getDATAKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2714:1: ( KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_40) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2715:2: KEYWORD_40 ( (lv_graph_5_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDeleteDataQuery4216); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteDataQueryAccess().getFROMKeyword_3_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2719:1: ( (lv_graph_5_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2720:1: (lv_graph_5_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2720:1: (lv_graph_5_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2721:3: lv_graph_5_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_5_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4233); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteDataQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_3_1_0(), "graph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteDataQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"graph",
                      	        		lv_graph_5_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2743:4: ( (lv_pattern_6_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2744:1: (lv_pattern_6_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2744:1: (lv_pattern_6_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2745:3: lv_pattern_6_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteDataQueryAccess().getPatternGroupGraphPatternParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteDataQuery4261);
            lv_pattern_6_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeleteDataQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_6_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleDeleteDataQuery


    // $ANTLR start entryRuleDeleteWhereQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2775:1: entryRuleDeleteWhereQuery returns [EObject current=null] : iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF ;
    public final EObject entryRuleDeleteWhereQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteWhereQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2776:2: (iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2777:2: iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteWhereQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteWhereQuery_in_entryRuleDeleteWhereQuery4296);
            iv_ruleDeleteWhereQuery=ruleDeleteWhereQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteWhereQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteWhereQuery4306); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeleteWhereQuery


    // $ANTLR start ruleDeleteWhereQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2784:1: ruleDeleteWhereQuery returns [EObject current=null] : ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) KEYWORD_17 ) ;
    public final EObject ruleDeleteWhereQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        EObject lv_pattern_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2789:6: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2790:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2790:1: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2790:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_5_0= ruleGroupGraphPattern ) ) KEYWORD_17
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2790:2: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2791:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleDeleteWhereQuery4343); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getWITHKeyword_0_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2795:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2796:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2796:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2797:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                    {
                    lv_withGraph_1_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteWhereQuery4360); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_1_0(), "withGraph"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeleteWhereQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"withGraph",
                      	        		lv_withGraph_1_0, 
                      	        		"IRI_TERMINAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteWhereQuery4378); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getDELETEKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleDeleteWhereQuery4389); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getWHEREKeyword_2(), null); 
                  
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleDeleteWhereQuery4400); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2834:1: ( (lv_pattern_5_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2835:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2835:1: (lv_pattern_5_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2836:3: lv_pattern_5_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteWhereQueryAccess().getPatternGroupGraphPatternParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteWhereQuery4421);
            lv_pattern_5_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeleteWhereQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_5_0, 
              	        		"GroupGraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleDeleteWhereQuery4432); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getRightCurlyBracketKeyword_5(), null); 
                  
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
    // $ANTLR end ruleDeleteWhereQuery


    // $ANTLR start entryRuleDatasetClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2871:1: entryRuleDatasetClause returns [EObject current=null] : iv_ruleDatasetClause= ruleDatasetClause EOF ;
    public final EObject entryRuleDatasetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2872:2: (iv_ruleDatasetClause= ruleDatasetClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2873:2: iv_ruleDatasetClause= ruleDatasetClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDatasetClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDatasetClause_in_entryRuleDatasetClause4467);
            iv_ruleDatasetClause=ruleDatasetClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDatasetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatasetClause4477); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDatasetClause


    // $ANTLR start ruleDatasetClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2880:1: ruleDatasetClause returns [EObject current=null] : (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet ) ;
    public final EObject ruleDatasetClause() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultDataSet_0 = null;

        EObject this_NamedDataSet_1 = null;

        EObject this_ServiceDataSet_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2885:6: ( (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2886:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2886:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==KEYWORD_40) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_53:
                    {
                    alt60=2;
                    }
                    break;
                case KEYWORD_72:
                    {
                    alt60=3;
                    }
                    break;
                case RULE_IRI_TERMINAL:
                    {
                    alt60=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2886:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )", 60, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2886:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2887:2: this_DefaultDataSet_0= ruleDefaultDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getDefaultDataSetParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultDataSet_in_ruleDatasetClause4527);
                    this_DefaultDataSet_0=ruleDefaultDataSet();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_DefaultDataSet_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2900:2: this_NamedDataSet_1= ruleNamedDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getNamedDataSetParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedDataSet_in_ruleDatasetClause4557);
                    this_NamedDataSet_1=ruleNamedDataSet();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NamedDataSet_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2913:2: this_ServiceDataSet_2= ruleServiceDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getServiceDataSetParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleServiceDataSet_in_ruleDatasetClause4587);
                    this_ServiceDataSet_2=ruleServiceDataSet();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ServiceDataSet_2;
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
    // $ANTLR end ruleDatasetClause


    // $ANTLR start entryRuleDefaultDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2932:1: entryRuleDefaultDataSet returns [EObject current=null] : iv_ruleDefaultDataSet= ruleDefaultDataSet EOF ;
    public final EObject entryRuleDefaultDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2933:2: (iv_ruleDefaultDataSet= ruleDefaultDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2934:2: iv_ruleDefaultDataSet= ruleDefaultDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefaultDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefaultDataSet_in_entryRuleDefaultDataSet4621);
            iv_ruleDefaultDataSet=ruleDefaultDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefaultDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultDataSet4631); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefaultDataSet


    // $ANTLR start ruleDefaultDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2941:1: ruleDefaultDataSet returns [EObject current=null] : ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) ) ;
    public final EObject ruleDefaultDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2946:6: ( ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2947:1: ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2947:1: ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2948:2: KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDefaultDataSet4667); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefaultDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2952:1: ( (lv_dataSet_1_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2953:1: (lv_dataSet_1_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2953:1: (lv_dataSet_1_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2954:3: lv_dataSet_1_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefaultDataSetAccess().getDataSetIRIParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleDefaultDataSet4688);
            lv_dataSet_1_0=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDefaultDataSetRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dataSet",
              	        		lv_dataSet_1_0, 
              	        		"IRI", 
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
    // $ANTLR end ruleDefaultDataSet


    // $ANTLR start entryRuleNamedDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2984:1: entryRuleNamedDataSet returns [EObject current=null] : iv_ruleNamedDataSet= ruleNamedDataSet EOF ;
    public final EObject entryRuleNamedDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2985:2: (iv_ruleNamedDataSet= ruleNamedDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2986:2: iv_ruleNamedDataSet= ruleNamedDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedDataSet_in_entryRuleNamedDataSet4723);
            iv_ruleNamedDataSet=ruleNamedDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedDataSet4733); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNamedDataSet


    // $ANTLR start ruleNamedDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2993:1: ruleNamedDataSet returns [EObject current=null] : ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) ) ;
    public final EObject ruleNamedDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2998:6: ( ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2999:1: ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2999:1: ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3000:2: KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleNamedDataSet4769); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleNamedDataSet4780); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedDataSetAccess().getNAMEDKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3009:1: ( (lv_dataSet_2_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3010:1: (lv_dataSet_2_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3010:1: (lv_dataSet_2_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3011:3: lv_dataSet_2_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNamedDataSetAccess().getDataSetIRIParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleNamedDataSet4801);
            lv_dataSet_2_0=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedDataSetRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dataSet",
              	        		lv_dataSet_2_0, 
              	        		"IRI", 
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
    // $ANTLR end ruleNamedDataSet


    // $ANTLR start entryRuleServiceDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3041:1: entryRuleServiceDataSet returns [EObject current=null] : iv_ruleServiceDataSet= ruleServiceDataSet EOF ;
    public final EObject entryRuleServiceDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3042:2: (iv_ruleServiceDataSet= ruleServiceDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3043:2: iv_ruleServiceDataSet= ruleServiceDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getServiceDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleServiceDataSet_in_entryRuleServiceDataSet4836);
            iv_ruleServiceDataSet=ruleServiceDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleServiceDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDataSet4846); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServiceDataSet


    // $ANTLR start ruleServiceDataSet
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3050:1: ruleServiceDataSet returns [EObject current=null] : ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) ) ;
    public final EObject ruleServiceDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3055:6: ( ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3056:1: ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3056:1: ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3057:2: KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleServiceDataSet4882); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleServiceDataSet4893); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceDataSetAccess().getSERVICEKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3066:1: ( (lv_dataSet_2_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3067:1: (lv_dataSet_2_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3067:1: (lv_dataSet_2_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3068:3: lv_dataSet_2_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceDataSetAccess().getDataSetIRIParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleServiceDataSet4914);
            lv_dataSet_2_0=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getServiceDataSetRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dataSet",
              	        		lv_dataSet_2_0, 
              	        		"IRI", 
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
    // $ANTLR end ruleServiceDataSet


    // $ANTLR start entryRuleWhereClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3098:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3099:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3100:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWhereClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause4949);
            iv_ruleWhereClause=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause4959); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3107:1: ruleWhereClause returns [EObject current=null] : ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject lv_groupGraphPattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3112:6: ( ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3113:1: ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3113:1: ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3114:2: KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleWhereClause4995); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3118:1: ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3119:1: (lv_groupGraphPattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3119:1: (lv_groupGraphPattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3120:3: lv_groupGraphPattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWhereClauseAccess().getGroupGraphPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleWhereClause5016);
            lv_groupGraphPattern_1_0=ruleGroupGraphPattern();
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
              	       			"groupGraphPattern",
              	        		lv_groupGraphPattern_1_0, 
              	        		"GroupGraphPattern", 
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


    // $ANTLR start entryRuleGroupClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3150:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3151:2: (iv_ruleGroupClause= ruleGroupClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3152:2: iv_ruleGroupClause= ruleGroupClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupClause_in_entryRuleGroupClause5051);
            iv_ruleGroupClause=ruleGroupClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupClause5061); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupClause


    // $ANTLR start ruleGroupClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3159:1: ruleGroupClause returns [EObject current=null] : ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3164:6: ( ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3165:1: ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3165:1: ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3166:2: KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) )
            {
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleGroupClause5097); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupClauseAccess().getGROUPKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleGroupClause5108); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupClauseAccess().getBYKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3175:1: ( (lv_condition_2_0= ruleGroupCondition ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3176:1: (lv_condition_2_0= ruleGroupCondition )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3176:1: (lv_condition_2_0= ruleGroupCondition )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3177:3: lv_condition_2_0= ruleGroupCondition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupClauseAccess().getConditionGroupConditionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupCondition_in_ruleGroupClause5129);
            lv_condition_2_0=ruleGroupCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGroupClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"condition",
              	        		lv_condition_2_0, 
              	        		"GroupCondition", 
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
    // $ANTLR end ruleGroupClause


    // $ANTLR start entryRuleGroupCondition
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3207:1: entryRuleGroupCondition returns [EObject current=null] : iv_ruleGroupCondition= ruleGroupCondition EOF ;
    public final EObject entryRuleGroupCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupCondition = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3208:2: (iv_ruleGroupCondition= ruleGroupCondition EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3209:2: iv_ruleGroupCondition= ruleGroupCondition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupConditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupCondition_in_entryRuleGroupCondition5164);
            iv_ruleGroupCondition=ruleGroupCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupCondition5174); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupCondition


    // $ANTLR start ruleGroupCondition
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3216:1: ruleGroupCondition returns [EObject current=null] : (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable ) ;
    public final EObject ruleGroupCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInCall_0 = null;

        EObject this_Function_1 = null;

        EObject this_Variable_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3221:6: ( (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )
            int alt61=3;
            switch ( input.LA(1) ) {
            case KEYWORD_83:
            case KEYWORD_82:
            case KEYWORD_75:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_54:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_34:
            case KEYWORD_36:
            case KEYWORD_24:
                {
                alt61=1;
                }
                break;
            case RULE_ID:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==KEYWORD_9) ) {
                    int LA61_4 = input.LA(3);

                    if ( (LA61_4==RULE_ID) ) {
                        int LA61_6 = input.LA(4);

                        if ( (LA61_6==KEYWORD_1) ) {
                            alt61=2;
                        }
                        else if ( (LA61_6==EOF||LA61_6==KEYWORD_64||LA61_6==KEYWORD_51||LA61_6==KEYWORD_17) ) {
                            alt61=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA61_2==KEYWORD_1) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_14:
                {
                alt61=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3222:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3223:2: this_BuiltInCall_0= ruleBuiltInCall
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getBuiltInCallParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleGroupCondition5224);
                    this_BuiltInCall_0=ruleBuiltInCall();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BuiltInCall_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3236:2: this_Function_1= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleGroupCondition5254);
                    this_Function_1=ruleFunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Function_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3249:2: this_Variable_2= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getVariableParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleGroupCondition5284);
                    this_Variable_2=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Variable_2;
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
    // $ANTLR end ruleGroupCondition


    // $ANTLR start entryRuleHavingClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3268:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3269:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3270:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHavingClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause5318);
            iv_ruleHavingClause=ruleHavingClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause5328); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3277:1: ruleHavingClause returns [EObject current=null] : ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject lv_constraint_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3282:6: ( ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3283:1: ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3283:1: ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3284:2: KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) )
            {
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleHavingClause5364); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3288:1: ( (lv_constraint_1_0= ruleConstraint ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3289:1: (lv_constraint_1_0= ruleConstraint )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3289:1: (lv_constraint_1_0= ruleConstraint )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3290:3: lv_constraint_1_0= ruleConstraint
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getHavingClauseAccess().getConstraintConstraintParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraint_in_ruleHavingClause5385);
            lv_constraint_1_0=ruleConstraint();
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
              	       			"constraint",
              	        		lv_constraint_1_0, 
              	        		"Constraint", 
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


    // $ANTLR start entryRuleConstraint
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3320:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3321:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3322:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint5420);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint5430); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3329:1: ruleConstraint returns [EObject current=null] : (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParFilterExpression_0 = null;

        EObject this_BuiltInCall_1 = null;

        EObject this_Function_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3334:6: ( (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3335:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3335:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )
            int alt62=3;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
                {
                alt62=1;
                }
                break;
            case KEYWORD_83:
            case KEYWORD_82:
            case KEYWORD_75:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_54:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_42:
            case KEYWORD_30:
            case KEYWORD_34:
            case KEYWORD_36:
            case KEYWORD_24:
                {
                alt62=2;
                }
                break;
            case RULE_ID:
                {
                alt62=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3335:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3336:2: this_ParFilterExpression_0= ruleParFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getParFilterExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParFilterExpression_in_ruleConstraint5480);
                    this_ParFilterExpression_0=ruleParFilterExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ParFilterExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3349:2: this_BuiltInCall_1= ruleBuiltInCall
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getBuiltInCallParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleConstraint5510);
                    this_BuiltInCall_1=ruleBuiltInCall();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BuiltInCall_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3362:2: this_Function_2= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getFunctionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleConstraint5540);
                    this_Function_2=ruleFunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Function_2;
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
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleLimitClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3381:1: entryRuleLimitClause returns [EObject current=null] : iv_ruleLimitClause= ruleLimitClause EOF ;
    public final EObject entryRuleLimitClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3382:2: (iv_ruleLimitClause= ruleLimitClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3383:2: iv_ruleLimitClause= ruleLimitClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLimitClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLimitClause_in_entryRuleLimitClause5574);
            iv_ruleLimitClause=ruleLimitClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLimitClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimitClause5584); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLimitClause


    // $ANTLR start ruleLimitClause
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3390:1: ruleLimitClause returns [EObject current=null] : ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLimitClause() throws RecognitionException {
        EObject current = null;

        Token lv_limit_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3395:6: ( ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3396:1: ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3396:1: ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3397:2: KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) )
            {
            match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleLimitClause5620); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLimitClauseAccess().getLIMITKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3401:1: ( (lv_limit_1_0= RULE_INT ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3402:1: (lv_limit_1_0= RULE_INT )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3402:1: (lv_limit_1_0= RULE_INT )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3403:3: lv_limit_1_0= RULE_INT
            {
            lv_limit_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLimitClause5637); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLimitClauseAccess().getLimitINTTerminalRuleCall_1_0(), "limit"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLimitClauseRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"limit",
              	        		lv_limit_1_0, 
              	        		"INT", 
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
    // $ANTLR end ruleLimitClause


    // $ANTLR start entryRuleGroupGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3433:1: entryRuleGroupGraphPattern returns [EObject current=null] : iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF ;
    public final EObject entryRuleGroupGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3434:2: (iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3435:2: iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_entryRuleGroupGraphPattern5677);
            iv_ruleGroupGraphPattern=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupGraphPattern5687); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupGraphPattern


    // $ANTLR start ruleGroupGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3442:1: ruleGroupGraphPattern returns [EObject current=null] : (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub ) ;
    public final EObject ruleGroupGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_SubSelectQuery_0 = null;

        EObject this_GroupGraphPatternSub_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3447:6: ( (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3448:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3448:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==KEYWORD_16) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==KEYWORD_68) ) {
                    alt63=1;
                }
                else if ( (LA63_1==KEYWORD_78||LA63_1==KEYWORD_72||LA63_1==KEYWORD_63||LA63_1==KEYWORD_49||LA63_1==KEYWORD_52||LA63_1==KEYWORD_22||LA63_1==KEYWORD_26||LA63_1==KEYWORD_14||LA63_1==KEYWORD_16||(LA63_1>=RULE_IRI_TERMINAL && LA63_1<=RULE_INT)) ) {
                    alt63=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3448:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3448:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3449:2: this_SubSelectQuery_0= ruleSubSelectQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternAccess().getSubSelectQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubSelectQuery_in_ruleGroupGraphPattern5737);
                    this_SubSelectQuery_0=ruleSubSelectQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SubSelectQuery_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3462:2: this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternAccess().getGroupGraphPatternSubParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPatternSub_in_ruleGroupGraphPattern5767);
                    this_GroupGraphPatternSub_1=ruleGroupGraphPatternSub();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GroupGraphPatternSub_1;
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
    // $ANTLR end ruleGroupGraphPattern


    // $ANTLR start entryRuleSubSelectQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3481:1: entryRuleSubSelectQuery returns [EObject current=null] : iv_ruleSubSelectQuery= ruleSubSelectQuery EOF ;
    public final EObject entryRuleSubSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3482:2: (iv_ruleSubSelectQuery= ruleSubSelectQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3483:2: iv_ruleSubSelectQuery= ruleSubSelectQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubSelectQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubSelectQuery_in_entryRuleSubSelectQuery5801);
            iv_ruleSubSelectQuery=ruleSubSelectQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubSelectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelectQuery5811); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubSelectQuery


    // $ANTLR start ruleSubSelectQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3490:1: ruleSubSelectQuery returns [EObject current=null] : ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 ) ;
    public final EObject ruleSubSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_2_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_whereClause_4_0 = null;

        EObject lv_groupClause_5_0 = null;

        EObject lv_havingClause_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3495:6: ( ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3496:1: ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3496:1: ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3497:2: KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSubSelectQuery5847); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubSelectQueryAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleSubSelectQuery5858); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubSelectQueryAccess().getSELECTKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3506:1: ( (lv_variables_2_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3507:1: (lv_variables_2_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3507:1: (lv_variables_2_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3508:3: lv_variables_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getVariablesVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleSubSelectQuery5879);
            lv_variables_2_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubSelectQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variables",
              	        		lv_variables_2_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3530:2: ( (lv_variables_3_0= ruleVariable ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==KEYWORD_14||LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3531:1: (lv_variables_3_0= ruleVariable )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3531:1: (lv_variables_3_0= ruleVariable )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3532:3: lv_variables_3_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getVariablesVariableParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleSubSelectQuery5900);
            	    lv_variables_3_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubSelectQueryRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_3_0, 
            	      	        		"Variable", 
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
            	    break loop64;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3554:3: ( (lv_whereClause_4_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3555:1: (lv_whereClause_4_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3555:1: (lv_whereClause_4_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3556:3: lv_whereClause_4_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleSubSelectQuery5922);
            lv_whereClause_4_0=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubSelectQueryRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whereClause",
              	        		lv_whereClause_4_0, 
              	        		"WhereClause", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3578:2: ( (lv_groupClause_5_0= ruleGroupClause ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_50) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3579:1: (lv_groupClause_5_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3579:1: (lv_groupClause_5_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3580:3: lv_groupClause_5_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getGroupClauseGroupClauseParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSubSelectQuery5943);
                    lv_groupClause_5_0=ruleGroupClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubSelectQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"groupClause",
                      	        		lv_groupClause_5_0, 
                      	        		"GroupClause", 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3602:3: ( (lv_havingClause_6_0= ruleHavingClause ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_64) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3603:1: (lv_havingClause_6_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3603:1: (lv_havingClause_6_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3604:3: lv_havingClause_6_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getHavingClauseHavingClauseParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSubSelectQuery5965);
                    lv_havingClause_6_0=ruleHavingClause();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubSelectQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"havingClause",
                      	        		lv_havingClause_6_0, 
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

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleSubSelectQuery5977); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubSelectQueryAccess().getRightCurlyBracketKeyword_7(), null); 
                  
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
    // $ANTLR end ruleSubSelectQuery


    // $ANTLR start entryRuleGroupGraphPatternSub
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3639:1: entryRuleGroupGraphPatternSub returns [EObject current=null] : iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF ;
    public final EObject entryRuleGroupGraphPatternSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupGraphPatternSub = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3640:2: (iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3641:2: iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupGraphPatternSubRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupGraphPatternSub_in_entryRuleGroupGraphPatternSub6012);
            iv_ruleGroupGraphPatternSub=ruleGroupGraphPatternSub();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupGraphPatternSub; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupGraphPatternSub6022); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupGraphPatternSub


    // $ANTLR start ruleGroupGraphPatternSub
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3648:1: ruleGroupGraphPatternSub returns [EObject current=null] : ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 ) ;
    public final EObject ruleGroupGraphPatternSub() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPatterns_1_0 = null;

        EObject lv_graphPatterns_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3653:6: ( ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3654:1: ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3654:1: ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3655:2: KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleGroupGraphPatternSub6058); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3659:1: ( (lv_graphPatterns_1_0= ruleGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3660:1: (lv_graphPatterns_1_0= ruleGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3660:1: (lv_graphPatterns_1_0= ruleGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3661:3: lv_graphPatterns_1_0= ruleGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6079);
            lv_graphPatterns_1_0=ruleGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGroupGraphPatternSubRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"graphPatterns",
              	        		lv_graphPatterns_1_0, 
              	        		"GraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3683:2: ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==KEYWORD_7) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==KEYWORD_78||LA67_1==KEYWORD_72||LA67_1==KEYWORD_63||LA67_1==KEYWORD_49||LA67_1==KEYWORD_52||LA67_1==KEYWORD_22||LA67_1==KEYWORD_26||LA67_1==KEYWORD_14||LA67_1==KEYWORD_16||(LA67_1>=RULE_IRI_TERMINAL && LA67_1<=RULE_INT)) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3684:2: KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) )
            	    {
            	    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6091); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getFullStopKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3688:1: ( (lv_graphPatterns_3_0= ruleGraphPattern ) )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3689:1: (lv_graphPatterns_3_0= ruleGraphPattern )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3689:1: (lv_graphPatterns_3_0= ruleGraphPattern )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3690:3: lv_graphPatterns_3_0= ruleGraphPattern
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsGraphPatternParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6112);
            	    lv_graphPatterns_3_0=ruleGraphPattern();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getGroupGraphPatternSubRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"graphPatterns",
            	      	        		lv_graphPatterns_3_0, 
            	      	        		"GraphPattern", 
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
            	    break loop67;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3712:4: ( KEYWORD_7 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KEYWORD_7) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3713:2: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6126); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getFullStopKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleGroupGraphPatternSub6139); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleGroupGraphPatternSub


    // $ANTLR start entryRuleGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3730:1: entryRuleGraphPattern returns [EObject current=null] : iv_ruleGraphPattern= ruleGraphPattern EOF ;
    public final EObject entryRuleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3731:2: (iv_ruleGraphPattern= ruleGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3732:2: iv_ruleGraphPattern= ruleGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphPattern_in_entryRuleGraphPattern6174);
            iv_ruleGraphPattern=ruleGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphPattern6184); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGraphPattern


    // $ANTLR start ruleGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3739:1: ruleGraphPattern returns [EObject current=null] : (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern ) ;
    public final EObject ruleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_TriplesSameSubject_0 = null;

        EObject this_GroupOrUnionGraphPattern_1 = null;

        EObject this_OptionalGraphPattern_2 = null;

        EObject this_GraphGraphPattern_3 = null;

        EObject this_ServiceGraphPattern_4 = null;

        EObject this_FilterPattern_5 = null;

        EObject this_ExistsPattern_6 = null;

        EObject this_NotExistsPattern_7 = null;

        EObject this_MinusPattern_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3744:6: ( (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3745:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3745:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )
            int alt69=9;
            switch ( input.LA(1) ) {
            case KEYWORD_22:
            case KEYWORD_26:
            case KEYWORD_14:
            case RULE_IRI_TERMINAL:
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
                {
                alt69=1;
                }
                break;
            case KEYWORD_16:
                {
                alt69=2;
                }
                break;
            case KEYWORD_78:
                {
                alt69=3;
                }
                break;
            case KEYWORD_49:
                {
                alt69=4;
                }
                break;
            case KEYWORD_72:
                {
                alt69=5;
                }
                break;
            case KEYWORD_63:
                {
                switch ( input.LA(2) ) {
                case KEYWORD_33:
                    {
                    alt69=8;
                    }
                    break;
                case KEYWORD_62:
                    {
                    alt69=7;
                    }
                    break;
                case KEYWORD_1:
                    {
                    alt69=6;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3745:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )", 69, 6, input);

                    throw nvae;
                }

                }
                break;
            case KEYWORD_52:
                {
                alt69=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3745:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3746:2: this_TriplesSameSubject_0= ruleTriplesSameSubject
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getTriplesSameSubjectParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTriplesSameSubject_in_ruleGraphPattern6234);
                    this_TriplesSameSubject_0=ruleTriplesSameSubject();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_TriplesSameSubject_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3759:2: this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getGroupOrUnionGraphPatternParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroupOrUnionGraphPattern_in_ruleGraphPattern6264);
                    this_GroupOrUnionGraphPattern_1=ruleGroupOrUnionGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GroupOrUnionGraphPattern_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3772:2: this_OptionalGraphPattern_2= ruleOptionalGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getOptionalGraphPatternParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOptionalGraphPattern_in_ruleGraphPattern6294);
                    this_OptionalGraphPattern_2=ruleOptionalGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_OptionalGraphPattern_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3785:2: this_GraphGraphPattern_3= ruleGraphGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getGraphGraphPatternParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGraphGraphPattern_in_ruleGraphPattern6324);
                    this_GraphGraphPattern_3=ruleGraphGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GraphGraphPattern_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3798:2: this_ServiceGraphPattern_4= ruleServiceGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getServiceGraphPatternParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleServiceGraphPattern_in_ruleGraphPattern6354);
                    this_ServiceGraphPattern_4=ruleServiceGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ServiceGraphPattern_4;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3811:2: this_FilterPattern_5= ruleFilterPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getFilterPatternParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleGraphPattern6384);
                    this_FilterPattern_5=ruleFilterPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_FilterPattern_5;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3824:2: this_ExistsPattern_6= ruleExistsPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getExistsPatternParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsPattern_in_ruleGraphPattern6414);
                    this_ExistsPattern_6=ruleExistsPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ExistsPattern_6;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3837:2: this_NotExistsPattern_7= ruleNotExistsPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getNotExistsPatternParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExistsPattern_in_ruleGraphPattern6444);
                    this_NotExistsPattern_7=ruleNotExistsPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NotExistsPattern_7;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3850:2: this_MinusPattern_8= ruleMinusPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getMinusPatternParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinusPattern_in_ruleGraphPattern6474);
                    this_MinusPattern_8=ruleMinusPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_MinusPattern_8;
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
    // $ANTLR end ruleGraphPattern


    // $ANTLR start entryRuleTriplesSameSubject
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3869:1: entryRuleTriplesSameSubject returns [EObject current=null] : iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF ;
    public final EObject entryRuleTriplesSameSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriplesSameSubject = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3870:2: (iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3871:2: iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTriplesSameSubjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTriplesSameSubject_in_entryRuleTriplesSameSubject6508);
            iv_ruleTriplesSameSubject=ruleTriplesSameSubject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTriplesSameSubject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriplesSameSubject6518); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTriplesSameSubject


    // $ANTLR start ruleTriplesSameSubject
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3878:1: ruleTriplesSameSubject returns [EObject current=null] : ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* ) ;
    public final EObject ruleTriplesSameSubject() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_0_0 = null;

        EObject lv_propertyList_1_0 = null;

        EObject lv_propertyList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3883:6: ( ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3884:1: ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3884:1: ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3884:2: ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )*
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3884:2: ( (lv_subject_0_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3885:1: (lv_subject_0_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3885:1: (lv_subject_0_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3886:3: lv_subject_0_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getSubjectGraphNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleTriplesSameSubject6564);
            lv_subject_0_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTriplesSameSubjectRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"subject",
              	        		lv_subject_0_0, 
              	        		"GraphNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3908:2: ( (lv_propertyList_1_0= rulePropertyList ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3909:1: (lv_propertyList_1_0= rulePropertyList )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3909:1: (lv_propertyList_1_0= rulePropertyList )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3910:3: lv_propertyList_1_0= rulePropertyList
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getPropertyListPropertyListParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6585);
            lv_propertyList_1_0=rulePropertyList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTriplesSameSubjectRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"propertyList",
              	        		lv_propertyList_1_0, 
              	        		"PropertyList", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3932:2: ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==KEYWORD_10) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3933:2: KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) )
            	    {
            	    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleTriplesSameSubject6597); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTriplesSameSubjectAccess().getSemicolonKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3937:1: ( (lv_propertyList_3_0= rulePropertyList ) )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3938:1: (lv_propertyList_3_0= rulePropertyList )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3938:1: (lv_propertyList_3_0= rulePropertyList )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3939:3: lv_propertyList_3_0= rulePropertyList
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getPropertyListPropertyListParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6618);
            	    lv_propertyList_3_0=rulePropertyList();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTriplesSameSubjectRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"propertyList",
            	      	        		lv_propertyList_3_0, 
            	      	        		"PropertyList", 
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
            	    break loop70;
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
    // $ANTLR end ruleTriplesSameSubject


    // $ANTLR start entryRuleGroupOrUnionGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3969:1: entryRuleGroupOrUnionGraphPattern returns [EObject current=null] : iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF ;
    public final EObject entryRuleGroupOrUnionGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupOrUnionGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3970:2: (iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3971:2: iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupOrUnionGraphPattern_in_entryRuleGroupOrUnionGraphPattern6655);
            iv_ruleGroupOrUnionGraphPattern=ruleGroupOrUnionGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupOrUnionGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupOrUnionGraphPattern6665); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupOrUnionGraphPattern


    // $ANTLR start ruleGroupOrUnionGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3978:1: ruleGroupOrUnionGraphPattern returns [EObject current=null] : ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? ) ;
    public final EObject ruleGroupOrUnionGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPatterns_0_0 = null;

        EObject lv_graphPatterns_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3983:6: ( ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3984:1: ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3984:1: ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3984:2: ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3984:2: ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3985:1: (lv_graphPatterns_0_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3985:1: (lv_graphPatterns_0_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3986:3: lv_graphPatterns_0_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsGroupGraphPatternParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6711);
            lv_graphPatterns_0_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGroupOrUnionGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"graphPatterns",
              	        		lv_graphPatterns_0_0, 
              	        		"GroupGraphPattern", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4008:2: ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_55) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4009:2: KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) )
                    {
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleGroupOrUnionGraphPattern6723); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getUNIONKeyword_1_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4013:1: ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4014:1: (lv_graphPatterns_2_0= ruleGroupGraphPattern )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4014:1: (lv_graphPatterns_2_0= ruleGroupGraphPattern )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4015:3: lv_graphPatterns_2_0= ruleGroupGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsGroupGraphPatternParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6744);
                    lv_graphPatterns_2_0=ruleGroupGraphPattern();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getGroupOrUnionGraphPatternRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"graphPatterns",
                      	        		lv_graphPatterns_2_0, 
                      	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleGroupOrUnionGraphPattern


    // $ANTLR start entryRuleOptionalGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4045:1: entryRuleOptionalGraphPattern returns [EObject current=null] : iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF ;
    public final EObject entryRuleOptionalGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4046:2: (iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4047:2: iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOptionalGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOptionalGraphPattern_in_entryRuleOptionalGraphPattern6781);
            iv_ruleOptionalGraphPattern=ruleOptionalGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOptionalGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalGraphPattern6791); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOptionalGraphPattern


    // $ANTLR start ruleOptionalGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4054:1: ruleOptionalGraphPattern returns [EObject current=null] : ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleOptionalGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4059:6: ( ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4060:1: ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4060:1: ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4061:2: KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleOptionalGraphPattern6827); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOptionalGraphPatternAccess().getOPTIONALKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4065:1: ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4066:1: (lv_graphPattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4066:1: (lv_graphPattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4067:3: lv_graphPattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOptionalGraphPatternAccess().getGraphPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleOptionalGraphPattern6848);
            lv_graphPattern_1_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOptionalGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"graphPattern",
              	        		lv_graphPattern_1_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleOptionalGraphPattern


    // $ANTLR start entryRulePropertyList
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4097:1: entryRulePropertyList returns [EObject current=null] : iv_rulePropertyList= rulePropertyList EOF ;
    public final EObject entryRulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyList = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4098:2: (iv_rulePropertyList= rulePropertyList EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4099:2: iv_rulePropertyList= rulePropertyList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyListRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyList_in_entryRulePropertyList6883);
            iv_rulePropertyList=rulePropertyList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyList6893); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyList


    // $ANTLR start rulePropertyList
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4106:1: rulePropertyList returns [EObject current=null] : ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) ) ;
    public final EObject rulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        EObject lv_object_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4111:6: ( ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4112:1: ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4112:1: ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4112:2: ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4112:2: ( (lv_property_0_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4113:1: (lv_property_0_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4113:1: (lv_property_0_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4114:3: lv_property_0_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyListAccess().getPropertyGraphNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_rulePropertyList6939);
            lv_property_0_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"property",
              	        		lv_property_0_0, 
              	        		"GraphNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4136:2: ( (lv_object_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4137:1: (lv_object_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4137:1: (lv_object_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4138:3: lv_object_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyListAccess().getObjectGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_rulePropertyList6960);
            lv_object_1_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"object",
              	        		lv_object_1_0, 
              	        		"GraphNode", 
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
    // $ANTLR end rulePropertyList


    // $ANTLR start entryRuleGraphGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4168:1: entryRuleGraphGraphPattern returns [EObject current=null] : iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF ;
    public final EObject entryRuleGraphGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4169:2: (iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4170:2: iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphGraphPattern_in_entryRuleGraphGraphPattern6995);
            iv_ruleGraphGraphPattern=ruleGraphGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphGraphPattern7005); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGraphGraphPattern


    // $ANTLR start ruleGraphGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4177:1: ruleGraphGraphPattern returns [EObject current=null] : ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleGraphGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_var_1_0 = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4182:6: ( ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4183:1: ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4183:1: ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4184:2: KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleGraphGraphPattern7041); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphGraphPatternAccess().getGRAPHKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4188:1: ( (lv_var_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4189:1: (lv_var_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4189:1: (lv_var_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4190:3: lv_var_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGraphGraphPatternAccess().getVarGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleGraphGraphPattern7062);
            lv_var_1_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGraphGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"var",
              	        		lv_var_1_0, 
              	        		"GraphNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4212:2: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4213:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4213:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4214:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGraphGraphPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGraphGraphPattern7083);
            lv_pattern_2_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGraphGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_2_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleGraphGraphPattern


    // $ANTLR start entryRuleServiceGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4244:1: entryRuleServiceGraphPattern returns [EObject current=null] : iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF ;
    public final EObject entryRuleServiceGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4245:2: (iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4246:2: iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getServiceGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleServiceGraphPattern_in_entryRuleServiceGraphPattern7118);
            iv_ruleServiceGraphPattern=ruleServiceGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleServiceGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceGraphPattern7128); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServiceGraphPattern


    // $ANTLR start ruleServiceGraphPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4253:1: ruleServiceGraphPattern returns [EObject current=null] : ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleServiceGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_var_1_0 = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4258:6: ( ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4259:1: ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4259:1: ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4260:2: KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleServiceGraphPattern7164); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceGraphPatternAccess().getSERVICEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4264:1: ( (lv_var_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4265:1: (lv_var_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4265:1: (lv_var_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4266:3: lv_var_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceGraphPatternAccess().getVarGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleServiceGraphPattern7185);
            lv_var_1_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getServiceGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"var",
              	        		lv_var_1_0, 
              	        		"GraphNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4288:2: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4289:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4289:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4290:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceGraphPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleServiceGraphPattern7206);
            lv_pattern_2_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getServiceGraphPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_2_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleServiceGraphPattern


    // $ANTLR start entryRuleFilterPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4320:1: entryRuleFilterPattern returns [EObject current=null] : iv_ruleFilterPattern= ruleFilterPattern EOF ;
    public final EObject entryRuleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4321:2: (iv_ruleFilterPattern= ruleFilterPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4322:2: iv_ruleFilterPattern= ruleFilterPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFilterPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern7241);
            iv_ruleFilterPattern=ruleFilterPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFilterPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern7251); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFilterPattern


    // $ANTLR start ruleFilterPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4329:1: ruleFilterPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4334:6: ( ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4335:1: ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4335:1: ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4336:2: KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleFilterPattern7287); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFilterPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFilterPattern7298); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFilterPatternAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4345:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4346:1: (lv_expression_2_0= ruleExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4346:1: (lv_expression_2_0= ruleExpression )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4347:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFilterPatternAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFilterPattern7319);
            lv_expression_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFilterPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFilterPattern7330); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFilterPatternAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleFilterPattern


    // $ANTLR start entryRuleExistsPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4382:1: entryRuleExistsPattern returns [EObject current=null] : iv_ruleExistsPattern= ruleExistsPattern EOF ;
    public final EObject entryRuleExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4383:2: (iv_ruleExistsPattern= ruleExistsPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4384:2: iv_ruleExistsPattern= ruleExistsPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExistsPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExistsPattern_in_entryRuleExistsPattern7365);
            iv_ruleExistsPattern=ruleExistsPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExistsPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsPattern7375); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExistsPattern


    // $ANTLR start ruleExistsPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4391:1: ruleExistsPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4396:6: ( ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4397:1: ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4397:1: ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4398:2: KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleExistsPattern7411); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExistsPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleExistsPattern7422); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExistsPatternAccess().getEXISTSKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4407:1: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4408:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4408:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4409:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExistsPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleExistsPattern7443);
            lv_pattern_2_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExistsPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_2_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleExistsPattern


    // $ANTLR start entryRuleNotExistsPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4439:1: entryRuleNotExistsPattern returns [EObject current=null] : iv_ruleNotExistsPattern= ruleNotExistsPattern EOF ;
    public final EObject entryRuleNotExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExistsPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4440:2: (iv_ruleNotExistsPattern= ruleNotExistsPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4441:2: iv_ruleNotExistsPattern= ruleNotExistsPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExistsPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExistsPattern_in_entryRuleNotExistsPattern7478);
            iv_ruleNotExistsPattern=ruleNotExistsPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExistsPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExistsPattern7488); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotExistsPattern


    // $ANTLR start ruleNotExistsPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4448:1: ruleNotExistsPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleNotExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4453:6: ( ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4454:1: ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4454:1: ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4455:2: KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleNotExistsPattern7524); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleNotExistsPattern7535); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getNOTKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleNotExistsPattern7546); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getEXISTSKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4469:1: ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4470:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4470:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4471:3: lv_pattern_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotExistsPatternAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleNotExistsPattern7567);
            lv_pattern_3_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNotExistsPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_3_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleNotExistsPattern


    // $ANTLR start entryRuleMinusPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4501:1: entryRuleMinusPattern returns [EObject current=null] : iv_ruleMinusPattern= ruleMinusPattern EOF ;
    public final EObject entryRuleMinusPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4502:2: (iv_ruleMinusPattern= ruleMinusPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4503:2: iv_ruleMinusPattern= ruleMinusPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMinusPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMinusPattern_in_entryRuleMinusPattern7602);
            iv_ruleMinusPattern=ruleMinusPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMinusPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinusPattern7612); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMinusPattern


    // $ANTLR start ruleMinusPattern
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4510:1: ruleMinusPattern returns [EObject current=null] : ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleMinusPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4515:6: ( ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4516:1: ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4516:1: ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4517:2: KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleMinusPattern7648); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMinusPatternAccess().getMINUSKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4521:1: ( (lv_pattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4522:1: (lv_pattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4522:1: (lv_pattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4523:3: lv_pattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMinusPatternAccess().getPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleMinusPattern7669);
            lv_pattern_1_0=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMinusPatternRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pattern",
              	        		lv_pattern_1_0, 
              	        		"GroupGraphPattern", 
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
    // $ANTLR end ruleMinusPattern


    // $ANTLR start entryRuleExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4553:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4554:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4555:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7704);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7714); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4562:1: ruleExpression returns [EObject current=null] : (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndFilterExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4567:6: ( (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4568:1: (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4568:1: (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4569:2: this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAndFilterExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndFilterExpression_in_ruleExpression7764);
            this_AndFilterExpression_0=ruleAndFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_AndFilterExpression_0;
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4580:1: ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KEYWORD_27) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4580:2: () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4580:2: ()
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4581:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getExpressionAccess().getOrFilterExpressionEntriesAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "entries", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getOrFilterExpressionEntriesAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4599:2: ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==KEYWORD_27) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4600:2: KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) )
                    	    {
                    	    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleExpression7788); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getExpressionAccess().getVerticalLineVerticalLineKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4604:1: ( (lv_entries_3_0= ruleAndFilterExpression ) )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4605:1: (lv_entries_3_0= ruleAndFilterExpression )
                    	    {
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4605:1: (lv_entries_3_0= ruleAndFilterExpression )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4606:3: lv_entries_3_0= ruleAndFilterExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getEntriesAndFilterExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndFilterExpression_in_ruleExpression7809);
                    	    lv_entries_3_0=ruleAndFilterExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"entries",
                    	      	        		lv_entries_3_0, 
                    	      	        		"AndFilterExpression", 
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
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleAndFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4636:1: entryRuleAndFilterExpression returns [EObject current=null] : iv_ruleAndFilterExpression= ruleAndFilterExpression EOF ;
    public final EObject entryRuleAndFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4637:2: (iv_ruleAndFilterExpression= ruleAndFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4638:2: iv_ruleAndFilterExpression= ruleAndFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndFilterExpression_in_entryRuleAndFilterExpression7848);
            iv_ruleAndFilterExpression=ruleAndFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndFilterExpression7858); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAndFilterExpression


    // $ANTLR start ruleAndFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4645:1: ruleAndFilterExpression returns [EObject current=null] : (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? ) ;
    public final EObject ruleAndFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteFilterExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4650:6: ( (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4651:1: (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4651:1: (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4652:2: this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndFilterExpressionAccess().getConcreteFilterExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7908);
            this_ConcreteFilterExpression_0=ruleConcreteFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_ConcreteFilterExpression_0;
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4663:1: ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==KEYWORD_19) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4663:2: () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4663:2: ()
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4664:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAndFilterExpressionAccess().getAndFilterExpressionEntriesAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "entries", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAndFilterExpressionAccess().getAndFilterExpressionEntriesAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4682:2: ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==KEYWORD_19) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4683:2: KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) )
                    	    {
                    	    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAndFilterExpression7932); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAndFilterExpressionAccess().getAmpersandAmpersandKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4687:1: ( (lv_entries_3_0= ruleConcreteFilterExpression ) )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4688:1: (lv_entries_3_0= ruleConcreteFilterExpression )
                    	    {
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4688:1: (lv_entries_3_0= ruleConcreteFilterExpression )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4689:3: lv_entries_3_0= ruleConcreteFilterExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAndFilterExpressionAccess().getEntriesConcreteFilterExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7953);
                    	    lv_entries_3_0=ruleConcreteFilterExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAndFilterExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"entries",
                    	      	        		lv_entries_3_0, 
                    	      	        		"ConcreteFilterExpression", 
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
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
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
    // $ANTLR end ruleAndFilterExpression


    // $ANTLR start entryRuleConcreteFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4719:1: entryRuleConcreteFilterExpression returns [EObject current=null] : iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF ;
    public final EObject entryRuleConcreteFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4720:2: (iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4721:2: iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConcreteFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConcreteFilterExpression_in_entryRuleConcreteFilterExpression7992);
            iv_ruleConcreteFilterExpression=ruleConcreteFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConcreteFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteFilterExpression8002); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConcreteFilterExpression


    // $ANTLR start ruleConcreteFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4728:1: ruleConcreteFilterExpression returns [EObject current=null] : (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression ) ;
    public final EObject ruleConcreteFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParFilterExpression_0 = null;

        EObject this_ExpressionFilterExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4733:6: ( (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4734:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4734:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==KEYWORD_1) ) {
                alt76=1;
            }
            else if ( (LA76_0==KEYWORD_22||LA76_0==KEYWORD_26||LA76_0==KEYWORD_14||(LA76_0>=RULE_IRI_TERMINAL && LA76_0<=RULE_INT)) ) {
                alt76=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4734:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4735:2: this_ParFilterExpression_0= ruleParFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteFilterExpressionAccess().getParFilterExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParFilterExpression_in_ruleConcreteFilterExpression8052);
                    this_ParFilterExpression_0=ruleParFilterExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ParFilterExpression_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4748:2: this_ExpressionFilterExpression_1= ruleExpressionFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteFilterExpressionAccess().getExpressionFilterExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionFilterExpression_in_ruleConcreteFilterExpression8082);
                    this_ExpressionFilterExpression_1=ruleExpressionFilterExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_ExpressionFilterExpression_1;
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
    // $ANTLR end ruleConcreteFilterExpression


    // $ANTLR start entryRuleParFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4767:1: entryRuleParFilterExpression returns [EObject current=null] : iv_ruleParFilterExpression= ruleParFilterExpression EOF ;
    public final EObject entryRuleParFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4768:2: (iv_ruleParFilterExpression= ruleParFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4769:2: iv_ruleParFilterExpression= ruleParFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParFilterExpression_in_entryRuleParFilterExpression8116);
            iv_ruleParFilterExpression=ruleParFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParFilterExpression8126); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParFilterExpression


    // $ANTLR start ruleParFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4776:1: ruleParFilterExpression returns [EObject current=null] : ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 ) ;
    public final EObject ruleParFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4781:6: ( ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4782:1: ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4782:1: ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4783:2: KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParFilterExpression8162); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParFilterExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParFilterExpressionAccess().getExpressionParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParFilterExpression8187);
            this_Expression_1=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

                      current = this_Expression_1;
                      currentNode = currentNode.getParent();
                  
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParFilterExpression8197); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParFilterExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
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
    // $ANTLR end ruleParFilterExpression


    // $ANTLR start entryRuleExpressionFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4812:1: entryRuleExpressionFilterExpression returns [EObject current=null] : iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF ;
    public final EObject entryRuleExpressionFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4813:2: (iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4814:2: iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpressionFilterExpression_in_entryRuleExpressionFilterExpression8232);
            iv_ruleExpressionFilterExpression=ruleExpressionFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpressionFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFilterExpression8242); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionFilterExpression


    // $ANTLR start ruleExpressionFilterExpression
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4821:1: ruleExpressionFilterExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) ) ;
    public final EObject ruleExpressionFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4826:6: ( ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4827:1: ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4827:1: ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4827:2: ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4827:2: ( (lv_left_0_0= ruleFilterNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4828:1: (lv_left_0_0= ruleFilterNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4828:1: (lv_left_0_0= ruleFilterNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4829:3: lv_left_0_0= ruleFilterNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getLeftFilterNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8288);
            lv_left_0_0=ruleFilterNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionFilterExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"left",
              	        		lv_left_0_0, 
              	        		"FilterNode", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4851:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4852:1: (lv_operator_1_0= ruleOperator )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4852:1: (lv_operator_1_0= ruleOperator )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4853:3: lv_operator_1_0= ruleOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getOperatorOperatorEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleExpressionFilterExpression8309);
            lv_operator_1_0=ruleOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionFilterExpressionRule().getType().getClassifier());
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4875:2: ( (lv_right_2_0= ruleFilterNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4876:1: (lv_right_2_0= ruleFilterNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4876:1: (lv_right_2_0= ruleFilterNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4877:3: lv_right_2_0= ruleFilterNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getRightFilterNodeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8330);
            lv_right_2_0=ruleFilterNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionFilterExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"right",
              	        		lv_right_2_0, 
              	        		"FilterNode", 
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
    // $ANTLR end ruleExpressionFilterExpression


    // $ANTLR start entryRuleFilterNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4907:1: entryRuleFilterNode returns [EObject current=null] : iv_ruleFilterNode= ruleFilterNode EOF ;
    public final EObject entryRuleFilterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterNode = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4908:2: (iv_ruleFilterNode= ruleFilterNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4909:2: iv_ruleFilterNode= ruleFilterNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFilterNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFilterNode_in_entryRuleFilterNode8365);
            iv_ruleFilterNode=ruleFilterNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFilterNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterNode8375); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFilterNode


    // $ANTLR start ruleFilterNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4916:1: ruleFilterNode returns [EObject current=null] : (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction ) ;
    public final EObject ruleFilterNode() throws RecognitionException {
        EObject current = null;

        EObject this_GraphNode_0 = null;

        EObject this_Function_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4921:6: ( (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KEYWORD_22||LA77_0==KEYWORD_26||LA77_0==KEYWORD_14||(LA77_0>=RULE_IRI_TERMINAL && LA77_0<=RULE_STRING)||LA77_0==RULE_INT) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID) ) {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==KEYWORD_9) ) {
                    int LA77_3 = input.LA(3);

                    if ( (LA77_3==RULE_ID) ) {
                        int LA77_5 = input.LA(4);

                        if ( (LA77_5==KEYWORD_1) ) {
                            alt77=2;
                        }
                        else if ( (LA77_5==EOF||(LA77_5>=KEYWORD_18 && LA77_5<=KEYWORD_21)||LA77_5==KEYWORD_27||(LA77_5>=KEYWORD_2 && LA77_5<=KEYWORD_6)||LA77_5==KEYWORD_8||(LA77_5>=KEYWORD_11 && LA77_5<=KEYWORD_13)) ) {
                            alt77=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA77_2==KEYWORD_1) ) {
                    alt77=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4922:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4923:2: this_GraphNode_0= ruleGraphNode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFilterNodeAccess().getGraphNodeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGraphNode_in_ruleFilterNode8425);
                    this_GraphNode_0=ruleGraphNode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_GraphNode_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4936:2: this_Function_1= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFilterNodeAccess().getFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleFilterNode8455);
                    this_Function_1=ruleFunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Function_1;
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
    // $ANTLR end ruleFilterNode


    // $ANTLR start entryRuleFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4955:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4956:2: (iv_ruleFunction= ruleFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4957:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction8489);
            iv_ruleFunction=ruleFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction8499); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4964:1: ruleFunction returns [EObject current=null] : (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFunction_0 = null;

        EObject this_SparqlFunction_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4969:6: ( (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4970:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4970:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==KEYWORD_9) ) {
                    alt78=1;
                }
                else if ( (LA78_1==KEYWORD_1) ) {
                    alt78=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4970:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4970:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4971:2: this_NamedFunction_0= ruleNamedFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNamedFunctionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedFunction_in_ruleFunction8549);
                    this_NamedFunction_0=ruleNamedFunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NamedFunction_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4984:2: this_SparqlFunction_1= ruleSparqlFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getSparqlFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSparqlFunction_in_ruleFunction8579);
                    this_SparqlFunction_1=ruleSparqlFunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_SparqlFunction_1;
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
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleNamedFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5003:1: entryRuleNamedFunction returns [EObject current=null] : iv_ruleNamedFunction= ruleNamedFunction EOF ;
    public final EObject entryRuleNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5007:2: (iv_ruleNamedFunction= ruleNamedFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5008:2: iv_ruleNamedFunction= ruleNamedFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedFunction_in_entryRuleNamedFunction8619);
            iv_ruleNamedFunction=ruleNamedFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFunction8629); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleNamedFunction


    // $ANTLR start ruleNamedFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5018:1: ruleNamedFunction returns [EObject current=null] : ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 ) ;
    public final EObject ruleNamedFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5024:6: ( ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5025:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5025:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5025:2: ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5025:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5026:1: ( RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5026:1: ( RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5027:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getNamedFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedFunction8680); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getNamedFunctionAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
              	
            }

            }


            }

            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNamedFunction8691); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedFunctionAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5047:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5048:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5048:1: (lv_name_2_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5049:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedFunction8708); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNamedFunctionAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNamedFunction8724); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedFunctionAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5076:1: ( (lv_parameters_4_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5077:1: (lv_parameters_4_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5077:1: (lv_parameters_4_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5078:3: lv_parameters_4_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNamedFunctionAccess().getParametersVariableParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNamedFunction8745);
            lv_parameters_4_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"parameters",
              	        		lv_parameters_4_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5100:2: ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KEYWORD_5) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5101:2: KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) )
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNamedFunction8757); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNamedFunctionAccess().getCommaKeyword_5_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5105:1: ( (lv_parameters_6_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5106:1: (lv_parameters_6_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5106:1: (lv_parameters_6_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5107:3: lv_parameters_6_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNamedFunctionAccess().getParametersVariableParserRuleCall_5_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleNamedFunction8778);
                    lv_parameters_6_0=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNamedFunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameters",
                      	        		lv_parameters_6_0, 
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

            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNamedFunction8791); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedFunctionAccess().getRightParenthesisKeyword_6(), null); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleNamedFunction


    // $ANTLR start entryRuleSparqlFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5145:1: entryRuleSparqlFunction returns [EObject current=null] : iv_ruleSparqlFunction= ruleSparqlFunction EOF ;
    public final EObject entryRuleSparqlFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlFunction = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5146:2: (iv_ruleSparqlFunction= ruleSparqlFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5147:2: iv_ruleSparqlFunction= ruleSparqlFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSparqlFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSparqlFunction_in_entryRuleSparqlFunction8830);
            iv_ruleSparqlFunction=ruleSparqlFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSparqlFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlFunction8840); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSparqlFunction


    // $ANTLR start ruleSparqlFunction
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5154:1: ruleSparqlFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 ) ;
    public final EObject ruleSparqlFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5159:6: ( ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5160:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5160:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5160:2: ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5160:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5161:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5161:1: (lv_name_0_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5162:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSparqlFunction8882); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSparqlFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSparqlFunctionRule().getType().getClassifier());
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

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSparqlFunction8898); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSparqlFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5189:1: ( (lv_parameters_2_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5190:1: (lv_parameters_2_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5190:1: (lv_parameters_2_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5191:3: lv_parameters_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSparqlFunctionAccess().getParametersVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleSparqlFunction8919);
            lv_parameters_2_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSparqlFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"parameters",
              	        		lv_parameters_2_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5213:2: ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KEYWORD_5) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5214:2: KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) )
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSparqlFunction8931); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSparqlFunctionAccess().getCommaKeyword_3_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5218:1: ( (lv_parameters_4_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5219:1: (lv_parameters_4_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5219:1: (lv_parameters_4_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5220:3: lv_parameters_4_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSparqlFunctionAccess().getParametersVariableParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleSparqlFunction8952);
                    lv_parameters_4_0=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSparqlFunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameters",
                      	        		lv_parameters_4_0, 
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

            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSparqlFunction8965); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSparqlFunctionAccess().getRightParenthesisKeyword_4(), null); 
                  
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
    // $ANTLR end ruleSparqlFunction


    // $ANTLR start entryRuleBuiltInCall
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5255:1: entryRuleBuiltInCall returns [EObject current=null] : iv_ruleBuiltInCall= ruleBuiltInCall EOF ;
    public final EObject entryRuleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInCall = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5256:2: (iv_ruleBuiltInCall= ruleBuiltInCall EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5257:2: iv_ruleBuiltInCall= ruleBuiltInCall EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBuiltInCallRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall9000);
            iv_ruleBuiltInCall=ruleBuiltInCall();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBuiltInCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInCall9010); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBuiltInCall


    // $ANTLR start ruleBuiltInCall
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5264:1: ruleBuiltInCall returns [EObject current=null] : ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) ) ;
    public final EObject ruleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_left_10_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_expr_16_0 = null;

        EObject lv_var_20_0 = null;

        EObject lv_expr_24_0 = null;

        EObject lv_expr_28_0 = null;

        EObject lv_expr_32_0 = null;

        EObject lv_ifExpr_36_0 = null;

        EObject lv_thenExpr_38_0 = null;

        EObject lv_elseExpr_40_0 = null;

        EObject lv_left_44_0 = null;

        EObject lv_right_46_0 = null;

        EObject lv_left_50_0 = null;

        EObject lv_right_52_0 = null;

        EObject lv_left_56_0 = null;

        EObject lv_right_58_0 = null;

        EObject lv_expr_62_0 = null;

        EObject lv_expr_66_0 = null;

        EObject lv_expr_70_0 = null;

        EObject lv_expr_74_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5269:6: ( ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5270:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5270:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )
            int alt81=16;
            switch ( input.LA(1) ) {
            case KEYWORD_34:
                {
                alt81=1;
                }
                break;
            case KEYWORD_42:
                {
                alt81=2;
                }
                break;
            case KEYWORD_83:
                {
                alt81=3;
                }
                break;
            case KEYWORD_75:
                {
                alt81=4;
                }
                break;
            case KEYWORD_46:
                {
                alt81=5;
                }
                break;
            case KEYWORD_30:
                {
                alt81=6;
                }
                break;
            case KEYWORD_36:
                {
                alt81=7;
                }
                break;
            case KEYWORD_45:
                {
                alt81=8;
                }
                break;
            case KEYWORD_24:
                {
                alt81=9;
                }
                break;
            case KEYWORD_73:
                {
                alt81=10;
                }
                break;
            case KEYWORD_54:
                {
                alt81=11;
                }
                break;
            case KEYWORD_79:
                {
                alt81=12;
                }
                break;
            case KEYWORD_58:
                {
                alt81=13;
                }
                break;
            case KEYWORD_59:
                {
                alt81=14;
                }
                break;
            case KEYWORD_74:
                {
                alt81=15;
                }
                break;
            case KEYWORD_82:
                {
                alt81=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5270:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5270:2: ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5270:2: ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5271:2: KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleBuiltInCall9047); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRKeyword_0_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9058); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_0_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5280:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5281:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5281:1: (lv_expr_2_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5282:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9079);
                    lv_expr_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_2_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_0_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5310:6: ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5310:6: ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5311:2: KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleBuiltInCall9109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLANGKeyword_1_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9120); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5320:1: ( (lv_expr_6_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5321:1: (lv_expr_6_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5321:1: (lv_expr_6_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5322:3: lv_expr_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9141);
                    lv_expr_6_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_6_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9152); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5350:6: ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5350:6: ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5351:2: KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleBuiltInCall9171); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLANGMATCHESKeyword_2_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9182); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_2_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5360:1: ( (lv_left_10_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5361:1: (lv_left_10_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5361:1: (lv_left_10_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5362:3: lv_left_10_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9203);
                    lv_left_10_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_10_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9214); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_2_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5389:1: ( (lv_right_12_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5390:1: (lv_right_12_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5390:1: (lv_right_12_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5391:3: lv_right_12_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_2_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9235);
                    lv_right_12_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_12_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9246); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_2_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5419:6: ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5419:6: ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5420:2: KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleBuiltInCall9265); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getDATATYPEKeyword_3_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9276); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_3_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5429:1: ( (lv_expr_16_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5430:1: (lv_expr_16_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5430:1: (lv_expr_16_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5431:3: lv_expr_16_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9297);
                    lv_expr_16_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_16_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9308); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_3_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5459:6: ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5459:6: ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5460:2: KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleBuiltInCall9327); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getBOUNDKeyword_4_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9338); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_4_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5469:1: ( (lv_var_20_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5470:1: (lv_var_20_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5470:1: (lv_var_20_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5471:3: lv_var_20_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getVarVariableParserRuleCall_4_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleBuiltInCall9359);
                    lv_var_20_0=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"var",
                      	        		lv_var_20_0, 
                      	        		"Variable", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9370); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_4_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5499:6: ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5499:6: ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5500:2: KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleBuiltInCall9389); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIRIKeyword_5_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9400); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_5_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5509:1: ( (lv_expr_24_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5510:1: (lv_expr_24_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5510:1: (lv_expr_24_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5511:3: lv_expr_24_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_5_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9421);
                    lv_expr_24_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_24_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9432); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_5_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5539:6: ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5539:6: ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5540:2: KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleBuiltInCall9451); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getURIKeyword_6_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9462); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_6_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5549:1: ( (lv_expr_28_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5550:1: (lv_expr_28_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5550:1: (lv_expr_28_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5551:3: lv_expr_28_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_6_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9483);
                    lv_expr_28_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_28_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9494); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_6_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5579:6: ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5579:6: ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5580:2: KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleBuiltInCall9513); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getBNODEKeyword_7_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9524); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_7_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5589:1: ( (lv_expr_32_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5590:1: (lv_expr_32_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5590:1: (lv_expr_32_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5591:3: lv_expr_32_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_7_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9545);
                    lv_expr_32_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_32_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9556); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_7_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5619:6: ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5619:6: ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5620:2: KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleBuiltInCall9575); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIFKeyword_8_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9586); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_8_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5629:1: ( (lv_ifExpr_36_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5630:1: (lv_ifExpr_36_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5630:1: (lv_ifExpr_36_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5631:3: lv_ifExpr_36_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getIfExprExpressionParserRuleCall_8_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9607);
                    lv_ifExpr_36_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ifExpr",
                      	        		lv_ifExpr_36_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9618); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_8_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5658:1: ( (lv_thenExpr_38_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5659:1: (lv_thenExpr_38_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5659:1: (lv_thenExpr_38_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5660:3: lv_thenExpr_38_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getThenExprExpressionParserRuleCall_8_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9639);
                    lv_thenExpr_38_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"thenExpr",
                      	        		lv_thenExpr_38_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9650); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_8_5(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5687:1: ( (lv_elseExpr_40_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5688:1: (lv_elseExpr_40_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5688:1: (lv_elseExpr_40_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5689:3: lv_elseExpr_40_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getElseExprExpressionParserRuleCall_8_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9671);
                    lv_elseExpr_40_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"elseExpr",
                      	        		lv_elseExpr_40_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9682); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_8_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5717:6: ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5717:6: ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5718:2: KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleBuiltInCall9701); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRLANGKeyword_9_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_9_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5727:1: ( (lv_left_44_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5728:1: (lv_left_44_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5728:1: (lv_left_44_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5729:3: lv_left_44_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_9_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9733);
                    lv_left_44_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_44_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9744); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_9_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5756:1: ( (lv_right_46_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5757:1: (lv_right_46_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5757:1: (lv_right_46_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5758:3: lv_right_46_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_9_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9765);
                    lv_right_46_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_46_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9776); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_9_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5786:6: ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5786:6: ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5787:2: KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleBuiltInCall9795); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRDTKeyword_10_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9806); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_10_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5796:1: ( (lv_left_50_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5797:1: (lv_left_50_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5797:1: (lv_left_50_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5798:3: lv_left_50_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9827);
                    lv_left_50_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_50_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9838); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_10_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5825:1: ( (lv_right_52_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5826:1: (lv_right_52_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5826:1: (lv_right_52_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5827:3: lv_right_52_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_10_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9859);
                    lv_right_52_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_52_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9870); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_10_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5855:6: ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5855:6: ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5856:2: KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleBuiltInCall9889); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSameTermKeyword_11_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9900); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_11_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5865:1: ( (lv_left_56_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5866:1: (lv_left_56_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5866:1: (lv_left_56_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5867:3: lv_left_56_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9921);
                    lv_left_56_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_56_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9932); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_11_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5894:1: ( (lv_right_58_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5895:1: (lv_right_58_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5895:1: (lv_right_58_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5896:3: lv_right_58_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_11_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9953);
                    lv_right_58_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_58_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9964); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_11_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5924:6: ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5924:6: ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5925:2: KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleBuiltInCall9983); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsIRIKeyword_12_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9994); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_12_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5934:1: ( (lv_expr_62_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5935:1: (lv_expr_62_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5935:1: (lv_expr_62_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5936:3: lv_expr_62_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_12_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10015);
                    lv_expr_62_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_62_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10026); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_12_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5964:6: ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5964:6: ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5965:2: KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleBuiltInCall10045); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsURIKeyword_13_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10056); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_13_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5974:1: ( (lv_expr_66_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5975:1: (lv_expr_66_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5975:1: (lv_expr_66_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5976:3: lv_expr_66_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_13_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10077);
                    lv_expr_66_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_66_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10088); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_13_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6004:6: ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6004:6: ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6005:2: KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleBuiltInCall10107); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsBLANKKeyword_14_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10118); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_14_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6014:1: ( (lv_expr_70_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6015:1: (lv_expr_70_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6015:1: (lv_expr_70_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6016:3: lv_expr_70_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_14_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10139);
                    lv_expr_70_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_70_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10150); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_14_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6044:6: ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6044:6: ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6045:2: KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleBuiltInCall10169); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsLITERALKeyword_15_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10180); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_15_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6054:1: ( (lv_expr_74_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6055:1: (lv_expr_74_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6055:1: (lv_expr_74_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6056:3: lv_expr_74_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_15_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10201);
                    lv_expr_74_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_74_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10212); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_15_3(), null); 
                          
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
    // $ANTLR end ruleBuiltInCall


    // $ANTLR start entryRuleExprAggArg
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6093:1: entryRuleExprAggArg returns [EObject current=null] : iv_ruleExprAggArg= ruleExprAggArg EOF ;
    public final EObject entryRuleExprAggArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAggArg = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6094:2: (iv_ruleExprAggArg= ruleExprAggArg EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6095:2: iv_ruleExprAggArg= ruleExprAggArg EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprAggArgRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExprAggArg_in_entryRuleExprAggArg10250);
            iv_ruleExprAggArg=ruleExprAggArg();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExprAggArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAggArg10260); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExprAggArg


    // $ANTLR start ruleExprAggArg
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6102:1: ruleExprAggArg returns [EObject current=null] : ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleExprAggArg() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_1_0=null;
        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6107:6: ( ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6108:1: ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6108:1: ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6109:2: KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleExprAggArg10296); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExprAggArgAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6113:1: ( (lv_isDistinct_1_0= KEYWORD_77 ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==KEYWORD_77) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6114:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6114:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6115:3: lv_isDistinct_1_0= KEYWORD_77
                    {
                    lv_isDistinct_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleExprAggArg10315); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExprAggArgAccess().getIsDistinctDISTINCTKeyword_1_0(), "isDistinct"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExprAggArgRule().getType().getClassifier());
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6135:3: ( (lv_expr_2_0= ruleExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6136:1: (lv_expr_2_0= ruleExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6136:1: (lv_expr_2_0= ruleExpression )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6137:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExprAggArgAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExprAggArg10350);
            lv_expr_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExprAggArgRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleExprAggArg10361); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExprAggArgAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleExprAggArg


    // $ANTLR start entryRuleGraphNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6172:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6173:2: (iv_ruleGraphNode= ruleGraphNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6174:2: iv_ruleGraphNode= ruleGraphNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphNode_in_entryRuleGraphNode10396);
            iv_ruleGraphNode=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphNode10406); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGraphNode


    // $ANTLR start ruleGraphNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6181:1: ruleGraphNode returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter ) ;
    public final EObject ruleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Value_1 = null;

        EObject this_IRI_2 = null;

        EObject this_BlankNode_3 = null;

        EObject this_Parameter_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6186:6: ( (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6187:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6187:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )
            int alt83=5;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
            case RULE_ID:
                {
                alt83=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt83=2;
                }
                break;
            case RULE_IRI_TERMINAL:
                {
                alt83=3;
                }
                break;
            case KEYWORD_26:
                {
                alt83=4;
                }
                break;
            case KEYWORD_22:
                {
                alt83=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6187:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6188:2: this_Variable_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getVariableParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleGraphNode10456);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6201:2: this_Value_1= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleGraphNode10486);
                    this_Value_1=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Value_1;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6214:2: this_IRI_2= ruleIRI
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getIRIParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIRI_in_ruleGraphNode10516);
                    this_IRI_2=ruleIRI();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_IRI_2;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6227:2: this_BlankNode_3= ruleBlankNode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getBlankNodeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlankNode_in_ruleGraphNode10546);
                    this_BlankNode_3=ruleBlankNode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_BlankNode_3;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6240:2: this_Parameter_4= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getParameterParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleGraphNode10576);
                    this_Parameter_4=ruleParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_Parameter_4;
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
    // $ANTLR end ruleGraphNode


    // $ANTLR start entryRuleVariable
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6259:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6260:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6261:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable10610);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable10620); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6268:1: ruleVariable returns [EObject current=null] : (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_UnNamedVariable_0 = null;

        EObject this_NamedVariable_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6273:6: ( (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6274:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6274:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KEYWORD_14) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_ID) ) {
                alt84=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6274:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6275:2: this_UnNamedVariable_0= ruleUnNamedVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getUnNamedVariableParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnNamedVariable_in_ruleVariable10670);
                    this_UnNamedVariable_0=ruleUnNamedVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_UnNamedVariable_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6288:2: this_NamedVariable_1= ruleNamedVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getNamedVariableParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedVariable_in_ruleVariable10700);
                    this_NamedVariable_1=ruleNamedVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_NamedVariable_1;
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


    // $ANTLR start entryRuleUnNamedVariable
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6307:1: entryRuleUnNamedVariable returns [EObject current=null] : iv_ruleUnNamedVariable= ruleUnNamedVariable EOF ;
    public final EObject entryRuleUnNamedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNamedVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6308:2: (iv_ruleUnNamedVariable= ruleUnNamedVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6309:2: iv_ruleUnNamedVariable= ruleUnNamedVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnNamedVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnNamedVariable_in_entryRuleUnNamedVariable10734);
            iv_ruleUnNamedVariable=ruleUnNamedVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnNamedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNamedVariable10744); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnNamedVariable


    // $ANTLR start ruleUnNamedVariable
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6316:1: ruleUnNamedVariable returns [EObject current=null] : ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnNamedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6321:6: ( ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6322:1: ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6322:1: ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6323:2: KEYWORD_14 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleUnNamedVariable10780); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnNamedVariableAccess().getQuestionMarkKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6327:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6328:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6328:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6329:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnNamedVariable10797); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getUnNamedVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnNamedVariableRule().getType().getClassifier());
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
    // $ANTLR end ruleUnNamedVariable


    // $ANTLR start entryRuleNamedVariable
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6359:1: entryRuleNamedVariable returns [EObject current=null] : iv_ruleNamedVariable= ruleNamedVariable EOF ;
    public final EObject entryRuleNamedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6360:2: (iv_ruleNamedVariable= ruleNamedVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6361:2: iv_ruleNamedVariable= ruleNamedVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedVariable_in_entryRuleNamedVariable10837);
            iv_ruleNamedVariable=ruleNamedVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedVariable10847); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNamedVariable


    // $ANTLR start ruleNamedVariable
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6368:1: ruleNamedVariable returns [EObject current=null] : ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNamedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6373:6: ( ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6374:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6374:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6374:2: ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6374:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6375:1: ( RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6375:1: ( RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6376:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getNamedVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedVariable10894); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getNamedVariableAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
              	
            }

            }


            }

            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNamedVariable10905); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedVariableAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6396:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6397:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6397:1: (lv_name_2_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6398:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedVariable10922); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNamedVariableAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
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
    // $ANTLR end ruleNamedVariable


    // $ANTLR start entryRuleBlankNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6428:1: entryRuleBlankNode returns [EObject current=null] : iv_ruleBlankNode= ruleBlankNode EOF ;
    public final EObject entryRuleBlankNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlankNode = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6432:2: (iv_ruleBlankNode= ruleBlankNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6433:2: iv_ruleBlankNode= ruleBlankNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlankNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlankNode_in_entryRuleBlankNode10968);
            iv_ruleBlankNode=ruleBlankNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlankNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankNode10978); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleBlankNode


    // $ANTLR start ruleBlankNode
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6443:1: ruleBlankNode returns [EObject current=null] : ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBlankNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6449:6: ( ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6450:1: ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6450:1: ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6451:2: KEYWORD_26 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleBlankNode11018); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlankNodeAccess().get_Keyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6455:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6456:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6456:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6457:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlankNode11035); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBlankNodeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBlankNodeRule().getType().getClassifier());
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleBlankNode


    // $ANTLR start entryRuleParameter
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6490:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6494:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6495:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter11085);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter11095); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6505:1: ruleParameter returns [EObject current=null] : ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6511:6: ( ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6512:1: ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6512:1: ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6513:2: KEYWORD_22 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleParameter11135); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParameterAccess().getQuestionMarkColonKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6517:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6518:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6518:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6519:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter11152); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleValue
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6552:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6553:2: (iv_ruleValue= ruleValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6554:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue11196);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue11206); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6561:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6566:6: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6567:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6567:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_STRING) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_INT) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6567:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6568:2: this_StringValue_0= ruleStringValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue11256);
                    this_StringValue_0=ruleStringValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_StringValue_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6581:2: this_IntegerValue_1= ruleIntegerValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValue11286);
                    this_IntegerValue_1=ruleIntegerValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_IntegerValue_1;
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


    // $ANTLR start entryRuleIRI
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6600:1: entryRuleIRI returns [EObject current=null] : iv_ruleIRI= ruleIRI EOF ;
    public final EObject entryRuleIRI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIRI = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6601:2: (iv_ruleIRI= ruleIRI EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6602:2: iv_ruleIRI= ruleIRI EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIRIRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIRI_in_entryRuleIRI11320);
            iv_ruleIRI=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIRI; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIRI11330); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIRI


    // $ANTLR start ruleIRI
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6609:1: ruleIRI returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleIRI() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6614:6: ( ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6615:1: ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6615:1: ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6615:2: () ( (lv_value_1_0= RULE_IRI_TERMINAL ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6615:2: ()
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6616:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getIRIAccess().getIRIAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getIRIAccess().getIRIAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6629:2: ( (lv_value_1_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6630:1: (lv_value_1_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6630:1: (lv_value_1_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6631:3: lv_value_1_0= RULE_IRI_TERMINAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleIRI11384); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIRIAccess().getValueIRI_TERMINALTerminalRuleCall_1_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIRIRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_1_0, 
              	        		"IRI_TERMINAL", 
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
    // $ANTLR end ruleIRI


    // $ANTLR start entryRuleStringValue
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6661:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6662:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6663:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue11424);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue11434); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6670:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6675:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6676:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6676:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6676:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6676:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6677:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6677:1: (lv_value_0_0= RULE_STRING )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6678:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue11476); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6700:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==KEYWORD_25||LA86_0==KEYWORD_15) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6701:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6701:1: (lv_tag_1_0= ruleRDFTag )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6702:3: lv_tag_1_0= ruleRDFTag
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleStringValue11502);
                    lv_tag_1_0=ruleRDFTag();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"tag",
                      	        		lv_tag_1_0, 
                      	        		"RDFTag", 
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
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleIntegerValue
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6732:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6733:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6734:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntegerValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue11538);
            iv_ruleIntegerValue=ruleIntegerValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue11548); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntegerValue


    // $ANTLR start ruleIntegerValue
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6741:1: ruleIntegerValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6746:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6747:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6747:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6747:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6747:2: ( (lv_value_0_0= RULE_INT ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6748:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6748:1: (lv_value_0_0= RULE_INT )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6749:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerValue11590); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6771:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==KEYWORD_25||LA87_0==KEYWORD_15) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6772:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6772:1: (lv_tag_1_0= ruleRDFTag )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6773:3: lv_tag_1_0= ruleRDFTag
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleIntegerValue11616);
                    lv_tag_1_0=ruleRDFTag();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"tag",
                      	        		lv_tag_1_0, 
                      	        		"RDFTag", 
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
    // $ANTLR end ruleIntegerValue


    // $ANTLR start entryRuleRDFTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6803:1: entryRuleRDFTag returns [EObject current=null] : iv_ruleRDFTag= ruleRDFTag EOF ;
    public final EObject entryRuleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDFTag = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6804:2: (iv_ruleRDFTag= ruleRDFTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6805:2: iv_ruleRDFTag= ruleRDFTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRDFTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag11652);
            iv_ruleRDFTag=ruleRDFTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRDFTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag11662); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRDFTag


    // $ANTLR start ruleRDFTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6812:1: ruleRDFTag returns [EObject current=null] : (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) ;
    public final EObject ruleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject this_TypeTag_0 = null;

        EObject this_LangTag_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6817:6: ( (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6818:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6818:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KEYWORD_25) ) {
                alt88=1;
            }
            else if ( (LA88_0==KEYWORD_15) ) {
                alt88=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6818:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6819:2: this_TypeTag_0= ruleTypeTag
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeTag_in_ruleRDFTag11712);
                    this_TypeTag_0=ruleTypeTag();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_TypeTag_0;
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6832:2: this_LangTag_1= ruleLangTag
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLangTag_in_ruleRDFTag11742);
                    this_LangTag_1=ruleLangTag();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                              current = this_LangTag_1;
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
    // $ANTLR end ruleRDFTag


    // $ANTLR start entryRuleTypeTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6851:1: entryRuleTypeTag returns [EObject current=null] : iv_ruleTypeTag= ruleTypeTag EOF ;
    public final EObject entryRuleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6855:2: (iv_ruleTypeTag= ruleTypeTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6856:2: iv_ruleTypeTag= ruleTypeTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag11782);
            iv_ruleTypeTag=ruleTypeTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag11792); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleTypeTag


    // $ANTLR start ruleTypeTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6866:1: ruleTypeTag returns [EObject current=null] : ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) ) ;
    public final EObject ruleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6872:6: ( ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6873:1: ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6873:1: ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6874:2: KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) )
            {
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleTypeTag11832); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6878:1: ( (lv_type_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6879:1: (lv_type_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6879:1: (lv_type_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6880:3: lv_type_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeTagAccess().getTypeGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleTypeTag11853);
            lv_type_1_0=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeTagRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"GraphNode", 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleTypeTag


    // $ANTLR start entryRuleLangTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6913:1: entryRuleLangTag returns [EObject current=null] : iv_ruleLangTag= ruleLangTag EOF ;
    public final EObject entryRuleLangTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6917:2: (iv_ruleLangTag= ruleLangTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6918:2: iv_ruleLangTag= ruleLangTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLangTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag11898);
            iv_ruleLangTag=ruleLangTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLangTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag11908); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleLangTag


    // $ANTLR start ruleLangTag
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6928:1: ruleLangTag returns [EObject current=null] : ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLangTag() throws RecognitionException {
        EObject current = null;

        Token lv_lang_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6934:6: ( ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6935:1: ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6935:1: ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6936:2: KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleLangTag11948); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6940:1: ( (lv_lang_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6941:1: (lv_lang_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6941:1: (lv_lang_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6942:3: lv_lang_1_0= RULE_ID
            {
            lv_lang_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangTag11965); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0(), "lang"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLangTagRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"lang",
              	        		lv_lang_1_0, 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleLangTag


    // $ANTLR start ruleOperator
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6975:1: ruleOperator returns [Enumerator current=null] : ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6979:6: ( ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6980:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6980:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )
            int alt89=10;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt89=1;
                }
                break;
            case KEYWORD_13:
                {
                alt89=2;
                }
                break;
            case KEYWORD_20:
                {
                alt89=3;
                }
                break;
            case KEYWORD_21:
                {
                alt89=4;
                }
                break;
            case KEYWORD_12:
                {
                alt89=5;
                }
                break;
            case KEYWORD_18:
                {
                alt89=6;
                }
                break;
            case KEYWORD_4:
                {
                alt89=7;
                }
                break;
            case KEYWORD_8:
                {
                alt89=8;
                }
                break;
            case KEYWORD_6:
                {
                alt89=9;
                }
                break;
            case KEYWORD_3:
                {
                alt89=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6980:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6980:2: ( KEYWORD_11 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6980:2: ( KEYWORD_11 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6980:7: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOperator12025); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6986:6: ( KEYWORD_13 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6986:6: ( KEYWORD_13 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6986:11: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOperator12042); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6992:6: ( KEYWORD_20 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6992:6: ( KEYWORD_20 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6992:11: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleOperator12059); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6998:6: ( KEYWORD_21 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6998:6: ( KEYWORD_21 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6998:11: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleOperator12076); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7004:6: ( KEYWORD_12 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7004:6: ( KEYWORD_12 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7004:11: KEYWORD_12
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleOperator12093); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7010:6: ( KEYWORD_18 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7010:6: ( KEYWORD_18 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7010:11: KEYWORD_18
                    {
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleOperator12110); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7016:6: ( KEYWORD_4 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7016:6: ( KEYWORD_4 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7016:11: KEYWORD_4
                    {
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOperator12127); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getSumEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getSumEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7022:6: ( KEYWORD_8 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7022:6: ( KEYWORD_8 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7022:11: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOperator12144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7028:6: ( KEYWORD_6 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7028:6: ( KEYWORD_6 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7028:11: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOperator12161); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7034:6: ( KEYWORD_3 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7034:6: ( KEYWORD_3 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7034:11: KEYWORD_3
                    {
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOperator12178); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getMultiplicityEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getMultiplicityEnumLiteralDeclaration_9(), null); 
                          
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

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2600:2: ( KEYWORD_65 ( ( ruleGroupGraphPattern ) ) )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2600:2: KEYWORD_65 ( ( ruleGroupGraphPattern ) )
        {
        match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_synpred654031); if (failed) return ;
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2604:1: ( ( ruleGroupGraphPattern ) )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2605:1: ( ruleGroupGraphPattern )
        {
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2605:1: ( ruleGroupGraphPattern )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2606:3: ruleGroupGraphPattern
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getInsertPatternGroupGraphPatternParserRuleCall_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleGroupGraphPattern_in_synpred654052);
        ruleGroupGraphPattern();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred65

    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\6\1\uffff\1\117\1\uffff\1\130\1\117\1\6\1\130\1\6";
    static final String DFA1_maxS =
        "\1\64\1\uffff\1\132\1\uffff\1\130\1\117\1\64\1\130\1\64";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\5\uffff";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\1\1\10\uffff\2\3\3\uffff\1\3\1\2\1\uffff\1\1\3"+
            "\uffff\1\3\14\uffff\1\1\1\uffff\1\3\3\uffff\2\3\1\1",
            "",
            "\1\4\12\uffff\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\1\3\uffff\1\1\10\uffff\2\3\3\uffff\1\3\1\2\1\uffff\1\1\3"+
            "\uffff\1\3\16\uffff\1\3\3\uffff\2\3\1\1",
            "\1\10",
            "\1\1\3\uffff\1\1\10\uffff\2\3\3\uffff\1\3\1\2\1\uffff\1\1\3"+
            "\uffff\1\3\16\uffff\1\3\3\uffff\2\3\1\1"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "93:1: (this_SelectionQuery_0= ruleSelectionQuery | this_UpdateQuery_1= ruleUpdateQuery )";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\6\1\130\1\117\4\uffff\1\6\1\130\1\117\1\6\1\130\1\6";
    static final String DFA3_maxS =
        "\1\64\1\130\1\132\4\uffff\1\64\1\130\1\117\1\64\1\130\1\64";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\6\uffff";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\3\uffff\1\6\16\uffff\1\2\1\uffff\1\4\20\uffff\1\1\7\uffff"+
            "\1\5",
            "\1\7",
            "\1\10\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\3\3\uffff\1\6\16\uffff\1\2\1\uffff\1\4\30\uffff\1\5",
            "\1\12",
            "\1\13",
            "\1\3\3\uffff\1\6\16\uffff\1\2\1\uffff\1\4\30\uffff\1\5",
            "\1\14",
            "\1\3\3\uffff\1\6\16\uffff\1\2\1\uffff\1\4\30\uffff\1\5"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "344:1: (this_ConstructQuery_0= ruleConstructQuery | this_SelectQuery_1= ruleSelectQuery | this_AskQuery_2= ruleAskQuery | this_DescribeQuery_3= ruleDescribeQuery )";
        }
    }
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\31\1\130\1\117\1\13\1\31\1\117\1\130\2\111\2\uffff\1\130\2\31";
    static final String DFA4_maxS =
        "\1\54\1\130\2\132\1\33\1\117\1\130\2\132\2\uffff\1\130\2\33";
    static final String DFA4_acceptS =
        "\11\uffff\1\2\1\1\3\uffff";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\1\3\20\uffff\1\1",
            "\1\4",
            "\1\6\12\uffff\1\5",
            "\1\7\3\uffff\1\10\71\uffff\1\12\12\uffff\1\11\5\uffff\1\11",
            "\1\2\1\uffff\1\3",
            "\1\13",
            "\1\14",
            "\1\12\12\uffff\1\11\5\uffff\1\11",
            "\1\12\12\uffff\1\11\5\uffff\1\11",
            "",
            "",
            "\1\15",
            "\1\2\1\uffff\1\3",
            "\1\2\1\uffff\1\3"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "418:1: (this_SelectAllQuery_0= ruleSelectAllQuery | this_SelectVariablesQuery_1= ruleSelectVariablesQuery )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSPARQLQuery_in_entryRuleSPARQLQuery73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPARQLQuery83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionQuery_in_ruleSPARQLQuery133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateQuery_in_ruleSPARQLQuery163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rulePrefix244 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePrefix277 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_rulePrefix331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNamedPrefix375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleUnNamedPrefix411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnNamedPrefix422 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleUnNamedPrefix439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_entryRuleBase479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBase489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleBase525 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleBase546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionQuery_in_entryRuleSelectionQuery581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionQuery591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructQuery_in_ruleSelectionQuery641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectQuery_in_ruleSelectionQuery671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAskQuery_in_ruleSelectionQuery701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribeQuery_in_ruleSelectionQuery731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectQuery_in_entryRuleSelectQuery765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectQuery775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAllQuery_in_ruleSelectQuery825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectVariablesQuery_in_ruleSelectQuery855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAllQuery_in_entryRuleSelectAllQuery889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAllQuery899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleSelectAllQuery945 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleSelectAllQuery967 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleSelectAllQuery979 = new BitSet(new long[]{0x0000000000008800L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleSelectAllQuery999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleSelectAllQuery1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectAllQuery1071 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_ruleSelectAllQuery1105 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectAllQuery1127 = new BitSet(new long[]{0x0000000C00800002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSelectAllQuery1148 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectAllQuery1170 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_ruleSelectAllQuery1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectVariablesQuery_in_entryRuleSelectVariablesQuery1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectVariablesQuery1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleSelectVariablesQuery1284 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleSelectVariablesQuery1306 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleSelectVariablesQuery1318 = new BitSet(new long[]{0x0000000000008800L,0x0000000004100000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleSelectVariablesQuery1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleSelectVariablesQuery1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSelectVariablesQuery1412 = new BitSet(new long[]{0x0000820000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSelectVariablesQuery1433 = new BitSet(new long[]{0x0000820000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_ruleSelectVariablesQuery1455 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectVariablesQuery1477 = new BitSet(new long[]{0x0000000C00800002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSelectVariablesQuery1498 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectVariablesQuery1520 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_ruleSelectVariablesQuery1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAskQuery_in_entryRuleAskQuery1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAskQuery1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleAskQuery1634 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleAskQuery1656 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleAskQuery1668 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_ruleAskQuery1689 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleAskQuery1711 = new BitSet(new long[]{0x0000000C00800002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleAskQuery1732 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleAskQuery1754 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_ruleAskQuery1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribeQuery_in_entryRuleDescribeQuery1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescribeQuery1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleDescribeQuery1868 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleDescribeQuery1890 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleDescribeQuery1902 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleDescribeQuery1923 = new BitSet(new long[]{0x0000820C00800002L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleDescribeQuery1944 = new BitSet(new long[]{0x0000820C00800002L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_ruleDescribeQuery1966 = new BitSet(new long[]{0x0000820C00800002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDescribeQuery1988 = new BitSet(new long[]{0x0000000C00800002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleDescribeQuery2010 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleDescribeQuery2032 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_ruleDescribeQuery2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructQuery_in_entryRuleConstructQuery2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructQuery2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleConstructQuery2146 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleConstructQuery2168 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleConstructQuery2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleConstructQuery2201 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_ruleConstructQuery2222 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleConstructQuery2244 = new BitSet(new long[]{0x0000000C00800002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleConstructQuery2265 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleConstructQuery2287 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_ruleConstructQuery2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateQuery_in_entryRuleUpdateQuery2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateQuery2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleUpdateQuery2413 = new BitSet(new long[]{0x000C400083180000L});
    public static final BitSet FOLLOW_ruleUpdateOperation_in_ruleUpdateQuery2435 = new BitSet(new long[]{0x000C400081180002L});
    public static final BitSet FOLLOW_ruleUpdateOperation_in_entryRuleUpdateOperation2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateOperation2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyQuery_in_ruleUpdateOperation2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateGraphQuery_in_ruleUpdateOperation2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropGraphQuery_in_ruleUpdateOperation2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadGraphQuery_in_ruleUpdateOperation2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClearGraphQuery_in_ruleUpdateOperation2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyQuery_in_entryRuleModifyQuery2685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyQuery2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertQuery_in_ruleModifyQuery2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertDataQuery_in_ruleModifyQuery2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteQuery_in_ruleModifyQuery2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteDataQuery_in_ruleModifyQuery2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteWhereQuery_in_ruleModifyQuery2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateGraphQuery_in_entryRuleCreateGraphQuery2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateGraphQuery2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleCreateGraphQuery2945 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleCreateGraphQuery2964 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleCreateGraphQuery2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleCreateGraphQuery3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropGraphQuery_in_entryRuleDropGraphQuery3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropGraphQuery3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleDropGraphQuery3092 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleDropGraphQuery3111 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleDropGraphQuery3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDropGraphQuery3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadGraphQuery_in_entryRuleLoadGraphQuery3193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadGraphQuery3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleLoadGraphQuery3239 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3256 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleLoadGraphQuery3273 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleLoadGraphQuery3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClearGraphQuery_in_entryRuleClearGraphQuery3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClearGraphQuery3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleClearGraphQuery3389 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleClearGraphQuery3400 = new BitSet(new long[]{0x0000000000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleClearGraphQuery3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleClearGraphQuery3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertQuery_in_entryRuleInsertQuery3499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertQuery3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInsertQuery3546 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3563 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleInsertQuery3581 = new BitSet(new long[]{0x0001000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleInsertQuery3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleInsertQuery3638 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleInsertQuery3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertDataQuery_in_entryRuleInsertDataQuery3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertDataQuery3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInsertDataQuery3742 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3759 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleInsertDataQuery3777 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleInsertDataQuery3788 = new BitSet(new long[]{0x0001000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleInsertDataQuery3800 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleInsertDataQuery3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteQuery_in_entryRuleDeleteQuery3880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteQuery3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleDeleteQuery3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery3944 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteQuery3962 = new BitSet(new long[]{0x0000800000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDeleteQuery3974 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery3991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4019 = new BitSet(new long[]{0x0000020001000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleDeleteQuery4031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteQuery4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteDataQuery_in_entryRuleDeleteDataQuery4111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteDataQuery4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleDeleteDataQuery4158 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4175 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteDataQuery4193 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleDeleteDataQuery4204 = new BitSet(new long[]{0x0000800000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDeleteDataQuery4216 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteDataQuery4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteWhereQuery_in_entryRuleDeleteWhereQuery4296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteWhereQuery4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleDeleteWhereQuery4343 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteWhereQuery4360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteWhereQuery4378 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleDeleteWhereQuery4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleDeleteWhereQuery4400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteWhereQuery4421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleDeleteWhereQuery4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_entryRuleDatasetClause4467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatasetClause4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultDataSet_in_ruleDatasetClause4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedDataSet_in_ruleDatasetClause4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDataSet_in_ruleDatasetClause4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultDataSet_in_entryRuleDefaultDataSet4621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultDataSet4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDefaultDataSet4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleDefaultDataSet4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedDataSet_in_entryRuleNamedDataSet4723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedDataSet4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleNamedDataSet4769 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleNamedDataSet4780 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleNamedDataSet4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDataSet_in_entryRuleServiceDataSet4836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDataSet4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleServiceDataSet4882 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleServiceDataSet4893 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleServiceDataSet4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleWhereClause4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleWhereClause5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_entryRuleGroupClause5051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupClause5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleGroupClause5097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleGroupClause5108 = new BitSet(new long[]{0x14420C4060062320L,0x0000000004100008L});
    public static final BitSet FOLLOW_ruleGroupCondition_in_ruleGroupClause5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCondition_in_entryRuleGroupCondition5164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupCondition5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleGroupCondition5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleGroupCondition5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleGroupCondition5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleHavingClause5364 = new BitSet(new long[]{0x14420C4060062320L,0x0000000004000088L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleHavingClause5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint5420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_ruleConstraint5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleConstraint5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleConstraint5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_entryRuleLimitClause5574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimitClause5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleLimitClause5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLimitClause5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_entryRuleGroupGraphPattern5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupGraphPattern5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelectQuery_in_ruleGroupGraphPattern5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPatternSub_in_ruleGroupGraphPattern5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelectQuery_in_entryRuleSubSelectQuery5801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelectQuery5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSubSelectQuery5847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleSubSelectQuery5858 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSubSelectQuery5879 = new BitSet(new long[]{0x0000020000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSubSelectQuery5900 = new BitSet(new long[]{0x0000020000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSubSelectQuery5922 = new BitSet(new long[]{0x0000000400800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSubSelectQuery5943 = new BitSet(new long[]{0x0000000000800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSubSelectQuery5965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleSubSelectQuery5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPatternSub_in_entryRuleGroupGraphPatternSub6012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupGraphPatternSub6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleGroupGraphPatternSub6058 = new BitSet(new long[]{0x0000001200411000L,0x000000000F500022L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6091 = new BitSet(new long[]{0x0000001200411000L,0x000000000F500022L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleGroupGraphPatternSub6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_entryRuleGraphPattern6174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphPattern6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriplesSameSubject_in_ruleGraphPattern6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupOrUnionGraphPattern_in_ruleGraphPattern6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalGraphPattern_in_ruleGraphPattern6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphGraphPattern_in_ruleGraphPattern6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceGraphPattern_in_ruleGraphPattern6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleGraphPattern6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsPattern_in_ruleGraphPattern6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExistsPattern_in_ruleGraphPattern6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinusPattern_in_ruleGraphPattern6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriplesSameSubject_in_entryRuleTriplesSameSubject6508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriplesSameSubject6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleTriplesSameSubject6564 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleTriplesSameSubject6597 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleGroupOrUnionGraphPattern_in_entryRuleGroupOrUnionGraphPattern6655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupOrUnionGraphPattern6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6711 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleGroupOrUnionGraphPattern6723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalGraphPattern_in_entryRuleOptionalGraphPattern6781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalGraphPattern6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleOptionalGraphPattern6827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleOptionalGraphPattern6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyList_in_entryRulePropertyList6883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyList6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_rulePropertyList6939 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_rulePropertyList6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphGraphPattern_in_entryRuleGraphGraphPattern6995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphGraphPattern7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleGraphGraphPattern7041 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleGraphGraphPattern7062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGraphGraphPattern7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceGraphPattern_in_entryRuleServiceGraphPattern7118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceGraphPattern7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleServiceGraphPattern7164 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleServiceGraphPattern7185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleServiceGraphPattern7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern7241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleFilterPattern7287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFilterPattern7298 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterPattern7319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFilterPattern7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsPattern_in_entryRuleExistsPattern7365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsPattern7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleExistsPattern7411 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleExistsPattern7422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleExistsPattern7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExistsPattern_in_entryRuleNotExistsPattern7478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExistsPattern7488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleNotExistsPattern7524 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleNotExistsPattern7535 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleNotExistsPattern7546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleNotExistsPattern7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinusPattern_in_entryRuleMinusPattern7602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinusPattern7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleMinusPattern7648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleMinusPattern7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_ruleExpression7764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleExpression7788 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_ruleExpression7809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_entryRuleAndFilterExpression7848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndFilterExpression7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7908 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAndFilterExpression7932 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7953 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_entryRuleConcreteFilterExpression7992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteFilterExpression8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_ruleConcreteFilterExpression8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFilterExpression_in_ruleConcreteFilterExpression8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_entryRuleParFilterExpression8116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParFilterExpression8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParFilterExpression8162 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParFilterExpression8187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParFilterExpression8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFilterExpression_in_entryRuleExpressionFilterExpression8232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFilterExpression8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8288 = new BitSet(new long[]{0xA000000000000000L,0x00000000000E5601L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpressionFilterExpression8309 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterNode_in_entryRuleFilterNode8365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterNode8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleFilterNode8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFilterNode8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction8489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedFunction_in_ruleFunction8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlFunction_in_ruleFunction8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedFunction_in_entryRuleNamedFunction8619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedFunction8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFunction8680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNamedFunction8691 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFunction8708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNamedFunction8724 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNamedFunction8745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNamedFunction8757 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNamedFunction8778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNamedFunction8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlFunction_in_entryRuleSparqlFunction8830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlFunction8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSparqlFunction8882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSparqlFunction8898 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSparqlFunction8919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSparqlFunction8931 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSparqlFunction8952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSparqlFunction8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall9000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInCall9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleBuiltInCall9047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9058 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleBuiltInCall9109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9120 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleBuiltInCall9171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9182 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9214 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleBuiltInCall9265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9276 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleBuiltInCall9327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9338 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBuiltInCall9359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleBuiltInCall9389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9400 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleBuiltInCall9451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9462 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleBuiltInCall9513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9524 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleBuiltInCall9575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9586 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9618 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9650 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleBuiltInCall9701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9712 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9744 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleBuiltInCall9795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9806 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9838 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleBuiltInCall9889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9900 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9932 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleBuiltInCall9983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9994 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleBuiltInCall10045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10056 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleBuiltInCall10107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10118 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleBuiltInCall10169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10180 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAggArg_in_entryRuleExprAggArg10250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAggArg10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleExprAggArg10296 = new BitSet(new long[]{0x0000000000000800L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleExprAggArg10315 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExprAggArg10350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleExprAggArg10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_entryRuleGraphNode10396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphNode10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleGraphNode10456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGraphNode10486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleGraphNode10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNode_in_ruleGraphNode10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGraphNode10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable10610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedVariable_in_ruleVariable10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedVariable_in_ruleVariable10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedVariable_in_entryRuleUnNamedVariable10734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNamedVariable10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleUnNamedVariable10780 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnNamedVariable10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedVariable_in_entryRuleNamedVariable10837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedVariable10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedVariable10894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNamedVariable10905 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedVariable10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNode_in_entryRuleBlankNode10968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankNode10978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleBlankNode11018 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlankNode11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter11085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter11095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleParameter11135 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue11196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValue11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRI_in_entryRuleIRI11320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIRI11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleIRI11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue11424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue11476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200010L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleStringValue11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue11538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerValue11590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200010L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleIntegerValue11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag11652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_ruleRDFTag11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_ruleRDFTag11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag11782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleTypeTag11832 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleTypeTag11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag11898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleLangTag11948 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangTag11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOperator12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOperator12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleOperator12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleOperator12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleOperator12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleOperator12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOperator12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOperator12144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOperator12161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOperator12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_synpred654031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_synpred654052 = new BitSet(new long[]{0x0000000000000002L});

}