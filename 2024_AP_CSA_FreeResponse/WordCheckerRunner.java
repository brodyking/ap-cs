public class WordCheckerRunner
{
	public static void main(String[] args) 
	{
		WordChecker x = new WordChecker( "an band band abandon");
		/*System.out.println( x.isWordChain() );
		System.out.println( x );
		
		x = new WordChecker( "to too stool tools");
		System.out.println( x.isWordChain() );
		System.out.println( x );
		
		x = new WordChecker( "ROG FROG FROGGY THATFROGGY THATFROGGYFUN");
		System.out.println( x.isWordChain() );
		System.out.println( x );		
		
		x = new WordChecker( "APLUS");
		System.out.println( x.isWordChain() );
		System.out.println( x );  */
		
		/*
		Consider an example where wordList contains the following strings.
		["catch", "bobcat", "catchacat", "cat", "at"]
		
		The following table shows the ArrayList returned by some calls to createList. In all cases,
		wordList is unchanged.
		
		
		createList("cat")	["ch", "chacat", ""]	Only "catch", "catchacat", and "cat" begin with "cat".
		createList("catch")	["", "acat"]	Only "catch" and "catchacat" begin with "catch".
		createList("dog")	[]	None of the words in wordList begin with "dog".   */
		
		x = new WordChecker( "catch bobcat catchacat cat at");
		System.out.println( x.createList("cat") );
		System.out.println( x.createList("catch") );
		System.out.println( x.createList("dog") );
		//System.out.println( x );	
	}
}


/*
output

true
[an, band, band, abandon]
false
[to, too, stool, tools]
true
[ROG, FROG, FROGGY, THATFROGGY, THATFROGGYFUN]
true
[APLUS]

*/
