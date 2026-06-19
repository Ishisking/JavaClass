package LogicBuildingPractice;

import java.util.Arrays;

public class MinimumCharacterReplacementinaString {

	public static void main(String[] args) {
		String data[] = { "ab", "aab", "abb", "abab", "abaaaba" };
		int result[] = new int[data.length];
		for (int w = 0; w < data.length; w++) {
			String input = data[w];
			int count = 0;
			int index = 1;
			while (index < input.length()) {
				if (input.charAt(index) == input.charAt(index - 1)) {
					count++;
					index = index + 2;
				} else {
					index++;
				}
			}
			result[w] = count;
		}
		System.out.println(Arrays.toString(result));
	}
}
