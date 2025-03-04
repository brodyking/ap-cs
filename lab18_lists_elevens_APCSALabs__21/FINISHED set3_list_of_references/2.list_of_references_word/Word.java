//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;

		for (int i = 0; i < word.length(); i++) {
			for (int x = 0; x < vowels.length(); x++) {
				if (word.charAt(i) == vowels.charAt(x)) {
					count++;
				}
			}
		}


		return count;
	}
	
	public int getLength()
	{
		return word.length(); 
	}

	public String toString()
	{
	   return word;
	}
}