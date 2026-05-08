package LogicBuildingPractice;

public class StringManipulationPart2 {

	public static void main(String[] args) {
		String input = "Tomorrow";
		StringBuilder sb = new StringBuilder();
		int oCount = 0;
		for (char c : input.toCharArray()) {
			if (c == 'o' || c == 'O') {
				oCount++;
				sb.append(" @".repeat(oCount));
			} else {
				sb.append(" " + c);
			}
		}
		System.out.println("    "+input);
		System.out.println(sb);
	}

}
