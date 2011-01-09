package com.emftriple.query.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSparqlLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int RULE_IRI_TERMINAL=5;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=87;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T81=81;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T83=83;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T82=82;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalSparqlLexer() {;} 
    public InternalSparqlLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:10:5: ( '<' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:10:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:11:5: ( '>' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:11:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:12:5: ( '<=' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:12:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:13:5: ( '>=' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:13:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:14:5: ( '=' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:14:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15:5: ( '!=' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15:7: '!='
            {
            match("!="); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:16:5: ( '+' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:16:7: '+'
            {
            match('+'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:17:5: ( '/' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:17:7: '/'
            {
            match('/'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:18:5: ( '-' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:18:7: '-'
            {
            match('-'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:19:5: ( '*' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:19:7: '*'
            {
            match('*'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:20:5: ( 'PREFIX' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:20:7: 'PREFIX'
            {
            match("PREFIX"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:21:5: ( ':' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:21:7: ':'
            {
            match(':'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:22:5: ( 'BASE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:22:7: 'BASE'
            {
            match("BASE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:23:5: ( 'SELECT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:23:7: 'SELECT'
            {
            match("SELECT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:24:5: ( 'ASK' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:24:7: 'ASK'
            {
            match("ASK"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:25:5: ( 'DESCRIBE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:25:7: 'DESCRIBE'
            {
            match("DESCRIBE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:26:5: ( 'CONSTRUCT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:26:7: 'CONSTRUCT'
            {
            match("CONSTRUCT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:27:5: ( 'CREATE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:27:7: 'CREATE'
            {
            match("CREATE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:28:5: ( 'GRAPH' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:28:7: 'GRAPH'
            {
            match("GRAPH"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:29:5: ( 'DROP' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:29:7: 'DROP'
            {
            match("DROP"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:30:5: ( 'LOAD' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:30:7: 'LOAD'
            {
            match("LOAD"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:31:5: ( 'INTO' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:31:7: 'INTO'
            {
            match("INTO"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:32:5: ( 'CLEAR' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:32:7: 'CLEAR'
            {
            match("CLEAR"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:33:5: ( 'INSERT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:33:7: 'INSERT'
            {
            match("INSERT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:34:5: ( 'WITH' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:34:7: 'WITH'
            {
            match("WITH"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:35:5: ( 'DATA' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:35:7: 'DATA'
            {
            match("DATA"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:36:5: ( 'DELETE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:36:7: 'DELETE'
            {
            match("DELETE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:37:5: ( 'FROM' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:37:7: 'FROM'
            {
            match("FROM"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:38:5: ( 'WHERE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:38:7: 'WHERE'
            {
            match("WHERE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:39:5: ( '{' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:39:7: '{'
            {
            match('{'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:40:5: ( '}' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:40:7: '}'
            {
            match('}'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:41:5: ( 'NAMED' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:41:7: 'NAMED'
            {
            match("NAMED"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:42:5: ( 'SERVICE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:42:7: 'SERVICE'
            {
            match("SERVICE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:43:5: ( 'GROUP' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:43:7: 'GROUP'
            {
            match("GROUP"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:44:5: ( 'BY' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:44:7: 'BY'
            {
            match("BY"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:45:5: ( 'HAVING' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:45:7: 'HAVING'
            {
            match("HAVING"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:46:5: ( 'LIMIT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:46:7: 'LIMIT'
            {
            match("LIMIT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:47:5: ( '.' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:47:7: '.'
            {
            match('.'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:48:5: ( ';' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:48:7: ';'
            {
            match(';'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:49:5: ( 'UNION' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:49:7: 'UNION'
            {
            match("UNION"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:50:5: ( 'OPTIONAL' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:50:7: 'OPTIONAL'
            {
            match("OPTIONAL"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:51:5: ( 'FILTER' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:51:7: 'FILTER'
            {
            match("FILTER"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:52:5: ( '(' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:52:7: '('
            {
            match('('); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:53:5: ( ')' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:53:7: ')'
            {
            match(')'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:54:5: ( 'EXISTS' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:54:7: 'EXISTS'
            {
            match("EXISTS"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:55:5: ( 'NOT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:55:7: 'NOT'
            {
            match("NOT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:56:5: ( 'MINUS' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:56:7: 'MINUS'
            {
            match("MINUS"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:57:5: ( '||' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:57:7: '||'
            {
            match("||"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:58:5: ( '&&' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:58:7: '&&'
            {
            match("&&"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:59:5: ( ',' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:59:7: ','
            {
            match(','); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:60:5: ( 'STR' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:60:7: 'STR'
            {
            match("STR"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:61:5: ( 'LANG' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:61:7: 'LANG'
            {
            match("LANG"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:62:5: ( 'LANGMATCHES' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:62:7: 'LANGMATCHES'
            {
            match("LANGMATCHES"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:63:5: ( 'DATATYPE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:63:7: 'DATATYPE'
            {
            match("DATATYPE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:64:5: ( 'BOUND' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:64:7: 'BOUND'
            {
            match("BOUND"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:65:5: ( 'IRI' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:65:7: 'IRI'
            {
            match("IRI"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:66:5: ( 'URI' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:66:7: 'URI'
            {
            match("URI"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:67:5: ( 'BNODE' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:67:7: 'BNODE'
            {
            match("BNODE"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:68:5: ( 'IF' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:68:7: 'IF'
            {
            match("IF"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:69:5: ( 'STRLANG' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:69:7: 'STRLANG'
            {
            match("STRLANG"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:70:5: ( 'STRDT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:70:7: 'STRDT'
            {
            match("STRDT"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:71:5: ( 'sameTerm' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:71:7: 'sameTerm'
            {
            match("sameTerm"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:72:5: ( 'isIRI' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:72:7: 'isIRI'
            {
            match("isIRI"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:73:5: ( 'isURI' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:73:7: 'isURI'
            {
            match("isURI"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:74:5: ( 'isBLANK' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:74:7: 'isBLANK'
            {
            match("isBLANK"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:75:5: ( 'isLITERAL' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:75:7: 'isLITERAL'
            {
            match("isLITERAL"); 


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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:76:5: ( '?' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:76:7: '?'
            {
            match('?'); 

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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:77:5: ( '_:' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:77:7: '_:'
            {
            match("_:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:78:5: ( '?:' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:78:7: '?:'
            {
            match("?:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:79:5: ( '^^' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:79:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:80:5: ( '@' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:80:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:81:5: ( 'DISTINCT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:81:7: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:82:5: ( 'REDUCED' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:82:7: 'REDUCED'
            {
            match("REDUCED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:83:5: ( 'SILENT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:83:7: 'SILENT'
            {
            match("SILENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:84:5: ( 'DEFAULT' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:84:7: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start RULE_IRI_TERMINAL
    public final void mRULE_IRI_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IRI_TERMINAL;
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15484:19: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15484:21: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>'
            {
            match('<'); 
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15484:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='-' && LA1_0<=':')||LA1_0=='='||(LA1_0>='?' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15486:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15486:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15486:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15486:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15486:61: ~ ( ( '\\\\' | '\"' ) )
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15488:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )* )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15488:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15488:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='-' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15490:10: ( ( '0' .. '9' )+ )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15490:12: ( '0' .. '9' )+
            {
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15490:12: ( '0' .. '9' )+
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
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15490:13: '0' .. '9'
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15492:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15492:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15492:24: ( options {greedy=false; } : . )*
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
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15492:52: .
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:41: ( '\\r' )? '\\n'
                    {
                    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15494:41: '\\r'
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15496:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15496:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:
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
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15498:16: ( . )
            // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:15498:18: .
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
        // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=83;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='<') ) {
            switch ( input.LA(2) ) {
            case '=':
                {
                int LA10_48 = input.LA(3);

                if ( ((LA10_48>='#' && LA10_48<='$')||LA10_48=='&'||(LA10_48>='-' && LA10_48<=':')||(LA10_48>='=' && LA10_48<='Z')||LA10_48=='_'||(LA10_48>='a' && LA10_48<='z')) ) {
                    alt10=76;
                }
                else {
                    alt10=3;}
                }
                break;
            case '#':
            case '$':
            case '&':
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
            case '@':
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
                alt10=76;
                }
                break;
            default:
                alt10=1;}

        }
        else if ( (LA10_0=='>') ) {
            int LA10_2 = input.LA(2);

            if ( (LA10_2=='=') ) {
                alt10=4;
            }
            else {
                alt10=2;}
        }
        else if ( (LA10_0=='=') ) {
            alt10=5;
        }
        else if ( (LA10_0=='!') ) {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='=') ) {
                alt10=6;
            }
            else {
                alt10=83;}
        }
        else if ( (LA10_0=='+') ) {
            alt10=7;
        }
        else if ( (LA10_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt10=81;
                }
                break;
            case '*':
                {
                alt10=80;
                }
                break;
            default:
                alt10=8;}

        }
        else if ( (LA10_0=='-') ) {
            alt10=9;
        }
        else if ( (LA10_0=='*') ) {
            alt10=10;
        }
        else if ( (LA10_0=='P') ) {
            int LA10_9 = input.LA(2);

            if ( (LA10_9=='R') ) {
                int LA10_61 = input.LA(3);

                if ( (LA10_61=='E') ) {
                    int LA10_119 = input.LA(4);

                    if ( (LA10_119=='F') ) {
                        int LA10_165 = input.LA(5);

                        if ( (LA10_165=='I') ) {
                            int LA10_211 = input.LA(6);

                            if ( (LA10_211=='X') ) {
                                int LA10_254 = input.LA(7);

                                if ( (LA10_254=='#'||(LA10_254>='-' && LA10_254<='9')||LA10_254=='?'||(LA10_254>='A' && LA10_254<='Z')||LA10_254=='_'||(LA10_254>='a' && LA10_254<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=11;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0==':') ) {
            alt10=12;
        }
        else if ( (LA10_0=='B') ) {
            switch ( input.LA(2) ) {
            case 'Y':
                {
                int LA10_64 = input.LA(3);

                if ( (LA10_64=='#'||(LA10_64>='-' && LA10_64<='9')||LA10_64=='?'||(LA10_64>='A' && LA10_64<='Z')||LA10_64=='_'||(LA10_64>='a' && LA10_64<='z')) ) {
                    alt10=78;
                }
                else {
                    alt10=35;}
                }
                break;
            case 'O':
                {
                int LA10_65 = input.LA(3);

                if ( (LA10_65=='U') ) {
                    int LA10_121 = input.LA(4);

                    if ( (LA10_121=='N') ) {
                        int LA10_166 = input.LA(5);

                        if ( (LA10_166=='D') ) {
                            int LA10_212 = input.LA(6);

                            if ( (LA10_212=='#'||(LA10_212>='-' && LA10_212<='9')||LA10_212=='?'||(LA10_212>='A' && LA10_212<='Z')||LA10_212=='_'||(LA10_212>='a' && LA10_212<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=55;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'N':
                {
                int LA10_66 = input.LA(3);

                if ( (LA10_66=='O') ) {
                    int LA10_122 = input.LA(4);

                    if ( (LA10_122=='D') ) {
                        int LA10_167 = input.LA(5);

                        if ( (LA10_167=='E') ) {
                            int LA10_213 = input.LA(6);

                            if ( (LA10_213=='#'||(LA10_213>='-' && LA10_213<='9')||LA10_213=='?'||(LA10_213>='A' && LA10_213<='Z')||LA10_213=='_'||(LA10_213>='a' && LA10_213<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=58;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'A':
                {
                int LA10_67 = input.LA(3);

                if ( (LA10_67=='S') ) {
                    int LA10_123 = input.LA(4);

                    if ( (LA10_123=='E') ) {
                        int LA10_168 = input.LA(5);

                        if ( (LA10_168=='#'||(LA10_168>='-' && LA10_168<='9')||LA10_168=='?'||(LA10_168>='A' && LA10_168<='Z')||LA10_168=='_'||(LA10_168>='a' && LA10_168<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=13;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA10_68 = input.LA(3);

                if ( (LA10_68=='L') ) {
                    int LA10_124 = input.LA(4);

                    if ( (LA10_124=='E') ) {
                        int LA10_169 = input.LA(5);

                        if ( (LA10_169=='N') ) {
                            int LA10_215 = input.LA(6);

                            if ( (LA10_215=='T') ) {
                                int LA10_257 = input.LA(7);

                                if ( (LA10_257=='#'||(LA10_257>='-' && LA10_257<='9')||LA10_257=='?'||(LA10_257>='A' && LA10_257<='Z')||LA10_257=='_'||(LA10_257>='a' && LA10_257<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'E':
                {
                switch ( input.LA(3) ) {
                case 'R':
                    {
                    int LA10_125 = input.LA(4);

                    if ( (LA10_125=='V') ) {
                        int LA10_170 = input.LA(5);

                        if ( (LA10_170=='I') ) {
                            int LA10_216 = input.LA(6);

                            if ( (LA10_216=='C') ) {
                                int LA10_258 = input.LA(7);

                                if ( (LA10_258=='E') ) {
                                    int LA10_291 = input.LA(8);

                                    if ( (LA10_291=='#'||(LA10_291>='-' && LA10_291<='9')||LA10_291=='?'||(LA10_291>='A' && LA10_291<='Z')||LA10_291=='_'||(LA10_291>='a' && LA10_291<='z')) ) {
                                        alt10=78;
                                    }
                                    else {
                                        alt10=33;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'L':
                    {
                    int LA10_126 = input.LA(4);

                    if ( (LA10_126=='E') ) {
                        int LA10_171 = input.LA(5);

                        if ( (LA10_171=='C') ) {
                            int LA10_217 = input.LA(6);

                            if ( (LA10_217=='T') ) {
                                int LA10_259 = input.LA(7);

                                if ( (LA10_259=='#'||(LA10_259>='-' && LA10_259<='9')||LA10_259=='?'||(LA10_259>='A' && LA10_259<='Z')||LA10_259=='_'||(LA10_259>='a' && LA10_259<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=14;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                default:
                    alt10=78;}

                }
                break;
            case 'T':
                {
                int LA10_70 = input.LA(3);

                if ( (LA10_70=='R') ) {
                    switch ( input.LA(4) ) {
                    case 'L':
                        {
                        int LA10_172 = input.LA(5);

                        if ( (LA10_172=='A') ) {
                            int LA10_218 = input.LA(6);

                            if ( (LA10_218=='N') ) {
                                int LA10_260 = input.LA(7);

                                if ( (LA10_260=='G') ) {
                                    int LA10_293 = input.LA(8);

                                    if ( (LA10_293=='#'||(LA10_293>='-' && LA10_293<='9')||LA10_293=='?'||(LA10_293>='A' && LA10_293<='Z')||LA10_293=='_'||(LA10_293>='a' && LA10_293<='z')) ) {
                                        alt10=78;
                                    }
                                    else {
                                        alt10=60;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                        }
                        break;
                    case 'D':
                        {
                        int LA10_173 = input.LA(5);

                        if ( (LA10_173=='T') ) {
                            int LA10_219 = input.LA(6);

                            if ( (LA10_219=='#'||(LA10_219>='-' && LA10_219<='9')||LA10_219=='?'||(LA10_219>='A' && LA10_219<='Z')||LA10_219=='_'||(LA10_219>='a' && LA10_219<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=61;}
                        }
                        else {
                            alt10=78;}
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
                        alt10=78;
                        }
                        break;
                    default:
                        alt10=51;}

                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='A') ) {
            int LA10_13 = input.LA(2);

            if ( (LA10_13=='S') ) {
                int LA10_71 = input.LA(3);

                if ( (LA10_71=='K') ) {
                    int LA10_128 = input.LA(4);

                    if ( (LA10_128=='#'||(LA10_128>='-' && LA10_128<='9')||LA10_128=='?'||(LA10_128>='A' && LA10_128<='Z')||LA10_128=='_'||(LA10_128>='a' && LA10_128<='z')) ) {
                        alt10=78;
                    }
                    else {
                        alt10=15;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA10_72 = input.LA(3);

                if ( (LA10_72=='T') ) {
                    int LA10_129 = input.LA(4);

                    if ( (LA10_129=='A') ) {
                        switch ( input.LA(5) ) {
                        case 'T':
                            {
                            int LA10_220 = input.LA(6);

                            if ( (LA10_220=='Y') ) {
                                int LA10_262 = input.LA(7);

                                if ( (LA10_262=='P') ) {
                                    int LA10_294 = input.LA(8);

                                    if ( (LA10_294=='E') ) {
                                        int LA10_313 = input.LA(9);

                                        if ( (LA10_313=='#'||(LA10_313>='-' && LA10_313<='9')||LA10_313=='?'||(LA10_313>='A' && LA10_313<='Z')||LA10_313=='_'||(LA10_313>='a' && LA10_313<='z')) ) {
                                            alt10=78;
                                        }
                                        else {
                                            alt10=54;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
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
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt10=78;
                            }
                            break;
                        default:
                            alt10=26;}

                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'E':
                {
                switch ( input.LA(3) ) {
                case 'L':
                    {
                    int LA10_130 = input.LA(4);

                    if ( (LA10_130=='E') ) {
                        int LA10_177 = input.LA(5);

                        if ( (LA10_177=='T') ) {
                            int LA10_222 = input.LA(6);

                            if ( (LA10_222=='E') ) {
                                int LA10_263 = input.LA(7);

                                if ( (LA10_263=='#'||(LA10_263>='-' && LA10_263<='9')||LA10_263=='?'||(LA10_263>='A' && LA10_263<='Z')||LA10_263=='_'||(LA10_263>='a' && LA10_263<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=27;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'F':
                    {
                    int LA10_131 = input.LA(4);

                    if ( (LA10_131=='A') ) {
                        int LA10_178 = input.LA(5);

                        if ( (LA10_178=='U') ) {
                            int LA10_223 = input.LA(6);

                            if ( (LA10_223=='L') ) {
                                int LA10_264 = input.LA(7);

                                if ( (LA10_264=='T') ) {
                                    int LA10_296 = input.LA(8);

                                    if ( (LA10_296=='#'||(LA10_296>='-' && LA10_296<='9')||LA10_296=='?'||(LA10_296>='A' && LA10_296<='Z')||LA10_296=='_'||(LA10_296>='a' && LA10_296<='z')) ) {
                                        alt10=78;
                                    }
                                    else {
                                        alt10=75;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'S':
                    {
                    int LA10_132 = input.LA(4);

                    if ( (LA10_132=='C') ) {
                        int LA10_179 = input.LA(5);

                        if ( (LA10_179=='R') ) {
                            int LA10_224 = input.LA(6);

                            if ( (LA10_224=='I') ) {
                                int LA10_265 = input.LA(7);

                                if ( (LA10_265=='B') ) {
                                    int LA10_297 = input.LA(8);

                                    if ( (LA10_297=='E') ) {
                                        int LA10_315 = input.LA(9);

                                        if ( (LA10_315=='#'||(LA10_315>='-' && LA10_315<='9')||LA10_315=='?'||(LA10_315>='A' && LA10_315<='Z')||LA10_315=='_'||(LA10_315>='a' && LA10_315<='z')) ) {
                                            alt10=78;
                                        }
                                        else {
                                            alt10=16;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                default:
                    alt10=78;}

                }
                break;
            case 'R':
                {
                int LA10_74 = input.LA(3);

                if ( (LA10_74=='O') ) {
                    int LA10_133 = input.LA(4);

                    if ( (LA10_133=='P') ) {
                        int LA10_180 = input.LA(5);

                        if ( (LA10_180=='#'||(LA10_180>='-' && LA10_180<='9')||LA10_180=='?'||(LA10_180>='A' && LA10_180<='Z')||LA10_180=='_'||(LA10_180>='a' && LA10_180<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=20;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'I':
                {
                int LA10_75 = input.LA(3);

                if ( (LA10_75=='S') ) {
                    int LA10_134 = input.LA(4);

                    if ( (LA10_134=='T') ) {
                        int LA10_181 = input.LA(5);

                        if ( (LA10_181=='I') ) {
                            int LA10_226 = input.LA(6);

                            if ( (LA10_226=='N') ) {
                                int LA10_266 = input.LA(7);

                                if ( (LA10_266=='C') ) {
                                    int LA10_298 = input.LA(8);

                                    if ( (LA10_298=='T') ) {
                                        int LA10_316 = input.LA(9);

                                        if ( (LA10_316=='#'||(LA10_316>='-' && LA10_316<='9')||LA10_316=='?'||(LA10_316>='A' && LA10_316<='Z')||LA10_316=='_'||(LA10_316>='a' && LA10_316<='z')) ) {
                                            alt10=78;
                                        }
                                        else {
                                            alt10=72;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA10_76 = input.LA(3);

                if ( (LA10_76=='E') ) {
                    int LA10_135 = input.LA(4);

                    if ( (LA10_135=='A') ) {
                        int LA10_182 = input.LA(5);

                        if ( (LA10_182=='R') ) {
                            int LA10_227 = input.LA(6);

                            if ( (LA10_227=='#'||(LA10_227>='-' && LA10_227<='9')||LA10_227=='?'||(LA10_227>='A' && LA10_227<='Z')||LA10_227=='_'||(LA10_227>='a' && LA10_227<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=23;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'R':
                {
                int LA10_77 = input.LA(3);

                if ( (LA10_77=='E') ) {
                    int LA10_136 = input.LA(4);

                    if ( (LA10_136=='A') ) {
                        int LA10_183 = input.LA(5);

                        if ( (LA10_183=='T') ) {
                            int LA10_228 = input.LA(6);

                            if ( (LA10_228=='E') ) {
                                int LA10_268 = input.LA(7);

                                if ( (LA10_268=='#'||(LA10_268>='-' && LA10_268<='9')||LA10_268=='?'||(LA10_268>='A' && LA10_268<='Z')||LA10_268=='_'||(LA10_268>='a' && LA10_268<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=18;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'O':
                {
                int LA10_78 = input.LA(3);

                if ( (LA10_78=='N') ) {
                    int LA10_137 = input.LA(4);

                    if ( (LA10_137=='S') ) {
                        int LA10_184 = input.LA(5);

                        if ( (LA10_184=='T') ) {
                            int LA10_229 = input.LA(6);

                            if ( (LA10_229=='R') ) {
                                int LA10_269 = input.LA(7);

                                if ( (LA10_269=='U') ) {
                                    int LA10_300 = input.LA(8);

                                    if ( (LA10_300=='C') ) {
                                        int LA10_317 = input.LA(9);

                                        if ( (LA10_317=='T') ) {
                                            int LA10_327 = input.LA(10);

                                            if ( (LA10_327=='#'||(LA10_327>='-' && LA10_327<='9')||LA10_327=='?'||(LA10_327>='A' && LA10_327<='Z')||LA10_327=='_'||(LA10_327>='a' && LA10_327<='z')) ) {
                                                alt10=78;
                                            }
                                            else {
                                                alt10=17;}
                                        }
                                        else {
                                            alt10=78;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='G') ) {
            int LA10_16 = input.LA(2);

            if ( (LA10_16=='R') ) {
                switch ( input.LA(3) ) {
                case 'A':
                    {
                    int LA10_138 = input.LA(4);

                    if ( (LA10_138=='P') ) {
                        int LA10_185 = input.LA(5);

                        if ( (LA10_185=='H') ) {
                            int LA10_230 = input.LA(6);

                            if ( (LA10_230=='#'||(LA10_230>='-' && LA10_230<='9')||LA10_230=='?'||(LA10_230>='A' && LA10_230<='Z')||LA10_230=='_'||(LA10_230>='a' && LA10_230<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=19;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'O':
                    {
                    int LA10_139 = input.LA(4);

                    if ( (LA10_139=='U') ) {
                        int LA10_186 = input.LA(5);

                        if ( (LA10_186=='P') ) {
                            int LA10_231 = input.LA(6);

                            if ( (LA10_231=='#'||(LA10_231>='-' && LA10_231<='9')||LA10_231=='?'||(LA10_231>='A' && LA10_231<='Z')||LA10_231=='_'||(LA10_231>='a' && LA10_231<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=34;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                default:
                    alt10=78;}

            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA10_80 = input.LA(3);

                if ( (LA10_80=='A') ) {
                    int LA10_140 = input.LA(4);

                    if ( (LA10_140=='D') ) {
                        int LA10_187 = input.LA(5);

                        if ( (LA10_187=='#'||(LA10_187>='-' && LA10_187<='9')||LA10_187=='?'||(LA10_187>='A' && LA10_187<='Z')||LA10_187=='_'||(LA10_187>='a' && LA10_187<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=21;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'I':
                {
                int LA10_81 = input.LA(3);

                if ( (LA10_81=='M') ) {
                    int LA10_141 = input.LA(4);

                    if ( (LA10_141=='I') ) {
                        int LA10_188 = input.LA(5);

                        if ( (LA10_188=='T') ) {
                            int LA10_233 = input.LA(6);

                            if ( (LA10_233=='#'||(LA10_233>='-' && LA10_233<='9')||LA10_233=='?'||(LA10_233>='A' && LA10_233<='Z')||LA10_233=='_'||(LA10_233>='a' && LA10_233<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=37;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'A':
                {
                int LA10_82 = input.LA(3);

                if ( (LA10_82=='N') ) {
                    int LA10_142 = input.LA(4);

                    if ( (LA10_142=='G') ) {
                        switch ( input.LA(5) ) {
                        case 'M':
                            {
                            int LA10_234 = input.LA(6);

                            if ( (LA10_234=='A') ) {
                                int LA10_273 = input.LA(7);

                                if ( (LA10_273=='T') ) {
                                    int LA10_301 = input.LA(8);

                                    if ( (LA10_301=='C') ) {
                                        int LA10_318 = input.LA(9);

                                        if ( (LA10_318=='H') ) {
                                            int LA10_328 = input.LA(10);

                                            if ( (LA10_328=='E') ) {
                                                int LA10_333 = input.LA(11);

                                                if ( (LA10_333=='S') ) {
                                                    int LA10_335 = input.LA(12);

                                                    if ( (LA10_335=='#'||(LA10_335>='-' && LA10_335<='9')||LA10_335=='?'||(LA10_335>='A' && LA10_335<='Z')||LA10_335=='_'||(LA10_335>='a' && LA10_335<='z')) ) {
                                                        alt10=78;
                                                    }
                                                    else {
                                                        alt10=53;}
                                                }
                                                else {
                                                    alt10=78;}
                                            }
                                            else {
                                                alt10=78;}
                                        }
                                        else {
                                            alt10=78;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
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
                            alt10=78;
                            }
                            break;
                        default:
                            alt10=52;}

                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA10_143 = input.LA(4);

                    if ( (LA10_143=='O') ) {
                        int LA10_190 = input.LA(5);

                        if ( (LA10_190=='#'||(LA10_190>='-' && LA10_190<='9')||LA10_190=='?'||(LA10_190>='A' && LA10_190<='Z')||LA10_190=='_'||(LA10_190>='a' && LA10_190<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=22;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'S':
                    {
                    int LA10_144 = input.LA(4);

                    if ( (LA10_144=='E') ) {
                        int LA10_191 = input.LA(5);

                        if ( (LA10_191=='R') ) {
                            int LA10_237 = input.LA(6);

                            if ( (LA10_237=='T') ) {
                                int LA10_274 = input.LA(7);

                                if ( (LA10_274=='#'||(LA10_274>='-' && LA10_274<='9')||LA10_274=='?'||(LA10_274>='A' && LA10_274<='Z')||LA10_274=='_'||(LA10_274>='a' && LA10_274<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=24;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                default:
                    alt10=78;}

                }
                break;
            case 'R':
                {
                int LA10_84 = input.LA(3);

                if ( (LA10_84=='I') ) {
                    int LA10_145 = input.LA(4);

                    if ( (LA10_145=='#'||(LA10_145>='-' && LA10_145<='9')||LA10_145=='?'||(LA10_145>='A' && LA10_145<='Z')||LA10_145=='_'||(LA10_145>='a' && LA10_145<='z')) ) {
                        alt10=78;
                    }
                    else {
                        alt10=56;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'F':
                {
                int LA10_85 = input.LA(3);

                if ( (LA10_85=='#'||(LA10_85>='-' && LA10_85<='9')||LA10_85=='?'||(LA10_85>='A' && LA10_85<='Z')||LA10_85=='_'||(LA10_85>='a' && LA10_85<='z')) ) {
                    alt10=78;
                }
                else {
                    alt10=59;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='W') ) {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA10_86 = input.LA(3);

                if ( (LA10_86=='T') ) {
                    int LA10_147 = input.LA(4);

                    if ( (LA10_147=='H') ) {
                        int LA10_193 = input.LA(5);

                        if ( (LA10_193=='#'||(LA10_193>='-' && LA10_193<='9')||LA10_193=='?'||(LA10_193>='A' && LA10_193<='Z')||LA10_193=='_'||(LA10_193>='a' && LA10_193<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=25;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'H':
                {
                int LA10_87 = input.LA(3);

                if ( (LA10_87=='E') ) {
                    int LA10_148 = input.LA(4);

                    if ( (LA10_148=='R') ) {
                        int LA10_194 = input.LA(5);

                        if ( (LA10_194=='E') ) {
                            int LA10_239 = input.LA(6);

                            if ( (LA10_239=='#'||(LA10_239>='-' && LA10_239<='9')||LA10_239=='?'||(LA10_239>='A' && LA10_239<='Z')||LA10_239=='_'||(LA10_239>='a' && LA10_239<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=29;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA10_88 = input.LA(3);

                if ( (LA10_88=='O') ) {
                    int LA10_149 = input.LA(4);

                    if ( (LA10_149=='M') ) {
                        int LA10_195 = input.LA(5);

                        if ( (LA10_195=='#'||(LA10_195>='-' && LA10_195<='9')||LA10_195=='?'||(LA10_195>='A' && LA10_195<='Z')||LA10_195=='_'||(LA10_195>='a' && LA10_195<='z')) ) {
                            alt10=78;
                        }
                        else {
                            alt10=28;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'I':
                {
                int LA10_89 = input.LA(3);

                if ( (LA10_89=='L') ) {
                    int LA10_150 = input.LA(4);

                    if ( (LA10_150=='T') ) {
                        int LA10_196 = input.LA(5);

                        if ( (LA10_196=='E') ) {
                            int LA10_241 = input.LA(6);

                            if ( (LA10_241=='R') ) {
                                int LA10_276 = input.LA(7);

                                if ( (LA10_276=='#'||(LA10_276>='-' && LA10_276<='9')||LA10_276=='?'||(LA10_276>='A' && LA10_276<='Z')||LA10_276=='_'||(LA10_276>='a' && LA10_276<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=42;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='{') ) {
            alt10=30;
        }
        else if ( (LA10_0=='}') ) {
            alt10=31;
        }
        else if ( (LA10_0=='N') ) {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA10_92 = input.LA(3);

                if ( (LA10_92=='M') ) {
                    int LA10_151 = input.LA(4);

                    if ( (LA10_151=='E') ) {
                        int LA10_197 = input.LA(5);

                        if ( (LA10_197=='D') ) {
                            int LA10_242 = input.LA(6);

                            if ( (LA10_242=='#'||(LA10_242>='-' && LA10_242<='9')||LA10_242=='?'||(LA10_242>='A' && LA10_242<='Z')||LA10_242=='_'||(LA10_242>='a' && LA10_242<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=32;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'O':
                {
                int LA10_93 = input.LA(3);

                if ( (LA10_93=='T') ) {
                    int LA10_152 = input.LA(4);

                    if ( (LA10_152=='#'||(LA10_152>='-' && LA10_152<='9')||LA10_152=='?'||(LA10_152>='A' && LA10_152<='Z')||LA10_152=='_'||(LA10_152>='a' && LA10_152<='z')) ) {
                        alt10=78;
                    }
                    else {
                        alt10=46;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='H') ) {
            int LA10_24 = input.LA(2);

            if ( (LA10_24=='A') ) {
                int LA10_94 = input.LA(3);

                if ( (LA10_94=='V') ) {
                    int LA10_153 = input.LA(4);

                    if ( (LA10_153=='I') ) {
                        int LA10_199 = input.LA(5);

                        if ( (LA10_199=='N') ) {
                            int LA10_243 = input.LA(6);

                            if ( (LA10_243=='G') ) {
                                int LA10_278 = input.LA(7);

                                if ( (LA10_278=='#'||(LA10_278>='-' && LA10_278<='9')||LA10_278=='?'||(LA10_278>='A' && LA10_278<='Z')||LA10_278=='_'||(LA10_278>='a' && LA10_278<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=36;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='.') ) {
            alt10=38;
        }
        else if ( (LA10_0==';') ) {
            alt10=39;
        }
        else if ( (LA10_0=='U') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA10_97 = input.LA(3);

                if ( (LA10_97=='I') ) {
                    int LA10_154 = input.LA(4);

                    if ( (LA10_154=='O') ) {
                        int LA10_200 = input.LA(5);

                        if ( (LA10_200=='N') ) {
                            int LA10_244 = input.LA(6);

                            if ( (LA10_244=='#'||(LA10_244>='-' && LA10_244<='9')||LA10_244=='?'||(LA10_244>='A' && LA10_244<='Z')||LA10_244=='_'||(LA10_244>='a' && LA10_244<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=40;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
                }
                break;
            case 'R':
                {
                int LA10_98 = input.LA(3);

                if ( (LA10_98=='I') ) {
                    int LA10_155 = input.LA(4);

                    if ( (LA10_155=='#'||(LA10_155>='-' && LA10_155<='9')||LA10_155=='?'||(LA10_155>='A' && LA10_155<='Z')||LA10_155=='_'||(LA10_155>='a' && LA10_155<='z')) ) {
                        alt10=78;
                    }
                    else {
                        alt10=57;}
                }
                else {
                    alt10=78;}
                }
                break;
            default:
                alt10=78;}

        }
        else if ( (LA10_0=='O') ) {
            int LA10_28 = input.LA(2);

            if ( (LA10_28=='P') ) {
                int LA10_99 = input.LA(3);

                if ( (LA10_99=='T') ) {
                    int LA10_156 = input.LA(4);

                    if ( (LA10_156=='I') ) {
                        int LA10_202 = input.LA(5);

                        if ( (LA10_202=='O') ) {
                            int LA10_245 = input.LA(6);

                            if ( (LA10_245=='N') ) {
                                int LA10_280 = input.LA(7);

                                if ( (LA10_280=='A') ) {
                                    int LA10_305 = input.LA(8);

                                    if ( (LA10_305=='L') ) {
                                        int LA10_319 = input.LA(9);

                                        if ( (LA10_319=='#'||(LA10_319>='-' && LA10_319<='9')||LA10_319=='?'||(LA10_319>='A' && LA10_319<='Z')||LA10_319=='_'||(LA10_319>='a' && LA10_319<='z')) ) {
                                            alt10=78;
                                        }
                                        else {
                                            alt10=41;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='(') ) {
            alt10=43;
        }
        else if ( (LA10_0==')') ) {
            alt10=44;
        }
        else if ( (LA10_0=='E') ) {
            int LA10_31 = input.LA(2);

            if ( (LA10_31=='X') ) {
                int LA10_102 = input.LA(3);

                if ( (LA10_102=='I') ) {
                    int LA10_157 = input.LA(4);

                    if ( (LA10_157=='S') ) {
                        int LA10_203 = input.LA(5);

                        if ( (LA10_203=='T') ) {
                            int LA10_246 = input.LA(6);

                            if ( (LA10_246=='S') ) {
                                int LA10_281 = input.LA(7);

                                if ( (LA10_281=='#'||(LA10_281>='-' && LA10_281<='9')||LA10_281=='?'||(LA10_281>='A' && LA10_281<='Z')||LA10_281=='_'||(LA10_281>='a' && LA10_281<='z')) ) {
                                    alt10=78;
                                }
                                else {
                                    alt10=45;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='M') ) {
            int LA10_32 = input.LA(2);

            if ( (LA10_32=='I') ) {
                int LA10_103 = input.LA(3);

                if ( (LA10_103=='N') ) {
                    int LA10_158 = input.LA(4);

                    if ( (LA10_158=='U') ) {
                        int LA10_204 = input.LA(5);

                        if ( (LA10_204=='S') ) {
                            int LA10_247 = input.LA(6);

                            if ( (LA10_247=='#'||(LA10_247>='-' && LA10_247<='9')||LA10_247=='?'||(LA10_247>='A' && LA10_247<='Z')||LA10_247=='_'||(LA10_247>='a' && LA10_247<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=47;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='|') ) {
            int LA10_33 = input.LA(2);

            if ( (LA10_33=='|') ) {
                alt10=48;
            }
            else {
                alt10=83;}
        }
        else if ( (LA10_0=='&') ) {
            int LA10_34 = input.LA(2);

            if ( (LA10_34=='&') ) {
                alt10=49;
            }
            else {
                alt10=83;}
        }
        else if ( (LA10_0==',') ) {
            alt10=50;
        }
        else if ( (LA10_0=='s') ) {
            int LA10_36 = input.LA(2);

            if ( (LA10_36=='a') ) {
                int LA10_107 = input.LA(3);

                if ( (LA10_107=='m') ) {
                    int LA10_159 = input.LA(4);

                    if ( (LA10_159=='e') ) {
                        int LA10_205 = input.LA(5);

                        if ( (LA10_205=='T') ) {
                            int LA10_248 = input.LA(6);

                            if ( (LA10_248=='e') ) {
                                int LA10_283 = input.LA(7);

                                if ( (LA10_283=='r') ) {
                                    int LA10_307 = input.LA(8);

                                    if ( (LA10_307=='m') ) {
                                        int LA10_320 = input.LA(9);

                                        if ( (LA10_320=='#'||(LA10_320>='-' && LA10_320<='9')||LA10_320=='?'||(LA10_320>='A' && LA10_320<='Z')||LA10_320=='_'||(LA10_320>='a' && LA10_320<='z')) ) {
                                            alt10=78;
                                        }
                                        else {
                                            alt10=62;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='i') ) {
            int LA10_37 = input.LA(2);

            if ( (LA10_37=='s') ) {
                switch ( input.LA(3) ) {
                case 'B':
                    {
                    int LA10_160 = input.LA(4);

                    if ( (LA10_160=='L') ) {
                        int LA10_206 = input.LA(5);

                        if ( (LA10_206=='A') ) {
                            int LA10_249 = input.LA(6);

                            if ( (LA10_249=='N') ) {
                                int LA10_284 = input.LA(7);

                                if ( (LA10_284=='K') ) {
                                    int LA10_308 = input.LA(8);

                                    if ( (LA10_308=='#'||(LA10_308>='-' && LA10_308<='9')||LA10_308=='?'||(LA10_308>='A' && LA10_308<='Z')||LA10_308=='_'||(LA10_308>='a' && LA10_308<='z')) ) {
                                        alt10=78;
                                    }
                                    else {
                                        alt10=65;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'I':
                    {
                    int LA10_161 = input.LA(4);

                    if ( (LA10_161=='R') ) {
                        int LA10_207 = input.LA(5);

                        if ( (LA10_207=='I') ) {
                            int LA10_250 = input.LA(6);

                            if ( (LA10_250=='#'||(LA10_250>='-' && LA10_250<='9')||LA10_250=='?'||(LA10_250>='A' && LA10_250<='Z')||LA10_250=='_'||(LA10_250>='a' && LA10_250<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=63;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'L':
                    {
                    int LA10_162 = input.LA(4);

                    if ( (LA10_162=='I') ) {
                        int LA10_208 = input.LA(5);

                        if ( (LA10_208=='T') ) {
                            int LA10_251 = input.LA(6);

                            if ( (LA10_251=='E') ) {
                                int LA10_286 = input.LA(7);

                                if ( (LA10_286=='R') ) {
                                    int LA10_309 = input.LA(8);

                                    if ( (LA10_309=='A') ) {
                                        int LA10_322 = input.LA(9);

                                        if ( (LA10_322=='L') ) {
                                            int LA10_331 = input.LA(10);

                                            if ( (LA10_331=='#'||(LA10_331>='-' && LA10_331<='9')||LA10_331=='?'||(LA10_331>='A' && LA10_331<='Z')||LA10_331=='_'||(LA10_331>='a' && LA10_331<='z')) ) {
                                                alt10=78;
                                            }
                                            else {
                                                alt10=66;}
                                        }
                                        else {
                                            alt10=78;}
                                    }
                                    else {
                                        alt10=78;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                case 'U':
                    {
                    int LA10_163 = input.LA(4);

                    if ( (LA10_163=='R') ) {
                        int LA10_209 = input.LA(5);

                        if ( (LA10_209=='I') ) {
                            int LA10_252 = input.LA(6);

                            if ( (LA10_252=='#'||(LA10_252>='-' && LA10_252<='9')||LA10_252=='?'||(LA10_252>='A' && LA10_252<='Z')||LA10_252=='_'||(LA10_252>='a' && LA10_252<='z')) ) {
                                alt10=78;
                            }
                            else {
                                alt10=64;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                    }
                    break;
                default:
                    alt10=78;}

            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='?') ) {
            int LA10_38 = input.LA(2);

            if ( (LA10_38==':') ) {
                alt10=69;
            }
            else {
                alt10=67;}
        }
        else if ( (LA10_0=='_') ) {
            int LA10_39 = input.LA(2);

            if ( (LA10_39==':') ) {
                alt10=68;
            }
            else {
                alt10=83;}
        }
        else if ( (LA10_0=='^') ) {
            int LA10_40 = input.LA(2);

            if ( (LA10_40=='^') ) {
                alt10=70;
            }
            else {
                alt10=83;}
        }
        else if ( (LA10_0=='@') ) {
            alt10=71;
        }
        else if ( (LA10_0=='R') ) {
            int LA10_42 = input.LA(2);

            if ( (LA10_42=='E') ) {
                int LA10_114 = input.LA(3);

                if ( (LA10_114=='D') ) {
                    int LA10_164 = input.LA(4);

                    if ( (LA10_164=='U') ) {
                        int LA10_210 = input.LA(5);

                        if ( (LA10_210=='C') ) {
                            int LA10_253 = input.LA(6);

                            if ( (LA10_253=='E') ) {
                                int LA10_288 = input.LA(7);

                                if ( (LA10_288=='D') ) {
                                    int LA10_310 = input.LA(8);

                                    if ( (LA10_310=='#'||(LA10_310>='-' && LA10_310<='9')||LA10_310=='?'||(LA10_310>='A' && LA10_310<='Z')||LA10_310=='_'||(LA10_310>='a' && LA10_310<='z')) ) {
                                        alt10=78;
                                    }
                                    else {
                                        alt10=73;}
                                }
                                else {
                                    alt10=78;}
                            }
                            else {
                                alt10=78;}
                        }
                        else {
                            alt10=78;}
                    }
                    else {
                        alt10=78;}
                }
                else {
                    alt10=78;}
            }
            else {
                alt10=78;}
        }
        else if ( (LA10_0=='\"') ) {
            int LA10_43 = input.LA(2);

            if ( ((LA10_43>='\u0000' && LA10_43<='\uFFFE')) ) {
                alt10=77;
            }
            else {
                alt10=83;}
        }
        else if ( ((LA10_0>='J' && LA10_0<='K')||LA10_0=='Q'||LA10_0=='T'||LA10_0=='V'||(LA10_0>='X' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='h')||(LA10_0>='j' && LA10_0<='r')||(LA10_0>='t' && LA10_0<='z')) ) {
            alt10=78;
        }
        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
            alt10=79;
        }
        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            alt10=82;
        }
        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='#' && LA10_0<='%')||LA10_0=='\''||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='~' && LA10_0<='\uFFFE')) ) {
            alt10=83;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:178: T54
                {
                mT54(); 

                }
                break;
            case 44 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:182: T55
                {
                mT55(); 

                }
                break;
            case 45 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:186: T56
                {
                mT56(); 

                }
                break;
            case 46 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:190: T57
                {
                mT57(); 

                }
                break;
            case 47 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:194: T58
                {
                mT58(); 

                }
                break;
            case 48 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:198: T59
                {
                mT59(); 

                }
                break;
            case 49 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:202: T60
                {
                mT60(); 

                }
                break;
            case 50 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:206: T61
                {
                mT61(); 

                }
                break;
            case 51 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:210: T62
                {
                mT62(); 

                }
                break;
            case 52 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:214: T63
                {
                mT63(); 

                }
                break;
            case 53 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:218: T64
                {
                mT64(); 

                }
                break;
            case 54 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:222: T65
                {
                mT65(); 

                }
                break;
            case 55 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:226: T66
                {
                mT66(); 

                }
                break;
            case 56 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:230: T67
                {
                mT67(); 

                }
                break;
            case 57 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:234: T68
                {
                mT68(); 

                }
                break;
            case 58 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:238: T69
                {
                mT69(); 

                }
                break;
            case 59 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:242: T70
                {
                mT70(); 

                }
                break;
            case 60 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:246: T71
                {
                mT71(); 

                }
                break;
            case 61 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:250: T72
                {
                mT72(); 

                }
                break;
            case 62 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:254: T73
                {
                mT73(); 

                }
                break;
            case 63 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:258: T74
                {
                mT74(); 

                }
                break;
            case 64 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:262: T75
                {
                mT75(); 

                }
                break;
            case 65 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:266: T76
                {
                mT76(); 

                }
                break;
            case 66 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:270: T77
                {
                mT77(); 

                }
                break;
            case 67 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:274: T78
                {
                mT78(); 

                }
                break;
            case 68 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:278: T79
                {
                mT79(); 

                }
                break;
            case 69 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:282: T80
                {
                mT80(); 

                }
                break;
            case 70 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:286: T81
                {
                mT81(); 

                }
                break;
            case 71 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:290: T82
                {
                mT82(); 

                }
                break;
            case 72 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:294: T83
                {
                mT83(); 

                }
                break;
            case 73 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:298: T84
                {
                mT84(); 

                }
                break;
            case 74 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:302: T85
                {
                mT85(); 

                }
                break;
            case 75 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:306: T86
                {
                mT86(); 

                }
                break;
            case 76 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:310: RULE_IRI_TERMINAL
                {
                mRULE_IRI_TERMINAL(); 

                }
                break;
            case 77 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:328: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 78 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:340: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 79 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:348: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 80 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:357: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:373: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:389: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // ../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g:1:397: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}