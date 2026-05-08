package LogicBuildingPractice;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulation {

	public static void main(String[] args) {
		String input = "a1b2c3";
		System.out.println(input);
		List<Character> list = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				list.add(c);
			}
		}
		int index = list.size() - 1;
		System.out.println(index);
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(list.get(index));
				index--;
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
