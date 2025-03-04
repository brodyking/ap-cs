//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.actor.Actor;  
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class CrazyCritter extends Critter
{
	public CrazyCritter()
	{
		setColor(Color.GREEN);
	}
	
	//getActors will return all actors around this critter
	//that have the same color as this critter
	public ArrayList<Actor> getActors()
	{
		return null;
	}
    
	//processActors will make each of the actors in ArrayList actors
	//turn 90 degress to the right
	public void processActors(ArrayList<Actor> actors)
	{
	}
}
