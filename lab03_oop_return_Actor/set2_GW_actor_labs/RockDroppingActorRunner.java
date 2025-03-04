//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld; 

public class RockDroppingActorRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(10,10));
		Actor dude = new RockDroppingActor();
		dude.setColor(Color.GREEN);
		world.add(new Location(7, 7), dude);
		world.show();
	}
}