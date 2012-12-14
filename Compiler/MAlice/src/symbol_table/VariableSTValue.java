/**
 * 
 */
package symbol_table;

/**
 * 
 */
public class VariableSTValue extends SymbolTableValue
{
	/**
	 *	@field initialised		True iff the variable is initialised, else False
	 */
	private boolean initialised;
	int arr_size=-1;
	
	/**
	 * Constructor for VariableSTValue
	 * 
	 * @param type    			Data type of the variable key.
	 * @param initialised		Given boolean value to set the field 'initialised'.
	 * @return					VariableSTValue, usually for pairing with a variable key in a SymbolTable
	 */
	public VariableSTValue(DATA_TYPES type, boolean initialised)
	{
		this.type = type;
		this.initialised = initialised ;
	}
	
	
	/**
	 * Resets 'initialised' field of a VariableSTVale to the given boolean
	 * 
	 * @param initialised		Given boolean value to reset the field 'initialised'.
	 */
	public void setInitialised(boolean initialised)
	{
		this.initialised = initialised ;
	}
	
	/**
	 * To check whether variable is initialised
	 *
	 * @return     True if variable was initialised, else False
	 */
	public boolean isInitialised() 
	{
		return initialised ;
	}
	
	/**
	 * Sets the size of an array to a number
	 *
	 * @param size     Array-size
	 */
	public void setArraySize(int size)
	{
		arr_size = size;
	}
	
	/**
	 * Returns array-size
	 *
	 * @return     array-size as an integer
	 */
	public int getArraySize()
	{
		return arr_size;
	}
}
