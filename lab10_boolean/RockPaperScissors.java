//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		String[] options = {"R","P","S"};
		Random random = new Random();
		int randomIndex = random.nextInt(options.length);
		compChoice = options[randomIndex];
	}

	public String determineWinner()
	{
		String winner="";
		switch (playChoice) {
			case "r":
				playChoice = "R";
				break;
			case "p":
				playChoice = "P";
				break;
			case "s":
				playChoice ="S";
				break;
			default:
				break;
		}
		switch (playChoice) {
			case "R":
				if (compChoice.equals(playChoice)) {
					winner = "Both";
					break;
				}
				if (compChoice.equals("P")) {
					winner = "Computer";
					break;
				}
				winner = "Player";
				break;
			case "P":
				if (compChoice.equals(playChoice)) {
					winner = "Both";
					break;
				}
				if (compChoice.equals("S")) {
					winner = "Computer";
					break;
				}
				winner = "Player";
				break;
			case "S":
				if (compChoice.equals(playChoice)) {
					winner = "Both";
					break;
				}
				if (compChoice.equals("R")) {
					winner = "Computer";
					break;				}
				winner = "Player";
				break;
			default:
				break;
		}
		return winner;
	}

	public String toString()
	{
		String output="Player: " + playChoice + "\nComputer: " + compChoice + "\nThe winner is " + determineWinner();
		return output;
	}
}