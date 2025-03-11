//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import info.gridworld.actor.Actor;

public class Number extends Actor
{
	private int number;
	private Color textColor;
	
	public Number(int num)
	{
		setColor(Color.YELLOW);
		number=num;
		textColor=Color.BLUE;
	}
	
	//add the remaining constructors
	
	
		
	
	//add set methods
	
	
	
	
	public String getText()
	{
		return ""+ number;
	}
	
	public Color getTextColor()
	{
		return textColor;
	}	
}