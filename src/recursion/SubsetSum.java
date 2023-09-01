package recursion;

import java.util.ArrayList;

//no duplicate subset
public class SubsetSum {
	
	static void getSubset(ArrayList<Integer> input, int index, ArrayList<Integer> list1, ArrayList<ArrayList<Integer>> list2) {
		list2.add(new ArrayList<>(list1));
		for(int i=index; i<input.size(); i++) {
			if(i != index && input.get(i) == input.get(i-1)) {
				continue;
			}
			list1.add(input.get(i));
			getSubset(input, index+1, list1, list2);
			list1.remove(list1.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(2);
		input.add(2);
		input.add(3);
		input.add(3);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		getSubset(input, 0, list1, list2);
		System.out.println(list2.size());
		System.out.println(list2);
	}

}
