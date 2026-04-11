package UdemyCodingRound2025;

public class MaxProductofTripletsSolution2 {
	public static void main(String[] args) {
		int a[] = { 7, 3, 2, 5, -10, -20 };
		int max1 = 0, max2 = 0, max3 = 0;
		int min1 = 100, min2 = 100;
		for (int num : a) {
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}
			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min2 = num;
			}
		}
		int productOne = max1 * max2 * max3;
		int productTwo = min1 * min2 * max1;
		System.out.println("ResultOne : " + productOne);
		System.out.println("ResultTwo : " + productTwo);
		System.out.println("Max Product of Triplets is : " + Math.max(productOne, productTwo));
	}

}
