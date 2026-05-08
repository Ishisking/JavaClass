package UdemyCodingRound2025;

public class LengthofStringMethod2 {

	public static void main(String[] args) {
		String input = "hello";
		int count = 0;
		while (true) {
			try {
				input.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Lenght of String is :" + count);
				break; // ✅ break only when exception occurs
			}
		}
	}

}
