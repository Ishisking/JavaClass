package LogicBuildingPractice;

public class LengthofString {
public static void main(String[] args) {
		String input = "java";
		int size = input.length();
		System.out.println(size);
		if (size % 2 == 0) {
			System.out.println("This String has Even number of Letters");
		} else {
			System.out.println("This string has Odd Number of Letters ");
		}
	}

}
