package practice1;

public class Arraydemo {

	public static void main(String[] args) {
		int b[][] = {{10,20}, {30,40}}; //new int[2][2];
		//b[][]= {10,20},{30,40};
		for (int rowIndex = 0; rowIndex <= 1; rowIndex++) {
			for (int colIndex = 0; colIndex <= 1; colIndex++) {
				System.out.println(rowIndex + " " + colIndex+"  :"+b[rowIndex][colIndex]);
			}
		}
	}

}
