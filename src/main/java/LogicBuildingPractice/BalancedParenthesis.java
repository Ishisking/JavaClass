package LogicBuildingPractice;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String input = "()";
		boolean result = checkparenthesis(input);
		System.out.println(result);
	}

	private static boolean checkparenthesis(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char current : inputArray) {
			if (current == '(') {
				stack.push('(');
			} else if (current == ')') {
				if (stack.isEmpty()) {
					return false; // Mismatch occurred No Opening Bracket Present
				} else {
					char topchar = stack.pop();
					if (topchar != '(') {
						return false;
					}
				}

			}
		}
		return stack.isEmpty();
	}

}
