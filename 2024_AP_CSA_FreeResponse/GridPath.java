public class GridPath {
	/** Initialized in the constructor with distinct values that never change */

	private int[][] grid;

	public GridPath() {
		/*
		 * grid = new int[][]{{12,3,4,13,5},
		 * {11,21,2,14,16},
		 * {7,8,9,15,0},
		 * {10,17,20,19,1},
		 * {18,22,30,25,6}};
		 */

		grid = new int[][] { { 12, 30, 40, 25, 5 },
				{ 11, 3, 22, 15, 43 },
				{ 7, 2, 9, 4, 0 },
				{ 8, 33, 18, 6, 1 } };
	}

	/**
	 * Returns the Location representing a neighbor of the grid element at row and
	 * col,
	 * as described in part (A)
	 * Preconditions: row is a valid row index and col is a valid column index in
	 * grid.
	 * row and col do not specify the element in the last row and last column of
	 * grid.
	 */
	public Location getNextLoc(int row, int col) {

		Location belowLoc = new Location(row + 1, col);
		Location rightLoc = new Location(row, col + 1);

		if (row == grid.length - 1)
			return rightLoc;

		if (col == grid[0].length - 1)
			return belowLoc;

		if (grid[row + 1][col] < grid[row][col + 1])
			return belowLoc;
		else
			return rightLoc;

	}

	/**
	 * Computes and returns the sum of all values on a path through grid, as
	 * described in
	 * part (B)
	 * Preconditions: row is a valid row index and col is a valid column index in
	 * grid.
	 * row and col do not specify the element in the last row and last column of
	 * grid.
	 */
	public int sumPath(int row, int col) {
		int sum = grid[row][col];
		Location loc = getNextLoc(row, col);

		while (loc != null) {
			sum += grid[loc.getRow()][loc.getCol()];

			if (loc.getRow() < grid.length - 1 ||
					loc.getCol() < grid[0].length - 1)
				loc = getNextLoc(loc.getRow(), loc.getCol());
			else
				loc = null;
		}

		return sum;
	}

	public String toString() {
		String s = "";
		for (int[] r : grid) {
			for (int t : r) {
				s = s + t + " ";
			}
			s = s + "\n";
		}
		return s;
	}

}
