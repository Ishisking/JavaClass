package UdemyCodingRound2025;

import java.util.LinkedHashSet;

public class UniqueSubString {

	public static void main(String[] args) {
		String input = "abbacdaabefghg";
		StringBuilder sb = new StringBuilder();
		LinkedHashSet<Character> Set = new LinkedHashSet<Character>();
		char inputArray[] = input.toCharArray();
		for (char character : inputArray) {
			if (Set.add(character)) {
				sb.append(character);
			}
		}

		System.out.println(sb);
	}

}
