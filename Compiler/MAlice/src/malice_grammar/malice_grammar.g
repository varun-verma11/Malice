grammar malice_grammar;

options {
  language = Java;
}

@header {
  package malice_grammar ;
}

@lexer::header {
  package malice_grammar ;
}

rule: IDENT+ ;
program: rule ;
IDENT: 'a'..'z'+;
WS: (' ' | '\t' | '\n' )+ {$channel = HIDDEN;} ;