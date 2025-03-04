//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
   private String line;
   private int breaker;

   public LineBreaker()
   {
   	this("",0);
   }

   public LineBreaker(String s, int b)
   {
	setLineBreaker(s, b);
   }

	public void setLineBreaker(String s, int b)
	{
		line = s;
		breaker = b;
	}

	public String getLine()
	{
		return line; 
	}

	public String getLineBreaker()
	{
		String box ="";

		Scanner jaancurryman = new Scanner(line);
		int currentiteration = 0;
		while (jaancurryman.hasNext()) {
			if (currentiteration == breaker-1) {
				box += jaancurryman.next() + "\n";
				currentiteration = 0;
			} else {
				box += jaancurryman.next();
				currentiteration++;
			}
		}

		return box;
	}

	public String toString()
	{
		return getLineBreaker();
	}
}