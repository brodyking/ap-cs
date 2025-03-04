//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0; 
      while (chopper.hasNextInt()) {
         int currentweight = chopper.nextInt();
         if (currentweight >= 2 && currentweight <= 4) {
            cups += 0.5 * 7;
         } else if (currentweight >= 5 && currentweight <= 7) {
            cups += 1.0 * 7;
         } else if (currentweight >= 8 && currentweight <= 9) {
            cups += 1.5 * 7;
         } else if (currentweight >= 10 && currentweight <= 19) {
            cups += 2.0 * 7;
         } else if (currentweight >= 20 && currentweight <= 39) {
            cups += 3.5 * 7;
         } else if (currentweight >= 40 && currentweight <= 59) {
            cups += 4.5 * 7;
         } else if (currentweight >= 60 && currentweight <= 79) {
            cups += 6.0 * 7;
         } else {
            cups += 7.5 * 7;
         }
      }

      amount = cups;

		//calc code goes here

   }

   public double getAmount()
   {
   	return Math.ceil(amount/60);
   }

	public String toString()
	{
		return getAmount() + " - 10 POUND BAGS"; 
	}
}