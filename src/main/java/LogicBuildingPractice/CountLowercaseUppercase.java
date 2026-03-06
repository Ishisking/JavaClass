package LogicBuildingPractice;

public class CountLowercaseUppercase {

	public static void main(String[] args) {
		String input = "aAbBcCdD";
		char[] inputArray = input.toCharArray();
		int uppercasecount = 0, lowercasecount = 0;
		for (char temp : inputArray) {
			if (Character.isUpperCase(temp)) {
				uppercasecount++;
			} else {
				lowercasecount++;
			}
		}
		System.out.println("Total No. of UpperCase Characters in the String is :" + uppercasecount);
		System.out.println("Total No. of LowerCase Characters in the String is :" + lowercasecount);
	}

}
