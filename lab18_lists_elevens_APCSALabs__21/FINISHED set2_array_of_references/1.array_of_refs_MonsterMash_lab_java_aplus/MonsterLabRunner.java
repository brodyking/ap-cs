//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
			out.println("Enter the height, weight and age of monster " + i);
			//ask for ht
			out.print("Height: ");
			int height = keyboard.nextInt();
			//ask for wt
			out.print("Weight: ");
			int weight = keyboard.nextInt();
			//ask for age
			out.print("Age: ");
			int age = keyboard.nextInt();
	
			//instantiate a new Monster() and add it to the herd			
			herd.add(i,new Monster(height,weight,age));
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats (smallest and largest)
		System.out.println("SMALLEST :: " + herd.getSmallest() + "\n");
		System.out.println("LARGEST :: " + herd.getLargest() + "\n");
		//print out the herd again
		System.out.println("HERD :: "+herd+"\n");
			
	}		
}