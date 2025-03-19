//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap
{
	private boolean[][] kittyGrid;

	/*
	 *this constructor loads in random true and false values
	*/
	public KittyMap(int rows, int cols)
	{
		kittyGrid = new boolean[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Random randomthingy = new Random();
				int meow = randomthingy.nextInt(5);
				if (meow < 1) {
					kittyGrid[r][c] = true;
				} else {
					kittyGrid[r][c] = false;
				}
			}
		}
	}

	/*
	 *this method will call getKittyCountsGrid
	 *to retrieve the kitty counts for the kittyGrid
	 */
	public void printKittyCount()
	{

		int[][] gridmeow = getKittyCountsGrid();

		for (int row = 0; row < kittyGrid.length; row++) {
			for (int col = 0; col < kittyGrid[0].length; col++) {
				System.out.print(gridmeow[row][col] + " ");
			}
			System.out.print("\n");
		}
	}

	/*
	 *this method will calculate the kitty counts for each cell
	 *if cell is true set int value to 9
	 *if cell is not true set int value to cnt of kitties in adjacent cells
	 */
	public int[][] getKittyCountsGrid()
	{

		int[][] output = new int[kittyGrid.length][kittyGrid[0].length];

		for (int row = 0; row < kittyGrid.length; row++) {
			System.out.print("\n");
			for (int col = 0; col < kittyGrid[0].length; col++) {
				output[row][col] = getKittyCount(row, col);
			}
		}

		return output;
	}

	/*
	 *this method will return the value of the current cell
	 *if this cell contains a kitty - return 9
	 *otherwise - return the cnt of all kitties in adjacent cells
	 */
	public int getKittyCount( int r, int c)
	{
		if (kittyGrid[r][c] == true) {
			return 9;
		}
		
		int totalsurrounding = 0;

		if (inBounds(r-1, c-1) && kittyGrid[r-1][c-1] == true) totalsurrounding += 1; // TOP LEFT
		if (inBounds(r-1, c) && kittyGrid[r-1][c] == true) totalsurrounding += 1; // TOP MIDDLE
		if (inBounds(r-1, c+1) && kittyGrid[r-1][c+1] == true) totalsurrounding += 1; // TOP RIGHT
		if (inBounds(r, c-1) && kittyGrid[r][c-1] == true) totalsurrounding += 1; // LEFT
		if (inBounds(r, c+1) && kittyGrid[r][c+1] == true) totalsurrounding += 1; // RIGHT
		if (inBounds(r+1, c-1) && kittyGrid[r+1][c-1] == true) totalsurrounding += 1; // BOTTOM LEFT
		if (inBounds(r+1, c) && kittyGrid[r+1][c] == true) totalsurrounding += 1; // BOTTOM MIDDLE
		if (inBounds(r+1, c+1) && kittyGrid[r+1][c+1] == true) totalsurrounding += 1; // BOTTOM RIGHT

		return totalsurrounding;
	}

	/*
	 *check r and c to ensure they are inside the grid
	 */
	private boolean inBounds( int r, int c)
	{
		try {
			boolean value = kittyGrid[r][c];
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	/*
	 *return the kitty grid as a string
	 */
	public String toString()
	{
		String output = "";

		for (int row = 0; row < kittyGrid.length; row++) {
			System.out.print("\n");
			for (int col = 0; col < kittyGrid[0].length; col++) {
				if ((kittyGrid[row][col]) == true) {
					output += "1 ";	
				} else {
					output += "0 ";
				}
			}
			output += "\n";
		}
		
		return output;
			
	}
}