package stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class StockSpan {
	
	/**
	 *  Stock Span
	 *  -   Afzal has been working with an organization called 'Money Traders' 
	 *      for the past few years. The organization is into the money trading 
	 *      business. His manager assigned him a task. For a given array/list 
	 *      of stock's prices for N days, find the stock's span for each day.
	 *  -   The span of the stock's price today is defined as the maximum number 
	 *      of consecutive days(starting from today and going backwards) for which 
	 *      the price of the stock was less than today's price.
	 *  -   For example, if the price of a stock over a period of 7 days are 
	 *      [100, 80, 60, 70, 60, 75, 85], then the stock spans will be 
	 *      [1, 1, 1, 2, 1, 4, 6].
	 * 
	 *  Input Format:
	 *      The first line of input contains an integer N, denoting the total number of days.
	 *      The second line of input contains the stock prices of each day. A single space 
	 *      will separate them.
	 *  Output Format:
	 *      The only line of output will print the span for each day's stock price. A 
	 *      single space will separate them.
	 * 
	 *  Constraints:
	 *      0 <= N <= 10^7
	 *      1 <= X <= 10^9
	 *      Where X denotes the stock's price for a day.
	 *  
	 *  Time Limit: 1 second
	 * 
	 *  Sample Input 1:
	 *      4
	 *      10 10 10 10
	 *  Sample Output 1:
	 *      1 1 1 1 
	 * 
	 *  Sample Input 2:
	 *      8
	 *      60 70 80 100 90 75 80 120
	 *  Sample Output 2:
	 *      1 2 3 4 1 1 2 8 
	 */
	
	public static void calculateStockSpan(int[] input) {
		Stack<Integer> stack = new Stack<>();
		int[] output = new int[input.length];
		for(int i=0; i<input.length; i++) {
			if(i==0) {
				output[i] = 1;
				stack.push(i);
			}
			else {
				while(!stack.isEmpty() && input[i]>input[stack.peek()]) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					output[i] = i;
					stack.push(i);
				}
				else {
					output[i] = i-stack.peek();
					stack.push(i);
				}
			}
		}
		Arrays.stream(output).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {100,80,60,70,60,75,85};
		calculateStockSpan(input);
	}

}
