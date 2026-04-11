package UdemyCodingRound2025;

import java.util.Arrays;

public class ReverseCharactersinString {

	public static void main(String[] args) {
		String input = "This is fun";
		String words[] = input.split(" ");
		String result = "";
		for (String word : words) {
			char character[] = word.toCharArray();
			int left = 0, right = character.length - 1;
			while (left < right) {
				char temp = character[left];
				character[left] = character[right];
				character[right] = temp;
				left++;
				right--;
			}
			result = result + new String(character) + " ";

		}
		System.out.println(input);
		System.out.println(result.trim());

	}

}
