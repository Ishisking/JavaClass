package UdemyCodingRound2025;

public class CalculateSumofNumbersfromaString {

	public static void main(String[] args) {
		String input = "This is 1000 and it consists of 20 30 50 80 130";
	//	String input="This Number is 1000 and it is product of 2 5 4 25";
		String words[] = input.split(" ");
		int totalSum = 0;
		for (String word : words) {
			System.out.print(word + " ");
		}

		for (String numbers : words) {
			try {
				int number = Integer.parseInt(numbers);
				totalSum = totalSum + number;
			} catch (NumberFormatException e) {

			}
		}
		System.out.println();
		System.out.println("Total Sum of Numbers :: " + totalSum);
		String x = "1000";
		int no = Integer.parseInt(x);
		System.out.println(no + 14);
		System.out.println(x + 14);
//		int nu = Integer.parseInt("This");//NUMBER FORMAT EXCEPTION

	}

}
