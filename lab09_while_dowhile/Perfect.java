//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Perfect
{
	private int i = 1;
	private int divisorList = 0;
	private int number;

	//add constructors
	
	public Perfect(int num) {
		setNumber(num);
	}
	
	//add a set method
	public void setNumber(int num) {
		number = num;
	}

	public boolean isPerfect()
	{
		while (i <= number/2) {
			if (number % i == 0) {
				divisorList = divisorList + i;
			}
			i++;
		}
		return divisorList == number;
	}

	public String toString() {
		return "" + isPerfect();
	}
	
}
