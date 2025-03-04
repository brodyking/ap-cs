//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Deck 
{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   public Deck() 
   {
    	cards = new ArrayList<Card>();
    	top = NUMCARDS - 1;
    	
    	for( String suit : SUITS )
    	{
    		for( int i = 1; i < 14; i++ )
    		{
    			cards.add( new TwentyOneCard( suit, i ) );
    		}
    	}
   }
   
   public Card dealCard()
   {
   	return cards.get( top-- );
   }
    
    
   public void shuffle()
   {
   	Collections.shuffle( cards );
   	top = NUMCARDS - 1;
   }
    
}