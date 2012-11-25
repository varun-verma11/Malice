package symbol_table;

import java.util.HashMap;
import java.util.Map;
										//do we need extends comparable here???
public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	private Map<String,SymbolTableValue> symbolTable = new HashMap<String, SymbolTableValue>();
	private int currentScopeLevel = 0;
	
	public boolean checkVariableScopeInCurrLevel(String var) 
	{
		return symbolTable.containsKey(var);
	}
	
//	public boolean checkVariableScopeInAllReleventLevels(String var)
	//{
		
	}
	private void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
	}
	
	public boolean checkVariableScopeInFunctionInEnclosingLevel(String var, String f_name)
	{
		
		return true;
	}
	
	public Map<String,SymbolTableValue> getSymbolTable()
	{
		return symbolTable;
	}
	
	public boolean isVariableInitialised(String var)
	{
		return ((VariableSTValue)symbolTable.get(var)).isInitialised();
	}
	
	@Override
	public void insert(String name, SymbolTableValue value) 
	{
		symbolTable.put(name, value);		
	}

	@Override  //need to change this so that it makes sure it looks in other scopes!!!!
	public SymbolTableValue lookup(String name) 
	{
		return symbolTable.get(name);
	}
	
}
