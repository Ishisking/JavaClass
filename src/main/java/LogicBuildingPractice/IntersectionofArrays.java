package LogicBuildingPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofArrays {

	public static void main(String[] args) {
		int num1[] = { 1, 2, 2, 1 };
		int num2[] = { 2, 2 };
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();

		for (int no : num1) {
			set1.add(no);
		}

		for (int no : num2) {
			if (set1.contains(no)) {
				resultSet.add(no);
			}
		}
		System.out.println(set1);
		System.out.println(resultSet);
		int result[] = new int[resultSet.size()];
		int index = 0;
		for (int val : resultSet) {
			result[index] = val;
			index++;
		}
		System.out.println(Arrays.toString(result));
	}

}
