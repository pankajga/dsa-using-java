package stack;

import java.util.Stack;

public class AddBottomStack {
	
	public static void addToBottom(int data, Stack<Integer> stack) {
		if(stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int top = stack.pop();
		addToBottom(data, stack);
		stack.push(top);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		addToBottom(4, stack);
		System.out.println(stack); // [4, 1, 2, 3]
		System.out.println(stack.peek()); // 3
	}

}
