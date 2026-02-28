package LogicBuildingPractice;

public class NameShortener {

	public static void main(String[] args) {
		String fullName = "Eshan Kumar Bhawesh Kumar Nashine";
		String nameParts[] = fullName.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < nameParts.length - 1; index++) {
			sb.append(nameParts[index].charAt(0));
			sb.append(".  ");
		}
		sb.append(nameParts[nameParts.length - 1]);
		System.out.println(sb);

	}

}
