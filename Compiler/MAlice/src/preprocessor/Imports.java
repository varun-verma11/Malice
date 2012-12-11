package preprocessor;

import java.io.IOException;

import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;
import malice_grammar.malice_grammarParser.program_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import semantics_checks.SemanticsUtils;

public class Imports
{
	public static Tree checkImports (Tree node) throws IOException, RecognitionException
	{
		Tree current = node;
		if (current.getText().contentEquals("bring"))
		{
			current = importFunctions(current);
			current = SemanticsUtils.getNextChild(current);
			return checkImports(current);
		}
		return current;
	}

	private static Tree importFunctions(Tree node) throws IOException, RecognitionException
	{
		Tree current = node;
		
		while(current!=null && current.getText().contentEquals("bring"))
		{
			if (current.getChild(0).getText().contentEquals("all"))
			{
				importAllFunctions(node, current.getChild(1).getText().substring(1,current.getChild(1).getText().length()-1));
				current = SemanticsUtils.getNextChild(current);
			}
		}
		
		return current;
	}

	private static void importAllFunctions(Tree node, String filepath) 
	throws IOException, RecognitionException
	{
		CharStream input = new ANTLRFileStream(
				//new java.io.File( "." ).getCanonicalPath()
				"c:/Users/varun/Documents/Malice/" +
				"malice_new_clone/Tests For Extension"
				+ "/"
				+ filepath 
				+ ".alice");
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		if (lexer.getNumberOfSyntaxErrors()==0)
		{
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			program_return prog = parser.program();
			if (parser.getNumberOfSyntaxErrors()==0) {
				Tree tree =  (Tree) prog.getTree() ;
				attachAllFunctionToTree(node.getParent(),tree);
			}
		}
	}

	private static void attachAllFunctionToTree(Tree node, Tree toAttach)
	{
		Tree current = (toAttach.getText()==null)? toAttach.getChild(0) : toAttach ;
		Tree temp = (node.getText()==null)? node.getChild(0) : node ;
		while(temp!=null && 
			!temp.getText().contentEquals("looking")
			&& !temp.getText().contentEquals("room"))
		{
			temp = SemanticsUtils.getNextChild(temp);
		}
		while(current!=null)
		{
			if(current.getText().contentEquals("looking") 
					|| current.getText().contentEquals("room"))
			{
				if (!current.getChild(0).getText().contentEquals("hatta"))
				{
					insertChildInIndex(node,temp.getChildIndex(), current);
					node.freshenParentAndChildIndexes();
				}
			}
			current = SemanticsUtils.getNextChild(current);
		}
	}

	private static void insertChildInIndex(Tree node, int childIndex,
			Tree toInsert)
	{
		int insIndex = childIndex;
//		Tree curr = node.getChild(childIndex);
//		int numberOfChilds = node.getChildCount();
//		childIndex++;
//		Tree next = node.getChild(childIndex);
//		while(childIndex<numberOfChilds)
//		{
//			node.freshenParentAndChildIndexes();
//			node.setChild(childIndex, curr);
//			curr = next;
//			next = node.getChild(childIndex);
//			childIndex++;
//		}
		node.setChild(insIndex, toInsert);
		node.freshenParentAndChildIndexes();
//		node.addChild(curr);
	}
}
