//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		setWord("");
	}

	public BoxWord(String s)
	{
		setWord(s);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String makeBox() {
		String output = "";
		// Top Full Word
		output += word + "\n";		
   		StringBuffer s = new StringBuffer(word);

		// Middle Section
		for (int i = 1; i < (word.length() -1); i++) {
			// First Letter
			output += word.charAt(i);
			
			// Spaces
			for (int y = word.length()-2; y > 0; y--) {
				output += " ";
			}

			output += word.charAt((word.length()-1)-i) + "\n";
		}

		// Bottom Reverse Full Word
		output += s.reverse();
		return output;
	}

	public String toString()
	{
		String output="" + makeBox();
		return output+"\n";
	}
}