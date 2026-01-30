package LogicBuildingPractice;

public class SecondLargestNoinArrayVIMP {

	public static void main(String[] args) {
		int a[] = { 1, 3, 7, 4, 6, 5 };
		int largestNo = Integer.MIN_VALUE;
		int secondLargestNo = Integer.MIN_VALUE;
		for (int Num : a) {
			if (Num > largestNo) {
				secondLargestNo = largestNo;
				largestNo = Num;
			} else if (Num > secondLargestNo && Num != largestNo) {
				secondLargestNo = Num;
			}
		}
System.out.println("Largest Number :" + largestNo +"  "+"Second Largest Number : " + secondLargestNo);

	}

}
