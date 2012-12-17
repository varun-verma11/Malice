grammar malice_grammar;


options 
{
  language = Java;
  output = AST ;
  ASTLabelType = CommonTree;
  backtrack = true ;
}

tokens
{
  ATE = 'ate';
  DRANK = 'drank';
  BECAME = 'became';
  WHAT = 'what';
  PIECE = 'piece';
  CHAR = 'letter';
  INT = 'number';
  STR = 'sentence';
  PERHAPS = 'perhaps';
  OR = 'or';
  MAYBE = 'maybe';
  WAS = 'was'; 
  HAD = 'had';
  SPOKE = 'spoke';
  FOUND = 'found';
  BECAUSE = 'because';
  ALICE = 'Alice';
  UNSURE = 'unsure';
  WHICH = 'which';
  EVENTUALLY = 'eventually';
  ENOUGH = 'enough';
  TIMES = 'times';
  SO = 'so';
  EITHER = 'either';
  A = 'a';
  TOO = 'too';
  OF = 'of';
  SAID = 'said';
  OPENED = 'opened';
  CLOSED = 'closed';
  THE = 'The';
  LOOKING = 'looking';
  GLASS = 'glass';
  ROOM = 'room';
  CONTAINED = 'contained'; 
  SPIDER = 'spider';
  AND = 'and';
  BUT = 'but';
  THEN = 'then';
  WANTS = 'wants';
  FROM = 'from';
  EVERYTHING = 'everything';
}

@header 
{
  package malice_grammar ;
}

@lexer::header 
{
  package malice_grammar ;
}

endif : BECAUSE ALICE WAS UNSURE WHICH ;
NUMBER : ('0'..'9')+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
WS : (' ' | '\t' | '\n' |'\r' )+ {$channel = HIDDEN;};

LINE_COMMENT
    : '###' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING :'"' (~('"'|'\n'|'\r'))* '"';

lpar: '(' ;
rpar: ')' ;
array_elem : IDENT '\'s'! expr PIECE^;
atom: IDENT ('\'s'! expr PIECE^)? | NUMBER | function_call;

data_types : INT | CHAR | STR ; // need to check for the spider

term : atom | lpar! expr rpar! ;
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
      : ( PERHAPS^ lpar! bool_expr rpar! SO!
           statementList
          (OR! MAYBE lpar! bool_expr rpar! SO! statementList)*
          (OR statementList)?
          endif!
        | EITHER^ lpar! bool_expr rpar! SO!
          statementList //check here
          OR statementList
          endif!
        | EVENTUALLY^ lpar! bool_expr rpar! BECAUSE!
          statementList
          ENOUGH! TIMES!
      ) '.'!?;

declaration_statements : IDENT ( WAS^ A! data_types TOO!? 
                                | HAD^ expr data_types//its atom here because we can use variable too -> see test12
                               )
                         | declaration_init 
                        ;
                        
declaration_init : IDENT WAS^ A! data_types OF! (LETTER | STRING | expr);
 
argument: expr | LETTER | STRING | array_elem;
arguments_to_functions : (argument (','! argument)*)? | function_call;
rest_statements :   (expr print^) =>  (expr print^)      
    |  (LETTER | STRING) ( SPOKE^ | SAID^ ALICE!)
    |  IDENT
        ( ('\'s'! expr PIECE^)?
            (   BECAME^  (expr | LETTER | STRING )
               | ATE^ 
               | DRANK^
            )
        )
    | ALICE! FOUND^ (expr | LETTER | STRING )
    ;

read_statement : WHAT^ WAS! (IDENT | array_elem) '?'! ('.'!)? ; 
print:
    SPOKE^ | SAID^ ALICE!
    ;

function_call : function_name^ lpar arguments_to_functions rpar ;
statement : rest_statements | function_call | declaration_init ;
    
statement_conjunctions : AND! | THEN! | BUT! | ','! |'.'!;//check for all cunjunctions

declarations : (declaration_statements statement_conjunctions)* ;
statementList : declarations function* declarations 
              ( (statement? statement_conjunctions) 
	              | control_structure 
	              | read_statement statement_conjunctions? 
	              | nested_function 
              )*;

parameter : (SPIDER)? data_types^ IDENT ;

parameters : (parameter ( ','! parameter)*)? ;
function_name : IDENT;
nested_function : OPENED^ statementList CLOSED! ;
function: THE! ( LOOKING^ '-'! GLASS! function_name lpar! parameters rpar! 
                  | ROOM^ function_name lpar! parameters rpar! CONTAINED A! data_types 
                )
          OPENED!
          statementList
          CLOSED!
          ;
import_statement : ALICE! WANTS^ ((function_name (','! function_name)*)? | EVERYTHING) FROM! STRING;  
global_declaration : (declaration_statements (statement_conjunctions declaration_statements)* '.'!)* ;
program : import_statement* global_declaration function+ EOF! ;
