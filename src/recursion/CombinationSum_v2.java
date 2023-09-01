package recursion;

import java.util.ArrayList;

public class CombinationSum_v2 {
	
	static void getCombination(int index, int rem, ArrayList<Integer> input, ArrayList<Integer> list1, ArrayList<ArrayList<Integer>> list2) {
		if(rem == 0) {
			//System.out.println("in rem 0" +list1);
			//sSystem.out.println();
			list2.add(new ArrayList<>(list1));
			//System.out.println(list2);
			return;
		}
//		if(rem < input.get(index)) {
//			//System.out.println("in rem >" +list1);
//			System.out.println(index);
//			return;
//		}
		if(index >= input.size()) {
			//System.out.println("in index >" +list1);
			return;
		}
		if(rem >= input.get(index)) {
			list1.add(input.get(index));
			//System.out.println(list1);
			//sum += input.get(index);
			//rem -= input.get(index);
			getCombination(index, rem-input.get(index), input, list1, list2);
			list1.remove(list1.size()-1);
		}
		//list1.remove(list1.size()-1);
		//sum -= input.get(index);
		//rem -= input.get(index);
		getCombination(index+1, rem, input, list1, list2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(7);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		getCombination(0, 7, input, list1, list2);
		System.out.println(list2);
	}

}
