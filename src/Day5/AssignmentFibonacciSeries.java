package Day5;
import java.util.Scanner;
public class AssignmentFibonacciSeries
{
public static void main(String[] args) 
{	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for the number of terms
	        System.out.print("Enter the number of terms for the Fibonacci series: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Please enter a positive number.");
	        } else {
	            System.out.println("Fibonacci series up to " + n + " terms:");
	            generateFibonacci(n);
	        }

	        scanner.close();
	    }

	    public static void generateFibonacci(int n) {
	        int first = 0, second = 1;

	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            // Calculate the next term
	            int next = first + second;
	            // Update variables
	            first = second;
	            second = next;
	        }
	    }
	


}


