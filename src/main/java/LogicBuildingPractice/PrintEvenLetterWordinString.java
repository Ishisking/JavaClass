package LogicBuildingPractice;

public class PrintEvenLetterWordinString {

	public static void main(String[] args) {
		String input = "Sky is Blue and Bright in Morning";
		String dataArray[] = input.split(" ");
		System.out.println("Even Letter Words in the String :");
		for (String word : dataArray) {
			if (word.length() % 2 == 0) {
				System.out.print(word+"  ");
			}
		}
	}

}
