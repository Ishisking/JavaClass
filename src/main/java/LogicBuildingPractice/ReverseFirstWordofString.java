package LogicBuildingPractice;

import java.util.Arrays;

public class ReverseFirstWordofString {

	public static void main(String[] args) {
		String input = "Hello world from Ishaan!!";
		reverseFirstWord(input);

	}

	private static void reverseFirstWord(String input) {
		if (input == null || input.isEmpty()) {
			System.out.println("String Reverse Not Possible");
		} else {
			String words[] = input.split(" ", 2);
			char charArray[] = words[0].toCharArray();
			System.out.println(Arrays.toString(charArray));
			int left = 0, right = charArray.length - 1;
			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(charArray));
			String reversedFirstWord = new String(charArray);
			System.out.println(reversedFirstWord + " " + words[1]);
		}

	}
}
