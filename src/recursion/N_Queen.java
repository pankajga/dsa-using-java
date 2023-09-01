package recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queen {
	
//	static void getPositions(int index, ArrayList<Integer> input, ArrayList<Integer> list1, boolean[] flag, ArrayList<ArrayList<Integer>> list2) {
//		if(list1.size() == input.size()) {
//			for(int i=0; i<list1.size()-1; i++) {
//				if(list1.get(i) == list1.get(i+1) || (list1.get(i))+1 == list1.get(i+1) || (list1.get(i)) == (list1.get(i+1))-1
//						|| (list1.get(i))-1 == list1.get(i+1) || (list1.get(i)) == (list1.get(i+1))+1) {
//					return;
//				}
//			}
//			list2.add(new ArrayList<>(list1));
//			return;
//		}
//		for(int i=index; i<input.size(); i++) {
//			if(!flag[i]) {
//				list1.add(input.get(i));
//				flag[i] = true;
//				getPositions(index, input, list1, flag, list2);
//				list1.remove(list1.size()-1);
//				flag[i] = false;
//			}
//		}
//	}
	
	static void getPositions(int index, ArrayList<Integer> input, ArrayList<Integer> list1, boolean[] flag, ArrayList<ArrayList<Integer>> list2) {
		if(list1.size() == input.size()) {
			for(int i=0; i<list1.size()-1; i++) {
				if(list1.get(i) == list1.get(i+1) || (list1.get(i))+1 == list1.get(i+1) || (list1.get(i)) == (list1.get(i+1))-1
						|| (list1.get(i))-1 == list1.get(i+1) || (list1.get(i)) == (list1.get(i+1))+1) {
					return;
				}
			}
			list2.add(new ArrayList<>(list1));
			return;
		}
		for(int i=index; i<input.size(); i++) {
			if(!flag[i]) {
				list1.add(input.get(i));
				flag[i] = true;
				getPositions(index, input, list1, flag, list2);
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
		input.add(4);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		boolean[] flag = new boolean[4];
		getPositions(0, input,list1, flag, list2);
		System.out.println(list2);
		List<List<String>> result = new ArrayList<>();
		String resp = "";
		for(int i=0; i<4; i++) {
			resp+=".";
		}
        for(int i=0; i<list2.size(); i++) {
            List<String> ls = new ArrayList<>();
            String s = "";
            for(int j=0; j<4; j++) {
                int ind = list2.get(i).get(j);
                StringBuilder sb = new StringBuilder(resp);
                sb.setCharAt(ind-1, 'Q');
                //System.out.println(sb.toString());
                ls.add(sb.toString());
            }
            //ls.add(s);
            //System.out.println(ls);
            result.add(new ArrayList<>(ls));
        }
        System.out.println(result);
        //List<List<String>> result = new ArrayList<>();
        
	}

}
