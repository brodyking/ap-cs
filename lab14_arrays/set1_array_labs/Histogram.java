//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class - 
//Lab  - 


/*
 * TODO:
 * this has a fixed size of 10.
 * ask steinmeyerl ol
 */

import java.util.Arrays;
import java.util.Scanner;

public class Histogram
{
	//add and int[] array instance variable
	private int[] numsList = new int[10];

	//constructor
	public Histogram() {
		setNums(null);
	}

	public Histogram(int[] given) {
		setNums(given);
	}

	//set method
	public void setNums(int[] givenCount) {
		numsList = givenCount; 
	}

	//toString method
	public String toString() {

		int[] numCount = {0,0,0,0,0,0,0,0,0,0};
		String output = "";

		output += "Given: " + Arrays.toString(numsList) + "\n";

		// numsList has the numbers given from the user

		for (int i : numsList) {
			numCount[i] += 1;
		}

		for (int i = 0; i < numCount.length; i++) {
			output += i + " - " + numCount[i] + "\n";
		}

		return output;

	}

}