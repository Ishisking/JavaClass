package LogicBuildingPractice;

public class ChangingKeys {

	public static void main(String[] args) {
		String input = "abBcDe";
		int count = 0;
		char lastKey = input.toCharArray()[0];
		lastKey = Character.toLowerCase(lastKey);
		for (int i = 1; i < input.length(); i++) {
			char currentKey = input.toCharArray()[i];
			currentKey = Character.toLowerCase(currentKey);
			if (currentKey != lastKey) {
				count++;
			}
			lastKey = currentKey;

		}
		System.out.println("The Key Changes " + count + " times");
	}

}
