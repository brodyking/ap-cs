
//Date -
//Class -
//Lab  - 

public class FibonacciRunner
{
	public static void main(String args[])
	{
		Fibonacci test = new Fibonacci();
		
		/*
		Debug to see the list being made
		int[] templist = test.makeList();
		System.out.println(Arrays.toString(templist));
		*/
		
		test.setMax(50);
		System.out.println(test.getItem(1));
		System.out.println(test.getItem(2));
		System.out.println(test.getItem(3));
		System.out.println(test.getItem(4));
		System.out.println(test.getItem(5));
		System.out.println(test.getItem(6));
		System.out.println(test.getItem(11));
		System.out.println(test.getItem(56));

		test.setMax(1);
		System.out.println(test.getItem(1));
		System.out.println(test.getItem(2));

		test.setMax(2);
		System.out.println(test.getItem(1));
		System.out.println(test.getItem(2));
		System.out.println(test.getItem(11));
	}
}