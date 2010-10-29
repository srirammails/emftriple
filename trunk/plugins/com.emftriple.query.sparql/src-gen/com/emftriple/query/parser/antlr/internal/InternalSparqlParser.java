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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1844:1: ruleModifyQuery returns [EObject current=null] : ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) ) ;
    public final EObject ruleModifyQuery() throws RecognitionException {
        EObject current = null;

        Token lv_withGraph_1_0=null;
        Token lv_withGraph_4_0=null;
        Token lv_withGraph_7_0=null;
        Token lv_withGraph_10_0=null;
        Token lv_withGraph_13_0=null;
        EObject lv_query_2_0 = null;

        EObject lv_query_5_0 = null;

        EObject lv_query_8_0 = null;

        EObject lv_query_11_0 = null;

        EObject lv_query_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1849:6: ( ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_IRI_TERMINAL) ) {
                    int LA48_4 = input.LA(3);

                    if ( (LA48_4==KEYWORD_61) ) {
                        switch ( input.LA(4) ) {
                        case KEYWORD_57:
                            {
                            alt48=5;
                            }
                            break;
                        case KEYWORD_38:
                            {
                            alt48=4;
                            }
                            break;
                        case KEYWORD_40:
                        case KEYWORD_16:
                            {
                            alt48=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA48_4==KEYWORD_65) ) {
                        int LA48_2 = input.LA(4);

                        if ( (LA48_2==KEYWORD_38) ) {
                            alt48=2;
                        }
                        else if ( (LA48_2==KEYWORD_41||LA48_2==KEYWORD_16) ) {
                            alt48=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_65:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==KEYWORD_38) ) {
                    alt48=2;
                }
                else if ( (LA48_2==KEYWORD_41||LA48_2==KEYWORD_16) ) {
                    alt48=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_61:
                {
                switch ( input.LA(2) ) {
                case KEYWORD_57:
                    {
                    alt48=5;
                    }
                    break;
                case KEYWORD_38:
                    {
                    alt48=4;
                    }
                    break;
                case KEYWORD_40:
                case KEYWORD_16:
                    {
                    alt48=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1850:1: ( ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) ) | ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) ) )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:2: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:2: ( ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:3: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_2_0= ruleInsertQuery ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1850:3: ( KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEYWORD_44) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1851:2: KEYWORD_44 ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                            {
                            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleModifyQuery2733); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModifyQueryAccess().getWITHKeyword_0_0_0(), null); 
                                  
                            }
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1855:1: ( (lv_withGraph_1_0= RULE_IRI_TERMINAL ) )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1856:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                            {
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1856:1: (lv_withGraph_1_0= RULE_IRI_TERMINAL )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1857:3: lv_withGraph_1_0= RULE_IRI_TERMINAL
                            {
                            lv_withGraph_1_0=(Token)input.LT(1);
                            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2750); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getModifyQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_0_0_1_0(), "withGraph"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1879:4: ( (lv_query_2_0= ruleInsertQuery ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1880:1: (lv_query_2_0= ruleInsertQuery )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1880:1: (lv_query_2_0= ruleInsertQuery )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1881:3: lv_query_2_0= ruleInsertQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getQueryInsertQueryParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInsertQuery_in_ruleModifyQuery2778);
                    lv_query_2_0=ruleInsertQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"query",
                      	        		lv_query_2_0, 
                      	        		"InsertQuery", 
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
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1904:6: ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1904:6: ( ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1904:7: ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_5_0= ruleInsertDataQuery ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1904:7: ( KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==KEYWORD_44) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1905:2: KEYWORD_44 ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) )
                            {
                            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleModifyQuery2798); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModifyQueryAccess().getWITHKeyword_1_0_0(), null); 
                                  
                            }
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1909:1: ( (lv_withGraph_4_0= RULE_IRI_TERMINAL ) )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1910:1: (lv_withGraph_4_0= RULE_IRI_TERMINAL )
                            {
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1910:1: (lv_withGraph_4_0= RULE_IRI_TERMINAL )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1911:3: lv_withGraph_4_0= RULE_IRI_TERMINAL
                            {
                            lv_withGraph_4_0=(Token)input.LT(1);
                            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2815); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getModifyQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_1_0_1_0(), "withGraph"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"withGraph",
                              	        		lv_withGraph_4_0, 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1933:4: ( (lv_query_5_0= ruleInsertDataQuery ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1934:1: (lv_query_5_0= ruleInsertDataQuery )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1934:1: (lv_query_5_0= ruleInsertDataQuery )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1935:3: lv_query_5_0= ruleInsertDataQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getQueryInsertDataQueryParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInsertDataQuery_in_ruleModifyQuery2843);
                    lv_query_5_0=ruleInsertDataQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"query",
                      	        		lv_query_5_0, 
                      	        		"InsertDataQuery", 
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
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1958:6: ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1958:6: ( ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1958:7: ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_8_0= ruleDeleteQuery ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1958:7: ( KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==KEYWORD_44) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1959:2: KEYWORD_44 ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) )
                            {
                            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleModifyQuery2863); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModifyQueryAccess().getWITHKeyword_2_0_0(), null); 
                                  
                            }
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1963:1: ( (lv_withGraph_7_0= RULE_IRI_TERMINAL ) )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1964:1: (lv_withGraph_7_0= RULE_IRI_TERMINAL )
                            {
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1964:1: (lv_withGraph_7_0= RULE_IRI_TERMINAL )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1965:3: lv_withGraph_7_0= RULE_IRI_TERMINAL
                            {
                            lv_withGraph_7_0=(Token)input.LT(1);
                            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2880); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getModifyQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_2_0_1_0(), "withGraph"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"withGraph",
                              	        		lv_withGraph_7_0, 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1987:4: ( (lv_query_8_0= ruleDeleteQuery ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1988:1: (lv_query_8_0= ruleDeleteQuery )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1988:1: (lv_query_8_0= ruleDeleteQuery )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:1989:3: lv_query_8_0= ruleDeleteQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getQueryDeleteQueryParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeleteQuery_in_ruleModifyQuery2908);
                    lv_query_8_0=ruleDeleteQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"query",
                      	        		lv_query_8_0, 
                      	        		"DeleteQuery", 
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
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2012:6: ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2012:6: ( ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2012:7: ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_11_0= ruleDeleteDataQuery ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2012:7: ( KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==KEYWORD_44) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2013:2: KEYWORD_44 ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) )
                            {
                            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleModifyQuery2928); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModifyQueryAccess().getWITHKeyword_3_0_0(), null); 
                                  
                            }
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2017:1: ( (lv_withGraph_10_0= RULE_IRI_TERMINAL ) )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2018:1: (lv_withGraph_10_0= RULE_IRI_TERMINAL )
                            {
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2018:1: (lv_withGraph_10_0= RULE_IRI_TERMINAL )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2019:3: lv_withGraph_10_0= RULE_IRI_TERMINAL
                            {
                            lv_withGraph_10_0=(Token)input.LT(1);
                            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2945); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getModifyQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_3_0_1_0(), "withGraph"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"withGraph",
                              	        		lv_withGraph_10_0, 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2041:4: ( (lv_query_11_0= ruleDeleteDataQuery ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2042:1: (lv_query_11_0= ruleDeleteDataQuery )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2042:1: (lv_query_11_0= ruleDeleteDataQuery )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2043:3: lv_query_11_0= ruleDeleteDataQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getQueryDeleteDataQueryParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeleteDataQuery_in_ruleModifyQuery2973);
                    lv_query_11_0=ruleDeleteDataQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"query",
                      	        		lv_query_11_0, 
                      	        		"DeleteDataQuery", 
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
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2066:6: ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2066:6: ( ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2066:7: ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )? ( (lv_query_14_0= ruleDeleteWhereQuery ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2066:7: ( KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==KEYWORD_44) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2067:2: KEYWORD_44 ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) )
                            {
                            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleModifyQuery2993); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModifyQueryAccess().getWITHKeyword_4_0_0(), null); 
                                  
                            }
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2071:1: ( (lv_withGraph_13_0= RULE_IRI_TERMINAL ) )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2072:1: (lv_withGraph_13_0= RULE_IRI_TERMINAL )
                            {
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2072:1: (lv_withGraph_13_0= RULE_IRI_TERMINAL )
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2073:3: lv_withGraph_13_0= RULE_IRI_TERMINAL
                            {
                            lv_withGraph_13_0=(Token)input.LT(1);
                            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery3010); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getModifyQueryAccess().getWithGraphIRI_TERMINALTerminalRuleCall_4_0_1_0(), "withGraph"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"withGraph",
                              	        		lv_withGraph_13_0, 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2095:4: ( (lv_query_14_0= ruleDeleteWhereQuery ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2096:1: (lv_query_14_0= ruleDeleteWhereQuery )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2096:1: (lv_query_14_0= ruleDeleteWhereQuery )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2097:3: lv_query_14_0= ruleDeleteWhereQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModifyQueryAccess().getQueryDeleteWhereQueryParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeleteWhereQuery_in_ruleModifyQuery3038);
                    lv_query_14_0=ruleDeleteWhereQuery();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModifyQueryRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"query",
                      	        		lv_query_14_0, 
                      	        		"DeleteWhereQuery", 
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2127:1: entryRuleCreateGraphQuery returns [EObject current=null] : iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF ;
    public final EObject entryRuleCreateGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2128:2: (iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2129:2: iv_ruleCreateGraphQuery= ruleCreateGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCreateGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCreateGraphQuery_in_entryRuleCreateGraphQuery3074);
            iv_ruleCreateGraphQuery=ruleCreateGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCreateGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateGraphQuery3084); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2136:1: ruleCreateGraphQuery returns [EObject current=null] : ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleCreateGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isSilent_1_0=null;
        Token lv_graph_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2141:6: ( ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2142:1: ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2142:1: ( KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2143:2: KEYWORD_60 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            {
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleCreateGraphQuery3120); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCreateGraphQueryAccess().getCREATEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2147:1: ( (lv_isSilent_1_0= KEYWORD_69 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2148:1: (lv_isSilent_1_0= KEYWORD_69 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2148:1: (lv_isSilent_1_0= KEYWORD_69 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2149:3: lv_isSilent_1_0= KEYWORD_69
                    {
                    lv_isSilent_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleCreateGraphQuery3139); if (failed) return current;
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

            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleCreateGraphQuery3164); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCreateGraphQueryAccess().getGRAPHKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2174:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2175:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2175:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2176:3: lv_graph_3_0= RULE_IRI_TERMINAL
            {
            lv_graph_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleCreateGraphQuery3181); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2206:1: entryRuleDropGraphQuery returns [EObject current=null] : iv_ruleDropGraphQuery= ruleDropGraphQuery EOF ;
    public final EObject entryRuleDropGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2207:2: (iv_ruleDropGraphQuery= ruleDropGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2208:2: iv_ruleDropGraphQuery= ruleDropGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDropGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDropGraphQuery_in_entryRuleDropGraphQuery3221);
            iv_ruleDropGraphQuery=ruleDropGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDropGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropGraphQuery3231); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2215:1: ruleDropGraphQuery returns [EObject current=null] : ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleDropGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_isSilent_1_0=null;
        Token lv_graph_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2220:6: ( ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2221:1: ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2221:1: ( KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2222:2: KEYWORD_39 ( (lv_isSilent_1_0= KEYWORD_69 ) )? KEYWORD_49 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            {
            match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleDropGraphQuery3267); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDropGraphQueryAccess().getDROPKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2226:1: ( (lv_isSilent_1_0= KEYWORD_69 ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_69) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2227:1: (lv_isSilent_1_0= KEYWORD_69 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2227:1: (lv_isSilent_1_0= KEYWORD_69 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2228:3: lv_isSilent_1_0= KEYWORD_69
                    {
                    lv_isSilent_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleDropGraphQuery3286); if (failed) return current;
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

            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleDropGraphQuery3311); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDropGraphQueryAccess().getGRAPHKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2253:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2254:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2254:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2255:3: lv_graph_3_0= RULE_IRI_TERMINAL
            {
            lv_graph_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDropGraphQuery3328); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2285:1: entryRuleLoadGraphQuery returns [EObject current=null] : iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF ;
    public final EObject entryRuleLoadGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2286:2: (iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2287:2: iv_ruleLoadGraphQuery= ruleLoadGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLoadGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLoadGraphQuery_in_entryRuleLoadGraphQuery3368);
            iv_ruleLoadGraphQuery=ruleLoadGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLoadGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadGraphQuery3378); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2294:1: ruleLoadGraphQuery returns [EObject current=null] : ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? ) ;
    public final EObject ruleLoadGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_1_0=null;
        Token lv_intoGraph_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2299:6: ( ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2300:1: ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2300:1: ( KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2301:2: KEYWORD_43 ( (lv_graph_1_0= RULE_IRI_TERMINAL ) ) ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )?
            {
            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleLoadGraphQuery3414); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLoadGraphQueryAccess().getLOADKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2305:1: ( (lv_graph_1_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2306:1: (lv_graph_1_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2306:1: (lv_graph_1_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2307:3: lv_graph_1_0= RULE_IRI_TERMINAL
            {
            lv_graph_1_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3431); if (failed) return current;
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2329:2: ( KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_41) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2330:2: KEYWORD_41 KEYWORD_49 ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleLoadGraphQuery3448); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLoadGraphQueryAccess().getINTOKeyword_2_0(), null); 
                          
                    }
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleLoadGraphQuery3459); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLoadGraphQueryAccess().getGRAPHKeyword_2_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2339:1: ( (lv_intoGraph_4_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2340:1: (lv_intoGraph_4_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2340:1: (lv_intoGraph_4_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2341:3: lv_intoGraph_4_0= RULE_IRI_TERMINAL
                    {
                    lv_intoGraph_4_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3476); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2371:1: entryRuleClearGraphQuery returns [EObject current=null] : iv_ruleClearGraphQuery= ruleClearGraphQuery EOF ;
    public final EObject entryRuleClearGraphQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearGraphQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2372:2: (iv_ruleClearGraphQuery= ruleClearGraphQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2373:2: iv_ruleClearGraphQuery= ruleClearGraphQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClearGraphQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleClearGraphQuery_in_entryRuleClearGraphQuery3518);
            iv_ruleClearGraphQuery=ruleClearGraphQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClearGraphQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClearGraphQuery3528); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2380:1: ruleClearGraphQuery returns [EObject current=null] : ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) ) ;
    public final EObject ruleClearGraphQuery() throws RecognitionException {
        EObject current = null;

        Token lv_uri_2_0=null;
        Token lv_isDefault_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2385:6: ( ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2386:1: ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2386:1: ( KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2387:2: KEYWORD_47 KEYWORD_49 ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )
            {
            match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleClearGraphQuery3564); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClearGraphQueryAccess().getCLEARKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleClearGraphQuery3575); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClearGraphQueryAccess().getGRAPHKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2396:1: ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_IRI_TERMINAL) ) {
                alt52=1;
            }
            else if ( (LA52_0==KEYWORD_70) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2396:1: ( ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) | ( (lv_isDefault_3_0= KEYWORD_70 ) ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2396:2: ( (lv_uri_2_0= RULE_IRI_TERMINAL ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2396:2: ( (lv_uri_2_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2397:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2398:3: lv_uri_2_0= RULE_IRI_TERMINAL
                    {
                    lv_uri_2_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleClearGraphQuery3593); if (failed) return current;
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2421:6: ( (lv_isDefault_3_0= KEYWORD_70 ) )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2421:6: ( (lv_isDefault_3_0= KEYWORD_70 ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2422:1: (lv_isDefault_3_0= KEYWORD_70 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2422:1: (lv_isDefault_3_0= KEYWORD_70 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2423:3: lv_isDefault_3_0= KEYWORD_70
                    {
                    lv_isDefault_3_0=(Token)input.LT(1);
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleClearGraphQuery3623); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2453:1: entryRuleInsertQuery returns [EObject current=null] : iv_ruleInsertQuery= ruleInsertQuery EOF ;
    public final EObject entryRuleInsertQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2454:2: (iv_ruleInsertQuery= ruleInsertQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2455:2: iv_ruleInsertQuery= ruleInsertQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInsertQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInsertQuery_in_entryRuleInsertQuery3674);
            iv_ruleInsertQuery=ruleInsertQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInsertQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertQuery3684); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2462:1: ruleInsertQuery returns [EObject current=null] : ( KEYWORD_65 ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) ;
    public final EObject ruleInsertQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_2_0=null;
        EObject lv_pattern_3_0 = null;

        EObject lv_whereClause_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2467:6: ( ( KEYWORD_65 ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2468:1: ( KEYWORD_65 ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2468:1: ( KEYWORD_65 ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2469:2: KEYWORD_65 ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )?
            {
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleInsertQuery3720); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertQueryAccess().getINSERTKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2473:1: ( KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KEYWORD_41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2474:2: KEYWORD_41 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleInsertQuery3732); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertQueryAccess().getINTOKeyword_1_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2478:1: ( (lv_graph_2_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2479:1: (lv_graph_2_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2479:1: (lv_graph_2_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2480:3: lv_graph_2_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_2_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3749); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_1_1_0(), "graph"); 
                      		
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
                      	        		lv_graph_2_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2502:4: ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2503:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2503:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2504:3: lv_pattern_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInsertQueryAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleInsertQuery3777);
            lv_pattern_3_0=ruleGroupGraphPattern();
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2526:2: ( (lv_whereClause_4_0= ruleWhereClause ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2527:1: (lv_whereClause_4_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2527:1: (lv_whereClause_4_0= ruleWhereClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2528:3: lv_whereClause_4_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInsertQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleInsertQuery3798);
                    lv_whereClause_4_0=ruleWhereClause();
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2558:1: entryRuleInsertDataQuery returns [EObject current=null] : iv_ruleInsertDataQuery= ruleInsertDataQuery EOF ;
    public final EObject entryRuleInsertDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertDataQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2559:2: (iv_ruleInsertDataQuery= ruleInsertDataQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2560:2: iv_ruleInsertDataQuery= ruleInsertDataQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInsertDataQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInsertDataQuery_in_entryRuleInsertDataQuery3834);
            iv_ruleInsertDataQuery=ruleInsertDataQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInsertDataQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertDataQuery3844); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2567:1: ruleInsertDataQuery returns [EObject current=null] : ( KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleInsertDataQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_3_0=null;
        EObject lv_pattern_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2572:6: ( ( KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2573:1: ( KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2573:1: ( KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2574:2: KEYWORD_65 KEYWORD_38 ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleInsertDataQuery3880); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertDataQueryAccess().getINSERTKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleInsertDataQuery3891); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInsertDataQueryAccess().getDATAKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2583:1: ( KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KEYWORD_41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2584:2: KEYWORD_41 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleInsertDataQuery3903); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInsertDataQueryAccess().getINTOKeyword_2_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2588:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2589:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2589:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2590:3: lv_graph_3_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_3_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3920); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInsertDataQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_2_1_0(), "graph"); 
                      		
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
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2612:4: ( (lv_pattern_4_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2613:1: (lv_pattern_4_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2613:1: (lv_pattern_4_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2614:3: lv_pattern_4_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInsertDataQueryAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleInsertDataQuery3948);
            lv_pattern_4_0=ruleGroupGraphPattern();
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
              	        		lv_pattern_4_0, 
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2644:1: entryRuleDeleteQuery returns [EObject current=null] : iv_ruleDeleteQuery= ruleDeleteQuery EOF ;
    public final EObject entryRuleDeleteQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2645:2: (iv_ruleDeleteQuery= ruleDeleteQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2646:2: iv_ruleDeleteQuery= ruleDeleteQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteQuery_in_entryRuleDeleteQuery3983);
            iv_ruleDeleteQuery=ruleDeleteQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteQuery3993); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2653:1: ruleDeleteQuery returns [EObject current=null] : ( KEYWORD_61 ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_6_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_2_0=null;
        EObject lv_pattern_3_0 = null;

        EObject lv_insertPattern_5_0 = null;

        EObject lv_whereClause_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2658:6: ( ( KEYWORD_61 ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_6_0= ruleWhereClause ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2659:1: ( KEYWORD_61 ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_6_0= ruleWhereClause ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2659:1: ( KEYWORD_61 ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_6_0= ruleWhereClause ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2660:2: KEYWORD_61 ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )? ( (lv_whereClause_6_0= ruleWhereClause ) )?
            {
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteQuery4029); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteQueryAccess().getDELETEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2664:1: ( KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_40) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2665:2: KEYWORD_40 ( (lv_graph_2_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDeleteQuery4041); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteQueryAccess().getFROMKeyword_1_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2669:1: ( (lv_graph_2_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2670:1: (lv_graph_2_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2670:1: (lv_graph_2_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2671:3: lv_graph_2_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_2_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery4058); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_1_1_0(), "graph"); 
                      		
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
                      	        		lv_graph_2_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2693:4: ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2694:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2694:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2695:3: lv_pattern_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4086);
            lv_pattern_3_0=ruleGroupGraphPattern();
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2717:2: ( KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_65) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==KEYWORD_16) ) {
                    int LA57_3 = input.LA(3);

                    if ( (synpred67()) ) {
                        alt57=1;
                    }
                }
            }
            switch (alt57) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2718:2: KEYWORD_65 ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) )
                    {
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleDeleteQuery4098); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteQueryAccess().getINSERTKeyword_3_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2722:1: ( (lv_insertPattern_5_0= ruleGroupGraphPattern ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2723:1: (lv_insertPattern_5_0= ruleGroupGraphPattern )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2723:1: (lv_insertPattern_5_0= ruleGroupGraphPattern )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2724:3: lv_insertPattern_5_0= ruleGroupGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getInsertPatternGroupGraphPatternParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4119);
                    lv_insertPattern_5_0=ruleGroupGraphPattern();
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
                      	        		lv_insertPattern_5_0, 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2746:4: ( (lv_whereClause_6_0= ruleWhereClause ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2747:1: (lv_whereClause_6_0= ruleWhereClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2747:1: (lv_whereClause_6_0= ruleWhereClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2748:3: lv_whereClause_6_0= ruleWhereClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getWhereClauseWhereClauseParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteQuery4142);
                    lv_whereClause_6_0=ruleWhereClause();
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
    // $ANTLR end ruleDeleteQuery


    // $ANTLR start entryRuleDeleteDataQuery
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2778:1: entryRuleDeleteDataQuery returns [EObject current=null] : iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF ;
    public final EObject entryRuleDeleteDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteDataQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2779:2: (iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2780:2: iv_ruleDeleteDataQuery= ruleDeleteDataQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteDataQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteDataQuery_in_entryRuleDeleteDataQuery4178);
            iv_ruleDeleteDataQuery=ruleDeleteDataQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteDataQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteDataQuery4188); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2787:1: ruleDeleteDataQuery returns [EObject current=null] : ( KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleDeleteDataQuery() throws RecognitionException {
        EObject current = null;

        Token lv_graph_3_0=null;
        EObject lv_pattern_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2792:6: ( ( KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2793:1: ( KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2793:1: ( KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2794:2: KEYWORD_61 KEYWORD_38 ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )? ( (lv_pattern_4_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteDataQuery4224); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteDataQueryAccess().getDELETEKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleDeleteDataQuery4235); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteDataQueryAccess().getDATAKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2803:1: ( KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2804:2: KEYWORD_40 ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDeleteDataQuery4247); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeleteDataQueryAccess().getFROMKeyword_2_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2808:1: ( (lv_graph_3_0= RULE_IRI_TERMINAL ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2809:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2809:1: (lv_graph_3_0= RULE_IRI_TERMINAL )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2810:3: lv_graph_3_0= RULE_IRI_TERMINAL
                    {
                    lv_graph_3_0=(Token)input.LT(1);
                    match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4264); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDeleteDataQueryAccess().getGraphIRI_TERMINALTerminalRuleCall_2_1_0(), "graph"); 
                      		
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
                    break;

            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2832:4: ( (lv_pattern_4_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2833:1: (lv_pattern_4_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2833:1: (lv_pattern_4_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2834:3: lv_pattern_4_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteDataQueryAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteDataQuery4292);
            lv_pattern_4_0=ruleGroupGraphPattern();
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
              	        		lv_pattern_4_0, 
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2864:1: entryRuleDeleteWhereQuery returns [EObject current=null] : iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF ;
    public final EObject entryRuleDeleteWhereQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteWhereQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2865:2: (iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2866:2: iv_ruleDeleteWhereQuery= ruleDeleteWhereQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeleteWhereQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeleteWhereQuery_in_entryRuleDeleteWhereQuery4327);
            iv_ruleDeleteWhereQuery=ruleDeleteWhereQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeleteWhereQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteWhereQuery4337); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2873:1: ruleDeleteWhereQuery returns [EObject current=null] : ( KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) KEYWORD_17 ) ;
    public final EObject ruleDeleteWhereQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2878:6: ( ( KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2879:1: ( KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2879:1: ( KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2880:2: KEYWORD_61 KEYWORD_57 KEYWORD_16 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) KEYWORD_17
            {
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleDeleteWhereQuery4373); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getDELETEKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleDeleteWhereQuery4384); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getWHEREKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleDeleteWhereQuery4395); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2894:1: ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2895:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2895:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2896:3: lv_pattern_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeleteWhereQueryAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleDeleteWhereQuery4416);
            lv_pattern_3_0=ruleGroupGraphPattern();
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

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleDeleteWhereQuery4427); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeleteWhereQueryAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2931:1: entryRuleDatasetClause returns [EObject current=null] : iv_ruleDatasetClause= ruleDatasetClause EOF ;
    public final EObject entryRuleDatasetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2932:2: (iv_ruleDatasetClause= ruleDatasetClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2933:2: iv_ruleDatasetClause= ruleDatasetClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDatasetClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDatasetClause_in_entryRuleDatasetClause4462);
            iv_ruleDatasetClause=ruleDatasetClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDatasetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatasetClause4472); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2940:1: ruleDatasetClause returns [EObject current=null] : (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet ) ;
    public final EObject ruleDatasetClause() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultDataSet_0 = null;

        EObject this_NamedDataSet_1 = null;

        EObject this_ServiceDataSet_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2945:6: ( (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2946:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2946:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==KEYWORD_40) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_72:
                    {
                    alt60=3;
                    }
                    break;
                case KEYWORD_53:
                    {
                    alt60=2;
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
                        new NoViableAltException("2946:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )", 60, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2946:1: (this_DefaultDataSet_0= ruleDefaultDataSet | this_NamedDataSet_1= ruleNamedDataSet | this_ServiceDataSet_2= ruleServiceDataSet )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2947:2: this_DefaultDataSet_0= ruleDefaultDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getDefaultDataSetParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultDataSet_in_ruleDatasetClause4522);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2960:2: this_NamedDataSet_1= ruleNamedDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getNamedDataSetParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedDataSet_in_ruleDatasetClause4552);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2973:2: this_ServiceDataSet_2= ruleServiceDataSet
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDatasetClauseAccess().getServiceDataSetParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleServiceDataSet_in_ruleDatasetClause4582);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2992:1: entryRuleDefaultDataSet returns [EObject current=null] : iv_ruleDefaultDataSet= ruleDefaultDataSet EOF ;
    public final EObject entryRuleDefaultDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2993:2: (iv_ruleDefaultDataSet= ruleDefaultDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2994:2: iv_ruleDefaultDataSet= ruleDefaultDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefaultDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefaultDataSet_in_entryRuleDefaultDataSet4616);
            iv_ruleDefaultDataSet=ruleDefaultDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefaultDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultDataSet4626); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3001:1: ruleDefaultDataSet returns [EObject current=null] : ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) ) ;
    public final EObject ruleDefaultDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3006:6: ( ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3007:1: ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3007:1: ( KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3008:2: KEYWORD_40 ( (lv_dataSet_1_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleDefaultDataSet4662); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefaultDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3012:1: ( (lv_dataSet_1_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3013:1: (lv_dataSet_1_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3013:1: (lv_dataSet_1_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3014:3: lv_dataSet_1_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefaultDataSetAccess().getDataSetIRIParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleDefaultDataSet4683);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3044:1: entryRuleNamedDataSet returns [EObject current=null] : iv_ruleNamedDataSet= ruleNamedDataSet EOF ;
    public final EObject entryRuleNamedDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3045:2: (iv_ruleNamedDataSet= ruleNamedDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3046:2: iv_ruleNamedDataSet= ruleNamedDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedDataSet_in_entryRuleNamedDataSet4718);
            iv_ruleNamedDataSet=ruleNamedDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedDataSet4728); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3053:1: ruleNamedDataSet returns [EObject current=null] : ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) ) ;
    public final EObject ruleNamedDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3058:6: ( ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3059:1: ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3059:1: ( KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3060:2: KEYWORD_40 KEYWORD_53 ( (lv_dataSet_2_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleNamedDataSet4764); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleNamedDataSet4775); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedDataSetAccess().getNAMEDKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3069:1: ( (lv_dataSet_2_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3070:1: (lv_dataSet_2_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3070:1: (lv_dataSet_2_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3071:3: lv_dataSet_2_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNamedDataSetAccess().getDataSetIRIParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleNamedDataSet4796);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3101:1: entryRuleServiceDataSet returns [EObject current=null] : iv_ruleServiceDataSet= ruleServiceDataSet EOF ;
    public final EObject entryRuleServiceDataSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDataSet = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3102:2: (iv_ruleServiceDataSet= ruleServiceDataSet EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3103:2: iv_ruleServiceDataSet= ruleServiceDataSet EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getServiceDataSetRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleServiceDataSet_in_entryRuleServiceDataSet4831);
            iv_ruleServiceDataSet=ruleServiceDataSet();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleServiceDataSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDataSet4841); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3110:1: ruleServiceDataSet returns [EObject current=null] : ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) ) ;
    public final EObject ruleServiceDataSet() throws RecognitionException {
        EObject current = null;

        EObject lv_dataSet_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3115:6: ( ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3116:1: ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3116:1: ( KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3117:2: KEYWORD_40 KEYWORD_72 ( (lv_dataSet_2_0= ruleIRI ) )
            {
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleServiceDataSet4877); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceDataSetAccess().getFROMKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleServiceDataSet4888); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceDataSetAccess().getSERVICEKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3126:1: ( (lv_dataSet_2_0= ruleIRI ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3127:1: (lv_dataSet_2_0= ruleIRI )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3127:1: (lv_dataSet_2_0= ruleIRI )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3128:3: lv_dataSet_2_0= ruleIRI
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceDataSetAccess().getDataSetIRIParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIRI_in_ruleServiceDataSet4909);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3158:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3159:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3160:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWhereClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause4944);
            iv_ruleWhereClause=ruleWhereClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause4954); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3167:1: ruleWhereClause returns [EObject current=null] : ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject lv_groupGraphPattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3172:6: ( ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3173:1: ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3173:1: ( KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3174:2: KEYWORD_57 ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleWhereClause4990); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3178:1: ( (lv_groupGraphPattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3179:1: (lv_groupGraphPattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3179:1: (lv_groupGraphPattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3180:3: lv_groupGraphPattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWhereClauseAccess().getGroupGraphPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleWhereClause5011);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3210:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3211:2: (iv_ruleGroupClause= ruleGroupClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3212:2: iv_ruleGroupClause= ruleGroupClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupClause_in_entryRuleGroupClause5046);
            iv_ruleGroupClause=ruleGroupClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupClause5056); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3219:1: ruleGroupClause returns [EObject current=null] : ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3224:6: ( ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3225:1: ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3225:1: ( KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3226:2: KEYWORD_50 KEYWORD_23 ( (lv_condition_2_0= ruleGroupCondition ) )
            {
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleGroupClause5092); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupClauseAccess().getGROUPKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleGroupClause5103); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupClauseAccess().getBYKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3235:1: ( (lv_condition_2_0= ruleGroupCondition ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3236:1: (lv_condition_2_0= ruleGroupCondition )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3236:1: (lv_condition_2_0= ruleGroupCondition )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3237:3: lv_condition_2_0= ruleGroupCondition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupClauseAccess().getConditionGroupConditionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupCondition_in_ruleGroupClause5124);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3267:1: entryRuleGroupCondition returns [EObject current=null] : iv_ruleGroupCondition= ruleGroupCondition EOF ;
    public final EObject entryRuleGroupCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupCondition = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3268:2: (iv_ruleGroupCondition= ruleGroupCondition EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3269:2: iv_ruleGroupCondition= ruleGroupCondition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupConditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupCondition_in_entryRuleGroupCondition5159);
            iv_ruleGroupCondition=ruleGroupCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupCondition5169); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3276:1: ruleGroupCondition returns [EObject current=null] : (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable ) ;
    public final EObject ruleGroupCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInCall_0 = null;

        EObject this_Function_1 = null;

        EObject this_Variable_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3281:6: ( (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )
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
                                new NoViableAltException("3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA61_2==KEYWORD_1) ) {
                    alt61=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 2, input);

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
                    new NoViableAltException("3282:1: (this_BuiltInCall_0= ruleBuiltInCall | this_Function_1= ruleFunction | this_Variable_2= ruleVariable )", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3283:2: this_BuiltInCall_0= ruleBuiltInCall
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getBuiltInCallParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleGroupCondition5219);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3296:2: this_Function_1= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleGroupCondition5249);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3309:2: this_Variable_2= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupConditionAccess().getVariableParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleGroupCondition5279);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3328:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3329:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3330:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHavingClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause5313);
            iv_ruleHavingClause=ruleHavingClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause5323); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3337:1: ruleHavingClause returns [EObject current=null] : ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject lv_constraint_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3342:6: ( ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3343:1: ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3343:1: ( KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3344:2: KEYWORD_64 ( (lv_constraint_1_0= ruleConstraint ) )
            {
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleHavingClause5359); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3348:1: ( (lv_constraint_1_0= ruleConstraint ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3349:1: (lv_constraint_1_0= ruleConstraint )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3349:1: (lv_constraint_1_0= ruleConstraint )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3350:3: lv_constraint_1_0= ruleConstraint
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getHavingClauseAccess().getConstraintConstraintParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraint_in_ruleHavingClause5380);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3380:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3381:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3382:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint5415);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint5425); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3389:1: ruleConstraint returns [EObject current=null] : (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParFilterExpression_0 = null;

        EObject this_BuiltInCall_1 = null;

        EObject this_Function_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3394:6: ( (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3395:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3395:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )
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
                    new NoViableAltException("3395:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_BuiltInCall_1= ruleBuiltInCall | this_Function_2= ruleFunction )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3396:2: this_ParFilterExpression_0= ruleParFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getParFilterExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParFilterExpression_in_ruleConstraint5475);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3409:2: this_BuiltInCall_1= ruleBuiltInCall
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getBuiltInCallParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleConstraint5505);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3422:2: this_Function_2= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getFunctionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleConstraint5535);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3441:1: entryRuleLimitClause returns [EObject current=null] : iv_ruleLimitClause= ruleLimitClause EOF ;
    public final EObject entryRuleLimitClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitClause = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3442:2: (iv_ruleLimitClause= ruleLimitClause EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3443:2: iv_ruleLimitClause= ruleLimitClause EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLimitClauseRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLimitClause_in_entryRuleLimitClause5569);
            iv_ruleLimitClause=ruleLimitClause();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLimitClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimitClause5579); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3450:1: ruleLimitClause returns [EObject current=null] : ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLimitClause() throws RecognitionException {
        EObject current = null;

        Token lv_limit_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3455:6: ( ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3456:1: ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3456:1: ( KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3457:2: KEYWORD_51 ( (lv_limit_1_0= RULE_INT ) )
            {
            match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleLimitClause5615); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLimitClauseAccess().getLIMITKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3461:1: ( (lv_limit_1_0= RULE_INT ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3462:1: (lv_limit_1_0= RULE_INT )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3462:1: (lv_limit_1_0= RULE_INT )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3463:3: lv_limit_1_0= RULE_INT
            {
            lv_limit_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLimitClause5632); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3493:1: entryRuleGroupGraphPattern returns [EObject current=null] : iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF ;
    public final EObject entryRuleGroupGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3494:2: (iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3495:2: iv_ruleGroupGraphPattern= ruleGroupGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_entryRuleGroupGraphPattern5672);
            iv_ruleGroupGraphPattern=ruleGroupGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupGraphPattern5682); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3502:1: ruleGroupGraphPattern returns [EObject current=null] : (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub ) ;
    public final EObject ruleGroupGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_SubSelectQuery_0 = null;

        EObject this_GroupGraphPatternSub_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3507:6: ( (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3508:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3508:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )
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
                        new NoViableAltException("3508:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3508:1: (this_SubSelectQuery_0= ruleSubSelectQuery | this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3509:2: this_SubSelectQuery_0= ruleSubSelectQuery
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternAccess().getSubSelectQueryParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubSelectQuery_in_ruleGroupGraphPattern5732);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3522:2: this_GroupGraphPatternSub_1= ruleGroupGraphPatternSub
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternAccess().getGroupGraphPatternSubParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPatternSub_in_ruleGroupGraphPattern5762);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3541:1: entryRuleSubSelectQuery returns [EObject current=null] : iv_ruleSubSelectQuery= ruleSubSelectQuery EOF ;
    public final EObject entryRuleSubSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectQuery = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3542:2: (iv_ruleSubSelectQuery= ruleSubSelectQuery EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3543:2: iv_ruleSubSelectQuery= ruleSubSelectQuery EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubSelectQueryRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubSelectQuery_in_entryRuleSubSelectQuery5796);
            iv_ruleSubSelectQuery=ruleSubSelectQuery();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubSelectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelectQuery5806); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3550:1: ruleSubSelectQuery returns [EObject current=null] : ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 ) ;
    public final EObject ruleSubSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_2_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_whereClause_4_0 = null;

        EObject lv_groupClause_5_0 = null;

        EObject lv_havingClause_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3555:6: ( ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3556:1: ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3556:1: ( KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3557:2: KEYWORD_16 KEYWORD_68 ( (lv_variables_2_0= ruleVariable ) ) ( (lv_variables_3_0= ruleVariable ) )* ( (lv_whereClause_4_0= ruleWhereClause ) ) ( (lv_groupClause_5_0= ruleGroupClause ) )? ( (lv_havingClause_6_0= ruleHavingClause ) )? KEYWORD_17
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSubSelectQuery5842); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubSelectQueryAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleSubSelectQuery5853); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubSelectQueryAccess().getSELECTKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3566:1: ( (lv_variables_2_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3567:1: (lv_variables_2_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3567:1: (lv_variables_2_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3568:3: lv_variables_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getVariablesVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleSubSelectQuery5874);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3590:2: ( (lv_variables_3_0= ruleVariable ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==KEYWORD_14||LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3591:1: (lv_variables_3_0= ruleVariable )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3591:1: (lv_variables_3_0= ruleVariable )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3592:3: lv_variables_3_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getVariablesVariableParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleSubSelectQuery5895);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3614:3: ( (lv_whereClause_4_0= ruleWhereClause ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3615:1: (lv_whereClause_4_0= ruleWhereClause )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3615:1: (lv_whereClause_4_0= ruleWhereClause )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3616:3: lv_whereClause_4_0= ruleWhereClause
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleWhereClause_in_ruleSubSelectQuery5917);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3638:2: ( (lv_groupClause_5_0= ruleGroupClause ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_50) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3639:1: (lv_groupClause_5_0= ruleGroupClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3639:1: (lv_groupClause_5_0= ruleGroupClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3640:3: lv_groupClause_5_0= ruleGroupClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getGroupClauseGroupClauseParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSubSelectQuery5938);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3662:3: ( (lv_havingClause_6_0= ruleHavingClause ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_64) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3663:1: (lv_havingClause_6_0= ruleHavingClause )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3663:1: (lv_havingClause_6_0= ruleHavingClause )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3664:3: lv_havingClause_6_0= ruleHavingClause
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubSelectQueryAccess().getHavingClauseHavingClauseParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSubSelectQuery5960);
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

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleSubSelectQuery5972); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3699:1: entryRuleGroupGraphPatternSub returns [EObject current=null] : iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF ;
    public final EObject entryRuleGroupGraphPatternSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupGraphPatternSub = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3700:2: (iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3701:2: iv_ruleGroupGraphPatternSub= ruleGroupGraphPatternSub EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupGraphPatternSubRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupGraphPatternSub_in_entryRuleGroupGraphPatternSub6007);
            iv_ruleGroupGraphPatternSub=ruleGroupGraphPatternSub();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupGraphPatternSub; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupGraphPatternSub6017); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3708:1: ruleGroupGraphPatternSub returns [EObject current=null] : ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 ) ;
    public final EObject ruleGroupGraphPatternSub() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPatterns_1_0 = null;

        EObject lv_graphPatterns_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3713:6: ( ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3714:1: ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3714:1: ( KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3715:2: KEYWORD_16 ( (lv_graphPatterns_1_0= ruleGraphPattern ) ) ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )* ( KEYWORD_7 )? KEYWORD_17
            {
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleGroupGraphPatternSub6053); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3719:1: ( (lv_graphPatterns_1_0= ruleGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3720:1: (lv_graphPatterns_1_0= ruleGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3720:1: (lv_graphPatterns_1_0= ruleGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3721:3: lv_graphPatterns_1_0= ruleGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6074);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3743:2: ( KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) ) )*
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
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3744:2: KEYWORD_7 ( (lv_graphPatterns_3_0= ruleGraphPattern ) )
            	    {
            	    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6086); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getFullStopKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3748:1: ( (lv_graphPatterns_3_0= ruleGraphPattern ) )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3749:1: (lv_graphPatterns_3_0= ruleGraphPattern )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3749:1: (lv_graphPatterns_3_0= ruleGraphPattern )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3750:3: lv_graphPatterns_3_0= ruleGraphPattern
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getGroupGraphPatternSubAccess().getGraphPatternsGraphPatternParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6107);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3772:4: ( KEYWORD_7 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KEYWORD_7) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3773:2: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6121); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getGroupGraphPatternSubAccess().getFullStopKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleGroupGraphPatternSub6134); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3790:1: entryRuleGraphPattern returns [EObject current=null] : iv_ruleGraphPattern= ruleGraphPattern EOF ;
    public final EObject entryRuleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3791:2: (iv_ruleGraphPattern= ruleGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3792:2: iv_ruleGraphPattern= ruleGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphPattern_in_entryRuleGraphPattern6169);
            iv_ruleGraphPattern=ruleGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphPattern6179); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3799:1: ruleGraphPattern returns [EObject current=null] : (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern ) ;
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
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3804:6: ( (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3805:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3805:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )
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
                case KEYWORD_33:
                    {
                    alt69=8;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3805:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )", 69, 6, input);

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
                    new NoViableAltException("3805:1: (this_TriplesSameSubject_0= ruleTriplesSameSubject | this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern | this_OptionalGraphPattern_2= ruleOptionalGraphPattern | this_GraphGraphPattern_3= ruleGraphGraphPattern | this_ServiceGraphPattern_4= ruleServiceGraphPattern | this_FilterPattern_5= ruleFilterPattern | this_ExistsPattern_6= ruleExistsPattern | this_NotExistsPattern_7= ruleNotExistsPattern | this_MinusPattern_8= ruleMinusPattern )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3806:2: this_TriplesSameSubject_0= ruleTriplesSameSubject
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getTriplesSameSubjectParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTriplesSameSubject_in_ruleGraphPattern6229);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3819:2: this_GroupOrUnionGraphPattern_1= ruleGroupOrUnionGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getGroupOrUnionGraphPatternParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroupOrUnionGraphPattern_in_ruleGraphPattern6259);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3832:2: this_OptionalGraphPattern_2= ruleOptionalGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getOptionalGraphPatternParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOptionalGraphPattern_in_ruleGraphPattern6289);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3845:2: this_GraphGraphPattern_3= ruleGraphGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getGraphGraphPatternParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGraphGraphPattern_in_ruleGraphPattern6319);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3858:2: this_ServiceGraphPattern_4= ruleServiceGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getServiceGraphPatternParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleServiceGraphPattern_in_ruleGraphPattern6349);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3871:2: this_FilterPattern_5= ruleFilterPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getFilterPatternParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFilterPattern_in_ruleGraphPattern6379);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3884:2: this_ExistsPattern_6= ruleExistsPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getExistsPatternParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsPattern_in_ruleGraphPattern6409);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3897:2: this_NotExistsPattern_7= ruleNotExistsPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getNotExistsPatternParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExistsPattern_in_ruleGraphPattern6439);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3910:2: this_MinusPattern_8= ruleMinusPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphPatternAccess().getMinusPatternParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinusPattern_in_ruleGraphPattern6469);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3929:1: entryRuleTriplesSameSubject returns [EObject current=null] : iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF ;
    public final EObject entryRuleTriplesSameSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriplesSameSubject = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3930:2: (iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3931:2: iv_ruleTriplesSameSubject= ruleTriplesSameSubject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTriplesSameSubjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTriplesSameSubject_in_entryRuleTriplesSameSubject6503);
            iv_ruleTriplesSameSubject=ruleTriplesSameSubject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTriplesSameSubject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriplesSameSubject6513); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3938:1: ruleTriplesSameSubject returns [EObject current=null] : ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* ) ;
    public final EObject ruleTriplesSameSubject() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_0_0 = null;

        EObject lv_propertyList_1_0 = null;

        EObject lv_propertyList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3943:6: ( ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3944:1: ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3944:1: ( ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )* )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3944:2: ( (lv_subject_0_0= ruleGraphNode ) ) ( (lv_propertyList_1_0= rulePropertyList ) ) ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )*
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3944:2: ( (lv_subject_0_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3945:1: (lv_subject_0_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3945:1: (lv_subject_0_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3946:3: lv_subject_0_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getSubjectGraphNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleTriplesSameSubject6559);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3968:2: ( (lv_propertyList_1_0= rulePropertyList ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3969:1: (lv_propertyList_1_0= rulePropertyList )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3969:1: (lv_propertyList_1_0= rulePropertyList )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3970:3: lv_propertyList_1_0= rulePropertyList
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getPropertyListPropertyListParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6580);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3992:2: ( KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==KEYWORD_10) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3993:2: KEYWORD_10 ( (lv_propertyList_3_0= rulePropertyList ) )
            	    {
            	    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleTriplesSameSubject6592); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTriplesSameSubjectAccess().getSemicolonKeyword_2_0(), null); 
            	          
            	    }
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3997:1: ( (lv_propertyList_3_0= rulePropertyList ) )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3998:1: (lv_propertyList_3_0= rulePropertyList )
            	    {
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3998:1: (lv_propertyList_3_0= rulePropertyList )
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:3999:3: lv_propertyList_3_0= rulePropertyList
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTriplesSameSubjectAccess().getPropertyListPropertyListParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6613);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4029:1: entryRuleGroupOrUnionGraphPattern returns [EObject current=null] : iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF ;
    public final EObject entryRuleGroupOrUnionGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupOrUnionGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4030:2: (iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4031:2: iv_ruleGroupOrUnionGraphPattern= ruleGroupOrUnionGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGroupOrUnionGraphPattern_in_entryRuleGroupOrUnionGraphPattern6650);
            iv_ruleGroupOrUnionGraphPattern=ruleGroupOrUnionGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGroupOrUnionGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupOrUnionGraphPattern6660); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4038:1: ruleGroupOrUnionGraphPattern returns [EObject current=null] : ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? ) ;
    public final EObject ruleGroupOrUnionGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPatterns_0_0 = null;

        EObject lv_graphPatterns_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4043:6: ( ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4044:1: ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4044:1: ( ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4044:2: ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) ) ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4044:2: ( (lv_graphPatterns_0_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4045:1: (lv_graphPatterns_0_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4045:1: (lv_graphPatterns_0_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4046:3: lv_graphPatterns_0_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsGroupGraphPatternParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6706);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4068:2: ( KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_55) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4069:2: KEYWORD_55 ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) )
                    {
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleGroupOrUnionGraphPattern6718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getUNIONKeyword_1_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4073:1: ( (lv_graphPatterns_2_0= ruleGroupGraphPattern ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4074:1: (lv_graphPatterns_2_0= ruleGroupGraphPattern )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4074:1: (lv_graphPatterns_2_0= ruleGroupGraphPattern )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4075:3: lv_graphPatterns_2_0= ruleGroupGraphPattern
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getGroupOrUnionGraphPatternAccess().getGraphPatternsGroupGraphPatternParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6739);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4105:1: entryRuleOptionalGraphPattern returns [EObject current=null] : iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF ;
    public final EObject entryRuleOptionalGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4106:2: (iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4107:2: iv_ruleOptionalGraphPattern= ruleOptionalGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOptionalGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOptionalGraphPattern_in_entryRuleOptionalGraphPattern6776);
            iv_ruleOptionalGraphPattern=ruleOptionalGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOptionalGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalGraphPattern6786); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4114:1: ruleOptionalGraphPattern returns [EObject current=null] : ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleOptionalGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_graphPattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4119:6: ( ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4120:1: ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4120:1: ( KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4121:2: KEYWORD_78 ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleOptionalGraphPattern6822); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOptionalGraphPatternAccess().getOPTIONALKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4125:1: ( (lv_graphPattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4126:1: (lv_graphPattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4126:1: (lv_graphPattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4127:3: lv_graphPattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOptionalGraphPatternAccess().getGraphPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleOptionalGraphPattern6843);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4157:1: entryRulePropertyList returns [EObject current=null] : iv_rulePropertyList= rulePropertyList EOF ;
    public final EObject entryRulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyList = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4158:2: (iv_rulePropertyList= rulePropertyList EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4159:2: iv_rulePropertyList= rulePropertyList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyListRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyList_in_entryRulePropertyList6878);
            iv_rulePropertyList=rulePropertyList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyList6888); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4166:1: rulePropertyList returns [EObject current=null] : ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) ) ;
    public final EObject rulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        EObject lv_object_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4171:6: ( ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4172:1: ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4172:1: ( ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4172:2: ( (lv_property_0_0= ruleGraphNode ) ) ( (lv_object_1_0= ruleGraphNode ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4172:2: ( (lv_property_0_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4173:1: (lv_property_0_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4173:1: (lv_property_0_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4174:3: lv_property_0_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyListAccess().getPropertyGraphNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_rulePropertyList6934);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4196:2: ( (lv_object_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4197:1: (lv_object_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4197:1: (lv_object_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4198:3: lv_object_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyListAccess().getObjectGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_rulePropertyList6955);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4228:1: entryRuleGraphGraphPattern returns [EObject current=null] : iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF ;
    public final EObject entryRuleGraphGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4229:2: (iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4230:2: iv_ruleGraphGraphPattern= ruleGraphGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphGraphPattern_in_entryRuleGraphGraphPattern6990);
            iv_ruleGraphGraphPattern=ruleGraphGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphGraphPattern7000); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4237:1: ruleGraphGraphPattern returns [EObject current=null] : ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleGraphGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_var_1_0 = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4242:6: ( ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4243:1: ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4243:1: ( KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4244:2: KEYWORD_49 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleGraphGraphPattern7036); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphGraphPatternAccess().getGRAPHKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4248:1: ( (lv_var_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4249:1: (lv_var_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4249:1: (lv_var_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4250:3: lv_var_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGraphGraphPatternAccess().getVarGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleGraphGraphPattern7057);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4272:2: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4273:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4273:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4274:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGraphGraphPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleGraphGraphPattern7078);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4304:1: entryRuleServiceGraphPattern returns [EObject current=null] : iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF ;
    public final EObject entryRuleServiceGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceGraphPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4305:2: (iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4306:2: iv_ruleServiceGraphPattern= ruleServiceGraphPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getServiceGraphPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleServiceGraphPattern_in_entryRuleServiceGraphPattern7113);
            iv_ruleServiceGraphPattern=ruleServiceGraphPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleServiceGraphPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceGraphPattern7123); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4313:1: ruleServiceGraphPattern returns [EObject current=null] : ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleServiceGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_var_1_0 = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4318:6: ( ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4319:1: ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4319:1: ( KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4320:2: KEYWORD_72 ( (lv_var_1_0= ruleGraphNode ) ) ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleServiceGraphPattern7159); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getServiceGraphPatternAccess().getSERVICEKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4324:1: ( (lv_var_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4325:1: (lv_var_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4325:1: (lv_var_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4326:3: lv_var_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceGraphPatternAccess().getVarGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleServiceGraphPattern7180);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4348:2: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4349:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4349:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4350:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getServiceGraphPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleServiceGraphPattern7201);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4380:1: entryRuleFilterPattern returns [EObject current=null] : iv_ruleFilterPattern= ruleFilterPattern EOF ;
    public final EObject entryRuleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4381:2: (iv_ruleFilterPattern= ruleFilterPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4382:2: iv_ruleFilterPattern= ruleFilterPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFilterPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern7236);
            iv_ruleFilterPattern=ruleFilterPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFilterPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterPattern7246); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4389:1: ruleFilterPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleFilterPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4394:6: ( ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4395:1: ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4395:1: ( KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4396:2: KEYWORD_63 KEYWORD_1 ( (lv_expression_2_0= ruleExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleFilterPattern7282); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFilterPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFilterPattern7293); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFilterPatternAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4405:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4406:1: (lv_expression_2_0= ruleExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4406:1: (lv_expression_2_0= ruleExpression )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4407:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFilterPatternAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFilterPattern7314);
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

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFilterPattern7325); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4442:1: entryRuleExistsPattern returns [EObject current=null] : iv_ruleExistsPattern= ruleExistsPattern EOF ;
    public final EObject entryRuleExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4443:2: (iv_ruleExistsPattern= ruleExistsPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4444:2: iv_ruleExistsPattern= ruleExistsPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExistsPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExistsPattern_in_entryRuleExistsPattern7360);
            iv_ruleExistsPattern=ruleExistsPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExistsPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsPattern7370); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4451:1: ruleExistsPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4456:6: ( ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4457:1: ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4457:1: ( KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4458:2: KEYWORD_63 KEYWORD_62 ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleExistsPattern7406); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExistsPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleExistsPattern7417); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExistsPatternAccess().getEXISTSKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4467:1: ( (lv_pattern_2_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4468:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4468:1: (lv_pattern_2_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4469:3: lv_pattern_2_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExistsPatternAccess().getPatternGroupGraphPatternParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleExistsPattern7438);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4499:1: entryRuleNotExistsPattern returns [EObject current=null] : iv_ruleNotExistsPattern= ruleNotExistsPattern EOF ;
    public final EObject entryRuleNotExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExistsPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4500:2: (iv_ruleNotExistsPattern= ruleNotExistsPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4501:2: iv_ruleNotExistsPattern= ruleNotExistsPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExistsPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExistsPattern_in_entryRuleNotExistsPattern7473);
            iv_ruleNotExistsPattern=ruleNotExistsPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExistsPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExistsPattern7483); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4508:1: ruleNotExistsPattern returns [EObject current=null] : ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleNotExistsPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4513:6: ( ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4514:1: ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4514:1: ( KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4515:2: KEYWORD_63 KEYWORD_33 KEYWORD_62 ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleNotExistsPattern7519); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getFILTERKeyword_0(), null); 
                  
            }
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleNotExistsPattern7530); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getNOTKeyword_1(), null); 
                  
            }
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleNotExistsPattern7541); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNotExistsPatternAccess().getEXISTSKeyword_2(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4529:1: ( (lv_pattern_3_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4530:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4530:1: (lv_pattern_3_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4531:3: lv_pattern_3_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotExistsPatternAccess().getPatternGroupGraphPatternParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleNotExistsPattern7562);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4561:1: entryRuleMinusPattern returns [EObject current=null] : iv_ruleMinusPattern= ruleMinusPattern EOF ;
    public final EObject entryRuleMinusPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusPattern = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4562:2: (iv_ruleMinusPattern= ruleMinusPattern EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4563:2: iv_ruleMinusPattern= ruleMinusPattern EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMinusPatternRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMinusPattern_in_entryRuleMinusPattern7597);
            iv_ruleMinusPattern=ruleMinusPattern();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMinusPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinusPattern7607); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4570:1: ruleMinusPattern returns [EObject current=null] : ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) ) ;
    public final EObject ruleMinusPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4575:6: ( ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4576:1: ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4576:1: ( KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4577:2: KEYWORD_52 ( (lv_pattern_1_0= ruleGroupGraphPattern ) )
            {
            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleMinusPattern7643); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMinusPatternAccess().getMINUSKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4581:1: ( (lv_pattern_1_0= ruleGroupGraphPattern ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4582:1: (lv_pattern_1_0= ruleGroupGraphPattern )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4582:1: (lv_pattern_1_0= ruleGroupGraphPattern )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4583:3: lv_pattern_1_0= ruleGroupGraphPattern
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMinusPatternAccess().getPatternGroupGraphPatternParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupGraphPattern_in_ruleMinusPattern7664);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4613:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4614:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4615:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7699);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7709); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4622:1: ruleExpression returns [EObject current=null] : (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndFilterExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4627:6: ( (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4628:1: (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4628:1: (this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4629:2: this_AndFilterExpression_0= ruleAndFilterExpression ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAndFilterExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndFilterExpression_in_ruleExpression7759);
            this_AndFilterExpression_0=ruleAndFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndFilterExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4640:1: ( () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+ )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KEYWORD_27) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4640:2: () ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4640:2: ()
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4641:2: 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4659:2: ( KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) ) )+
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
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4660:2: KEYWORD_27 ( (lv_entries_3_0= ruleAndFilterExpression ) )
                    	    {
                    	    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleExpression7783); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getExpressionAccess().getVerticalLineVerticalLineKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4664:1: ( (lv_entries_3_0= ruleAndFilterExpression ) )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4665:1: (lv_entries_3_0= ruleAndFilterExpression )
                    	    {
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4665:1: (lv_entries_3_0= ruleAndFilterExpression )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4666:3: lv_entries_3_0= ruleAndFilterExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getEntriesAndFilterExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndFilterExpression_in_ruleExpression7804);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4696:1: entryRuleAndFilterExpression returns [EObject current=null] : iv_ruleAndFilterExpression= ruleAndFilterExpression EOF ;
    public final EObject entryRuleAndFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4697:2: (iv_ruleAndFilterExpression= ruleAndFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4698:2: iv_ruleAndFilterExpression= ruleAndFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndFilterExpression_in_entryRuleAndFilterExpression7843);
            iv_ruleAndFilterExpression=ruleAndFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndFilterExpression7853); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4705:1: ruleAndFilterExpression returns [EObject current=null] : (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? ) ;
    public final EObject ruleAndFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteFilterExpression_0 = null;

        EObject lv_entries_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4710:6: ( (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4711:1: (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4711:1: (this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4712:2: this_ConcreteFilterExpression_0= ruleConcreteFilterExpression ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndFilterExpressionAccess().getConcreteFilterExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7903);
            this_ConcreteFilterExpression_0=ruleConcreteFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ConcreteFilterExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4723:1: ( () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+ )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==KEYWORD_19) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4723:2: () ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4723:2: ()
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4724:2: 
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

                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4742:2: ( KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) ) )+
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
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4743:2: KEYWORD_19 ( (lv_entries_3_0= ruleConcreteFilterExpression ) )
                    	    {
                    	    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAndFilterExpression7927); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAndFilterExpressionAccess().getAmpersandAmpersandKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4747:1: ( (lv_entries_3_0= ruleConcreteFilterExpression ) )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4748:1: (lv_entries_3_0= ruleConcreteFilterExpression )
                    	    {
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4748:1: (lv_entries_3_0= ruleConcreteFilterExpression )
                    	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4749:3: lv_entries_3_0= ruleConcreteFilterExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAndFilterExpressionAccess().getEntriesConcreteFilterExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7948);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4779:1: entryRuleConcreteFilterExpression returns [EObject current=null] : iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF ;
    public final EObject entryRuleConcreteFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4780:2: (iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4781:2: iv_ruleConcreteFilterExpression= ruleConcreteFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConcreteFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConcreteFilterExpression_in_entryRuleConcreteFilterExpression7987);
            iv_ruleConcreteFilterExpression=ruleConcreteFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConcreteFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteFilterExpression7997); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4788:1: ruleConcreteFilterExpression returns [EObject current=null] : (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression ) ;
    public final EObject ruleConcreteFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParFilterExpression_0 = null;

        EObject this_ExpressionFilterExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4793:6: ( (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4794:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4794:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )
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
                    new NoViableAltException("4794:1: (this_ParFilterExpression_0= ruleParFilterExpression | this_ExpressionFilterExpression_1= ruleExpressionFilterExpression )", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4795:2: this_ParFilterExpression_0= ruleParFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteFilterExpressionAccess().getParFilterExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParFilterExpression_in_ruleConcreteFilterExpression8047);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4808:2: this_ExpressionFilterExpression_1= ruleExpressionFilterExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConcreteFilterExpressionAccess().getExpressionFilterExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionFilterExpression_in_ruleConcreteFilterExpression8077);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4827:1: entryRuleParFilterExpression returns [EObject current=null] : iv_ruleParFilterExpression= ruleParFilterExpression EOF ;
    public final EObject entryRuleParFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4828:2: (iv_ruleParFilterExpression= ruleParFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4829:2: iv_ruleParFilterExpression= ruleParFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParFilterExpression_in_entryRuleParFilterExpression8111);
            iv_ruleParFilterExpression=ruleParFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParFilterExpression8121); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4836:1: ruleParFilterExpression returns [EObject current=null] : ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 ) ;
    public final EObject ruleParFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4841:6: ( ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4842:1: ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4842:1: ( KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4843:2: KEYWORD_1 this_Expression_1= ruleExpression KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParFilterExpression8157); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParFilterExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParFilterExpressionAccess().getExpressionParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParFilterExpression8182);
            this_Expression_1=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Expression_1; 
                      currentNode = currentNode.getParent();
                  
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParFilterExpression8192); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4872:1: entryRuleExpressionFilterExpression returns [EObject current=null] : iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF ;
    public final EObject entryRuleExpressionFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFilterExpression = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4873:2: (iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4874:2: iv_ruleExpressionFilterExpression= ruleExpressionFilterExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionFilterExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpressionFilterExpression_in_entryRuleExpressionFilterExpression8227);
            iv_ruleExpressionFilterExpression=ruleExpressionFilterExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpressionFilterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFilterExpression8237); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4881:1: ruleExpressionFilterExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) ) ;
    public final EObject ruleExpressionFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4886:6: ( ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4887:1: ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4887:1: ( ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4887:2: ( (lv_left_0_0= ruleFilterNode ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleFilterNode ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4887:2: ( (lv_left_0_0= ruleFilterNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4888:1: (lv_left_0_0= ruleFilterNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4888:1: (lv_left_0_0= ruleFilterNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4889:3: lv_left_0_0= ruleFilterNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getLeftFilterNodeParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8283);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4911:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4912:1: (lv_operator_1_0= ruleOperator )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4912:1: (lv_operator_1_0= ruleOperator )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4913:3: lv_operator_1_0= ruleOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getOperatorOperatorEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleExpressionFilterExpression8304);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4935:2: ( (lv_right_2_0= ruleFilterNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4936:1: (lv_right_2_0= ruleFilterNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4936:1: (lv_right_2_0= ruleFilterNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4937:3: lv_right_2_0= ruleFilterNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionFilterExpressionAccess().getRightFilterNodeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8325);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4967:1: entryRuleFilterNode returns [EObject current=null] : iv_ruleFilterNode= ruleFilterNode EOF ;
    public final EObject entryRuleFilterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterNode = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4968:2: (iv_ruleFilterNode= ruleFilterNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4969:2: iv_ruleFilterNode= ruleFilterNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFilterNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFilterNode_in_entryRuleFilterNode8360);
            iv_ruleFilterNode=ruleFilterNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFilterNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterNode8370); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4976:1: ruleFilterNode returns [EObject current=null] : (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction ) ;
    public final EObject ruleFilterNode() throws RecognitionException {
        EObject current = null;

        EObject this_GraphNode_0 = null;

        EObject this_Function_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4981:6: ( (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KEYWORD_22||LA77_0==KEYWORD_26||LA77_0==KEYWORD_14||(LA77_0>=RULE_IRI_TERMINAL && LA77_0<=RULE_STRING)||LA77_0==RULE_INT) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID) ) {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==KEYWORD_1) ) {
                    alt77=2;
                }
                else if ( (LA77_2==KEYWORD_9) ) {
                    int LA77_4 = input.LA(3);

                    if ( (LA77_4==RULE_ID) ) {
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
                                new NoViableAltException("4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4982:1: (this_GraphNode_0= ruleGraphNode | this_Function_1= ruleFunction )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4983:2: this_GraphNode_0= ruleGraphNode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFilterNodeAccess().getGraphNodeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleGraphNode_in_ruleFilterNode8420);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:4996:2: this_Function_1= ruleFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFilterNodeAccess().getFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleFilterNode8450);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5015:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5016:2: (iv_ruleFunction= ruleFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5017:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction8484);
            iv_ruleFunction=ruleFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction8494); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5024:1: ruleFunction returns [EObject current=null] : (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFunction_0 = null;

        EObject this_SparqlFunction_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5029:6: ( (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5030:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5030:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )
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
                        new NoViableAltException("5030:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5030:1: (this_NamedFunction_0= ruleNamedFunction | this_SparqlFunction_1= ruleSparqlFunction )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5031:2: this_NamedFunction_0= ruleNamedFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNamedFunctionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedFunction_in_ruleFunction8544);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5044:2: this_SparqlFunction_1= ruleSparqlFunction
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getSparqlFunctionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSparqlFunction_in_ruleFunction8574);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5063:1: entryRuleNamedFunction returns [EObject current=null] : iv_ruleNamedFunction= ruleNamedFunction EOF ;
    public final EObject entryRuleNamedFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5067:2: (iv_ruleNamedFunction= ruleNamedFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5068:2: iv_ruleNamedFunction= ruleNamedFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedFunction_in_entryRuleNamedFunction8614);
            iv_ruleNamedFunction=ruleNamedFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFunction8624); if (failed) return current;

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5078:1: ruleNamedFunction returns [EObject current=null] : ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 ) ;
    public final EObject ruleNamedFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5084:6: ( ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5085:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5085:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5085:2: ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_4_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )? KEYWORD_2
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5085:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5086:1: ( RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5086:1: ( RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5087:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedFunction8675); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getNamedFunctionAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
              	
            }

            }


            }

            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNamedFunction8686); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedFunctionAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5107:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5108:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5108:1: (lv_name_2_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5109:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedFunction8703); if (failed) return current;
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

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNamedFunction8719); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedFunctionAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5136:1: ( (lv_parameters_4_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5137:1: (lv_parameters_4_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5137:1: (lv_parameters_4_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5138:3: lv_parameters_4_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNamedFunctionAccess().getParametersVariableParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNamedFunction8740);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5160:2: ( KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KEYWORD_5) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5161:2: KEYWORD_5 ( (lv_parameters_6_0= ruleVariable ) )
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNamedFunction8752); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNamedFunctionAccess().getCommaKeyword_5_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5165:1: ( (lv_parameters_6_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5166:1: (lv_parameters_6_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5166:1: (lv_parameters_6_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5167:3: lv_parameters_6_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNamedFunctionAccess().getParametersVariableParserRuleCall_5_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleNamedFunction8773);
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

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNamedFunction8786); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5205:1: entryRuleSparqlFunction returns [EObject current=null] : iv_ruleSparqlFunction= ruleSparqlFunction EOF ;
    public final EObject entryRuleSparqlFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlFunction = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5206:2: (iv_ruleSparqlFunction= ruleSparqlFunction EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5207:2: iv_ruleSparqlFunction= ruleSparqlFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSparqlFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSparqlFunction_in_entryRuleSparqlFunction8825);
            iv_ruleSparqlFunction=ruleSparqlFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSparqlFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlFunction8835); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5214:1: ruleSparqlFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 ) ;
    public final EObject ruleSparqlFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5219:6: ( ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5220:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5220:1: ( ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5220:2: ( (lv_name_0_0= RULE_ID ) ) KEYWORD_1 ( (lv_parameters_2_0= ruleVariable ) ) ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )? KEYWORD_2
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5220:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5221:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5221:1: (lv_name_0_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5222:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSparqlFunction8877); if (failed) return current;
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

            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSparqlFunction8893); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSparqlFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5249:1: ( (lv_parameters_2_0= ruleVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5250:1: (lv_parameters_2_0= ruleVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5250:1: (lv_parameters_2_0= ruleVariable )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5251:3: lv_parameters_2_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSparqlFunctionAccess().getParametersVariableParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleSparqlFunction8914);
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5273:2: ( KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KEYWORD_5) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5274:2: KEYWORD_5 ( (lv_parameters_4_0= ruleVariable ) )
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSparqlFunction8926); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSparqlFunctionAccess().getCommaKeyword_3_0(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5278:1: ( (lv_parameters_4_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5279:1: (lv_parameters_4_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5279:1: (lv_parameters_4_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5280:3: lv_parameters_4_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSparqlFunctionAccess().getParametersVariableParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleSparqlFunction8947);
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

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSparqlFunction8960); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5315:1: entryRuleBuiltInCall returns [EObject current=null] : iv_ruleBuiltInCall= ruleBuiltInCall EOF ;
    public final EObject entryRuleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInCall = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5316:2: (iv_ruleBuiltInCall= ruleBuiltInCall EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5317:2: iv_ruleBuiltInCall= ruleBuiltInCall EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBuiltInCallRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall8995);
            iv_ruleBuiltInCall=ruleBuiltInCall();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBuiltInCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInCall9005); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5324:1: ruleBuiltInCall returns [EObject current=null] : ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) ) ;
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
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5329:6: ( ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5330:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5330:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )
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
                    new NoViableAltException("5330:1: ( ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 ) | ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 ) | ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 ) )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5330:2: ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5330:2: ( KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5331:2: KEYWORD_34 KEYWORD_1 ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleBuiltInCall9042); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRKeyword_0_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9053); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_0_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5340:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5341:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5341:1: (lv_expr_2_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5342:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9074);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9085); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_0_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5370:6: ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5370:6: ( KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5371:2: KEYWORD_42 KEYWORD_1 ( (lv_expr_6_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleBuiltInCall9104); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLANGKeyword_1_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9115); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5380:1: ( (lv_expr_6_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5381:1: (lv_expr_6_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5381:1: (lv_expr_6_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5382:3: lv_expr_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9136);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9147); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5410:6: ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5410:6: ( KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5411:2: KEYWORD_83 KEYWORD_1 ( (lv_left_10_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_12_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleBuiltInCall9166); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLANGMATCHESKeyword_2_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9177); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_2_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5420:1: ( (lv_left_10_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5421:1: (lv_left_10_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5421:1: (lv_left_10_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5422:3: lv_left_10_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9198);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9209); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_2_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5449:1: ( (lv_right_12_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5450:1: (lv_right_12_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5450:1: (lv_right_12_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5451:3: lv_right_12_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_2_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9230);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9241); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_2_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5479:6: ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5479:6: ( KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5480:2: KEYWORD_75 KEYWORD_1 ( (lv_expr_16_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleBuiltInCall9260); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getDATATYPEKeyword_3_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9271); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_3_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5489:1: ( (lv_expr_16_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5490:1: (lv_expr_16_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5490:1: (lv_expr_16_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5491:3: lv_expr_16_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9292);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_3_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5519:6: ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5519:6: ( KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5520:2: KEYWORD_46 KEYWORD_1 ( (lv_var_20_0= ruleVariable ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleBuiltInCall9322); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getBOUNDKeyword_4_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9333); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_4_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5529:1: ( (lv_var_20_0= ruleVariable ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5530:1: (lv_var_20_0= ruleVariable )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5530:1: (lv_var_20_0= ruleVariable )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5531:3: lv_var_20_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getVarVariableParserRuleCall_4_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleBuiltInCall9354);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9365); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_4_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5559:6: ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5559:6: ( KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5560:2: KEYWORD_30 KEYWORD_1 ( (lv_expr_24_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleBuiltInCall9384); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIRIKeyword_5_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_5_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5569:1: ( (lv_expr_24_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5570:1: (lv_expr_24_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5570:1: (lv_expr_24_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5571:3: lv_expr_24_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_5_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9416);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_5_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5599:6: ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5599:6: ( KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5600:2: KEYWORD_36 KEYWORD_1 ( (lv_expr_28_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleBuiltInCall9446); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getURIKeyword_6_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9457); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_6_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5609:1: ( (lv_expr_28_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5610:1: (lv_expr_28_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5610:1: (lv_expr_28_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5611:3: lv_expr_28_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_6_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9478);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9489); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_6_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5639:6: ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5639:6: ( KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5640:2: KEYWORD_45 KEYWORD_1 ( (lv_expr_32_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleBuiltInCall9508); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getBNODEKeyword_7_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9519); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_7_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5649:1: ( (lv_expr_32_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5650:1: (lv_expr_32_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5650:1: (lv_expr_32_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5651:3: lv_expr_32_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_7_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9540);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9551); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_7_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5679:6: ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5679:6: ( KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5680:2: KEYWORD_24 KEYWORD_1 ( (lv_ifExpr_36_0= ruleExpression ) ) KEYWORD_5 ( (lv_thenExpr_38_0= ruleExpression ) ) KEYWORD_5 ( (lv_elseExpr_40_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleBuiltInCall9570); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIFKeyword_8_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9581); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_8_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5689:1: ( (lv_ifExpr_36_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5690:1: (lv_ifExpr_36_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5690:1: (lv_ifExpr_36_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5691:3: lv_ifExpr_36_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getIfExprExpressionParserRuleCall_8_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9602);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9613); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_8_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5718:1: ( (lv_thenExpr_38_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5719:1: (lv_thenExpr_38_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5719:1: (lv_thenExpr_38_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5720:3: lv_thenExpr_38_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getThenExprExpressionParserRuleCall_8_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9634);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9645); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_8_5(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5747:1: ( (lv_elseExpr_40_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5748:1: (lv_elseExpr_40_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5748:1: (lv_elseExpr_40_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5749:3: lv_elseExpr_40_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getElseExprExpressionParserRuleCall_8_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9666);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9677); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_8_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5777:6: ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5777:6: ( KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5778:2: KEYWORD_73 KEYWORD_1 ( (lv_left_44_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_46_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleBuiltInCall9696); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRLANGKeyword_9_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9707); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_9_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5787:1: ( (lv_left_44_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5788:1: (lv_left_44_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5788:1: (lv_left_44_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5789:3: lv_left_44_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_9_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9728);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9739); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_9_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5816:1: ( (lv_right_46_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5817:1: (lv_right_46_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5817:1: (lv_right_46_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5818:3: lv_right_46_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_9_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9760);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9771); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_9_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5846:6: ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5846:6: ( KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5847:2: KEYWORD_54 KEYWORD_1 ( (lv_left_50_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_52_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleBuiltInCall9790); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSTRDTKeyword_10_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9801); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_10_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5856:1: ( (lv_left_50_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5857:1: (lv_left_50_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5857:1: (lv_left_50_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5858:3: lv_left_50_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9822);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9833); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_10_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5885:1: ( (lv_right_52_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5886:1: (lv_right_52_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5886:1: (lv_right_52_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5887:3: lv_right_52_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_10_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9854);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9865); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_10_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5915:6: ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5915:6: ( KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5916:2: KEYWORD_79 KEYWORD_1 ( (lv_left_56_0= ruleExpression ) ) KEYWORD_5 ( (lv_right_58_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleBuiltInCall9884); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getSameTermKeyword_11_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9895); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_11_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5925:1: ( (lv_left_56_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5926:1: (lv_left_56_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5926:1: (lv_left_56_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5927:3: lv_left_56_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getLeftExpressionParserRuleCall_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9916);
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

                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleBuiltInCall9927); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_11_3(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5954:1: ( (lv_right_58_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5955:1: (lv_right_58_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5955:1: (lv_right_58_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5956:3: lv_right_58_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRightExpressionParserRuleCall_11_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall9948);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall9959); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_11_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5984:6: ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5984:6: ( KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5985:2: KEYWORD_58 KEYWORD_1 ( (lv_expr_62_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleBuiltInCall9978); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsIRIKeyword_12_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall9989); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_12_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5994:1: ( (lv_expr_62_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5995:1: (lv_expr_62_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5995:1: (lv_expr_62_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:5996:3: lv_expr_62_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_12_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10010);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10021); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_12_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6024:6: ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6024:6: ( KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6025:2: KEYWORD_59 KEYWORD_1 ( (lv_expr_66_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleBuiltInCall10040); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsURIKeyword_13_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10051); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_13_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6034:1: ( (lv_expr_66_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6035:1: (lv_expr_66_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6035:1: (lv_expr_66_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6036:3: lv_expr_66_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_13_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10072);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10083); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_13_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6064:6: ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6064:6: ( KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6065:2: KEYWORD_74 KEYWORD_1 ( (lv_expr_70_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleBuiltInCall10102); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsBLANKKeyword_14_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10113); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_14_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6074:1: ( (lv_expr_70_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6075:1: (lv_expr_70_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6075:1: (lv_expr_70_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6076:3: lv_expr_70_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_14_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10134);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10145); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_14_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6104:6: ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6104:6: ( KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6105:2: KEYWORD_82 KEYWORD_1 ( (lv_expr_74_0= ruleExpression ) ) KEYWORD_2
                    {
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleBuiltInCall10164); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getIsLITERALKeyword_15_0(), null); 
                          
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleBuiltInCall10175); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_15_1(), null); 
                          
                    }
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6114:1: ( (lv_expr_74_0= ruleExpression ) )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6115:1: (lv_expr_74_0= ruleExpression )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6115:1: (lv_expr_74_0= ruleExpression )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6116:3: lv_expr_74_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExprExpressionParserRuleCall_15_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall10196);
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

                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleBuiltInCall10207); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6153:1: entryRuleExprAggArg returns [EObject current=null] : iv_ruleExprAggArg= ruleExprAggArg EOF ;
    public final EObject entryRuleExprAggArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAggArg = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6154:2: (iv_ruleExprAggArg= ruleExprAggArg EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6155:2: iv_ruleExprAggArg= ruleExprAggArg EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprAggArgRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExprAggArg_in_entryRuleExprAggArg10245);
            iv_ruleExprAggArg=ruleExprAggArg();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExprAggArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAggArg10255); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6162:1: ruleExprAggArg returns [EObject current=null] : ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) ;
    public final EObject ruleExprAggArg() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_1_0=null;
        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6167:6: ( ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6168:1: ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6168:1: ( KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2 )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6169:2: KEYWORD_1 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expr_2_0= ruleExpression ) ) KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleExprAggArg10291); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExprAggArgAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6173:1: ( (lv_isDistinct_1_0= KEYWORD_77 ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==KEYWORD_77) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6174:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6174:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6175:3: lv_isDistinct_1_0= KEYWORD_77
                    {
                    lv_isDistinct_1_0=(Token)input.LT(1);
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleExprAggArg10310); if (failed) return current;
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6195:3: ( (lv_expr_2_0= ruleExpression ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6196:1: (lv_expr_2_0= ruleExpression )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6196:1: (lv_expr_2_0= ruleExpression )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6197:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExprAggArgAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExprAggArg10345);
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

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleExprAggArg10356); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6232:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6233:2: (iv_ruleGraphNode= ruleGraphNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6234:2: iv_ruleGraphNode= ruleGraphNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGraphNode_in_entryRuleGraphNode10391);
            iv_ruleGraphNode=ruleGraphNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGraphNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphNode10401); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6241:1: ruleGraphNode returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter ) ;
    public final EObject ruleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Value_1 = null;

        EObject this_IRI_2 = null;

        EObject this_BlankNode_3 = null;

        EObject this_Parameter_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6246:6: ( (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6247:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6247:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )
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
                    new NoViableAltException("6247:1: (this_Variable_0= ruleVariable | this_Value_1= ruleValue | this_IRI_2= ruleIRI | this_BlankNode_3= ruleBlankNode | this_Parameter_4= ruleParameter )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6248:2: this_Variable_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getVariableParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleGraphNode10451);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6261:2: this_Value_1= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleGraphNode10481);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6274:2: this_IRI_2= ruleIRI
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getIRIParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIRI_in_ruleGraphNode10511);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6287:2: this_BlankNode_3= ruleBlankNode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getBlankNodeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlankNode_in_ruleGraphNode10541);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6300:2: this_Parameter_4= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getGraphNodeAccess().getParameterParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleGraphNode10571);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6319:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6320:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6321:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable10605);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable10615); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6328:1: ruleVariable returns [EObject current=null] : (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_UnNamedVariable_0 = null;

        EObject this_NamedVariable_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6333:6: ( (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6334:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6334:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )
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
                    new NoViableAltException("6334:1: (this_UnNamedVariable_0= ruleUnNamedVariable | this_NamedVariable_1= ruleNamedVariable )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6335:2: this_UnNamedVariable_0= ruleUnNamedVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getUnNamedVariableParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnNamedVariable_in_ruleVariable10665);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6348:2: this_NamedVariable_1= ruleNamedVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getVariableAccess().getNamedVariableParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedVariable_in_ruleVariable10695);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6367:1: entryRuleUnNamedVariable returns [EObject current=null] : iv_ruleUnNamedVariable= ruleUnNamedVariable EOF ;
    public final EObject entryRuleUnNamedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNamedVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6368:2: (iv_ruleUnNamedVariable= ruleUnNamedVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6369:2: iv_ruleUnNamedVariable= ruleUnNamedVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnNamedVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnNamedVariable_in_entryRuleUnNamedVariable10729);
            iv_ruleUnNamedVariable=ruleUnNamedVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnNamedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNamedVariable10739); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6376:1: ruleUnNamedVariable returns [EObject current=null] : ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnNamedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6381:6: ( ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6382:1: ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6382:1: ( KEYWORD_14 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6383:2: KEYWORD_14 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleUnNamedVariable10775); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnNamedVariableAccess().getQuestionMarkKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6387:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6388:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6388:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6389:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnNamedVariable10792); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6419:1: entryRuleNamedVariable returns [EObject current=null] : iv_ruleNamedVariable= ruleNamedVariable EOF ;
    public final EObject entryRuleNamedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedVariable = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6420:2: (iv_ruleNamedVariable= ruleNamedVariable EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6421:2: iv_ruleNamedVariable= ruleNamedVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedVariable_in_entryRuleNamedVariable10832);
            iv_ruleNamedVariable=ruleNamedVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedVariable10842); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6428:1: ruleNamedVariable returns [EObject current=null] : ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNamedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6433:6: ( ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6434:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6434:1: ( ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6434:2: ( ( RULE_ID ) ) KEYWORD_9 ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6434:2: ( ( RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6435:1: ( RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6435:1: ( RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6436:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedVariable10889); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getNamedVariableAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
              	
            }

            }


            }

            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNamedVariable10900); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedVariableAccess().getColonKeyword_1(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6456:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6457:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6457:1: (lv_name_2_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6458:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedVariable10917); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6488:1: entryRuleBlankNode returns [EObject current=null] : iv_ruleBlankNode= ruleBlankNode EOF ;
    public final EObject entryRuleBlankNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlankNode = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6492:2: (iv_ruleBlankNode= ruleBlankNode EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6493:2: iv_ruleBlankNode= ruleBlankNode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlankNodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlankNode_in_entryRuleBlankNode10963);
            iv_ruleBlankNode=ruleBlankNode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlankNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankNode10973); if (failed) return current;

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6503:1: ruleBlankNode returns [EObject current=null] : ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBlankNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6509:6: ( ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6510:1: ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6510:1: ( KEYWORD_26 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6511:2: KEYWORD_26 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleBlankNode11013); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlankNodeAccess().get_Keyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6515:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6516:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6516:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6517:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlankNode11030); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6550:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6554:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6555:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter11080);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter11090); if (failed) return current;

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6565:1: ruleParameter returns [EObject current=null] : ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6571:6: ( ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6572:1: ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6572:1: ( KEYWORD_22 ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6573:2: KEYWORD_22 ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleParameter11130); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParameterAccess().getQuestionMarkColonKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6577:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6578:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6578:1: (lv_name_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6579:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter11147); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6612:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6613:2: (iv_ruleValue= ruleValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6614:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue11191);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue11201); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6621:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6626:6: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6627:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6627:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
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
                    new NoViableAltException("6627:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6628:2: this_StringValue_0= ruleStringValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue11251);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6641:2: this_IntegerValue_1= ruleIntegerValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValue11281);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6660:1: entryRuleIRI returns [EObject current=null] : iv_ruleIRI= ruleIRI EOF ;
    public final EObject entryRuleIRI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIRI = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6661:2: (iv_ruleIRI= ruleIRI EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6662:2: iv_ruleIRI= ruleIRI EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIRIRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIRI_in_entryRuleIRI11315);
            iv_ruleIRI=ruleIRI();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIRI; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIRI11325); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6669:1: ruleIRI returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) ) ;
    public final EObject ruleIRI() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6674:6: ( ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6675:1: ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6675:1: ( () ( (lv_value_1_0= RULE_IRI_TERMINAL ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6675:2: () ( (lv_value_1_0= RULE_IRI_TERMINAL ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6675:2: ()
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6676:2: 
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6689:2: ( (lv_value_1_0= RULE_IRI_TERMINAL ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6690:1: (lv_value_1_0= RULE_IRI_TERMINAL )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6690:1: (lv_value_1_0= RULE_IRI_TERMINAL )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6691:3: lv_value_1_0= RULE_IRI_TERMINAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleIRI11379); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6721:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6722:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6723:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue11419);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue11429); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6730:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6735:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6736:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6736:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6736:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6736:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6737:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6737:1: (lv_value_0_0= RULE_STRING )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6738:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue11471); if (failed) return current;
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6760:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==KEYWORD_25||LA86_0==KEYWORD_15) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6761:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6761:1: (lv_tag_1_0= ruleRDFTag )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6762:3: lv_tag_1_0= ruleRDFTag
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleStringValue11497);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6792:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6793:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6794:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntegerValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue11533);
            iv_ruleIntegerValue=ruleIntegerValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue11543); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6801:1: ruleIntegerValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6806:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6807:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6807:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6807:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6807:2: ( (lv_value_0_0= RULE_INT ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6808:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6808:1: (lv_value_0_0= RULE_INT )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6809:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerValue11585); if (failed) return current;
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

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6831:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==KEYWORD_25||LA87_0==KEYWORD_15) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6832:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6832:1: (lv_tag_1_0= ruleRDFTag )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6833:3: lv_tag_1_0= ruleRDFTag
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleIntegerValue11611);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6863:1: entryRuleRDFTag returns [EObject current=null] : iv_ruleRDFTag= ruleRDFTag EOF ;
    public final EObject entryRuleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDFTag = null;


        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6864:2: (iv_ruleRDFTag= ruleRDFTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6865:2: iv_ruleRDFTag= ruleRDFTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRDFTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag11647);
            iv_ruleRDFTag=ruleRDFTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRDFTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag11657); if (failed) return current;

            }

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6872:1: ruleRDFTag returns [EObject current=null] : (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) ;
    public final EObject ruleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject this_TypeTag_0 = null;

        EObject this_LangTag_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6877:6: ( (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6878:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6878:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
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
                    new NoViableAltException("6878:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6879:2: this_TypeTag_0= ruleTypeTag
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeTag_in_ruleRDFTag11707);
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
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6892:2: this_LangTag_1= ruleLangTag
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLangTag_in_ruleRDFTag11737);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6911:1: entryRuleTypeTag returns [EObject current=null] : iv_ruleTypeTag= ruleTypeTag EOF ;
    public final EObject entryRuleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6915:2: (iv_ruleTypeTag= ruleTypeTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6916:2: iv_ruleTypeTag= ruleTypeTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag11777);
            iv_ruleTypeTag=ruleTypeTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag11787); if (failed) return current;

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6926:1: ruleTypeTag returns [EObject current=null] : ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) ) ;
    public final EObject ruleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6932:6: ( ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6933:1: ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6933:1: ( KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6934:2: KEYWORD_25 ( (lv_type_1_0= ruleGraphNode ) )
            {
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleTypeTag11827); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6938:1: ( (lv_type_1_0= ruleGraphNode ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6939:1: (lv_type_1_0= ruleGraphNode )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6939:1: (lv_type_1_0= ruleGraphNode )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6940:3: lv_type_1_0= ruleGraphNode
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeTagAccess().getTypeGraphNodeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphNode_in_ruleTypeTag11848);
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6973:1: entryRuleLangTag returns [EObject current=null] : iv_ruleLangTag= ruleLangTag EOF ;
    public final EObject entryRuleLangTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6977:2: (iv_ruleLangTag= ruleLangTag EOF )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6978:2: iv_ruleLangTag= ruleLangTag EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLangTagRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag11893);
            iv_ruleLangTag=ruleLangTag();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLangTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag11903); if (failed) return current;

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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6988:1: ruleLangTag returns [EObject current=null] : ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLangTag() throws RecognitionException {
        EObject current = null;

        Token lv_lang_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6994:6: ( ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6995:1: ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6995:1: ( KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:6996:2: KEYWORD_15 ( (lv_lang_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleLangTag11943); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7000:1: ( (lv_lang_1_0= RULE_ID ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7001:1: (lv_lang_1_0= RULE_ID )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7001:1: (lv_lang_1_0= RULE_ID )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7002:3: lv_lang_1_0= RULE_ID
            {
            lv_lang_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangTag11960); if (failed) return current;
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
    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7035:1: ruleOperator returns [Enumerator current=null] : ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7039:6: ( ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7040:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7040:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )
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
                    new NoViableAltException("7040:1: ( ( KEYWORD_11 ) | ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_21 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_6 ) | ( KEYWORD_3 ) )", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7040:2: ( KEYWORD_11 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7040:2: ( KEYWORD_11 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7040:7: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOperator12020); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7046:6: ( KEYWORD_13 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7046:6: ( KEYWORD_13 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7046:11: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOperator12037); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7052:6: ( KEYWORD_20 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7052:6: ( KEYWORD_20 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7052:11: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleOperator12054); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7058:6: ( KEYWORD_21 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7058:6: ( KEYWORD_21 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7058:11: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleOperator12071); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7064:6: ( KEYWORD_12 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7064:6: ( KEYWORD_12 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7064:11: KEYWORD_12
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleOperator12088); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7070:6: ( KEYWORD_18 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7070:6: ( KEYWORD_18 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7070:11: KEYWORD_18
                    {
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleOperator12105); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7076:6: ( KEYWORD_4 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7076:6: ( KEYWORD_4 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7076:11: KEYWORD_4
                    {
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOperator12122); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getSumEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getSumEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7082:6: ( KEYWORD_8 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7082:6: ( KEYWORD_8 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7082:11: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOperator12139); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7088:6: ( KEYWORD_6 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7088:6: ( KEYWORD_6 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7088:11: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOperator12156); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7094:6: ( KEYWORD_3 )
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7094:6: ( KEYWORD_3 )
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:7094:11: KEYWORD_3
                    {
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOperator12173); if (failed) return current;
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

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2718:2: ( KEYWORD_65 ( ( ruleGroupGraphPattern ) ) )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2718:2: KEYWORD_65 ( ( ruleGroupGraphPattern ) )
        {
        match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_synpred674098); if (failed) return ;
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2722:1: ( ( ruleGroupGraphPattern ) )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2723:1: ( ruleGroupGraphPattern )
        {
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2723:1: ( ruleGroupGraphPattern )
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/internal/InternalSparql.g:2724:3: ruleGroupGraphPattern
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDeleteQueryAccess().getInsertPatternGroupGraphPatternParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleGroupGraphPattern_in_synpred674119);
        ruleGroupGraphPattern();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred67

    public final boolean synpred67() {
        backtracking++;
        int start = input.mark();
        try {
            synpred67_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleModifyQuery2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2750 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleInsertQuery_in_ruleModifyQuery2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleModifyQuery2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2815 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleInsertDataQuery_in_ruleModifyQuery2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleModifyQuery2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleDeleteQuery_in_ruleModifyQuery2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleModifyQuery2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery2945 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleDeleteDataQuery_in_ruleModifyQuery2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleModifyQuery2993 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleModifyQuery3010 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleDeleteWhereQuery_in_ruleModifyQuery3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateGraphQuery_in_entryRuleCreateGraphQuery3074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateGraphQuery3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleCreateGraphQuery3120 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleCreateGraphQuery3139 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleCreateGraphQuery3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleCreateGraphQuery3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropGraphQuery_in_entryRuleDropGraphQuery3221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropGraphQuery3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleDropGraphQuery3267 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleDropGraphQuery3286 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleDropGraphQuery3311 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDropGraphQuery3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadGraphQuery_in_entryRuleLoadGraphQuery3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadGraphQuery3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleLoadGraphQuery3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3431 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleLoadGraphQuery3448 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleLoadGraphQuery3459 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleLoadGraphQuery3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClearGraphQuery_in_entryRuleClearGraphQuery3518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClearGraphQuery3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleClearGraphQuery3564 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleClearGraphQuery3575 = new BitSet(new long[]{0x0000000000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleClearGraphQuery3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleClearGraphQuery3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertQuery_in_entryRuleInsertQuery3674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertQuery3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleInsertQuery3720 = new BitSet(new long[]{0x0001000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleInsertQuery3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertQuery3749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleInsertQuery3777 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleInsertQuery3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertDataQuery_in_entryRuleInsertDataQuery3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertDataQuery3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleInsertDataQuery3880 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleInsertDataQuery3891 = new BitSet(new long[]{0x0001000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleInsertDataQuery3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleInsertDataQuery3920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleInsertDataQuery3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteQuery_in_entryRuleDeleteQuery3983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteQuery3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteQuery4029 = new BitSet(new long[]{0x0000800000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDeleteQuery4041 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteQuery4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4086 = new BitSet(new long[]{0x0000020001000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleDeleteQuery4098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteQuery4119 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteQuery4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteDataQuery_in_entryRuleDeleteDataQuery4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteDataQuery4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteDataQuery4224 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleDeleteDataQuery4235 = new BitSet(new long[]{0x0000800000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDeleteDataQuery4247 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleDeleteDataQuery4264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteDataQuery4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteWhereQuery_in_entryRuleDeleteWhereQuery4327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteWhereQuery4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleDeleteWhereQuery4373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleDeleteWhereQuery4384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleDeleteWhereQuery4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleDeleteWhereQuery4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleDeleteWhereQuery4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatasetClause_in_entryRuleDatasetClause4462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatasetClause4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultDataSet_in_ruleDatasetClause4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedDataSet_in_ruleDatasetClause4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDataSet_in_ruleDatasetClause4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultDataSet_in_entryRuleDefaultDataSet4616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultDataSet4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleDefaultDataSet4662 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleDefaultDataSet4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedDataSet_in_entryRuleNamedDataSet4718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedDataSet4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleNamedDataSet4764 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleNamedDataSet4775 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleNamedDataSet4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceDataSet_in_entryRuleServiceDataSet4831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDataSet4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleServiceDataSet4877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleServiceDataSet4888 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleServiceDataSet4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleWhereClause4990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleWhereClause5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_entryRuleGroupClause5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupClause5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleGroupClause5092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleGroupClause5103 = new BitSet(new long[]{0x14420C4060062320L,0x0000000004100008L});
    public static final BitSet FOLLOW_ruleGroupCondition_in_ruleGroupClause5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupCondition_in_entryRuleGroupCondition5159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupCondition5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleGroupCondition5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleGroupCondition5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleGroupCondition5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause5313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleHavingClause5359 = new BitSet(new long[]{0x14420C4060062320L,0x0000000004000088L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleHavingClause5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint5415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_ruleConstraint5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleConstraint5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleConstraint5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimitClause_in_entryRuleLimitClause5569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimitClause5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleLimitClause5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLimitClause5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_entryRuleGroupGraphPattern5672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupGraphPattern5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelectQuery_in_ruleGroupGraphPattern5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPatternSub_in_ruleGroupGraphPattern5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSelectQuery_in_entryRuleSubSelectQuery5796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelectQuery5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSubSelectQuery5842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleSubSelectQuery5853 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSubSelectQuery5874 = new BitSet(new long[]{0x0000020000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSubSelectQuery5895 = new BitSet(new long[]{0x0000020000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSubSelectQuery5917 = new BitSet(new long[]{0x0000000400800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSubSelectQuery5938 = new BitSet(new long[]{0x0000000000800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSubSelectQuery5960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleSubSelectQuery5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPatternSub_in_entryRuleGroupGraphPatternSub6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupGraphPatternSub6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleGroupGraphPatternSub6053 = new BitSet(new long[]{0x0000001200411000L,0x000000000F500022L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6086 = new BitSet(new long[]{0x0000001200411000L,0x000000000F500022L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_ruleGroupGraphPatternSub6107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000802000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleGroupGraphPatternSub6121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleGroupGraphPatternSub6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphPattern_in_entryRuleGraphPattern6169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphPattern6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriplesSameSubject_in_ruleGraphPattern6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupOrUnionGraphPattern_in_ruleGraphPattern6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalGraphPattern_in_ruleGraphPattern6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphGraphPattern_in_ruleGraphPattern6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceGraphPattern_in_ruleGraphPattern6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_ruleGraphPattern6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsPattern_in_ruleGraphPattern6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExistsPattern_in_ruleGraphPattern6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinusPattern_in_ruleGraphPattern6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriplesSameSubject_in_entryRuleTriplesSameSubject6503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriplesSameSubject6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleTriplesSameSubject6559 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleTriplesSameSubject6592 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_rulePropertyList_in_ruleTriplesSameSubject6613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleGroupOrUnionGraphPattern_in_entryRuleGroupOrUnionGraphPattern6650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupOrUnionGraphPattern6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6706 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleGroupOrUnionGraphPattern6718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGroupOrUnionGraphPattern6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalGraphPattern_in_entryRuleOptionalGraphPattern6776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalGraphPattern6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleOptionalGraphPattern6822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleOptionalGraphPattern6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyList_in_entryRulePropertyList6878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyList6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_rulePropertyList6934 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_rulePropertyList6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphGraphPattern_in_entryRuleGraphGraphPattern6990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphGraphPattern7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleGraphGraphPattern7036 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleGraphGraphPattern7057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleGraphGraphPattern7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceGraphPattern_in_entryRuleServiceGraphPattern7113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceGraphPattern7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleServiceGraphPattern7159 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleServiceGraphPattern7180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleServiceGraphPattern7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterPattern_in_entryRuleFilterPattern7236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterPattern7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleFilterPattern7282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFilterPattern7293 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterPattern7314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFilterPattern7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsPattern_in_entryRuleExistsPattern7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsPattern7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleExistsPattern7406 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleExistsPattern7417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleExistsPattern7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExistsPattern_in_entryRuleNotExistsPattern7473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExistsPattern7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleNotExistsPattern7519 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleNotExistsPattern7530 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleNotExistsPattern7541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleNotExistsPattern7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinusPattern_in_entryRuleMinusPattern7597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinusPattern7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleMinusPattern7643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_ruleMinusPattern7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_ruleExpression7759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleExpression7783 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_ruleExpression7804 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAndFilterExpression_in_entryRuleAndFilterExpression7843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndFilterExpression7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7903 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAndFilterExpression7927 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_ruleAndFilterExpression7948 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteFilterExpression_in_entryRuleConcreteFilterExpression7987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteFilterExpression7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_ruleConcreteFilterExpression8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFilterExpression_in_ruleConcreteFilterExpression8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParFilterExpression_in_entryRuleParFilterExpression8111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParFilterExpression8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParFilterExpression8157 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParFilterExpression8182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParFilterExpression8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFilterExpression_in_entryRuleExpressionFilterExpression8227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFilterExpression8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8283 = new BitSet(new long[]{0xA000000000000000L,0x00000000000E5601L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpressionFilterExpression8304 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleFilterNode_in_ruleExpressionFilterExpression8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterNode_in_entryRuleFilterNode8360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterNode8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleFilterNode8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFilterNode8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction8484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedFunction_in_ruleFunction8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlFunction_in_ruleFunction8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedFunction_in_entryRuleNamedFunction8614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedFunction8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFunction8675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNamedFunction8686 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedFunction8703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNamedFunction8719 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNamedFunction8740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNamedFunction8752 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNamedFunction8773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNamedFunction8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlFunction_in_entryRuleSparqlFunction8825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlFunction8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSparqlFunction8877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSparqlFunction8893 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSparqlFunction8914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSparqlFunction8926 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSparqlFunction8947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSparqlFunction8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall8995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInCall9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleBuiltInCall9042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9053 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleBuiltInCall9104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9115 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleBuiltInCall9166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9177 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9209 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleBuiltInCall9260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9271 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleBuiltInCall9322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9333 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBuiltInCall9354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleBuiltInCall9384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9395 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleBuiltInCall9446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9457 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleBuiltInCall9508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9519 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleBuiltInCall9570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9581 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9613 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9645 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleBuiltInCall9696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9707 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9739 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleBuiltInCall9790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9801 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9833 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleBuiltInCall9884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9895 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleBuiltInCall9927 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall9948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleBuiltInCall9978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall9989 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleBuiltInCall10040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10051 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleBuiltInCall10102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10113 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleBuiltInCall10164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleBuiltInCall10175 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall10196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleBuiltInCall10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAggArg_in_entryRuleExprAggArg10245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAggArg10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleExprAggArg10291 = new BitSet(new long[]{0x0000000000000800L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleExprAggArg10310 = new BitSet(new long[]{0x0000000000000000L,0x000000000F1000A2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExprAggArg10345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleExprAggArg10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphNode_in_entryRuleGraphNode10391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphNode10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleGraphNode10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGraphNode10481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRI_in_ruleGraphNode10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNode_in_ruleGraphNode10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGraphNode10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable10605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedVariable_in_ruleVariable10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedVariable_in_ruleVariable10695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedVariable_in_entryRuleUnNamedVariable10729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNamedVariable10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleUnNamedVariable10775 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnNamedVariable10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedVariable_in_entryRuleNamedVariable10832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedVariable10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedVariable10889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNamedVariable10900 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedVariable10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNode_in_entryRuleBlankNode10963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankNode10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleBlankNode11013 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlankNode11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter11080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleParameter11130 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue11191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValue11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRI_in_entryRuleIRI11315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIRI11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleIRI11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue11419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue11471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200010L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleStringValue11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue11533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerValue11585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200010L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleIntegerValue11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag11647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_ruleRDFTag11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_ruleRDFTag11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag11777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleTypeTag11827 = new BitSet(new long[]{0x0000000000000000L,0x000000000F100022L});
    public static final BitSet FOLLOW_ruleGraphNode_in_ruleTypeTag11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag11893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleLangTag11943 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangTag11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOperator12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOperator12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleOperator12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleOperator12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleOperator12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleOperator12105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOperator12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOperator12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOperator12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOperator12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_synpred674098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleGroupGraphPattern_in_synpred674119 = new BitSet(new long[]{0x0000000000000002L});

}