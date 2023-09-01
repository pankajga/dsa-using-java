package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class N_Queen_Optimised {
	
	static void getCombination(int index, int input, String s, ArrayList<String> list1, ArrayList<ArrayList<String>> list2, ArrayList<Integer> ud,
			ArrayList<Integer> ld, ArrayList<Integer> left) {
		if(list1.size() == input) {
			list2.add(new ArrayList<>(list1));
			return;
		}
		for(int row=0; row<input; row++) {
			if((left.get(row) == 0) && (ld.get(row+index) == 0) && (ud.get((input-1)+(index-row)) == 0)) {
				StringBuffer sb = new StringBuffer(s);
				sb.setCharAt(row, 'Q');
				list1.add(sb.toString());
				left.set(row, 1);
				ld.set((row+index), 1);
				ud.set((input-1)+(index-row), 1);
				getCombination(index+1, input, s, list1, list2, ud, ld, left);
				//sb.setCharAt(row, '.');
				list1.remove(list1.size()-1);
				left.set(row, 0);
				ld.set((row+index), 0);
				ud.set((input-1)+(index-row), 0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "....";
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<ArrayList<String>> list2 = new ArrayList<>();
		ArrayList<Integer> ld = new ArrayList<Integer>(Collections.nCopies(7, 0));
		ArrayList<Integer> ud = new ArrayList<Integer>(Collections.nCopies(7, 0));
		ArrayList<Integer> left = new ArrayList<Integer>(Collections.nCopies(4, 0));
		getCombination(0, 4, s, list1, list2, ud, ld, left);
		System.out.println(list2);
	}

}
