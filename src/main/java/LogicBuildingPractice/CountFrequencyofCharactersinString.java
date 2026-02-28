package LogicBuildingPractice;

import java.util.HashMap;

public class CountFrequencyofCharactersinString {

	public static void main(String[] args) {
		String input = "batteries";
		char inputArray[] = input.toCharArray();
HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
//traverse this char Array
			for (char character : inputArray) {
frequencyMap.put(character, frequencyMap.getOrDefault(character, 0)+1);
			}
			for(char c:frequencyMap.keySet()) {
				System.out.println(c + "  "+frequencyMap.get(c));
			}

	}

}
