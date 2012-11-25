package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	DATA_TYPES return_type = null;	
	DATA_TYPES[] args;
	int currentScopeLevel = symbolTable.getCurrentScopeLevel();
	
	
	public FunctionSTValue(String identifier, SymbolTable symTable, DATA_TYPES[] args) 
	{
		this.identifier = identifier;
<<<<<<< HEAD
=======
		this.parent = symTable;
>>>>>>> 75e067096c5e90e763dca73d8ed969d858a3d0d9
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
	}
	
	public FunctionSTValue(String identifier, DATA_TYPES return_value, SymbolTable parent, DATA_TYPES[] args)
	{
		this.identifier = identifier;
		this.return_type = return_value ;
		this.parent = parent;
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
	}
	
	public DATA_TYPES getReturnType() 
	{
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


