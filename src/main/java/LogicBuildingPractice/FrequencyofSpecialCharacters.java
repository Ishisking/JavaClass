package LogicBuildingPractice;

import java.util.HashMap;

public class FrequencyofSpecialCharacters {

	public static void main(String[] args) {
		String s = "abc#@$##$$$$&";
HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
		char inputArray[] = s.toCharArray();
		for (char c : inputArray) {
if (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' ')) {
				if (frequency.containsKey(c)) {
					frequency.put(c, frequency.get(c) + 1);
				} else {
					frequency.put(c, 1);
				}
			}
		}
		System.out.println(frequency);

	}

}
