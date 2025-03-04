//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   //write two constructors

	public Average() {
		line = "";
	} 
	
	public Average(String s) {
		line = s;
	}

	//write a setLine method
	// nah imma do my own thing 



	private int getLowest()
	{
		int lowest=Integer.MAX_VALUE;

		Scanner salad = new Scanner(line);

		while (salad.hasNextInt()) {
			int swisscheese = salad.nextInt();
			if (swisscheese < lowest) {
				lowest = swisscheese;
			}
		}

		return lowest;
	}

	public double getAverage()
	{
		double average=0.0;
		int count = 0;

		Scanner salad = new Scanner(line);

		while (salad.hasNextInt()) {
			count++;
			average += salad.nextInt();
		}
		count--;
		average -= getLowest();
		average = average / count;

		return average;
	}

	//write a getLine method
	//meow



	//write a toString method
	public String toString() {
		return line + "\naverage == " + getAverage();
	}



}