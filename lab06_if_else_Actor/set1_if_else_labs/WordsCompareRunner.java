//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
		WordsCompare smitty = new WordsCompare("Billy", "bill");
		//if smitty.compare() is used, the compare() in WordsCompare is unnecessary.
		//smitty.compare();
		System.out.println(smitty);
		
		smitty.setWords("billy", "bill");
		//smitty.compare();
		System.out.println(smitty);
		
		smitty.setWords("abe", "ape");
		//smitty.compare();
		System.out.println(smitty);
		
		smitty.setWords("giraffe", "gorilla");
		//smitty.compare();
		System.out.println(smitty);

	}
}