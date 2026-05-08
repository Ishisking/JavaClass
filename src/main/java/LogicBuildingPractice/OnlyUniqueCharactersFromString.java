package LogicBuildingPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OnlyUniqueCharactersFromString {

	public static void main(String[] args) {
		String input = "Programming";
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		for (char currentCharacter : input.toCharArray()) {
			hmap.put(currentCharacter, hmap.getOrDefault(currentCharacter, 0) + 1);

		}
		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}

	}

}
