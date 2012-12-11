/**
 * 
 */
package symbol_table;

/**
 * @author HMV
 *
 */
public abstract class SymbolTableValue {
	protected DATA_TYPES type ;
	protected String locationReg;
	protected int stringSize;
	
	public int getStringSize() {
		return stringSize;
	}
	public void setStringSize(int stringSize) {
		this.stringSize = stringSize;
	}
	public DATA_TYPES getType()
	{
		return type;
	}
	public String getLocationReg()
	{
		return locationReg;
	}
	public void setLocationReg(String locationReg)
	{
		this.locationReg = locationReg;
	}
}
