package malice_grammar;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class MaliceParser {
	public static void main(String[] args) throws RecognitionException {
		
		String control_eventually = 
				"eventually (c==0) because" +  '\n' +
				" opened" +
					" abs(y) spoke. \n" +
					" x was a number. \n" +
					" x was a letter too. \n" +
					" x had 10 number. \n" +
					" x became \"string\". \n" +
					" Alice found x. \n" +
					" what was x? ." +
				" closed" +
				" enough times.";
		String[] programs = 
			{
				"x was a number of 3. " + '\n' +
				" y had 12 number. \n" +
				"The looking-glass hatta() " + '\n' +
				"opened " + '\n' +
					"The room private() contained a letter " + '\n' +
					"opened " + '\n' +
						"Alice found 1. " + '\n' +
					"closed" + '\n' +
					"x became 'y'. " + '\n' +
				"closed " + '\n' +
				"The room abs(number b) contained a letter " + '\n' +
				"opened " + '\n' +
					"b spoke. " + '\n' +
				"closed " + '\n'
			,
				"x was a letter of 'c'. \n" +
				"The looking-glass hatta() " + '\n' +
				"opened " + '\n' +
					"The room private() contained a letter " + '\n' +
					"opened " + '\n' +
						"Alice found abs(x) and " + '\n' +
						"abs(y) spoke. " + '\n' + 
					"closed" + '\n' +
					"x became 'y'. " + '\n' +
				"closed " + '\n' +
				"The room abs(number b) contained a letter " + '\n' +
				"opened " + '\n' +
					"b spoke. " + '\n' +
				"closed " + '\n'
			,
				"x was a letter of 'c'. \n" +
				"The looking-glass hatta() " + '\n' +
				"opened " + '\n' +
					"perhaps (x<2) so \n" +
						"c spoke. \n" +
					"maybe (x<1) so \n" +
						"y spoke. \n" +
					"or \n" +
						"c spoke. \n"+
					"because Alice was unsure which. \n" +
					control_eventually +
				"closed " + '\n' +
				"The room abs(number b) contained a letter " + '\n' +
				"opened " + '\n' +
					"b spoke. " + '\n' +
				"closed " + '\n'
			};
		int i = 0 ;
		for (String p: programs) {
			i++;
			CharStream input = new ANTLRStringStream(p); 
			malice_grammarLexer lexer = new malice_grammarLexer(input );
			TokenStream tokens = new CommonTokenStream(lexer);
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			malice_grammarParser.program_return tree = parser.program() ;
			System.out.println(tree.toString());
			System.out.println("done program " + i + "...");
		}
	}
}
