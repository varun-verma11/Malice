package symbol_table;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable table ;
	
	public FunctionSTValue(String identifier) 
	{
		this.identifier = identifier;
		table = new SymbolTable();
	}
	
	public SymbolTable getTable()
	{
		return table ;
	}
	
}

