//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				int rnd = new Random().nextInt(vals.length);
				grid[row][col] = vals[rnd];
			}	
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] most = new int[vals.length];

		for (int val = 0; val < vals.length; val++) {

			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {

					if (grid[row][col] == vals[val]) {
						most[val] += 1;
					}

				}
			}

		}

		int biggest = Integer.MIN_VALUE;
		int biggestlocation = 0;

		for (int spot = 0; spot < most.length; spot++) {
			if (most[spot] > biggest) {
				biggest = most[spot];
				biggestlocation = spot;
			}
		}

		return vals[biggestlocation];

	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
		int total = 0;
		for (int row = 0; row < grid.length;row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == val) total++;
			}
		}
		return total;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				output += grid[row][col] + " ";
			}	
			output += "\n";
		}
		return output;
	}
}