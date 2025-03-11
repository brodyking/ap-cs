//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class NumberRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(4,2), new Number(1));
		world.add(new Location(1,2), new Number(7, Color.RED));
		world.add(new Location(8,7), new Number(13,Color.GREEN, Color.RED));
		world.add(new Location(8,7), new Number(13,Color.GREEN, Color.RED));		
		world.show(); 
	}
}