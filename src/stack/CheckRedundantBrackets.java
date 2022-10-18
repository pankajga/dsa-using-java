package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {
	
	/**
	 *  Check redundant brackets
	 *  -   For a given expression in the form of a string, find if there exist 
	 *      any redundant brackets or not. It is given that the expression contains 
	 *      only rounded brackets or parenthesis and the input expression will 
	 *      always be balanced.
	 *  -   A pair of the bracket is said to be redundant when a sub-expression is 
	 *      surrounded by unnecessary or needless brackets.
	 * 
	 *  Input Format :
	 *      The first and the only line of input contains a string expression, without 
	 *      any spaces in between.
	 *  Output Format :
	 *      The first and the only line of output will print either 'true' or 'false'
	 *      (without the quotes) denoting whether the input expression contains redundant 
	 *      brackets or not.
	 *  
	 *  Constraints:
	 *      0 <= N <= 10^6
	 *      Where N is the length of the expression.
	 *  
	 *  Time Limit: 1 second
	 *  
	 *  Sample Input 1:
	 *      a+(b)+c 
	 *  Sample Output 1:
	 *      true
	 *  Explanation:
	 *      The expression can be reduced to a+b+c. Hence, the brackets are redundant.
	 * 
	 *  Sample Input 2:
	 *      (a+b)
	 *  Sample Output 2:
	 *      false
	 */
	
	public static Boolean checkRedundant(String input) {
		String[] inpArr = input.split("");
		Stack<String> stack = new Stack<>();
		for(int i=0; i<inpArr.length; i++) {
			if(!inpArr[i].equals(")")) {
				stack.push(inpArr[i]);
			}
			else {
				int count = 0;
				while(!stack.peek().equals("(")) {
					stack.pop();
					count++;
				}
				if(count > 0) {
					stack.pop();
					if(count > 0) {
						if(stack.peek().equals("(") || count <= 1){
							return true;
					}
					
					}
				}
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String input = sc.next();
		System.out.println("Checkinng Redundancy for input: "+input);
		long startTime = System.currentTimeMillis();
		System.out.println(checkRedundant(input));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}
