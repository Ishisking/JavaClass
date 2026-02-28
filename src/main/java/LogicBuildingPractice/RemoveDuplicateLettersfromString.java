package LogicBuildingPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersfromString {

	public static void main(String[] args) {
		String input = "Java";
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		char inputCharArray[] = input.toCharArray();
		// String result="";
		StringBuilder sb = new StringBuilder();
		for (char character : inputCharArray) {
		//	System.out.println(character);
			if (linkedHashSet.add(character)) {
				// result=result+character; //j //ja //jav
				sb.append(character);
			}
		}
		System.out.println(sb);
	}
}
