package LogicBuildingPractice;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "bcad";

		if (s1.length() == s2.length()) {
			char[] s1array = s1.toCharArray();
			char[] s2array = s2.toCharArray();
			Arrays.sort(s1array);
			Arrays.sort(s2array);
			if (Arrays.equals(s1array, s2array)) {
				System.out.println("The Given String is Anagram");
			} else {
				System.out.println("The Given String is Not an Anagrams");
			}
		}
		else {
			System.out.println("The Given String is Not an Anagrams");
		}
	}

}
