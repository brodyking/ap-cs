//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		Scanner jaanpmots = new Scanner(System.in);
		System.out.print("Weight per Weeks: ");
		String line = jaanpmots.nextLine();
		DogFood test = new DogFood(line);
		System.out.println(test);
	}
}