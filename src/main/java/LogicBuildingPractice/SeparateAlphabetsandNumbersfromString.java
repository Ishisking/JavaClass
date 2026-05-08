package LogicBuildingPractice;

public class SeparateAlphabetsandNumbersfromString {
	public static void main(String[] args) {
		String input = "Ra123j";
		char[] inputArray = input.toCharArray();
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		for (char currentChar : inputArray) {
			if (Character.isAlphabetic(currentChar)) {
				alphabets.append(currentChar);
			} else if (Character.isDigit(currentChar)) {
				numbers.append(currentChar);
			}
		}
		System.out.println("Alphabets :" + alphabets);
		System.out.println("Numbers :" + numbers);
	}
}
