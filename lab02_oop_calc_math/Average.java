//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Average
{
	//instance variables
	private double one, two, average, sum;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average( )
	{
	 	sum = one + two;
		average = sum / 2;

	}
	public void print( )
	{
		System.out.println(average);
	}
}