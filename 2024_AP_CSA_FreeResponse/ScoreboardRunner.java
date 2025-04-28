public class ScoreboardRunner
{
	public static void main(String[] args) 
	{
		String info;		
		Scoreboard game = new Scoreboard("Red", "Blue");		//game is a new Scoreboard for a game played between team 1, 
											//whose name is "Red", and team 2, 
											//whose name is "Blue". The active team is set to team 1.
		//System.out.println( game );
		info = game.getScore();	//"0-0-Red"	
		System.out.println( info );	
		game.recordPlay(1);		//Team 1 earns 1 point because the game always begins with team 1 as the active team.
		info = game.getScore();	//"1-0-Red"	
		System.out.println( info );	
		game.recordPlay(0);		//Team 1’s play failed, so team 2 is now active.
		info = game.getScore();	//"1-0-Blue"
		System.out.println( info );		
		info = game.getScore();	//"1-0-Blue"	//The score and state of the game are unchanged since the last call to 	getScore.
		System.out.println( info );	
		game.recordPlay(3);		//Team 2 earns 3 points.
		info = game.getScore();	//"1-3-Blue"
		System.out.println( info );		
		game.recordPlay(1);		//Team 2 earns 1 point.
		game.recordPlay(0);		//Team 2’s play failed, so team 1 is now active.
		info = game.getScore();	//"1-4-Red"	
		System.out.println( info );	
		game.recordPlay(0);		//Team 1’s play failed, so team 2 is now active.
		game.recordPlay(4);		//Team 2 earns 4 points.
		game.recordPlay(0);		//Team 2’s play failed, so team 1 is now active.
		info = game.getScore();	//"1-8-Red"	
		System.out.println( info );	
		Scoreboard match = new Scoreboard("Lions", "Tigers");		//match is a new and independent Scoreboard object.
		info = match.getScore();	//"0-0-Lions"	
		System.out.println( info );			
		info = game.getScore();		//"1-8-Red"	
		System.out.println( info );	
	}
}


/*
output

0 - 0 Red
1 - 0 Red
1 - 0 Blue
1 - 0 Blue
1 - 3 Blue
1 - 4 Red
1 - 8 Red
0 - 0 Lions
1 - 8 Red

*/
