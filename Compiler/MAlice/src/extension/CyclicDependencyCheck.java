package extension;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class CyclicDependencyCheck
{
	private static Set<String> imports = new HashSet<String>();

	public static Tree checkImports(Tree node) throws IOException,
			RecognitionException
	{
		Tree current = node;
		if (current.getText().contentEquals("bring"))
		{
			
		}
		return current;
	}

}
