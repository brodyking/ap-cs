//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a","b","c","d","e"};
		Grid meow = new Grid(10, 10,vals);
		System.out.println(meow);
		System.out.println("a: " + meow.countVals("a"));
		System.out.println("b: " + meow.countVals("b"));
		System.out.println("c: " + meow.countVals("c"));
		System.out.println("d: " + meow.countVals("d"));
		System.out.println("e: " + meow.countVals("e"));
		System.out.println("\n" + meow.findMax(vals) + " occours the most");
	}
}