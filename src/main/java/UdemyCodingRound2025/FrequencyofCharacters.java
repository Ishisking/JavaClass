package UdemyCodingRound2025;

import java.util.HashMap;

public class FrequencyofCharacters {

	public static void main(String[] args) {
		String input = "hello";
		char inputArray[] = input.toCharArray();
		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (char c : inputArray) {
			frequency.put(c, frequency.getOrDefault(c, 0) + 1);
		}
		for (char r : frequency.keySet()) {
			System.out.println(r + " " + frequency.get(r));

		}
	}

}
