package LogicBuildingPractice;

public class FindLengthofString {

	public static void main(String[] args) {
		String data = "Hello World";
		System.out.println(data.length());
		int count = 0;
		while (true) {
			try {
				data.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}
	}
}
