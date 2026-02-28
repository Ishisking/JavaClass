package LogicBuildingPractice;

public class FrequencyofCharacterswithoutHashMap {

	public static void main(String[] args) {
		String input = "abccabca"; // a-3 b-1 c-2
		int frequency[] = new int[256]; //ASCII(0-256)
		char inputArray[] = input.toCharArray();
		for (char currentCharacter : inputArray) {
			frequency[currentCharacter]++;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + "  " + frequency[i]);
			}
		}
	}

}
