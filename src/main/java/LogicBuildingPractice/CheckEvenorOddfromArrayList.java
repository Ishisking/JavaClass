package LogicBuildingPractice;

import java.util.ArrayList;

public class CheckEvenorOddfromArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add(13);
		a1.add(null);
		a1.add(24);
		a1.add(24.5);

		for (Object o : a1) {
			if (o instanceof Integer) {
if ((((Integer) o).intValue()) % 2 == 0) { //object 'o'-->Integer-->int (object to int conversion/typecasting)
					System.out.println("Even " + o);
				} else {
					System.out.println("Odd " + o);
				}
			}

		}

	}
}