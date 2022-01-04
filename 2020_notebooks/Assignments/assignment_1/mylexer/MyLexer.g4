lexer grammar MyLexer;

@header {
  package mylexer;
}

COMMENT: '/*' (.*?) '*/';

KEYWORD: 'var' | 'as' | 'function' | 'return' | 'if' | 'else';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
ID: [a-zA-Z] ([a-zA-Z0-9_]*);
NUM: '-'? [0-9]+;
COMMA: ',';
EQ: '=';
STRING: '"' ( '\\"' | ~'"' )* '"';
CHAR: '\'' (('\\' .) | ~'\\') '\'';
SEMICOLON: ';';
PLUS: '+';
WS: [ \t\r\n]+ -> skip;
