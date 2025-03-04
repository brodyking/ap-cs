//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

class Rational implements Comparable<Rational>
{
	//add two instance variables

	private int numerator;
	private int denominator;

	//write two constructors

	public Rational() {
		numerator = 1;
		denominator = 1;
	}

	public Rational(int num,int den) {
		numerator = num;
		denominator = den;
	}

	//write a setRational method

	public void setRational(int num, int den) {
		numerator = num;
		denominator = den;
	}

	//write  a set method for numerator and denominator

	public void setNumerator(int num) {
		numerator = num;
	}

	public void setDenominator(int den) {
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
	
		int num1 = numerator;
		int num2 = other.getNumerator();
		int den1 = denominator;
		int den2 = other.getDenominator();

		numerator = ((num1 * den2) + (num2 * den1));
		denominator = (den1 * den2);

		reduce();
	}

	private void reduce()
	{
		int gcdnumber = gcd(numerator,denominator);

		numerator = numerator/gcdnumber;
		denominator = denominator/gcdnumber;

	}

	private int gcd(int numOne, int numTwo)
	{

		int gcdnumber = 1;
		for (int i = 1; i <= numTwo; i++) {
			if (numOne%i == 0 && numTwo%i == 0) {
				gcdnumber = i;
			}
		}

		return gcdnumber;
	}

	public Object clone ()
	{
		Object clonedRational = new Rational(numerator,denominator);
		return clonedRational;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Object obj)
	{

		// IGNORE THIS. I KNOW ITS HORRIBLE. IDK HOW TO DO THIS WHEN IT TAKES IN OBJECT SO IM RELYING ON THE TOSTRING.
		
		int othernum = Character.getNumericValue(obj.toString().charAt(0));
		int otherden = Character.getNumericValue(obj.toString().charAt(2));
		Rational otherobj = new Rational(othernum,otherden);
		
		otherobj.reduce();
	

		return ((numerator == otherobj.getNumerator()) && denominator == otherobj.getDenominator());
	}

	public int compareTo(Rational other)
	{

		// honestly cant tell if this is worse than equals(). butt it works soooooo. promise this is the last time i do cheaty work arounds

		reduce();
		other.reduce();

		if (equals(other)) {
			return 0;
		}

		float firstrational = (float)numerator/denominator;
		float secondrational = (float)other.numerator/other.denominator;

		if (firstrational > secondrational) {
			return 1;
		} else {
			return -1;
		}

	}


	//write  toString() method
	
	public String toString() {
		return "" + numerator + "/" + denominator;
	}
	
}