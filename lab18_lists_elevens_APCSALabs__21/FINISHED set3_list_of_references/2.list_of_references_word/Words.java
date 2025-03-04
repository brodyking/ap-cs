//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words = new ArrayList<Word>();
		Scanner chopper = new Scanner(wordList);
		while(chopper.hasNext())
		{
			words.add(new Word(chopper.next()));
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;

		for (Word current : words) {
			if (current.getLength() == size) {
				count++;
			}
		}

		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{

		int count=0;

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getLength() == size) {
				
				count += words.get(i).getNumVowels();	
				
				words.remove(i);
				i = i -1;
			}
		}
		
		return count;
	}


	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
/*
 for (Word current : words) {
	if (current.getNumVowels() == numVowels) {
		count++;
	}
}
*/
		return count;
	}
	
	public String toString()
	{

		String output = "[";

		for (int i = 0; i < words.size(); i++) {
			if (i == 0) {
				output += words.get(i).toString();
			} else if (i == words.size() -1) {
				output += ", " + words.get(i).toString() + "]";
			} else {
				output += ", " + words.get(i).toString();
			}
		}
	
		return output;
	}
}