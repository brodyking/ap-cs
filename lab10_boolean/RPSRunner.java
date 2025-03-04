//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		//add in a do while loop after you get the basics up and running
		do
		{
		out.print("\nChoose Rock, Paper or Scissors [R,P,S] :: ");
		RockPaperScissors game = new RockPaperScissors(keyboard.next());
		System.out.println(game + "\n\n");
		System.out.print("Would you like to play again? [y]");
		response = keyboard.next().toLowerCase().charAt(0);
		}
		while (response == 'y') ;
	}
}