//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;
import java.io.File;

public class AverageRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner goon = new Scanner(new File("average.dat"));
		int size = goon.nextInt();
		System.out.println(size);
		for (int i = 0; i < size+1; i++) {
			System.out.println(new Average(goon.nextLine()) + "\n");
		}

	}
}