package UdemyCodingRound2025;

public class LengthofString {

	public static void main(String[] args) {
		String s1 = " Pioneer";
		int count = 0;
		System.out.println(s1.length());
		char c[] = s1.toCharArray();
		for (char x : c) {
			count++;
		}
		System.out.println("Length of String " + s1 + " is : " + count);

	}

}
