//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class Car extends Actor
{
	//add in constructors
	
	public void act()
	{
		Grid<Actor> grid = getGrid();
		if(grid==null)
		  return;



	}
	
	//override getColor so as not to provide a Color
	//as a colored .gif image has been provided
	public Color getColor()
	{
		return null;
	}
}
