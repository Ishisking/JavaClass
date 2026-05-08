package LogicBuildingPractice;

public class EYStringManipulation2 {

	public static void main(String[] args) {
		String input = "r@56vi ku$%mar67";
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c) || c == ' ') {
				sb.append(c);
			} else if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}
		sb.append(" ");
		sb.append(sum);
		System.out.println(sb);
	}

}
