//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("",0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter() 
	{
		String output = "";
		for (int i = 0; i < size; i++) {
			for (int x = size-i; x >0; x--) {
				output += " ";
			}
			for (int y = i; y > 0; y--) {
				output += letter;		
			}
			output += "\n";
		}
		return output;
	}

	public String toString()
	{
		String output=getLetter() + "";
		return output+"\n";
	}
}