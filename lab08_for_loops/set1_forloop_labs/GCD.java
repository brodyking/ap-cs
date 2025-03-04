import static java.lang.System.*;
import java.lang.Math;

public class GCD
{
	private int one, two;

	public GCD() {}

	public GCD(int numOne, int numTwo)
	{
		setNums(numOne, numTwo);
	}

	public void setNums(int numOne, int numTwo)
	{
		one = numOne;
		two = numTwo;
	}

	public long getGCD()
	{
		int a = one;
		int b = two;
		while (b != 0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public String toString()
	{
		return "The GCD of " + one + " and " + two + " is " + getGCD();
	}
}