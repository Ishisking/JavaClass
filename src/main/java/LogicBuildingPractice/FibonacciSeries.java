package LogicBuildingPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next, n = 10;
		System.out.print(first+" "+second+" ");
		for (int i = 2; i < n; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
		}

	}

}
