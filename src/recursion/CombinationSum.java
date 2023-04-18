package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	
	static void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if(ind == arr.length) {
			if(target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[ind] <= target) {
			ds.add(arr[ind]);
			findCombination(ind, arr, target-arr[ind], ans, ds);
			ds.remove(ds.size()-1);
		}
		findCombination(ind+1, arr, target, ans, ds);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{2,3,6,7}));
		int[] arr = new int[]{2,3,6,7};
		List<List<Integer>> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		//list2.add(new ArrayList<>(list1));
		findCombination(0, arr, 7, list2, list3);
		System.out.println(list2);
	}

}
