package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *  Minimum bracket Reversal
 *  -   For a given expression in the form of a string, find the minimum 
 *      number of brackets that can be reversed in order to make the expression 
 *      balanced. The expression will only contain curly brackets.
 *  -   If the expression can't be balanced, return -1.
 * 
 *  Example:
 *      Expression: {{{{
 *      If we reverse the second and the fourth opening brackets, the whole 
 *      expression will get balanced. Since we have to reverse two brackets 
 *      to make the expression balanced, the expected output will be 2.
 *      Expression: {{{
 *      In this example, even if we reverse the last opening bracket, we would 
 *      be left with the first opening bracket and hence will not be able to make 
 *      the expression balanced and the output will be -1.
 * 
 *  Input Format :
 *      The first and the only line of input contains a string expression, without 
 *      any spaces in between.
 *  Output Format :
 *      The only line of output will print the number of reversals required to 
 *      balance the whole expression. Prints -1, otherwise.
 *  
 *  Constraints:    
 *      0 <= N <= 10^6
 *      Where N is the length of the expression.
 *  
 *  Time Limit: 1sec
 *    
 *  Sample Input 1:
 *      {{{
 *  Sample Output 1:
 *      -1
 * 
 *  Sample Input 2:
 *      {{{{}}
 *  Sample Output 2:
 *      1
 */

public class MinimumBracketsReversal {
	
	public static int minBrackets(String input) {
		Stack<String> stackIn = new Stack<>();
		String[] strArr = input.split("");
		if(strArr.length % 2 != 0) {
			return -1;
		}
		for(String str : strArr) {
			if(str.equals("{")) {
				stackIn.push(str);
			}
			else {
				if(!stackIn.isEmpty()) {
					stackIn.pop();
				}
			}
		}
		if(stackIn.size() == 0) {
			return 0;
		}
		else {
			return stackIn.size()/2;
//			if(stackIn.size()%2 == 0) {
//				return stackIn.size()/2;
//			}
//			else {
//				return -1;
//			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.next();
		System.out.println(minBrackets(input));
	}

}
