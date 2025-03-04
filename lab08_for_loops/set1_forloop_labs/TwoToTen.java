//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
		setTwo("");
	}

	public TwoToTen(String bin)
	{
		setTwo(bin);
	}

	public void setTwo(String bin)
	{
		binary = bin;
	}

	public long getBaseTen( )
	{
		long ten=0;
		int inc=0;
		int len = binary.length()-1;
		//largest number = 2^length-
		{
			for(int i = binary.length()-1; i>-1; i--)
			{
				if(binary.charAt(i) == '1')
				{//									2^3-0    + 2^1
					ten = ten + (long)Math.pow(2,inc);
				}
				else
					ten = ten;
				inc++;
			}
		}
		return ten;
	}

	public String toString()
	{
		return "" + binary + " is " + getBaseTen();
	}
}