package UdemyCodingRound2025;

public class CountCharactersofaStringwithoutWhiteSpaces {
//count the total number of characters that don't have white spaces before and after them
	public static void main(String[] args) {
		String input = " Hype ";
		char dataArray[] = input.toCharArray();
		int count=0;
		for (int index = 0; index < dataArray.length; index++) {
			if (dataArray[index] == ' ') {
				continue;
			}
boolean whiteSpacePresentAftertheCharacter = index < dataArray.length - 1 && dataArray[index + 1] == ' ';
boolean whiteSpacePresentBeforetheCharacter = index > 0 && dataArray[index - 1] == ' ';
			if (!whiteSpacePresentAftertheCharacter && !whiteSpacePresentBeforetheCharacter) {
				count++;
			}

		}
		System.out.println("Count is :"+count);
		
	}

}
