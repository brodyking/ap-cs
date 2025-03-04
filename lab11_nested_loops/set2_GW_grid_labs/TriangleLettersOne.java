//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import info.gridworld.grid.Grid; 
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class TriangleLettersOne
{
   private World<String> triangleWorld;
	private Grid<String> triangleGrid;
	private String letter;
		
	public TriangleLettersOne()
	{
		triangleGrid = new BoundedGrid<String>(0,0);
		triangleWorld = new World<String>(triangleGrid);
		letter="-";		
	}

	public TriangleLettersOne(int size, String let)
	{
		//use the constructor above as an example

	}
	
	public String getLetter()
	{
		return "";
	}
	
	public void createTriangle()
	{
		//add in nested loops


	
	}
	
	public void show()
	{
      triangleWorld.setMessage("Triangle Letters World!");   	  			
		triangleWorld.show();			
	}
}
