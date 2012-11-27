package semantics_checks;

import org.antlr.runtime.tree.Tree;

import symbol_table.DATA_TYPES;

public class SemanticsUtils {
	public static DATA_TYPES getReturnType(Tree node)
	{
		Tree curr = node.getChild(0);

		while (curr != null && curr.getText().contentEquals("contained"))
		{
			curr = getNextChild(curr);
		}

		return DATA_TYPES.valueOf(curr.getText().toUpperCase());
	}

	public static Tree getNextChild(Tree current)
	{
		return current.getParent().getChild(current.getChildIndex()+1);
	}
}
