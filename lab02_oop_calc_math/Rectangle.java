/**
 * @(#)Rectangle.java
 *
 *
 * @author 
 * @version 1.00 2017/5/2
 */


public class Rectangle {
	int length;
	int width;
	int perimeter;
	
  	public void setLengthWidth(int len, int ht)
  	{
  		length = len;
  		width = ht;
  	}
  	
  	public void calculatePerimeter()
  	{
  		perimeter = (2*length) + (2*width);
  	}
    
    public void print()
    {
    	System.out.println("The perimeter is :: " + perimeter);
    }
}