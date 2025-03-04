//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
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
		Scanner splitOnSpace = new Scanner(numbers);
		list = new ArrayList<Number>();
		while(splitOnSpace.hasNext())
			list.add(new Number(splitOnSpace.nextInt()));
	}

	public int countOdds()
	{
		int oddCount=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber() % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount;
	}

	public int countEvens()
	{
		int evenCount=0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber() % 2 == 0) {
				evenCount++;
			}
		}

		return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;

		for (int i = 0; i < list.size(); i++) {
			int currentNumber = list.get(i).getNumber(); // the number in the list
			int specificPerfectCount = 0; // total of the current number in the loop
			for (int z = 1; z < currentNumber; z++) {
				if (currentNumber % z == 0) {
					specificPerfectCount += z; 
				}
			}
			if (specificPerfectCount == currentNumber) {
				perfectCount++;
			}
		}

		return perfectCount;
	}
	
	public String toString( )
	{
		return list.toString() + "\nodd count = " + countOdds() + "\neven count = " + countEvens() + "\nperfect count = " + countPerfects();
	}
}