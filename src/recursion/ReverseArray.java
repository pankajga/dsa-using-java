package recursion;

import java.util.Arrays;

public class ReverseArray {
	
	static int[] reverse(int[] input, int index, int[] output) {
		 if(index == input.length-1) {
			 output[0] = input[index];
			 return output;
		 }
		 reverse(input, index+1, output);
		 output[(input.length-1)-index] = input[index];
		 return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4};
		int[] output = new int[4];
		//int[] result = reverse(input, 0, output);
		swapReverse(input, 0, input.length-1);
		Arrays.stream(input).forEach(System.out::print);
	}
	
	// approach 2 -> swap logic
	
	static void swapReverse(int[] input, int l, int r) {
		if(l >= r) {
			return;
		}
		int temp = input[l];
		input[l] = input[r];
		input[r] = temp;
		swapReverse(input, l+1, r-1);
	}

}
