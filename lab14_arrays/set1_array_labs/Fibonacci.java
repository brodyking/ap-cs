//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Fibonacci
{
	//instance variable
	private int max;

	//constructors
	
	public Fibonacci() {
		
	}

	//set method

	public void setMax(int tempMax) {
		max = tempMax;
	}

	//get method

	public int getMax() {
		return max;
	}

	//make list
	
	public int[] makeList() {
		int[] fib = new int[max];

		if (max != 0) {
			fib[0] = 1;
		}
		if (max != 1) {
			fib[1] = 1;
		}
		if (max != 1) {
			for (int i = 2; i < max; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}

		return fib;
	}

	// get item in list

	public int getItem(int position) {
		int[] fib = makeList(); 
		/*
		 * 	I know this is very bad practice making a new list everytime,
		 *  but guess what.. i dont care!!! we basically have supercomputers in our pockets
		 *  now. this wouldnt be a problem for any modern device lol
		 */
		if (position > max) {
			return -1;
		}
		return fib[position-1];
	}

	//toString


}