package UdemyCodingRound2025;

import java.util.HashMap;

public class FrequencyofWordinString {

	public static void main(String[] args) {
		String input = "Learn java as java learning is as easy as to learn c";
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		String inputArray[] = input.split(" ");

		for (String c : inputArray) {
			result.put(c, result.getOrDefault(c, 0) + 1);
		}
		for (String r : result.keySet()) {
			System.out.println(r + " " + result.get(r));
		}

	}

}
