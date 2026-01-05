package LogicBuildingPractice;

public class SwapofTwoNumbers1 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping a =" + a + " b = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a = " + a + "  b = " + b);

	}
}
