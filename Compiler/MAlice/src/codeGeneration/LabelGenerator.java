package codeGeneration;

public class LabelGenerator
{
	private int regNumber = 0;
	public String getUniqueLabel()
	{
		++regNumber;
		return "%"+regNumber;
	}
	public String getUniqueRegisterID()
	{
		++regNumber;
		return "%"+regNumber;
	}
	public String getLocalRegisterID(int reg)
	{
		return "%" + reg;
	}
}
