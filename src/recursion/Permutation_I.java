package recursion;

import java.util.ArrayList;

public class Permutation_I {
	
	static void getPermutation(int index, ArrayList<Integer> input, boolean[] flag, ArrayList<Integer> list1, ArrayList<ArrayList<Integer>> list2) {
		if(list1.size() == input.size()) {
			list2.add(new ArrayList<>(list1));
			return;
		}
		for(int i=index; i<input.size(); i++) {
			if(!flag[i]) {
				list1.add(input.get(i));
				flag[i] = true;
				getPermutation(index, input, flag, list1, list2);
				list1.remove(list1.size()-1);
				flag[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		boolean[] flag = new boolean[4];
		getPermutation(0, input, flag, list1, list2);
		System.out.println(list2);
	}

}
