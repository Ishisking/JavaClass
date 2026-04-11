package Day5;
import java.util.Scanner;
public class AssignementEvenOddCount
{

	public static void main(String[] args)
{
		Scanner scanner = new Scanner(System.in);
		        // Input: Number from user
		        System.out.print("Enter a number: ");
		        long number = scanner.nextLong();
System.out.print("   ");
		        int evenCount = 0, oddCount = 0;

		        // Process each digit
		        while (number != 0) {
		            int digit = (int) Math.abs(number % 10); // Extract the last digit
		            if (digit % 2 == 0) {
		                evenCount++; // Increment even count
		            } else {
		                oddCount++; // Increment odd count
		            }
		            number /= 10; // Remove the last digit
		        }

		        // Output: Even and odd counts
		        System.out.println("Number of even digits: " + evenCount);
		        System.out.println("Number of odd digits: " + oddCount);

		        scanner.close();
}

}
