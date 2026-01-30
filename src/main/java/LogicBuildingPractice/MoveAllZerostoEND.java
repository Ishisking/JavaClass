package LogicBuildingPractice;

public class MoveAllZerostoEND {

	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 0, 3, 0, 4, 0, 0 };
		int current = 0, putnonzerovalue = 0;
		for (current = 0; current < a.length; current++) {
			if (a[current] != 0) {
				int temp = a[putnonzerovalue];
				a[putnonzerovalue] = a[current];
				a[current] = temp;
				putnonzerovalue++;
			}
		}
		for (int c : a) {
			System.out.print(c);
		}
	}

}
