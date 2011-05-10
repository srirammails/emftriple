lexer grammar InternalSparql;
@header {
package com.emftriple.query.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '<' ;
T13 : '>' ;
T14 : '<=' ;
T15 : '>=' ;
T16 : '=' ;
T17 : '!=' ;
T18 : '+' ;
T19 : '/' ;
T20 : '-' ;
T21 : '*' ;
T22 : 'PREFIX' ;
T23 : ':' ;
T24 : 'BASE' ;
T25 : 'SELECT' ;
T26 : 'ASK' ;
T27 : 'DESCRIBE' ;
T28 : 'CONSTRUCT' ;
T29 : 'CREATE' ;
T30 : 'GRAPH' ;
T31 : 'DROP' ;
T32 : 'LOAD' ;
T33 : 'INTO' ;
T34 : 'CLEAR' ;
T35 : 'INSERT' ;
T36 : 'WITH' ;
T37 : 'DATA' ;
T38 : 'DELETE' ;
T39 : 'FROM' ;
T40 : 'WHERE' ;
T41 : '{' ;
T42 : '}' ;
T43 : 'NAMED' ;
T44 : 'SERVICE' ;
T45 : 'GROUP' ;
T46 : 'BY' ;
T47 : 'HAVING' ;
T48 : 'LIMIT' ;
T49 : '.' ;
T50 : ';' ;
T51 : 'UNION' ;
T52 : 'OPTIONAL' ;
T53 : 'FILTER' ;
T54 : '(' ;
T55 : ')' ;
T56 : 'EXISTS' ;
T57 : 'NOT' ;
T58 : 'MINUS' ;
T59 : '||' ;
T60 : '&&' ;
T61 : ',' ;
T62 : 'STR' ;
T63 : 'LANG' ;
T64 : 'LANGMATCHES' ;
T65 : 'DATATYPE' ;
T66 : 'BOUND' ;
T67 : 'IRI' ;
T68 : 'URI' ;
T69 : 'BNODE' ;
T70 : 'IF' ;
T71 : 'STRLANG' ;
T72 : 'STRDT' ;
T73 : 'sameTerm' ;
T74 : 'isIRI' ;
T75 : 'isURI' ;
T76 : 'isBLANK' ;
T77 : 'isLITERAL' ;
T78 : '?' ;
T79 : '_:' ;
T80 : '?:' ;
T81 : '^^' ;
T82 : '@' ;
T83 : 'DISTINCT' ;
T84 : 'REDUCED' ;
T85 : 'SILENT' ;
T86 : 'DEFAULT' ;

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15484
RULE_IRI_TERMINAL : '<' ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|':'|'.'|'#'|'?'|'@'|'$'|'&'|'=')* '>';

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15486
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15488
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|'.'|'#'|'?')*;

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15490
RULE_INT : ('0'..'9')+;

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15492
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15494
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15496
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../com.emftriple.query.sparql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalSparql.g" 15498
RULE_ANY_OTHER : .;


