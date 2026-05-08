package LogicBuildingPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromtheList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		list2.add("One");
		// Method 1
//		list1.retainAll(list2);
//		System.out.println("Common Elements of list1 & list2 are :" + list1);
		// Method 2 using lambda expression
//		Set<String> result = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toSet());
//		System.out.println(result);
		// Method 3 using Method Referencing
		Set<String> result = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(result);
	}

}
