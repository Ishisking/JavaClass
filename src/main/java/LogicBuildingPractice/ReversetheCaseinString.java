package LogicBuildingPractice;

public class ReversetheCaseinString {

	public static void main(String[] args) {
		String input = "Hello World";
		StringBuilder sb = new StringBuilder();
		char[] inputArray = input.toCharArray();
		for (char c : inputArray) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}
		}
		System.out.println(input);
		System.out.println("String after Reversing the Case");
		System.out.println(sb);
	}

}
