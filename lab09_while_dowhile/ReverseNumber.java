//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber(int num) {
		setNumber(num);
	}
	
	//add a set method
	public void setNumber(int num) {
		number = num;
	}

	public int getReverse() {
      int rev = 0;
      int num = number;
      
      while (num != 0) {
         rev = rev * 10 + num % 10;
         num = num / 10;
      }
      
      return rev;
   }

	//add  a toString	
   public String toString() {
      return "Original number: " + number + ", Reversed number: " + getReverse();
   }
}