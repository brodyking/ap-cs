//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];	
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;
	}


	/* I AM LIVID THIS WAS SO GOOD
	public void sort() {
		for (int i = 0; i < myMonsters.length;i++) {
				if (i != 0) {
					if (myMonsters[i].getHeight() < myMonsters[i-1].getHeight()) {
						Monster firstbefore = myMonsters[i-1];
						myMonsters[i-1] = myMonsters[i];
						myMonsters[i] = firstbefore;
						
						i = 0;
						continue;
					}
				}
			}	
		}
	*/

	public Monster getLargest( )
	{
		Arrays.sort(myMonsters);	
		return myMonsters[myMonsters.length-1];
	}

	public Monster getSmallest( )
	{
		Arrays.sort(myMonsters);
		return myMonsters[0];
	}

	public String toString()
	{
		//return the array as a string
			
		return Arrays.toString(myMonsters); 
	}
}