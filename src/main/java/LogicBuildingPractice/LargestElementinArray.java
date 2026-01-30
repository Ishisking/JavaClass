package LogicBuildingPractice;

public class LargestElementinArray {

	public static void main(String[] args) {
		int input[] = { 10, 99, 30, 40, 60, 50, -67, 9, 66, 5, 63 };
		int largest = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] > largest) {
				largest = input[index];
			} 
		}
		System.out.println(largest+" : is the Largest Number in the Array");
	}

}
