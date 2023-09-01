package recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class CombinationSumII {
	
	static void getCombination(int index, ArrayList<Integer> input, int target, ArrayList<Integer> list1, HashSet<ArrayList<Integer>> list2) {
		if(index == input.size()) {
			//System.out.println(list1);
			if(target == 0) {
				list2.add(new ArrayList<>(list1));
			}
			return;
		}
		list1.add(input.get(index));
		getCombination(index+1, input, target-input.get(index), list1, list2);
		list1.remove(list1.size()-1);
		getCombination(index+1, input, target, list1, list2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(2);
		input.add(2);
		ArrayList<Integer> list1 = new ArrayList<>();
		HashSet<ArrayList<Integer>> list2 = new HashSet<>();
		getCombination(0, input, 4, list1, list2);
		System.out.println(list2);

	}

}
