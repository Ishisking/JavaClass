package LogicBuildingPractice;

import java.util.HashMap;
import java.util.Map;

public class SecondMostCharacterOccurrence {

	public static void main(String[] args) {
		String input = "abbcccdddd";
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			hMap.put(c, hMap.getOrDefault(c, 0) + 1);
		}
		System.out.println(hMap);
		for (char x : hMap.keySet()) {
			System.out.println(x + " " + hMap.get(x));
		}
		System.out.println("************************************************************************");
		// 2) Find Second Most Frequent Character
		for (Map.Entry<Character, Integer> entrySet : hMap.entrySet()) {
			System.out.println(entrySet.getValue());
		}
		int firstMaxFrequency = 0;
		int secondMaxFrequency = 0;
		for (Map.Entry<Character, Integer> entryset : hMap.entrySet()) {
			int currentFrequency = entryset.getValue();
			if (currentFrequency > firstMaxFrequency) {
				secondMaxFrequency = firstMaxFrequency;
				firstMaxFrequency = currentFrequency;
			}
			if (currentFrequency > secondMaxFrequency && currentFrequency < firstMaxFrequency) {
				secondMaxFrequency = currentFrequency;
			}
		}
		System.out.println("Second Max Frequency is :" + secondMaxFrequency);
	}
}
