//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TwentyOneCard extends Card
{

	//add in an instance variable for value
	
	private String suit;
	private int face;

	//create a constructor that receives a suit and a face


	public TwentyOneCard(String s, int f) 
  	{
		super(s,f);
  	}
	
	//make a getValue() method that returns the worth of the card
	//based on the rules of BlackJack
	//Ace is worth 11 for now
	//Jack, Queen, and King are all worth 10
		//all other cards are face value
		
		//make a toString method
	
	public int getValue() {
		int face = super.getFace();
		switch (face) {
			case 1:
				return 11;
			case 11:
				return 10;
			case 12:
				return 10;
			case 13:
				return 10;
			default:
				return face;
		}
	}

	public String toString() {
		return super.toString() + " " + getValue();
	}
		
}