//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

public class Number
{
	private Integer number;

	public Number()
	{
		setNumber(0);
	}

	public Number(int num)
	{
		setNumber(num);
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		if (number % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPerfect()
	{
		int total=0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		return (number==total);
	}

	public String toString( )
	{
		return "" + number;
	}
}