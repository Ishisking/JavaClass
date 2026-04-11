package Day5;
import java.util.Scanner;
public class AssignmentPallindrome {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Input from the user
		        System.out.print("Enter a number to check if it is a palindrome: ");
		        int number = scanner.nextInt();
		        // Store the original number for comparison
		        int originalNumber = number;
		        int reversedNumber = 0;
		        // Reverse the number
		        while (number != 0) {
		            int digit = number % 10;           // Extract the last digit
		            reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber
		            number/=10;              // Remove the last digit
		        }    // Check if the original number and reversed number are the same
		        if (originalNumber == reversedNumber) {
		            System.out.println(originalNumber + " is a Palindrome number.");
		        } else {
		            System.out.println(originalNumber + " is not a Palindrome number.");
		        }
		        scanner.close();
		    }
	}
