//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Dog implements Comparable<Dog>
{
    private int age;
    private String name;
    
    public Dog(int a, String n) 
    {
    	age = a;
    	name = n;
    } 
    	 
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    
    public int compareTo(Dog other)
    {
      if (age == other.getAge()) {
        return 0;
      }
      else if (age > other.getAge()) {
        return 1;
      } else {
        return -1;
      }
    }
    	    	
    public String toString()
    {
    	return "" + age + " " + name;
    }  
}