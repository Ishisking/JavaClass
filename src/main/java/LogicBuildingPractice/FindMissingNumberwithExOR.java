package LogicBuildingPractice;

public class FindMissingNumberwithExOR {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 4, 5, 6 };
		int missingnumber = 0;
		for (int c : numbers) {
			missingnumber = missingnumber ^ c;
		}
		for (int i = 0; i <= 6; i++) {
			missingnumber = missingnumber ^ i;
		}
		System.out.println(missingnumber);
	}

}
