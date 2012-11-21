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

<<<<<<< HEAD
NUMBER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' )+ {$channel = HIDDEN;};
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING :'"' (~('"'|'\n'|'\r'))* '"';

atom :  (NUMBER | IDENT) ;

lpar : '(';
rpar : ')';

term : atom | '(' expr ')' ;
unary : ('~' | '-')* term ;
mult : unary (('*' | '/' | '%') unary)* ;
add : mult (('+' | '-') mult)* ;
bitw_and : add ('&' add)* ;
bitw_xor : bitw_and ('^' bitw_and)* ;
bitw_or : bitw_xor ('|' bitw_xor)* ;

expr : bitw_or;

bool_term : atom | lpar expr rpar ;
bool_not : '!'* bool_term ;
bool_comp : bool_not (('<' | '<=' | '>' | '>=') bool_not)* ;
bool_eq : bool_comp (('==' | '!=') bool_comp)* ;
bool_and : bool_eq ('&&' bool_eq)* ;
bool_or : bool_and ('||' bool_and)* ;

bool_expr : bool_or;

//STRING : '\"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ' | '\n' )+ '\"'; //**** need to check for string for other characters. 
//mono_op : '~';
//bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';
//
//logical_ops : '&&' | '||' | '!';
//relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
//
//lpar : '(';
//rpar : ')';
//
data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider
//
//atom : NUMBER | IDENT ;
//
//expr : ex;
//bracketexpr : lpar expr rpar ;
//ex : mono_op ex | (atom | array_elem | bracketexpr) (bin_op ex)* | '-' ex | function_call;    
//
//not_expr : '!' lpar bool_expr rpar;
//
//bool_expr : expr relational_ops expr (logical_ops (expr | not_expr) | relational_ops expr)*; 
//
////bool_expr : expr relational_ops expr ((logical_ops bool_expr)*)? ;
//

array_elem : IDENT '\'s' atom 'piece';

declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' (LETTER | STRING | expr))? 
                                | 'had' atom data_types//its atom here because we can use variable too -> see test12
                               );
 
argument: IDENT | NUMBER | LETTER | STRING | array_elem;
arguments_to_functions : (argument ((',' argument)*)?)? | function_call;
rest_statements :  
      IDENT
        ( ('\'s' atom 'piece')?
            (    'became'  (expr | LETTER | STRING | function_call )
               | 'ate' 
               | 'drank'
               | 'said Alice' 
               | 'spoke'
            )
          //| 'had' NUMBER data_types
          //| 'was a' data_types ( 'too' | 'of' expr)?
        )
    | expr 'spoke'    
    | (NUMBER | LETTER | STRING ) ( 'said Alice' | 'spoke' ) 
    | 'Alice' 'found' expr
    | function_call ( 'said' 'Alice' | 'spoke' )?
    | 'what was' IDENT '?' ;



function_call :  function_name lpar arguments_to_functions rpar ;
statement : rest_statements	| declaration_statements | control_structure | nested_function | statement_conjunctions | function;
//		
statement_conjunctions : ',' | 'and' | 'then' | 'but' | '.';//check for all cunjunctions
//
////**************************************************
//
statementList : (statement)*; //(statement_conjunctions statement)* ('.')? ;
//
//
////**************************************************
//
//statementList : (control_structure | nested_function | statement (statement_conjunctions statement)* '.')*;
//
parameter : ('spider')? data_types IDENT ;
//
////is there any reason why we have ((',' parameter)*)? instead of just (',' parameter)* ???
parameters : (parameter (( ',' parameter)*)?)? ;
function_name : IDENT;
nested_function : 'opened' statementList 'closed' ;
function: 'The' (   'looking-glass' function_name lpar parameters rpar
				          | 'room' function_name lpar parameters rpar 'contained a' data_types
				        )
					'opened'
					statementList
					'closed';
					
global_declaration : (declaration_statements (statement_conjunctions declaration_statements)* '.')  ;
program : global_declaration? function+ EOF;
=======
rule: IDENT+ ;
program: rule ;
IDENT: 'a'..'z'+;
WS: (' ' | '\t' | '\n' )+ {$channel = HIDDEN;} ;
>>>>>>> 1e6f3e71d600768ed2211ed3b101b3966206f747
