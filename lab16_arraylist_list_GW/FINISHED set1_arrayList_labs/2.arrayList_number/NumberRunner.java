//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7,28,496,1111,199,201,17};
		for( int num : nums )
		{
			Number one = new Number( num );
			out.println( one.isOdd() ? one + " is odd.\n" : one + " is not odd.\n" );
			out.println( one.isPerfect() ? one + " is perfect.\n" : one + " is not perfect.\n" );
		}
		NumberAnalyzer smitty = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(smitty);	
		smitty = new NumberAnalyzer("5 12 3 7 28 496 81 65 33 11");
		System.out.println(smitty);
	}
}