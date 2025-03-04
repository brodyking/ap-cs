//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString("abc", "cba", "bca");
		System.out.println(test);
		
		test.setStrings("one", "Two", "three");
		System.out.println(test);
	}
}