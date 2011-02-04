lexer grammar InternalJpql;
@header {
package com.emftriple.query.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T17 : 'CONCAT' ;
T18 : 'SUBSTRING' ;
T19 : 'LOWER' ;
T20 : 'UPPER' ;
T21 : 'LENGTH' ;
T22 : 'LOCATE' ;
T23 : 'ABS' ;
T24 : 'SQRT' ;
T25 : 'MOD' ;
T26 : 'SIZE' ;
T27 : 'TRUE' ;
T28 : 'FALSE' ;
T29 : '<' ;
T30 : '>' ;
T31 : '<=' ;
T32 : '>=' ;
T33 : '=' ;
T34 : '!=' ;
T35 : 'IMPORT' ;
T36 : ':' ;
T37 : 'HAVING' ;
T38 : 'ORDER' ;
T39 : 'BY' ;
T40 : ',' ;
T41 : '.' ;
T42 : 'UPDATE' ;
T43 : 'SET' ;
T44 : 'DELETE' ;
T45 : 'SELECT' ;
T46 : 'AVG' ;
T47 : '(' ;
T48 : ')' ;
T49 : 'MAX' ;
T50 : 'MIN' ;
T51 : 'SUM' ;
T52 : 'COUNT' ;
T53 : 'NEW' ;
T54 : 'FROM' ;
T55 : 'AS' ;
T56 : 'IN' ;
T57 : 'JOIN' ;
T58 : 'LEFT' ;
T59 : 'INNER' ;
T60 : 'WHERE' ;
T61 : 'OR' ;
T62 : 'AND' ;
T63 : 'EXISTS' ;
T64 : 'ALL' ;
T65 : 'ANY' ;
T66 : 'SOME' ;
T67 : 'MEMBER' ;
T68 : 'OF' ;
T69 : 'IS' ;
T70 : 'NULL' ;
T71 : 'EMPTY' ;
T72 : 'LIKE' ;
T73 : 'BETWEEN' ;
T74 : 'ASC' ;
T75 : 'DESC' ;
T76 : 'DISTINCT' ;
T77 : 'FETCH' ;
T78 : 'OUTER' ;
T79 : 'NOT' ;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10817
RULE_LITERALTEMPORAL : (RULE_DATE_LITERAL|RULE_TIME_LITERAL|RULE_TIMESTAMP_LITERAL);

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10819
RULE_DATE_LITERAL : '(' 'd' (' '|'\t')+ '\'' RULE_DATE_STRING '\'' (' '|'\t')* ')';

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10821
RULE_TIME_LITERAL : '(' 't' (' '|'\t')+ '\'' RULE_TIME_STRING '\'' (' '|'\t')* ')';

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10823
RULE_TIMESTAMP_LITERAL : '(' 'ts' (' '|'\t')+ '\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\'' (' '|'\t')* ')';

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10825
RULE_DATE_STRING : '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9';

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10827
RULE_TIME_STRING : '0'..'9' ('0'..'9')? ':' '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9' '.' ('0'..'9')*;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10829
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10831
RULE_INT : ('0'..'9')+;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10833
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10835
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10837
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10839
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../com.emftriple.query.jpql.ui/src-gen/com/emftriple/query/ui/contentassist/antlr/internal/InternalJpql.g" 10841
RULE_ANY_OTHER : .;


