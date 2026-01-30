package LogicBuildingPractice;

public class ReverseInterger {

	public static void main(String[] args) {
		int number = 2147483647, reverseno = 0; // Declaration & Initialization
		int lastdigit; // Declaration
		System.out.println("Number Before Reversing is : " + number);
		while (number != 0) {
			lastdigit = number % 10;
// check for overflow--Integer number has overflown the max int limit then o/p is 0
			if (reverseno > Integer.MAX_VALUE / 10 || (reverseno == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
				System.out.println(0);
				System.exit(0);
			} //if integer underflows the min int limit then o/p will be 0
			if (reverseno < Integer.MIN_VALUE / 10 || (reverseno == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
				System.out.println(0);
				System.exit(0);// Underflow, return 0
			}
			reverseno = reverseno * 10 + lastdigit;
			number = number / 10;
		}
		System.out.println("Number After Reversing is : " + reverseno);
	}

}
