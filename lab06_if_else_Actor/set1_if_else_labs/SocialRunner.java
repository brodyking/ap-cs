//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Social smitty = new Social("123-456-789");
		smitty.chopAndAdd();
		System.out.println(smitty);
		
		smitty.setWord("1-2-3");
		smitty.chopAndAdd();
		System.out.println(smitty);		
	}
}