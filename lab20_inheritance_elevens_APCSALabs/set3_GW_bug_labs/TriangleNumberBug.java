//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

public class TriangleNumberBug extends NumberBug
{
	private int steps;
	private int maxSteps;
	
	public TriangleNumberBug(int num)
	{
	   super(num);
	   setDirection(Location.SOUTH);	   
	   maxSteps=1;
	   steps=1;
	}

	public TriangleNumberBug(int num, Color color)
	{
	}

	public void move()
	{		
	}
	
	public boolean canMove()
	{
		return false;
	}	
}