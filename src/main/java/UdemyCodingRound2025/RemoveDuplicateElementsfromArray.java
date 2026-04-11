package UdemyCodingRound2025;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsfromArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 10, 20, 40 };
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		Integer i = new Integer(20);
		int data2 = i.intValue();
		for (int data : a) {
			dataSet.add(data);
		}
		System.out.println(dataSet);
		// streams
		int result[] = dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));
	}

}
