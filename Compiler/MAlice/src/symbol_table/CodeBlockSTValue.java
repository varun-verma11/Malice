package symbol_table;

public class CodeBlockSTValue extends SymbolTableValue
{
	SymbolTable symbolTable ;
	
	/**
	 * Constructor for a code-block.
	 * 
	 * @param currSymTable 
	 */
	public CodeBlockSTValue(SymbolTable currSymTable) 
	{
		this.type = DATA_TYPES.ERROR;
		symbolTable = new SymbolTable();
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1); 
		symbolTable.setEnclosingSymbolTable(currSymTable);
	}
	
	/**
	 * Returns associated symbol-table for a CodeBlockSTValue
	 * 
	 * @return	current symbol-table
	 */
	public SymbolTable getTable()
	{
		return symbolTable ;
	}
}
