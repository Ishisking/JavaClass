package LogicBuildingPractice;

public class LinearSearchIndex {

	public static void main(String[] args) {
		int inputArray[] = { 10, 20, 30, 40, 50, 55, 61, 40, 88, 90, 95 };
		int key = 88;
		boolean ispresent = false;
int position =-1;//index range 0 to n-1 if element found at 0 index then position=-1
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] == key) {
				ispresent = true;
				position=index;
				break;
			}
		}
		if (ispresent) {
			System.out.println("Element found in the Array on index no: "+position);
		} else {
			System.out.println("Element not found in the Array");
		}

	}

}
