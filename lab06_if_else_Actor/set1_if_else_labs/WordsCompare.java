//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare()
	{
		setWords("","");
	}

	public WordsCompare(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one; wordTwo = two;
	}

	public int compare()
	{
		if (wordOne.compareTo(wordTwo) < 1) {
			return 1;
		}
		return 0;
	}

// Imma be real I just guessed this first try lol this prob isnt the most elegant way to do this.
// oh well.

	public String toString()
	{
		if(compare()<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
	}
}