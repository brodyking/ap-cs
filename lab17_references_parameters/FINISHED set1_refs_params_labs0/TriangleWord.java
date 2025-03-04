//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length() + 1; i++) {
			for (int y = 1;y < i+1;y++) {
				System.out.print(word.substring(0, i));
			}
			System.out.print("\n");
		}	
	}
}