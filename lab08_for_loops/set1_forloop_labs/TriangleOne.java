//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOne
{
	private String word;
	
	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
word = s;
			
	}

	public void print()
	{
			for(int i= word.length(); i>0; i--)
			{
			System.out.println(word.substring(0,i));
			}
	}
}