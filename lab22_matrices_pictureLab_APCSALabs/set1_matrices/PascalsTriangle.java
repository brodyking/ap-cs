//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
		mat = new int[0][];
	}

	public PascalsTriangle(int size)
	{

		mat = new int[size][];

	}

	public void createTriangle()
	{

		// Creates the rows
		for (int row = 0; row < mat.length; row++) {
			// Creates the row
			mat[row] = new int[row+1];	
			// Sets the side values to 1
			mat[row][0] = 1;
			mat[row][mat[row].length-1] = 1;

		}

		if (mat.length >= 3) {
			mat[2][1] = 2;
		}

		for (int row = 0; row < mat.length; row++) {
	
			for (int col = 0; col < mat[row].length; col++) {

				if (row >= 3 && mat[row][col] != 1) {
					mat[row][col] = mat[row-1][col-1] + mat[row-1][col];
				}

			}
			
		}


	}

	public String toString()
	{
		String output="";

		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				output+= mat[row][col] + " ";
			}
			output += "\n";
		}

		return output;
	}
}