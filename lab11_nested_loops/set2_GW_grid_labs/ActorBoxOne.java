//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import info.gridworld.grid.Grid; 
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class ActorBoxOne
{
	public static void drawBox(int size)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(15,15));

		//add nested loops to draw a box of actors
		
		
		world.show();		
	}
}
