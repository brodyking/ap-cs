//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		setWord("");
	}

	public Social(String soc)
	{
		setWord(soc);
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		int firstDash = socialNum.indexOf("-");
		int lastDash = socialNum.lastIndexOf("-");
		sum = Integer.parseInt(socialNum.substring(0,firstDash)) + Integer.parseInt(socialNum.substring(firstDash+1,lastDash)) + Integer.parseInt(socialNum.substring(lastDash+1));
	}
	

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}