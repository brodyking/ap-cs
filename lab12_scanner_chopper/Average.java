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

   public Average()
   {
	setLine("");
}

   public Average(String s)
   {
	setLine(s);
	}

	public void setLine(String s)
	{
		line = s;
	}

	public int getCount()
	{
		int count=0;		
		Scanner keyboard = new Scanner(line);
		while (keyboard.hasNextInt()) {
			count++;
			keyboard.next();
		}
		return count;
	}

	public int getSum()
	{
		int sum=0;
		Scanner keyboard = new Scanner(line);
		while (keyboard.hasNextInt()) {
			sum += keyboard.nextInt();
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = (double)getSum() / getCount();
		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return "average = "+getAverage();
	}
}