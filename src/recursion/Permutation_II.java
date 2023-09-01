package recursion;

import java.util.ArrayList;

public class Permutation_II {
	
	static void getPermutation(int index, ArrayList<Integer> input, ArrayList<ArrayList<Integer>> list2) {
		if(index == input.size()) {
			list2.add(new ArrayList<>(input));
			//return;
		}
		for(int i=index; i<input.size(); i++) {
			swap(input, index, i);
			getPermutation(index+1, input, list2);
			swap(input, index, i);
		}
	}
	
	static void swap(ArrayList<Integer> inp, int i, int j) {
		int temp = inp.get(i);
		inp.set(i, inp.get(j));
		inp.set(j, temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		//ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		//boolean[] flag = new boolean[4];
		getPermutation(0, input, list2);
		System.out.println(list2);
	}

}
