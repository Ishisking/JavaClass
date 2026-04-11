package Day9;
import java.util.Scanner;
public class CharacterOccurrences 
{
public static void main(String[] args) 
{		        // Create a Scanner for user input
		        Scanner sc = new Scanner(System.in);

		        // Input the string
		        System.out.println("Enter a string:");
		        String input = sc.nextLine();

		        // Input the character1 to count
		        System.out.println("Enter the character1 to count:");
		        char characterToCount1 = sc.next().charAt(0);
		     // Input the character2 to count
		        System.out.println("Enter the character2 to count:");
		        char characterToCount2 = sc.next().charAt(0);
		     // Input the character3 to count
		        System.out.println("Enter the character3 to count:");
		        char characterToCount3 = sc.next().charAt(0);
		        // Initialize the count variable
		        int count1 = 0;
		        int count2=0;
		        int count3=0;

		        // Iterate through the string and count occurrences
		        for (int i = 0; i < input.length(); i++) {
		            if (input.charAt(i) == characterToCount1) {
		                count1++;
		            }else if(input.charAt(i) == characterToCount2) {
		                count2++;
		            } else if(input.charAt(i) == characterToCount3) {
		                count3++;   
		        } } // Print the result
		        System.out.println("The character '" + characterToCount1 + "' occurs " + count1 + " times in the string.");
		        System.out.println("The character '" + characterToCount2 + "' occurs " + count2 + " times in the string.");
		        System.out.println("The character '" + characterToCount3 + "' occurs " + count3 + " times in the string.");
		        // Close the scanner
		        sc.close();
}

}
