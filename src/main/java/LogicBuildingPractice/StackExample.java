package LogicBuildingPractice;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Orange");
		stack.push("Mango");
		int position = stack.search("Mango"); // Top Element Position will be 1 the next Element Position will be 2 so
												// on and soforth.
		System.out.println(position);
		position = stack.search("Orange");
		System.out.println(position);
		position = stack.search("Banana");
		System.out.println(position);
		position = stack.search("Apple");
		System.out.println(position);
		stack.pop(); // Removes the Top Element from the Stack and return it back to you
		stack.peek(); // It doesnot remove the Top Element from the Stack but returns the value
		stack.isEmpty(); // True - If empty, else its gonna return false !
		System.out.println(stack);
		String topElement = stack.peek();
		System.out.println(topElement);
		String elementOutFromStack = stack.pop();
		System.out.println(elementOutFromStack);
		topElement = stack.peek();
		System.out.println(topElement);
		System.out.println(stack.isEmpty());
		String s = stack.pop();
		System.out.println(s);
		System.out.println(stack.isEmpty());
		System.out.println(stack);
	}

}
