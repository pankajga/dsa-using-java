package recursion;

import java.util.ArrayList;

public class N_Queen_Correct {
	
	static void getCombination(int index, int input, String s, ArrayList<String> list1, ArrayList<ArrayList<String>> list2) {
		if(list1.size() == input) {
			list2.add(new ArrayList<>(list1));
			return;
		}
		for(int row=0; row<input; row++) {
			if(canPut(row-1, index-1, list1, input)) {
				StringBuffer sb = new StringBuffer(s);
				sb.setCharAt(row, 'Q');
				list1.add(sb.toString());
				getCombination(index+1, input, s, list1, list2);
				//sb.setCharAt(row, '.');
				list1.remove(list1.size()-1);
			}
		}
	}
	
	static boolean canPut(int row, int column, ArrayList<String> list1, int input) {
		if(row < 0 && column < 0) {
			return true;
		}
		//row+=1;

		//if(row < 0) {
			//row+=1;
		//}
		int duprow = row;
		int dupcol = column;
		while(row>=0 && column>=0) {
			if(list1.get(column).charAt(row) == 'Q') {
				return false;
			}
			row--;
			column--;
		}
		row = duprow+1;
		column = dupcol;
		while(column>=0) {
			//System.out.println(row);
			if(list1.get(column).charAt(row) == 'Q') {
				return false;
			}
			column--;
		}
		row = duprow+2;
		column = dupcol;
		while(row<input && column>=0) {
			if(list1.get(column).charAt(row) == 'Q') {
				return false;
			}
			row++;
			column--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "....";
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<ArrayList<String>> list2 = new ArrayList<>();
		getCombination(0, 4, s, list1, list2);
		System.out.println(list2);
	}

}
