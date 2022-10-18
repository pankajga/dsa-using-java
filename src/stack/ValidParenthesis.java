package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

/*
 * i/p 1 - ()[{}()]
 * i/p 2 - ](){}
 */
	
	public static Boolean checkValid(String input) {
		String[] inputArray = input.split("");
		Stack<String> stack = new Stack<>();
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i].equals("(") ||
				inputArray[i].equals("{") ||
				inputArray[i].equals("[")) {
					stack.push(inputArray[i]);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					if((stack.peek().equals("(") && inputArray[i].equals(")")) ||
						(stack.peek().equals("{") && inputArray[i].equals("}")) ||
						(stack.peek().equals("[") && inputArray[i].equals("]"))) {
						stack.pop();
					}
					else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.next();
		long startTime = System.currentTimeMillis();
		System.out.println(checkValid(input));
		long endTime = System.currentTimeMillis();
		long executionTime = endTime-startTime;
		System.out.println("Execution Time: "+executionTime);
	}

}
