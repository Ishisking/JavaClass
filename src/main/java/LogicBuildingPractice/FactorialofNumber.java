package LogicBuildingPractice;

public class FactorialofNumber {

	public static void main(String[] args) {
		int n = 15;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println("The Factorial of n = " + n + " is : " + result);
	}

}
