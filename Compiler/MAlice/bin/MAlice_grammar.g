grammar MAlice_grammar;

options {
  language = Java;
}


fragment
Digit : '0'..'9';
NUMBER : Digit Digit*;
//NUMBER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' )+ {$channel = HIDDEN;};
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING : '"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ')+ '"'; //**** need to check for string for other characters. 
mono_op : '~';
bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';

logical_ops : '&&' | '||' ;
relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

lpar : '(';
rpar : ')';

data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider

atom : NUMBER | IDENT ;

expr : ex;
bracketexpr : lpar ex rpar ;
ex : mono_op ex | (atom | bracketexpr) (bin_op ex)* ;    


bool_expr : expr relational_ops expr ((logical_ops bool_expr)*)? ;

control_structure
		: (		'perhaps' lpar bool_expr rpar 'so'
					statementList 
						('maybe' lpar bool_expr rpar statementList)*
					'or' statementList
					'because Alice was unsure which'
			  | 'either' lpar bool_expr rpar 'so'
			  	statementList //check here
			  	'or' statmentList
			  	'because Alice was unsure which'			  	
			  |	'eventually' lpar bool_expr rpar 'because'
			  	statementList
			  	'enough times'			
			) ('.')? ;

declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' expr)? 
                                | 'had' NUMBER data_types
                               );
 
rest_statements :  
      IDENT
        ( ('\'s' NUMBER 'piece')?
            (    'became'  (e | LETTER | STRING)
               | 'ate' 
               | 'drank' 
               | 'spoke'
            )
          //| 'had' NUMBER data_types
          //| 'was a' data_types ( 'too' | 'of' expr)?
        )
    | expr 'said' 'Alice'
    | 'Alice' 'found' expr
    | 'what was' IDENT '?' ;
 
statement : rest_statements	| declaration_statements ;
		
statement_conjunctions : ',' | 'and' | 'then' | 'but' ;//check for all cunjunctions

statementList : (statement (statement_conjunctions statement)* '.'| control_structure )*;

parameter : ('spider')? data_types IDENT ;
parameters : (parameter (( ',' parameter)*)?)? ;

function: 'The' (   'looking-glass' IDENT lpar parameters rpar
				          | 'room' IDENT lpar parameters rpar 'contained a' data_types
				        )
					'opened'
					statementList
					'closed';
				
program : declation_statments* functions+ EOF;
