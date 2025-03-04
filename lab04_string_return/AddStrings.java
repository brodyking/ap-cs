//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
   	setStrings("","");
   }

   public AddStrings(String one, String two)
   {
   	setStrings(one,two);
   }

   public void setStrings(String one, String two)
   {
   	first = one;
   	last = two;
   }

 	public void add( )
 	{
 		sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output="first :: " + first + "\nlast :: " + last + "\nsum :: " + sum + "\n";
 		return output;
	}
}