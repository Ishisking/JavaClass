package LogicBuildingPractice;

public class CheckStringisPangramorNot {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		input = input.toLowerCase();
		System.out.println(input);
		boolean result = checkpangram(input);
		if (result) {
			System.out.println("The String is a Pangram");
		} else {
			System.out.println("IT'S NOT A PANGRAM ");
		}
	}

	private static boolean checkpangram(String input) {
		if (input.length() < 26) {
			return false;
		}

		for (char i = 'a'; i <= 'z'; i++) {
			if (input.indexOf(i) == -1) {
				return false;
			}

		}

		return true;
	}

}
