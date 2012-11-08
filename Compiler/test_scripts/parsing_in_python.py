from pyparsing import Word, alphas

greet = Word(alphas) + "," + Word(alphas) + "!"

hello = "hello, : world!"
print hello, "-->", greet.parseString(hello)
