package com.emftriple.query.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJpqlLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=5;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=16;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int RULE_TIME_LITERAL=9;
    public static final int RULE_DATE_STRING=11;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int RULE_DATE_LITERAL=8;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int RULE_TIMESTAMP_LITERAL=10;
    public static final int RULE_LITERALTEMPORAL=7;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=80;
    public static final int RULE_SL_COMMENT=14;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=13;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T50=50;
    public static final int RULE_TIME_STRING=12;
    public static final int T59=59;
    public static final int T52=52;
    public static final int RULE_WS=15;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalJpqlLexer() {;} 
    public InternalJpqlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g"; }

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10:5: ( 'CONCAT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10:7: 'CONCAT'
            {
            match("CONCAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:11:5: ( 'SUBSTRING' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:11:7: 'SUBSTRING'
            {
            match("SUBSTRING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:12:5: ( 'LOWER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:12:7: 'LOWER'
            {
            match("LOWER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:13:5: ( 'UPPER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:13:7: 'UPPER'
            {
            match("UPPER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:14:5: ( 'LENGTH' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:14:7: 'LENGTH'
            {
            match("LENGTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:15:5: ( 'LOCATE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:15:7: 'LOCATE'
            {
            match("LOCATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:16:5: ( 'ABS' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:16:7: 'ABS'
            {
            match("ABS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:17:5: ( 'SQRT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:17:7: 'SQRT'
            {
            match("SQRT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:18:5: ( 'MOD' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:18:7: 'MOD'
            {
            match("MOD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:19:5: ( 'SIZE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:19:7: 'SIZE'
            {
            match("SIZE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:20:5: ( 'TRUE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:20:7: 'TRUE'
            {
            match("TRUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:21:5: ( 'FALSE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:21:7: 'FALSE'
            {
            match("FALSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:22:5: ( '<' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:22:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:23:5: ( '>' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:23:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:24:5: ( '<=' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:24:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:25:5: ( '>=' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:25:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:26:5: ( '=' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:26:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:27:5: ( '!=' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:27:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:28:5: ( 'IMPORT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:28:7: 'IMPORT'
            {
            match("IMPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:29:5: ( ':' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:29:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:30:5: ( 'HAVING' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:30:7: 'HAVING'
            {
            match("HAVING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:31:5: ( 'ORDER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:31:7: 'ORDER'
            {
            match("ORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:32:5: ( 'BY' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:32:7: 'BY'
            {
            match("BY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:33:5: ( ',' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:33:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:34:5: ( '.' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:34:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:35:5: ( 'UPDATE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:35:7: 'UPDATE'
            {
            match("UPDATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:36:5: ( 'SET' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:36:7: 'SET'
            {
            match("SET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:37:5: ( 'DELETE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:37:7: 'DELETE'
            {
            match("DELETE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:38:5: ( 'SELECT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:38:7: 'SELECT'
            {
            match("SELECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:39:5: ( 'AVG' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:39:7: 'AVG'
            {
            match("AVG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:40:5: ( '(' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:40:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:41:5: ( ')' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:41:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:42:5: ( 'MAX' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:42:7: 'MAX'
            {
            match("MAX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:43:5: ( 'MIN' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:43:7: 'MIN'
            {
            match("MIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:44:5: ( 'SUM' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:44:7: 'SUM'
            {
            match("SUM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:45:5: ( 'COUNT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:45:7: 'COUNT'
            {
            match("COUNT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:46:5: ( 'NEW' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:46:7: 'NEW'
            {
            match("NEW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:47:5: ( 'FROM' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:47:7: 'FROM'
            {
            match("FROM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:48:5: ( 'AS' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:48:7: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:49:5: ( 'IN' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:49:7: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:50:5: ( 'JOIN' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:50:7: 'JOIN'
            {
            match("JOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:51:5: ( 'LEFT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:51:7: 'LEFT'
            {
            match("LEFT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:52:5: ( 'INNER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:52:7: 'INNER'
            {
            match("INNER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:53:5: ( 'WHERE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:53:7: 'WHERE'
            {
            match("WHERE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:54:5: ( 'OR' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:54:7: 'OR'
            {
            match("OR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:55:5: ( 'AND' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:55:7: 'AND'
            {
            match("AND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:56:5: ( 'EXISTS' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:56:7: 'EXISTS'
            {
            match("EXISTS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:57:5: ( 'ALL' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:57:7: 'ALL'
            {
            match("ALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:58:5: ( 'ANY' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:58:7: 'ANY'
            {
            match("ANY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:59:5: ( 'SOME' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:59:7: 'SOME'
            {
            match("SOME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:60:5: ( 'MEMBER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:60:7: 'MEMBER'
            {
            match("MEMBER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:61:5: ( 'OF' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:61:7: 'OF'
            {
            match("OF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:62:5: ( 'IS' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:62:7: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:63:5: ( 'NULL' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:63:7: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:64:5: ( 'EMPTY' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:64:7: 'EMPTY'
            {
            match("EMPTY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:65:5: ( 'LIKE' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:65:7: 'LIKE'
            {
            match("LIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:66:5: ( 'BETWEEN' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:66:7: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:67:5: ( 'ASC' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:67:7: 'ASC'
            {
            match("ASC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:68:5: ( 'DESC' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:68:7: 'DESC'
            {
            match("DESC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:69:5: ( 'DISTINCT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:69:7: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:70:5: ( 'FETCH' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:70:7: 'FETCH'
            {
            match("FETCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:71:5: ( 'OUTER' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:71:7: 'OUTER'
            {
            match("OUTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:72:5: ( 'NOT' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:72:7: 'NOT'
            {
            match("NOT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start RULE_LITERALTEMPORAL
    public final void mRULE_LITERALTEMPORAL() throws RecognitionException {
        try {
            int _type = RULE_LITERALTEMPORAL;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:22: ( ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL ) )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
            {
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='(') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='d') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='t') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='s') ) {
                        alt1=3;
                    }
                    else if ( (LA1_3=='\t'||LA1_3==' ') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("10817:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("10817:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10817:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:25: RULE_DATE_LITERAL
                    {
                    mRULE_DATE_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:43: RULE_TIME_LITERAL
                    {
                    mRULE_TIME_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10817:61: RULE_TIMESTAMP_LITERAL
                    {
                    mRULE_TIMESTAMP_LITERAL(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LITERALTEMPORAL

    // $ANTLR start RULE_DATE_LITERAL
    public final void mRULE_DATE_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DATE_LITERAL;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10819:19: ( '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10819:21: '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('d'); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10819:29: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\''); 
            mRULE_DATE_STRING(); 
            match('\''); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10819:68: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DATE_LITERAL

    // $ANTLR start RULE_TIME_LITERAL
    public final void mRULE_TIME_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_TIME_LITERAL;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10821:19: ( '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10821:21: '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('t'); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10821:29: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\''); 
            mRULE_TIME_STRING(); 
            match('\''); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10821:68: ( ' ' | '\\t' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    break loop5;
                }
            } while (true);

            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TIME_LITERAL

    // $ANTLR start RULE_TIMESTAMP_LITERAL
    public final void mRULE_TIMESTAMP_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_TIMESTAMP_LITERAL;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10823:24: ( '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10823:26: '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match("ts"); 

            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10823:35: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('\''); 
            mRULE_DATE_STRING(); 
            match(' '); 
            mRULE_TIME_STRING(); 
            match('\''); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10823:95: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    break loop7;
                }
            } while (true);

            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TIMESTAMP_LITERAL

    // $ANTLR start RULE_DATE_STRING
    public final void mRULE_DATE_STRING() throws RecognitionException {
        try {
            int _type = RULE_DATE_STRING;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10825:18: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10825:20: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DATE_STRING

    // $ANTLR start RULE_TIME_STRING
    public final void mRULE_TIME_STRING() throws RecognitionException {
        try {
            int _type = RULE_TIME_STRING;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:18: ( '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )* )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:20: '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:29: ( '0' .. '9' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:30: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;

            }

            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('.'); 
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:89: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10827:90: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TIME_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10829:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10829:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10829:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10829:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10829:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop11;
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
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10831:10: ( ( '0' .. '9' )+ )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10831:12: ( '0' .. '9' )+
            {
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10831:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10831:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10833:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFE')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFE')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10833:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10835:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10835:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10835:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFE')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10835:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFE')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:41: ( '\\r' )? '\\n'
                    {
                    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10837:41: '\\r'
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
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10839:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10839:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10839:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10841:16: ( . )
            // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:10841:18: .
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
        // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:8: ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=76;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:10: T17
                {
                mT17(); 

                }
                break;
            case 2 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:14: T18
                {
                mT18(); 

                }
                break;
            case 3 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:18: T19
                {
                mT19(); 

                }
                break;
            case 4 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:22: T20
                {
                mT20(); 

                }
                break;
            case 5 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:26: T21
                {
                mT21(); 

                }
                break;
            case 6 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:30: T22
                {
                mT22(); 

                }
                break;
            case 7 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:34: T23
                {
                mT23(); 

                }
                break;
            case 8 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:38: T24
                {
                mT24(); 

                }
                break;
            case 9 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:42: T25
                {
                mT25(); 

                }
                break;
            case 10 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:46: T26
                {
                mT26(); 

                }
                break;
            case 11 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:50: T27
                {
                mT27(); 

                }
                break;
            case 12 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:54: T28
                {
                mT28(); 

                }
                break;
            case 13 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:58: T29
                {
                mT29(); 

                }
                break;
            case 14 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:62: T30
                {
                mT30(); 

                }
                break;
            case 15 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:66: T31
                {
                mT31(); 

                }
                break;
            case 16 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:70: T32
                {
                mT32(); 

                }
                break;
            case 17 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:74: T33
                {
                mT33(); 

                }
                break;
            case 18 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:78: T34
                {
                mT34(); 

                }
                break;
            case 19 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:82: T35
                {
                mT35(); 

                }
                break;
            case 20 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:86: T36
                {
                mT36(); 

                }
                break;
            case 21 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:90: T37
                {
                mT37(); 

                }
                break;
            case 22 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:94: T38
                {
                mT38(); 

                }
                break;
            case 23 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:98: T39
                {
                mT39(); 

                }
                break;
            case 24 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:102: T40
                {
                mT40(); 

                }
                break;
            case 25 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:106: T41
                {
                mT41(); 

                }
                break;
            case 26 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:110: T42
                {
                mT42(); 

                }
                break;
            case 27 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:114: T43
                {
                mT43(); 

                }
                break;
            case 28 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:118: T44
                {
                mT44(); 

                }
                break;
            case 29 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:122: T45
                {
                mT45(); 

                }
                break;
            case 30 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:126: T46
                {
                mT46(); 

                }
                break;
            case 31 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:130: T47
                {
                mT47(); 

                }
                break;
            case 32 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:134: T48
                {
                mT48(); 

                }
                break;
            case 33 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:138: T49
                {
                mT49(); 

                }
                break;
            case 34 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:142: T50
                {
                mT50(); 

                }
                break;
            case 35 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:146: T51
                {
                mT51(); 

                }
                break;
            case 36 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:150: T52
                {
                mT52(); 

                }
                break;
            case 37 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:154: T53
                {
                mT53(); 

                }
                break;
            case 38 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:158: T54
                {
                mT54(); 

                }
                break;
            case 39 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:162: T55
                {
                mT55(); 

                }
                break;
            case 40 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:166: T56
                {
                mT56(); 

                }
                break;
            case 41 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:170: T57
                {
                mT57(); 

                }
                break;
            case 42 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:174: T58
                {
                mT58(); 

                }
                break;
            case 43 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:178: T59
                {
                mT59(); 

                }
                break;
            case 44 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:182: T60
                {
                mT60(); 

                }
                break;
            case 45 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:186: T61
                {
                mT61(); 

                }
                break;
            case 46 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:190: T62
                {
                mT62(); 

                }
                break;
            case 47 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:194: T63
                {
                mT63(); 

                }
                break;
            case 48 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:198: T64
                {
                mT64(); 

                }
                break;
            case 49 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:202: T65
                {
                mT65(); 

                }
                break;
            case 50 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:206: T66
                {
                mT66(); 

                }
                break;
            case 51 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:210: T67
                {
                mT67(); 

                }
                break;
            case 52 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:214: T68
                {
                mT68(); 

                }
                break;
            case 53 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:218: T69
                {
                mT69(); 

                }
                break;
            case 54 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:222: T70
                {
                mT70(); 

                }
                break;
            case 55 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:226: T71
                {
                mT71(); 

                }
                break;
            case 56 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:230: T72
                {
                mT72(); 

                }
                break;
            case 57 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:234: T73
                {
                mT73(); 

                }
                break;
            case 58 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:238: T74
                {
                mT74(); 

                }
                break;
            case 59 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:242: T75
                {
                mT75(); 

                }
                break;
            case 60 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:246: T76
                {
                mT76(); 

                }
                break;
            case 61 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:250: T77
                {
                mT77(); 

                }
                break;
            case 62 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:254: T78
                {
                mT78(); 

                }
                break;
            case 63 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:258: T79
                {
                mT79(); 

                }
                break;
            case 64 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:262: RULE_LITERALTEMPORAL
                {
                mRULE_LITERALTEMPORAL(); 

                }
                break;
            case 65 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:283: RULE_DATE_LITERAL
                {
                mRULE_DATE_LITERAL(); 

                }
                break;
            case 66 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:301: RULE_TIME_LITERAL
                {
                mRULE_TIME_LITERAL(); 

                }
                break;
            case 67 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:319: RULE_TIMESTAMP_LITERAL
                {
                mRULE_TIMESTAMP_LITERAL(); 

                }
                break;
            case 68 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:342: RULE_DATE_STRING
                {
                mRULE_DATE_STRING(); 

                }
                break;
            case 69 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:359: RULE_TIME_STRING
                {
                mRULE_TIME_STRING(); 

                }
                break;
            case 70 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:376: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:384: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 72 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:393: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:405: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:421: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:437: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g:1:445: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\10\44\1\74\1\76\1\uffff\1\42\1\44\1\uffff\3\44\2\uffff"+
        "\1\44\1\121\1\uffff\4\44\1\134\1\42\1\uffff\3\42\2\uffff\1\44\1"+
        "\uffff\11\44\1\162\14\44\6\uffff\1\44\1\u0082\1\u0083\1\uffff\1"+
        "\44\1\u0086\1\u0087\1\44\1\u0089\1\44\2\uffff\2\44\4\uffff\7\44"+
        "\1\134\6\uffff\3\44\1\u009c\1\44\1\u009e\12\44\1\u00a9\1\uffff\1"+
        "\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\44\1\u00b2"+
        "\6\44\2\uffff\2\44\2\uffff\1\44\1\uffff\4\44\3\uffff\1\u00c3\1\44"+
        "\1\u00c5\4\44\1\134\3\44\1\uffff\1\44\1\uffff\1\u00cf\1\u00d0\1"+
        "\u00d1\1\44\1\u00d3\1\u00d4\4\44\10\uffff\1\44\1\uffff\1\u00da\1"+
        "\44\1\u00dc\7\44\1\u00e4\2\44\4\uffff\1\u00ea\1\uffff\1\u00eb\3"+
        "\44\1\134\1\u00f0\3\44\3\uffff\1\44\2\uffff\1\44\1\u00f6\1\u00f7"+
        "\2\44\1\uffff\1\u00fa\1\uffff\1\u00fb\1\44\1\u00fd\1\44\1\u00ff"+
        "\1\u0100\1\44\1\uffff\2\44\5\uffff\1\u0108\1\u0109\1\44\2\uffff"+
        "\1\u010b\1\u010c\1\44\1\u010e\1\u010f\2\uffff\1\u0110\1\u0111\2"+
        "\uffff\1\u0112\1\uffff\1\u0113\2\uffff\1\44\1\u0115\1\44\6\uffff"+
        "\1\u011a\2\uffff\1\44\6\uffff\1\u011c\1\uffff\1\44\4\uffff\1\44"+
        "\1\uffff\1\u0122\3\uffff\1\u0126\51\uffff";
    static final String DFA21_eofS =
        "\u014b\uffff";
    static final String DFA21_minS =
        "\1\0\1\117\2\105\1\120\1\102\1\101\1\122\1\101\2\75\1\uffff\1\75"+
        "\1\115\1\uffff\1\101\1\106\1\105\2\uffff\1\105\1\144\1\uffff\1\105"+
        "\1\117\1\110\1\115\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\116\1\uffff"+
        "\1\114\1\102\1\115\1\132\1\122\1\106\1\113\1\103\1\104\1\60\1\107"+
        "\1\104\1\114\1\123\1\130\1\116\1\115\1\104\1\125\1\114\1\117\1\124"+
        "\6\uffff\1\120\2\60\1\uffff\1\126\2\60\1\124\1\60\1\124\2\uffff"+
        "\1\114\1\123\2\11\2\uffff\1\127\1\114\1\124\1\111\1\105\1\120\1"+
        "\111\1\60\6\uffff\1\116\1\103\1\105\1\60\1\123\1\60\2\105\1\124"+
        "\1\107\1\124\1\105\1\101\2\105\1\101\1\60\1\uffff\7\60\1\102\1\60"+
        "\1\105\1\123\1\115\1\103\1\117\1\105\2\uffff\1\111\1\105\2\uffff"+
        "\1\105\1\uffff\1\127\1\103\1\105\1\124\3\11\1\60\1\114\1\60\1\116"+
        "\1\122\1\124\1\123\1\60\1\124\1\101\1\103\1\uffff\1\124\1\uffff"+
        "\3\60\1\124\2\60\1\124\2\122\1\124\10\uffff\1\105\1\uffff\1\60\1"+
        "\105\1\60\1\110\2\122\1\116\2\122\1\105\1\60\1\124\1\111\1\11\2"+
        "\60\1\uffff\1\60\1\uffff\1\60\1\105\1\131\1\124\1\55\1\60\2\124"+
        "\1\122\3\uffff\1\110\2\uffff\1\105\2\60\1\105\1\122\1\uffff\1\60"+
        "\1\uffff\1\60\1\124\1\60\1\107\2\60\1\105\1\uffff\1\105\1\116\3"+
        "\60\2\uffff\2\60\1\123\2\uffff\2\60\1\111\2\60\2\uffff\2\60\2\uffff"+
        "\1\60\1\uffff\1\60\2\uffff\1\116\1\60\1\103\1\60\1\72\2\60\2\uffff"+
        "\1\60\2\uffff\1\116\6\uffff\1\60\1\uffff\1\124\3\60\1\uffff\1\107"+
        "\1\uffff\2\60\1\72\1\55\1\60\1\uffff\1\55\2\60\1\uffff\4\60\1\56"+
        "\2\55\1\47\2\60\1\47\1\11\2\60\1\11\1\uffff\1\47\1\40\1\uffff\1"+
        "\11\1\60\1\11\1\uffff\1\60\1\72\2\60\1\72\2\60\1\56\2\47\2\11\1"+
        "\uffff";
    static final String DFA21_maxS =
        "\1\ufffe\1\117\1\125\1\117\1\120\1\126\1\117\2\122\2\75\1\uffff"+
        "\1\75\1\123\1\uffff\1\101\1\125\1\131\2\uffff\1\111\1\164\1\uffff"+
        "\1\125\1\117\1\110\1\130\1\72\1\172\1\uffff\2\ufffe\1\57\2\uffff"+
        "\1\125\1\uffff\1\124\2\115\1\132\1\122\1\116\1\113\1\127\1\120\1"+
        "\172\1\107\1\131\1\114\1\123\1\130\1\116\1\115\1\104\1\125\1\114"+
        "\1\117\1\124\6\uffff\1\120\2\172\1\uffff\1\126\2\172\1\124\1\172"+
        "\1\124\2\uffff\2\123\1\163\1\40\2\uffff\1\127\1\114\1\124\1\111"+
        "\1\105\1\120\1\111\1\72\6\uffff\1\116\1\103\1\105\1\172\1\123\1"+
        "\172\2\105\1\124\1\107\1\124\1\105\1\101\2\105\1\101\1\172\1\uffff"+
        "\7\172\1\102\1\172\1\105\1\123\1\115\1\103\1\117\1\105\2\uffff\1"+
        "\111\1\105\2\uffff\1\105\1\uffff\1\127\1\103\1\105\1\124\1\40\2"+
        "\47\1\172\1\114\1\172\1\116\1\122\1\124\1\123\1\71\1\124\1\101\1"+
        "\103\1\uffff\1\124\1\uffff\3\172\1\124\2\172\1\124\2\122\1\124\10"+
        "\uffff\1\105\1\uffff\1\172\1\105\1\172\1\110\2\122\1\116\2\122\1"+
        "\105\1\172\1\124\1\111\1\47\2\71\1\uffff\1\172\1\uffff\1\172\1\105"+
        "\1\131\1\124\1\55\1\172\2\124\1\122\3\uffff\1\110\2\uffff\1\105"+
        "\2\172\1\105\1\122\1\uffff\1\172\1\uffff\1\172\1\124\1\172\1\107"+
        "\2\172\1\105\1\uffff\1\105\1\116\1\71\1\72\1\71\2\uffff\2\172\1"+
        "\123\2\uffff\2\172\1\111\2\172\2\uffff\2\172\2\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\1\116\1\172\1\103\1\71\1\72\2\71\2\uffff\1\172\2"+
        "\uffff\1\116\6\uffff\1\172\1\uffff\1\124\3\71\1\uffff\1\107\1\uffff"+
        "\1\172\1\71\1\72\1\55\1\172\1\uffff\1\55\2\71\1\uffff\4\71\1\56"+
        "\2\55\4\71\1\51\2\71\1\51\1\uffff\1\47\1\40\1\uffff\1\51\1\71\1"+
        "\51\1\uffff\2\72\2\71\1\72\2\71\1\56\2\71\2\51\1\uffff";
    static final String DFA21_acceptS =
        "\13\uffff\1\21\2\uffff\1\24\3\uffff\1\30\1\31\2\uffff\1\40\6\uffff"+
        "\1\106\3\uffff\1\113\1\114\1\uffff\1\106\26\uffff\1\17\1\15\1\20"+
        "\1\16\1\21\1\22\3\uffff\1\24\6\uffff\1\30\1\31\4\uffff\1\37\1\40"+
        "\10\uffff\1\105\1\107\1\110\1\111\1\112\1\113\21\uffff\1\47\17\uffff"+
        "\1\50\1\65\2\uffff\1\55\1\64\1\uffff\1\27\22\uffff\1\33\1\uffff"+
        "\1\43\12\uffff\1\72\1\36\1\61\1\56\1\60\1\7\1\41\1\42\1\uffff\1"+
        "\11\20\uffff\1\45\1\uffff\1\77\11\uffff\1\62\1\12\1\10\1\uffff\1"+
        "\52\1\70\5\uffff\1\13\1\uffff\1\46\7\uffff\1\73\5\uffff\1\66\1\51"+
        "\3\uffff\1\104\1\44\5\uffff\1\3\1\4\2\uffff\1\14\1\75\1\uffff\1"+
        "\53\1\uffff\1\26\1\76\7\uffff\1\54\1\67\1\uffff\1\1\1\35\1\uffff"+
        "\1\5\1\6\1\32\1\63\1\23\1\25\1\uffff\1\34\4\uffff\1\57\1\uffff\1"+
        "\71\5\uffff\1\74\3\uffff\1\2\17\uffff\1\100\2\uffff\1\100\3\uffff"+
        "\1\100\14\uffff\1\100";
    static final String DFA21_specialS =
        "\u014b\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\14\1\36\4\42\1\37\1\25\1"+
            "\26\2\42\1\22\1\42\1\23\1\40\12\33\1\16\1\42\1\11\1\13\1\12"+
            "\2\42\1\5\1\21\1\1\1\24\1\32\1\10\1\35\1\17\1\15\1\30\1\35\1"+
            "\3\1\6\1\27\1\20\3\35\1\2\1\7\1\4\1\35\1\31\3\35\3\42\1\34\1"+
            "\35\1\42\32\35\uff84\42",
            "\1\43",
            "\1\45\3\uffff\1\50\5\uffff\1\47\1\uffff\1\51\3\uffff\1\46",
            "\1\52\3\uffff\1\53\5\uffff\1\54",
            "\1\55",
            "\1\62\11\uffff\1\61\1\uffff\1\60\4\uffff\1\56\2\uffff\1\57",
            "\1\63\3\uffff\1\65\3\uffff\1\64\5\uffff\1\66",
            "\1\67",
            "\1\70\3\uffff\1\72\14\uffff\1\71",
            "\1\73",
            "\1\75",
            "",
            "\1\100",
            "\1\101\1\102\4\uffff\1\103",
            "",
            "\1\105",
            "\1\107\13\uffff\1\106\2\uffff\1\110",
            "\1\112\23\uffff\1\111",
            "",
            "",
            "\1\115\3\uffff\1\116",
            "\1\120\17\uffff\1\117",
            "",
            "\1\123\11\uffff\1\125\5\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130\12\uffff\1\131",
            "\12\132\1\133",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\uffff\135",
            "\uffff\135",
            "\1\136\4\uffff\1\137",
            "",
            "",
            "\1\142\6\uffff\1\141",
            "",
            "\1\143\7\uffff\1\144",
            "\1\145\12\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\7\uffff\1\152",
            "\1\154",
            "\1\155\23\uffff\1\156",
            "\1\160\13\uffff\1\157",
            "\12\44\7\uffff\2\44\1\161\27\44\4\uffff\1\44\1\uffff\32\44",
            "\1\163",
            "\1\165\24\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\12\44\7\uffff\15\44\1\u0081\14\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0084",
            "\12\44\7\uffff\3\44\1\u0085\26\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "",
            "",
            "\1\u008c\6\uffff\1\u008b",
            "\1\u008d",
            "\1\u008f\26\uffff\1\u008f\122\uffff\1\u008e",
            "\1\u0090\26\uffff\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\u0098\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\26\uffff\1\u00c0",
            "\1\u008f\26\uffff\1\u008f\6\uffff\1\u00c1",
            "\1\u0090\26\uffff\1\u0090\6\uffff\1\u00c2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00db",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00c0\26\uffff\1\u00c0\6\uffff\1\u00e7",
            "\12\u00e8",
            "\12\u00e9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "",
            "\1\u00f4",
            "",
            "",
            "\1\u00f5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fe",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\12\u0104",
            "\12\u0105\1\u0106",
            "\12\u0107",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u010a",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u010d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u0114",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0116",
            "\12\u0117",
            "\1\u0106",
            "\12\u0118",
            "\12\u0119",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u011b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u011d",
            "\12\u011e",
            "\12\u011f",
            "\12\u0120",
            "",
            "\1\u0121",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0127",
            "\12\u0128",
            "\12\u0129",
            "",
            "\12\u012a",
            "\12\u012b",
            "\12\u012c",
            "\12\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0132\10\uffff\12\u0131",
            "\12\u0133",
            "\12\u0134",
            "\1\u0132\10\uffff\12\u0131",
            "\1\u0135\26\uffff\1\u0135\10\uffff\1\u0136",
            "\12\u0137",
            "\12\u0138",
            "\1\u0135\26\uffff\1\u0135\10\uffff\1\u0136",
            "",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c\26\uffff\1\u013c\10\uffff\1\u013d",
            "\12\u013e",
            "\1\u013c\26\uffff\1\u013c\10\uffff\1\u013d",
            "",
            "\12\u013f\1\u0140",
            "\1\u0140",
            "\12\u0141",
            "\12\u0142",
            "\1\u0143",
            "\12\u0144",
            "\12\u0145",
            "\1\u0146",
            "\1\u0148\10\uffff\12\u0147",
            "\1\u0148\10\uffff\12\u0147",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}