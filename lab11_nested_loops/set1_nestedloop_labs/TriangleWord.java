//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String makeTriangle()
	{
		String output = "";
		for (int i = 0; i < word.length(); i++) {
		
			// Spaces Before
			for (int y = word.length() - i; y > 0; y--) {
				output += " ";
			}

			// Character	
			if (i != word.length()-1)
			output += word.charAt(i);
			
			// Spaces In-between 

			if (i == 0) output += " ";

			if (i >= 1 && i != word.length()-1) {
				for (int z = 1; z < 2*i; z++) {
					output += " ";
				}
			}

	
			// Last Char
			if (i != 0 && i != word.length()-1) output += word.charAt(i) + "\n";
			if (i == 0) output += "\n";
		}  

		// Bottom Segment
			// Reverse Word
			for (int b = word.length()-1; b > 0; b--) {
				output += word.charAt(b);
			}
			output += word;

		return output;
	}

	public String toString()
	{
		String output=makeTriangle();
		return output+"\n";
	}
}