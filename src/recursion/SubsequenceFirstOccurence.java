package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceFirstOccurence {
	
	static boolean findSub(List<Integer> ip, List<Integer> op, int index, int len, int n, int sum) {
		if(index == len) {
			if(sum == n) {
				op.stream().forEach(System.out::print);
				return true;
			}
			else {
				return false;
			}
		}
		op.add(index);
		sum+=ip.get(index);
		if(findSub(ip, op, index+1, len, n, sum)) {
			return true;
		}
		op.remove(index);
		sum-=ip.get(index);
		if(findSub(ip, op, index+1, len, n, sum)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[] {1,2,1};
		List<Integer> l1 = Arrays.asList(arr);
		List<Integer> o1 = new ArrayList<Integer>();
		findSub(l1, o1, 0, 3, 2, 0);
	}

}
