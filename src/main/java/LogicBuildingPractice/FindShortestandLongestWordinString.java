package LogicBuildingPractice;

public class FindShortestandLongestWordinString {

	public static void main(String[] args) {
		String input = "I Love Cricket and Football";
		String[] words = input.split(" ");
		String shortestWord = words[0];
		String longestWord = words[0];
		for (String word : words) {
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			} else if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Shortest String :" + shortestWord);
		System.out.println("Longest String :" + longestWord);
	}

}
