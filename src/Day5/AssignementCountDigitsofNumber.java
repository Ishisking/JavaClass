package Day5;
import java.util.Scanner;
public class AssignementCountDigitsofNumber {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Input from the user
		        System.out.print("Enter a number to count its digits: ");
		        int number = scanner.nextInt();
		        // Ensure the number is positive
		        if (number < 0) {
		            number = Math.abs(number);
		        }  // Logic to count digits
		        int count = 0;
		        int tempNumber = number;
		        if (tempNumber == 0) {
		            count = 1; // Special case when number is 0
		        } else {
		        	  while (tempNumber > 0) {
		                  tempNumber = tempNumber / 10; // Remove the last digit
		                  count++;                     // Increment the count
		              }
		          }

		          // Output the result
		          System.out.println("The number " + number + " has " + count + " digits.");

		          scanner.close();
	}

}
