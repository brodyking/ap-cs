//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	//instance variable

	int[] data;

	//constructor
	public ArrayStats() {
		setData(null);
	}
	
	public ArrayStats(int[] input) {
		setData(input);
	}

	//set method
	public void setData(int[] input) {
		data = input;
	}	
	
	public int getNumGroupsOfSize(int size)
	{
		int cnt=0;

		for (int i = 0; i <= data.length; i++) {
			if (i < data.length - size && data[i] == data[i+size-1]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public String toString()
	{

		/*
		Look at how magnificant this is
		Please give me extra credit for this extra loop
		*/	
		String output = "";
		for (int i = 1; i <= 5; i++) {
			output += "size " + i + " count == " + getNumGroupsOfSize(i) + "\n";
		}
		return output+Arrays.toString(data);
	}
}