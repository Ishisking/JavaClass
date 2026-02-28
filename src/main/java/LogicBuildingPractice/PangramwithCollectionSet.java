package LogicBuildingPractice;

import java.util.HashSet;

public class PangramwithCollectionSet {

	public static void main(String[] args) {
		String input = "The quick brown FOX jumps over the lazy dog";
		input = input.toLowerCase();
		System.out.println(input);
		boolean result = checkpangram(input);
		if (result) {
			System.out.println("The String is a Pangram");
		} else {
			System.out.println("IT'S NOT A PANGRAM ");
		}
	}

	private static boolean checkpangram(String input) {
		HashSet<Character> characterSet = new HashSet<Character>();

		char inputChar[] = input.toCharArray();

		for (char c : inputChar) {
			if (Character.isLetterOrDigit(c)) {
				characterSet.add(c);
			}
		}
		if (characterSet.size() == 26) {
			return true;
		}
		return false;
	}

}
