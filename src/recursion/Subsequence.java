package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
	
	static void sub(int index, int n, ArrayList<Integer> output, ArrayList<Integer> input) {
		if(index == n) {
			output.stream().forEach(System.out::print);
			System.out.println();
			return;
		}
		output.add(input.get(index));
		sub(index+1, n, output, input);
		output.remove(input.get(index));
		sub(index+1, n, output, input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(3);
		input.add(1);
		input.add(2);
		ArrayList<Integer> output = new ArrayList<>();
		Subsequence.sub(0, 3, output, input);
	}
	
	static void arrayToArrayList() {
		// both are valid declarations
//		int intArray[]; 
//		or int[] intArray; 
//
//		byte byteArray[];
//		short shortsArray[];
//		boolean booleanArray[];
		
		// int[] intArray = new int[20]; 
//		In a situation where the size of the array and variables of the array are already known, array literals can be used. 
//
//		 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		 // Declaring array literal
		
		// ArrayList<int> arrlist = new ArrayList<>(Arrays.asList(array));    --- array to arraylist
		// int[] arr = new arr[arrlist.size()];
		// arrlist.toArray(arr)
		
//		int[] data = {1,2,3,4,5,6,7,8,9,10};
//
//		// To boxed array
//		Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
//		Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );
//
//		// To boxed list
//		List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
//		List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
		
		Integer[] arr1 = new Integer[] {3,1,2};
		ArrayList<Integer> al = (ArrayList<Integer>) (Arrays.asList(arr1));
		Integer[] arr = new Integer[al.size()];
		al.toArray(arr);
	}

}
