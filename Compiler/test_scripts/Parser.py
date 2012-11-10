"""
This is the script to parse the input string into tokens#


"""

from pyparsing import *

NUMBER = Word(nums)
LETTER = Word(alphas, max=1)
Identifier = Word(alphas)
Function_name = Identifier
String = Word(nums)
DATA = NUMBER | Identifier | String | Letter

BITWISE_NOT = Literal("~")
MONO_OP = BITWISE_NOT #using this to be able to add more mono operations later

PLUS_OP = Literal("+")
MINUS_OP = Literal("-") #need to check if there is minus in MAlice
MODULUS_OP = Literal("%")
DIVIDE_OP = Literal("/")
BITWISE_XOR = Literal("^")
BITWISE_AND = Literal("&")
BITWISE_OR = Literal("|")
MULTIPLY_OP = Literal("*")

BINARY_OP = PLUS_OP | MINUS_OP | MODULUS_OP | DIVIDE_OP | BITWISE_XOR	| BITWISE_AND | BITWISE_OR | MULTIPLY_OP

Lpar = Literal("(")
Rpar = Literal(")")

Expr = Forward()
Expr = DATA | (Lpar + Expr + Rpar)
Expr << Combine(MONO_OP + Expr) | Combine(DATA + BINARY_OP + Expr)

Data_type = Word("number") | Word("letter")


Statement  = ( Identifier + Word("was a") + Data_type + 
								Optional(Word("too"))
						 | Identifier + Word("became") + Expr
						 | Identifier + Word("became") + LETTER
						 | Identifier + Function_name
						 | Identifier + oneOf("ate drank")
						 | Expr + Word("said") + Word("Alice")
						 | Word("Alice") + Word("found") + Expr
						 | Identifier + Word("had") + NUMBER + Data_type
						 | Expression + Word("spoke")
						 | Identifier + Word("was a") + Word("number of") + DATA
						 )

LPAREN = Literal("(")
RPAREN = Literal(")")
COMMA = Literal(",")
AND = Literal("and")
BUT = Literal("but")
THEN = Literal("then")
FULLSTOP = Literal(".")
STATEMENT_CONJUNCTIONS = COMMA | BUT | THEN | FULLSTOP


