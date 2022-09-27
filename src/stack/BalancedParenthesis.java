package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
	/**
	 *  Code : Balanced Parenthesis
	 *  -   For a given a string expression containing only round brackets or 
	 *      parentheses, check if they are balanced or not. Brackets are said 
	 *      to be balanced if the bracket which opens last, closes first.
	 *  -   You need to return a boolean value indicating whether the expression 
	 *      is balanced or not.
	 * 
	 *  Note:   The input expression will not contain spaces in between.
	 *      
	 *  Input Format:
	 *      The first and the only line of input contains a string expression without 
	 *      any spaces in between.
	 *  Output Format:
	 *      The only line of output prints 'true' or 'false'.
	 * 
	 * 
	 *  Constraints:    
	 *      1 <= N <= 10^7
	 *      Where N is the length of the expression.
	 *  
	 *  Time Limit: 1sec
	 *  
	 *  Sample Input 1 :
	 *      (()()())
	 *  Sample Output 1 :
	 *      true
	 * 
	 *  Sample Input 2 :
	 *      ()()(()
	 *  Sample Output 2 :
	 *      false
	 *  
	 *  Explanation to Sample Input 2:
	 *      The initial two pairs of brackets are balanced. But when you see, the opening 
	 *      bracket at the fourth index doesn't have its corresponding closing bracket 
	 *      which makes it imbalanced and in turn, making the whole expression imbalanced. 
	 *      Hence the output prints 'false'.
	 */
	
	public static Boolean checkBalance(String input) {
		String[] inpArr = input.split("");
		Stack<String> inpStack = new Stack<>();
		for(int i=0; i<inpArr.length; i++) {
			if(inpArr[i].equals("(")) {
				inpStack.push(inpArr[i]);
			}
			else {
				if(inpStack.isEmpty()) {
					return false;
				}
				inpStack.pop();
			}
		}
		return inpStack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.next();
		System.out.println("Finding balance for input: "+input);
		long startTime = System.currentTimeMillis();
		System.out.println(checkBalance(input));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}
