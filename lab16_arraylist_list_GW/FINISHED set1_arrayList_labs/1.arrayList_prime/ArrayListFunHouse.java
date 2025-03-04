//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		//add code here
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {
			if (i != 0 && number % i == 0) {
				factors.add(i);
			}
		}

		return factors;
	}
	
	public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
	{
		for (int i = 0; i < nums.size(); i++) {
			int currentnum = nums.get(i);
			if (getListOfFactors(currentnum).size() < 2) {
				nums.remove(i);
			}
		}	
	}
}