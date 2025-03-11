//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class NumberBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(4,3), new NumberBug(1));		
		world.add(new Location(2,1), new NumberBug(5, Color.GREEN));		
		world.add(new Location(7,6), new NumberBug(6, Color.BLUE));
		world.add(new Location(7,6), new NumberBug(-44, Color.RED, Color.WHITE));		
		world.show(); 
	}
}