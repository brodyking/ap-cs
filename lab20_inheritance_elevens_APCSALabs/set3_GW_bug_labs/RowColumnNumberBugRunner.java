//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class RowColumnNumberBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(1,0), new RowColumnNumberBug(1, Color.BLUE));
		world.add(new Location(5,0), new RowColumnNumberBug(4, Color.YELLOW));
		world.show(); 
	}
}