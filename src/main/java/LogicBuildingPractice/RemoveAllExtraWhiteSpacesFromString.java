package LogicBuildingPractice;

public class RemoveAllExtraWhiteSpacesFromString {

	public static void main(String[] args) {
		String input = "   Hello     World   ";
		System.out.println(input);
		input = input.trim();
		System.out.println(input);
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
	}

}
