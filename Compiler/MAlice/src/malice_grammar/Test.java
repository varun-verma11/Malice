package malice_grammar;

import java.util.ArrayList;

public class Test
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		class ClassA
		{
			ArrayList<Integer> arr;
			public ClassA(ArrayList<Integer> arr) 
			{
				this.arr = arr ;
			}
			public ArrayList<Integer> getA()
			{
				return arr;
			}
		}
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ClassA a = new ClassA(ar);
		System.out.println(ar.size());
		ar.add(2);
		ar.add(2);
		System.out.println(a.getA().size());

	}

}
