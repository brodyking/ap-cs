//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	//constructor methods go here

	public Prime() {
		setPrime(0);
	}
	 
	public Prime (int num) {
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			} 
		} 
		return true;
	}

	public String toString()
	{
		if (isPrime()) {
			return number + " IS PRIME";
		}
		return number + " IS NOT PRIME";
	}
}