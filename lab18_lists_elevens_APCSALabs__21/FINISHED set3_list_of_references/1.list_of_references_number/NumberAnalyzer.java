//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		setList("");
	}

	public NumberAnalyzer(String numbers)
	{
		setList(numbers);	
	}
	
	public void setList(String numbers)
	{
		Scanner chopper = new Scanner(numbers);
		list = new ArrayList<Number>();
		while (chopper.hasNextInt()) {
			list.add(new Number(chopper.nextInt()));
		}	
	}

	public int countOdds()
	{
      int oddCount=0;

		for (Number current : list) {
			if (current.isOdd()) {
				oddCount++;
			}
		}

      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;

		for (Number current : list) {
			if (!current.isOdd()) {
				evenCount++;
			}
		}


      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;

		for (Number current : list) {
			if (current.isPerfect()) {
				perfectCount++;
			}
		}

		return perfectCount;
	}
	
	public String toString( )
	{
		String output = "[";

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				output += list.get(i).toString();
			} else if (i == list.size()-1) {
				output += ", " + list.get(i).toString() + "]";
			} else {
				output += ", " + list.get(i).toString();
			}
		}

		return output;
		}
}