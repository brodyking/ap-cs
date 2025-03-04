//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		setStrings("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a,b,c);
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		if (one.compareTo(two) >= 1 && one.compareTo(three)  >= 1) {
			return one;
		} else if (two.compareTo(one)  >= 1 && two.compareTo(three)  >= 1) {
			return two;
		} else if (three.compareTo(two)  >= 1 && three.compareTo(one)  >= 1) {
			return three;
		}
		return "";
	}

	public String toString()
	{
	   return "" + getBiggest();
	}
}