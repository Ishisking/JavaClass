package LogicBuildingPractice;

public class ReverseanArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40 };
		for (int number : input) {
			System.out.print(number + " ");
		}
		int j = 0;
		int reverseinput[] = new int[input.length];
		for (int index = input.length - 1; index >= 0; index--) {
			reverseinput[j] = input[index];
			j++;
		}
		System.out.println();
		System.out.println("Reverse of input Array is ");
		input = reverseinput;
		for (int number : input) {
			System.out.print(number + " ");
		}
	}
}
