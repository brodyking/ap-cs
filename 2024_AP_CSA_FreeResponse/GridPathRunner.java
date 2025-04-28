public class GridPathRunner
{
	public static void main(String[] args) 
	{
		GridPath gp = new GridPath();
		System.out.println( gp );
		
		/*
		getNextLoc(0, 0)	 since 3 < 11
		getNextLoc(1, 3)	since 15 < 16
		getNextLoc(2, 4)	Returns the neighbor below 
		getNextLoc(4, 3)	Returns the neighbor to the right 		
		*/
		
		//System.out.println( gp.getNextLoc(0, 0) );
		//System.out.println( gp.getNextLoc(1, 3) );
		//System.out.println( gp.getNextLoc(2, 4) );
		//System.out.println( gp.getNextLoc(4, 3) );
		
		System.out.println( gp.sumPath(1,1) );	
	}
}