package LogicBuildingPractice;

public class StringManipulation {

	public static void main(String[] args) {
		String input = "99956";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length() - 1; i++) {
			result.append(input.charAt(i));
			int currentNo = Character.getNumericValue(input.charAt(i));
			int nextNo = Character.getNumericValue(input.charAt(i + 1));
			if (currentNo % 2 != 0 && nextNo % 2 != 0 && currentNo == nextNo) {
				result.append("-");
			}
		}
		result.append(input.charAt(input.length() - 1));
		System.out.println(result);
	}

}
