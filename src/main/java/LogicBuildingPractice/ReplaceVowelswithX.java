package LogicBuildingPractice;

public class ReplaceVowelswithX {

	public static void main(String[] args) {
		String input = "Some More SpeciaL";
		System.out.println(input);
		StringBuilder sb = new StringBuilder();
		input = input.toLowerCase();
		char[] inputArray = input.toCharArray();
		System.out.println(inputArray);
		for (char currentChar : inputArray) {
			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {
				sb.append('x');
			} else {
				sb.append(currentChar);
			}
		}
		System.out.println(sb);
	}

}
