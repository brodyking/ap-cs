//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors
{
	
	public static String getDivisors(int number)
	{
		
		int i = 1;
		String divisorList = "";
		
		while (i <= number/2) {
			if (number % i == 0) {
				divisorList += i + " ";
			}
			i++;
		}
		
		return number + " has divisors " + divisorList;
	}
}