from pyparsing import *

st = Word(alphas)
number = Word(nums)
greet = Word("hello") + "," + number | Word("hello") + "," + st

hello = "hello, 90"
s2 = "hello, sre"
print hello, "-->", greet.parseString(hello)
print s2, "-->" , greet.parseString(s2)
