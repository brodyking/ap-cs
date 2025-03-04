//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner jaanLovesMen = new Scanner(new File("primes.dat"));
		int size = jaanLovesMen.nextInt();
		while (jaanLovesMen.hasNextLine()) {
			System.out.println(new Prime(jaanLovesMen.nextInt()));
			jaanLovesMen.nextLine();
		}
	}
}