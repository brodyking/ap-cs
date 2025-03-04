//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void add(int spot, int age, String name)
	{
		//add a new Dog to the array at spot 
		//make sure spot is in bounds
		if (spot < pups.length) {
			pups[spot] = new Dog(age,name);
		}
	}

	public String getNameOfOldest()
	{
		Arrays.sort(pups);
		return pups[pups.length-1].toString();
	}

	public String getNameOfYoungest()
	{
		Arrays.sort(pups);
		return pups[0].toString();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}