package UdemyCodingRound2025;

public class DecodeString {

	public static void main(String[] args) {
		String input = "d3m4t2b0a1";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i = i + 2) {
			char letter = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i + 1));
			for (int j = 0; j < count; j++) {
				result.append(letter);
			}
		}
		System.out.println(result);
	}

}
