//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class TheLine
{
   private String line;

   public TheLine()
   {
	line = "";
   }

   public TheLine(String s)
   {
	line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		Scanner jaansUncleTouchesHim = new Scanner(line);
		while (jaansUncleTouchesHim.hasNextInt()) {
			int currentBrainstorm = jaansUncleTouchesHim.nextInt();
			if (currentBrainstorm > largest) {
				largest = currentBrainstorm;
			}
		}
		return largest;
	}

	public String toString( )
	{
		return line + " - Largest == " + getLargest() + "\n\n";
	}
}