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
		Scanner splitOnSpace = new Scanner(wordList);
		words = new ArrayList<Word>();
		while (splitOnSpace.hasNext())
			words.add(new Word(splitOnSpace.next()));
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for (int i = 0; i < words.size(); i++) {
			String currentword = words.get(i).toString();
			int currentwordcount = 0;
			for (int z = 0; z < currentword.length(); z++) {
				currentwordcount++;
			}
			if (currentwordcount == size) {
				count++;
			}
		}
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).toString().length() == size) {
				count += words.get(i).getNumVowels();
				words.remove(i);
				i--;
			}	
		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{

		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getNumVowels() == numVowels) {
				count++;
			}
		} 
		return count;
	}
	
	public String toString()
	{
	   return "" + words;
	}
}