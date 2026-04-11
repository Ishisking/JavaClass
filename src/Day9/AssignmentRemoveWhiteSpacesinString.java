package Day9;

public class AssignmentRemoveWhiteSpacesinString
{	public static void main(String[] args) 
{
	        // Input string with white spaces
	        String input = "Java  Programming  is   Fun!";

	        // Removing all white spaces using replaceAll
	        String stringWithoutSpaces = input.replaceAll("\\s", "");

	        // Output the results
	        System.out.println("Original String: " + input);
	        System.out.println("String Without Spaces: " + stringWithoutSpaces);
	
}

}
