package LogicBuildingPractice;

public class ReverseanArray2 {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 50, 55 };
		for (int number : input) {
			System.out.print(number + " ");
		}
		System.out.println("");
		int left = 0;
		int right = input.length - 1;
		int temp;
		while (right > left) {
			temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			right--;
			left++;
		}
		System.out.println("After Reversing the Array will be :");
		for (int number : input) {
			System.out.print(number + " ");
		}

	}

}
