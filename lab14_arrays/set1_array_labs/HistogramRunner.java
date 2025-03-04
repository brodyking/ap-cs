//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class HistogramRunner
{
	public static void main(String args[])
	{
		int[] numbers = {1,5,3,4,5,5,4,3,2,5};
		Histogram test = new Histogram(numbers);
		System.out.println(test);
		int[] numbers2 = {0,0,0,0,6,6,6,5,5,6,4,3,2,1};
		Histogram test2 = new Histogram(numbers2);
		System.out.println(test2);
	}
}