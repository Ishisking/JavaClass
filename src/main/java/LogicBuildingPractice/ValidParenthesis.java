package LogicBuildingPractice;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String input = "[{()}]";
		System.out.println(validParenthesis(input));
	}
	private static boolean validParenthesis(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char current : inputArray) {
			if (current == '(' || current == '{' || current == '[') { // If opening brackets → push
				stack.push(current);
			} else if (current == ')' || current == '}' || current == ']') { // If closing brackets → check
				if (stack.isEmpty()) {
					return false; // No matching opening bracket
				}
				char topChar = stack.pop();
				// Check matching pair
				if ((current == ')' && topChar != '(') || (current == '}' && topChar != '{')
						|| (current == ']' && topChar != '[')) {
					return false;
				}
			}

		}
		return stack.isEmpty();// If stack is empty → balanced
	}

}
