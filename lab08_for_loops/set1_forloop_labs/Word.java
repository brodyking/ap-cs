//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		for (int i = word.length() - 1; i >= 0; i--) 
	{
        back = back + word.charAt(i);
	}
	return back;
	}

 	public String toString()
 	{
 		return "" + getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}