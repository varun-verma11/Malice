grammar MAlice_grammar;

options {
  language = Java;
}


fragment
Digit : '0'..'9';
NUMBER : Digit Digit*;
//NUMBER : ('0'..'9')+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' )+ {$channel = HIDDEN;};
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING :'"' (~('"'|'\n'|'\r'))* '"';
//STRING : '\"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ' | '\n' )+ '\"'; //**** need to check for string for other characters. 
mono_op : '~' | '!';
bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';

logical_ops : '&&' | '||' ;
relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

lpar : '(';
rpar : ')';

data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider

atom : NUMBER | IDENT ;

expr : ex;
bracketexpr : lpar ex rpar ;
ex : mono_op ex | (atom | bracketexpr) (bin_op ex)* | '-' ex ;    


bool_expr : expr relational_ops expr ((logical_ops bool_expr)*)? ;

control_structure
		: (		'perhaps' lpar bool_expr rpar 'so'
					statementList 
          ('or' ('maybe' lpar bool_expr rpar 'so')? statementList)*
					'because Alice was unsure which'
			  | 'either' lpar bool_expr rpar 'so'
			  	statementList //check here
			  	('or' statementList)*
			  	'because Alice was unsure which'			  	
			  |	'eventually' lpar bool_expr rpar 'because'
			  	statementList
			  	'enough times'			
			) ('.')? ;

declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' (LETTER | STRING | expr))? 
                                | 'had' atom data_types//its atom here because we can use variable too -> see test12
                               );
 
argument: IDENT | NUMBER | LETTER | STRING;
arguments_to_functions : (argument ((',' argument)*)?)? | function_call;
rest_statements :  
      IDENT
        ( ('\'s' atom 'piece')?
            (    'became'  (expr | LETTER | STRING)
               | 'ate' 
               | 'drank'
               | 'said Alice' 
               | 'spoke'
            )
          //| 'had' NUMBER data_types
          //| 'was a' data_types ( 'too' | 'of' expr)?
        )
    | (NUMBER | LETTER | STRING ) ( 'said Alice' | 'spoke' ) 
    | 'Alice' 'found' expr
    | function_call ( 'said' 'Alice' | 'spoke' )?
    | 'what was' IDENT '?' ;


function_call :  function_name lpar arguments_to_functions rpar ;
statement : rest_statements	| declaration_statements | control_structure | nested_function | statement_conjunctions | function;
		
statement_conjunctions : ',' | 'and' | 'then' | 'but' | '.';//check for all cunjunctions

//**************************************************

statementList : (statement)*; //(statement_conjunctions statement)* ('.')? ;


//**************************************************

//statementList : (control_structure | nested_function | statement (statement_conjunctions statement)* '.')*;

parameter : ('spider')? data_types IDENT ;

//is there any reason why we have ((',' parameter)*)? instead of just (',' parameter)* ???
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
