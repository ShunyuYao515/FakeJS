lexer grammar FakeJSCommonLexer;

//Token Definition

//Math Operators
MUL	:'*';
DIV	:'/';
ADD	:'+';
SUB	:'-';
//Comparison Operators
EQL_EQL	:'==';
NOT_EQL	:'!=';
AND_AND	:'&&';
OR_OR	:'||';
//Assignment Operator
EQL	:'=';

//Symbols
SEMICOLON	:';';
COMMA	:',';
L_BRACKET	:'(';
R_BRACKET	:')';
L_CURV_BRACKET	:'{';
R_CURV_BRACKET	:'}';
DOT	:'.';
VAR	:'var';
FUNCTION	:'function';
RETURN	:'return';
NEW	:'new';
IF	:'if';
ELSE	:'else';
WHILE	:'while';
FOR	:'for';
THIS	:'this';

WS : [ \t\r\n]+ -> skip ;

//Atom
TRUE	:'true';
FALSE	:'false';
INTEGER	:[1-9][0-9]*|'0';
STRING	:'"' [a-zA-Z0-9]* '"';
ID	:[a-zA-Z][a-zA-Z0-9]*;