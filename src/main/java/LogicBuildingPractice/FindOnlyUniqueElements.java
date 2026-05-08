package LogicBuildingPractice;

import java.util.HashSet;

public class FindOnlyUniqueElements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 1 };
		HashSet<Integer> seenSet = new HashSet<Integer>();
		HashSet<Integer> duplicateSet = new HashSet<Integer>();
		for (int no : a) {

			if (!seenSet.add(no)) {
				duplicateSet.add(no);
			}
		}
		System.out.println("seenSet :" + seenSet);
		System.out.println("duplicateSet :" + duplicateSet);
		seenSet.removeAll(duplicateSet);
		System.out.println("Unique Elements :" + seenSet);
	}

}
