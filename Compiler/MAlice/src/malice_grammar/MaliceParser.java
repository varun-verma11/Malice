package malice_grammar;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class MaliceParser {
	public static void main(String[] args) throws RecognitionException {
		CharStream input = new ANTLRStringStream("malice found x");
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		parser.program() ;
		System.out.println("done");
	}
}
