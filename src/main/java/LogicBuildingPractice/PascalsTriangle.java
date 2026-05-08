package LogicBuildingPractice;

public class PascalsTriangle {

	public static void main(String[] args) {
		int limit = 5;
		for (int row = 1; row <= limit; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println("");
		}
//		for (int row = 1; row <= limit; row++) {
//			for (int col = 1; col <= row; col++) {
//				System.out.print((char) ('a' + col - 1));
//			}
//			System.out.println("");
//		}
	}

}
