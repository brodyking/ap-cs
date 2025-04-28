import java.util.*;

public class WordChecker {
	/** Initialized in the constructor and contains no null elements */
	private ArrayList<String> wordList;

	public WordChecker(String s) {
		wordList = new ArrayList<String>(Arrays.asList(s.split(" ")));
	}

	/**
	 * Returns true if each element of wordList ?except the first? contains the
	 * previous
	 * element as a substring and returns false otherwise, as described in part ?a?
	 * Precondition: wordList contains at least two elements.
	 * Postcondition: wordList is unchanged.
	 */
	public boolean isWordChain() {
		/* to be implemented in part (a) */
		String old = wordList.get(1);
		for (int i = 2; i < wordList.size(); i++) {
			if (wordList.get(i).indexOf(old) != -1) {
				old = wordList.get(i);
			} else {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns an ArrayList<String> based on strings from wordList that start
	 * with target, as described in part (a). Each element of the returned ArrayList
	 * has had
	 * the initial occurrence of target removed.
	 * Postconditions: wordList is unchanged.
	 * Items appear in the returned list in the same order as they appear in
	 * wordList.
	 */
	public ArrayList<String> createList(String target) {
		/* to be implemented in part (b) */
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).indexOf(target) == 0) {
				output.add(wordList.get(i).substring(target.length()));
			}
		}
		return output;
	}

	public String toString() {
		return "" + wordList;
	}

}
