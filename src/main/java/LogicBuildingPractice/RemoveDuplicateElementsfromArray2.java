package LogicBuildingPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsfromArray2 {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 20, 20, 30, 30, 40, 50, 60, 60, 60, 60 };
		System.out.println(Arrays.toString(a));
		// 10,20,30,40,50,60
		a = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(a));
	}

}
 