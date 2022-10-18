package stack;

import java.util.Scanner;
import java.util.Stack;

public class NearestGreaterRight {
	
/*
 * i/p - 1,3,2,4
 * o/p - 3,4,4,-1
 */
	
	public static void nearestGreater(int[] input) {
		Stack<Integer> inpStack = new Stack<>();
		Stack<Integer> output = new Stack<>();
		for(int i=input.length-1; i>=0; i--) {
			if(inpStack.isEmpty()) {
				output.push(-1);
				inpStack.push(input[i]);
			}
			else {
				while(!inpStack.isEmpty()) {
					if(inpStack.peek() > input[i]) {
						output.push(inpStack.peek());
						inpStack.push(input[i]);
						break;
					}
					else {
						inpStack.pop();
					}
				}
				if(inpStack.isEmpty()) {
					output.push(-1);
					inpStack.push(input[i]);
				}
			}
		}
		while(!output.isEmpty()) {
			System.out.println(output.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,5,3,2,4};
		nearestGreater(input);
	}

}
