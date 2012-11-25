package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	DATA_TYPES return_type = null;	
	DATA_TYPES[] args;
	int currentScopeLevel = symbolTable.getCurrentScopeLevel();
	
	
	public FunctionSTValue(SymbolTable symTable, DATA_TYPES[] args) 
	{
		this.parent = symTable;
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
	}
	
	public FunctionSTValue(DATA_TYPES return_value, SymbolTable parent, DATA_TYPES[] args)
	{
		this.return_type = return_value ;
		this.parent = parent;
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
	}
	
	public DATA_TYPES getReturnType() {
		return return_type;
	}
	
	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
	public SymbolTable getParent() 
	{
		return parent;
	}
	
	public DATA_TYPES[] getArgs() 
	{
		return args;
	}
	
}


