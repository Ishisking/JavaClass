package LogicBuildingPractice;

public class CountVowelsinString {

	public static void main(String[] args) {
		String input = "Hello World";
		String vowelString = "aeiouAEIOU";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (vowelString.indexOf(input.charAt(index)) != -1) {
				count++;
			}
		}
		System.out.println("Total number of vowels are : " + count);
	}

}
