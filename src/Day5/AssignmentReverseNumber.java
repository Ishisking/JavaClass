package Day5;
import java.util.Scanner;
public class AssignmentReverseNumber
{	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Input from the user
	        System.out.print("Enter a number to reverse: ");
	        int number = scanner.nextInt();

	        int reversed = 0;

	        // Logic to reverse the number
	        while (number != 0) {
	            int digit = number % 10;  // Extract the last digit
	            reversed = reversed * 10 + digit; // Append it to the reversed number
	            number = number / 10;  // Remove the last digit
	        } // Output the reversed number
	        System.out.println("Reversed Number: " + reversed);
	        scanner.close();
	}

}
