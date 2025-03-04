 //© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance test = new Distance(0,0,3,4);
		test.calcDistance();
		test.print();	
			
		Distance test1 = new Distance(-1,2,4,14);
		test1.calcDistance();
		test1.print();	
	}
}