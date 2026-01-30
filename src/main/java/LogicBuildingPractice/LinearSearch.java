package LogicBuildingPractice;

public class LinearSearch {

	public static void main(String[] args) {
		int inputArray[] = { 10, 20, 30, 45, 50, 55, 61, 40, 88, 90, 95 };
		int key =40;
		boolean ispresent = false;
		for (int number : inputArray) {
			if (number == key) {
				ispresent = true;
				break;
			}
		}
		if (ispresent) {
			System.out.println("Element found in the Array");
		} else {
			System.out.println("Element not found");
		}
	}

}
