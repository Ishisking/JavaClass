package LogicBuildingPractice;

import java.math.BigInteger;

public class FactorialofBigInteger {

	public static void main(String[] args) {
		int n = 55;
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The Factorial of n = " + n + " is : " + result);
	}
}
