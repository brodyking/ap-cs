//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Numbers: ");
      String input = keyboard.nextLine();
      Average output = new Average(input);
      System.out.println(output);
	}
}