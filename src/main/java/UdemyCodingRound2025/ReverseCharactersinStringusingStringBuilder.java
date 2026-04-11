package UdemyCodingRound2025;

import java.util.Arrays;

public class ReverseCharactersinStringusingStringBuilder {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String input = "This is fun";
		String words[] = input.split(" ");

		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder(word);
			result.append(reverseWord.reverse().append(" "));
		}
		System.out.println(input);
		System.out.println(result.toString().trim());

	}

}
