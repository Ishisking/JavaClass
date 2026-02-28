package LogicBuildingPractice;

public class IntegertoRoman {

	public static void main(String[] args) {
		int number = 23;
		String symbols[] = { "L", "X", "V", "I" };
		int values[] = { 50, 10, 5, 1 };
		StringBuilder sb = new StringBuilder(); // Result
		for (int i = 0; i < values.length; i++) {
			while (number >= values[i]) {
				number = number - values[i];
				sb.append(symbols[i]);
			}
		}
		System.out.println(sb.toString());
	}

}
