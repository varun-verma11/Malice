grammar malice_grammar;


options {
  language = Java;
  output = AST ;
  ASTLabelType = CommonTree;
  backtrack = true ;
}

@header {
  package malice_grammar ;
}

@lexer::header {
  package malice_grammar ;
}

NUMBER : ('0'..'9')+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' |'\r' )+ {$channel = HIDDEN;};

LINE_COMMENT
    : '###' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING :'"' (~('"'|'\n'|'\r'))* '"';

lpar: '(' ;
rpar: ')' ;
array_elem : IDENT '\'s'! expr 'piece';
atom: IDENT ('\'s'! expr 'piece')? | NUMBER | function_call;

data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider

term : atom | lpar expr rpar ;
bool_neg : ('!'^)* term;
unary_op : ('~'^ | '-'^ | '+'^)* bool_neg ;
mult :unary_op (('*'^ | '/'^ | '%'^) unary_op)* ;
add : mult (('+'^ | '-'^) mult)* ;
bool_comp : add (('<='^ | '<'^ | '>'^ | '>='^) add)* ;
bool_eq : bool_comp (('=='^ | '!='^) bool_comp)* ;
bitw_and : bool_eq ('&'^ bool_eq)* ;
bitw_xor : bitw_and ('^'^ bitw_and)* ;
bitw_or : bitw_xor ('|'^ bitw_xor)* ;
bool_and : bitw_or ('&&'^ bitw_or)* ;
bool_or : bool_and ('||'^ bool_and)* ;

expr : bool_or ;

bool_expr : expr ;

control_structure
      : ( 'perhaps'^ lpar bool_expr rpar 'so'!
            statementList 
          ('or'! 'maybe'^ lpar bool_expr rpar 'so'! statementList)*
          ('or'^ statementList)?
          'because'! 'Alice'! 'was'! 'unsure'! 'which'!
        | 'either'^ lpar bool_expr rpar 'so'
          statementList //check here
          'or' statementList
          'because'! 'Alice'! 'was'! 'unsure'! 'which'!
        | 'eventually'^ lpar bool_expr rpar 'because'!
          statementList
          'enough'! 'times'!
      ) '.'!?;

declaration_statements : IDENT ( 'was'^ 'a'! data_types ( 'too' | 'of'! (LETTER | STRING | expr))? 
                                | 'had'^ atom data_types//its atom here because we can use variable too -> see test12
                               )
                        ;
 
argument: expr | LETTER | STRING | array_elem;
arguments_to_functions : (argument (','! argument)*)? | function_call;
rest_statements :   (expr ('spoke'^ | 'said'^ 'Alice')) =>  (expr ('spoke'^ | 'said'^ 'Alice'))      
    |   (LETTER | STRING) ('spoke'^ | 'said'^ 'Alice')
    |  IDENT
        ( ('\'s'! expr 'piece')?
            (    'became'^  (expr | LETTER | STRING )
               | 'ate'^ 
               | 'drank'^
            )
        )
    | 'Alice'! 'found'^ (expr | LETTER | STRING )
    ;

read_statement : 'what'^ 'was'! (IDENT | array_elem) '?'! ('.'!)? ; 
print:
    'spoke'^ | 'said'^ 'Alice'!
    ;

function_call : function_name^ lpar arguments_to_functions rpar ;
statement : rest_statements | function_call | declaration_statements ;
    
statement_conjunctions : 'and'! | 'then'! | 'but'! | ','! |'.'!;//check for all cunjunctions

statementList : ((statement? statement_conjunctions) | control_structure | read_statement statement_conjunctions? | nested_function  | 
                  function)*;

parameter : ('spider')? data_types^ IDENT ;

parameters : (parameter ( ',' parameter)*)? ;
function_name : IDENT;
nested_function : 'opened'^ statementList 'closed'! ;
function: 'The'! ( 'looking'^ '-'! 'glass'! function_name lpar parameters rpar 
                  | 'room'^ function_name lpar parameters rpar 'contained' 'a'! data_types 
                )
          'opened'!
          statementList
          'closed'!
          ;
          
global_declaration : (declaration_statements (statement_conjunctions declaration_statements)* '.'!)* ;
program : global_declaration function+ EOF! ;