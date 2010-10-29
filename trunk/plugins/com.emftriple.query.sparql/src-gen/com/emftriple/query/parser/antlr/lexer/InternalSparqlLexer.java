package com.emftriple.query.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSparqlLexer extends Lexer {
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
    public InternalSparqlLexer() {;} 
    public InternalSparqlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g"; }

    // $ANTLR start KEYWORD_84
    public final void mKEYWORD_84() throws RecognitionException {
        try {
            int _type = KEYWORD_84;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:19:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:19:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_84

    // $ANTLR start KEYWORD_83
    public final void mKEYWORD_83() throws RecognitionException {
        try {
            int _type = KEYWORD_83;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:21:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:21:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_83

    // $ANTLR start KEYWORD_80
    public final void mKEYWORD_80() throws RecognitionException {
        try {
            int _type = KEYWORD_80;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:23:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:23:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_80

    // $ANTLR start KEYWORD_81
    public final void mKEYWORD_81() throws RecognitionException {
        try {
            int _type = KEYWORD_81;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:25:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:25:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_81

    // $ANTLR start KEYWORD_82
    public final void mKEYWORD_82() throws RecognitionException {
        try {
            int _type = KEYWORD_82;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:27:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:27:14: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_82

    // $ANTLR start KEYWORD_75
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:29:12: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:29:14: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_75

    // $ANTLR start KEYWORD_76
    public final void mKEYWORD_76() throws RecognitionException {
        try {
            int _type = KEYWORD_76;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:31:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:31:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_76

    // $ANTLR start KEYWORD_77
    public final void mKEYWORD_77() throws RecognitionException {
        try {
            int _type = KEYWORD_77;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:33:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:33:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_77

    // $ANTLR start KEYWORD_78
    public final void mKEYWORD_78() throws RecognitionException {
        try {
            int _type = KEYWORD_78;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:35:12: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:35:14: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_78

    // $ANTLR start KEYWORD_79
    public final void mKEYWORD_79() throws RecognitionException {
        try {
            int _type = KEYWORD_79;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:37:12: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:37:14: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_79

    // $ANTLR start KEYWORD_70
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:39:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:39:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_70

    // $ANTLR start KEYWORD_71
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:41:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:41:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_71

    // $ANTLR start KEYWORD_72
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:43:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:43:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_72

    // $ANTLR start KEYWORD_73
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:45:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:45:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_73

    // $ANTLR start KEYWORD_74
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:47:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:47:14: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_74

    // $ANTLR start KEYWORD_60
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:49:12: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:49:14: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_60

    // $ANTLR start KEYWORD_61
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:51:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:51:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_61

    // $ANTLR start KEYWORD_62
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:53:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:53:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_62

    // $ANTLR start KEYWORD_63
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:55:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:55:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_63

    // $ANTLR start KEYWORD_64
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:57:12: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:57:14: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_64

    // $ANTLR start KEYWORD_65
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:59:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:59:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_65

    // $ANTLR start KEYWORD_66
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:61:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:61:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_66

    // $ANTLR start KEYWORD_67
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:63:12: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:63:14: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_67

    // $ANTLR start KEYWORD_68
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:65:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:65:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_68

    // $ANTLR start KEYWORD_69
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:67:12: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:67:14: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_69

    // $ANTLR start KEYWORD_45
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:69:12: ( ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:69:14: ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_45

    // $ANTLR start KEYWORD_46
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:71:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:71:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_46

    // $ANTLR start KEYWORD_47
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:73:12: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:73:14: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_47

    // $ANTLR start KEYWORD_48
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:75:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:75:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_48

    // $ANTLR start KEYWORD_49
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:77:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:77:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_49

    // $ANTLR start KEYWORD_50
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:79:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:79:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_50

    // $ANTLR start KEYWORD_51
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:81:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:81:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_51

    // $ANTLR start KEYWORD_52
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:83:12: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:83:14: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_52

    // $ANTLR start KEYWORD_53
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:85:12: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:85:14: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_53

    // $ANTLR start KEYWORD_54
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:87:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:87:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_54

    // $ANTLR start KEYWORD_55
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:89:12: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:89:14: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_55

    // $ANTLR start KEYWORD_56
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:91:12: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:91:14: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_56

    // $ANTLR start KEYWORD_57
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:93:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:93:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_57

    // $ANTLR start KEYWORD_58
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:95:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:95:14: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_58

    // $ANTLR start KEYWORD_59
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:97:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:97:14: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_59

    // $ANTLR start KEYWORD_37
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:99:12: ( ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:99:14: ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_37

    // $ANTLR start KEYWORD_38
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:101:12: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:101:14: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_38

    // $ANTLR start KEYWORD_39
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:103:12: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:103:14: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_39

    // $ANTLR start KEYWORD_40
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:105:12: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:105:14: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_40

    // $ANTLR start KEYWORD_41
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:107:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:107:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_41

    // $ANTLR start KEYWORD_42
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:109:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:109:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_42

    // $ANTLR start KEYWORD_43
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:111:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:111:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_43

    // $ANTLR start KEYWORD_44
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:113:12: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:113:14: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_44

    // $ANTLR start KEYWORD_28
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:115:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:115:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_28

    // $ANTLR start KEYWORD_29
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:117:12: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:117:14: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_29

    // $ANTLR start KEYWORD_30
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:119:12: ( ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:119:14: ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_30

    // $ANTLR start KEYWORD_31
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:121:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:121:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_31

    // $ANTLR start KEYWORD_32
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:123:12: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:123:14: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_32

    // $ANTLR start KEYWORD_33
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:125:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:125:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_33

    // $ANTLR start KEYWORD_34
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:127:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:127:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_34

    // $ANTLR start KEYWORD_35
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:129:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:129:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_35

    // $ANTLR start KEYWORD_36
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:131:12: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:131:14: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_36

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:133:12: ( '!' '=' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:133:14: '!' '='
            {
            match('!'); 
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:135:12: ( '&' '&' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:135:14: '&' '&'
            {
            match('&'); 
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:137:12: ( '<' '=' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:137:14: '<' '='
            {
            match('<'); 
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_21
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:139:12: ( '>' '=' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:139:14: '>' '='
            {
            match('>'); 
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_21

    // $ANTLR start KEYWORD_22
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:141:12: ( '?' ':' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:141:14: '?' ':'
            {
            match('?'); 
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_22

    // $ANTLR start KEYWORD_23
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:143:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:143:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_23

    // $ANTLR start KEYWORD_24
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:145:12: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:145:14: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_24

    // $ANTLR start KEYWORD_25
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:147:12: ( '^' '^' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:147:14: '^' '^'
            {
            match('^'); 
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_25

    // $ANTLR start KEYWORD_26
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:149:12: ( '_' ':' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:149:14: '_' ':'
            {
            match('_'); 
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_26

    // $ANTLR start KEYWORD_27
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:151:12: ( '|' '|' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:151:14: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_27

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:153:11: ( '(' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:153:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:155:11: ( ')' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:155:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:157:11: ( '*' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:157:13: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:159:11: ( '+' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:159:13: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:161:11: ( ',' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:161:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:163:11: ( '-' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:163:13: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:165:11: ( '.' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:165:13: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:167:11: ( '/' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:167:13: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:169:11: ( ':' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:169:13: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:171:12: ( ';' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:171:14: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:173:12: ( '<' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:173:14: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:175:12: ( '=' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:175:14: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:177:12: ( '>' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:177:14: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:179:12: ( '?' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:179:14: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:181:12: ( '@' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:181:14: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:183:12: ( '{' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:183:14: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:185:12: ( '}' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:185:14: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start RULE_IRI_TERMINAL
    public final void mRULE_IRI_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IRI_TERMINAL;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:189:19: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' )* '>' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:189:21: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' )* '>'
            {
            match('<'); 
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:189:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#'||(LA1_0>='-' && LA1_0<=':')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:
            	    {
            	    if ( input.LA(1)=='#'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_IRI_TERMINAL

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:191:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:191:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:191:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:191:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:191:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:193:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )* )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:193:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:193:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='-' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:
            	    {
            	    if ( input.LA(1)=='#'||(input.LA(1)>='-' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:195:10: ( ( '0' .. '9' )+ )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:195:12: ( '0' .. '9' )+
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:195:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:195:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:197:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:197:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:197:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:197:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:41: ( '\\r' )? '\\n'
                    {
                    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:199:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:201:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:203:16: ( . )
            // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:203:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:8: ( KEYWORD_84 | KEYWORD_83 | KEYWORD_80 | KEYWORD_81 | KEYWORD_82 | KEYWORD_75 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=92;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='G'||LA10_0=='g') ) {
            int LA10_1 = input.LA(2);

            if ( (LA10_1=='R'||LA10_1=='r') ) {
                switch ( input.LA(3) ) {
                case 'O':
                case 'o':
                    {
                    int LA10_120 = input.LA(4);

                    if ( (LA10_120=='U'||LA10_120=='u') ) {
                        int LA10_172 = input.LA(5);

                        if ( (LA10_172=='P'||LA10_172=='p') ) {
                            switch ( input.LA(6) ) {
                            case '_':
                                {
                                int LA10_273 = input.LA(7);

                                if ( (LA10_273=='C'||LA10_273=='c') ) {
                                    int LA10_313 = input.LA(8);

                                    if ( (LA10_313=='O'||LA10_313=='o') ) {
                                        int LA10_338 = input.LA(9);

                                        if ( (LA10_338=='N'||LA10_338=='n') ) {
                                            int LA10_353 = input.LA(10);

                                            if ( (LA10_353=='C'||LA10_353=='c') ) {
                                                int LA10_363 = input.LA(11);

                                                if ( (LA10_363=='A'||LA10_363=='a') ) {
                                                    int LA10_368 = input.LA(12);

                                                    if ( (LA10_368=='T'||LA10_368=='t') ) {
                                                        int LA10_370 = input.LA(13);

                                                        if ( (LA10_370=='#'||(LA10_370>='-' && LA10_370<='9')||LA10_370=='?'||(LA10_370>='A' && LA10_370<='Z')||LA10_370=='_'||(LA10_370>='a' && LA10_370<='z')) ) {
                                                            alt10=87;
                                                        }
                                                        else {
                                                            alt10=1;}
                                                    }
                                                    else {
                                                        alt10=87;}
                                                }
                                                else {
                                                    alt10=87;}
                                            }
                                            else {
                                                alt10=87;}
                                        }
                                        else {
                                            alt10=87;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                                }
                                break;
                            case '#':
                            case '-':
                            case '.':
                            case '/':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case '?':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                                {
                                alt10=87;
                                }
                                break;
                            default:
                                alt10=31;}

                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'A':
                case 'a':
                    {
                    int LA10_121 = input.LA(4);

                    if ( (LA10_121=='P'||LA10_121=='p') ) {
                        int LA10_173 = input.LA(5);

                        if ( (LA10_173=='H'||LA10_173=='h') ) {
                            int LA10_227 = input.LA(6);

                            if ( (LA10_227=='#'||(LA10_227>='-' && LA10_227<='9')||LA10_227=='?'||(LA10_227>='A' && LA10_227<='Z')||LA10_227=='_'||(LA10_227>='a' && LA10_227<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=30;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='L'||LA10_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'A':
            case 'a':
                {
                int LA10_48 = input.LA(3);

                if ( (LA10_48=='N'||LA10_48=='n') ) {
                    int LA10_122 = input.LA(4);

                    if ( (LA10_122=='G'||LA10_122=='g') ) {
                        switch ( input.LA(5) ) {
                        case 'M':
                        case 'm':
                            {
                            int LA10_228 = input.LA(6);

                            if ( (LA10_228=='A'||LA10_228=='a') ) {
                                int LA10_276 = input.LA(7);

                                if ( (LA10_276=='T'||LA10_276=='t') ) {
                                    int LA10_314 = input.LA(8);

                                    if ( (LA10_314=='C'||LA10_314=='c') ) {
                                        int LA10_339 = input.LA(9);

                                        if ( (LA10_339=='H'||LA10_339=='h') ) {
                                            int LA10_354 = input.LA(10);

                                            if ( (LA10_354=='E'||LA10_354=='e') ) {
                                                int LA10_364 = input.LA(11);

                                                if ( (LA10_364=='S'||LA10_364=='s') ) {
                                                    int LA10_369 = input.LA(12);

                                                    if ( (LA10_369=='#'||(LA10_369>='-' && LA10_369<='9')||LA10_369=='?'||(LA10_369>='A' && LA10_369<='Z')||LA10_369=='_'||(LA10_369>='a' && LA10_369<='z')) ) {
                                                        alt10=87;
                                                    }
                                                    else {
                                                        alt10=2;}
                                                }
                                                else {
                                                    alt10=87;}
                                            }
                                            else {
                                                alt10=87;}
                                        }
                                        else {
                                            alt10=87;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                            }
                            break;
                        case '#':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '?':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt10=87;
                            }
                            break;
                        default:
                            alt10=46;}

                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA10_49 = input.LA(3);

                if ( (LA10_49=='M'||LA10_49=='m') ) {
                    int LA10_123 = input.LA(4);

                    if ( (LA10_123=='I'||LA10_123=='i') ) {
                        int LA10_175 = input.LA(5);

                        if ( (LA10_175=='T'||LA10_175=='t') ) {
                            int LA10_230 = input.LA(6);

                            if ( (LA10_230=='#'||(LA10_230>='-' && LA10_230<='9')||LA10_230=='?'||(LA10_230>='A' && LA10_230<='Z')||LA10_230=='_'||(LA10_230>='a' && LA10_230<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=32;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'O':
            case 'o':
                {
                int LA10_50 = input.LA(3);

                if ( (LA10_50=='A'||LA10_50=='a') ) {
                    int LA10_124 = input.LA(4);

                    if ( (LA10_124=='D'||LA10_124=='d') ) {
                        int LA10_176 = input.LA(5);

                        if ( (LA10_176=='#'||(LA10_176>='-' && LA10_176<='9')||LA10_176=='?'||(LA10_176>='A' && LA10_176<='Z')||LA10_176=='_'||(LA10_176>='a' && LA10_176<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=47;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='C'||LA10_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'R':
            case 'r':
                {
                int LA10_51 = input.LA(3);

                if ( (LA10_51=='E'||LA10_51=='e') ) {
                    int LA10_125 = input.LA(4);

                    if ( (LA10_125=='A'||LA10_125=='a') ) {
                        int LA10_177 = input.LA(5);

                        if ( (LA10_177=='T'||LA10_177=='t') ) {
                            int LA10_232 = input.LA(6);

                            if ( (LA10_232=='E'||LA10_232=='e') ) {
                                int LA10_278 = input.LA(7);

                                if ( (LA10_278=='#'||(LA10_278>='-' && LA10_278<='9')||LA10_278=='?'||(LA10_278>='A' && LA10_278<='Z')||LA10_278=='_'||(LA10_278>='a' && LA10_278<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=16;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'L':
            case 'l':
                {
                int LA10_52 = input.LA(3);

                if ( (LA10_52=='E'||LA10_52=='e') ) {
                    int LA10_126 = input.LA(4);

                    if ( (LA10_126=='A'||LA10_126=='a') ) {
                        int LA10_178 = input.LA(5);

                        if ( (LA10_178=='R'||LA10_178=='r') ) {
                            int LA10_233 = input.LA(6);

                            if ( (LA10_233=='#'||(LA10_233>='-' && LA10_233<='9')||LA10_233=='?'||(LA10_233>='A' && LA10_233<='Z')||LA10_233=='_'||(LA10_233>='a' && LA10_233<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=28;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'O':
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'U':
                case 'u':
                    {
                    int LA10_127 = input.LA(4);

                    if ( (LA10_127=='N'||LA10_127=='n') ) {
                        int LA10_179 = input.LA(5);

                        if ( (LA10_179=='T'||LA10_179=='t') ) {
                            int LA10_234 = input.LA(6);

                            if ( (LA10_234=='#'||(LA10_234>='-' && LA10_234<='9')||LA10_234=='?'||(LA10_234>='A' && LA10_234<='Z')||LA10_234=='_'||(LA10_234>='a' && LA10_234<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=29;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'N':
                case 'n':
                    {
                    int LA10_128 = input.LA(4);

                    if ( (LA10_128=='S'||LA10_128=='s') ) {
                        int LA10_180 = input.LA(5);

                        if ( (LA10_180=='T'||LA10_180=='t') ) {
                            int LA10_235 = input.LA(6);

                            if ( (LA10_235=='R'||LA10_235=='r') ) {
                                int LA10_281 = input.LA(7);

                                if ( (LA10_281=='U'||LA10_281=='u') ) {
                                    int LA10_316 = input.LA(8);

                                    if ( (LA10_316=='C'||LA10_316=='c') ) {
                                        int LA10_340 = input.LA(9);

                                        if ( (LA10_340=='T'||LA10_340=='t') ) {
                                            int LA10_355 = input.LA(10);

                                            if ( (LA10_355=='#'||(LA10_355>='-' && LA10_355<='9')||LA10_355=='?'||(LA10_355>='A' && LA10_355<='Z')||LA10_355=='_'||(LA10_355>='a' && LA10_355<='z')) ) {
                                                alt10=87;
                                            }
                                            else {
                                                alt10=3;}
                                        }
                                        else {
                                            alt10=87;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='S'||LA10_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'T':
            case 't':
                {
                int LA10_54 = input.LA(3);

                if ( (LA10_54=='R'||LA10_54=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'D':
                    case 'd':
                        {
                        int LA10_181 = input.LA(5);

                        if ( (LA10_181=='T'||LA10_181=='t') ) {
                            int LA10_236 = input.LA(6);

                            if ( (LA10_236=='#'||(LA10_236>='-' && LA10_236<='9')||LA10_236=='?'||(LA10_236>='A' && LA10_236<='Z')||LA10_236=='_'||(LA10_236>='a' && LA10_236<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=35;}
                        }
                        else {
                            alt10=87;}
                        }
                        break;
                    case 'L':
                    case 'l':
                        {
                        int LA10_182 = input.LA(5);

                        if ( (LA10_182=='A'||LA10_182=='a') ) {
                            int LA10_237 = input.LA(6);

                            if ( (LA10_237=='N'||LA10_237=='n') ) {
                                int LA10_283 = input.LA(7);

                                if ( (LA10_283=='G'||LA10_283=='g') ) {
                                    int LA10_317 = input.LA(8);

                                    if ( (LA10_317=='#'||(LA10_317>='-' && LA10_317<='9')||LA10_317=='?'||(LA10_317>='A' && LA10_317<='Z')||LA10_317=='_'||(LA10_317>='a' && LA10_317<='z')) ) {
                                        alt10=87;
                                    }
                                    else {
                                        alt10=14;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                        }
                        break;
                    case '#':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '?':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt10=87;
                        }
                        break;
                    default:
                        alt10=55;}

                }
                else {
                    alt10=87;}
                }
                break;
            case 'U':
            case 'u':
                {
                int LA10_55 = input.LA(3);

                if ( (LA10_55=='M'||LA10_55=='m') ) {
                    int LA10_130 = input.LA(4);

                    if ( (LA10_130=='#'||(LA10_130>='-' && LA10_130<='9')||LA10_130=='?'||(LA10_130>='A' && LA10_130<='Z')||LA10_130=='_'||(LA10_130>='a' && LA10_130<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=56;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'E':
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'L':
                case 'l':
                    {
                    int LA10_131 = input.LA(4);

                    if ( (LA10_131=='E'||LA10_131=='e') ) {
                        int LA10_185 = input.LA(5);

                        if ( (LA10_185=='C'||LA10_185=='c') ) {
                            int LA10_238 = input.LA(6);

                            if ( (LA10_238=='T'||LA10_238=='t') ) {
                                int LA10_284 = input.LA(7);

                                if ( (LA10_284=='#'||(LA10_284>='-' && LA10_284<='9')||LA10_284=='?'||(LA10_284>='A' && LA10_284<='Z')||LA10_284=='_'||(LA10_284>='a' && LA10_284<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=24;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'P':
                case 'p':
                    {
                    int LA10_132 = input.LA(4);

                    if ( (LA10_132=='A'||LA10_132=='a') ) {
                        int LA10_186 = input.LA(5);

                        if ( (LA10_186=='R'||LA10_186=='r') ) {
                            int LA10_239 = input.LA(6);

                            if ( (LA10_239=='A'||LA10_239=='a') ) {
                                int LA10_285 = input.LA(7);

                                if ( (LA10_285=='T'||LA10_285=='t') ) {
                                    int LA10_319 = input.LA(8);

                                    if ( (LA10_319=='O'||LA10_319=='o') ) {
                                        int LA10_342 = input.LA(9);

                                        if ( (LA10_342=='R'||LA10_342=='r') ) {
                                            int LA10_356 = input.LA(10);

                                            if ( (LA10_356=='#'||(LA10_356>='-' && LA10_356<='9')||LA10_356=='?'||(LA10_356>='A' && LA10_356<='Z')||LA10_356=='_'||(LA10_356>='a' && LA10_356<='z')) ) {
                                                alt10=87;
                                            }
                                            else {
                                                alt10=4;}
                                        }
                                        else {
                                            alt10=87;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'R':
                case 'r':
                    {
                    int LA10_133 = input.LA(4);

                    if ( (LA10_133=='V'||LA10_133=='v') ) {
                        int LA10_187 = input.LA(5);

                        if ( (LA10_187=='I'||LA10_187=='i') ) {
                            int LA10_240 = input.LA(6);

                            if ( (LA10_240=='C'||LA10_240=='c') ) {
                                int LA10_286 = input.LA(7);

                                if ( (LA10_286=='E'||LA10_286=='e') ) {
                                    int LA10_320 = input.LA(8);

                                    if ( (LA10_320=='#'||(LA10_320>='-' && LA10_320<='9')||LA10_320=='?'||(LA10_320>='A' && LA10_320<='Z')||LA10_320=='_'||(LA10_320>='a' && LA10_320<='z')) ) {
                                        alt10=87;
                                    }
                                    else {
                                        alt10=13;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

                }
                break;
            case 'I':
            case 'i':
                {
                int LA10_57 = input.LA(3);

                if ( (LA10_57=='L'||LA10_57=='l') ) {
                    int LA10_134 = input.LA(4);

                    if ( (LA10_134=='E'||LA10_134=='e') ) {
                        int LA10_188 = input.LA(5);

                        if ( (LA10_188=='N'||LA10_188=='n') ) {
                            int LA10_241 = input.LA(6);

                            if ( (LA10_241=='T'||LA10_241=='t') ) {
                                int LA10_287 = input.LA(7);

                                if ( (LA10_287=='#'||(LA10_287>='-' && LA10_287<='9')||LA10_287=='?'||(LA10_287>='A' && LA10_287<='Z')||LA10_287=='_'||(LA10_287>='a' && LA10_287<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=25;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'A':
            case 'a':
                {
                int LA10_58 = input.LA(3);

                if ( (LA10_58=='M'||LA10_58=='m') ) {
                    switch ( input.LA(4) ) {
                    case 'P':
                    case 'p':
                        {
                        int LA10_189 = input.LA(5);

                        if ( (LA10_189=='L'||LA10_189=='l') ) {
                            int LA10_242 = input.LA(6);

                            if ( (LA10_242=='E'||LA10_242=='e') ) {
                                int LA10_288 = input.LA(7);

                                if ( (LA10_288=='#'||(LA10_288>='-' && LA10_288<='9')||LA10_288=='?'||(LA10_288>='A' && LA10_288<='Z')||LA10_288=='_'||(LA10_288>='a' && LA10_288<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=23;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        int LA10_190 = input.LA(5);

                        if ( (LA10_190=='T'||LA10_190=='t') ) {
                            int LA10_243 = input.LA(6);

                            if ( (LA10_243=='E'||LA10_243=='e') ) {
                                int LA10_289 = input.LA(7);

                                if ( (LA10_289=='R'||LA10_289=='r') ) {
                                    int LA10_323 = input.LA(8);

                                    if ( (LA10_323=='M'||LA10_323=='m') ) {
                                        int LA10_344 = input.LA(9);

                                        if ( (LA10_344=='#'||(LA10_344>='-' && LA10_344<='9')||LA10_344=='?'||(LA10_344>='A' && LA10_344<='Z')||LA10_344=='_'||(LA10_344>='a' && LA10_344<='z')) ) {
                                            alt10=87;
                                        }
                                        else {
                                            alt10=10;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                        }
                        break;
                    default:
                        alt10=87;}

                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='I'||LA10_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'F':
            case 'f':
                {
                int LA10_59 = input.LA(3);

                if ( (LA10_59=='#'||(LA10_59>='-' && LA10_59<='9')||LA10_59=='?'||(LA10_59>='A' && LA10_59<='Z')||LA10_59=='_'||(LA10_59>='a' && LA10_59<='z')) ) {
                    alt10=87;
                }
                else {
                    alt10=64;}
                }
                break;
            case 'N':
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'T':
                case 't':
                    {
                    int LA10_137 = input.LA(4);

                    if ( (LA10_137=='O'||LA10_137=='o') ) {
                        int LA10_191 = input.LA(5);

                        if ( (LA10_191=='#'||(LA10_191>='-' && LA10_191<='9')||LA10_191=='?'||(LA10_191>='A' && LA10_191<='Z')||LA10_191=='_'||(LA10_191>='a' && LA10_191<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=45;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'S':
                case 's':
                    {
                    int LA10_138 = input.LA(4);

                    if ( (LA10_138=='E'||LA10_138=='e') ) {
                        int LA10_192 = input.LA(5);

                        if ( (LA10_192=='R'||LA10_192=='r') ) {
                            int LA10_245 = input.LA(6);

                            if ( (LA10_245=='T'||LA10_245=='t') ) {
                                int LA10_290 = input.LA(7);

                                if ( (LA10_290=='#'||(LA10_290>='-' && LA10_290<='9')||LA10_290=='?'||(LA10_290>='A' && LA10_290<='Z')||LA10_290=='_'||(LA10_290>='a' && LA10_290<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=21;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

                }
                break;
            case 'S':
            case 's':
                {
                switch ( input.LA(3) ) {
                case 'I':
                case 'i':
                    {
                    int LA10_139 = input.LA(4);

                    if ( (LA10_139=='R'||LA10_139=='r') ) {
                        int LA10_193 = input.LA(5);

                        if ( (LA10_193=='I'||LA10_193=='i') ) {
                            int LA10_246 = input.LA(6);

                            if ( (LA10_246=='#'||(LA10_246>='-' && LA10_246<='9')||LA10_246=='?'||(LA10_246>='A' && LA10_246<='Z')||LA10_246=='_'||(LA10_246>='a' && LA10_246<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=39;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'L':
                case 'l':
                    {
                    int LA10_140 = input.LA(4);

                    if ( (LA10_140=='I'||LA10_140=='i') ) {
                        int LA10_194 = input.LA(5);

                        if ( (LA10_194=='T'||LA10_194=='t') ) {
                            int LA10_247 = input.LA(6);

                            if ( (LA10_247=='E'||LA10_247=='e') ) {
                                int LA10_292 = input.LA(7);

                                if ( (LA10_292=='R'||LA10_292=='r') ) {
                                    int LA10_325 = input.LA(8);

                                    if ( (LA10_325=='A'||LA10_325=='a') ) {
                                        int LA10_345 = input.LA(9);

                                        if ( (LA10_345=='L'||LA10_345=='l') ) {
                                            int LA10_358 = input.LA(10);

                                            if ( (LA10_358=='#'||(LA10_358>='-' && LA10_358<='9')||LA10_358=='?'||(LA10_358>='A' && LA10_358<='Z')||LA10_358=='_'||(LA10_358>='a' && LA10_358<='z')) ) {
                                                alt10=87;
                                            }
                                            else {
                                                alt10=5;}
                                        }
                                        else {
                                            alt10=87;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    int LA10_141 = input.LA(4);

                    if ( (LA10_141=='L'||LA10_141=='l') ) {
                        int LA10_195 = input.LA(5);

                        if ( (LA10_195=='A'||LA10_195=='a') ) {
                            int LA10_248 = input.LA(6);

                            if ( (LA10_248=='N'||LA10_248=='n') ) {
                                int LA10_293 = input.LA(7);

                                if ( (LA10_293=='K'||LA10_293=='k') ) {
                                    int LA10_326 = input.LA(8);

                                    if ( (LA10_326=='#'||(LA10_326>='-' && LA10_326<='9')||LA10_326=='?'||(LA10_326>='A' && LA10_326<='Z')||LA10_326=='_'||(LA10_326>='a' && LA10_326<='z')) ) {
                                        alt10=87;
                                    }
                                    else {
                                        alt10=15;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'U':
                case 'u':
                    {
                    int LA10_142 = input.LA(4);

                    if ( (LA10_142=='R'||LA10_142=='r') ) {
                        int LA10_196 = input.LA(5);

                        if ( (LA10_196=='I'||LA10_196=='i') ) {
                            int LA10_249 = input.LA(6);

                            if ( (LA10_249=='#'||(LA10_249>='-' && LA10_249<='9')||LA10_249=='?'||(LA10_249>='A' && LA10_249<='Z')||LA10_249=='_'||(LA10_249>='a' && LA10_249<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=40;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

                }
                break;
            case 'R':
            case 'r':
                {
                int LA10_62 = input.LA(3);

                if ( (LA10_62=='I'||LA10_62=='i') ) {
                    int LA10_143 = input.LA(4);

                    if ( (LA10_143=='#'||(LA10_143>='-' && LA10_143<='9')||LA10_143=='?'||(LA10_143>='A' && LA10_143<='Z')||LA10_143=='_'||(LA10_143>='a' && LA10_143<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=51;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='D'||LA10_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'E':
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'S':
                case 's':
                    {
                    int LA10_144 = input.LA(4);

                    if ( (LA10_144=='C'||LA10_144=='c') ) {
                        int LA10_198 = input.LA(5);

                        if ( (LA10_198=='R'||LA10_198=='r') ) {
                            int LA10_250 = input.LA(6);

                            if ( (LA10_250=='I'||LA10_250=='i') ) {
                                int LA10_295 = input.LA(7);

                                if ( (LA10_295=='B'||LA10_295=='b') ) {
                                    int LA10_327 = input.LA(8);

                                    if ( (LA10_327=='E'||LA10_327=='e') ) {
                                        int LA10_347 = input.LA(9);

                                        if ( (LA10_347=='#'||(LA10_347>='-' && LA10_347<='9')||LA10_347=='?'||(LA10_347>='A' && LA10_347<='Z')||LA10_347=='_'||(LA10_347>='a' && LA10_347<='z')) ) {
                                            alt10=87;
                                        }
                                        else {
                                            alt10=7;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'L':
                case 'l':
                    {
                    int LA10_145 = input.LA(4);

                    if ( (LA10_145=='E'||LA10_145=='e') ) {
                        int LA10_199 = input.LA(5);

                        if ( (LA10_199=='T'||LA10_199=='t') ) {
                            int LA10_251 = input.LA(6);

                            if ( (LA10_251=='E'||LA10_251=='e') ) {
                                int LA10_296 = input.LA(7);

                                if ( (LA10_296=='#'||(LA10_296>='-' && LA10_296<='9')||LA10_296=='?'||(LA10_296>='A' && LA10_296<='Z')||LA10_296=='_'||(LA10_296>='a' && LA10_296<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=17;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                case 'F':
                case 'f':
                    {
                    int LA10_146 = input.LA(4);

                    if ( (LA10_146=='A'||LA10_146=='a') ) {
                        int LA10_200 = input.LA(5);

                        if ( (LA10_200=='U'||LA10_200=='u') ) {
                            int LA10_252 = input.LA(6);

                            if ( (LA10_252=='L'||LA10_252=='l') ) {
                                int LA10_297 = input.LA(7);

                                if ( (LA10_297=='T'||LA10_297=='t') ) {
                                    int LA10_329 = input.LA(8);

                                    if ( (LA10_329=='#'||(LA10_329>='-' && LA10_329<='9')||LA10_329=='?'||(LA10_329>='A' && LA10_329<='Z')||LA10_329=='_'||(LA10_329>='a' && LA10_329<='z')) ) {
                                        alt10=87;
                                    }
                                    else {
                                        alt10=11;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                    }
                    break;
                default:
                    alt10=87;}

                }
                break;
            case 'A':
            case 'a':
                {
                int LA10_64 = input.LA(3);

                if ( (LA10_64=='T'||LA10_64=='t') ) {
                    int LA10_147 = input.LA(4);

                    if ( (LA10_147=='A'||LA10_147=='a') ) {
                        switch ( input.LA(5) ) {
                        case 'T':
                        case 't':
                            {
                            int LA10_253 = input.LA(6);

                            if ( (LA10_253=='Y'||LA10_253=='y') ) {
                                int LA10_298 = input.LA(7);

                                if ( (LA10_298=='P'||LA10_298=='p') ) {
                                    int LA10_330 = input.LA(8);

                                    if ( (LA10_330=='E'||LA10_330=='e') ) {
                                        int LA10_349 = input.LA(9);

                                        if ( (LA10_349=='#'||(LA10_349>='-' && LA10_349<='9')||LA10_349=='?'||(LA10_349>='A' && LA10_349<='Z')||LA10_349=='_'||(LA10_349>='a' && LA10_349<='z')) ) {
                                            alt10=87;
                                        }
                                        else {
                                            alt10=6;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                            }
                            break;
                        case '#':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '?':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt10=87;
                            }
                            break;
                        default:
                            alt10=42;}

                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'R':
            case 'r':
                {
                int LA10_65 = input.LA(3);

                if ( (LA10_65=='O'||LA10_65=='o') ) {
                    int LA10_148 = input.LA(4);

                    if ( (LA10_148=='P'||LA10_148=='p') ) {
                        int LA10_202 = input.LA(5);

                        if ( (LA10_202=='#'||(LA10_202>='-' && LA10_202<='9')||LA10_202=='?'||(LA10_202>='A' && LA10_202<='Z')||LA10_202=='_'||(LA10_202>='a' && LA10_202<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=43;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA10_66 = input.LA(3);

                if ( (LA10_66=='S'||LA10_66=='s') ) {
                    int LA10_149 = input.LA(4);

                    if ( (LA10_149=='T'||LA10_149=='t') ) {
                        int LA10_203 = input.LA(5);

                        if ( (LA10_203=='I'||LA10_203=='i') ) {
                            int LA10_256 = input.LA(6);

                            if ( (LA10_256=='N'||LA10_256=='n') ) {
                                int LA10_299 = input.LA(7);

                                if ( (LA10_299=='C'||LA10_299=='c') ) {
                                    int LA10_331 = input.LA(8);

                                    if ( (LA10_331=='T'||LA10_331=='t') ) {
                                        int LA10_350 = input.LA(9);

                                        if ( (LA10_350=='#'||(LA10_350>='-' && LA10_350<='9')||LA10_350=='?'||(LA10_350>='A' && LA10_350<='Z')||LA10_350=='_'||(LA10_350>='a' && LA10_350<='z')) ) {
                                            alt10=87;
                                        }
                                        else {
                                            alt10=8;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='O'||LA10_0=='o') ) {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='P'||LA10_7=='p') ) {
                int LA10_67 = input.LA(3);

                if ( (LA10_67=='T'||LA10_67=='t') ) {
                    int LA10_150 = input.LA(4);

                    if ( (LA10_150=='I'||LA10_150=='i') ) {
                        int LA10_204 = input.LA(5);

                        if ( (LA10_204=='O'||LA10_204=='o') ) {
                            int LA10_257 = input.LA(6);

                            if ( (LA10_257=='N'||LA10_257=='n') ) {
                                int LA10_300 = input.LA(7);

                                if ( (LA10_300=='A'||LA10_300=='a') ) {
                                    int LA10_332 = input.LA(8);

                                    if ( (LA10_332=='L'||LA10_332=='l') ) {
                                        int LA10_351 = input.LA(9);

                                        if ( (LA10_351=='#'||(LA10_351>='-' && LA10_351<='9')||LA10_351=='?'||(LA10_351>='A' && LA10_351<='Z')||LA10_351=='_'||(LA10_351>='a' && LA10_351<='z')) ) {
                                            alt10=87;
                                        }
                                        else {
                                            alt10=9;}
                                    }
                                    else {
                                        alt10=87;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='R'||LA10_0=='r') ) {
            int LA10_8 = input.LA(2);

            if ( (LA10_8=='E'||LA10_8=='e') ) {
                int LA10_68 = input.LA(3);

                if ( (LA10_68=='D'||LA10_68=='d') ) {
                    int LA10_151 = input.LA(4);

                    if ( (LA10_151=='U'||LA10_151=='u') ) {
                        int LA10_205 = input.LA(5);

                        if ( (LA10_205=='C'||LA10_205=='c') ) {
                            int LA10_258 = input.LA(6);

                            if ( (LA10_258=='E'||LA10_258=='e') ) {
                                int LA10_301 = input.LA(7);

                                if ( (LA10_301=='D'||LA10_301=='d') ) {
                                    int LA10_333 = input.LA(8);

                                    if ( (LA10_333=='#'||(LA10_333>='-' && LA10_333<='9')||LA10_333=='?'||(LA10_333>='A' && LA10_333<='Z')||LA10_333=='_'||(LA10_333>='a' && LA10_333<='z')) ) {
                                        alt10=87;
                                    }
                                    else {
                                        alt10=12;}
                                }
                                else {
                                    alt10=87;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='E'||LA10_0=='e') ) {
            int LA10_9 = input.LA(2);

            if ( (LA10_9=='X'||LA10_9=='x') ) {
                int LA10_69 = input.LA(3);

                if ( (LA10_69=='I'||LA10_69=='i') ) {
                    int LA10_152 = input.LA(4);

                    if ( (LA10_152=='S'||LA10_152=='s') ) {
                        int LA10_206 = input.LA(5);

                        if ( (LA10_206=='T'||LA10_206=='t') ) {
                            int LA10_259 = input.LA(6);

                            if ( (LA10_259=='S'||LA10_259=='s') ) {
                                int LA10_302 = input.LA(7);

                                if ( (LA10_302=='#'||(LA10_302>='-' && LA10_302<='9')||LA10_302=='?'||(LA10_302>='A' && LA10_302<='Z')||LA10_302=='_'||(LA10_302>='a' && LA10_302<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=18;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='F'||LA10_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'I':
            case 'i':
                {
                int LA10_70 = input.LA(3);

                if ( (LA10_70=='L'||LA10_70=='l') ) {
                    int LA10_153 = input.LA(4);

                    if ( (LA10_153=='T'||LA10_153=='t') ) {
                        int LA10_207 = input.LA(5);

                        if ( (LA10_207=='E'||LA10_207=='e') ) {
                            int LA10_260 = input.LA(6);

                            if ( (LA10_260=='R'||LA10_260=='r') ) {
                                int LA10_303 = input.LA(7);

                                if ( (LA10_303=='#'||(LA10_303>='-' && LA10_303<='9')||LA10_303=='?'||(LA10_303>='A' && LA10_303<='Z')||LA10_303=='_'||(LA10_303>='a' && LA10_303<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=19;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'R':
            case 'r':
                {
                int LA10_71 = input.LA(3);

                if ( (LA10_71=='O'||LA10_71=='o') ) {
                    int LA10_154 = input.LA(4);

                    if ( (LA10_154=='M'||LA10_154=='m') ) {
                        int LA10_208 = input.LA(5);

                        if ( (LA10_208=='#'||(LA10_208>='-' && LA10_208<='9')||LA10_208=='?'||(LA10_208>='A' && LA10_208<='Z')||LA10_208=='_'||(LA10_208>='a' && LA10_208<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=44;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='H'||LA10_0=='h') ) {
            int LA10_11 = input.LA(2);

            if ( (LA10_11=='A'||LA10_11=='a') ) {
                int LA10_72 = input.LA(3);

                if ( (LA10_72=='V'||LA10_72=='v') ) {
                    int LA10_155 = input.LA(4);

                    if ( (LA10_155=='I'||LA10_155=='i') ) {
                        int LA10_209 = input.LA(5);

                        if ( (LA10_209=='N'||LA10_209=='n') ) {
                            int LA10_262 = input.LA(6);

                            if ( (LA10_262=='G'||LA10_262=='g') ) {
                                int LA10_304 = input.LA(7);

                                if ( (LA10_304=='#'||(LA10_304>='-' && LA10_304<='9')||LA10_304=='?'||(LA10_304>='A' && LA10_304<='Z')||LA10_304=='_'||(LA10_304>='a' && LA10_304<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=20;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='P'||LA10_0=='p') ) {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='R'||LA10_12=='r') ) {
                int LA10_73 = input.LA(3);

                if ( (LA10_73=='E'||LA10_73=='e') ) {
                    int LA10_156 = input.LA(4);

                    if ( (LA10_156=='F'||LA10_156=='f') ) {
                        int LA10_210 = input.LA(5);

                        if ( (LA10_210=='I'||LA10_210=='i') ) {
                            int LA10_263 = input.LA(6);

                            if ( (LA10_263=='X'||LA10_263=='x') ) {
                                int LA10_305 = input.LA(7);

                                if ( (LA10_305=='#'||(LA10_305>='-' && LA10_305<='9')||LA10_305=='?'||(LA10_305>='A' && LA10_305<='Z')||LA10_305=='_'||(LA10_305>='a' && LA10_305<='z')) ) {
                                    alt10=87;
                                }
                                else {
                                    alt10=22;}
                            }
                            else {
                                alt10=87;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
            }
            else {
                alt10=87;}
        }
        else if ( (LA10_0=='B'||LA10_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'N':
            case 'n':
                {
                int LA10_74 = input.LA(3);

                if ( (LA10_74=='O'||LA10_74=='o') ) {
                    int LA10_157 = input.LA(4);

                    if ( (LA10_157=='D'||LA10_157=='d') ) {
                        int LA10_211 = input.LA(5);

                        if ( (LA10_211=='E'||LA10_211=='e') ) {
                            int LA10_264 = input.LA(6);

                            if ( (LA10_264=='#'||(LA10_264>='-' && LA10_264<='9')||LA10_264=='?'||(LA10_264>='A' && LA10_264<='Z')||LA10_264=='_'||(LA10_264>='a' && LA10_264<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=26;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'O':
            case 'o':
                {
                int LA10_75 = input.LA(3);

                if ( (LA10_75=='U'||LA10_75=='u') ) {
                    int LA10_158 = input.LA(4);

                    if ( (LA10_158=='N'||LA10_158=='n') ) {
                        int LA10_212 = input.LA(5);

                        if ( (LA10_212=='D'||LA10_212=='d') ) {
                            int LA10_265 = input.LA(6);

                            if ( (LA10_265=='#'||(LA10_265>='-' && LA10_265<='9')||LA10_265=='?'||(LA10_265>='A' && LA10_265<='Z')||LA10_265=='_'||(LA10_265>='a' && LA10_265<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=27;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'Y':
            case 'y':
                {
                int LA10_76 = input.LA(3);

                if ( (LA10_76=='#'||(LA10_76>='-' && LA10_76<='9')||LA10_76=='?'||(LA10_76>='A' && LA10_76<='Z')||LA10_76=='_'||(LA10_76>='a' && LA10_76<='z')) ) {
                    alt10=87;
                }
                else {
                    alt10=63;}
                }
                break;
            case 'A':
            case 'a':
                {
                int LA10_77 = input.LA(3);

                if ( (LA10_77=='S'||LA10_77=='s') ) {
                    int LA10_160 = input.LA(4);

                    if ( (LA10_160=='E'||LA10_160=='e') ) {
                        int LA10_213 = input.LA(5);

                        if ( (LA10_213=='#'||(LA10_213>='-' && LA10_213<='9')||LA10_213=='?'||(LA10_213>='A' && LA10_213<='Z')||LA10_213=='_'||(LA10_213>='a' && LA10_213<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=41;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='M'||LA10_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'A':
            case 'a':
                {
                int LA10_78 = input.LA(3);

                if ( (LA10_78=='X'||LA10_78=='x') ) {
                    int LA10_161 = input.LA(4);

                    if ( (LA10_161=='#'||(LA10_161>='-' && LA10_161<='9')||LA10_161=='?'||(LA10_161>='A' && LA10_161<='Z')||LA10_161=='_'||(LA10_161>='a' && LA10_161<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=52;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA10_79 = input.LA(3);

                if ( (LA10_79=='N'||LA10_79=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'U':
                    case 'u':
                        {
                        int LA10_215 = input.LA(5);

                        if ( (LA10_215=='S'||LA10_215=='s') ) {
                            int LA10_267 = input.LA(6);

                            if ( (LA10_267=='#'||(LA10_267>='-' && LA10_267<='9')||LA10_267=='?'||(LA10_267>='A' && LA10_267<='Z')||LA10_267=='_'||(LA10_267>='a' && LA10_267<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=33;}
                        }
                        else {
                            alt10=87;}
                        }
                        break;
                    case '#':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '?':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt10=87;
                        }
                        break;
                    default:
                        alt10=53;}

                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='N'||LA10_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'O':
            case 'o':
                {
                int LA10_80 = input.LA(3);

                if ( (LA10_80=='T'||LA10_80=='t') ) {
                    int LA10_163 = input.LA(4);

                    if ( (LA10_163=='#'||(LA10_163>='-' && LA10_163<='9')||LA10_163=='?'||(LA10_163>='A' && LA10_163<='Z')||LA10_163=='_'||(LA10_163>='a' && LA10_163<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=54;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'A':
            case 'a':
                {
                int LA10_81 = input.LA(3);

                if ( (LA10_81=='M'||LA10_81=='m') ) {
                    int LA10_164 = input.LA(4);

                    if ( (LA10_164=='E'||LA10_164=='e') ) {
                        int LA10_218 = input.LA(5);

                        if ( (LA10_218=='D'||LA10_218=='d') ) {
                            int LA10_268 = input.LA(6);

                            if ( (LA10_268=='#'||(LA10_268>='-' && LA10_268<='9')||LA10_268=='?'||(LA10_268>='A' && LA10_268<='Z')||LA10_268=='_'||(LA10_268>='a' && LA10_268<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=34;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='U'||LA10_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'R':
            case 'r':
                {
                int LA10_82 = input.LA(3);

                if ( (LA10_82=='I'||LA10_82=='i') ) {
                    int LA10_165 = input.LA(4);

                    if ( (LA10_165=='#'||(LA10_165>='-' && LA10_165<='9')||LA10_165=='?'||(LA10_165>='A' && LA10_165<='Z')||LA10_165=='_'||(LA10_165>='a' && LA10_165<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=57;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'S':
            case 's':
                {
                int LA10_83 = input.LA(3);

                if ( (LA10_83=='I'||LA10_83=='i') ) {
                    int LA10_166 = input.LA(4);

                    if ( (LA10_166=='N'||LA10_166=='n') ) {
                        int LA10_220 = input.LA(5);

                        if ( (LA10_220=='G'||LA10_220=='g') ) {
                            int LA10_269 = input.LA(6);

                            if ( (LA10_269=='#'||(LA10_269>='-' && LA10_269<='9')||LA10_269=='?'||(LA10_269>='A' && LA10_269<='Z')||LA10_269=='_'||(LA10_269>='a' && LA10_269<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=37;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'N':
            case 'n':
                {
                int LA10_84 = input.LA(3);

                if ( (LA10_84=='I'||LA10_84=='i') ) {
                    int LA10_167 = input.LA(4);

                    if ( (LA10_167=='O'||LA10_167=='o') ) {
                        int LA10_221 = input.LA(5);

                        if ( (LA10_221=='N'||LA10_221=='n') ) {
                            int LA10_270 = input.LA(6);

                            if ( (LA10_270=='#'||(LA10_270>='-' && LA10_270<='9')||LA10_270=='?'||(LA10_270>='A' && LA10_270<='Z')||LA10_270=='_'||(LA10_270>='a' && LA10_270<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=36;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='W'||LA10_0=='w') ) {
            switch ( input.LA(2) ) {
            case 'H':
            case 'h':
                {
                int LA10_85 = input.LA(3);

                if ( (LA10_85=='E'||LA10_85=='e') ) {
                    int LA10_168 = input.LA(4);

                    if ( (LA10_168=='R'||LA10_168=='r') ) {
                        int LA10_222 = input.LA(5);

                        if ( (LA10_222=='E'||LA10_222=='e') ) {
                            int LA10_271 = input.LA(6);

                            if ( (LA10_271=='#'||(LA10_271>='-' && LA10_271<='9')||LA10_271=='?'||(LA10_271>='A' && LA10_271<='Z')||LA10_271=='_'||(LA10_271>='a' && LA10_271<='z')) ) {
                                alt10=87;
                            }
                            else {
                                alt10=38;}
                        }
                        else {
                            alt10=87;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'I':
            case 'i':
                {
                int LA10_86 = input.LA(3);

                if ( (LA10_86=='T'||LA10_86=='t') ) {
                    int LA10_169 = input.LA(4);

                    if ( (LA10_169=='H'||LA10_169=='h') ) {
                        int LA10_223 = input.LA(5);

                        if ( (LA10_223=='#'||(LA10_223>='-' && LA10_223<='9')||LA10_223=='?'||(LA10_223>='A' && LA10_223<='Z')||LA10_223=='_'||(LA10_223>='a' && LA10_223<='z')) ) {
                            alt10=87;
                        }
                        else {
                            alt10=48;}
                    }
                    else {
                        alt10=87;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='A'||LA10_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'V':
            case 'v':
                {
                int LA10_87 = input.LA(3);

                if ( (LA10_87=='G'||LA10_87=='g') ) {
                    int LA10_170 = input.LA(4);

                    if ( (LA10_170=='#'||(LA10_170>='-' && LA10_170<='9')||LA10_170=='?'||(LA10_170>='A' && LA10_170<='Z')||LA10_170=='_'||(LA10_170>='a' && LA10_170<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=50;}
                }
                else {
                    alt10=87;}
                }
                break;
            case 'S':
            case 's':
                {
                int LA10_88 = input.LA(3);

                if ( (LA10_88=='K'||LA10_88=='k') ) {
                    int LA10_171 = input.LA(4);

                    if ( (LA10_171=='#'||(LA10_171>='-' && LA10_171<='9')||LA10_171=='?'||(LA10_171>='A' && LA10_171<='Z')||LA10_171=='_'||(LA10_171>='a' && LA10_171<='z')) ) {
                        alt10=87;
                    }
                    else {
                        alt10=49;}
                }
                else {
                    alt10=87;}
                }
                break;
            default:
                alt10=87;}

        }
        else if ( (LA10_0=='!') ) {
            int LA10_19 = input.LA(2);

            if ( (LA10_19=='=') ) {
                alt10=58;
            }
            else {
                alt10=92;}
        }
        else if ( (LA10_0=='&') ) {
            int LA10_20 = input.LA(2);

            if ( (LA10_20=='&') ) {
                alt10=59;
            }
            else {
                alt10=92;}
        }
        else if ( (LA10_0=='<') ) {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt10=60;
                }
                break;
            case '#':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case '>':
            case '?':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt10=85;
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='>') ) {
            int LA10_22 = input.LA(2);

            if ( (LA10_22=='=') ) {
                alt10=61;
            }
            else {
                alt10=80;}
        }
        else if ( (LA10_0=='?') ) {
            int LA10_23 = input.LA(2);

            if ( (LA10_23==':') ) {
                alt10=62;
            }
            else {
                alt10=81;}
        }
        else if ( (LA10_0=='^') ) {
            int LA10_24 = input.LA(2);

            if ( (LA10_24=='^') ) {
                alt10=65;
            }
            else {
                alt10=92;}
        }
        else if ( (LA10_0=='_') ) {
            int LA10_25 = input.LA(2);

            if ( (LA10_25==':') ) {
                alt10=66;
            }
            else {
                alt10=92;}
        }
        else if ( (LA10_0=='|') ) {
            int LA10_26 = input.LA(2);

            if ( (LA10_26=='|') ) {
                alt10=67;
            }
            else {
                alt10=92;}
        }
        else if ( (LA10_0=='(') ) {
            alt10=68;
        }
        else if ( (LA10_0==')') ) {
            alt10=69;
        }
        else if ( (LA10_0=='*') ) {
            alt10=70;
        }
        else if ( (LA10_0=='+') ) {
            alt10=71;
        }
        else if ( (LA10_0==',') ) {
            alt10=72;
        }
        else if ( (LA10_0=='-') ) {
            alt10=73;
        }
        else if ( (LA10_0=='.') ) {
            alt10=74;
        }
        else if ( (LA10_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt10=89;
                }
                break;
            case '/':
                {
                alt10=90;
                }
                break;
            default:
                alt10=75;}

        }
        else if ( (LA10_0==':') ) {
            alt10=76;
        }
        else if ( (LA10_0==';') ) {
            alt10=77;
        }
        else if ( (LA10_0=='=') ) {
            alt10=79;
        }
        else if ( (LA10_0=='@') ) {
            alt10=82;
        }
        else if ( (LA10_0=='{') ) {
            alt10=83;
        }
        else if ( (LA10_0=='}') ) {
            alt10=84;
        }
        else if ( (LA10_0=='\"') ) {
            int LA10_41 = input.LA(2);

            if ( ((LA10_41>='\u0000' && LA10_41<='\uFFFE')) ) {
                alt10=86;
            }
            else {
                alt10=92;}
        }
        else if ( ((LA10_0>='J' && LA10_0<='K')||LA10_0=='Q'||LA10_0=='T'||LA10_0=='V'||(LA10_0>='X' && LA10_0<='Z')||(LA10_0>='j' && LA10_0<='k')||LA10_0=='q'||LA10_0=='t'||LA10_0=='v'||(LA10_0>='x' && LA10_0<='z')) ) {
            alt10=87;
        }
        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
            alt10=88;
        }
        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            alt10=91;
        }
        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='#' && LA10_0<='%')||LA10_0=='\''||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='~' && LA10_0<='\uFFFE')) ) {
            alt10=92;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_84 | KEYWORD_83 | KEYWORD_80 | KEYWORD_81 | KEYWORD_82 | KEYWORD_75 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:10: KEYWORD_84
                {
                mKEYWORD_84(); 

                }
                break;
            case 2 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:21: KEYWORD_83
                {
                mKEYWORD_83(); 

                }
                break;
            case 3 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:32: KEYWORD_80
                {
                mKEYWORD_80(); 

                }
                break;
            case 4 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:43: KEYWORD_81
                {
                mKEYWORD_81(); 

                }
                break;
            case 5 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:54: KEYWORD_82
                {
                mKEYWORD_82(); 

                }
                break;
            case 6 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:65: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 7 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:76: KEYWORD_76
                {
                mKEYWORD_76(); 

                }
                break;
            case 8 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:87: KEYWORD_77
                {
                mKEYWORD_77(); 

                }
                break;
            case 9 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:98: KEYWORD_78
                {
                mKEYWORD_78(); 

                }
                break;
            case 10 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:109: KEYWORD_79
                {
                mKEYWORD_79(); 

                }
                break;
            case 11 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:120: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 12 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:131: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 13 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:142: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 14 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:153: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 15 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:164: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 16 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:175: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 17 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:186: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 18 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:197: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 19 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:208: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 20 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:219: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 21 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:230: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 22 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:241: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 23 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:252: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 24 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:263: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 25 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:274: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 26 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:285: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 27 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:296: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 28 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:307: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 29 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:318: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 30 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:329: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 31 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:340: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 32 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:351: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 33 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:362: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 34 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:373: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 35 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:384: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 36 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:395: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 37 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:406: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 38 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:417: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 39 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:428: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 40 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:439: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 41 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:450: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 42 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:461: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 43 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:472: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 44 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:483: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 45 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:494: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 46 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:505: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 47 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:516: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 48 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:527: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 49 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:538: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 50 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:549: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 51 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:560: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 52 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:571: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 53 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:582: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 54 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:593: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 55 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:604: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 56 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:615: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 57 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:626: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 58 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:637: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 59 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:648: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 60 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:659: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 61 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:670: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 62 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:681: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 63 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:692: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 64 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:703: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 65 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:714: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 66 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:725: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 67 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:736: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 68 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:747: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 69 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:757: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 70 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:767: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 71 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:777: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 72 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:787: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 73 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:797: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 74 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:807: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 75 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:817: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 76 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:827: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 77 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:837: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 78 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:848: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 79 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:859: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 80 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:870: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 81 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:881: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 82 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:892: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 83 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:903: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 84 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:914: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 85 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:925: RULE_IRI_TERMINAL
                {
                mRULE_IRI_TERMINAL(); 

                }
                break;
            case 86 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:943: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 87 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:955: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:963: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 89 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:972: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 90 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:988: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 91 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:1004: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // ../com.emftriple.query.sparql/src-gen/com/emftriple/query/parser/antlr/lexer/InternalSparql.g:1:1012: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}