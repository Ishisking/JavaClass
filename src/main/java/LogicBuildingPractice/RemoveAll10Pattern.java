package LogicBuildingPractice;

public class RemoveAll10Pattern {

	public static void main(String[] args) {
		String input = "10010101";
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if(c=='0'&&sb.charAt(sb.length()-1)=='1') {
				sb.deleteCharAt(sb.length()-1);
			}
		}

	}

}
