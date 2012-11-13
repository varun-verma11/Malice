from pyparsing import *

hello = "hello world"

greet = Word("hello world")

print hello, "-->", greet.parseString(hello)


