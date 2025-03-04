//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
      Scanner poopypants = new Scanner(System.in);
      System.out.println("Line:");
      String line = poopypants.nextLine();
      System.out.println("Break");
      LineBreaker meow = new LineBreaker(line,poopypants.nextInt());
      System.out.println(meow);
	}
}