package LogicBuildingPractice;

public class StringManipulation_NAB {

	public static void main(String[] args) {
		double number = 123.4567;
		// Converting the Number to String
		String input = String.valueOf(number);
		System.out.println(input);
		int indexOfDecimal = input.indexOf(".");
		System.out.println("index Of Decimal :" + indexOfDecimal);
		System.out.print("Number of Digits after the decimal are :");
		System.out.print(input.length() - indexOfDecimal - 1);
	}

}
