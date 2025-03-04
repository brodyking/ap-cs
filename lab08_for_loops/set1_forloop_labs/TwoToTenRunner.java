//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TwoToTenRunner
{
	public static void main ( String[] args )
	{
		TwoToTen test = new TwoToTen("1010");
		test.getBaseTen();
		System.out.println(test);
		
		test.setTwo("11000");
		test.getBaseTen();
		System.out.println(test);
		
		test.setTwo("10101011011");
		test.getBaseTen();
		System.out.println(test);
		
		
	}
}