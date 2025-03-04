//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA,quadB,quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootTwo = (-b + Math.sqrt((b*b)-4.0*a*c))/(2.0*a);
		rootOne = (-b - Math.sqrt((b*b)-4.0*a*c))/(2.0*a);
	}

	public void print( )
	{
		System.out.println("Root One: " + rootOne + "\n" + "Root Two: " + rootTwo);
	}
}