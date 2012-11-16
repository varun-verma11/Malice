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
bracketexpr : lpar ex rpar  ;

ex : mono_op ex | (atom | bracketexpr) (bin_op ex)* ;    


bool_expr : expr RELATIONAL_OPS expr ((LOGICAL_OPS bool_expr)*)? ;

control_structure
		: (		'perhaps' LPAR bool_expr RPAR 'so'
					statementList 
						('maybe' LPAR bool_expr RPAR statementList)+
					'or' statementList
					'because Alice was unsure which'
			  | 'either' LPAR bool_expr RPAR 'so'
			  	statementList //check here
			  	'or' statmentList
			  	'because Alice was unsure which'
			  	
			  |	'eventually' LPAR bool_expr RPAR 'because'
			  	statementList
			  	'enough times'			
			) ('.')? ;

statement 
		: IDENT
		 		('was a' data_types ( 'too' | 'of' atom )? 
		 		   |	('\'s' NUMBER 'piece')?
		 				(	 'became'  (expr | LETTER | STRING)
		 					 | 'ate' 
		 					 | 'drank' 
		 					 | 'spoke'
		 				)
		 			| 'had' NUMBER data_types
		 		)
		| expr 'said' 'Alice'
		| 'Alice' 'found' expr
		| 'what was' IDENT '?' ;
		
statementList : statement | ;

parameter : ('spider')? data_types IDENT ;
parameters : parameter (( ',' parameter)*)? | ;

function
				: 'The' (   'looking' '-' 'glass' IDENT LPAR parameters RPAR
				          | 'room' IDENT LPAR parameters RPAR
				        )
					'opened'
					statementList
					'closed';
				
program : IDENT;
