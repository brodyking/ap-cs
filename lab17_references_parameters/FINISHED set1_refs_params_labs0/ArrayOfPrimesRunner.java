//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

public class ArrayOfPrimesRunner {
	public static void main(String args[]) {

		out.println("The 1st 5 primes starting from 2 are ::\n"+Arrays.toString(ArrayOfPrimes.getPrimeList(5)));

		// add more test cases
		out.println("The 1st 5 primes starting from 10 are ::\n"+Arrays.toString(ArrayOfPrimes.getPrimeList(10)));
		out.println("The 1st 5 primes starting from 100 are ::\n"+Arrays.toString(ArrayOfPrimes.getPrimeList(10, 100)));
	}
}