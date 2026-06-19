package LogicBuildingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttingSolution {

	public static void main(String[] args) {
		int rods[] = { 1, 1, 3, 4 };
		Arrays.sort(rods);

		ArrayList<Integer> rodList = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int rod : rods) {
			rodList.add(rod);
		}
		System.out.println(rodList);
		while (!rodList.isEmpty()) {
			result.add(rodList.size());
			int shortest = rodList.get(0);
			ArrayList<Integer> rodCutting1 = new ArrayList<Integer>();
			for (int rod : rodList) {
				if (rod == shortest) {
					// Discard it

				} else {
					rodCutting1.add(rod - shortest);
				}
			}
			rodList = rodCutting1;
		}
		System.out.println(result);
	}

}
