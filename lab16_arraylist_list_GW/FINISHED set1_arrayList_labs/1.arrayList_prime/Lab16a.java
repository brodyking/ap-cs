//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16a
{
	public static void main( String args[] )
	{
		System.out.println(ArrayListFunHouse.getListOfFactors(9));
				
		System.out.println(ArrayListFunHouse.getListOfFactors(23));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(50));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(100));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(762));	
			
		System.out.println();

		Integer[] nums = {2,6,8,9,10,12,13,15,17,22,23,24,55,66,78,77,79};
		ArrayList<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );
		
		System.out.println("Original List");
		System.out.println( list );
		System.out.println("List of Composites");
		ArrayListFunHouse.keepOnlyCompositeNumbers( list );
		System.out.println( list );
	}
}