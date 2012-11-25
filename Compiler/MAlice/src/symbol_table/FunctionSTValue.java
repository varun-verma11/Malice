package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
<<<<<<< HEAD
	DATA_TYPES return_type = null;	
=======
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
	DATA_TYPES[] args;
	int currentScopeLevel = symbolTable.getCurrentScopeLevel();
	
	
<<<<<<< HEAD
	public FunctionSTValue(SymbolTable symTable, DATA_TYPES[] args) 
	{
=======
	public FunctionSTValue(String identifier, SymbolTable symTable, DATA_TYPES[] args) 
	{
		this.identifier = identifier;
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
		this.parent = symTable;
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
	}
	
<<<<<<< HEAD
	public FunctionSTValue(DATA_TYPES return_value, SymbolTable parent, DATA_TYPES[] args)
	{
		this.return_type = return_value ;
=======
	public FunctionSTValue(String identifier, DATA_TYPES return_value, SymbolTable parent, DATA_TYPES[] args)
	{
		this.identifier = identifier;
		this.type = return_value ;
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
		this.parent = parent;
		symbolTable = new SymbolTable();
		this.currentScopeLevel++;
		symbolTable.updateCurrentScopeLevel(currentScopeLevel);
		this.args = args;
<<<<<<< HEAD
	}
	
	public DATA_TYPES getReturnType() {
		return return_type;
=======
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
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


