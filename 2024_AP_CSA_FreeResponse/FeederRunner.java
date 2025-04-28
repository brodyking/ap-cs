public class FeederRunner
{
	public static void main(String[] args) 
	{
		
		/*
		currentFood: 2400
		simulateManyDays(10, 4)

		*/
		
		Feeder x = new Feeder(2400);
		System.out.println( x );
		System.out.println( x.simulateManyDays(10,4) );
		System.out.println( x );
		
		
		/*
		 currentFood: 0
		 simulateManyDays(5, 10)

		*/
		
		x = new Feeder(0);
		System.out.println( x );
		System.out.println( x.simulateManyDays(5,3) );
		System.out.println( x );
		
		/*
		currentFood: 250
		simulateManyDays(10, 5)
		*/
		
		x = new Feeder(250);
		System.out.println( x );
		System.out.println( x.simulateManyDays(10,5) );
		System.out.println( x );		
		
	}
}


/*
2400
4
940
0
0
0
250
1
0

*/
