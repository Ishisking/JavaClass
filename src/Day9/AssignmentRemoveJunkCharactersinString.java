package Day9;

public class AssignmentRemoveJunkCharactersinString 
{
public static void main(String[] args) 
{	        // Input string with junk or special characters
	        String input = "H#ell@o$ W%or^ld& ***2024**!";

	        // Regular expression to retain only alphanumeric characters and spaces
	        String cleanedString = input.replaceAll("[^a-zA-Z0-9\\s]", "");

	        // Output the cleaned string
	        System.out.println("Original String: " + input);
	        System.out.println("Cleaned String: " + cleanedString);


}

}
