//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int size;
		String name;
		
		//ask for name and size of 1st monster
		System.out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster one
		Monster mOne = new Monster(name, size);
		
		//ask for name and size of second monster
		System.out.print("Enter 2st monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 2st monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster one
		Monster mTwo = new Monster(name, size);
		
		
		//determine which monster is bigger
	
		if (mOne.isBigger(mTwo)) {
			System.out.println(mOne.getName() + " is bigger than " + mTwo.getName());
		} else if (mTwo.isBigger(mOne)) {
			System.out.println(mTwo.getName() + " is bigger than " + mOne.getName());
		} else {
			System.out.println(mTwo.getName() + " is the same as as " + mOne.getName());
		}
		
		//determine if the monsters' names are the same

		if (mOne.namesTheSame(mTwo)) {
			System.out.println(mOne.getName() + " has the same name as " + mTwo.getName());
		} else {
			System.out.println(mOne.getName() + "does not have the same name as " + mTwo.getName());
		}


	}
}