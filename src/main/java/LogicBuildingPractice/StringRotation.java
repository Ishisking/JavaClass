package LogicBuildingPractice;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "INTERVIEW";
		String s2 = "VIEWINTER";
		if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
			System.out.println("s2 is Rotation of String s1");
		} else {
			System.out.println("Not a Rotated String");
		}
	}

}
