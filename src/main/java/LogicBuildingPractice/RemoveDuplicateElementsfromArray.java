package LogicBuildingPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsfromArray {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 20, 20, 30, 30, 40, 50, 60, 60, 60, 60 };
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		for (int d : a) {
			dataSet.add(d);
		}
		//System.out.println(dataSet);
		// Streams
		int[] result = dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));
	}

}
