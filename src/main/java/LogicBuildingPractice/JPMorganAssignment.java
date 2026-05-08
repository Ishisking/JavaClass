package LogicBuildingPractice;

import java.util.Arrays;

public class JPMorganAssignment {

	public static void main(String[] args) {
		int input[] = { 1, 3, 0, 4, 5, 0, 2, 0 };
		int index = 0;
		System.out.println(Arrays.toString(input));
		for (int number : input) {
			if (number != 0) {
				input[index] = number;
				index++;
			}
		}
		for (int i = index; i < input.length; i++) {
			input[i] = 0;
		}
		Arrays.sort(input, 0, index);
		System.out.println(index);
		System.out.println(Arrays.toString(input));
	}

}
