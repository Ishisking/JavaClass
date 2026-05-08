package LogicBuildingPractice;

public class NameGenerator {
	// Column by column Reading
	public static void main(String[] args) {
		String names[] = { "Raj", "Rahul" };
		StringBuilder sb = new StringBuilder();
		int maxLength = 0;
		for (String name : names) {
			maxLength = Math.max(maxLength, name.length());
		}
		System.out.println(maxLength);
		for (int i = 0; i < maxLength; i++) {
			for (String name : names) {
				if (i < name.length()) {
					sb.append(name.charAt(i));
				}
			}
		}
		System.out.println(sb);
	}

}
