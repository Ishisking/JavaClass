package Day9;
import java.util.Scanner;
public class AssignementCountWordsinaString 
{	public static void main(String[] args) 
{	Scanner sc=new Scanner(System.in);
System.out.println("Enter the String to Count");
String input = sc.nextLine();
//Trim the string to remove extra spaces at the beginning and end
// Split the string into words using whitespace as a delimiter
String[] words = input.trim().split("\\s+");

// Count the number of words
int wordCount = words.length;

// Print the result
System.out.println("The number of words in the string is: " + wordCount);

// Close the scanner
sc.close();
	
	
	
	
	
	

}

}
