package Day5;
import java.util.Scanner;
public class AssignmentSumofDigits 
{

	public static void main(String[] args) 
{
		        Scanner scanner = new Scanner(System.in);

		        // Input: Number from user
		        System.out.print("Enter a number: ");
		        long number = scanner.nextLong();

		        int sum = 0;

		        // Calculate the sum of digits
		        while (number != 0) {
		            int digit = (int) Math.abs(number % 10); // Extract the last digit
		            sum += digit; // Add digit to sum
		            number /= 10; // Remove the last digit
		        }

		        // Output: Sum of digits
		        System.out.println("Sum of digits: " + sum);

		        scanner.close();
		  	}

}
