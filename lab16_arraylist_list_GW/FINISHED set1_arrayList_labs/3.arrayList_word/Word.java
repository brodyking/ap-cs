//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

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

	public String getWord() {
		return word;
	}
	
	public int getNumVowels()
	{
		int count = 0;
		for (int i = 0; i < word.length(); i++) { // Each letter in the word
			for (int z = 0; z < vowels.length(); z++) { // Each vowel
				if (word.charAt(i) == vowels.charAt(z)) { // Checks if it is a vowel
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