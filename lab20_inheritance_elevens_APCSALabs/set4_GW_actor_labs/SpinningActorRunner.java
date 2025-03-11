//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class SpinningActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(0, 1), new SpinningActor());
		world.show(); 
	}
}