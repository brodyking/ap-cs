//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   		Quadratic test = new Quadratic(1,3,2);
		test.calcRoots();
		test.print();
		
   		Quadratic test2 = new Quadratic(2,13,6);
		test2.calcRoots();
		test2.print();
	}
}